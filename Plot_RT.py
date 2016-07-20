import matplotlib.pyplot as plt
from mpl_toolkits.mplot3d import Axes3D
import matplotlib.animation as animation
from matplotlib.offsetbox import AnchoredText
import time

fig = plt.figure()
ax1 = fig.add_subplot(111, projection='3d')

def animate(i):
	pullData = open("WP_State.txt","r").read()
	dataArray = pullData.split('\n')
	x = []
	y = []
	z = []
	xWP_A = []
	yWP_A = []
	zWP_A = []
	xWP_B = []
	yWP_B = []
	zWP_B = []
	vel = []
	Heading = []
	for eachLine in dataArray:
		if len(eachLine)>1:
			xLoc, yLoc, zLoc, xWaypoint_A, yWaypoint_A, zWaypoint_A, xWaypoint_B, yWaypoint_B, zWaypoint_B, AirSpeed, heading = eachLine.split(',')
			x.append(float(xLoc))
			y.append(float(yLoc))
			z.append(float(zLoc))
			xWP_A = float(xWaypoint_A)
			yWP_A = float(yWaypoint_A)
			zWP_A = float(zWaypoint_A)
			xWP_B = float(xWaypoint_B)
			yWP_B = float(yWaypoint_B)
			zWP_B = float(zWaypoint_B)
			vel.append(float(AirSpeed))
			Heading.append(float(heading))
		ax1.clear()
		ax1.plot(x,y,z)
		ax1.scatter(xWP_A, yWP_A, zWP_A)
		ax1.scatter(xWP_B, yWP_B, zWP_B)
		ax1.text(xWP_A, yWP_A, zWP_A, "Waypoint A", fontsize = 12)
		ax1.text(xWP_B, yWP_B, zWP_B, "Waypoint B", fontsize = 12)
		anchored_text = AnchoredText("Air Speed = %f \n Heading = %f"%(vel[-1],Heading[-1]),loc=2)
		ax1.add_artist(anchored_text)
ani = animation.FuncAnimation(fig, animate, interval=1000)
plt.show()
