
#include "cfe_tbl_filedef.h"  /* Required to obtain the CFE_TBL_FILEDEF macro definition */

/*
** The following is an example of a data structure the application may have declared
** as the format of their table.
*/
typedef struct
{
		
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
} AC_State_t;

/*
** The following is an example of the declaration statement that defines the desired
** contents of the table image.
*/
AC_State_t State = {3, 25, 7, 12, 10, 1, 1, 0, 0, 0, 0, 'A'};


/*
** The macro below identifies:
**    1) the data structure type to use as the table image format
**    2) the name of the table to be placed into the cFE Table File Header
**    3) a brief description of the contents of the file image
**    4) the desired name of the table image binary file that is cFE compatible
*/
CFE_TBL_FILEDEF(State, CMDHANDLER_APP.InitTable, Table Utility Test Table, TestTbl.tbl )
