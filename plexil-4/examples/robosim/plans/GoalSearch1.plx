<?xml version="1.0" encoding="UTF-8"?><PlexilPlan xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:tr="extended-plexil-translator" FileName="plans/GoalSearch1.ple"><GlobalDeclarations LineNo="34" ColNo="8"><CommandDeclaration LineNo="34" ColNo="8"><Name>QueryGoalSensor</Name><Return><Name>_return_0</Name><Type>Real</Type><MaxSize>5</MaxSize></Return><Parameter><Name>name</Name><Type>String</Type></Parameter></CommandDeclaration><CommandDeclaration LineNo="35" ColNo="11"><Name>QueryVisibilitySensor</Name><Return><Name>_return_0</Name><Type>Integer</Type><MaxSize>4</MaxSize></Return><Parameter><Name>name</Name><Type>String</Type></Parameter></CommandDeclaration><CommandDeclaration LineNo="36" ColNo="8"><Name>Move</Name><Return><Name>_return_0</Name><Type>Integer</Type></Return><Parameter><Name>name</Name><Type>String</Type></Parameter><Parameter><Name>direction</Name><Type>Integer</Type></Parameter></CommandDeclaration><CommandDeclaration LineNo="37" ColNo="0"><Name>pprint</Name></CommandDeclaration></GlobalDeclarations><Node NodeType="NodeList" epx="Sequence" LineNo="41" ColNo="1"><NodeId>GoalSearch</NodeId><VariableDeclarations><DeclareVariable LineNo="40" ColNo="1"><Name>RobotName</Name><Type>String</Type><InitialValue><StringValue>RobotYellow</StringValue></InitialValue></DeclareVariable><DeclareVariable LineNo="41" ColNo="4"><Name>AtGoal</Name><Type>Boolean</Type><InitialValue><BooleanValue>false</BooleanValue></InitialValue></DeclareVariable><DeclareVariable LineNo="42" ColNo="4"><Name>Stuck</Name><Type>Boolean</Type><InitialValue><BooleanValue>false</BooleanValue></InitialValue></DeclareVariable></VariableDeclarations><InvariantCondition><NOT><OR><AND><EQInternal><NodeOutcomeVariable><NodeRef dir="child">while__0</NodeRef></NodeOutcomeVariable><NodeOutcomeValue>FAILURE</NodeOutcomeValue></EQInternal><EQInternal><NodeStateVariable><NodeRef dir="child">while__0</NodeRef></NodeStateVariable><NodeStateValue>FINISHED</NodeStateValue></EQInternal></AND><AND><EQInternal><NodeOutcomeVariable><NodeRef dir="child">if__41</NodeRef></NodeOutcomeVariable><NodeOutcomeValue>FAILURE</NodeOutcomeValue></EQInternal><EQInternal><NodeStateVariable><NodeRef dir="child">if__41</NodeRef></NodeStateVariable><NodeStateValue>FINISHED</NodeStateValue></EQInternal></AND></OR></NOT></InvariantCondition><NodeBody><NodeList><Node NodeType="NodeList" epx="While" LineNo="44" ColNo="1"><NodeId>while__0</NodeId><RepeatCondition><EQInternal><NodeOutcomeVariable><NodeRef dir="child">ep2cp_WhileTest</NodeRef></NodeOutcomeVariable><NodeOutcomeValue>SUCCESS</NodeOutcomeValue></EQInternal></RepeatCondition><NodeBody><NodeList><Node NodeType="Empty" epx="Condition"><NodeId>ep2cp_WhileTest</NodeId><PostCondition><AND><NOT><BooleanVariable>AtGoal</BooleanVariable></NOT><NOT><BooleanVariable>Stuck</BooleanVariable></NOT></AND></PostCondition></Node><Node NodeType="NodeList" epx="Action" LineNo="45" ColNo="8"><NodeId>BLOCK__1</NodeId><VariableDeclarations><DeclareArray LineNo="44" ColNo="8"><Name>RobotGoal</Name><Type>Real</Type><MaxSize>5</MaxSize></DeclareArray></VariableDeclarations><InvariantCondition><NOT><OR><AND><EQInternal><NodeOutcomeVariable><NodeRef dir="child">COMMAND__2</NodeRef></NodeOutcomeVariable><NodeOutcomeValue>FAILURE</NodeOutcomeValue></EQInternal><EQInternal><NodeStateVariable><NodeRef dir="child">COMMAND__2</NodeRef></NodeStateVariable><NodeStateValue>FINISHED</NodeStateValue></EQInternal></AND><AND><EQInternal><NodeOutcomeVariable><NodeRef dir="child">ReadGoalSensors</NodeRef></NodeOutcomeVariable><NodeOutcomeValue>FAILURE</NodeOutcomeValue></EQInternal><EQInternal><NodeStateVariable><NodeRef dir="child">ReadGoalSensors</NodeRef></NodeStateVariable><NodeStateValue>FINISHED</NodeStateValue></EQInternal></AND><AND><EQInternal><NodeOutcomeVariable><NodeRef dir="child">CheckGoal</NodeRef></NodeOutcomeVariable><NodeOutcomeValue>FAILURE</NodeOutcomeValue></EQInternal><EQInternal><NodeStateVariable><NodeRef dir="child">CheckGoal</NodeRef></NodeStateVariable><NodeStateValue>FINISHED</NodeStateValue></EQInternal></AND><AND><EQInternal><NodeOutcomeVariable><NodeRef dir="child">if__7</NodeRef></NodeOutcomeVariable><NodeOutcomeValue>FAILURE</NodeOutcomeValue></EQInternal><EQInternal><NodeStateVariable><NodeRef dir="child">if__7</NodeRef></NodeStateVariable><NodeStateValue>FINISHED</NodeStateValue></EQInternal></AND></OR></NOT></InvariantCondition><StartCondition><EQInternal><NodeOutcomeVariable><NodeRef dir="sibling">ep2cp_WhileTest</NodeRef></NodeOutcomeVariable><NodeOutcomeValue>SUCCESS</NodeOutcomeValue></EQInternal></StartCondition><SkipCondition><AND><EQInternal><NodeStateVariable><NodeRef dir="sibling">ep2cp_WhileTest</NodeRef></NodeStateVariable><NodeStateValue>FINISHED</NodeStateValue></EQInternal><EQInternal><NodeFailureVariable><NodeRef dir="sibling">ep2cp_WhileTest</NodeRef></NodeFailureVariable><NodeFailureValue>POST_CONDITION_FAILED</NodeFailureValue></EQInternal></AND></SkipCondition><NodeBody><NodeList><Node NodeType="Command" LineNo="46" ColNo="8"><NodeId>COMMAND__2</NodeId><NodeBody><Command><Name><StringValue>pprint</StringValue></Name><Arguments LineNo="47" ColNo="15"><StringValue>Read goal sensors</StringValue></Arguments></Command></NodeBody></Node><Node NodeType="Command" LineNo="51" ColNo="15"><NodeId>ReadGoalSensors</NodeId><StartCondition><EQInternal><NodeStateVariable><NodeRef dir="sibling">COMMAND__2</NodeRef></NodeStateVariable><NodeStateValue>FINISHED</NodeStateValue></EQInternal></StartCondition><EndCondition><IsKnown><ArrayElement><ArrayVariable>RobotGoal</ArrayVariable><Index><IntegerValue>0</IntegerValue></Index></ArrayElement></IsKnown></EndCondition><NodeBody><Command><ArrayVariable>RobotGoal</ArrayVariable><Name><StringValue>QueryGoalSensor</StringValue></Name><Arguments LineNo="52" ColNo="31"><StringVariable>RobotName</StringVariable></Arguments></Command></NodeBody></Node><Node NodeType="NodeList" epx="If" LineNo="56" ColNo="8"><NodeId>CheckGoal</NodeId><StartCondition><EQInternal><NodeStateVariable><NodeRef dir="sibling">ReadGoalSensors</NodeRef></NodeStateVariable><NodeStateValue>FINISHED</NodeStateValue></EQInternal></StartCondition><NodeBody><NodeList><Node NodeType="Empty" epx="Condition"><NodeId>ep2cp_IfTest</NodeId><PostCondition><EQNumeric><ArrayElement><ArrayVariable>RobotGoal</ArrayVariable><Index><IntegerValue>4</IntegerValue></Index></ArrayElement><IntegerValue>1</IntegerValue></EQNumeric></PostCondition></Node><Node NodeType="NodeList" epx="Then" LineNo="57" ColNo="12"><NodeId>BLOCK__4</NodeId><InvariantCondition><NOT><OR><AND><EQInternal><NodeOutcomeVariable><NodeRef dir="child">COMMAND__5</NodeRef></NodeOutcomeVariable><NodeOutcomeValue>FAILURE</NodeOutcomeValue></EQInternal><EQInternal><NodeStateVariable><NodeRef dir="child">COMMAND__5</NodeRef></NodeStateVariable><NodeStateValue>FINISHED</NodeStateValue></EQInternal></AND><AND><EQInternal><NodeOutcomeVariable><NodeRef dir="child">ASSIGNMENT__6</NodeRef></NodeOutcomeVariable><NodeOutcomeValue>FAILURE</NodeOutcomeValue></EQInternal><EQInternal><NodeStateVariable><NodeRef dir="child">ASSIGNMENT__6</NodeRef></NodeStateVariable><NodeStateValue>FINISHED</NodeStateValue></EQInternal></AND></OR></NOT></InvariantCondition><StartCondition><EQInternal><NodeOutcomeVariable><NodeRef dir="sibling">ep2cp_IfTest</NodeRef></NodeOutcomeVariable><NodeOutcomeValue>SUCCESS</NodeOutcomeValue></EQInternal></StartCondition><SkipCondition><EQInternal><NodeFailureVariable><NodeRef dir="sibling">ep2cp_IfTest</NodeRef></NodeFailureVariable><NodeFailureValue>POST_CONDITION_FAILED</NodeFailureValue></EQInternal></SkipCondition><NodeBody><NodeList><Node NodeType="Command" LineNo="56" ColNo="12"><NodeId>COMMAND__5</NodeId><NodeBody><Command><Name><StringValue>pprint</StringValue></Name><Arguments LineNo="57" ColNo="19"><StringValue>Reached goal</StringValue></Arguments></Command></NodeBody></Node><Node NodeType="Assignment" LineNo="58" ColNo="12"><NodeId>ASSIGNMENT__6</NodeId><StartCondition><EQInternal><NodeStateVariable><NodeRef dir="sibling">COMMAND__5</NodeRef></NodeStateVariable><NodeStateValue>FINISHED</NodeStateValue></EQInternal></StartCondition><NodeBody><Assignment><BooleanVariable>AtGoal</BooleanVariable><BooleanRHS><BooleanValue>true</BooleanValue></BooleanRHS></Assignment></NodeBody></Node></NodeList></NodeBody></Node></NodeList></NodeBody></Node><Node NodeType="NodeList" epx="If" LineNo="62" ColNo="8"><NodeId>if__7</NodeId><StartCondition><EQInternal><NodeStateVariable><NodeRef dir="sibling">CheckGoal</NodeRef></NodeStateVariable><NodeStateValue>FINISHED</NodeStateValue></EQInternal></StartCondition><NodeBody><NodeList><Node NodeType="Empty" epx="Condition"><NodeId>ep2cp_IfTest</NodeId><PostCondition><NOT><BooleanVariable>AtGoal</BooleanVariable></NOT></PostCondition></Node><Node NodeType="NodeList" epx="Then" LineNo="63" ColNo="12"><NodeId>BLOCK__8</NodeId><VariableDeclarations><DeclareArray LineNo="62" ColNo="12"><Name>RobotVisibility</Name><Type>Integer</Type><MaxSize>4</MaxSize></DeclareArray><DeclareVariable LineNo="65" ColNo="12"><Name>Direction</Name><Type>Integer</Type><InitialValue><IntegerValue>-1</IntegerValue></InitialValue></DeclareVariable></VariableDeclarations><InvariantCondition><NOT><OR><AND><EQInternal><NodeOutcomeVariable><NodeRef dir="child">COMMAND__9</NodeRef></NodeOutcomeVariable><NodeOutcomeValue>FAILURE</NodeOutcomeValue></EQInternal><EQInternal><NodeStateVariable><NodeRef dir="child">COMMAND__9</NodeRef></NodeStateVariable><NodeStateValue>FINISHED</NodeStateValue></EQInternal></AND><AND><EQInternal><NodeOutcomeVariable><NodeRef dir="child">ReadVisibility</NodeRef></NodeOutcomeVariable><NodeOutcomeValue>FAILURE</NodeOutcomeValue></EQInternal><EQInternal><NodeStateVariable><NodeRef dir="child">ReadVisibility</NodeRef></NodeStateVariable><NodeStateValue>FINISHED</NodeStateValue></EQInternal></AND><AND><EQInternal><NodeOutcomeVariable><NodeRef dir="child">CompareSensors</NodeRef></NodeOutcomeVariable><NodeOutcomeValue>FAILURE</NodeOutcomeValue></EQInternal><EQInternal><NodeStateVariable><NodeRef dir="child">CompareSensors</NodeRef></NodeStateVariable><NodeStateValue>FINISHED</NodeStateValue></EQInternal></AND><AND><EQInternal><NodeOutcomeVariable><NodeRef dir="child">Move</NodeRef></NodeOutcomeVariable><NodeOutcomeValue>FAILURE</NodeOutcomeValue></EQInternal><EQInternal><NodeStateVariable><NodeRef dir="child">Move</NodeRef></NodeStateVariable><NodeStateValue>FINISHED</NodeStateValue></EQInternal></AND><AND><EQInternal><NodeOutcomeVariable><NodeRef dir="child">COMMAND__40</NodeRef></NodeOutcomeVariable><NodeOutcomeValue>FAILURE</NodeOutcomeValue></EQInternal><EQInternal><NodeStateVariable><NodeRef dir="child">COMMAND__40</NodeRef></NodeStateVariable><NodeStateValue>FINISHED</NodeStateValue></EQInternal></AND></OR></NOT></InvariantCondition><StartCondition><EQInternal><NodeOutcomeVariable><NodeRef dir="sibling">ep2cp_IfTest</NodeRef></NodeOutcomeVariable><NodeOutcomeValue>SUCCESS</NodeOutcomeValue></EQInternal></StartCondition><SkipCondition><EQInternal><NodeFailureVariable><NodeRef dir="sibling">ep2cp_IfTest</NodeRef></NodeFailureVariable><NodeFailureValue>POST_CONDITION_FAILED</NodeFailureValue></EQInternal></SkipCondition><NodeBody><NodeList><Node NodeType="Command" LineNo="67" ColNo="12"><NodeId>COMMAND__9</NodeId><NodeBody><Command><Name><StringValue>pprint</StringValue></Name><Arguments LineNo="68" ColNo="19"><StringValue>Read visibility sensors</StringValue></Arguments></Command></NodeBody></Node><Node NodeType="Command" LineNo="71" ColNo="34"><NodeId>ReadVisibility</NodeId><StartCondition><EQInternal><NodeStateVariable><NodeRef dir="sibling">COMMAND__9</NodeRef></NodeStateVariable><NodeStateValue>FINISHED</NodeStateValue></EQInternal></StartCondition><EndCondition><IsKnown><ArrayElement><ArrayVariable>RobotVisibility</ArrayVariable><Index><IntegerValue>0</IntegerValue></Index></ArrayElement></IsKnown></EndCondition><NodeBody><Command><ArrayVariable>RobotVisibility</ArrayVariable><Name><StringValue>QueryVisibilitySensor</StringValue></Name><Arguments LineNo="72" ColNo="56"><StringVariable>RobotName</StringVariable></Arguments></Command></NodeBody></Node><Node NodeType="NodeList" epx="Sequence" LineNo="77" ColNo="16"><NodeId>CompareSensors</NodeId><VariableDeclarations><DeclareVariable LineNo="76" ColNo="16"><Name>HighestSensorVal</Name><Type>Real</Type></DeclareVariable></VariableDeclarations><StartCondition><EQInternal><NodeStateVariable><NodeRef dir="sibling">ReadVisibility</NodeRef></NodeStateVariable><NodeStateValue>FINISHED</NodeStateValue></EQInternal></StartCondition><InvariantCondition><NOT><OR><AND><EQInternal><NodeOutcomeVariable><NodeRef dir="child">ASSIGNMENT__11</NodeRef></NodeOutcomeVariable><NodeOutcomeValue>FAILURE</NodeOutcomeValue></EQInternal><EQInternal><NodeStateVariable><NodeRef dir="child">ASSIGNMENT__11</NodeRef></NodeStateVariable><NodeStateValue>FINISHED</NodeStateValue></EQInternal></AND><AND><EQInternal><NodeOutcomeVariable><NodeRef dir="child">for__12</NodeRef></NodeOutcomeVariable><NodeOutcomeValue>FAILURE</NodeOutcomeValue></EQInternal><EQInternal><NodeStateVariable><NodeRef dir="child">for__12</NodeRef></NodeStateVariable><NodeStateValue>FINISHED</NodeStateValue></EQInternal></AND><AND><EQInternal><NodeOutcomeVariable><NodeRef dir="child">COMMAND__18</NodeRef></NodeOutcomeVariable><NodeOutcomeValue>FAILURE</NodeOutcomeValue></EQInternal><EQInternal><NodeStateVariable><NodeRef dir="child">COMMAND__18</NodeRef></NodeStateVariable><NodeStateValue>FINISHED</NodeStateValue></EQInternal></AND></OR></NOT></InvariantCondition><NodeBody><NodeList><Node NodeType="Assignment" LineNo="78" ColNo="16"><NodeId>ASSIGNMENT__11</NodeId><NodeBody><Assignment><RealVariable>HighestSensorVal</RealVariable><NumericRHS><ArrayElement><ArrayVariable>RobotGoal</ArrayVariable><Index><IntegerValue>4</IntegerValue></Index></ArrayElement></NumericRHS></Assignment></NodeBody></Node><Node NodeType="NodeList" epx="For" LineNo="82" ColNo="16"><NodeId>for__12</NodeId><VariableDeclarations><DeclareVariable LineNo="81" ColNo="21"><Name>i</Name><Type>Integer</Type><InitialValue><IntegerValue>0</IntegerValue></InitialValue></DeclareVariable></VariableDeclarations><StartCondition><EQInternal><NodeStateVariable><NodeRef dir="sibling">ASSIGNMENT__11</NodeRef></NodeStateVariable><NodeStateValue>FINISHED</NodeStateValue></EQInternal></StartCondition><NodeBody><NodeList><Node NodeType="NodeList" epx="aux"><NodeId>ep2cp_ForLoop</NodeId><SkipCondition><NOT><LT><IntegerVariable>i</IntegerVariable><IntegerValue>4</IntegerValue></LT></NOT></SkipCondition><RepeatCondition><BooleanValue>true</BooleanValue></RepeatCondition><NodeBody><NodeList><Node NodeType="NodeList" epx="If" LineNo="83" ColNo="20"><NodeId>if__14</NodeId><NodeBody><NodeList><Node NodeType="Empty" epx="Condition"><NodeId>ep2cp_IfTest</NodeId><PostCondition><LT><RealVariable>HighestSensorVal</RealVariable><ArrayElement><ArrayVariable>RobotGoal</ArrayVariable><Index><IntegerVariable>i</IntegerVariable></Index></ArrayElement></LT></PostCondition></Node><Node NodeType="NodeList" epx="Then" LineNo="84" ColNo="24"><NodeId>BLOCK__15</NodeId><InvariantCondition><NOT><OR><AND><EQInternal><NodeOutcomeVariable><NodeRef dir="child">ASSIGNMENT__16</NodeRef></NodeOutcomeVariable><NodeOutcomeValue>FAILURE</NodeOutcomeValue></EQInternal><EQInternal><NodeStateVariable><NodeRef dir="child">ASSIGNMENT__16</NodeRef></NodeStateVariable><NodeStateValue>FINISHED</NodeStateValue></EQInternal></AND><AND><EQInternal><NodeOutcomeVariable><NodeRef dir="child">ASSIGNMENT__17</NodeRef></NodeOutcomeVariable><NodeOutcomeValue>FAILURE</NodeOutcomeValue></EQInternal><EQInternal><NodeStateVariable><NodeRef dir="child">ASSIGNMENT__17</NodeRef></NodeStateVariable><NodeStateValue>FINISHED</NodeStateValue></EQInternal></AND></OR></NOT></InvariantCondition><StartCondition><EQInternal><NodeOutcomeVariable><NodeRef dir="sibling">ep2cp_IfTest</NodeRef></NodeOutcomeVariable><NodeOutcomeValue>SUCCESS</NodeOutcomeValue></EQInternal></StartCondition><SkipCondition><EQInternal><NodeFailureVariable><NodeRef dir="sibling">ep2cp_IfTest</NodeRef></NodeFailureVariable><NodeFailureValue>POST_CONDITION_FAILED</NodeFailureValue></EQInternal></SkipCondition><NodeBody><NodeList><Node NodeType="Assignment" LineNo="84" ColNo="24"><NodeId>ASSIGNMENT__16</NodeId><NodeBody><Assignment><RealVariable>HighestSensorVal</RealVariable><NumericRHS><ArrayElement><ArrayVariable>RobotGoal</ArrayVariable><Index><IntegerVariable>i</IntegerVariable></Index></ArrayElement></NumericRHS></Assignment></NodeBody></Node><Node NodeType="Assignment" LineNo="85" ColNo="24"><NodeId>ASSIGNMENT__17</NodeId><StartCondition><EQInternal><NodeStateVariable><NodeRef dir="sibling">ASSIGNMENT__16</NodeRef></NodeStateVariable><NodeStateValue>FINISHED</NodeStateValue></EQInternal></StartCondition><NodeBody><Assignment><IntegerVariable>Direction</IntegerVariable><NumericRHS><IntegerVariable>i</IntegerVariable></NumericRHS></Assignment></NodeBody></Node></NodeList></NodeBody></Node></NodeList></NodeBody></Node><Node NodeType="Assignment" epx="LoopVariableUpdate"><NodeId>ep2cp_ForLoopUpdater</NodeId><StartCondition><EQInternal><NodeStateVariable><NodeRef dir="sibling">if__14</NodeRef></NodeStateVariable><NodeStateValue>FINISHED</NodeStateValue></EQInternal></StartCondition><NodeBody><Assignment><IntegerVariable>i</IntegerVariable><NumericRHS><ADD LineNo="82" ColNo="45"><IntegerVariable>i</IntegerVariable><IntegerValue>1</IntegerValue></ADD></NumericRHS></Assignment></NodeBody></Node></NodeList></NodeBody></Node></NodeList></NodeBody></Node><Node NodeType="Command" LineNo="88" ColNo="16"><NodeId>COMMAND__18</NodeId><StartCondition><EQInternal><NodeStateVariable><NodeRef dir="sibling">for__12</NodeRef></NodeStateVariable><NodeStateValue>FINISHED</NodeStateValue></EQInternal></StartCondition><NodeBody><Command><Name><StringValue>pprint</StringValue></Name><Arguments LineNo="89" ColNo="23"><StringValue>Goal signal strongest in direction </StringValue><IntegerVariable>Direction</IntegerVariable></Arguments></Command></NodeBody></Node></NodeList></NodeBody></Node><Node NodeType="NodeList" epx="Sequence" LineNo="94" ColNo="16"><NodeId>Move</NodeId><VariableDeclarations><DeclareVariable LineNo="93" ColNo="16"><Name>Result</Name><Type>Integer</Type></DeclareVariable></VariableDeclarations><StartCondition><EQInternal><NodeStateVariable><NodeRef dir="sibling">CompareSensors</NodeRef></NodeStateVariable><NodeStateValue>FINISHED</NodeStateValue></EQInternal></StartCondition><EndCondition><IsKnown><IntegerVariable>Result</IntegerVariable></IsKnown></EndCondition><InvariantCondition><NOT><AND><EQInternal><NodeOutcomeVariable><NodeRef dir="child">if__19</NodeRef></NodeOutcomeVariable><NodeOutcomeValue>FAILURE</NodeOutcomeValue></EQInternal><EQInternal><NodeStateVariable><NodeRef dir="child">if__19</NodeRef></NodeStateVariable><NodeStateValue>FINISHED</NodeStateValue></EQInternal></AND></NOT></InvariantCondition><NodeBody><NodeList><Node NodeType="NodeList" epx="If" LineNo="97" ColNo="16"><NodeId>if__19</NodeId><NodeBody><NodeList><Node NodeType="Empty" epx="Condition"><NodeId>ep2cp_IfTest</NodeId><PostCondition><EQNumeric><IntegerVariable>Direction</IntegerVariable><IntegerValue>-1</IntegerValue></EQNumeric></PostCondition></Node><Node NodeType="NodeList" epx="Then" LineNo="98" ColNo="20"><NodeId>BLOCK__20</NodeId><InvariantCondition><NOT><OR><AND><EQInternal><NodeOutcomeVariable><NodeRef dir="child">COMMAND__21</NodeRef></NodeOutcomeVariable><NodeOutcomeValue>FAILURE</NodeOutcomeValue></EQInternal><EQInternal><NodeStateVariable><NodeRef dir="child">COMMAND__21</NodeRef></NodeStateVariable><NodeStateValue>FINISHED</NodeStateValue></EQInternal></AND><AND><EQInternal><NodeOutcomeVariable><NodeRef dir="child">ASSIGNMENT__22</NodeRef></NodeOutcomeVariable><NodeOutcomeValue>FAILURE</NodeOutcomeValue></EQInternal><EQInternal><NodeStateVariable><NodeRef dir="child">ASSIGNMENT__22</NodeRef></NodeStateVariable><NodeStateValue>FINISHED</NodeStateValue></EQInternal></AND><AND><EQInternal><NodeOutcomeVariable><NodeRef dir="child">ASSIGNMENT__23</NodeRef></NodeOutcomeVariable><NodeOutcomeValue>FAILURE</NodeOutcomeValue></EQInternal><EQInternal><NodeStateVariable><NodeRef dir="child">ASSIGNMENT__23</NodeRef></NodeStateVariable><NodeStateValue>FINISHED</NodeStateValue></EQInternal></AND></OR></NOT></InvariantCondition><StartCondition><EQInternal><NodeOutcomeVariable><NodeRef dir="sibling">ep2cp_IfTest</NodeRef></NodeOutcomeVariable><NodeOutcomeValue>SUCCESS</NodeOutcomeValue></EQInternal></StartCondition><SkipCondition><EQInternal><NodeFailureVariable><NodeRef dir="sibling">ep2cp_IfTest</NodeRef></NodeFailureVariable><NodeFailureValue>POST_CONDITION_FAILED</NodeFailureValue></EQInternal></SkipCondition><NodeBody><NodeList><Node NodeType="Command" LineNo="97" ColNo="20"><NodeId>COMMAND__21</NodeId><NodeBody><Command><Name><StringValue>pprint</StringValue></Name><Arguments LineNo="98" ColNo="27"><StringValue>Can't find a good direction to move</StringValue></Arguments></Command></NodeBody></Node><Node NodeType="Assignment" LineNo="99" ColNo="20"><NodeId>ASSIGNMENT__22</NodeId><StartCondition><EQInternal><NodeStateVariable><NodeRef dir="sibling">COMMAND__21</NodeRef></NodeStateVariable><NodeStateValue>FINISHED</NodeStateValue></EQInternal></StartCondition><NodeBody><Assignment><IntegerVariable>Result</IntegerVariable><NumericRHS><IntegerValue>0</IntegerValue></NumericRHS></Assignment></NodeBody></Node><Node NodeType="Assignment" LineNo="100" ColNo="20"><NodeId>ASSIGNMENT__23</NodeId><StartCondition><EQInternal><NodeStateVariable><NodeRef dir="sibling">ASSIGNMENT__22</NodeRef></NodeStateVariable><NodeStateValue>FINISHED</NodeStateValue></EQInternal></StartCondition><NodeBody><Assignment><BooleanVariable>Stuck</BooleanVariable><BooleanRHS><BooleanValue>true</BooleanValue></BooleanRHS></Assignment></NodeBody></Node></NodeList></NodeBody></Node><Node NodeType="Empty" epx="ElseIf"><NodeId>ep2cp_ElseIf-1</NodeId><StartCondition><EQInternal><NodeFailureVariable><NodeRef dir="sibling">ep2cp_IfTest</NodeRef></NodeFailureVariable><NodeFailureValue>POST_CONDITION_FAILED</NodeFailureValue></EQInternal></StartCondition><SkipCondition><EQInternal><NodeOutcomeVariable><NodeRef dir="sibling">ep2cp_IfTest</NodeRef></NodeOutcomeVariable><NodeOutcomeValue>SUCCESS</NodeOutcomeValue></EQInternal></SkipCondition><PostCondition><EQNumeric><ArrayElement><ArrayVariable>RobotVisibility</ArrayVariable><Index><IntegerVariable>Direction</IntegerVariable></Index></ArrayElement><IntegerValue>0</IntegerValue></EQNumeric></PostCondition></Node><Node NodeType="NodeList" epx="Then" LineNo="104" ColNo="20"><NodeId>BLOCK__24</NodeId><InvariantCondition><NOT><OR><AND><EQInternal><NodeOutcomeVariable><NodeRef dir="child">COMMAND__25</NodeRef></NodeOutcomeVariable><NodeOutcomeValue>FAILURE</NodeOutcomeValue></EQInternal><EQInternal><NodeStateVariable><NodeRef dir="child">COMMAND__25</NodeRef></NodeStateVariable><NodeStateValue>FINISHED</NodeStateValue></EQInternal></AND><AND><EQInternal><NodeOutcomeVariable><NodeRef dir="child">TurnOne</NodeRef></NodeOutcomeVariable><NodeOutcomeValue>FAILURE</NodeOutcomeValue></EQInternal><EQInternal><NodeStateVariable><NodeRef dir="child">TurnOne</NodeRef></NodeStateVariable><NodeStateValue>FINISHED</NodeStateValue></EQInternal></AND><AND><EQInternal><NodeOutcomeVariable><NodeRef dir="child">COMMAND__26</NodeRef></NodeOutcomeVariable><NodeOutcomeValue>FAILURE</NodeOutcomeValue></EQInternal><EQInternal><NodeStateVariable><NodeRef dir="child">COMMAND__26</NodeRef></NodeStateVariable><NodeStateValue>FINISHED</NodeStateValue></EQInternal></AND><AND><EQInternal><NodeOutcomeVariable><NodeRef dir="child">MakeTurnOne</NodeRef></NodeOutcomeVariable><NodeOutcomeValue>FAILURE</NodeOutcomeValue></EQInternal><EQInternal><NodeStateVariable><NodeRef dir="child">MakeTurnOne</NodeRef></NodeStateVariable><NodeStateValue>FINISHED</NodeStateValue></EQInternal></AND><AND><EQInternal><NodeOutcomeVariable><NodeRef dir="child">DecideTurnTwo</NodeRef></NodeOutcomeVariable><NodeOutcomeValue>FAILURE</NodeOutcomeValue></EQInternal><EQInternal><NodeStateVariable><NodeRef dir="child">DecideTurnTwo</NodeRef></NodeStateVariable><NodeStateValue>FINISHED</NodeStateValue></EQInternal></AND><AND><EQInternal><NodeOutcomeVariable><NodeRef dir="child">COMMAND__29</NodeRef></NodeOutcomeVariable><NodeOutcomeValue>FAILURE</NodeOutcomeValue></EQInternal><EQInternal><NodeStateVariable><NodeRef dir="child">COMMAND__29</NodeRef></NodeStateVariable><NodeStateValue>FINISHED</NodeStateValue></EQInternal></AND><AND><EQInternal><NodeOutcomeVariable><NodeRef dir="child">TaketurnTwo</NodeRef></NodeOutcomeVariable><NodeOutcomeValue>FAILURE</NodeOutcomeValue></EQInternal><EQInternal><NodeStateVariable><NodeRef dir="child">TaketurnTwo</NodeRef></NodeStateVariable><NodeStateValue>FINISHED</NodeStateValue></EQInternal></AND></OR></NOT></InvariantCondition><StartCondition><EQInternal><NodeOutcomeVariable><NodeRef dir="sibling">ep2cp_ElseIf-1</NodeRef></NodeOutcomeVariable><NodeOutcomeValue>SUCCESS</NodeOutcomeValue></EQInternal></StartCondition><SkipCondition><NOT><EQInternal><NodeOutcomeVariable><NodeRef dir="sibling">ep2cp_ElseIf-1</NodeRef></NodeOutcomeVariable><NodeOutcomeValue>SUCCESS</NodeOutcomeValue></EQInternal></NOT></SkipCondition><NodeBody><NodeList><Node NodeType="Command" LineNo="103" ColNo="20"><NodeId>COMMAND__25</NodeId><NodeBody><Command><Name><StringValue>pprint</StringValue></Name><Arguments LineNo="104" ColNo="27"><StringValue>Attempting to avoid obstacle by turning clockwise</StringValue></Arguments></Command></NodeBody></Node><Node NodeType="Assignment" LineNo="108" ColNo="20"><NodeId>TurnOne</NodeId><StartCondition><EQInternal><NodeStateVariable><NodeRef dir="sibling">COMMAND__25</NodeRef></NodeStateVariable><NodeStateValue>FINISHED</NodeStateValue></EQInternal></StartCondition><NodeBody><Assignment><IntegerVariable>Direction</IntegerVariable><NumericRHS><MOD LineNo="108" ColNo="48"><ADD LineNo="108" ColNo="43"><IntegerVariable>Direction</IntegerVariable><IntegerValue>1</IntegerValue></ADD><IntegerValue>4</IntegerValue></MOD></NumericRHS></Assignment></NodeBody></Node><Node NodeType="Command" LineNo="109" ColNo="20"><NodeId>COMMAND__26</NodeId><StartCondition><EQInternal><NodeStateVariable><NodeRef dir="sibling">TurnOne</NodeRef></NodeStateVariable><NodeStateValue>FINISHED</NodeStateValue></EQInternal></StartCondition><NodeBody><Command><Name><StringValue>pprint</StringValue></Name><Arguments LineNo="110" ColNo="27"><StringValue>New direction is </StringValue><IntegerVariable>Direction</IntegerVariable></Arguments></Command></NodeBody></Node><Node NodeType="NodeList" epx="For" LineNo="113" ColNo="20"><NodeId>MakeTurnOne</NodeId><VariableDeclarations><DeclareVariable LineNo="112" ColNo="25"><Name>j</Name><Type>Integer</Type><InitialValue><IntegerValue>0</IntegerValue></InitialValue></DeclareVariable></VariableDeclarations><StartCondition><EQInternal><NodeStateVariable><NodeRef dir="sibling">COMMAND__26</NodeRef></NodeStateVariable><NodeStateValue>FINISHED</NodeStateValue></EQInternal></StartCondition><NodeBody><NodeList><Node NodeType="NodeList" epx="aux"><NodeId>ep2cp_ForLoop</NodeId><SkipCondition><NOT><LT><IntegerVariable>j</IntegerVariable><IntegerValue>2</IntegerValue></LT></NOT></SkipCondition><RepeatCondition><BooleanValue>true</BooleanValue></RepeatCondition><NodeBody><NodeList><Node NodeType="Command" LineNo="116" ColNo="37"><NodeId>BLOCK__27</NodeId><VariableDeclarations><DeclareVariable LineNo="114" ColNo="24"><Name>move_turn1</Name><Type>Integer</Type></DeclareVariable></VariableDeclarations><EndCondition><IsKnown><IntegerVariable>move_turn1</IntegerVariable></IsKnown></EndCondition><NodeBody><Command><IntegerVariable>move_turn1</IntegerVariable><Name><StringValue>Move</StringValue></Name><Arguments LineNo="117" ColNo="42"><StringVariable>RobotName</StringVariable><IntegerVariable>Direction</IntegerVariable></Arguments></Command></NodeBody></Node><Node NodeType="Assignment" epx="LoopVariableUpdate"><NodeId>ep2cp_ForLoopUpdater</NodeId><StartCondition><EQInternal><NodeStateVariable><NodeRef dir="sibling">BLOCK__27</NodeRef></NodeStateVariable><NodeStateValue>FINISHED</NodeStateValue></EQInternal></StartCondition><NodeBody><Assignment><IntegerVariable>j</IntegerVariable><NumericRHS><ADD LineNo="113" ColNo="49"><IntegerVariable>j</IntegerVariable><IntegerValue>1</IntegerValue></ADD></NumericRHS></Assignment></NodeBody></Node></NodeList></NodeBody></Node></NodeList></NodeBody></Node><Node NodeType="Assignment" LineNo="120" ColNo="20"><NodeId>DecideTurnTwo</NodeId><StartCondition><EQInternal><NodeStateVariable><NodeRef dir="sibling">MakeTurnOne</NodeRef></NodeStateVariable><NodeStateValue>FINISHED</NodeStateValue></EQInternal></StartCondition><NodeBody><Assignment><IntegerVariable>Direction</IntegerVariable><NumericRHS><MOD LineNo="120" ColNo="48"><ADD LineNo="120" ColNo="43"><IntegerVariable>Direction</IntegerVariable><IntegerValue>1</IntegerValue></ADD><IntegerValue>4</IntegerValue></MOD></NumericRHS></Assignment></NodeBody></Node><Node NodeType="Command" LineNo="120" ColNo="20"><NodeId>COMMAND__29</NodeId><StartCondition><EQInternal><NodeStateVariable><NodeRef dir="sibling">DecideTurnTwo</NodeRef></NodeStateVariable><NodeStateValue>FINISHED</NodeStateValue></EQInternal></StartCondition><NodeBody><Command><Name><StringValue>pprint</StringValue></Name><Arguments LineNo="121" ColNo="27"><StringValue>New direction is </StringValue><IntegerVariable>Direction</IntegerVariable></Arguments></Command></NodeBody></Node><Node NodeType="NodeList" epx="Sequence" LineNo="127" ColNo="24"><NodeId>TaketurnTwo</NodeId><StartCondition><EQInternal><NodeStateVariable><NodeRef dir="sibling">COMMAND__29</NodeRef></NodeStateVariable><NodeStateValue>FINISHED</NodeStateValue></EQInternal></StartCondition><EndCondition><IsKnown><IntegerVariable>Result</IntegerVariable></IsKnown></EndCondition><InvariantCondition><NOT><AND><EQInternal><NodeOutcomeVariable><NodeRef dir="child">for__30</NodeRef></NodeOutcomeVariable><NodeOutcomeValue>FAILURE</NodeOutcomeValue></EQInternal><EQInternal><NodeStateVariable><NodeRef dir="child">for__30</NodeRef></NodeStateVariable><NodeStateValue>FINISHED</NodeStateValue></EQInternal></AND></NOT></InvariantCondition><NodeBody><NodeList><Node NodeType="NodeList" epx="For" LineNo="128" ColNo="24"><NodeId>for__30</NodeId><VariableDeclarations><DeclareVariable LineNo="127" ColNo="29"><Name>i</Name><Type>Integer</Type><InitialValue><IntegerValue>0</IntegerValue></InitialValue></DeclareVariable></VariableDeclarations><NodeBody><NodeList><Node NodeType="NodeList" epx="aux"><NodeId>ep2cp_ForLoop</NodeId><SkipCondition><NOT><LT><IntegerVariable>i</IntegerVariable><IntegerValue>2</IntegerValue></LT></NOT></SkipCondition><RepeatCondition><BooleanValue>true</BooleanValue></RepeatCondition><NodeBody><NodeList><Node NodeType="NodeList" epx="Sequence" LineNo="129" ColNo="28"><NodeId>BLOCK__31</NodeId><VariableDeclarations><DeclareVariable LineNo="128" ColNo="28"><Name>move_turn2</Name><Type>Integer</Type></DeclareVariable></VariableDeclarations><InvariantCondition><NOT><OR><AND><EQInternal><NodeOutcomeVariable><NodeRef dir="child">BLOCK__32</NodeRef></NodeOutcomeVariable><NodeOutcomeValue>FAILURE</NodeOutcomeValue></EQInternal><EQInternal><NodeStateVariable><NodeRef dir="child">BLOCK__32</NodeRef></NodeStateVariable><NodeStateValue>FINISHED</NodeStateValue></EQInternal></AND><AND><EQInternal><NodeOutcomeVariable><NodeRef dir="child">if__34</NodeRef></NodeOutcomeVariable><NodeOutcomeValue>FAILURE</NodeOutcomeValue></EQInternal><EQInternal><NodeStateVariable><NodeRef dir="child">if__34</NodeRef></NodeStateVariable><NodeStateValue>FINISHED</NodeStateValue></EQInternal></AND></OR></NOT></InvariantCondition><NodeBody><NodeList><Node NodeType="Command" LineNo="131" ColNo="45"><NodeId>BLOCK__32</NodeId><EndCondition><IsKnown><IntegerVariable>move_turn2</IntegerVariable></IsKnown></EndCondition><NodeBody><Command><IntegerVariable>move_turn2</IntegerVariable><Name><StringValue>Move</StringValue></Name><Arguments LineNo="132" ColNo="50"><StringVariable>RobotName</StringVariable><IntegerVariable>Direction</IntegerVariable></Arguments></Command></NodeBody></Node><Node NodeType="NodeList" epx="If" LineNo="134" ColNo="28"><NodeId>if__34</NodeId><StartCondition><EQInternal><NodeStateVariable><NodeRef dir="sibling">BLOCK__32</NodeRef></NodeStateVariable><NodeStateValue>FINISHED</NodeStateValue></EQInternal></StartCondition><NodeBody><NodeList><Node NodeType="Empty" epx="Condition"><NodeId>ep2cp_IfTest</NodeId><PostCondition><EQNumeric><IntegerVariable>i</IntegerVariable><IntegerValue>1</IntegerValue></EQNumeric></PostCondition></Node><Node NodeType="Assignment" epx="Then" LineNo="135" ColNo="32"><NodeId>ASSIGNMENT__35</NodeId><StartCondition><EQInternal><NodeOutcomeVariable><NodeRef dir="sibling">ep2cp_IfTest</NodeRef></NodeOutcomeVariable><NodeOutcomeValue>SUCCESS</NodeOutcomeValue></EQInternal></StartCondition><SkipCondition><EQInternal><NodeFailureVariable><NodeRef dir="sibling">ep2cp_IfTest</NodeRef></NodeFailureVariable><NodeFailureValue>POST_CONDITION_FAILED</NodeFailureValue></EQInternal></SkipCondition><NodeBody><Assignment><IntegerVariable>Result</IntegerVariable><NumericRHS><IntegerVariable>move_turn2</IntegerVariable></NumericRHS></Assignment></NodeBody></Node></NodeList></NodeBody></Node></NodeList></NodeBody></Node><Node NodeType="Assignment" epx="LoopVariableUpdate"><NodeId>ep2cp_ForLoopUpdater</NodeId><StartCondition><EQInternal><NodeStateVariable><NodeRef dir="sibling">BLOCK__31</NodeRef></NodeStateVariable><NodeStateValue>FINISHED</NodeStateValue></EQInternal></StartCondition><NodeBody><Assignment><IntegerVariable>i</IntegerVariable><NumericRHS><ADD LineNo="128" ColNo="53"><IntegerVariable>i</IntegerVariable><IntegerValue>1</IntegerValue></ADD></NumericRHS></Assignment></NodeBody></Node></NodeList></NodeBody></Node></NodeList></NodeBody></Node></NodeList></NodeBody></Node></NodeList></NodeBody></Node><Node NodeType="NodeList" epx="Else" LineNo="142" ColNo="20"><NodeId>BLOCK__36</NodeId><InvariantCondition><NOT><OR><AND><EQInternal><NodeOutcomeVariable><NodeRef dir="child">COMMAND__37</NodeRef></NodeOutcomeVariable><NodeOutcomeValue>FAILURE</NodeOutcomeValue></EQInternal><EQInternal><NodeStateVariable><NodeRef dir="child">COMMAND__37</NodeRef></NodeStateVariable><NodeStateValue>FINISHED</NodeStateValue></EQInternal></AND><AND><EQInternal><NodeOutcomeVariable><NodeRef dir="child">BLOCK__38</NodeRef></NodeOutcomeVariable><NodeOutcomeValue>FAILURE</NodeOutcomeValue></EQInternal><EQInternal><NodeStateVariable><NodeRef dir="child">BLOCK__38</NodeRef></NodeStateVariable><NodeStateValue>FINISHED</NodeStateValue></EQInternal></AND></OR></NOT></InvariantCondition><StartCondition><EQInternal><NodeFailureVariable><NodeRef dir="sibling">ep2cp_ElseIf-1</NodeRef></NodeFailureVariable><NodeFailureValue>POST_CONDITION_FAILED</NodeFailureValue></EQInternal></StartCondition><SkipCondition><OR><EQInternal><NodeOutcomeVariable><NodeRef dir="sibling">ep2cp_ElseIf-1</NodeRef></NodeOutcomeVariable><NodeOutcomeValue>SKIPPED</NodeOutcomeValue></EQInternal><EQInternal><NodeOutcomeVariable><NodeRef dir="sibling">ep2cp_ElseIf-1</NodeRef></NodeOutcomeVariable><NodeOutcomeValue>SUCCESS</NodeOutcomeValue></EQInternal></OR></SkipCondition><NodeBody><NodeList><Node NodeType="Command" LineNo="141" ColNo="20"><NodeId>COMMAND__37</NodeId><NodeBody><Command><Name><StringValue>pprint</StringValue></Name><Arguments LineNo="142" ColNo="27"><StringValue>Moving in direction </StringValue><IntegerVariable>Direction</IntegerVariable></Arguments></Command></NodeBody></Node><Node NodeType="Command" LineNo="144" ColNo="33"><NodeId>BLOCK__38</NodeId><StartCondition><EQInternal><NodeStateVariable><NodeRef dir="sibling">COMMAND__37</NodeRef></NodeStateVariable><NodeStateValue>FINISHED</NodeStateValue></EQInternal></StartCondition><EndCondition><IsKnown><IntegerVariable>Result</IntegerVariable></IsKnown></EndCondition><NodeBody><Command><IntegerVariable>Result</IntegerVariable><Name><StringValue>Move</StringValue></Name><Arguments LineNo="145" ColNo="38"><StringVariable>RobotName</StringVariable><IntegerVariable>Direction</IntegerVariable></Arguments></Command></NodeBody></Node></NodeList></NodeBody></Node></NodeList></NodeBody></Node></NodeList></NodeBody></Node><Node NodeType="Command" LineNo="149" ColNo="12"><NodeId>COMMAND__40</NodeId><StartCondition><EQInternal><NodeStateVariable><NodeRef dir="sibling">Move</NodeRef></NodeStateVariable><NodeStateValue>FINISHED</NodeStateValue></EQInternal></StartCondition><NodeBody><Command><Name><StringValue>pprint</StringValue></Name><Arguments LineNo="150" ColNo="19"><StringValue>Move complete</StringValue></Arguments></Command></NodeBody></Node></NodeList></NodeBody></Node></NodeList></NodeBody></Node></NodeList></NodeBody></Node></NodeList></NodeBody></Node><Node NodeType="NodeList" epx="If" LineNo="155" ColNo="4"><NodeId>if__41</NodeId><StartCondition><EQInternal><NodeStateVariable><NodeRef dir="sibling">while__0</NodeRef></NodeStateVariable><NodeStateValue>FINISHED</NodeStateValue></EQInternal></StartCondition><NodeBody><NodeList><Node NodeType="Empty" epx="Condition"><NodeId>ep2cp_IfTest</NodeId><PostCondition><BooleanVariable>Stuck</BooleanVariable></PostCondition></Node><Node NodeType="Command" epx="Then" LineNo="155" ColNo="8"><NodeId>COMMAND__42</NodeId><StartCondition><EQInternal><NodeOutcomeVariable><NodeRef dir="sibling">ep2cp_IfTest</NodeRef></NodeOutcomeVariable><NodeOutcomeValue>SUCCESS</NodeOutcomeValue></EQInternal></StartCondition><SkipCondition><EQInternal><NodeFailureVariable><NodeRef dir="sibling">ep2cp_IfTest</NodeRef></NodeFailureVariable><NodeFailureValue>POST_CONDITION_FAILED</NodeFailureValue></EQInternal></SkipCondition><NodeBody><Command><Name><StringValue>pprint</StringValue></Name><Arguments LineNo="156" ColNo="15"><StringValue>Unable to find path to goal</StringValue></Arguments></Command></NodeBody></Node><Node NodeType="Command" epx="Else" LineNo="157" ColNo="8"><NodeId>COMMAND__43</NodeId><StartCondition><EQInternal><NodeFailureVariable><NodeRef dir="sibling">ep2cp_IfTest</NodeRef></NodeFailureVariable><NodeFailureValue>POST_CONDITION_FAILED</NodeFailureValue></EQInternal></StartCondition><SkipCondition><EQInternal><NodeOutcomeVariable><NodeRef dir="sibling">ep2cp_IfTest</NodeRef></NodeOutcomeVariable><NodeOutcomeValue>SUCCESS</NodeOutcomeValue></EQInternal></SkipCondition><NodeBody><Command><Name><StringValue>pprint</StringValue></Name><Arguments LineNo="158" ColNo="15"><StringValue>Found goal!</StringValue></Arguments></Command></NodeBody></Node></NodeList></NodeBody></Node></NodeList></NodeBody></Node></PlexilPlan>