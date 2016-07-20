/////////////////////////////////////////////////////////////////////////
//
//  README
//
//  Name: MonitorState_App.c
//  By: Alec Forsman - Red Canyon Software
//  Created: 5/12/16
//  Updated: 5/12/16
//
//  Description:
//		This is a Core Flight Application intended to model the MonitorState commands in the PLEXIL
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


#include "MonitorState_App.h"
#include "MonitorState_Events.h"
#include "MonitorState_Msgids.h"

MonitorState_AppData_t	MonitorState_AppData;
char pathFile[100];
char * directory = "/home/al/Desktop";
char * LogStateFile = "WP_State.txt";

static CFE_EVS_BinFilter_t MonitorState_EventFilters[] = 
	{
		{DEBUG,										0x0000},
	};		
		

// Main Function
void MntrState_AppMain(void)
{
	uint32 Status;
	bool At_WP;
	MonitorState_State_t *TblPtr;

	CFE_ES_RegisterApp(); // Register app w/ CFE
	MonitorState_init(); // initialize the app. Sets up needed params (Success returns CFE_SUCCESS)
	
	CFE_TBL_Share(&MonitorState_AppData.TblHandle,"CMDHANDLER_APP.InitTable");
	CFE_TBL_GetAddress((void *)&TblPtr, MonitorState_AppData.TblHandle);
	// FIXME: Update Table with new coordinates every iteration
	// FIXME: Need this to fly to B
	CFE_TBL_ReleaseAddress(MonitorState_AppData.TblHandle);
	
	MonitorState_State_t *temp = (MonitorState_State_t *)TblPtr;
	MonitorState_AppData.State = *temp;
	
	// MonitorState Run Loop
	while(CFE_ES_RunLoop(&MonitorState_AppData.RunStatus) == TRUE)
	{
		
		Status = CFE_SB_RcvMsg(&MonitorState_AppData.MsgPtr, MonitorState_AppData.MonitorStatePipe, CFE_SB_PEND_FOREVER);
		CFE_EVS_SendEvent(DEBUG,CFE_EVS_INFORMATION,"MONITORSTATE MESSAGE RECEIVED!!!"); //debug

		if (Status == CFE_SUCCESS);
		{
			
			if(CFE_SB_GetMsgId(MonitorState_AppData.MsgPtr) == MONITORSTATE_MID)
			{
				
				CFE_EVS_SendEvent(DEBUG,CFE_EVS_INFORMATION,"Message ID matches."); //debug
				
				printf("Waypoint: %c \n", MonitorState_AppData.State.Waypoint);
				
				while(!At_WP)
				{
					sleep(1);
					MonitorState_AppData.State = AdjustHeading(MonitorState_AppData.State);
					MonitorState_AppData.State = SimPosition(MonitorState_AppData.State);
					At_WP = MonitorStatus(MonitorState_AppData.State);
					LogState(MonitorState_AppData.State);
				}
				
				CFE_EVS_SendEvent(DEBUG,CFE_EVS_ERROR,"Arrived at Waypoint!");
				
				if(MonitorState_AppData.State.Waypoint == 'A')
				{
					MonitorState_AppData.State.Waypoint = 'B';
					TblPtr = &MonitorState_AppData.State;
					CFE_SB_SendMsg((CFE_SB_Msg_t *) &MonitorState_AppData.BusPacket_A);
					At_WP = false;
				}
				else if(MonitorState_AppData.State.Waypoint == 'B')
				{
					MonitorState_AppData.State.Waypoint = 'C';
					TblPtr = &MonitorState_AppData.State;
					CFE_SB_SendMsg((CFE_SB_Msg_t *) &MonitorState_AppData.BusPacket_B);
					At_WP = false;
				}
				
				//CFE_ES_ExitApp(UpdFlight_AppData.RunStatus);
			}
		}
		
	} // End while
	
} // End MonitorState_AppMain


//////////////////////////////////////////////////////////////////////////////////////////////////////

void MonitorState_init(void)
{
	int status;
	
	CFE_EVS_Register(MonitorState_EventFilters, sizeof(MonitorState_EventFilters)/sizeof(CFE_EVS_BinFilter_t), CFE_EVS_BINARY_FILTER); // Register Event filter table so events can be output
	
	MonitorState_AppData.RunStatus = CFE_ES_APP_RUN;
	
	MonitorState_AppData.PipeDepth = MONITORSTATE_PIPE_DEPTH;
	strcpy(MonitorState_AppData.PipeName, "MNTRSTATE_PIPE");	
	
	// Create Receive (command) pipe
	status = CFE_SB_CreatePipe(&MonitorState_AppData.MonitorStatePipe, MonitorState_AppData.PipeDepth, MonitorState_AppData.PipeName);
	if(status != CFE_SUCCESS)
	{
		CFE_EVS_SendEvent(DEBUG,CFE_EVS_ERROR,"Failed to create MonitorState pipe");
	}
	
	// Subscribe
	status = CFE_SB_Subscribe(MONITORSTATE_MID, MonitorState_AppData.MonitorStatePipe);
	if(status != CFE_SUCCESS)
	{
		CFE_EVS_SendEvent(DEBUG,CFE_EVS_ERROR,"Failed to subscribe to MONITORSTATE pipe");
	}
	
	CFE_SB_InitMsg(&MonitorState_AppData.BusPacket_A, MONITORSTATE_RETURN2A_MID, sizeof(MonitorState_BusPacket_t), TRUE);
	
	CFE_SB_InitMsg(&MonitorState_AppData.BusPacket_B, MONITORSTATE_RETURN2B_MID, sizeof(MonitorState_BusPacket_t), TRUE);
	
	char pathFile[100];
	char* directory;
	directory = "/home/al/Desktop";
	sprintf(pathFile, "%s/%s", directory, LogStateFile);
	
	FILE *fp = fopen(pathFile, "w");
	//FIXME: find a better way to populate. This will probably be in python script
	fprintf(fp, "%f, %f, %f, %f, %f, %f, %f, %f, %f, %f, %f \n", 0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0);
	fclose(fp);
	
	
	CFE_EVS_SendEvent(DEBUG, CFE_EVS_INFORMATION,"MonitorState App Initialized");
	
	
} // End MonitorState_init


//////////////////////////////////////////////////////////////////////////////////////////////////////

// FIXME: Not Used
void AdjustAlt(MonitorState_State_t State)
{

	float CurrentAlt, DesiredAlt, AltAdjust;
	
	CurrentAlt = State.zLoc;
	DesiredAlt = State.zWaypoint_A;
	
	AltAdjust = (DesiredAlt - CurrentAlt)/(State.xWaypoint_A - State.xLoc);
	State.zLoc = State.zLoc + AltAdjust;
	printf("Current Altitude = %f, Desired Altitude = %f, Updated Altitude = %f \n", CurrentAlt, DesiredAlt, State.zLoc);

}

//////////////////////////////////////////////////////////////////////////////////////////////////////

MonitorState_State_t AdjustHeading(MonitorState_State_t State)
{
	
	float CurrentHeading, DesiredHeading, HeadingAdjust;
	double acVec[2] = {State.xLoc, State.yLoc};
	//int wpVec[2] = {State.xWaypoint_A, State.yWaypoint_A};
	//float xTheta, yTheta, zTheta;
	
	CurrentHeading = State.Heading; //TblPtr->Heading;
	
	// FIXME: I don't think this math is right
	//xTheta = RAD2DEG*acos(TblPtr->xLoc/sqrt(pow(TblPtr->xLoc,2) + pow(TblPtr->yLoc,2)));
	//yTheta = RAD2DEG*acos(TblPtr->yLoc/sqrt(pow(TblPtr->xLoc,2) + pow(TblPtr->yLoc,2)));
	//zTheta = RAD2DEG*acos(TblPtr->zLoc/sqrt(pow(TblPtr->xLoc,2) + pow(TblPtr->yLoc,2) + pow(TblPtr->zLoc,2)));
	
	if(State.Waypoint == 'A')
	{
		double wpVec[3] = {State.xWaypoint_A, State.yWaypoint_A, State.zWaypoint_A};
		//DesiredHeading = RAD2DEG*acos(State.xWaypoint_A/sqrt(pow(State.xWaypoint_A,2) + pow(State.yWaypoint_A,2)));
		DesiredHeading = RAD2DEG*acos(State.xWaypoint_A/mag(wpVec,3));
		
		printf("%lf %lf %lf \n", dot_product(acVec, wpVec, 2),mag(acVec,2),mag(wpVec,2));
	}
	else if(State.Waypoint == 'B')
	{
		double wpVec[3] = {State.xWaypoint_B, State.yWaypoint_B, State.zWaypoint_B};
		DesiredHeading = RAD2DEG*acos(State.xWaypoint_A/mag(wpVec,3));
	}
	HeadingAdjust = (DesiredHeading - CurrentHeading)/5;
	State.Heading = (State.Heading + HeadingAdjust); // FIXME: logic not right
	
	printf("Current Heading = %f, Desired Heading = %f, Updated Heading = %f \n", CurrentHeading, DesiredHeading, State.Heading);
	
	return State;
	
}


//////////////////////////////////////////////////////////////////////////////////////////////////////

MonitorState_State_t SimPosition(MonitorState_State_t State)
{
	
	float xAdjust, yAdjust, zAdjust;
	float dist2WP_x, dist2WP_y, dist2WP_z, dist2WP_mag; // put in a vector?
	
	if(State.Waypoint == 'A')
	{
		dist2WP_x = State.xWaypoint_A - State.xLoc;
		dist2WP_y = State.yWaypoint_A - State.yLoc;
		dist2WP_z = State.zWaypoint_A - State.zLoc;
	}
	else if(State.Waypoint == 'B')
	{
		dist2WP_x = State.xWaypoint_B - State.xLoc;
		dist2WP_y = State.yWaypoint_B - State.yLoc;
		dist2WP_z = State.zWaypoint_B - State.zLoc;
	}
	dist2WP_mag = sqrt(pow(dist2WP_x,2) + pow(dist2WP_y,2) + pow(dist2WP_z,2));
	
	xAdjust = dist2WP_x/dist2WP_mag;
	yAdjust = dist2WP_y/dist2WP_mag;
	zAdjust = dist2WP_z/dist2WP_mag; 
	
	State.xLoc = State.xLoc + xAdjust*State.AirSpeed;
	State.yLoc = State.yLoc + yAdjust*State.AirSpeed;
	State.zLoc = State.zLoc + zAdjust*State.AirSpeed;
	
	printf("Updated Location (x,y,z) = (%f, %f, %f) \n", State.xLoc, State.yLoc, State.zLoc);
	
	return State;

}


//////////////////////////////////////////////////////////////////////////////////////////////////////


bool MonitorStatus(MonitorState_State_t State)
{
	
	float xState, yState, zState;
	
	if(State.Waypoint == 'A')
	{
		xState = abs(State.xWaypoint_A - State.xLoc);
		yState = abs(State.yWaypoint_A - State.yLoc);
		zState = abs(State.zWaypoint_A - State.zLoc);
	}
	else if(State.Waypoint == 'B')
	{
		xState = abs(State.xWaypoint_B - State.xLoc);
		yState = abs(State.yWaypoint_B - State.yLoc);
		zState = abs(State.zWaypoint_B - State.zLoc);
	}
	
	if(xState < 1 && yState < 1 && zState < 1)
	{
		return true;
	}
	
	return false;
	
}


//////////////////////////////////////////////////////////////////////////////////////////////////////

void LogState(MonitorState_State_t State)
{
	
	CFE_EVS_SendEvent(DEBUG,CFE_EVS_INFORMATION,"Logging State");
	
	sprintf(pathFile, "%s/%s", directory, LogStateFile);
	
	FILE *fp = fopen(pathFile, "a");

	fprintf(fp, "%f, %f, %f, %f, %f, %f, %f, %f, %f, %f, %f \n", State.xLoc, State.yLoc, State.zLoc, State.xWaypoint_A, State.yWaypoint_A, State.zWaypoint_A, State.xWaypoint_B, State.yWaypoint_B, State.zWaypoint_B, State.AirSpeed, State.Heading);
	
	fclose(fp);
	
}

//////////////////////////////////////////////////////////////////////////////////////////////////////

double dot_product(double *a, double *b, int dim)
{
	double ans;
	int i;
	
	ans = 0;
	for(i=0;i<dim;i++)
	{
		ans = ans + a[i]*b[i];
	}
		
	return ans;

}

//////////////////////////////////////////////////////////////////////////////////////////////////////

double mag(double *a, int dim)
{
	double ans;
	int i;
	
	ans = 0;
	for(i=0;i<dim;i++)
	{
		ans = ans + pow(a[i],2);
	}
	
	ans = sqrt(ans);
		
	return ans;

}

