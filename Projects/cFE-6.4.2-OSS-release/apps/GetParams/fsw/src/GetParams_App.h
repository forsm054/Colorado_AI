#ifndef _GetParams_App_h
#define _GetParams_App_h

#include "network_includes.h" // only need if using sockets

// CoreFlight includes
#include "cfe_error.h"
#include "cfe_sb.h"
#include "cfe_time.h"
#include "cfe_evs.h"
#include "cfe_sb.h"
#include "cfe_es.h"

// C includes
#include <errno.h>
#include <string.h>
#include <unistd.h>
#include <arpa/inet.h>
#include <sys/socket.h>
#include <stdbool.h>

// OSAL includes
#include "common_types.h"
#include "osapi.h"

#define SERVER "127.0.0.1"
#define RETURN_PORT 8039
#define GETPARAMS_PIPE_DEPTH 20
#define ARRAY_SIZE 100


typedef struct
{
	uint8 DataHeader[CFE_SB_CMD_HDR_SIZE];
	
	//uint8 CmdCounter;
	//uint8 ErrCounter;
	
	char Success[4];
	float xWaypoint_A;
	float yWaypoint_A;
	float zWaypoint_A;
	float xWaypoint_B;
	float yWaypoint_B;
	float zWaypoint_B;
	float vel;
	float xLoc;
	float yLoc;
	float zLoc;
	float velTarget;
	float xTarget;
	float yTarget;
	float zTarget;
	int xFlag;
	int yFlag;
	int zFlag;
	char Waypoint;
	
} GetParams_DataPacket_t;


typedef struct
{

	// Command interface counters
	uint8 CmdCounter;
	uint8 ErrCounter;
	
	GetParams_DataPacket_t DataPacket;
	
	CFE_SB_MsgPtr_t	MsgPtr;
	CFE_SB_PipeId_t GetParamsPipe; // Pipe Identifier
	
	// App status
	uint32 RunStatus;
	
	// Pipe Data
	char PipeName[16];
	uint16 PipeDepth;
	
} GetParams_AppData_t;


// Function Definitions
void GetParams_AppMain(void);
void GetParams_init(void);
void GetParams_SendReturn(GetParams_DataPacket_t);
int temp_ParamUpdate(int);

#endif