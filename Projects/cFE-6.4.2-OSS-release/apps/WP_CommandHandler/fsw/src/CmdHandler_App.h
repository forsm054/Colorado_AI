#ifndef _Waypoint_App_h
#define _Waypoint_App_h

#include "network_includes.h" // only need if using sockets

// CoreFlight includes
#include "cfe_error.h"
#include "cfe_sb.h"
#include "cfe_time.h"
#include "cfe_evs.h"
#include "cfe_tbl.h"
#include "cfe_es.h"
#include "cfe_tbl_filedef.h"

// C includes
#include <errno.h>
#include <string.h>
#include <unistd.h>
#include <fcntl.h>
#include <arpa/inet.h>
#include <sys/socket.h>
#include <stdbool.h>

// OSAL includes
#include "common_types.h"
#include "osapi.h"

#define CMD_PORT 8036
#define SERVER "127.0.0.1"
#define BUFLEN 514
#define CMDHANDLER_PIPE_DEPTH 20
#define ARRAY_SIZE 50
#define CMDHANDLER_NUM_TABLES 1


typedef struct
{
	//uint8 DataHeader[CFE_SB_CMD_HDR_SIZE];
	
	// Initial Conditions (only used for simulation purposes)
	float xWaypoint_A;
	float yWaypoint_A;
	float zWaypoint_A;
	float xWaypoint_B;
	float yWaypoint_B;
	float zWaypoint_B;
	
	// State
  float   AirSpeed;
  float		heading;
  float		xLoc;
  float		yLoc;
  float		zLoc;
  char		Waypoint;
	
} CmdHandler_DataPacket_t;

typedef struct
{
	uint8 Header[CFE_SB_CMD_HDR_SIZE];
	
	char cmd[ARRAY_SIZE];
	bool Success;
	
} CmdHandler_BusPacket_t;

typedef struct
{

	CFE_SB_MsgPtr_t MsgPtr;
	
	// Command interface counters
	uint8 CmdCounter;
	uint8 ErrCounter;
	
	//CmdHandler_DataPacket_t				Fly2A_Packet;
	//CmdHandler_DataPacket_t 			Fly2B_Packet;
	CmdHandler_BusPacket_t				BusPacket_A;
	CmdHandler_BusPacket_t				BusPacket_B;
	
	// App status
	uint32 RunStatus;
	
	// Pipe Data
	char PipeName[16];
	uint16 PipeDepth;
	
	CFE_TBL_Handle_t	TblHandle;
	
} CmdHandler_AppData_t;


// Function Definitions
void CmdHandler_AppMain(void);
void CmdHandler_init(void);
void Create_Cmd_Socket(void);
void ProcessUDP(void);
void Command_Handler(char *);
int InitTableValidation(void *TblData);

#endif
