#ifndef _MonitorState_App_h
#define _MonitorState_App_h

#include "network_includes.h" // only need if using sockets

// CoreFlight includes
#include "cfe_error.h"
#include "cfe_sb.h"
#include "cfe_time.h"
#include "cfe_evs.h"
#include "cfe_sb.h"
#include "cfe_tbl.h"
#include "cfe_es.h"

// C includes
#include <errno.h>
#include <string.h>
#include <unistd.h>
#include <stdio.h>
#include <stdlib.h>
#include <fcntl.h>
#include <arpa/inet.h>
#include <sys/socket.h>
#include <stdbool.h>
#include <math.h>

// OSAL includes
#include "common_types.h"
#include "osapi.h"

#define MONITORSTATE_PIPE_DEPTH 12
#define ARRAY_SIZE 100
#define PI 3.14159265
#define RAD2DEG 180/PI

typedef struct
{
	//uint8 Header[CFE_SB_CMD_HDR_SIZE];
	
	// Initial Conditions (only used for simulation purposes)
	float xWaypoint_A;
	float yWaypoint_A;
	float zWaypoint_A;
	float xWaypoint_B;
	float yWaypoint_B;
	float zWaypoint_B;
	
	// State
  float   AirSpeed;
  float		Heading;
  float		xLoc;
  float		yLoc;
  float		zLoc;
  char		Waypoint;
	
} MonitorState_State_t;

typedef struct
{
	uint8 Header[CFE_SB_CMD_HDR_SIZE];
	
	char cmd[ARRAY_SIZE];
	bool Success;
	
} MonitorState_BusPacket_t;


typedef struct
{
	// Command interface counters
	uint8 CmdCounter;
	uint8 ErrCounter;
	
	MonitorState_State_t 			State;
	MonitorState_BusPacket_t	BusPacket_A;
	MonitorState_BusPacket_t	BusPacket_B;
	
	CFE_SB_MsgPtr_t	MsgPtr;
	CFE_SB_PipeId_t MonitorStatePipe; // Pipe Identifier
	
	// App status
	uint32 RunStatus;
	
	// Pipe Data
	char PipeName[16];
	uint16 PipeDepth;
	
	CFE_TBL_Handle_t TblHandle;
	
} MonitorState_AppData_t;


// Function Definitions
void MntrState_AppMain(void);
void MonitorState_init(void);
void AdjustAlt(MonitorState_State_t);
MonitorState_State_t AdjustHeading(MonitorState_State_t);
MonitorState_State_t SimPosition(MonitorState_State_t);
bool MonitorStatus(MonitorState_State_t);
void LogState(MonitorState_State_t);
double dot_product(double *, double *, int);
double mag(double *, int);

#endif
