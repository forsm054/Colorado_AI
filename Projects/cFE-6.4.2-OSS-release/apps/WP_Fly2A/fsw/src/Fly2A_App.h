#ifndef _Fly2A_App_h
#define _Fly2A_App_h

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

#define FLY2A_PIPE_DEPTH 12
#define ARRAY_SIZE 50


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

} Fly2A_DataPacket_t;

typedef struct
{
	uint8 Header[CFE_SB_CMD_HDR_SIZE];
	
	char cmd[ARRAY_SIZE];
	bool Success;
	
} Fly2A_BusPacket_t;

typedef struct
{
	uint8 TlmHeader[CFE_SB_CMD_HDR_SIZE];
	
	// Command interface counters
	uint8 CmdCounter;
	uint8 ErrCounter;
	
	Fly2A_BusPacket_t	DataPacket;
	Fly2A_BusPacket_t		BusPacket_MP;
	Fly2A_BusPacket_t		BusPacket_Tlm;	
	
	CFE_SB_MsgPtr_t	MsgPtr;
	CFE_SB_PipeId_t Fly2APipe; // Pipe Identifier
	
	// App status
	uint32 RunStatus;
	
	// Pipe Data
	char PipeName[16];
	uint16 PipeDepth;
	
} Fly2A_AppData_t;


// Function Definitions
void Fly2A_AppMain(void);
void Fly2A_init(void);
Fly2A_BusPacket_t UpdateBusPacket_A(Fly2A_BusPacket_t Data);

#endif
