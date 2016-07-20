<?xml version="1.0" encoding="UTF-8"?>
<PlexilPlan xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
            xmlns:tr="extended-plexil-translator"
            FileName="Waypoint_Plan.ple">
   <GlobalDeclarations LineNo="49" ColNo="8">
      <CommandDeclaration LineNo="49" ColNo="8">
         <Name>Fly2A</Name>
         <Return>
            <Name>_return_0</Name>
            <Type>Boolean</Type>
         </Return>
      </CommandDeclaration>
      <CommandDeclaration LineNo="50" ColNo="8">
         <Name>Fly2B</Name>
         <Return>
            <Name>_return_0</Name>
            <Type>Boolean</Type>
         </Return>
      </CommandDeclaration>
      <CommandDeclaration LineNo="51" ColNo="8">
         <Name>UpdateIC</Name>
         <Return>
            <Name>_return_0</Name>
            <Type>Boolean</Type>
         </Return>
         <Parameter>
            <Type>Real</Type>
         </Parameter>
         <Parameter>
            <Type>Real</Type>
         </Parameter>
         <Parameter>
            <Type>Real</Type>
         </Parameter>
         <Parameter>
            <Type>Real</Type>
         </Parameter>
      </CommandDeclaration>
      <CommandDeclaration LineNo="52" ColNo="8">
         <Name>UpdateWaypoint</Name>
         <Return>
            <Name>_return_0</Name>
            <Type>Boolean</Type>
         </Return>
         <Parameter>
            <Type>Real</Type>
         </Parameter>
         <Parameter>
            <Type>Real</Type>
         </Parameter>
         <Parameter>
            <Type>Real</Type>
         </Parameter>
         <Parameter>
            <Type>String</Type>
         </Parameter>
      </CommandDeclaration>
      <CommandDeclaration LineNo="54" ColNo="0">
         <Name>SendMessage</Name>
      </CommandDeclaration>
      <CommandDeclaration LineNo="55" ColNo="0">
         <Name>UpdateLookup</Name>
      </CommandDeclaration>
      <CommandDeclaration LineNo="57" ColNo="0">
         <Name>pprint</Name>
      </CommandDeclaration>
   </GlobalDeclarations>
   <Node NodeType="NodeList" epx="Sequence" LineNo="62" ColNo="1">
      <NodeId>WaypointPlan</NodeId>
      <VariableDeclarations>
         <DeclareVariable LineNo="61" ColNo="1">
            <Name>velStart</Name>
            <Type>Real</Type>
            <InitialValue>
               <RealValue>1</RealValue>
            </InitialValue>
         </DeclareVariable>
         <DeclareVariable LineNo="62" ColNo="1">
            <Name>xStart</Name>
            <Type>Real</Type>
            <InitialValue>
               <RealValue>0</RealValue>
            </InitialValue>
         </DeclareVariable>
         <DeclareVariable LineNo="63" ColNo="1">
            <Name>yStart</Name>
            <Type>Real</Type>
            <InitialValue>
               <RealValue>0</RealValue>
            </InitialValue>
         </DeclareVariable>
         <DeclareVariable LineNo="64" ColNo="1">
            <Name>zStart</Name>
            <Type>Real</Type>
            <InitialValue>
               <RealValue>0</RealValue>
            </InitialValue>
         </DeclareVariable>
         <DeclareVariable LineNo="65" ColNo="1">
            <Name>xWaypoint_A</Name>
            <Type>Real</Type>
            <InitialValue>
               <RealValue>10</RealValue>
            </InitialValue>
         </DeclareVariable>
         <DeclareVariable LineNo="66" ColNo="1">
            <Name>yWaypoint_A</Name>
            <Type>Real</Type>
            <InitialValue>
               <RealValue>0</RealValue>
            </InitialValue>
         </DeclareVariable>
         <DeclareVariable LineNo="67" ColNo="1">
            <Name>zWaypoint_A</Name>
            <Type>Real</Type>
            <InitialValue>
               <RealValue>5</RealValue>
            </InitialValue>
         </DeclareVariable>
         <DeclareVariable LineNo="68" ColNo="1">
            <Name>xWaypoint_B</Name>
            <Type>Real</Type>
            <InitialValue>
               <RealValue>10</RealValue>
            </InitialValue>
         </DeclareVariable>
         <DeclareVariable LineNo="69" ColNo="1">
            <Name>yWaypoint_B</Name>
            <Type>Real</Type>
            <InitialValue>
               <RealValue>10</RealValue>
            </InitialValue>
         </DeclareVariable>
         <DeclareVariable LineNo="70" ColNo="1">
            <Name>zWaypoint_B</Name>
            <Type>Real</Type>
            <InitialValue>
               <RealValue>5</RealValue>
            </InitialValue>
         </DeclareVariable>
         <DeclareVariable LineNo="71" ColNo="1">
            <Name>A_Complete</Name>
            <Type>Boolean</Type>
         </DeclareVariable>
         <DeclareVariable LineNo="72" ColNo="1">
            <Name>B_Complete</Name>
            <Type>Boolean</Type>
         </DeclareVariable>
      </VariableDeclarations>
      <ExitCondition>
         <AND>
            <BooleanVariable>A_Complete</BooleanVariable>
            <BooleanVariable>B_Complete</BooleanVariable>
         </AND>
      </ExitCondition>
      <InvariantCondition>
         <NOT>
            <OR>
               <AND>
                  <EQInternal>
                     <NodeOutcomeVariable>
                        <NodeRef dir="child">Set_Start</NodeRef>
                     </NodeOutcomeVariable>
                     <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                  </EQInternal>
                  <EQInternal>
                     <NodeStateVariable>
                        <NodeRef dir="child">Set_Start</NodeRef>
                     </NodeStateVariable>
                     <NodeStateValue>FINISHED</NodeStateValue>
                  </EQInternal>
               </AND>
               <AND>
                  <EQInternal>
                     <NodeOutcomeVariable>
                        <NodeRef dir="child">Execute_A</NodeRef>
                     </NodeOutcomeVariable>
                     <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                  </EQInternal>
                  <EQInternal>
                     <NodeStateVariable>
                        <NodeRef dir="child">Execute_A</NodeRef>
                     </NodeStateVariable>
                     <NodeStateValue>FINISHED</NodeStateValue>
                  </EQInternal>
               </AND>
               <AND>
                  <EQInternal>
                     <NodeOutcomeVariable>
                        <NodeRef dir="child">Execute_B</NodeRef>
                     </NodeOutcomeVariable>
                     <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                  </EQInternal>
                  <EQInternal>
                     <NodeStateVariable>
                        <NodeRef dir="child">Execute_B</NodeRef>
                     </NodeStateVariable>
                     <NodeStateValue>FINISHED</NodeStateValue>
                  </EQInternal>
               </AND>
            </OR>
         </NOT>
      </InvariantCondition>
      <NodeBody>
         <NodeList>
            <Node NodeType="NodeList" epx="Sequence" LineNo="79" ColNo="2">
               <NodeId>Set_Start</NodeId>
               <VariableDeclarations>
                  <DeclareVariable LineNo="78" ColNo="2">
                     <Name>StartUpdated</Name>
                     <Type>Boolean</Type>
                  </DeclareVariable>
               </VariableDeclarations>
               <PostCondition>
                  <BooleanVariable>StartUpdated</BooleanVariable>
               </PostCondition>
               <InvariantCondition>
                  <NOT>
                     <OR>
                        <AND>
                           <EQInternal>
                              <NodeOutcomeVariable>
                                 <NodeRef dir="child">SynchronousCommand__0</NodeRef>
                              </NodeOutcomeVariable>
                              <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                           </EQInternal>
                           <EQInternal>
                              <NodeStateVariable>
                                 <NodeRef dir="child">SynchronousCommand__0</NodeRef>
                              </NodeStateVariable>
                              <NodeStateValue>FINISHED</NodeStateValue>
                           </EQInternal>
                        </AND>
                        <AND>
                           <EQInternal>
                              <NodeOutcomeVariable>
                                 <NodeRef dir="child">COMMAND__1</NodeRef>
                              </NodeOutcomeVariable>
                              <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                           </EQInternal>
                           <EQInternal>
                              <NodeStateVariable>
                                 <NodeRef dir="child">COMMAND__1</NodeRef>
                              </NodeStateVariable>
                              <NodeStateValue>FINISHED</NodeStateValue>
                           </EQInternal>
                        </AND>
                     </OR>
                  </NOT>
               </InvariantCondition>
               <NodeBody>
                  <NodeList>
                     <Node NodeType="NodeList" epx="SynchronousCommand" LineNo="83" ColNo="2">
                        <NodeId>SynchronousCommand__0</NodeId>
                        <NodeBody>
                           <NodeList>
                              <Node NodeType="NodeList" epx="aux">
                                 <NodeId>ep2cp_SynchronousCommandAux</NodeId>
                                 <VariableDeclarations>
                                    <DeclareVariable>
                                       <Name>ep2cp_return</Name>
                                       <Type>Boolean</Type>
                                    </DeclareVariable>
                                 </VariableDeclarations>
                                 <NodeBody>
                                    <NodeList>
                                       <Node NodeType="Command" epx="aux">
                                          <NodeId>ep2cp_SynchronousCommandCommand</NodeId>
                                          <EndCondition>
                                             <IsKnown>
                                                <BooleanVariable>ep2cp_return</BooleanVariable>
                                             </IsKnown>
                                          </EndCondition>
                                          <NodeBody>
                                             <Command>
                                                <BooleanVariable>ep2cp_return</BooleanVariable>
                                                <Name>
                                                   <StringValue>UpdateIC</StringValue>
                                                </Name>
                                                <Arguments LineNo="83" ColNo="45">
                                                   <RealVariable>velStart</RealVariable>
                                                   <RealVariable>xStart</RealVariable>
                                                   <RealVariable>yStart</RealVariable>
                                                   <RealVariable>zStart</RealVariable>
                                                </Arguments>
                                             </Command>
                                          </NodeBody>
                                       </Node>
                                       <Node NodeType="Assignment" epx="aux">
                                          <NodeId>ep2cp_SynchronousCommandAssignment</NodeId>
                                          <StartCondition>
                                             <EQInternal>
                                                <NodeStateVariable>
                                                   <NodeRef dir="sibling">ep2cp_SynchronousCommandCommand</NodeRef>
                                                </NodeStateVariable>
                                                <NodeStateValue>FINISHED</NodeStateValue>
                                             </EQInternal>
                                          </StartCondition>
                                          <NodeBody>
                                             <Assignment>
                                                <BooleanVariable>StartUpdated</BooleanVariable>
                                                <BooleanRHS>
                                                   <BooleanVariable>ep2cp_return</BooleanVariable>
                                                </BooleanRHS>
                                             </Assignment>
                                          </NodeBody>
                                       </Node>
                                    </NodeList>
                                 </NodeBody>
                              </Node>
                           </NodeList>
                        </NodeBody>
                     </Node>
                     <Node NodeType="Command" LineNo="83" ColNo="2">
                        <NodeId>COMMAND__1</NodeId>
                        <StartCondition>
                           <EQInternal>
                              <NodeStateVariable>
                                 <NodeRef dir="sibling">SynchronousCommand__0</NodeRef>
                              </NodeStateVariable>
                              <NodeStateValue>FINISHED</NodeStateValue>
                           </EQInternal>
                        </StartCondition>
                        <NodeBody>
                           <Command>
                              <Name>
                                 <StringValue>pprint</StringValue>
                              </Name>
                              <Arguments LineNo="84" ColNo="9">
                                 <StringValue>The aircraft's starting location and velocity is: vel = </StringValue>
                                 <RealVariable>velStart</RealVariable>
                                 <StringValue>x =</StringValue>
                                 <RealVariable>xStart</RealVariable>
                                 <StringValue>y =</StringValue>
                                 <RealVariable>yStart</RealVariable>
                                 <StringValue>z =</StringValue>
                                 <RealVariable>zStart</RealVariable>
                              </Arguments>
                           </Command>
                        </NodeBody>
                     </Node>
                  </NodeList>
               </NodeBody>
            </Node>
            <Node NodeType="NodeList" epx="Sequence" LineNo="89" ColNo="2">
               <NodeId>Execute_A</NodeId>
               <VariableDeclarations>
                  <DeclareVariable LineNo="88" ColNo="2">
                     <Name>Fly2A_Success</Name>
                     <Type>Boolean</Type>
                  </DeclareVariable>
               </VariableDeclarations>
               <StartCondition>
                  <EQInternal>
                     <NodeStateVariable>
                        <NodeRef dir="sibling">Set_Start</NodeRef>
                     </NodeStateVariable>
                     <NodeStateValue>FINISHED</NodeStateValue>
                  </EQInternal>
               </StartCondition>
               <PostCondition>
                  <EQInternal>
                     <NodeOutcomeVariable>
                        <NodeId>Command_Fly2A</NodeId>
                     </NodeOutcomeVariable>
                     <NodeOutcomeValue>SUCCESS</NodeOutcomeValue>
                  </EQInternal>
               </PostCondition>
               <InvariantCondition>
                  <NOT>
                     <OR>
                        <AND>
                           <EQInternal>
                              <NodeOutcomeVariable>
                                 <NodeRef dir="child">Set_WaypointA</NodeRef>
                              </NodeOutcomeVariable>
                              <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                           </EQInternal>
                           <EQInternal>
                              <NodeStateVariable>
                                 <NodeRef dir="child">Set_WaypointA</NodeRef>
                              </NodeStateVariable>
                              <NodeStateValue>FINISHED</NodeStateValue>
                           </EQInternal>
                        </AND>
                        <AND>
                           <EQInternal>
                              <NodeOutcomeVariable>
                                 <NodeRef dir="child">Command_Fly2A</NodeRef>
                              </NodeOutcomeVariable>
                              <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                           </EQInternal>
                           <EQInternal>
                              <NodeStateVariable>
                                 <NodeRef dir="child">Command_Fly2A</NodeRef>
                              </NodeStateVariable>
                              <NodeStateValue>FINISHED</NodeStateValue>
                           </EQInternal>
                        </AND>
                        <AND>
                           <EQInternal>
                              <NodeOutcomeVariable>
                                 <NodeRef dir="child">if__5</NodeRef>
                              </NodeOutcomeVariable>
                              <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                           </EQInternal>
                           <EQInternal>
                              <NodeStateVariable>
                                 <NodeRef dir="child">if__5</NodeRef>
                              </NodeStateVariable>
                              <NodeStateValue>FINISHED</NodeStateValue>
                           </EQInternal>
                        </AND>
                     </OR>
                  </NOT>
               </InvariantCondition>
               <NodeBody>
                  <NodeList>
                     <Node NodeType="NodeList" epx="Sequence" LineNo="95" ColNo="3">
                        <NodeId>Set_WaypointA</NodeId>
                        <VariableDeclarations>
                           <DeclareVariable LineNo="94" ColNo="3">
                              <Name>WaypointSet</Name>
                              <Type>Boolean</Type>
                           </DeclareVariable>
                        </VariableDeclarations>
                        <PostCondition>
                           <BooleanVariable>WaypointSet</BooleanVariable>
                        </PostCondition>
                        <InvariantCondition>
                           <NOT>
                              <OR>
                                 <AND>
                                    <EQInternal>
                                       <NodeOutcomeVariable>
                                          <NodeRef dir="child">SynchronousCommand__2</NodeRef>
                                       </NodeOutcomeVariable>
                                       <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                    </EQInternal>
                                    <EQInternal>
                                       <NodeStateVariable>
                                          <NodeRef dir="child">SynchronousCommand__2</NodeRef>
                                       </NodeStateVariable>
                                       <NodeStateValue>FINISHED</NodeStateValue>
                                    </EQInternal>
                                 </AND>
                                 <AND>
                                    <EQInternal>
                                       <NodeOutcomeVariable>
                                          <NodeRef dir="child">COMMAND__3</NodeRef>
                                       </NodeOutcomeVariable>
                                       <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                    </EQInternal>
                                    <EQInternal>
                                       <NodeStateVariable>
                                          <NodeRef dir="child">COMMAND__3</NodeRef>
                                       </NodeStateVariable>
                                       <NodeStateValue>FINISHED</NodeStateValue>
                                    </EQInternal>
                                 </AND>
                              </OR>
                           </NOT>
                        </InvariantCondition>
                        <NodeBody>
                           <NodeList>
                              <Node NodeType="NodeList" epx="SynchronousCommand" LineNo="99" ColNo="3">
                                 <NodeId>SynchronousCommand__2</NodeId>
                                 <NodeBody>
                                    <NodeList>
                                       <Node NodeType="NodeList" epx="aux">
                                          <NodeId>ep2cp_SynchronousCommandAux</NodeId>
                                          <VariableDeclarations>
                                             <DeclareVariable>
                                                <Name>ep2cp_return</Name>
                                                <Type>Boolean</Type>
                                             </DeclareVariable>
                                          </VariableDeclarations>
                                          <NodeBody>
                                             <NodeList>
                                                <Node NodeType="Command" epx="aux">
                                                   <NodeId>ep2cp_SynchronousCommandCommand</NodeId>
                                                   <EndCondition>
                                                      <IsKnown>
                                                         <BooleanVariable>ep2cp_return</BooleanVariable>
                                                      </IsKnown>
                                                   </EndCondition>
                                                   <NodeBody>
                                                      <Command>
                                                         <BooleanVariable>ep2cp_return</BooleanVariable>
                                                         <Name>
                                                            <StringValue>UpdateWaypoint</StringValue>
                                                         </Name>
                                                         <Arguments LineNo="99" ColNo="51">
                                                            <RealVariable>xWaypoint_A</RealVariable>
                                                            <RealVariable>yWaypoint_A</RealVariable>
                                                            <RealVariable>zWaypoint_A</RealVariable>
                                                            <StringValue>A</StringValue>
                                                         </Arguments>
                                                      </Command>
                                                   </NodeBody>
                                                </Node>
                                                <Node NodeType="Assignment" epx="aux">
                                                   <NodeId>ep2cp_SynchronousCommandAssignment</NodeId>
                                                   <StartCondition>
                                                      <EQInternal>
                                                         <NodeStateVariable>
                                                            <NodeRef dir="sibling">ep2cp_SynchronousCommandCommand</NodeRef>
                                                         </NodeStateVariable>
                                                         <NodeStateValue>FINISHED</NodeStateValue>
                                                      </EQInternal>
                                                   </StartCondition>
                                                   <NodeBody>
                                                      <Assignment>
                                                         <BooleanVariable>WaypointSet</BooleanVariable>
                                                         <BooleanRHS>
                                                            <BooleanVariable>ep2cp_return</BooleanVariable>
                                                         </BooleanRHS>
                                                      </Assignment>
                                                   </NodeBody>
                                                </Node>
                                             </NodeList>
                                          </NodeBody>
                                       </Node>
                                    </NodeList>
                                 </NodeBody>
                              </Node>
                              <Node NodeType="Command" LineNo="99" ColNo="3">
                                 <NodeId>COMMAND__3</NodeId>
                                 <StartCondition>
                                    <EQInternal>
                                       <NodeStateVariable>
                                          <NodeRef dir="sibling">SynchronousCommand__2</NodeRef>
                                       </NodeStateVariable>
                                       <NodeStateValue>FINISHED</NodeStateValue>
                                    </EQInternal>
                                 </StartCondition>
                                 <NodeBody>
                                    <Command>
                                       <Name>
                                          <StringValue>pprint</StringValue>
                                       </Name>
                                       <Arguments LineNo="100" ColNo="10">
                                          <StringValue>Waypoint A is located at: x =</StringValue>
                                          <RealVariable>xWaypoint_A</RealVariable>
                                          <StringValue>y =</StringValue>
                                          <RealVariable>yWaypoint_A</RealVariable>
                                          <StringValue>z =</StringValue>
                                          <RealVariable>zWaypoint_A</RealVariable>
                                       </Arguments>
                                    </Command>
                                 </NodeBody>
                              </Node>
                           </NodeList>
                        </NodeBody>
                     </Node>
                     <Node NodeType="NodeList" epx="Sequence" LineNo="106" ColNo="3">
                        <NodeId>Command_Fly2A</NodeId>
                        <StartCondition>
                           <AND>
                              <EQInternal>
                                 <NodeStateVariable>
                                    <NodeRef dir="sibling">Set_WaypointA</NodeRef>
                                 </NodeStateVariable>
                                 <NodeStateValue>FINISHED</NodeStateValue>
                              </EQInternal>
                              <EQInternal>
                                 <NodeStateVariable>
                                    <NodeId>Set_WaypointA</NodeId>
                                 </NodeStateVariable>
                                 <NodeStateValue>FINISHED</NodeStateValue>
                              </EQInternal>
                           </AND>
                        </StartCondition>
                        <PostCondition>
                           <BooleanVariable>Fly2A_Success</BooleanVariable>
                        </PostCondition>
                        <InvariantCondition>
                           <NOT>
                              <AND>
                                 <EQInternal>
                                    <NodeOutcomeVariable>
                                       <NodeRef dir="child">SynchronousCommand__4</NodeRef>
                                    </NodeOutcomeVariable>
                                    <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                 </EQInternal>
                                 <EQInternal>
                                    <NodeStateVariable>
                                       <NodeRef dir="child">SynchronousCommand__4</NodeRef>
                                    </NodeStateVariable>
                                    <NodeStateValue>FINISHED</NodeStateValue>
                                 </EQInternal>
                              </AND>
                           </NOT>
                        </InvariantCondition>
                        <NodeBody>
                           <NodeList>
                              <Node NodeType="NodeList" epx="SynchronousCommand" LineNo="109" ColNo="3">
                                 <NodeId>SynchronousCommand__4</NodeId>
                                 <NodeBody>
                                    <NodeList>
                                       <Node NodeType="NodeList" epx="aux">
                                          <NodeId>ep2cp_SynchronousCommandAux</NodeId>
                                          <VariableDeclarations>
                                             <DeclareVariable>
                                                <Name>ep2cp_return</Name>
                                                <Type>Boolean</Type>
                                             </DeclareVariable>
                                          </VariableDeclarations>
                                          <NodeBody>
                                             <NodeList>
                                                <Node NodeType="Command" epx="aux">
                                                   <NodeId>ep2cp_SynchronousCommandCommand</NodeId>
                                                   <EndCondition>
                                                      <IsKnown>
                                                         <BooleanVariable>ep2cp_return</BooleanVariable>
                                                      </IsKnown>
                                                   </EndCondition>
                                                   <NodeBody>
                                                      <Command>
                                                         <BooleanVariable>ep2cp_return</BooleanVariable>
                                                         <Name>
                                                            <StringValue>Fly2A</StringValue>
                                                         </Name>
                                                      </Command>
                                                   </NodeBody>
                                                </Node>
                                                <Node NodeType="Assignment" epx="aux">
                                                   <NodeId>ep2cp_SynchronousCommandAssignment</NodeId>
                                                   <StartCondition>
                                                      <EQInternal>
                                                         <NodeStateVariable>
                                                            <NodeRef dir="sibling">ep2cp_SynchronousCommandCommand</NodeRef>
                                                         </NodeStateVariable>
                                                         <NodeStateValue>FINISHED</NodeStateValue>
                                                      </EQInternal>
                                                   </StartCondition>
                                                   <NodeBody>
                                                      <Assignment>
                                                         <BooleanVariable>Fly2A_Success</BooleanVariable>
                                                         <BooleanRHS>
                                                            <BooleanVariable>ep2cp_return</BooleanVariable>
                                                         </BooleanRHS>
                                                      </Assignment>
                                                   </NodeBody>
                                                </Node>
                                             </NodeList>
                                          </NodeBody>
                                       </Node>
                                    </NodeList>
                                 </NodeBody>
                              </Node>
                           </NodeList>
                        </NodeBody>
                     </Node>
                     <Node NodeType="NodeList" epx="If" LineNo="112" ColNo="2">
                        <NodeId>if__5</NodeId>
                        <StartCondition>
                           <EQInternal>
                              <NodeStateVariable>
                                 <NodeRef dir="sibling">Command_Fly2A</NodeRef>
                              </NodeStateVariable>
                              <NodeStateValue>FINISHED</NodeStateValue>
                           </EQInternal>
                        </StartCondition>
                        <NodeBody>
                           <NodeList>
                              <Node NodeType="Empty" epx="Condition">
                                 <NodeId>ep2cp_IfTest</NodeId>
                                 <PostCondition>
                                    <BooleanVariable>Fly2A_Success</BooleanVariable>
                                 </PostCondition>
                              </Node>
                              <Node NodeType="NodeList" epx="Then" LineNo="114" ColNo="3">
                                 <NodeId>BLOCK__6</NodeId>
                                 <InvariantCondition>
                                    <NOT>
                                       <OR>
                                          <AND>
                                             <EQInternal>
                                                <NodeOutcomeVariable>
                                                   <NodeRef dir="child">COMMAND__7</NodeRef>
                                                </NodeOutcomeVariable>
                                                <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                             </EQInternal>
                                             <EQInternal>
                                                <NodeStateVariable>
                                                   <NodeRef dir="child">COMMAND__7</NodeRef>
                                                </NodeStateVariable>
                                                <NodeStateValue>FINISHED</NodeStateValue>
                                             </EQInternal>
                                          </AND>
                                          <AND>
                                             <EQInternal>
                                                <NodeOutcomeVariable>
                                                   <NodeRef dir="child">ASSIGNMENT__8</NodeRef>
                                                </NodeOutcomeVariable>
                                                <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                             </EQInternal>
                                             <EQInternal>
                                                <NodeStateVariable>
                                                   <NodeRef dir="child">ASSIGNMENT__8</NodeRef>
                                                </NodeStateVariable>
                                                <NodeStateValue>FINISHED</NodeStateValue>
                                             </EQInternal>
                                          </AND>
                                       </OR>
                                    </NOT>
                                 </InvariantCondition>
                                 <StartCondition>
                                    <EQInternal>
                                       <NodeOutcomeVariable>
                                          <NodeRef dir="sibling">ep2cp_IfTest</NodeRef>
                                       </NodeOutcomeVariable>
                                       <NodeOutcomeValue>SUCCESS</NodeOutcomeValue>
                                    </EQInternal>
                                 </StartCondition>
                                 <SkipCondition>
                                    <EQInternal>
                                       <NodeFailureVariable>
                                          <NodeRef dir="sibling">ep2cp_IfTest</NodeRef>
                                       </NodeFailureVariable>
                                       <NodeFailureValue>POST_CONDITION_FAILED</NodeFailureValue>
                                    </EQInternal>
                                 </SkipCondition>
                                 <NodeBody>
                                    <NodeList>
                                       <Node NodeType="Command" LineNo="113" ColNo="3">
                                          <NodeId>COMMAND__7</NodeId>
                                          <NodeBody>
                                             <Command>
                                                <Name>
                                                   <StringValue>pprint</StringValue>
                                                </Name>
                                                <Arguments LineNo="114" ColNo="10">
                                                   <StringValue>Successfully arrived at A and Science has been performed</StringValue>
                                                </Arguments>
                                             </Command>
                                          </NodeBody>
                                       </Node>
                                       <Node NodeType="Assignment" LineNo="115" ColNo="3">
                                          <NodeId>ASSIGNMENT__8</NodeId>
                                          <StartCondition>
                                             <EQInternal>
                                                <NodeStateVariable>
                                                   <NodeRef dir="sibling">COMMAND__7</NodeRef>
                                                </NodeStateVariable>
                                                <NodeStateValue>FINISHED</NodeStateValue>
                                             </EQInternal>
                                          </StartCondition>
                                          <NodeBody>
                                             <Assignment>
                                                <BooleanVariable>A_Complete</BooleanVariable>
                                                <BooleanRHS>
                                                   <BooleanValue>true</BooleanValue>
                                                </BooleanRHS>
                                             </Assignment>
                                          </NodeBody>
                                       </Node>
                                    </NodeList>
                                 </NodeBody>
                              </Node>
                              <Node NodeType="Command" epx="Else" LineNo="118" ColNo="3">
                                 <NodeId>COMMAND__10</NodeId>
                                 <StartCondition>
                                    <EQInternal>
                                       <NodeFailureVariable>
                                          <NodeRef dir="sibling">ep2cp_IfTest</NodeRef>
                                       </NodeFailureVariable>
                                       <NodeFailureValue>POST_CONDITION_FAILED</NodeFailureValue>
                                    </EQInternal>
                                 </StartCondition>
                                 <SkipCondition>
                                    <EQInternal>
                                       <NodeOutcomeVariable>
                                          <NodeRef dir="sibling">ep2cp_IfTest</NodeRef>
                                       </NodeOutcomeVariable>
                                       <NodeOutcomeValue>SUCCESS</NodeOutcomeValue>
                                    </EQInternal>
                                 </SkipCondition>
                                 <NodeBody>
                                    <Command>
                                       <Name>
                                          <StringValue>pprint</StringValue>
                                       </Name>
                                       <Arguments LineNo="119" ColNo="10">
                                          <StringValue>Flight to A has FAILED</StringValue>
                                       </Arguments>
                                    </Command>
                                 </NodeBody>
                              </Node>
                           </NodeList>
                        </NodeBody>
                     </Node>
                  </NodeList>
               </NodeBody>
            </Node>
            <Node NodeType="NodeList" epx="Sequence" LineNo="127" ColNo="2">
               <NodeId>Execute_B</NodeId>
               <VariableDeclarations>
                  <DeclareVariable LineNo="126" ColNo="2">
                     <Name>Fly2B_Success</Name>
                     <Type>Boolean</Type>
                  </DeclareVariable>
               </VariableDeclarations>
               <StartCondition>
                  <EQInternal>
                     <NodeStateVariable>
                        <NodeRef dir="sibling">Execute_A</NodeRef>
                     </NodeStateVariable>
                     <NodeStateValue>FINISHED</NodeStateValue>
                  </EQInternal>
               </StartCondition>
               <PostCondition>
                  <EQInternal>
                     <NodeOutcomeVariable>
                        <NodeId>Command_Fly2B</NodeId>
                     </NodeOutcomeVariable>
                     <NodeOutcomeValue>SUCCESS</NodeOutcomeValue>
                  </EQInternal>
               </PostCondition>
               <InvariantCondition>
                  <NOT>
                     <OR>
                        <AND>
                           <EQInternal>
                              <NodeOutcomeVariable>
                                 <NodeRef dir="child">Set_WaypointB</NodeRef>
                              </NodeOutcomeVariable>
                              <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                           </EQInternal>
                           <EQInternal>
                              <NodeStateVariable>
                                 <NodeRef dir="child">Set_WaypointB</NodeRef>
                              </NodeStateVariable>
                              <NodeStateValue>FINISHED</NodeStateValue>
                           </EQInternal>
                        </AND>
                        <AND>
                           <EQInternal>
                              <NodeOutcomeVariable>
                                 <NodeRef dir="child">Command_Fly2B</NodeRef>
                              </NodeOutcomeVariable>
                              <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                           </EQInternal>
                           <EQInternal>
                              <NodeStateVariable>
                                 <NodeRef dir="child">Command_Fly2B</NodeRef>
                              </NodeStateVariable>
                              <NodeStateValue>FINISHED</NodeStateValue>
                           </EQInternal>
                        </AND>
                        <AND>
                           <EQInternal>
                              <NodeOutcomeVariable>
                                 <NodeRef dir="child">if__14</NodeRef>
                              </NodeOutcomeVariable>
                              <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                           </EQInternal>
                           <EQInternal>
                              <NodeStateVariable>
                                 <NodeRef dir="child">if__14</NodeRef>
                              </NodeStateVariable>
                              <NodeStateValue>FINISHED</NodeStateValue>
                           </EQInternal>
                        </AND>
                     </OR>
                  </NOT>
               </InvariantCondition>
               <NodeBody>
                  <NodeList>
                     <Node NodeType="NodeList" epx="Sequence" LineNo="133" ColNo="3">
                        <NodeId>Set_WaypointB</NodeId>
                        <VariableDeclarations>
                           <DeclareVariable LineNo="132" ColNo="3">
                              <Name>WaypointSet</Name>
                              <Type>Boolean</Type>
                           </DeclareVariable>
                        </VariableDeclarations>
                        <PostCondition>
                           <BooleanVariable>WaypointSet</BooleanVariable>
                        </PostCondition>
                        <InvariantCondition>
                           <NOT>
                              <OR>
                                 <AND>
                                    <EQInternal>
                                       <NodeOutcomeVariable>
                                          <NodeRef dir="child">SynchronousCommand__11</NodeRef>
                                       </NodeOutcomeVariable>
                                       <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                    </EQInternal>
                                    <EQInternal>
                                       <NodeStateVariable>
                                          <NodeRef dir="child">SynchronousCommand__11</NodeRef>
                                       </NodeStateVariable>
                                       <NodeStateValue>FINISHED</NodeStateValue>
                                    </EQInternal>
                                 </AND>
                                 <AND>
                                    <EQInternal>
                                       <NodeOutcomeVariable>
                                          <NodeRef dir="child">COMMAND__12</NodeRef>
                                       </NodeOutcomeVariable>
                                       <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                    </EQInternal>
                                    <EQInternal>
                                       <NodeStateVariable>
                                          <NodeRef dir="child">COMMAND__12</NodeRef>
                                       </NodeStateVariable>
                                       <NodeStateValue>FINISHED</NodeStateValue>
                                    </EQInternal>
                                 </AND>
                              </OR>
                           </NOT>
                        </InvariantCondition>
                        <NodeBody>
                           <NodeList>
                              <Node NodeType="NodeList" epx="SynchronousCommand" LineNo="137" ColNo="3">
                                 <NodeId>SynchronousCommand__11</NodeId>
                                 <NodeBody>
                                    <NodeList>
                                       <Node NodeType="NodeList" epx="aux">
                                          <NodeId>ep2cp_SynchronousCommandAux</NodeId>
                                          <VariableDeclarations>
                                             <DeclareVariable>
                                                <Name>ep2cp_return</Name>
                                                <Type>Boolean</Type>
                                             </DeclareVariable>
                                          </VariableDeclarations>
                                          <NodeBody>
                                             <NodeList>
                                                <Node NodeType="Command" epx="aux">
                                                   <NodeId>ep2cp_SynchronousCommandCommand</NodeId>
                                                   <EndCondition>
                                                      <IsKnown>
                                                         <BooleanVariable>ep2cp_return</BooleanVariable>
                                                      </IsKnown>
                                                   </EndCondition>
                                                   <NodeBody>
                                                      <Command>
                                                         <BooleanVariable>ep2cp_return</BooleanVariable>
                                                         <Name>
                                                            <StringValue>UpdateWaypoint</StringValue>
                                                         </Name>
                                                         <Arguments LineNo="137" ColNo="51">
                                                            <RealVariable>xWaypoint_B</RealVariable>
                                                            <RealVariable>yWaypoint_B</RealVariable>
                                                            <RealVariable>zWaypoint_B</RealVariable>
                                                            <StringValue>B</StringValue>
                                                         </Arguments>
                                                      </Command>
                                                   </NodeBody>
                                                </Node>
                                                <Node NodeType="Assignment" epx="aux">
                                                   <NodeId>ep2cp_SynchronousCommandAssignment</NodeId>
                                                   <StartCondition>
                                                      <EQInternal>
                                                         <NodeStateVariable>
                                                            <NodeRef dir="sibling">ep2cp_SynchronousCommandCommand</NodeRef>
                                                         </NodeStateVariable>
                                                         <NodeStateValue>FINISHED</NodeStateValue>
                                                      </EQInternal>
                                                   </StartCondition>
                                                   <NodeBody>
                                                      <Assignment>
                                                         <BooleanVariable>WaypointSet</BooleanVariable>
                                                         <BooleanRHS>
                                                            <BooleanVariable>ep2cp_return</BooleanVariable>
                                                         </BooleanRHS>
                                                      </Assignment>
                                                   </NodeBody>
                                                </Node>
                                             </NodeList>
                                          </NodeBody>
                                       </Node>
                                    </NodeList>
                                 </NodeBody>
                              </Node>
                              <Node NodeType="Command" LineNo="137" ColNo="3">
                                 <NodeId>COMMAND__12</NodeId>
                                 <StartCondition>
                                    <EQInternal>
                                       <NodeStateVariable>
                                          <NodeRef dir="sibling">SynchronousCommand__11</NodeRef>
                                       </NodeStateVariable>
                                       <NodeStateValue>FINISHED</NodeStateValue>
                                    </EQInternal>
                                 </StartCondition>
                                 <NodeBody>
                                    <Command>
                                       <Name>
                                          <StringValue>pprint</StringValue>
                                       </Name>
                                       <Arguments LineNo="138" ColNo="10">
                                          <StringValue>Waypoint B is located at: x =</StringValue>
                                          <RealVariable>xWaypoint_B</RealVariable>
                                          <StringValue>y =</StringValue>
                                          <RealVariable>yWaypoint_B</RealVariable>
                                          <StringValue>z =</StringValue>
                                          <RealVariable>zWaypoint_B</RealVariable>
                                       </Arguments>
                                    </Command>
                                 </NodeBody>
                              </Node>
                           </NodeList>
                        </NodeBody>
                     </Node>
                     <Node NodeType="NodeList" epx="Sequence" LineNo="144" ColNo="3">
                        <NodeId>Command_Fly2B</NodeId>
                        <StartCondition>
                           <AND>
                              <EQInternal>
                                 <NodeStateVariable>
                                    <NodeRef dir="sibling">Set_WaypointB</NodeRef>
                                 </NodeStateVariable>
                                 <NodeStateValue>FINISHED</NodeStateValue>
                              </EQInternal>
                              <EQInternal>
                                 <NodeStateVariable>
                                    <NodeId>Set_WaypointB</NodeId>
                                 </NodeStateVariable>
                                 <NodeStateValue>FINISHED</NodeStateValue>
                              </EQInternal>
                           </AND>
                        </StartCondition>
                        <PostCondition>
                           <BooleanVariable>Fly2B_Success</BooleanVariable>
                        </PostCondition>
                        <InvariantCondition>
                           <NOT>
                              <AND>
                                 <EQInternal>
                                    <NodeOutcomeVariable>
                                       <NodeRef dir="child">SynchronousCommand__13</NodeRef>
                                    </NodeOutcomeVariable>
                                    <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                 </EQInternal>
                                 <EQInternal>
                                    <NodeStateVariable>
                                       <NodeRef dir="child">SynchronousCommand__13</NodeRef>
                                    </NodeStateVariable>
                                    <NodeStateValue>FINISHED</NodeStateValue>
                                 </EQInternal>
                              </AND>
                           </NOT>
                        </InvariantCondition>
                        <NodeBody>
                           <NodeList>
                              <Node NodeType="NodeList" epx="SynchronousCommand" LineNo="147" ColNo="3">
                                 <NodeId>SynchronousCommand__13</NodeId>
                                 <NodeBody>
                                    <NodeList>
                                       <Node NodeType="NodeList" epx="aux">
                                          <NodeId>ep2cp_SynchronousCommandAux</NodeId>
                                          <VariableDeclarations>
                                             <DeclareVariable>
                                                <Name>ep2cp_return</Name>
                                                <Type>Boolean</Type>
                                             </DeclareVariable>
                                          </VariableDeclarations>
                                          <NodeBody>
                                             <NodeList>
                                                <Node NodeType="Command" epx="aux">
                                                   <NodeId>ep2cp_SynchronousCommandCommand</NodeId>
                                                   <EndCondition>
                                                      <IsKnown>
                                                         <BooleanVariable>ep2cp_return</BooleanVariable>
                                                      </IsKnown>
                                                   </EndCondition>
                                                   <NodeBody>
                                                      <Command>
                                                         <BooleanVariable>ep2cp_return</BooleanVariable>
                                                         <Name>
                                                            <StringValue>Fly2B</StringValue>
                                                         </Name>
                                                      </Command>
                                                   </NodeBody>
                                                </Node>
                                                <Node NodeType="Assignment" epx="aux">
                                                   <NodeId>ep2cp_SynchronousCommandAssignment</NodeId>
                                                   <StartCondition>
                                                      <EQInternal>
                                                         <NodeStateVariable>
                                                            <NodeRef dir="sibling">ep2cp_SynchronousCommandCommand</NodeRef>
                                                         </NodeStateVariable>
                                                         <NodeStateValue>FINISHED</NodeStateValue>
                                                      </EQInternal>
                                                   </StartCondition>
                                                   <NodeBody>
                                                      <Assignment>
                                                         <BooleanVariable>Fly2B_Success</BooleanVariable>
                                                         <BooleanRHS>
                                                            <BooleanVariable>ep2cp_return</BooleanVariable>
                                                         </BooleanRHS>
                                                      </Assignment>
                                                   </NodeBody>
                                                </Node>
                                             </NodeList>
                                          </NodeBody>
                                       </Node>
                                    </NodeList>
                                 </NodeBody>
                              </Node>
                           </NodeList>
                        </NodeBody>
                     </Node>
                     <Node NodeType="NodeList" epx="If" LineNo="150" ColNo="2">
                        <NodeId>if__14</NodeId>
                        <StartCondition>
                           <EQInternal>
                              <NodeStateVariable>
                                 <NodeRef dir="sibling">Command_Fly2B</NodeRef>
                              </NodeStateVariable>
                              <NodeStateValue>FINISHED</NodeStateValue>
                           </EQInternal>
                        </StartCondition>
                        <NodeBody>
                           <NodeList>
                              <Node NodeType="Empty" epx="Condition">
                                 <NodeId>ep2cp_IfTest</NodeId>
                                 <PostCondition>
                                    <BooleanVariable>Fly2B_Success</BooleanVariable>
                                 </PostCondition>
                              </Node>
                              <Node NodeType="NodeList" epx="Then" LineNo="152" ColNo="3">
                                 <NodeId>BLOCK__15</NodeId>
                                 <InvariantCondition>
                                    <NOT>
                                       <OR>
                                          <AND>
                                             <EQInternal>
                                                <NodeOutcomeVariable>
                                                   <NodeRef dir="child">COMMAND__16</NodeRef>
                                                </NodeOutcomeVariable>
                                                <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                             </EQInternal>
                                             <EQInternal>
                                                <NodeStateVariable>
                                                   <NodeRef dir="child">COMMAND__16</NodeRef>
                                                </NodeStateVariable>
                                                <NodeStateValue>FINISHED</NodeStateValue>
                                             </EQInternal>
                                          </AND>
                                          <AND>
                                             <EQInternal>
                                                <NodeOutcomeVariable>
                                                   <NodeRef dir="child">ASSIGNMENT__17</NodeRef>
                                                </NodeOutcomeVariable>
                                                <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                             </EQInternal>
                                             <EQInternal>
                                                <NodeStateVariable>
                                                   <NodeRef dir="child">ASSIGNMENT__17</NodeRef>
                                                </NodeStateVariable>
                                                <NodeStateValue>FINISHED</NodeStateValue>
                                             </EQInternal>
                                          </AND>
                                       </OR>
                                    </NOT>
                                 </InvariantCondition>
                                 <StartCondition>
                                    <EQInternal>
                                       <NodeOutcomeVariable>
                                          <NodeRef dir="sibling">ep2cp_IfTest</NodeRef>
                                       </NodeOutcomeVariable>
                                       <NodeOutcomeValue>SUCCESS</NodeOutcomeValue>
                                    </EQInternal>
                                 </StartCondition>
                                 <SkipCondition>
                                    <EQInternal>
                                       <NodeFailureVariable>
                                          <NodeRef dir="sibling">ep2cp_IfTest</NodeRef>
                                       </NodeFailureVariable>
                                       <NodeFailureValue>POST_CONDITION_FAILED</NodeFailureValue>
                                    </EQInternal>
                                 </SkipCondition>
                                 <NodeBody>
                                    <NodeList>
                                       <Node NodeType="Command" LineNo="151" ColNo="3">
                                          <NodeId>COMMAND__16</NodeId>
                                          <NodeBody>
                                             <Command>
                                                <Name>
                                                   <StringValue>pprint</StringValue>
                                                </Name>
                                                <Arguments LineNo="152" ColNo="10">
                                                   <StringValue>Successfully arrived at B and Science has been performed</StringValue>
                                                </Arguments>
                                             </Command>
                                          </NodeBody>
                                       </Node>
                                       <Node NodeType="Assignment" LineNo="153" ColNo="3">
                                          <NodeId>ASSIGNMENT__17</NodeId>
                                          <StartCondition>
                                             <EQInternal>
                                                <NodeStateVariable>
                                                   <NodeRef dir="sibling">COMMAND__16</NodeRef>
                                                </NodeStateVariable>
                                                <NodeStateValue>FINISHED</NodeStateValue>
                                             </EQInternal>
                                          </StartCondition>
                                          <NodeBody>
                                             <Assignment>
                                                <BooleanVariable>B_Complete</BooleanVariable>
                                                <BooleanRHS>
                                                   <BooleanValue>true</BooleanValue>
                                                </BooleanRHS>
                                             </Assignment>
                                          </NodeBody>
                                       </Node>
                                    </NodeList>
                                 </NodeBody>
                              </Node>
                              <Node NodeType="Command" epx="Else" LineNo="156" ColNo="3">
                                 <NodeId>COMMAND__19</NodeId>
                                 <StartCondition>
                                    <EQInternal>
                                       <NodeFailureVariable>
                                          <NodeRef dir="sibling">ep2cp_IfTest</NodeRef>
                                       </NodeFailureVariable>
                                       <NodeFailureValue>POST_CONDITION_FAILED</NodeFailureValue>
                                    </EQInternal>
                                 </StartCondition>
                                 <SkipCondition>
                                    <EQInternal>
                                       <NodeOutcomeVariable>
                                          <NodeRef dir="sibling">ep2cp_IfTest</NodeRef>
                                       </NodeOutcomeVariable>
                                       <NodeOutcomeValue>SUCCESS</NodeOutcomeValue>
                                    </EQInternal>
                                 </SkipCondition>
                                 <NodeBody>
                                    <Command>
                                       <Name>
                                          <StringValue>pprint</StringValue>
                                       </Name>
                                       <Arguments LineNo="157" ColNo="10">
                                          <StringValue>Flight to B has FAILED</StringValue>
                                       </Arguments>
                                    </Command>
                                 </NodeBody>
                              </Node>
                           </NodeList>
                        </NodeBody>
                     </Node>
                  </NodeList>
               </NodeBody>
            </Node>
         </NodeList>
      </NodeBody>
   </Node>
</PlexilPlan>