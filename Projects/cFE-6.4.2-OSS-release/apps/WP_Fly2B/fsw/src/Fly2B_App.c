/////////////////////////////////////////////////////////////////////////
//
//  README
//
//  Name: Fly2B_App.c
//  By: Alec Forsman - Red Canyon Software
//  Created: 5/12/16
//  Updated: 5/12/16
//
//  Description:
//		This is a Core Flight Application intended to model the UpdateFlight commands in the PLEXIL
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


#include "Fly2B_App.h"
#include "Fly2B_Events.h"
#include "Fly2B_Msgids.h"

Fly2B_AppData_t	Fly2B_AppData;

static CFE_EVS_BinFilter_t Fly2B_EventFilters[] = 
	{
		{DEBUG,										0x0000},
	};		
		

// Main Function
void Fly2B_AppMain(void)
{
	uint32 Status;

	CFE_ES_RegisterApp(); // Register app w/ CFE
	Fly2B_init(); // initialize the app. Sets up needed params (Success returns CFE_SUCCESS)

	// Fly2B Run Loop
	while(CFE_ES_RunLoop(&Fly2B_AppData.RunStatus) == TRUE)
	{
	
		Status = CFE_SB_RcvMsg(&Fly2B_AppData.MsgPtr, Fly2B_AppData.Fly2BPipe, CFE_SB_PEND_FOREVER);
		CFE_EVS_SendEvent(DEBUG,CFE_EVS_INFORMATION,"Fly2B MESSAGE RECEIVED!!!"); //debug

		if (Status == CFE_SUCCESS);
		{
			
			if(CFE_SB_GetMsgId(Fly2B_AppData.MsgPtr) == FLY2B_MID)
			{
				
				CFE_EVS_SendEvent(DEBUG,CFE_EVS_INFORMATION,"Message ID matches."); //debug
				
				//CFE_SB_InitMsg(&Fly2B_AppData.DataPacket, FLY2B_RETURN_MID, sizeof(Fly2B_DataPacket_t), FALSE);
				
				//CFE_ES_ExitApp(Fly2B_AppData.RunStatus);
				CFE_SB_SendMsg((CFE_SB_Msg_t *) &Fly2B_AppData.BusPacket);
			}
			else if(CFE_SB_GetMsgId(Fly2B_AppData.MsgPtr) == MONITORSTATE_RETURN2B_MID)
			{
				// FIXME: Make it so Fly2A and Fly2B don't execute at the same time
				Fly2B_AppData.DataPacket = UpdateBusPacket_B(Fly2B_AppData.DataPacket);
				printf("%s \n", Fly2B_AppData.DataPacket.cmd);
				CFE_SB_SendMsg((CFE_SB_Msg_t *) &Fly2B_AppData.DataPacket);			
			}
		}
		
	} // End while

} // End Fly2B_AppMain


//////////////////////////////////////////////////////////////////////////////////////////////////////

void Fly2B_init(void)
{
	int status;
	
	CFE_EVS_Register(Fly2B_EventFilters, sizeof(Fly2B_EventFilters)/sizeof(CFE_EVS_BinFilter_t), CFE_EVS_BINARY_FILTER); // Register Event filter table so events can be output
	
	Fly2B_AppData.RunStatus = CFE_ES_APP_RUN;
	
	Fly2B_AppData.PipeDepth = FLY2B_PIPE_DEPTH;
	strcpy(Fly2B_AppData.PipeName, "Fly2B_PIPE");	
	
	// Create Receive (command) pipe
	status = CFE_SB_CreatePipe(&Fly2B_AppData.Fly2BPipe, Fly2B_AppData.PipeDepth, Fly2B_AppData.PipeName);
	if(status != CFE_SUCCESS)
	{
		CFE_EVS_SendEvent(DEBUG,CFE_EVS_ERROR,"Failed to create Fly2B pipe");
	}
	
	// Subscribe //FIXME: Edit status variables
	status = CFE_SB_Subscribe(FLY2B_MID, Fly2B_AppData.Fly2BPipe);
	status = CFE_SB_Subscribe(MONITORSTATE_RETURN2B_MID, Fly2B_AppData.Fly2BPipe);
	if(status != CFE_SUCCESS)
	{
		CFE_EVS_SendEvent(DEBUG,CFE_EVS_ERROR,"Failed to subscribe to Fly2B pipe");
	}
	
	CFE_SB_InitMsg(&Fly2B_AppData.BusPacket, MONITORSTATE_MID, sizeof(Fly2B_BusPacket_t), TRUE);
	CFE_SB_InitMsg(&Fly2B_AppData.DataPacket, FLY2B_RETURN_MID, sizeof(Fly2B_BusPacket_t), TRUE);
	
	
	CFE_EVS_SendEvent(DEBUG, CFE_EVS_INFORMATION,"Fly2B App Initialized");
	

} // End Fly2B_init


//////////////////////////////////////////////////////////////////////////////////////////////////////

//FIXME: fcn not applicable anymore
Fly2B_BusPacket_t UpdateBusPacket_B(Fly2B_BusPacket_t Data)
{
	
	CFE_EVS_SendEvent(DEBUG, CFE_EVS_INFORMATION,"Updating Bus Packet");
	strcpy(Data.cmd,"Fly2B");
	Data.Success = true;
	
	return Data;
}





