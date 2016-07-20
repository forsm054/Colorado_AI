/////////////////////////////////////////////////////////////////////////
//
//  README
//
//  Name: Waypoint_App.c
//  By: Alec Forsman - Red Canyon Software
//  Created: 3/7/16
//  Updated: 5/12/16
//
//  Description:
//		This is a Core Flight Application intended to help get familiar with
//		the syntax. The apply receives a UDP packet(command), and depending on the command, the
//		The command handler sends a SB message so the corresponding app can perform the command.
//	  This can be used in the future as the layout for communication between PLEXIL and CFE.
//
//	Updates:
//		3/7/16
//			- Created main function and header file
//		3/11/16
//			- Added Send Telemetry function
//		3/12/16
//			- Implemented the basic syntax, mainly the init app section, by following
//				example in Developers Guide
//			- Got to successfully compile and send a UDP packet to a socket
//			- Started implementing receive pipe
//		3/14/16
//			- Implemented command pipe
//			- Implemented logic to set up a response when command received
//		3/15/16
//			- Created Event Service table and registered it. (This got the app to work!)
//		5/12/16
//			- Successfully got app to receive UDP packets
//			- Setup Command_Handler to handle GetParams command from PLEXIL
//			- Successfully passed commands to SB bus and got it to receive in another app
//			- Removed Telemetery function. Not needed.
//		5/13/16
//			- Improved naming conventions
//			- Got all apps to be able to receive a SB message.
//			- Got interface to PLEXIL working
//		5/18/16
//			- Created function to get initial conditions. Reading these from .txt caused app to crash. Going to try a Table.
//			- created InitTable, which has the initial A/C state and waypoint locations.
//		5/26/16
//			- Able to get data throught SB msg but when extracting, the buffer is offset for some reason.
//		5/30/16
//			- fixed offset issue. Sender has data header in struct, but receiver shouldn't.
//		6/26/16
//			- Added plot logic
//
//	Issues/ToDo:
//		- Setup Command_handler for other commands
//		- Plot data for viualization
//		- Housekeeping data?
//		- Write function descriptions
//		- clean up
//		- Return handler should be separate app
//		- Implement error checks
//		- NOTE: If app doesn't run, 90% of the time its an issue with the code(will still happen if it compiles)
//
/////////////////////////////////////////////////////////////////////////

#include "CmdHandler_App.h"
#include "CmdHandler_Msg.h"
#include "CmdHandler_Perfids.h"
#include "CmdHandler_Events.h"
#include "CmdHandler_Msgids.h"

// Global
CmdHandler_AppData_t	CmdHandler_AppData; // App data structure
//CFE_TBL_Handle_t InitTable_Handle; // Does this need to be Global?
int Cmd_SocketID;
bool SocketConnected = false;

static CFE_EVS_BinFilter_t CmdHandler_EventFilters[] = 
	{
		{DEBUG,												0x0000},
	};		
		

// Main Function
void CmdHandler_AppMain(void)
{
	//int Status;

	CFE_ES_RegisterApp(); // Register app w/ CFE
	CmdHandler_init(); // initialize the app. Sets up needed params (Success returns CFE_SUCCESS)
	
	CFE_ES_PerfLogEntry(CMDHANDLER_MAIN_TASK_PERF_ID);
	
	// Waypoint Run Loop
	while(CFE_ES_RunLoop(&CmdHandler_AppData.RunStatus) == TRUE)
	{
		sleep(1);
		
		/*
		Status = CFE_SB_RcvMsg(&CmdHandler_AppData.MsgPtr, CmdHandler_AppData.ReturnPipe, CFE_SB_POLL);
		if(Status == CFE_SUCCESS)
		{
			CFE_EVS_SendEvent(DEBUG,CFE_EVS_INFORMATION,"Return Command Received");
			Return_Handler(CmdHandler_AppData.MsgPtr);
		}
		*/
		
		if(SocketConnected)
		{
			CFE_EVS_SendEvent(DEBUG, CFE_EVS_INFORMATION, "ProcessUDP");
			ProcessUDP();
			CFE_EVS_SendEvent(DEBUG,CFE_EVS_INFORMATION,"End ProcessUDP, Run Status: %d", &CmdHandler_AppData.RunStatus);	
		}
		
	} // End while
	
} // End Waypoint_AppMain

//////////////////////////////////////////////////////////////////////////////////////////////////////

void CmdHandler_init(void)
{
	int status;
	//CmdHandler_DataPacket_t *TblPtr;
	
	status = CFE_EVS_Register(CmdHandler_EventFilters, sizeof(CmdHandler_EventFilters)/sizeof(CFE_EVS_BinFilter_t), CFE_EVS_BINARY_FILTER); // Register Event filter table so events can be output
	if(status == !CFE_SUCCESS)
	{
		CFE_EVS_SendEvent(DEBUG, CFE_EVS_INFORMATION,"Failed to register event filter"); //debug
	}
	
	CmdHandler_AppData.RunStatus = CFE_ES_APP_RUN;
	
	// Register Table
	status = CFE_TBL_Register(&CmdHandler_AppData.TblHandle, "InitTable", sizeof(CmdHandler_DataPacket_t), CFE_TBL_OPT_DEFAULT, NULL);
	if(status == CFE_SUCCESS)
	{
		status = CFE_TBL_Load(CmdHandler_AppData.TblHandle, CFE_TBL_SRC_FILE, "/cf/apps/TestTbl.tbl");
		CFE_EVS_SendEvent(DEBUG, CFE_EVS_INFORMATION,"Table Initialized"); //debug
	}
	else
	{
		CFE_EVS_SendEvent(DEBUG, CFE_EVS_INFORMATION,"Error initializing table"); // debug
	}
	
	// Fly2A Message
	CFE_SB_InitMsg(&CmdHandler_AppData.BusPacket_A, FLY2A_MID, sizeof(CmdHandler_BusPacket_t), TRUE);
	
	// Fly2B Message
	CFE_SB_InitMsg(&CmdHandler_AppData.BusPacket_B, FLY2B_MID, sizeof(CmdHandler_BusPacket_t), TRUE);
	
	Create_Cmd_Socket();
	
	CFE_EVS_SendEvent(DEBUG, CFE_EVS_INFORMATION,"CmdHandler App Initialized");
	
} // End CmdHandler_init

//////////////////////////////////////////////////////////////////////////////////////////////////////

void Create_Cmd_Socket(void)
{
	struct sockaddr_in sin_me;
	
	CFE_EVS_SendEvent(DEBUG, CFE_EVS_INFORMATION,"Create_Cmd_Socket");
	
	if((Cmd_SocketID = socket(AF_INET, SOCK_DGRAM, IPPROTO_UDP)) < 0)
	{
		CFE_EVS_SendEvent(DEBUG,CFE_EVS_ERROR,"Failed to create receive socket");
		CFE_EVS_SendEvent(DEBUG,CFE_EVS_INFORMATION,"Failed to create receive socket");
	}
	else
	{
		bzero((char *) &sin_me, sizeof(sin_me));
		sin_me.sin_family = AF_INET;
		sin_me.sin_port = htons(CMD_PORT);
		sin_me.sin_addr.s_addr = htonl(INADDR_ANY);
		
		if(bind(Cmd_SocketID, (struct sockaddr*)&sin_me, sizeof(sin_me)) < 0)
		{
			CFE_EVS_SendEvent(DEBUG,CFE_EVS_INFORMATION,"Failed to bind to port %d", CMD_PORT);
		}
		else
		{
			SocketConnected = true;
		}
	}
	
}

//////////////////////////////////////////////////////////////////////////////////////////////////////


void ProcessUDP(void)
{
	CFE_EVS_SendEvent(DEBUG, CFE_EVS_INFORMATION,"Processing UDP Command");

	struct sockaddr_in sin_other;
	socklen_t slen = sizeof(sin_other);
	char input_buf[ARRAY_SIZE];
	
	bzero((char *) &sin_other, sizeof(sin_other));
	
	if(recvfrom(Cmd_SocketID, input_buf, sizeof(input_buf), 0, (struct sockaddr *) &sin_other, &slen) < 0)
	{
		CFE_EVS_SendEvent(DEBUG,CFE_EVS_INFORMATION,"Couldn't receive packet/No packet to receive"); //should be error
	}
	else
	{		
		Command_Handler(input_buf);
	}
	
}

//////////////////////////////////////////////////////////////////////////////////////////////////////

void Command_Handler(char *command_name)
{
	
	if(strcmp(command_name,"Fly2A") == 0)
	{
		CFE_EVS_SendEvent(DEBUG, CFE_EVS_INFORMATION,"Fly2A command");
		CFE_SB_SendMsg((CFE_SB_Msg_t *) &CmdHandler_AppData.BusPacket_A);
	}
	else if(strcmp(command_name,"Fly2B") == 0)
	{
		CFE_EVS_SendEvent(DEBUG, CFE_EVS_INFORMATION,"Fly2B command");
		CFE_SB_SendMsg((CFE_SB_Msg_t *) &CmdHandler_AppData.BusPacket_B);
	}
	else
	{
		CFE_EVS_SendEvent(DEBUG, CFE_EVS_INFORMATION,"Invalid Message");
	}
	
}

//////////////////////////////////////////////////////////////////////////////////////////////////////

// FIXME: Can use this now
int InitTableValidation(void *TblData)
{
//	int Status = 0;
	
	//CmdHandler_InitTable_t *InitTablePtr = (CmdHandler_InitTable_t *)TblData;
	
	/*
	// Dummy Checks
	// 1.) Check to make sure A/C starts at origin 
	if(InitTablePtr->xLoc != 0)
	{
		Status = -1; 
	}
	else if(InitTablePtr->yLoc != 0)
	{
		Status = -1; 
	}
	else if(InitTablePtr->zLoc != 0)
	{
		Status = -1; 
	}
	else
	{
		// Do Nothing
	}
	*/
	
	return CFE_SUCCESS;
}











