/////////////////////////////////////////////////////////////////////////
//
//  README
//
//  Name: MonitorHeading_App.c
//  By: Alec Forsman - Red Canyon Software
//  Created: 5/12/16
//  Updated: 5/12/16
//
//  Description:
//		This is a Core Flight Application intended to model the MonitorHeading commands in the PLEXIL
//	  Waypoint plan. The app simply creates a pipe to receive messages, and when
//		a message is received it will perform the corresponding neccessary functions and send data
//		back so PLEXIL can continue to update the flight. This can be used in the future as the
//		layout for communication between PLEXIL and CFE.
//
//	Updates:
//		5/12/16
//			- Created
//			- Created SB pipe to receive commands from TestUdp_app.c
//		5/13/16
//			- Improved naming conventions
//
//	Issues/ToDo:
//		- Interface with PLEXIL
//		- Setup to perform neccessary calculations
//		- Send data back to TestUdp_app.c
//		- Get app to receive real data
//		- Combine Command Pack structure and Command structure. Shouldn't need both
//		- clean up
//		- Implement error checks
//		- NOTE: If app doesn't run, 90% of the time its an issue with the code(will still happen if it compiles)
//
/////////////////////////////////////////////////////////////////////////


#include "MonitorHeading_App.h"
#include "MonitorHeading_Events.h"
#include "MonitorHeading_Msgids.h"

MonitorHeading_AppData_t	MonitorHeading_AppData;

static CFE_EVS_BinFilter_t MonitorHeading_EventFilters[] = 
	{
		{DEBUG,										0x0000},
	};		
		

// Main Function
void MntrHding_AppMain(void)
{
	uint32 Status;

	CFE_ES_RegisterApp(); // Register app w/ CFE
	MonitorHeading_init(); // initialize the app. Sets up needed params (Success returns CFE_SUCCESS)
	
	// MonitorHeading Run Loop
	while(CFE_ES_RunLoop(&MonitorHeading_AppData.RunStatus) == TRUE)
	{
		
		Status = CFE_SB_RcvMsg(&MonitorHeading_AppData.MsgPtr, MonitorHeading_AppData.MonitorHeadingPipe, CFE_SB_PEND_FOREVER);
		CFE_EVS_SendEvent(DEBUG,CFE_EVS_INFORMATION,"MONITORHEADING MESSAGE RECEIVED!!!"); //debug

		if (Status == CFE_SUCCESS);
		{
			
			if(CFE_SB_GetMsgId(MonitorHeading_AppData.MsgPtr) == MONITORHEADING_MID)
			{
				
				CFE_EVS_SendEvent(DEBUG,CFE_EVS_INFORMATION,"Message ID matches."); //debug
				
				AdjustHeading();
				CFE_SB_InitMsg(&MonitorHeading_AppData.DataPacket, MONITORHEADING_RETURN_MID, sizeof(MonitorHeading_State_t), FALSE);
				
				//CFE_ES_ExitApp(UpdFlight_AppData.RunStatus);
				//CFE_SB_SendMsg((CFE_SB_Msg_t *) &MonitorHeading_AppData.DataPacket);
			}
		}
		
	} // End while
	
} // End MonitorHeading_AppMain


//////////////////////////////////////////////////////////////////////////////////////////////////////

void MonitorHeading_init(void)
{
	int status;
	
	CFE_EVS_Register(MonitorHeading_EventFilters, sizeof(MonitorHeading_EventFilters)/sizeof(CFE_EVS_BinFilter_t), CFE_EVS_BINARY_FILTER); // Register Event filter table so events can be output
	
	MonitorHeading_AppData.RunStatus = CFE_ES_APP_RUN;
	
	MonitorHeading_AppData.PipeDepth = MONITORHEADING_PIPE_DEPTH;
	strcpy(MonitorHeading_AppData.PipeName, "MONITORHEADING_PIPE");	
	
	// Create Receive (command) pipe
	status = CFE_SB_CreatePipe(&MonitorHeading_AppData.MonitorHeadingPipe, MonitorHeading_AppData.PipeDepth, MonitorHeading_AppData.PipeName);
	if(status != CFE_SUCCESS)
	{
		CFE_EVS_SendEvent(DEBUG,CFE_EVS_ERROR,"Failed to create MonitorHeading pipe");
	}
	
	// Subscribe
	status = CFE_SB_Subscribe(MONITORHEADING_MID, MonitorHeading_AppData.MonitorHeadingPipe);
	if(status != CFE_SUCCESS)
	{
		CFE_EVS_SendEvent(DEBUG,CFE_EVS_ERROR,"Failed to subscribe to MONITORHEADING pipe");
	}
	
	CFE_SB_InitMsg(&MonitorHeading_AppData.DataPacket, MONITORHEADING_RETURN_MID, sizeof(MonitorHeading_State_t), TRUE);
	
	
	CFE_EVS_SendEvent(DEBUG, CFE_EVS_INFORMATION,"MonitorHeading App Initialized");
	
	
} // End MonitorHeading_init


//////////////////////////////////////////////////////////////////////////////////////////////////////


void AdjustHeading(void)
{



}

