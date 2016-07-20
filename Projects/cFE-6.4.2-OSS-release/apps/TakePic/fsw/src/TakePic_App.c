/////////////////////////////////////////////////////////////////////////
//
//  README
//
//  Name: TakePic_App.c
//  By: Alec Forsman - Red Canyon Software
//  Created: 5/12/16
//  Updated: 5/12/16
//
//  Description:
//		This is a Core Flight Application intended to model the TakePic commands in the PLEXIL
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


#include "TakePic_App.h"
#include "TakePic_Events.h"
#include "TakePic_Msgids.h"

TakePic_AppData_t	TakePic_AppData;

static CFE_EVS_BinFilter_t TakePic_EventFilters[] = 
	{
		{DEBUG,										0x0000},
	};		
		

// Main Function
void TakePic_AppMain(void)
{
	uint32 Status;

	CFE_ES_RegisterApp(); // Register app w/ CFE
	TakePic_init(); // initialize the app. Sets up needed params (Success returns CFE_SUCCESS)
	
	// TakePic Run Loop
	while(CFE_ES_RunLoop(&TakePic_AppData.RunStatus) == TRUE)
	{
		
		Status = CFE_SB_RcvMsg(&TakePic_AppData.MsgPtr, TakePic_AppData.TakePicPipe, CFE_SB_PEND_FOREVER);
		CFE_EVS_SendEvent(DEBUG,CFE_EVS_INFORMATION,"TAKEPIC MESSAGE RECEIVED!!!"); //debug

		if (Status == CFE_SUCCESS);
		{
			
			if(CFE_SB_GetMsgId(TakePic_AppData.MsgPtr) == TAKEPIC_MID)
			{
				
				CFE_EVS_SendEvent(DEBUG,CFE_EVS_INFORMATION,"Message ID matches."); //debug
				TakePic_DataPacket_t *DataPacket_temp = (TakePic_DataPacket_t *)TakePic_AppData.MsgPtr;
				TakePic_AppData.DataPacket = *DataPacket_temp;
				
				CFE_SB_InitMsg(&TakePic_AppData.DataPacket, TAKEPIC_RETURN_MID, sizeof(TakePic_DataPacket_t), FALSE);
				
				//CFE_ES_ExitApp(UpdFlight_AppData.RunStatus);
				CFE_SB_SendMsg((CFE_SB_Msg_t *) &TakePic_AppData.DataPacket);
			}
		}
		
	} // End while
	
} // End TakePic_AppMain


//////////////////////////////////////////////////////////////////////////////////////////////////////

void TakePic_init(void)
{
	int status;
	
	CFE_EVS_Register(TakePic_EventFilters, sizeof(TakePic_EventFilters)/sizeof(CFE_EVS_BinFilter_t), CFE_EVS_BINARY_FILTER); // Register Event filter table so events can be output
	
	TakePic_AppData.RunStatus = CFE_ES_APP_RUN;
	
	TakePic_AppData.PipeDepth = TAKEPIC_PIPE_DEPTH;
	strcpy(TakePic_AppData.PipeName, "TAKEPIC_PIPE");	
	
	// Create Receive (command) pipe
	status = CFE_SB_CreatePipe(&TakePic_AppData.TakePicPipe, TakePic_AppData.PipeDepth, TakePic_AppData.PipeName);
	if(status != CFE_SUCCESS)
	{
		CFE_EVS_SendEvent(DEBUG,CFE_EVS_ERROR,"Failed to create TakePic pipe");
	}
	
	// Subscribe
	status = CFE_SB_Subscribe(TAKEPIC_MID, TakePic_AppData.TakePicPipe);
	if(status != CFE_SUCCESS)
	{
		CFE_EVS_SendEvent(DEBUG,CFE_EVS_ERROR,"Failed to subscribe to TAKEPIC pipe");
	}
	
	CFE_SB_InitMsg(&TakePic_AppData.DataPacket, TAKEPIC_RETURN_MID, sizeof(TakePic_DataPacket_t), TRUE);
	
	
	CFE_EVS_SendEvent(DEBUG, CFE_EVS_INFORMATION,"TakePic App Initialized");
	
	
} // End TakePic_init




