<?xml version="1.0" encoding="UTF-8"?><PlexilPlan xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:tr="extended-plexil-translator" FileName="Waypoint_Plan.ple"><GlobalDeclarations LineNo="49" ColNo="0"><CommandDeclaration LineNo="49" ColNo="0"><Name>Fly2A</Name></CommandDeclaration><CommandDeclaration LineNo="50" ColNo="0"><Name>Fly2B</Name></CommandDeclaration><CommandDeclaration LineNo="51" ColNo="8"><Name>UpdateIC</Name><Return><Name>_return_0</Name><Type>Boolean</Type></Return><Parameter><Type>String</Type></Parameter><Parameter><Type>Real</Type></Parameter><Parameter><Type>Real</Type></Parameter><Parameter><Type>Real</Type></Parameter><Parameter><Type>Real</Type></Parameter></CommandDeclaration><CommandDeclaration LineNo="52" ColNo="0"><Name>UpdateWaypoint</Name><Parameter><Type>String</Type></Parameter><Parameter><Type>Real</Type></Parameter><Parameter><Type>Real</Type></Parameter><Parameter><Type>Real</Type></Parameter><Parameter><Type>String</Type></Parameter></CommandDeclaration><CommandDeclaration LineNo="54" ColNo="0"><Name>SendMessage</Name></CommandDeclaration><CommandDeclaration LineNo="55" ColNo="0"><Name>UpdateLookup</Name></CommandDeclaration><CommandDeclaration LineNo="57" ColNo="0"><Name>pprint</Name></CommandDeclaration></GlobalDeclarations><Node NodeType="NodeList" epx="Sequence" LineNo="62" ColNo="1"><NodeId>WaypointPlan</NodeId><VariableDeclarations><DeclareVariable LineNo="61" ColNo="1"><Name>velStart</Name><Type>Real</Type><InitialValue><RealValue>1</RealValue></InitialValue></DeclareVariable><DeclareVariable LineNo="62" ColNo="1"><Name>xStart</Name><Type>Real</Type><InitialValue><RealValue>0</RealValue></InitialValue></DeclareVariable><DeclareVariable LineNo="63" ColNo="1"><Name>yStart</Name><Type>Real</Type><InitialValue><RealValue>0</RealValue></InitialValue></DeclareVariable><DeclareVariable LineNo="64" ColNo="1"><Name>zStart</Name><Type>Real</Type><InitialValue><RealValue>0</RealValue></InitialValue></DeclareVariable><DeclareVariable LineNo="65" ColNo="1"><Name>xWaypoint_A</Name><Type>Real</Type><InitialValue><RealValue>10</RealValue></InitialValue></DeclareVariable><DeclareVariable LineNo="66" ColNo="1"><Name>yWaypoint_A</Name><Type>Real</Type><InitialValue><RealValue>0</RealValue></InitialValue></DeclareVariable><DeclareVariable LineNo="67" ColNo="1"><Name>zWaypoint_A</Name><Type>Real</Type><InitialValue><RealValue>5</RealValue></InitialValue></DeclareVariable><DeclareVariable LineNo="68" ColNo="1"><Name>xWaypoint_B</Name><Type>Real</Type><InitialValue><RealValue>10</RealValue></InitialValue></DeclareVariable><DeclareVariable LineNo="69" ColNo="1"><Name>yWaypoint_B</Name><Type>Real</Type><InitialValue><RealValue>10</RealValue></InitialValue></DeclareVariable><DeclareVariable LineNo="70" ColNo="1"><Name>zWaypoint_B</Name><Type>Real</Type><InitialValue><RealValue>5</RealValue></InitialValue></DeclareVariable><DeclareVariable LineNo="71" ColNo="1"><Name>A_Complete</Name><Type>Boolean</Type></DeclareVariable><DeclareVariable LineNo="72" ColNo="1"><Name>B_Complete</Name><Type>Boolean</Type></DeclareVariable></VariableDeclarations><ExitCondition><AND><BooleanVariable>A_Complete</BooleanVariable><BooleanVariable>B_Complete</BooleanVariable></AND></ExitCondition><InvariantCondition><NOT><OR><AND><EQInternal><NodeOutcomeVariable><NodeRef dir="child">Set_Start</NodeRef></NodeOutcomeVariable><NodeOutcomeValue>FAILURE</NodeOutcomeValue></EQInternal><EQInternal><NodeStateVariable><NodeRef dir="child">Set_Start</NodeRef></NodeStateVariable><NodeStateValue>FINISHED</NodeStateValue></EQInternal></AND><AND><EQInternal><NodeOutcomeVariable><NodeRef dir="child">Execute_A</NodeRef></NodeOutcomeVariable><NodeOutcomeValue>FAILURE</NodeOutcomeValue></EQInternal><EQInternal><NodeStateVariable><NodeRef dir="child">Execute_A</NodeRef></NodeStateVariable><NodeStateValue>FINISHED</NodeStateValue></EQInternal></AND><AND><EQInternal><NodeOutcomeVariable><NodeRef dir="child">Execute_B</NodeRef></NodeOutcomeVariable><NodeOutcomeValue>FAILURE</NodeOutcomeValue></EQInternal><EQInternal><NodeStateVariable><NodeRef dir="child">Execute_B</NodeRef></NodeStateVariable><NodeStateValue>FINISHED</NodeStateValue></EQInternal></AND></OR></NOT></InvariantCondition><NodeBody><NodeList><Node NodeType="NodeList" epx="Sequence" LineNo="79" ColNo="2"><NodeId>Set_Start</NodeId><VariableDeclarations><DeclareVariable LineNo="78" ColNo="2"><Name>StartUpdated</Name><Type>Boolean</Type></DeclareVariable></VariableDeclarations><PostCondition><BooleanVariable>StartUpdated</BooleanVariable></PostCondition><InvariantCondition><NOT><OR><AND><EQInternal><NodeOutcomeVariable><NodeRef dir="child">COMMAND__0</NodeRef></NodeOutcomeVariable><NodeOutcomeValue>FAILURE</NodeOutcomeValue></EQInternal><EQInternal><NodeStateVariable><NodeRef dir="child">COMMAND__0</NodeRef></NodeStateVariable><NodeStateValue>FINISHED</NodeStateValue></EQInternal></AND><AND><EQInternal><NodeOutcomeVariable><NodeRef dir="child">UpdateIC_Return</NodeRef></NodeOutcomeVariable><NodeOutcomeValue>FAILURE</NodeOutcomeValue></EQInternal><EQInternal><NodeStateVariable><NodeRef dir="child">UpdateIC_Return</NodeRef></NodeStateVariable><NodeStateValue>FINISHED</NodeStateValue></EQInternal></AND></OR></NOT></InvariantCondition><NodeBody><NodeList><Node NodeType="Command" LineNo="82" ColNo="2"><NodeId>COMMAND__0</NodeId><NodeBody><Command><Name><StringValue>UpdateIC</StringValue></Name><Arguments LineNo="83" ColNo="11"><StringValue>UpdateIC</StringValue><RealVariable>velStart</RealVariable><RealVariable>xStart</RealVariable><RealVariable>yStart</RealVariable><RealVariable>zStart</RealVariable></Arguments></Command></NodeBody></Node><Node NodeType="NodeList" epx="Sequence" LineNo="85" ColNo="19"><NodeId>UpdateIC_Return</NodeId><VariableDeclarations><DeclareVariable LineNo="84" ColNo="46"><Name>cmd</Name><Type>String</Type></DeclareVariable><DeclareVariable LineNo="84" ColNo="58"><Name>StartUpdated</Name><Type>Boolean</Type></DeclareVariable><DeclareVariable><Name>ep2cp_hdl</Name><Type>String</Type></DeclareVariable></VariableDeclarations><StartCondition><EQInternal><NodeStateVariable><NodeRef dir="sibling">COMMAND__0</NodeRef></NodeStateVariable><NodeStateValue>FINISHED</NodeStateValue></EQInternal></StartCondition><InvariantCondition><NOT><OR><AND><EQInternal><NodeOutcomeVariable><NodeRef dir="child">ep2cp_CmdWait</NodeRef></NodeOutcomeVariable><NodeOutcomeValue>FAILURE</NodeOutcomeValue></EQInternal><EQInternal><NodeStateVariable><NodeRef dir="child">ep2cp_CmdWait</NodeRef></NodeStateVariable><NodeStateValue>FINISHED</NodeStateValue></EQInternal></AND><AND><EQInternal><NodeOutcomeVariable><NodeRef dir="child">ep2cp_CmdGetParam_cmd</NodeRef></NodeOutcomeVariable><NodeOutcomeValue>FAILURE</NodeOutcomeValue></EQInternal><EQInternal><NodeStateVariable><NodeRef dir="child">ep2cp_CmdGetParam_cmd</NodeRef></NodeStateVariable><NodeStateValue>FINISHED</NodeStateValue></EQInternal></AND><AND><EQInternal><NodeOutcomeVariable><NodeRef dir="child">ep2cp_CmdGetParam_StartUpdated</NodeRef></NodeOutcomeVariable><NodeOutcomeValue>FAILURE</NodeOutcomeValue></EQInternal><EQInternal><NodeStateVariable><NodeRef dir="child">ep2cp_CmdGetParam_StartUpdated</NodeRef></NodeStateVariable><NodeStateValue>FINISHED</NodeStateValue></EQInternal></AND><AND><EQInternal><NodeOutcomeVariable><NodeRef dir="child">ep2cp_CmdAction_CommandReturn</NodeRef></NodeOutcomeVariable><NodeOutcomeValue>FAILURE</NodeOutcomeValue></EQInternal><EQInternal><NodeStateVariable><NodeRef dir="child">ep2cp_CmdAction_CommandReturn</NodeRef></NodeStateVariable><NodeStateValue>FINISHED</NodeStateValue></EQInternal></AND><AND><EQInternal><NodeOutcomeVariable><NodeRef dir="child">ep2cp_CmdReturn</NodeRef></NodeOutcomeVariable><NodeOutcomeValue>FAILURE</NodeOutcomeValue></EQInternal><EQInternal><NodeStateVariable><NodeRef dir="child">ep2cp_CmdReturn</NodeRef></NodeStateVariable><NodeStateValue>FINISHED</NodeStateValue></EQInternal></AND></OR></NOT></InvariantCondition><NodeBody><NodeList><Node NodeType="Command"><NodeId>ep2cp_CmdWait</NodeId><EndCondition><IsKnown><StringVariable>ep2cp_hdl</StringVariable></IsKnown></EndCondition><NodeBody><Command><StringVariable>ep2cp_hdl</StringVariable><Name><StringValue>ReceiveCommand</StringValue></Name><Arguments><StringValue>CommandReturn</StringValue></Arguments></Command></NodeBody></Node><Node NodeType="Command"><NodeId>ep2cp_CmdGetParam_cmd</NodeId><StartCondition><EQInternal><NodeStateVariable><NodeRef dir="sibling">ep2cp_CmdWait</NodeRef></NodeStateVariable><NodeStateValue>FINISHED</NodeStateValue></EQInternal></StartCondition><EndCondition><IsKnown><StringVariable>cmd</StringVariable></IsKnown></EndCondition><NodeBody><Command><StringVariable>cmd</StringVariable><Name><StringValue>GetParameter</StringValue></Name><Arguments><StringVariable>ep2cp_hdl</StringVariable><IntegerValue>0</IntegerValue></Arguments></Command></NodeBody></Node><Node NodeType="Command"><NodeId>ep2cp_CmdGetParam_StartUpdated</NodeId><StartCondition><EQInternal><NodeStateVariable><NodeRef dir="sibling">ep2cp_CmdGetParam_cmd</NodeRef></NodeStateVariable><NodeStateValue>FINISHED</NodeStateValue></EQInternal></StartCondition><EndCondition><IsKnown><BooleanVariable>StartUpdated</BooleanVariable></IsKnown></EndCondition><NodeBody><Command><BooleanVariable>StartUpdated</BooleanVariable><Name><StringValue>GetParameter</StringValue></Name><Arguments><StringVariable>ep2cp_hdl</StringVariable><IntegerValue>1</IntegerValue></Arguments></Command></NodeBody></Node><Node NodeType="NodeList"><NodeId>ep2cp_CmdAction_CommandReturn</NodeId><StartCondition><EQInternal><NodeStateVariable><NodeRef dir="sibling">ep2cp_CmdGetParam_StartUpdated</NodeRef></NodeStateVariable><NodeStateValue>FINISHED</NodeStateValue></EQInternal></StartCondition><NodeBody><NodeList><Node NodeType="Command" LineNo="86" ColNo="3"><NodeId>COMMAND__2</NodeId><NodeBody><Command><Name><StringValue>pprint</StringValue></Name><Arguments LineNo="87" ColNo="10"><StringValue>The aircraft's starting location and velocity is: vel = </StringValue><RealVariable>velStart</RealVariable><StringValue>x =</StringValue><RealVariable>xStart</RealVariable><StringValue>y =</StringValue><RealVariable>yStart</RealVariable><StringValue>z =</StringValue><RealVariable>zStart</RealVariable></Arguments></Command></NodeBody></Node></NodeList></NodeBody></Node><Node NodeType="Command"><NodeId>ep2cp_CmdReturn</NodeId><StartCondition><EQInternal><NodeStateVariable><NodeRef dir="sibling">ep2cp_CmdAction_CommandReturn</NodeRef></NodeStateVariable><NodeStateValue>FINISHED</NodeStateValue></EQInternal></StartCondition><NodeBody><Command><Name><StringValue>SendReturnValue</StringValue></Name><Arguments><StringVariable>ep2cp_hdl</StringVariable><BooleanValue>true</BooleanValue></Arguments></Command></NodeBody></Node></NodeList></NodeBody></Node></NodeList></NodeBody></Node><Node NodeType="NodeList" epx="Sequence" LineNo="93" ColNo="2"><NodeId>Execute_A</NodeId><VariableDeclarations><DeclareVariable LineNo="92" ColNo="2"><Name>Fly2A_Success</Name><Type>Boolean</Type></DeclareVariable></VariableDeclarations><StartCondition><EQInternal><NodeStateVariable><NodeRef dir="sibling">Set_Start</NodeRef></NodeStateVariable><NodeStateValue>FINISHED</NodeStateValue></EQInternal></StartCondition><PostCondition><EQInternal><NodeOutcomeVariable><NodeId>Command_Fly2A</NodeId></NodeOutcomeVariable><NodeOutcomeValue>SUCCESS</NodeOutcomeValue></EQInternal></PostCondition><InvariantCondition><NOT><OR><AND><EQInternal><NodeOutcomeVariable><NodeRef dir="child">COMMAND__3</NodeRef></NodeOutcomeVariable><NodeOutcomeValue>FAILURE</NodeOutcomeValue></EQInternal><EQInternal><NodeStateVariable><NodeRef dir="child">COMMAND__3</NodeRef></NodeStateVariable><NodeStateValue>FINISHED</NodeStateValue></EQInternal></AND><AND><EQInternal><NodeOutcomeVariable><NodeRef dir="child">Set_WaypointA</NodeRef></NodeOutcomeVariable><NodeOutcomeValue>FAILURE</NodeOutcomeValue></EQInternal><EQInternal><NodeStateVariable><NodeRef dir="child">Set_WaypointA</NodeRef></NodeStateVariable><NodeStateValue>FINISHED</NodeStateValue></EQInternal></AND><AND><EQInternal><NodeOutcomeVariable><NodeRef dir="child">Command_Fly2A</NodeRef></NodeOutcomeVariable><NodeOutcomeValue>FAILURE</NodeOutcomeValue></EQInternal><EQInternal><NodeStateVariable><NodeRef dir="child">Command_Fly2A</NodeRef></NodeStateVariable><NodeStateValue>FINISHED</NodeStateValue></EQInternal></AND><AND><EQInternal><NodeOutcomeVariable><NodeRef dir="child">if__8</NodeRef></NodeOutcomeVariable><NodeOutcomeValue>FAILURE</NodeOutcomeValue></EQInternal><EQInternal><NodeStateVariable><NodeRef dir="child">if__8</NodeRef></NodeStateVariable><NodeStateValue>FINISHED</NodeStateValue></EQInternal></AND></OR></NOT></InvariantCondition><NodeBody><NodeList><Node NodeType="Command" LineNo="95" ColNo="2"><NodeId>COMMAND__3</NodeId><NodeBody><Command><Name><StringValue>pprint</StringValue></Name><Arguments LineNo="96" ColNo="9"><StringValue>Execute A</StringValue></Arguments></Command></NodeBody></Node><Node NodeType="NodeList" epx="Sequence" LineNo="101" ColNo="3"><NodeId>Set_WaypointA</NodeId><VariableDeclarations><DeclareVariable LineNo="100" ColNo="3"><Name>WaypointSet</Name><Type>Boolean</Type></DeclareVariable></VariableDeclarations><StartCondition><EQInternal><NodeStateVariable><NodeRef dir="sibling">COMMAND__3</NodeRef></NodeStateVariable><NodeStateValue>FINISHED</NodeStateValue></EQInternal></StartCondition><PostCondition><BooleanVariable>WaypointSet</BooleanVariable></PostCondition><InvariantCondition><NOT><OR><AND><EQInternal><NodeOutcomeVariable><NodeRef dir="child">COMMAND__4</NodeRef></NodeOutcomeVariable><NodeOutcomeValue>FAILURE</NodeOutcomeValue></EQInternal><EQInternal><NodeStateVariable><NodeRef dir="child">COMMAND__4</NodeRef></NodeStateVariable><NodeStateValue>FINISHED</NodeStateValue></EQInternal></AND><AND><EQInternal><NodeOutcomeVariable><NodeRef dir="child">COMMAND__5</NodeRef></NodeOutcomeVariable><NodeOutcomeValue>FAILURE</NodeOutcomeValue></EQInternal><EQInternal><NodeStateVariable><NodeRef dir="child">COMMAND__5</NodeRef></NodeStateVariable><NodeStateValue>FINISHED</NodeStateValue></EQInternal></AND><AND><EQInternal><NodeOutcomeVariable><NodeRef dir="child">COMMAND__6</NodeRef></NodeOutcomeVariable><NodeOutcomeValue>FAILURE</NodeOutcomeValue></EQInternal><EQInternal><NodeStateVariable><NodeRef dir="child">COMMAND__6</NodeRef></NodeStateVariable><NodeStateValue>FINISHED</NodeStateValue></EQInternal></AND></OR></NOT></InvariantCondition><NodeBody><NodeList><Node NodeType="Command" LineNo="103" ColNo="3"><NodeId>COMMAND__4</NodeId><NodeBody><Command><Name><StringValue>pprint</StringValue></Name><Arguments LineNo="104" ColNo="10"><StringValue>Set_WaypointA</StringValue></Arguments></Command></NodeBody></Node><Node NodeType="Command" LineNo="106" ColNo="3"><NodeId>COMMAND__5</NodeId><StartCondition><EQInternal><NodeStateVariable><NodeRef dir="sibling">COMMAND__4</NodeRef></NodeStateVariable><NodeStateValue>FINISHED</NodeStateValue></EQInternal></StartCondition><NodeBody><Command><Name><StringValue>UpdateWaypoint</StringValue></Name><Arguments LineNo="107" ColNo="18"><StringValue>UpdateWaypoint</StringValue><RealVariable>xWaypoint_A</RealVariable><RealVariable>yWaypoint_A</RealVariable><RealVariable>zWaypoint_A</RealVariable><StringValue>A</StringValue></Arguments></Command></NodeBody></Node><Node NodeType="Command" LineNo="107" ColNo="3"><NodeId>COMMAND__6</NodeId><StartCondition><EQInternal><NodeStateVariable><NodeRef dir="sibling">COMMAND__5</NodeRef></NodeStateVariable><NodeStateValue>FINISHED</NodeStateValue></EQInternal></StartCondition><NodeBody><Command><Name><StringValue>pprint</StringValue></Name><Arguments LineNo="108" ColNo="10"><StringValue>Waypoint A is located at: x =</StringValue><RealVariable>xWaypoint_A</RealVariable><StringValue>y =</StringValue><RealVariable>yWaypoint_A</RealVariable><StringValue>z =</StringValue><RealVariable>zWaypoint_A</RealVariable></Arguments></Command></NodeBody></Node></NodeList></NodeBody></Node><Node NodeType="Command" LineNo="117" ColNo="3"><NodeId>Command_Fly2A</NodeId><StartCondition><AND><EQInternal><NodeStateVariable><NodeRef dir="sibling">Set_WaypointA</NodeRef></NodeStateVariable><NodeStateValue>FINISHED</NodeStateValue></EQInternal><EQInternal><NodeStateVariable><NodeId>Set_WaypointA</NodeId></NodeStateVariable><NodeStateValue>FINISHED</NodeStateValue></EQInternal></AND></StartCondition><PostCondition><BooleanVariable>Fly2A_Success</BooleanVariable></PostCondition><NodeBody><Command><Name><StringValue>Fly2A</StringValue></Name></Command></NodeBody></Node><Node NodeType="NodeList" epx="If" LineNo="121" ColNo="2"><NodeId>if__8</NodeId><StartCondition><EQInternal><NodeStateVariable><NodeRef dir="sibling">Command_Fly2A</NodeRef></NodeStateVariable><NodeStateValue>FINISHED</NodeStateValue></EQInternal></StartCondition><NodeBody><NodeList><Node NodeType="Empty" epx="Condition"><NodeId>ep2cp_IfTest</NodeId><PostCondition><BooleanVariable>Fly2A_Success</BooleanVariable></PostCondition></Node><Node NodeType="NodeList" epx="Then" LineNo="123" ColNo="3"><NodeId>BLOCK__9</NodeId><InvariantCondition><NOT><OR><AND><EQInternal><NodeOutcomeVariable><NodeRef dir="child">COMMAND__10</NodeRef></NodeOutcomeVariable><NodeOutcomeValue>FAILURE</NodeOutcomeValue></EQInternal><EQInternal><NodeStateVariable><NodeRef dir="child">COMMAND__10</NodeRef></NodeStateVariable><NodeStateValue>FINISHED</NodeStateValue></EQInternal></AND><AND><EQInternal><NodeOutcomeVariable><NodeRef dir="child">ASSIGNMENT__11</NodeRef></NodeOutcomeVariable><NodeOutcomeValue>FAILURE</NodeOutcomeValue></EQInternal><EQInternal><NodeStateVariable><NodeRef dir="child">ASSIGNMENT__11</NodeRef></NodeStateVariable><NodeStateValue>FINISHED</NodeStateValue></EQInternal></AND></OR></NOT></InvariantCondition><StartCondition><EQInternal><NodeOutcomeVariable><NodeRef dir="sibling">ep2cp_IfTest</NodeRef></NodeOutcomeVariable><NodeOutcomeValue>SUCCESS</NodeOutcomeValue></EQInternal></StartCondition><SkipCondition><EQInternal><NodeFailureVariable><NodeRef dir="sibling">ep2cp_IfTest</NodeRef></NodeFailureVariable><NodeFailureValue>POST_CONDITION_FAILED</NodeFailureValue></EQInternal></SkipCondition><NodeBody><NodeList><Node NodeType="Command" LineNo="122" ColNo="3"><NodeId>COMMAND__10</NodeId><NodeBody><Command><Name><StringValue>pprint</StringValue></Name><Arguments LineNo="123" ColNo="10"><StringValue>Successfully arrived at A and Science has been performed</StringValue></Arguments></Command></NodeBody></Node><Node NodeType="Assignment" LineNo="124" ColNo="3"><NodeId>ASSIGNMENT__11</NodeId><StartCondition><EQInternal><NodeStateVariable><NodeRef dir="sibling">COMMAND__10</NodeRef></NodeStateVariable><NodeStateValue>FINISHED</NodeStateValue></EQInternal></StartCondition><NodeBody><Assignment><BooleanVariable>A_Complete</BooleanVariable><BooleanRHS><BooleanValue>true</BooleanValue></BooleanRHS></Assignment></NodeBody></Node></NodeList></NodeBody></Node><Node NodeType="Command" epx="Else" LineNo="127" ColNo="3"><NodeId>COMMAND__13</NodeId><StartCondition><EQInternal><NodeFailureVariable><NodeRef dir="sibling">ep2cp_IfTest</NodeRef></NodeFailureVariable><NodeFailureValue>POST_CONDITION_FAILED</NodeFailureValue></EQInternal></StartCondition><SkipCondition><EQInternal><NodeOutcomeVariable><NodeRef dir="sibling">ep2cp_IfTest</NodeRef></NodeOutcomeVariable><NodeOutcomeValue>SUCCESS</NodeOutcomeValue></EQInternal></SkipCondition><NodeBody><Command><Name><StringValue>pprint</StringValue></Name><Arguments LineNo="128" ColNo="10"><StringValue>Flight to A has FAILED</StringValue></Arguments></Command></NodeBody></Node></NodeList></NodeBody></Node></NodeList></NodeBody></Node><Node NodeType="NodeList" epx="Sequence" LineNo="136" ColNo="2"><NodeId>Execute_B</NodeId><VariableDeclarations><DeclareVariable LineNo="135" ColNo="2"><Name>Fly2B_Success</Name><Type>Boolean</Type></DeclareVariable></VariableDeclarations><StartCondition><EQInternal><NodeStateVariable><NodeRef dir="sibling">Execute_A</NodeRef></NodeStateVariable><NodeStateValue>FINISHED</NodeStateValue></EQInternal></StartCondition><PostCondition><EQInternal><NodeOutcomeVariable><NodeId>Command_Fly2B</NodeId></NodeOutcomeVariable><NodeOutcomeValue>SUCCESS</NodeOutcomeValue></EQInternal></PostCondition><InvariantCondition><NOT><OR><AND><EQInternal><NodeOutcomeVariable><NodeRef dir="child">Set_WaypointB</NodeRef></NodeOutcomeVariable><NodeOutcomeValue>FAILURE</NodeOutcomeValue></EQInternal><EQInternal><NodeStateVariable><NodeRef dir="child">Set_WaypointB</NodeRef></NodeStateVariable><NodeStateValue>FINISHED</NodeStateValue></EQInternal></AND><AND><EQInternal><NodeOutcomeVariable><NodeRef dir="child">Command_Fly2B</NodeRef></NodeOutcomeVariable><NodeOutcomeValue>FAILURE</NodeOutcomeValue></EQInternal><EQInternal><NodeStateVariable><NodeRef dir="child">Command_Fly2B</NodeRef></NodeStateVariable><NodeStateValue>FINISHED</NodeStateValue></EQInternal></AND><AND><EQInternal><NodeOutcomeVariable><NodeRef dir="child">if__17</NodeRef></NodeOutcomeVariable><NodeOutcomeValue>FAILURE</NodeOutcomeValue></EQInternal><EQInternal><NodeStateVariable><NodeRef dir="child">if__17</NodeRef></NodeStateVariable><NodeStateValue>FINISHED</NodeStateValue></EQInternal></AND></OR></NOT></InvariantCondition><NodeBody><NodeList><Node NodeType="NodeList" epx="Sequence" LineNo="142" ColNo="3"><NodeId>Set_WaypointB</NodeId><VariableDeclarations><DeclareVariable LineNo="141" ColNo="3"><Name>WaypointSet</Name><Type>Boolean</Type></DeclareVariable></VariableDeclarations><PostCondition><BooleanVariable>WaypointSet</BooleanVariable></PostCondition><InvariantCondition><NOT><OR><AND><EQInternal><NodeOutcomeVariable><NodeRef dir="child">COMMAND__14</NodeRef></NodeOutcomeVariable><NodeOutcomeValue>FAILURE</NodeOutcomeValue></EQInternal><EQInternal><NodeStateVariable><NodeRef dir="child">COMMAND__14</NodeRef></NodeStateVariable><NodeStateValue>FINISHED</NodeStateValue></EQInternal></AND><AND><EQInternal><NodeOutcomeVariable><NodeRef dir="child">COMMAND__15</NodeRef></NodeOutcomeVariable><NodeOutcomeValue>FAILURE</NodeOutcomeValue></EQInternal><EQInternal><NodeStateVariable><NodeRef dir="child">COMMAND__15</NodeRef></NodeStateVariable><NodeStateValue>FINISHED</NodeStateValue></EQInternal></AND></OR></NOT></InvariantCondition><NodeBody><NodeList><Node NodeType="Command" LineNo="145" ColNo="3"><NodeId>COMMAND__14</NodeId><NodeBody><Command><Name><StringValue>UpdateWaypoint</StringValue></Name><Arguments LineNo="146" ColNo="18"><StringValue>UpdateWaypoint</StringValue><RealVariable>xWaypoint_B</RealVariable><RealVariable>yWaypoint_B</RealVariable><RealVariable>zWaypoint_B</RealVariable><StringValue>B</StringValue></Arguments></Command></NodeBody></Node><Node NodeType="Command" LineNo="146" ColNo="3"><NodeId>COMMAND__15</NodeId><StartCondition><EQInternal><NodeStateVariable><NodeRef dir="sibling">COMMAND__14</NodeRef></NodeStateVariable><NodeStateValue>FINISHED</NodeStateValue></EQInternal></StartCondition><NodeBody><Command><Name><StringValue>pprint</StringValue></Name><Arguments LineNo="147" ColNo="10"><StringValue>Waypoint B is located at: x =</StringValue><RealVariable>xWaypoint_B</RealVariable><StringValue>y =</StringValue><RealVariable>yWaypoint_B</RealVariable><StringValue>z =</StringValue><RealVariable>zWaypoint_B</RealVariable></Arguments></Command></NodeBody></Node></NodeList></NodeBody></Node><Node NodeType="Command" LineNo="156" ColNo="3"><NodeId>Command_Fly2B</NodeId><StartCondition><AND><EQInternal><NodeStateVariable><NodeRef dir="sibling">Set_WaypointB</NodeRef></NodeStateVariable><NodeStateValue>FINISHED</NodeStateValue></EQInternal><EQInternal><NodeStateVariable><NodeId>Set_WaypointB</NodeId></NodeStateVariable><NodeStateValue>FINISHED</NodeStateValue></EQInternal></AND></StartCondition><PostCondition><BooleanVariable>Fly2B_Success</BooleanVariable></PostCondition><NodeBody><Command><Name><StringValue>Fly2B</StringValue></Name></Command></NodeBody></Node><Node NodeType="NodeList" epx="If" LineNo="160" ColNo="2"><NodeId>if__17</NodeId><StartCondition><EQInternal><NodeStateVariable><NodeRef dir="sibling">Command_Fly2B</NodeRef></NodeStateVariable><NodeStateValue>FINISHED</NodeStateValue></EQInternal></StartCondition><NodeBody><NodeList><Node NodeType="Empty" epx="Condition"><NodeId>ep2cp_IfTest</NodeId><PostCondition><BooleanVariable>Fly2B_Success</BooleanVariable></PostCondition></Node><Node NodeType="NodeList" epx="Then" LineNo="162" ColNo="3"><NodeId>BLOCK__18</NodeId><InvariantCondition><NOT><OR><AND><EQInternal><NodeOutcomeVariable><NodeRef dir="child">COMMAND__19</NodeRef></NodeOutcomeVariable><NodeOutcomeValue>FAILURE</NodeOutcomeValue></EQInternal><EQInternal><NodeStateVariable><NodeRef dir="child">COMMAND__19</NodeRef></NodeStateVariable><NodeStateValue>FINISHED</NodeStateValue></EQInternal></AND><AND><EQInternal><NodeOutcomeVariable><NodeRef dir="child">ASSIGNMENT__20</NodeRef></NodeOutcomeVariable><NodeOutcomeValue>FAILURE</NodeOutcomeValue></EQInternal><EQInternal><NodeStateVariable><NodeRef dir="child">ASSIGNMENT__20</NodeRef></NodeStateVariable><NodeStateValue>FINISHED</NodeStateValue></EQInternal></AND></OR></NOT></InvariantCondition><StartCondition><EQInternal><NodeOutcomeVariable><NodeRef dir="sibling">ep2cp_IfTest</NodeRef></NodeOutcomeVariable><NodeOutcomeValue>SUCCESS</NodeOutcomeValue></EQInternal></StartCondition><SkipCondition><EQInternal><NodeFailureVariable><NodeRef dir="sibling">ep2cp_IfTest</NodeRef></NodeFailureVariable><NodeFailureValue>POST_CONDITION_FAILED</NodeFailureValue></EQInternal></SkipCondition><NodeBody><NodeList><Node NodeType="Command" LineNo="161" ColNo="3"><NodeId>COMMAND__19</NodeId><NodeBody><Command><Name><StringValue>pprint</StringValue></Name><Arguments LineNo="162" ColNo="10"><StringValue>Successfully arrived at B and Science has been performed</StringValue></Arguments></Command></NodeBody></Node><Node NodeType="Assignment" LineNo="163" ColNo="3"><NodeId>ASSIGNMENT__20</NodeId><StartCondition><EQInternal><NodeStateVariable><NodeRef dir="sibling">COMMAND__19</NodeRef></NodeStateVariable><NodeStateValue>FINISHED</NodeStateValue></EQInternal></StartCondition><NodeBody><Assignment><BooleanVariable>B_Complete</BooleanVariable><BooleanRHS><BooleanValue>true</BooleanValue></BooleanRHS></Assignment></NodeBody></Node></NodeList></NodeBody></Node><Node NodeType="Command" epx="Else" LineNo="166" ColNo="3"><NodeId>COMMAND__22</NodeId><StartCondition><EQInternal><NodeFailureVariable><NodeRef dir="sibling">ep2cp_IfTest</NodeRef></NodeFailureVariable><NodeFailureValue>POST_CONDITION_FAILED</NodeFailureValue></EQInternal></StartCondition><SkipCondition><EQInternal><NodeOutcomeVariable><NodeRef dir="sibling">ep2cp_IfTest</NodeRef></NodeOutcomeVariable><NodeOutcomeValue>SUCCESS</NodeOutcomeValue></EQInternal></SkipCondition><NodeBody><Command><Name><StringValue>pprint</StringValue></Name><Arguments LineNo="167" ColNo="10"><StringValue>Flight to B has FAILED</StringValue></Arguments></Command></NodeBody></Node></NodeList></NodeBody></Node></NodeList></NodeBody></Node></NodeList></NodeBody></Node></PlexilPlan>