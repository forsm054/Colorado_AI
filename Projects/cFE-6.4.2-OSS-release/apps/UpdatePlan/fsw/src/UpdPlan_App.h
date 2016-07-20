#ifndef _UpdPlan_App_h
#define _UpdPlan_App_h

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

#define UPDPLAN_PIPE_DEPTH 12
#define ARRAY_SIZE 100


typedef struct
{

	uint8 TlmHeader[CFE_SB_CMD_HDR_SIZE];
	
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

} UpdPlan_DataPacket_t;

typedef struct
{
	// Command interface counters
	uint8 CmdCounter;
	uint8 ErrCounter;
	
	// Housekeeping telemetry packet
	UpdPlan_DataPacket_t DataPacket;
	
	CFE_SB_MsgPtr_t	MsgPtr;
	CFE_SB_PipeId_t UpdPlanPipe; // Pipe Identifier
	
	// App status
	uint32 RunStatus;
	
	// Pipe Data
	char PipeName[16];
	uint16 PipeDepth;
	
} UpdPlan_AppData_t;


// Function Definitions
void UpdPlan_AppMain(void);
void UpdPlan_init(void);
UpdPlan_DataPacket_t UpdatePlan(UpdPlan_DataPacket_t Data);

#endif