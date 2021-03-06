# Waypoint Demo
# https://github.com/forsm054/Waypoint_Demo.git

Obtaining Demo from GitHub:
1. cd to home directory "cd ~"
2. git clone https://github.com/forsm054/Waypoint_Demo.git


Running Demo:
1. Open terminal (terminal 1: CFE) 
2. cd ~/Waypoint_Demo/Projects/cFE-6.4.2-OSS-release
3. source setvars.sh
4. cd build/cpu1/exe
5. sudo ./core-linux.bin --> This should run CoreFlight, which will load all of the apps and pause on "Processing UDP Command" or "Stop FLYWHEEL"

6. Open a new terminal (terminal 2: GUI)
7. cd ~/Waypoint_Demo
8. python Plot_RT.py --> You need to have python installed --> This should open up a 3D GUI

9. Open a final terminal (terminal 3: Plexil)
10. cd ~/Waypoint_Demo/plexil-4/examples/Als_examples/Plexil2CF_WP2
11. plexilexec -p Waypoint_Plan.plx -c Waypoint_Plan-conf.xml

** Plan Should begin execution and GUI should now be tracking parameters. It should end after reaching Waypoint B. Upon successful completion, the plexil terminal should state that the plan has completed without any errors and shutdown. The CoreFlight terminal will continue to wait for commands (haven't implemented shutdown yet), but can be ended with Ctrl+C (doesn't always shutdown smoothly though).


Editing Apps in CFE:
1. All apps are located in ~/Waypoint_Demo/Projects/cFE-6.4.2-OSS-release/apps NOTE: all apps must be edited in this directory.
2. Choose app and make changes in its fsw/src/ directory
3. After changes have been made, return to cFE-6.4.2-OSS-release and cd to build/cpu1 (I usually just have a second terminal open at this directory, that way you can make your changes and check for errors w/o having to go back and forth)
4. perform a make here to compile changes NOTE: if you want to make sure your changes are valid you can cd to specific app folder and do a make there, but you must always make in the cpu1 directory for changes to be committed.


Editing Initial Conditions:
1. cd ~/Waypoint_Demo/Projects/cFE-6.4.2-OSS-release/apps/WP_CommandHandler/fsw/tables
2. open TestTbl.c
3. Edit numbers on line 32. These numbers correspond chronologically with the variables in the struct above.

Editing PLEXIL program
1. cd ~/Waypoint_Demo/plexil-4/examples/Als_examples/Plexil2CF_WP2
2. Edit either the .ple file or .xml file depending on what you want
3. compile using 'plexilc Waypoint_Plan.ple' which should create a .plx file upon successful compilation. 
