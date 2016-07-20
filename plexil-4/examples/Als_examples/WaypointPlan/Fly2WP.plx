<?xml version="1.0" encoding="UTF-8"?>
<PlexilPlan xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
            xmlns:tr="extended-plexil-translator"
            FileName="Fly2WP.ple">
   <GlobalDeclarations LineNo="59" ColNo="5">
      <StateDeclaration LineNo="59" ColNo="5">
         <Name>vel</Name>
         <Return>
            <Name>_return_0</Name>
            <Type>Real</Type>
         </Return>
      </StateDeclaration>
      <StateDeclaration LineNo="60" ColNo="5">
         <Name>xLoc</Name>
         <Return>
            <Name>_return_0</Name>
            <Type>Real</Type>
         </Return>
      </StateDeclaration>
      <StateDeclaration LineNo="61" ColNo="5">
         <Name>yLoc</Name>
         <Return>
            <Name>_return_0</Name>
            <Type>Real</Type>
         </Return>
      </StateDeclaration>
      <StateDeclaration LineNo="62" ColNo="5">
         <Name>zLoc</Name>
         <Return>
            <Name>_return_0</Name>
            <Type>Real</Type>
         </Return>
      </StateDeclaration>
      <StateDeclaration LineNo="63" ColNo="8">
         <Name>xTarget</Name>
         <Return>
            <Name>_return_0</Name>
            <Type>Integer</Type>
         </Return>
      </StateDeclaration>
      <StateDeclaration LineNo="64" ColNo="8">
         <Name>yTarget</Name>
         <Return>
            <Name>_return_0</Name>
            <Type>Integer</Type>
         </Return>
      </StateDeclaration>
      <StateDeclaration LineNo="65" ColNo="5">
         <Name>xWaypoint_A</Name>
         <Return>
            <Name>_return_0</Name>
            <Type>Real</Type>
         </Return>
      </StateDeclaration>
      <StateDeclaration LineNo="66" ColNo="5">
         <Name>yWaypoint_A</Name>
         <Return>
            <Name>_return_0</Name>
            <Type>Real</Type>
         </Return>
      </StateDeclaration>
      <StateDeclaration LineNo="67" ColNo="5">
         <Name>zWaypoint_A</Name>
         <Return>
            <Name>_return_0</Name>
            <Type>Real</Type>
         </Return>
      </StateDeclaration>
      <StateDeclaration LineNo="68" ColNo="5">
         <Name>xWaypoint_B</Name>
         <Return>
            <Name>_return_0</Name>
            <Type>Real</Type>
         </Return>
      </StateDeclaration>
      <StateDeclaration LineNo="69" ColNo="5">
         <Name>yWaypoint_B</Name>
         <Return>
            <Name>_return_0</Name>
            <Type>Real</Type>
         </Return>
      </StateDeclaration>
      <StateDeclaration LineNo="70" ColNo="5">
         <Name>zWaypoint_B</Name>
         <Return>
            <Name>_return_0</Name>
            <Type>Real</Type>
         </Return>
      </StateDeclaration>
      <CommandDeclaration LineNo="72" ColNo="8">
         <Name>TakePic</Name>
         <Return>
            <Name>_return_0</Name>
            <Type>Boolean</Type>
         </Return>
         <Parameter>
            <Type>String</Type>
         </Parameter>
      </CommandDeclaration>
      <CommandDeclaration LineNo="73" ColNo="8">
         <Name>UpdatePlan</Name>
         <Return>
            <Name>_return_0</Name>
            <Type>Boolean</Type>
         </Return>
         <Parameter>
            <Type>String</Type>
         </Parameter>
      </CommandDeclaration>
      <CommandDeclaration LineNo="74" ColNo="8">
         <Name>GetParams</Name>
         <Return>
            <Name>_return_0</Name>
            <Type>Boolean</Type>
         </Return>
         <Parameter>
            <Name>w</Name>
            <Type>Real</Type>
         </Parameter>
         <Parameter>
            <Name>x</Name>
            <Type>Real</Type>
         </Parameter>
         <Parameter>
            <Name>y</Name>
            <Type>Real</Type>
         </Parameter>
         <Parameter>
            <Name>z</Name>
            <Type>Real</Type>
         </Parameter>
         <Parameter>
            <Type>String</Type>
         </Parameter>
      </CommandDeclaration>
      <CommandDeclaration LineNo="75" ColNo="8">
         <Name>UpdateFlight</Name>
         <Return>
            <Name>_return_0</Name>
            <Type>Boolean</Type>
         </Return>
         <Parameter>
            <Type>Integer</Type>
         </Parameter>
         <Parameter>
            <Type>Integer</Type>
         </Parameter>
         <Parameter>
            <Type>Integer</Type>
         </Parameter>
         <Parameter>
            <Type>Integer</Type>
         </Parameter>
         <Parameter>
            <Type>String</Type>
         </Parameter>
      </CommandDeclaration>
      <CommandDeclaration LineNo="76" ColNo="8">
         <Name>ActivateScience</Name>
         <Return>
            <Name>_return_0</Name>
            <Type>Boolean</Type>
         </Return>
         <Parameter>
            <Type>String</Type>
         </Parameter>
      </CommandDeclaration>
      <CommandDeclaration LineNo="78" ColNo="0">
         <Name>SendMessage</Name>
      </CommandDeclaration>
      <CommandDeclaration LineNo="79" ColNo="0">
         <Name>PlanComplete</Name>
      </CommandDeclaration>
      <CommandDeclaration LineNo="80" ColNo="0">
         <Name>SendReturnValue</Name>
      </CommandDeclaration>
      <CommandDeclaration LineNo="82" ColNo="0">
         <Name>pprint</Name>
      </CommandDeclaration>
   </GlobalDeclarations>
   <Node NodeType="NodeList" epx="Sequence" LineNo="86" ColNo="1">
      <NodeId>Waypoints</NodeId>
      <VariableDeclarations>
         <DeclareVariable LineNo="85" ColNo="1">
            <Name>WaypointPlan_Success</Name>
            <Type>Boolean</Type>
            <InitialValue>
               <BooleanValue>false</BooleanValue>
            </InitialValue>
         </DeclareVariable>
      </VariableDeclarations>
      <ExitCondition>
         <BooleanVariable>WaypointPlan_Success</BooleanVariable>
      </ExitCondition>
      <InvariantCondition>
         <NOT>
            <OR>
               <AND>
                  <EQInternal>
                     <NodeOutcomeVariable>
                        <NodeRef dir="child">COMMAND__0</NodeRef>
                     </NodeOutcomeVariable>
                     <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                  </EQInternal>
                  <EQInternal>
                     <NodeStateVariable>
                        <NodeRef dir="child">COMMAND__0</NodeRef>
                     </NodeStateVariable>
                     <NodeStateValue>FINISHED</NodeStateValue>
                  </EQInternal>
               </AND>
               <AND>
                  <EQInternal>
                     <NodeOutcomeVariable>
                        <NodeRef dir="child">Fly2A</NodeRef>
                     </NodeOutcomeVariable>
                     <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                  </EQInternal>
                  <EQInternal>
                     <NodeStateVariable>
                        <NodeRef dir="child">Fly2A</NodeRef>
                     </NodeStateVariable>
                     <NodeStateValue>FINISHED</NodeStateValue>
                  </EQInternal>
               </AND>
               <AND>
                  <EQInternal>
                     <NodeOutcomeVariable>
                        <NodeRef dir="child">Fly2B</NodeRef>
                     </NodeOutcomeVariable>
                     <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                  </EQInternal>
                  <EQInternal>
                     <NodeStateVariable>
                        <NodeRef dir="child">Fly2B</NodeRef>
                     </NodeStateVariable>
                     <NodeStateValue>FINISHED</NodeStateValue>
                  </EQInternal>
               </AND>
            </OR>
         </NOT>
      </InvariantCondition>
      <NodeBody>
         <NodeList>
            <Node NodeType="Command" LineNo="88" ColNo="1">
               <NodeId>COMMAND__0</NodeId>
               <NodeBody>
                  <Command>
                     <Name>
                        <StringValue>pprint</StringValue>
                     </Name>
                     <Arguments LineNo="89" ColNo="8">
                        <StringValue>######################## Initializing Plan ###############################</StringValue>
                     </Arguments>
                  </Command>
               </NodeBody>
            </Node>
            <Node NodeType="NodeList" epx="Sequence" LineNo="91" ColNo="8">
               <NodeId>Fly2A</NodeId>
               <VariableDeclarations>
                  <DeclareVariable>
                     <Name>ep2cp_hdl</Name>
                     <Type>String</Type>
                  </DeclareVariable>
               </VariableDeclarations>
               <StartCondition>
                  <EQInternal>
                     <NodeStateVariable>
                        <NodeRef dir="sibling">COMMAND__0</NodeRef>
                     </NodeStateVariable>
                     <NodeStateValue>FINISHED</NodeStateValue>
                  </EQInternal>
               </StartCondition>
               <InvariantCondition>
                  <NOT>
                     <OR>
                        <AND>
                           <EQInternal>
                              <NodeOutcomeVariable>
                                 <NodeRef dir="child">ep2cp_CmdWait</NodeRef>
                              </NodeOutcomeVariable>
                              <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                           </EQInternal>
                           <EQInternal>
                              <NodeStateVariable>
                                 <NodeRef dir="child">ep2cp_CmdWait</NodeRef>
                              </NodeStateVariable>
                              <NodeStateValue>FINISHED</NodeStateValue>
                           </EQInternal>
                        </AND>
                        <AND>
                           <EQInternal>
                              <NodeOutcomeVariable>
                                 <NodeRef dir="child">ep2cp_CmdAction_Fly2A</NodeRef>
                              </NodeOutcomeVariable>
                              <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                           </EQInternal>
                           <EQInternal>
                              <NodeStateVariable>
                                 <NodeRef dir="child">ep2cp_CmdAction_Fly2A</NodeRef>
                              </NodeStateVariable>
                              <NodeStateValue>FINISHED</NodeStateValue>
                           </EQInternal>
                        </AND>
                        <AND>
                           <EQInternal>
                              <NodeOutcomeVariable>
                                 <NodeRef dir="child">ep2cp_CmdReturn</NodeRef>
                              </NodeOutcomeVariable>
                              <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                           </EQInternal>
                           <EQInternal>
                              <NodeStateVariable>
                                 <NodeRef dir="child">ep2cp_CmdReturn</NodeRef>
                              </NodeStateVariable>
                              <NodeStateValue>FINISHED</NodeStateValue>
                           </EQInternal>
                        </AND>
                     </OR>
                  </NOT>
               </InvariantCondition>
               <NodeBody>
                  <NodeList>
                     <Node NodeType="Command">
                        <NodeId>ep2cp_CmdWait</NodeId>
                        <EndCondition>
                           <IsKnown>
                              <StringVariable>ep2cp_hdl</StringVariable>
                           </IsKnown>
                        </EndCondition>
                        <NodeBody>
                           <Command>
                              <StringVariable>ep2cp_hdl</StringVariable>
                              <Name>
                                 <StringValue>ReceiveCommand</StringValue>
                              </Name>
                              <Arguments>
                                 <StringValue>Fly2A</StringValue>
                              </Arguments>
                           </Command>
                        </NodeBody>
                     </Node>
                     <Node NodeType="NodeList">
                        <NodeId>ep2cp_CmdAction_Fly2A</NodeId>
                        <StartCondition>
                           <EQInternal>
                              <NodeStateVariable>
                                 <NodeRef dir="sibling">ep2cp_CmdWait</NodeRef>
                              </NodeStateVariable>
                              <NodeStateValue>FINISHED</NodeStateValue>
                           </EQInternal>
                        </StartCondition>
                        <NodeBody>
                           <NodeList>
                              <Node NodeType="NodeList" epx="Sequence" LineNo="93" ColNo="2">
                                 <NodeId>BLOCK__1</NodeId>
                                 <VariableDeclarations>
                                    <DeclareVariable LineNo="92" ColNo="2">
                                       <Name>At_A</Name>
                                       <Type>Boolean</Type>
                                       <InitialValue>
                                          <BooleanValue>false</BooleanValue>
                                       </InitialValue>
                                    </DeclareVariable>
                                 </VariableDeclarations>
                                 <InvariantCondition>
                                    <NOT>
                                       <OR>
                                          <AND>
                                             <EQInternal>
                                                <NodeOutcomeVariable>
                                                   <NodeRef dir="child">COMMAND__2</NodeRef>
                                                </NodeOutcomeVariable>
                                                <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                             </EQInternal>
                                             <EQInternal>
                                                <NodeStateVariable>
                                                   <NodeRef dir="child">COMMAND__2</NodeRef>
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
                                          <AND>
                                             <EQInternal>
                                                <NodeOutcomeVariable>
                                                   <NodeRef dir="child">Not_at_A</NodeRef>
                                                </NodeOutcomeVariable>
                                                <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                             </EQInternal>
                                             <EQInternal>
                                                <NodeStateVariable>
                                                   <NodeRef dir="child">Not_at_A</NodeRef>
                                                </NodeStateVariable>
                                                <NodeStateValue>FINISHED</NodeStateValue>
                                             </EQInternal>
                                          </AND>
                                          <AND>
                                             <EQInternal>
                                                <NodeOutcomeVariable>
                                                   <NodeRef dir="child">Arrived_at_A</NodeRef>
                                                </NodeOutcomeVariable>
                                                <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                             </EQInternal>
                                             <EQInternal>
                                                <NodeStateVariable>
                                                   <NodeRef dir="child">Arrived_at_A</NodeRef>
                                                </NodeStateVariable>
                                                <NodeStateValue>FINISHED</NodeStateValue>
                                             </EQInternal>
                                          </AND>
                                       </OR>
                                    </NOT>
                                 </InvariantCondition>
                                 <NodeBody>
                                    <NodeList>
                                       <Node NodeType="Command" LineNo="94" ColNo="2">
                                          <NodeId>COMMAND__2</NodeId>
                                          <NodeBody>
                                             <Command>
                                                <Name>
                                                   <StringValue>pprint</StringValue>
                                                </Name>
                                                <Arguments LineNo="95" ColNo="9">
                                                   <StringValue>################## Starting flight to Waypoint A #########################</StringValue>
                                                </Arguments>
                                             </Command>
                                          </NodeBody>
                                       </Node>
                                       <Node NodeType="Command" LineNo="95" ColNo="2">
                                          <NodeId>COMMAND__3</NodeId>
                                          <StartCondition>
                                             <EQInternal>
                                                <NodeStateVariable>
                                                   <NodeRef dir="sibling">COMMAND__2</NodeRef>
                                                </NodeStateVariable>
                                                <NodeStateValue>FINISHED</NodeStateValue>
                                             </EQInternal>
                                          </StartCondition>
                                          <NodeBody>
                                             <Command>
                                                <Name>
                                                   <StringValue>pprint</StringValue>
                                                </Name>
                                                <Arguments LineNo="96" ColNo="9">
                                                   <StringValue>Waypoint A is at x =</StringValue>
                                                   <LookupNow>
                                                      <Name>
                                                         <StringValue>xWaypoint_A</StringValue>
                                                      </Name>
                                                   </LookupNow>
                                                   <StringValue>y =</StringValue>
                                                   <LookupNow>
                                                      <Name>
                                                         <StringValue>yWaypoint_A</StringValue>
                                                      </Name>
                                                   </LookupNow>
                                                   <StringValue>z =</StringValue>
                                                   <LookupNow>
                                                      <Name>
                                                         <StringValue>zWaypoint_A</StringValue>
                                                      </Name>
                                                   </LookupNow>
                                                </Arguments>
                                             </Command>
                                          </NodeBody>
                                       </Node>
                                       <Node NodeType="NodeList" epx="Sequence" LineNo="100" ColNo="3">
                                          <NodeId>Not_at_A</NodeId>
                                          <StartCondition>
                                             <AND>
                                                <EQInternal>
                                                   <NodeStateVariable>
                                                      <NodeRef dir="sibling">COMMAND__3</NodeRef>
                                                   </NodeStateVariable>
                                                   <NodeStateValue>FINISHED</NodeStateValue>
                                                </EQInternal>
                                                <NOT>
                                                   <BooleanVariable>At_A</BooleanVariable>
                                                </NOT>
                                             </AND>
                                          </StartCondition>
                                          <RepeatCondition>
                                             <NOT>
                                                <BooleanVariable>At_A</BooleanVariable>
                                             </NOT>
                                          </RepeatCondition>
                                          <PreCondition>
                                             <IsKnown>
                                                <BooleanVariable>At_A</BooleanVariable>
                                             </IsKnown>
                                          </PreCondition>
                                          <PostCondition>
                                             <BooleanVariable>At_A</BooleanVariable>
                                          </PostCondition>
                                          <InvariantCondition>
                                             <NOT>
                                                <OR>
                                                   <AND>
                                                      <EQInternal>
                                                         <NodeOutcomeVariable>
                                                            <NodeRef dir="child">COMMAND__4</NodeRef>
                                                         </NodeOutcomeVariable>
                                                         <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                      </EQInternal>
                                                      <EQInternal>
                                                         <NodeStateVariable>
                                                            <NodeRef dir="child">COMMAND__4</NodeRef>
                                                         </NodeStateVariable>
                                                         <NodeStateValue>FINISHED</NodeStateValue>
                                                      </EQInternal>
                                                   </AND>
                                                   <AND>
                                                      <EQInternal>
                                                         <NodeOutcomeVariable>
                                                            <NodeRef dir="child">COMMAND__5</NodeRef>
                                                         </NodeOutcomeVariable>
                                                         <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                      </EQInternal>
                                                      <EQInternal>
                                                         <NodeStateVariable>
                                                            <NodeRef dir="child">COMMAND__5</NodeRef>
                                                         </NodeStateVariable>
                                                         <NodeStateValue>FINISHED</NodeStateValue>
                                                      </EQInternal>
                                                   </AND>
                                                   <AND>
                                                      <EQInternal>
                                                         <NodeOutcomeVariable>
                                                            <NodeRef dir="child">ExecuteGetParams</NodeRef>
                                                         </NodeOutcomeVariable>
                                                         <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                      </EQInternal>
                                                      <EQInternal>
                                                         <NodeStateVariable>
                                                            <NodeRef dir="child">ExecuteGetParams</NodeRef>
                                                         </NodeStateVariable>
                                                         <NodeStateValue>FINISHED</NodeStateValue>
                                                      </EQInternal>
                                                   </AND>
                                                   <AND>
                                                      <EQInternal>
                                                         <NodeOutcomeVariable>
                                                            <NodeRef dir="child">MonitorParams</NodeRef>
                                                         </NodeOutcomeVariable>
                                                         <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                      </EQInternal>
                                                      <EQInternal>
                                                         <NodeStateVariable>
                                                            <NodeRef dir="child">MonitorParams</NodeRef>
                                                         </NodeStateVariable>
                                                         <NodeStateValue>FINISHED</NodeStateValue>
                                                      </EQInternal>
                                                   </AND>
                                                </OR>
                                             </NOT>
                                          </InvariantCondition>
                                          <NodeBody>
                                             <NodeList>
                                                <Node NodeType="Command" LineNo="104" ColNo="3">
                                                   <NodeId>COMMAND__4</NodeId>
                                                   <NodeBody>
                                                      <Command>
                                                         <Name>
                                                            <StringValue>pprint</StringValue>
                                                         </Name>
                                                         <Arguments LineNo="105" ColNo="10">
                                                            <StringValue>#########################################################################</StringValue>
                                                         </Arguments>
                                                      </Command>
                                                   </NodeBody>
                                                </Node>
                                                <Node NodeType="Command" LineNo="105" ColNo="3">
                                                   <NodeId>COMMAND__5</NodeId>
                                                   <StartCondition>
                                                      <EQInternal>
                                                         <NodeStateVariable>
                                                            <NodeRef dir="sibling">COMMAND__4</NodeRef>
                                                         </NodeStateVariable>
                                                         <NodeStateValue>FINISHED</NodeStateValue>
                                                      </EQInternal>
                                                   </StartCondition>
                                                   <NodeBody>
                                                      <Command>
                                                         <Name>
                                                            <StringValue>pprint</StringValue>
                                                         </Name>
                                                         <Arguments LineNo="106" ColNo="10">
                                                            <StringValue>Currently at x =</StringValue>
                                                            <LookupNow>
                                                               <Name>
                                                                  <StringValue>xLoc</StringValue>
                                                               </Name>
                                                            </LookupNow>
                                                            <StringValue>y =</StringValue>
                                                            <LookupNow>
                                                               <Name>
                                                                  <StringValue>yLoc</StringValue>
                                                               </Name>
                                                            </LookupNow>
                                                            <StringValue>z =</StringValue>
                                                            <LookupNow>
                                                               <Name>
                                                                  <StringValue>zLoc</StringValue>
                                                               </Name>
                                                            </LookupNow>
                                                         </Arguments>
                                                      </Command>
                                                   </NodeBody>
                                                </Node>
                                                <Node NodeType="NodeList" epx="Sequence" LineNo="110" ColNo="4">
                                                   <NodeId>ExecuteGetParams</NodeId>
                                                   <VariableDeclarations>
                                                      <DeclareVariable LineNo="109" ColNo="4">
                                                         <Name>velocity</Name>
                                                         <Type>Real</Type>
                                                      </DeclareVariable>
                                                      <DeclareVariable LineNo="110" ColNo="4">
                                                         <Name>xLocation</Name>
                                                         <Type>Real</Type>
                                                      </DeclareVariable>
                                                      <DeclareVariable LineNo="111" ColNo="4">
                                                         <Name>yLocation</Name>
                                                         <Type>Real</Type>
                                                      </DeclareVariable>
                                                      <DeclareVariable LineNo="112" ColNo="4">
                                                         <Name>zLocation</Name>
                                                         <Type>Real</Type>
                                                      </DeclareVariable>
                                                   </VariableDeclarations>
                                                   <StartCondition>
                                                      <EQInternal>
                                                         <NodeStateVariable>
                                                            <NodeRef dir="sibling">COMMAND__5</NodeRef>
                                                         </NodeStateVariable>
                                                         <NodeStateValue>FINISHED</NodeStateValue>
                                                      </EQInternal>
                                                   </StartCondition>
                                                   <InvariantCondition>
                                                      <NOT>
                                                         <OR>
                                                            <AND>
                                                               <EQInternal>
                                                                  <NodeOutcomeVariable>
                                                                     <NodeRef dir="child">ASSIGNMENT__6</NodeRef>
                                                                  </NodeOutcomeVariable>
                                                                  <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                               </EQInternal>
                                                               <EQInternal>
                                                                  <NodeStateVariable>
                                                                     <NodeRef dir="child">ASSIGNMENT__6</NodeRef>
                                                                  </NodeStateVariable>
                                                                  <NodeStateValue>FINISHED</NodeStateValue>
                                                               </EQInternal>
                                                            </AND>
                                                            <AND>
                                                               <EQInternal>
                                                                  <NodeOutcomeVariable>
                                                                     <NodeRef dir="child">ASSIGNMENT__7</NodeRef>
                                                                  </NodeOutcomeVariable>
                                                                  <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                               </EQInternal>
                                                               <EQInternal>
                                                                  <NodeStateVariable>
                                                                     <NodeRef dir="child">ASSIGNMENT__7</NodeRef>
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
                                                            <AND>
                                                               <EQInternal>
                                                                  <NodeOutcomeVariable>
                                                                     <NodeRef dir="child">ASSIGNMENT__9</NodeRef>
                                                                  </NodeOutcomeVariable>
                                                                  <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                               </EQInternal>
                                                               <EQInternal>
                                                                  <NodeStateVariable>
                                                                     <NodeRef dir="child">ASSIGNMENT__9</NodeRef>
                                                                  </NodeStateVariable>
                                                                  <NodeStateValue>FINISHED</NodeStateValue>
                                                               </EQInternal>
                                                            </AND>
                                                            <AND>
                                                               <EQInternal>
                                                                  <NodeOutcomeVariable>
                                                                     <NodeRef dir="child">GetParams</NodeRef>
                                                                  </NodeOutcomeVariable>
                                                                  <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                               </EQInternal>
                                                               <EQInternal>
                                                                  <NodeStateVariable>
                                                                     <NodeRef dir="child">GetParams</NodeRef>
                                                                  </NodeStateVariable>
                                                                  <NodeStateValue>FINISHED</NodeStateValue>
                                                               </EQInternal>
                                                            </AND>
                                                            <AND>
                                                               <EQInternal>
                                                                  <NodeOutcomeVariable>
                                                                     <NodeRef dir="child">CheckLocation</NodeRef>
                                                                  </NodeOutcomeVariable>
                                                                  <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                               </EQInternal>
                                                               <EQInternal>
                                                                  <NodeStateVariable>
                                                                     <NodeRef dir="child">CheckLocation</NodeRef>
                                                                  </NodeStateVariable>
                                                                  <NodeStateValue>FINISHED</NodeStateValue>
                                                               </EQInternal>
                                                            </AND>
                                                         </OR>
                                                      </NOT>
                                                   </InvariantCondition>
                                                   <NodeBody>
                                                      <NodeList>
                                                         <Node NodeType="Assignment" LineNo="116" ColNo="4">
                                                            <NodeId>ASSIGNMENT__6</NodeId>
                                                            <NodeBody>
                                                               <Assignment>
                                                                  <RealVariable>velocity</RealVariable>
                                                                  <NumericRHS>
                                                                     <LookupNow>
                                                                        <Name>
                                                                           <StringValue>vel</StringValue>
                                                                        </Name>
                                                                     </LookupNow>
                                                                  </NumericRHS>
                                                               </Assignment>
                                                            </NodeBody>
                                                         </Node>
                                                         <Node NodeType="Assignment" LineNo="117" ColNo="4">
                                                            <NodeId>ASSIGNMENT__7</NodeId>
                                                            <StartCondition>
                                                               <EQInternal>
                                                                  <NodeStateVariable>
                                                                     <NodeRef dir="sibling">ASSIGNMENT__6</NodeRef>
                                                                  </NodeStateVariable>
                                                                  <NodeStateValue>FINISHED</NodeStateValue>
                                                               </EQInternal>
                                                            </StartCondition>
                                                            <NodeBody>
                                                               <Assignment>
                                                                  <RealVariable>xLocation</RealVariable>
                                                                  <NumericRHS>
                                                                     <LookupNow>
                                                                        <Name>
                                                                           <StringValue>xLoc</StringValue>
                                                                        </Name>
                                                                     </LookupNow>
                                                                  </NumericRHS>
                                                               </Assignment>
                                                            </NodeBody>
                                                         </Node>
                                                         <Node NodeType="Assignment" LineNo="118" ColNo="4">
                                                            <NodeId>ASSIGNMENT__8</NodeId>
                                                            <StartCondition>
                                                               <EQInternal>
                                                                  <NodeStateVariable>
                                                                     <NodeRef dir="sibling">ASSIGNMENT__7</NodeRef>
                                                                  </NodeStateVariable>
                                                                  <NodeStateValue>FINISHED</NodeStateValue>
                                                               </EQInternal>
                                                            </StartCondition>
                                                            <NodeBody>
                                                               <Assignment>
                                                                  <RealVariable>yLocation</RealVariable>
                                                                  <NumericRHS>
                                                                     <LookupNow>
                                                                        <Name>
                                                                           <StringValue>yLoc</StringValue>
                                                                        </Name>
                                                                     </LookupNow>
                                                                  </NumericRHS>
                                                               </Assignment>
                                                            </NodeBody>
                                                         </Node>
                                                         <Node NodeType="Assignment" LineNo="119" ColNo="4">
                                                            <NodeId>ASSIGNMENT__9</NodeId>
                                                            <StartCondition>
                                                               <EQInternal>
                                                                  <NodeStateVariable>
                                                                     <NodeRef dir="sibling">ASSIGNMENT__8</NodeRef>
                                                                  </NodeStateVariable>
                                                                  <NodeStateValue>FINISHED</NodeStateValue>
                                                               </EQInternal>
                                                            </StartCondition>
                                                            <NodeBody>
                                                               <Assignment>
                                                                  <RealVariable>zLocation</RealVariable>
                                                                  <NumericRHS>
                                                                     <LookupNow>
                                                                        <Name>
                                                                           <StringValue>zLoc</StringValue>
                                                                        </Name>
                                                                     </LookupNow>
                                                                  </NumericRHS>
                                                               </Assignment>
                                                            </NodeBody>
                                                         </Node>
                                                         <Node NodeType="NodeList" epx="Sequence" LineNo="123" ColNo="5">
                                                            <NodeId>GetParams</NodeId>
                                                            <VariableDeclarations>
                                                               <DeclareVariable LineNo="122" ColNo="5">
                                                                  <Name>GetParamsSuccess</Name>
                                                                  <Type>Boolean</Type>
                                                               </DeclareVariable>
                                                            </VariableDeclarations>
                                                            <StartCondition>
                                                               <EQInternal>
                                                                  <NodeStateVariable>
                                                                     <NodeRef dir="sibling">ASSIGNMENT__9</NodeRef>
                                                                  </NodeStateVariable>
                                                                  <NodeStateValue>FINISHED</NodeStateValue>
                                                               </EQInternal>
                                                            </StartCondition>
                                                            <PostCondition>
                                                               <BooleanVariable>GetParamsSuccess</BooleanVariable>
                                                            </PostCondition>
                                                            <InvariantCondition>
                                                               <NOT>
                                                                  <OR>
                                                                     <AND>
                                                                        <EQInternal>
                                                                           <NodeOutcomeVariable>
                                                                              <NodeRef dir="child">COMMAND__10</NodeRef>
                                                                           </NodeOutcomeVariable>
                                                                           <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                                        </EQInternal>
                                                                        <EQInternal>
                                                                           <NodeStateVariable>
                                                                              <NodeRef dir="child">COMMAND__10</NodeRef>
                                                                           </NodeStateVariable>
                                                                           <NodeStateValue>FINISHED</NodeStateValue>
                                                                        </EQInternal>
                                                                     </AND>
                                                                     <AND>
                                                                        <EQInternal>
                                                                           <NodeOutcomeVariable>
                                                                              <NodeRef dir="child">COMMAND__11</NodeRef>
                                                                           </NodeOutcomeVariable>
                                                                           <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                                        </EQInternal>
                                                                        <EQInternal>
                                                                           <NodeStateVariable>
                                                                              <NodeRef dir="child">COMMAND__11</NodeRef>
                                                                           </NodeStateVariable>
                                                                           <NodeStateValue>FINISHED</NodeStateValue>
                                                                        </EQInternal>
                                                                     </AND>
                                                                     <AND>
                                                                        <EQInternal>
                                                                           <NodeOutcomeVariable>
                                                                              <NodeRef dir="child">Command_GetParams</NodeRef>
                                                                           </NodeOutcomeVariable>
                                                                           <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                                        </EQInternal>
                                                                        <EQInternal>
                                                                           <NodeStateVariable>
                                                                              <NodeRef dir="child">Command_GetParams</NodeRef>
                                                                           </NodeStateVariable>
                                                                           <NodeStateValue>FINISHED</NodeStateValue>
                                                                        </EQInternal>
                                                                     </AND>
                                                                     <AND>
                                                                        <EQInternal>
                                                                           <NodeOutcomeVariable>
                                                                              <NodeRef dir="child">if__13</NodeRef>
                                                                           </NodeOutcomeVariable>
                                                                           <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                                        </EQInternal>
                                                                        <EQInternal>
                                                                           <NodeStateVariable>
                                                                              <NodeRef dir="child">if__13</NodeRef>
                                                                           </NodeStateVariable>
                                                                           <NodeStateValue>FINISHED</NodeStateValue>
                                                                        </EQInternal>
                                                                     </AND>
                                                                  </OR>
                                                               </NOT>
                                                            </InvariantCondition>
                                                            <NodeBody>
                                                               <NodeList>
                                                                  <Node NodeType="Command" LineNo="125" ColNo="5">
                                                                     <NodeId>COMMAND__10</NodeId>
                                                                     <NodeBody>
                                                                        <Command>
                                                                           <Name>
                                                                              <StringValue>pprint</StringValue>
                                                                           </Name>
                                                                           <Arguments LineNo="126" ColNo="12">
                                                                              <StringValue> </StringValue>
                                                                           </Arguments>
                                                                        </Command>
                                                                     </NodeBody>
                                                                  </Node>
                                                                  <Node NodeType="Command" LineNo="126" ColNo="5">
                                                                     <NodeId>COMMAND__11</NodeId>
                                                                     <StartCondition>
                                                                        <EQInternal>
                                                                           <NodeStateVariable>
                                                                              <NodeRef dir="sibling">COMMAND__10</NodeRef>
                                                                           </NodeStateVariable>
                                                                           <NodeStateValue>FINISHED</NodeStateValue>
                                                                        </EQInternal>
                                                                     </StartCondition>
                                                                     <NodeBody>
                                                                        <Command>
                                                                           <Name>
                                                                              <StringValue>pprint</StringValue>
                                                                           </Name>
                                                                           <Arguments LineNo="127" ColNo="12">
                                                                              <StringValue>Entering GetParams</StringValue>
                                                                           </Arguments>
                                                                        </Command>
                                                                     </NodeBody>
                                                                  </Node>
                                                                  <Node NodeType="NodeList" epx="Sequence" LineNo="131" ColNo="6">
                                                                     <NodeId>Command_GetParams</NodeId>
                                                                     <StartCondition>
                                                                        <EQInternal>
                                                                           <NodeStateVariable>
                                                                              <NodeRef dir="sibling">COMMAND__11</NodeRef>
                                                                           </NodeStateVariable>
                                                                           <NodeStateValue>FINISHED</NodeStateValue>
                                                                        </EQInternal>
                                                                     </StartCondition>
                                                                     <InvariantCondition>
                                                                        <NOT>
                                                                           <AND>
                                                                              <EQInternal>
                                                                                 <NodeOutcomeVariable>
                                                                                    <NodeRef dir="child">SynchronousCommand__12</NodeRef>
                                                                                 </NodeOutcomeVariable>
                                                                                 <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                                              </EQInternal>
                                                                              <EQInternal>
                                                                                 <NodeStateVariable>
                                                                                    <NodeRef dir="child">SynchronousCommand__12</NodeRef>
                                                                                 </NodeStateVariable>
                                                                                 <NodeStateValue>FINISHED</NodeStateValue>
                                                                              </EQInternal>
                                                                           </AND>
                                                                        </NOT>
                                                                     </InvariantCondition>
                                                                     <NodeBody>
                                                                        <NodeList>
                                                                           <Node NodeType="NodeList" epx="SynchronousCommand" LineNo="131" ColNo="6">
                                                                              <NodeId>SynchronousCommand__12</NodeId>
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
                                                                                                         <StringValue>GetParams</StringValue>
                                                                                                      </Name>
                                                                                                      <Arguments LineNo="131" ColNo="54">
                                                                                                         <RealVariable>velocity</RealVariable>
                                                                                                         <RealVariable>xLocation</RealVariable>
                                                                                                         <RealVariable>yLocation</RealVariable>
                                                                                                         <RealVariable>zLocation</RealVariable>
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
                                                                                                      <BooleanVariable>GetParamsSuccess</BooleanVariable>
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
                                                                  <Node NodeType="NodeList" epx="If" LineNo="134" ColNo="5">
                                                                     <NodeId>if__13</NodeId>
                                                                     <StartCondition>
                                                                        <EQInternal>
                                                                           <NodeStateVariable>
                                                                              <NodeRef dir="sibling">Command_GetParams</NodeRef>
                                                                           </NodeStateVariable>
                                                                           <NodeStateValue>FINISHED</NodeStateValue>
                                                                        </EQInternal>
                                                                     </StartCondition>
                                                                     <NodeBody>
                                                                        <NodeList>
                                                                           <Node NodeType="Empty" epx="Condition">
                                                                              <NodeId>ep2cp_IfTest</NodeId>
                                                                              <PostCondition>
                                                                                 <BooleanVariable>GetParamsSuccess</BooleanVariable>
                                                                              </PostCondition>
                                                                           </Node>
                                                                           <Node NodeType="NodeList" epx="Then" LineNo="136" ColNo="6">
                                                                              <NodeId>BLOCK__14</NodeId>
                                                                              <InvariantCondition>
                                                                                 <NOT>
                                                                                    <OR>
                                                                                       <AND>
                                                                                          <EQInternal>
                                                                                             <NodeOutcomeVariable>
                                                                                                <NodeRef dir="child">COMMAND__15</NodeRef>
                                                                                             </NodeOutcomeVariable>
                                                                                             <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                                                          </EQInternal>
                                                                                          <EQInternal>
                                                                                             <NodeStateVariable>
                                                                                                <NodeRef dir="child">COMMAND__15</NodeRef>
                                                                                             </NodeStateVariable>
                                                                                             <NodeStateValue>FINISHED</NodeStateValue>
                                                                                          </EQInternal>
                                                                                       </AND>
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
                                                                                    <Node NodeType="Command" LineNo="135" ColNo="6">
                                                                                       <NodeId>COMMAND__15</NodeId>
                                                                                       <NodeBody>
                                                                                          <Command>
                                                                                             <Name>
                                                                                                <StringValue>pprint</StringValue>
                                                                                             </Name>
                                                                                             <Arguments LineNo="136" ColNo="13">
                                                                                                <StringValue>Parameters successfully obtained</StringValue>
                                                                                             </Arguments>
                                                                                          </Command>
                                                                                       </NodeBody>
                                                                                    </Node>
                                                                                    <Node NodeType="Command" LineNo="136" ColNo="6">
                                                                                       <NodeId>COMMAND__16</NodeId>
                                                                                       <StartCondition>
                                                                                          <EQInternal>
                                                                                             <NodeStateVariable>
                                                                                                <NodeRef dir="sibling">COMMAND__15</NodeRef>
                                                                                             </NodeStateVariable>
                                                                                             <NodeStateValue>FINISHED</NodeStateValue>
                                                                                          </EQInternal>
                                                                                       </StartCondition>
                                                                                       <NodeBody>
                                                                                          <Command>
                                                                                             <Name>
                                                                                                <StringValue>pprint</StringValue>
                                                                                             </Name>
                                                                                             <Arguments LineNo="137" ColNo="13">
                                                                                                <StringValue>Parameters received: vel =</StringValue>
                                                                                                <LookupNow>
                                                                                                   <Name>
                                                                                                      <StringValue>vel</StringValue>
                                                                                                   </Name>
                                                                                                </LookupNow>
                                                                                                <StringValue>x =</StringValue>
                                                                                                <LookupNow>
                                                                                                   <Name>
                                                                                                      <StringValue>xLoc</StringValue>
                                                                                                   </Name>
                                                                                                </LookupNow>
                                                                                                <StringValue>y =</StringValue>
                                                                                                <LookupNow>
                                                                                                   <Name>
                                                                                                      <StringValue>yLoc</StringValue>
                                                                                                   </Name>
                                                                                                </LookupNow>
                                                                                                <StringValue>z =</StringValue>
                                                                                                <LookupNow>
                                                                                                   <Name>
                                                                                                      <StringValue>zLoc</StringValue>
                                                                                                   </Name>
                                                                                                </LookupNow>
                                                                                             </Arguments>
                                                                                          </Command>
                                                                                       </NodeBody>
                                                                                    </Node>
                                                                                 </NodeList>
                                                                              </NodeBody>
                                                                           </Node>
                                                                           <Node NodeType="Command" epx="Else" LineNo="140" ColNo="6">
                                                                              <NodeId>COMMAND__18</NodeId>
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
                                                                                    <Arguments LineNo="141" ColNo="13">
                                                                                       <StringValue>Obtaining parameters FAILED!!!</StringValue>
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
                                                         <Node NodeType="NodeList" epx="Concurrence" LineNo="147" ColNo="19">
                                                            <NodeId>CheckLocation</NodeId>
                                                            <StartCondition>
                                                               <EQInternal>
                                                                  <NodeStateVariable>
                                                                     <NodeRef dir="sibling">GetParams</NodeRef>
                                                                  </NodeStateVariable>
                                                                  <NodeStateValue>FINISHED</NodeStateValue>
                                                               </EQInternal>
                                                            </StartCondition>
                                                            <PostCondition>
                                                               <OR>
                                                                  <EQInternal>
                                                                     <NodeOutcomeVariable>
                                                                        <NodeId>EnRoute_to_A</NodeId>
                                                                     </NodeOutcomeVariable>
                                                                     <NodeOutcomeValue>SUCCESS</NodeOutcomeValue>
                                                                  </EQInternal>
                                                                  <EQInternal>
                                                                     <NodeOutcomeVariable>
                                                                        <NodeId>Arriving_at_A</NodeId>
                                                                     </NodeOutcomeVariable>
                                                                     <NodeOutcomeValue>SUCCESS</NodeOutcomeValue>
                                                                  </EQInternal>
                                                                  <EQInternal>
                                                                     <NodeOutcomeVariable>
                                                                        <NodeId>Arrived_at_A</NodeId>
                                                                     </NodeOutcomeVariable>
                                                                     <NodeOutcomeValue>SUCCESS</NodeOutcomeValue>
                                                                  </EQInternal>
                                                               </OR>
                                                            </PostCondition>
                                                            <NodeBody>
                                                               <NodeList>
                                                                  <Node NodeType="Command" LineNo="155" ColNo="6">
                                                                     <NodeId>EnRoute_to_A</NodeId>
                                                                     <StartCondition>
                                                                        <OR>
                                                                           <GT>
                                                                              <SUB LineNo="153" ColNo="42">
                                                                                 <LookupOnChange>
                                                                                    <Name>
                                                                                       <StringValue>xWaypoint_A</StringValue>
                                                                                    </Name>
                                                                                 </LookupOnChange>
                                                                                 <LookupOnChange>
                                                                                    <Name>
                                                                                       <StringValue>xLoc</StringValue>
                                                                                    </Name>
                                                                                 </LookupOnChange>
                                                                              </SUB>
                                                                              <IntegerValue>1</IntegerValue>
                                                                           </GT>
                                                                           <GT>
                                                                              <SUB LineNo="153" ColNo="86">
                                                                                 <LookupOnChange>
                                                                                    <Name>
                                                                                       <StringValue>yWaypoint_A</StringValue>
                                                                                    </Name>
                                                                                 </LookupOnChange>
                                                                                 <LookupOnChange>
                                                                                    <Name>
                                                                                       <StringValue>yLoc</StringValue>
                                                                                    </Name>
                                                                                 </LookupOnChange>
                                                                              </SUB>
                                                                              <IntegerValue>1</IntegerValue>
                                                                           </GT>
                                                                           <GT>
                                                                              <SUB LineNo="153" ColNo="130">
                                                                                 <LookupOnChange>
                                                                                    <Name>
                                                                                       <StringValue>zWaypoint_A</StringValue>
                                                                                    </Name>
                                                                                 </LookupOnChange>
                                                                                 <LookupOnChange>
                                                                                    <Name>
                                                                                       <StringValue>zLoc</StringValue>
                                                                                    </Name>
                                                                                 </LookupOnChange>
                                                                              </SUB>
                                                                              <IntegerValue>1</IntegerValue>
                                                                           </GT>
                                                                        </OR>
                                                                     </StartCondition>
                                                                     <SkipCondition>
                                                                        <AND>
                                                                           <LE>
                                                                              <SUB LineNo="154" ColNo="41">
                                                                                 <LookupOnChange>
                                                                                    <Name>
                                                                                       <StringValue>xWaypoint_A</StringValue>
                                                                                    </Name>
                                                                                 </LookupOnChange>
                                                                                 <LookupOnChange>
                                                                                    <Name>
                                                                                       <StringValue>xLoc</StringValue>
                                                                                    </Name>
                                                                                 </LookupOnChange>
                                                                              </SUB>
                                                                              <IntegerValue>1</IntegerValue>
                                                                           </LE>
                                                                           <LE>
                                                                              <SUB LineNo="154" ColNo="86">
                                                                                 <LookupOnChange>
                                                                                    <Name>
                                                                                       <StringValue>yWaypoint_A</StringValue>
                                                                                    </Name>
                                                                                 </LookupOnChange>
                                                                                 <LookupOnChange>
                                                                                    <Name>
                                                                                       <StringValue>yLoc</StringValue>
                                                                                    </Name>
                                                                                 </LookupOnChange>
                                                                              </SUB>
                                                                              <IntegerValue>1</IntegerValue>
                                                                           </LE>
                                                                           <LE>
                                                                              <SUB LineNo="154" ColNo="131">
                                                                                 <LookupOnChange>
                                                                                    <Name>
                                                                                       <StringValue>zWaypoint_A</StringValue>
                                                                                    </Name>
                                                                                 </LookupOnChange>
                                                                                 <LookupOnChange>
                                                                                    <Name>
                                                                                       <StringValue>zLoc</StringValue>
                                                                                    </Name>
                                                                                 </LookupOnChange>
                                                                              </SUB>
                                                                              <IntegerValue>1</IntegerValue>
                                                                           </LE>
                                                                        </AND>
                                                                     </SkipCondition>
                                                                     <NodeBody>
                                                                        <Command>
                                                                           <Name>
                                                                              <StringValue>pprint</StringValue>
                                                                           </Name>
                                                                           <Arguments LineNo="156" ColNo="13">
                                                                              <StringValue>Updated Flight Status: Maintaing Route to A</StringValue>
                                                                           </Arguments>
                                                                        </Command>
                                                                     </NodeBody>
                                                                  </Node>
                                                                  <Node NodeType="NodeList" epx="Sequence" LineNo="162" ColNo="6">
                                                                     <NodeId>Arriving_at_A</NodeId>
                                                                     <VariableDeclarations>
                                                                        <DeclareVariable LineNo="161" ColNo="6">
                                                                           <Name>ScienceActivated</Name>
                                                                           <Type>Boolean</Type>
                                                                        </DeclareVariable>
                                                                     </VariableDeclarations>
                                                                     <StartCondition>
                                                                        <AND>
                                                                           <LE>
                                                                              <SUB LineNo="163" ColNo="42">
                                                                                 <LookupOnChange>
                                                                                    <Name>
                                                                                       <StringValue>xWaypoint_A</StringValue>
                                                                                    </Name>
                                                                                 </LookupOnChange>
                                                                                 <LookupOnChange>
                                                                                    <Name>
                                                                                       <StringValue>xLoc</StringValue>
                                                                                    </Name>
                                                                                 </LookupOnChange>
                                                                              </SUB>
                                                                              <IntegerValue>1</IntegerValue>
                                                                           </LE>
                                                                           <LE>
                                                                              <SUB LineNo="163" ColNo="87">
                                                                                 <LookupOnChange>
                                                                                    <Name>
                                                                                       <StringValue>yWaypoint_A</StringValue>
                                                                                    </Name>
                                                                                 </LookupOnChange>
                                                                                 <LookupOnChange>
                                                                                    <Name>
                                                                                       <StringValue>yLoc</StringValue>
                                                                                    </Name>
                                                                                 </LookupOnChange>
                                                                              </SUB>
                                                                              <IntegerValue>1</IntegerValue>
                                                                           </LE>
                                                                           <LE>
                                                                              <SUB LineNo="163" ColNo="132">
                                                                                 <LookupOnChange>
                                                                                    <Name>
                                                                                       <StringValue>zWaypoint_A</StringValue>
                                                                                    </Name>
                                                                                 </LookupOnChange>
                                                                                 <LookupOnChange>
                                                                                    <Name>
                                                                                       <StringValue>zLoc</StringValue>
                                                                                    </Name>
                                                                                 </LookupOnChange>
                                                                              </SUB>
                                                                              <IntegerValue>1</IntegerValue>
                                                                           </LE>
                                                                        </AND>
                                                                     </StartCondition>
                                                                     <SkipCondition>
                                                                        <OR>
                                                                           <GT>
                                                                              <SUB LineNo="164" ColNo="41">
                                                                                 <LookupOnChange>
                                                                                    <Name>
                                                                                       <StringValue>xWaypoint_A</StringValue>
                                                                                    </Name>
                                                                                 </LookupOnChange>
                                                                                 <LookupOnChange>
                                                                                    <Name>
                                                                                       <StringValue>xLoc</StringValue>
                                                                                    </Name>
                                                                                 </LookupOnChange>
                                                                              </SUB>
                                                                              <IntegerValue>1</IntegerValue>
                                                                           </GT>
                                                                           <GT>
                                                                              <SUB LineNo="164" ColNo="85">
                                                                                 <LookupOnChange>
                                                                                    <Name>
                                                                                       <StringValue>yWaypoint_A</StringValue>
                                                                                    </Name>
                                                                                 </LookupOnChange>
                                                                                 <LookupOnChange>
                                                                                    <Name>
                                                                                       <StringValue>yLoc</StringValue>
                                                                                    </Name>
                                                                                 </LookupOnChange>
                                                                              </SUB>
                                                                              <IntegerValue>1</IntegerValue>
                                                                           </GT>
                                                                           <GT>
                                                                              <SUB LineNo="164" ColNo="129">
                                                                                 <LookupOnChange>
                                                                                    <Name>
                                                                                       <StringValue>zWaypoint_A</StringValue>
                                                                                    </Name>
                                                                                 </LookupOnChange>
                                                                                 <LookupOnChange>
                                                                                    <Name>
                                                                                       <StringValue>zLoc</StringValue>
                                                                                    </Name>
                                                                                 </LookupOnChange>
                                                                              </SUB>
                                                                              <IntegerValue>1</IntegerValue>
                                                                           </GT>
                                                                           <AND>
                                                                              <EQNumeric>
                                                                                 <SUB LineNo="164" ColNo="174">
                                                                                    <LookupOnChange>
                                                                                       <Name>
                                                                                          <StringValue>xWaypoint_A</StringValue>
                                                                                       </Name>
                                                                                    </LookupOnChange>
                                                                                    <LookupOnChange>
                                                                                       <Name>
                                                                                          <StringValue>xLoc</StringValue>
                                                                                       </Name>
                                                                                    </LookupOnChange>
                                                                                 </SUB>
                                                                                 <IntegerValue>0</IntegerValue>
                                                                              </EQNumeric>
                                                                              <EQNumeric>
                                                                                 <SUB LineNo="164" ColNo="219">
                                                                                    <LookupOnChange>
                                                                                       <Name>
                                                                                          <StringValue>yWaypoint_A</StringValue>
                                                                                       </Name>
                                                                                    </LookupOnChange>
                                                                                    <LookupOnChange>
                                                                                       <Name>
                                                                                          <StringValue>yLoc</StringValue>
                                                                                       </Name>
                                                                                    </LookupOnChange>
                                                                                 </SUB>
                                                                                 <IntegerValue>0</IntegerValue>
                                                                              </EQNumeric>
                                                                              <EQNumeric>
                                                                                 <SUB LineNo="164" ColNo="264">
                                                                                    <LookupOnChange>
                                                                                       <Name>
                                                                                          <StringValue>zWaypoint_A</StringValue>
                                                                                       </Name>
                                                                                    </LookupOnChange>
                                                                                    <LookupOnChange>
                                                                                       <Name>
                                                                                          <StringValue>zLoc</StringValue>
                                                                                       </Name>
                                                                                    </LookupOnChange>
                                                                                 </SUB>
                                                                                 <IntegerValue>0</IntegerValue>
                                                                              </EQNumeric>
                                                                           </AND>
                                                                        </OR>
                                                                     </SkipCondition>
                                                                     <PostCondition>
                                                                        <BooleanVariable>ScienceActivated</BooleanVariable>
                                                                     </PostCondition>
                                                                     <InvariantCondition>
                                                                        <NOT>
                                                                           <OR>
                                                                              <AND>
                                                                                 <EQInternal>
                                                                                    <NodeOutcomeVariable>
                                                                                       <NodeRef dir="child">COMMAND__20</NodeRef>
                                                                                    </NodeOutcomeVariable>
                                                                                    <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                                                 </EQInternal>
                                                                                 <EQInternal>
                                                                                    <NodeStateVariable>
                                                                                       <NodeRef dir="child">COMMAND__20</NodeRef>
                                                                                    </NodeStateVariable>
                                                                                    <NodeStateValue>FINISHED</NodeStateValue>
                                                                                 </EQInternal>
                                                                              </AND>
                                                                              <AND>
                                                                                 <EQInternal>
                                                                                    <NodeOutcomeVariable>
                                                                                       <NodeRef dir="child">COMMAND__21</NodeRef>
                                                                                    </NodeOutcomeVariable>
                                                                                    <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                                                 </EQInternal>
                                                                                 <EQInternal>
                                                                                    <NodeStateVariable>
                                                                                       <NodeRef dir="child">COMMAND__21</NodeRef>
                                                                                    </NodeStateVariable>
                                                                                    <NodeStateValue>FINISHED</NodeStateValue>
                                                                                 </EQInternal>
                                                                              </AND>
                                                                              <AND>
                                                                                 <EQInternal>
                                                                                    <NodeOutcomeVariable>
                                                                                       <NodeRef dir="child">Command_ActivateScience</NodeRef>
                                                                                    </NodeOutcomeVariable>
                                                                                    <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                                                 </EQInternal>
                                                                                 <EQInternal>
                                                                                    <NodeStateVariable>
                                                                                       <NodeRef dir="child">Command_ActivateScience</NodeRef>
                                                                                    </NodeStateVariable>
                                                                                    <NodeStateValue>FINISHED</NodeStateValue>
                                                                                 </EQInternal>
                                                                              </AND>
                                                                              <AND>
                                                                                 <EQInternal>
                                                                                    <NodeOutcomeVariable>
                                                                                       <NodeRef dir="child">if__23</NodeRef>
                                                                                    </NodeOutcomeVariable>
                                                                                    <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                                                 </EQInternal>
                                                                                 <EQInternal>
                                                                                    <NodeStateVariable>
                                                                                       <NodeRef dir="child">if__23</NodeRef>
                                                                                    </NodeStateVariable>
                                                                                    <NodeStateValue>FINISHED</NodeStateValue>
                                                                                 </EQInternal>
                                                                              </AND>
                                                                           </OR>
                                                                        </NOT>
                                                                     </InvariantCondition>
                                                                     <NodeBody>
                                                                        <NodeList>
                                                                           <Node NodeType="Command" LineNo="166" ColNo="6">
                                                                              <NodeId>COMMAND__20</NodeId>
                                                                              <NodeBody>
                                                                                 <Command>
                                                                                    <Name>
                                                                                       <StringValue>pprint</StringValue>
                                                                                    </Name>
                                                                                    <Arguments LineNo="167" ColNo="13">
                                                                                       <StringValue>Updated Flight Status: Arriving at A</StringValue>
                                                                                    </Arguments>
                                                                                 </Command>
                                                                              </NodeBody>
                                                                           </Node>
                                                                           <Node NodeType="Command" LineNo="167" ColNo="6">
                                                                              <NodeId>COMMAND__21</NodeId>
                                                                              <StartCondition>
                                                                                 <EQInternal>
                                                                                    <NodeStateVariable>
                                                                                       <NodeRef dir="sibling">COMMAND__20</NodeRef>
                                                                                    </NodeStateVariable>
                                                                                    <NodeStateValue>FINISHED</NodeStateValue>
                                                                                 </EQInternal>
                                                                              </StartCondition>
                                                                              <NodeBody>
                                                                                 <Command>
                                                                                    <Name>
                                                                                       <StringValue>pprint</StringValue>
                                                                                    </Name>
                                                                                    <Arguments LineNo="168" ColNo="13">
                                                                                       <StringValue>Activating science to perform at Waypoint A</StringValue>
                                                                                    </Arguments>
                                                                                 </Command>
                                                                              </NodeBody>
                                                                           </Node>
                                                                           <Node NodeType="NodeList" epx="Sequence" LineNo="172" ColNo="7">
                                                                              <NodeId>Command_ActivateScience</NodeId>
                                                                              <StartCondition>
                                                                                 <EQInternal>
                                                                                    <NodeStateVariable>
                                                                                       <NodeRef dir="sibling">COMMAND__21</NodeRef>
                                                                                    </NodeStateVariable>
                                                                                    <NodeStateValue>FINISHED</NodeStateValue>
                                                                                 </EQInternal>
                                                                              </StartCondition>
                                                                              <InvariantCondition>
                                                                                 <NOT>
                                                                                    <AND>
                                                                                       <EQInternal>
                                                                                          <NodeOutcomeVariable>
                                                                                             <NodeRef dir="child">SynchronousCommand__22</NodeRef>
                                                                                          </NodeOutcomeVariable>
                                                                                          <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                                                       </EQInternal>
                                                                                       <EQInternal>
                                                                                          <NodeStateVariable>
                                                                                             <NodeRef dir="child">SynchronousCommand__22</NodeRef>
                                                                                          </NodeStateVariable>
                                                                                          <NodeStateValue>FINISHED</NodeStateValue>
                                                                                       </EQInternal>
                                                                                    </AND>
                                                                                 </NOT>
                                                                              </InvariantCondition>
                                                                              <NodeBody>
                                                                                 <NodeList>
                                                                                    <Node NodeType="NodeList" epx="SynchronousCommand" LineNo="172" ColNo="7">
                                                                                       <NodeId>SynchronousCommand__22</NodeId>
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
                                                                                                                  <StringValue>ActivateScience</StringValue>
                                                                                                               </Name>
                                                                                                               <Arguments LineNo="172" ColNo="61">
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
                                                                                                               <BooleanVariable>ScienceActivated</BooleanVariable>
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
                                                                           <Node NodeType="NodeList" epx="If" LineNo="175" ColNo="6">
                                                                              <NodeId>if__23</NodeId>
                                                                              <StartCondition>
                                                                                 <EQInternal>
                                                                                    <NodeStateVariable>
                                                                                       <NodeRef dir="sibling">Command_ActivateScience</NodeRef>
                                                                                    </NodeStateVariable>
                                                                                    <NodeStateValue>FINISHED</NodeStateValue>
                                                                                 </EQInternal>
                                                                              </StartCondition>
                                                                              <NodeBody>
                                                                                 <NodeList>
                                                                                    <Node NodeType="Empty" epx="Condition">
                                                                                       <NodeId>ep2cp_IfTest</NodeId>
                                                                                       <PostCondition>
                                                                                          <BooleanVariable>ScienceActivated</BooleanVariable>
                                                                                       </PostCondition>
                                                                                    </Node>
                                                                                    <Node NodeType="Command" epx="Then" LineNo="176" ColNo="7">
                                                                                       <NodeId>COMMAND__25</NodeId>
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
                                                                                          <Command>
                                                                                             <Name>
                                                                                                <StringValue>pprint</StringValue>
                                                                                             </Name>
                                                                                             <Arguments LineNo="177" ColNo="14">
                                                                                                <StringValue>Science successfully activated</StringValue>
                                                                                             </Arguments>
                                                                                          </Command>
                                                                                       </NodeBody>
                                                                                    </Node>
                                                                                    <Node NodeType="Command" epx="Else" LineNo="180" ColNo="7">
                                                                                       <NodeId>COMMAND__27</NodeId>
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
                                                                                             <Arguments LineNo="181" ColNo="14">
                                                                                                <StringValue>Science activation FAILED!!!</StringValue>
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
                                                                  <Node NodeType="Assignment" LineNo="194" ColNo="6">
                                                                     <NodeId>Arrived_at_A</NodeId>
                                                                     <StartCondition>
                                                                        <AND>
                                                                           <EQNumeric>
                                                                              <LookupOnChange>
                                                                                 <Name>
                                                                                    <StringValue>xLoc</StringValue>
                                                                                 </Name>
                                                                              </LookupOnChange>
                                                                              <LookupOnChange>
                                                                                 <Name>
                                                                                    <StringValue>xWaypoint_A</StringValue>
                                                                                 </Name>
                                                                              </LookupOnChange>
                                                                           </EQNumeric>
                                                                           <EQNumeric>
                                                                              <LookupOnChange>
                                                                                 <Name>
                                                                                    <StringValue>yLoc</StringValue>
                                                                                 </Name>
                                                                              </LookupOnChange>
                                                                              <LookupOnChange>
                                                                                 <Name>
                                                                                    <StringValue>yWaypoint_A</StringValue>
                                                                                 </Name>
                                                                              </LookupOnChange>
                                                                           </EQNumeric>
                                                                           <EQNumeric>
                                                                              <LookupOnChange>
                                                                                 <Name>
                                                                                    <StringValue>zLoc</StringValue>
                                                                                 </Name>
                                                                              </LookupOnChange>
                                                                              <LookupOnChange>
                                                                                 <Name>
                                                                                    <StringValue>zWaypoint_A</StringValue>
                                                                                 </Name>
                                                                              </LookupOnChange>
                                                                           </EQNumeric>
                                                                        </AND>
                                                                     </StartCondition>
                                                                     <SkipCondition>
                                                                        <OR>
                                                                           <NENumeric>
                                                                              <LookupOnChange>
                                                                                 <Name>
                                                                                    <StringValue>xLoc</StringValue>
                                                                                 </Name>
                                                                              </LookupOnChange>
                                                                              <LookupOnChange>
                                                                                 <Name>
                                                                                    <StringValue>xWaypoint_A</StringValue>
                                                                                 </Name>
                                                                              </LookupOnChange>
                                                                           </NENumeric>
                                                                           <NENumeric>
                                                                              <LookupOnChange>
                                                                                 <Name>
                                                                                    <StringValue>yLoc</StringValue>
                                                                                 </Name>
                                                                              </LookupOnChange>
                                                                              <LookupOnChange>
                                                                                 <Name>
                                                                                    <StringValue>yWaypoint_A</StringValue>
                                                                                 </Name>
                                                                              </LookupOnChange>
                                                                           </NENumeric>
                                                                           <NENumeric>
                                                                              <LookupOnChange>
                                                                                 <Name>
                                                                                    <StringValue>zLoc</StringValue>
                                                                                 </Name>
                                                                              </LookupOnChange>
                                                                              <LookupOnChange>
                                                                                 <Name>
                                                                                    <StringValue>zWaypoint_A</StringValue>
                                                                                 </Name>
                                                                              </LookupOnChange>
                                                                           </NENumeric>
                                                                        </OR>
                                                                     </SkipCondition>
                                                                     <EndCondition>
                                                                        <BooleanVariable>At_A</BooleanVariable>
                                                                     </EndCondition>
                                                                     <PostCondition>
                                                                        <IsKnown>
                                                                           <BooleanVariable>At_A</BooleanVariable>
                                                                        </IsKnown>
                                                                     </PostCondition>
                                                                     <NodeBody>
                                                                        <Assignment>
                                                                           <BooleanVariable>At_A</BooleanVariable>
                                                                           <BooleanRHS>
                                                                              <BooleanValue>true</BooleanValue>
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
                                                <Node NodeType="NodeList" epx="Sequence" LineNo="207" ColNo="4">
                                                   <NodeId>MonitorParams</NodeId>
                                                   <VariableDeclarations>
                                                      <DeclareVariable LineNo="206" ColNo="4">
                                                         <Name>zTarget</Name>
                                                         <Type>Real</Type>
                                                         <InitialValue>
                                                            <RealValue>5</RealValue>
                                                         </InitialValue>
                                                      </DeclareVariable>
                                                      <DeclareVariable LineNo="207" ColNo="4">
                                                         <Name>velTarget</Name>
                                                         <Type>Real</Type>
                                                         <InitialValue>
                                                            <RealValue>1</RealValue>
                                                         </InitialValue>
                                                      </DeclareVariable>
                                                      <DeclareVariable LineNo="209" ColNo="4">
                                                         <Name>velState</Name>
                                                         <Type>Real</Type>
                                                      </DeclareVariable>
                                                      <DeclareVariable LineNo="210" ColNo="4">
                                                         <Name>xState</Name>
                                                         <Type>Real</Type>
                                                      </DeclareVariable>
                                                      <DeclareVariable LineNo="211" ColNo="4">
                                                         <Name>yState</Name>
                                                         <Type>Real</Type>
                                                      </DeclareVariable>
                                                      <DeclareVariable LineNo="212" ColNo="4">
                                                         <Name>zState</Name>
                                                         <Type>Real</Type>
                                                      </DeclareVariable>
                                                      <DeclareVariable LineNo="214" ColNo="4">
                                                         <Name>velFlag</Name>
                                                         <Type>Integer</Type>
                                                      </DeclareVariable>
                                                      <DeclareVariable LineNo="215" ColNo="4">
                                                         <Name>xFlag</Name>
                                                         <Type>Integer</Type>
                                                      </DeclareVariable>
                                                      <DeclareVariable LineNo="216" ColNo="4">
                                                         <Name>yFlag</Name>
                                                         <Type>Integer</Type>
                                                      </DeclareVariable>
                                                      <DeclareVariable LineNo="217" ColNo="4">
                                                         <Name>zFlag</Name>
                                                         <Type>Integer</Type>
                                                      </DeclareVariable>
                                                   </VariableDeclarations>
                                                   <StartCondition>
                                                      <EQInternal>
                                                         <NodeStateVariable>
                                                            <NodeRef dir="sibling">ExecuteGetParams</NodeRef>
                                                         </NodeStateVariable>
                                                         <NodeStateValue>FINISHED</NodeStateValue>
                                                      </EQInternal>
                                                   </StartCondition>
                                                   <SkipCondition>
                                                      <AND>
                                                         <EQInternal>
                                                            <NodeStateVariable>
                                                               <NodeRef dir="sibling">ExecuteGetParams</NodeRef>
                                                            </NodeStateVariable>
                                                            <NodeStateValue>FINISHED</NodeStateValue>
                                                         </EQInternal>
                                                         <BooleanVariable>At_A</BooleanVariable>
                                                      </AND>
                                                   </SkipCondition>
                                                   <InvariantCondition>
                                                      <NOT>
                                                         <OR>
                                                            <AND>
                                                               <EQInternal>
                                                                  <NodeOutcomeVariable>
                                                                     <NodeRef dir="child">COMMAND__29</NodeRef>
                                                                  </NodeOutcomeVariable>
                                                                  <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                               </EQInternal>
                                                               <EQInternal>
                                                                  <NodeStateVariable>
                                                                     <NodeRef dir="child">COMMAND__29</NodeRef>
                                                                  </NodeStateVariable>
                                                                  <NodeStateValue>FINISHED</NodeStateValue>
                                                               </EQInternal>
                                                            </AND>
                                                            <AND>
                                                               <EQInternal>
                                                                  <NodeOutcomeVariable>
                                                                     <NodeRef dir="child">COMMAND__30</NodeRef>
                                                                  </NodeOutcomeVariable>
                                                                  <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                               </EQInternal>
                                                               <EQInternal>
                                                                  <NodeStateVariable>
                                                                     <NodeRef dir="child">COMMAND__30</NodeRef>
                                                                  </NodeStateVariable>
                                                                  <NodeStateValue>FINISHED</NodeStateValue>
                                                               </EQInternal>
                                                            </AND>
                                                            <AND>
                                                               <EQInternal>
                                                                  <NodeOutcomeVariable>
                                                                     <NodeRef dir="child">Velocity</NodeRef>
                                                                  </NodeOutcomeVariable>
                                                                  <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                               </EQInternal>
                                                               <EQInternal>
                                                                  <NodeStateVariable>
                                                                     <NodeRef dir="child">Velocity</NodeRef>
                                                                  </NodeStateVariable>
                                                                  <NodeStateValue>FINISHED</NodeStateValue>
                                                               </EQInternal>
                                                            </AND>
                                                            <AND>
                                                               <EQInternal>
                                                                  <NodeOutcomeVariable>
                                                                     <NodeRef dir="child">Location</NodeRef>
                                                                  </NodeOutcomeVariable>
                                                                  <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                               </EQInternal>
                                                               <EQInternal>
                                                                  <NodeStateVariable>
                                                                     <NodeRef dir="child">Location</NodeRef>
                                                                  </NodeStateVariable>
                                                                  <NodeStateValue>FINISHED</NodeStateValue>
                                                               </EQInternal>
                                                            </AND>
                                                         </OR>
                                                      </NOT>
                                                   </InvariantCondition>
                                                   <NodeBody>
                                                      <NodeList>
                                                         <Node NodeType="Command" LineNo="220" ColNo="4">
                                                            <NodeId>COMMAND__29</NodeId>
                                                            <NodeBody>
                                                               <Command>
                                                                  <Name>
                                                                     <StringValue>pprint</StringValue>
                                                                  </Name>
                                                                  <Arguments LineNo="221" ColNo="11">
                                                                     <StringValue> </StringValue>
                                                                  </Arguments>
                                                               </Command>
                                                            </NodeBody>
                                                         </Node>
                                                         <Node NodeType="Command" LineNo="221" ColNo="4">
                                                            <NodeId>COMMAND__30</NodeId>
                                                            <StartCondition>
                                                               <EQInternal>
                                                                  <NodeStateVariable>
                                                                     <NodeRef dir="sibling">COMMAND__29</NodeRef>
                                                                  </NodeStateVariable>
                                                                  <NodeStateValue>FINISHED</NodeStateValue>
                                                               </EQInternal>
                                                            </StartCondition>
                                                            <NodeBody>
                                                               <Command>
                                                                  <Name>
                                                                     <StringValue>pprint</StringValue>
                                                                  </Name>
                                                                  <Arguments LineNo="222" ColNo="11">
                                                                     <StringValue>Entering MonitorParams</StringValue>
                                                                  </Arguments>
                                                               </Command>
                                                            </NodeBody>
                                                         </Node>
                                                         <Node NodeType="NodeList" epx="Sequence" LineNo="226" ColNo="5">
                                                            <NodeId>Velocity</NodeId>
                                                            <StartCondition>
                                                               <EQInternal>
                                                                  <NodeStateVariable>
                                                                     <NodeRef dir="sibling">COMMAND__30</NodeRef>
                                                                  </NodeStateVariable>
                                                                  <NodeStateValue>FINISHED</NodeStateValue>
                                                               </EQInternal>
                                                            </StartCondition>
                                                            <PreCondition>
                                                               <IsKnown>
                                                                  <RealVariable>velTarget</RealVariable>
                                                               </IsKnown>
                                                            </PreCondition>
                                                            <PostCondition>
                                                               <IsKnown>
                                                                  <IntegerVariable>velFlag</IntegerVariable>
                                                               </IsKnown>
                                                            </PostCondition>
                                                            <InvariantCondition>
                                                               <NOT>
                                                                  <OR>
                                                                     <AND>
                                                                        <EQInternal>
                                                                           <NodeOutcomeVariable>
                                                                              <NodeRef dir="child">COMMAND__31</NodeRef>
                                                                           </NodeOutcomeVariable>
                                                                           <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                                        </EQInternal>
                                                                        <EQInternal>
                                                                           <NodeStateVariable>
                                                                              <NodeRef dir="child">COMMAND__31</NodeRef>
                                                                           </NodeStateVariable>
                                                                           <NodeStateValue>FINISHED</NodeStateValue>
                                                                        </EQInternal>
                                                                     </AND>
                                                                     <AND>
                                                                        <EQInternal>
                                                                           <NodeOutcomeVariable>
                                                                              <NodeRef dir="child">ASSIGNMENT__32</NodeRef>
                                                                           </NodeOutcomeVariable>
                                                                           <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                                        </EQInternal>
                                                                        <EQInternal>
                                                                           <NodeStateVariable>
                                                                              <NodeRef dir="child">ASSIGNMENT__32</NodeRef>
                                                                           </NodeStateVariable>
                                                                           <NodeStateValue>FINISHED</NodeStateValue>
                                                                        </EQInternal>
                                                                     </AND>
                                                                     <AND>
                                                                        <EQInternal>
                                                                           <NodeOutcomeVariable>
                                                                              <NodeRef dir="child">if__33</NodeRef>
                                                                           </NodeOutcomeVariable>
                                                                           <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                                        </EQInternal>
                                                                        <EQInternal>
                                                                           <NodeStateVariable>
                                                                              <NodeRef dir="child">if__33</NodeRef>
                                                                           </NodeStateVariable>
                                                                           <NodeStateValue>FINISHED</NodeStateValue>
                                                                        </EQInternal>
                                                                     </AND>
                                                                  </OR>
                                                               </NOT>
                                                            </InvariantCondition>
                                                            <NodeBody>
                                                               <NodeList>
                                                                  <Node NodeType="Command" LineNo="228" ColNo="5">
                                                                     <NodeId>COMMAND__31</NodeId>
                                                                     <NodeBody>
                                                                        <Command>
                                                                           <Name>
                                                                              <StringValue>pprint</StringValue>
                                                                           </Name>
                                                                           <Arguments LineNo="229" ColNo="12">
                                                                              <StringValue>Determining velocity update</StringValue>
                                                                           </Arguments>
                                                                        </Command>
                                                                     </NodeBody>
                                                                  </Node>
                                                                  <Node NodeType="Assignment" LineNo="231" ColNo="5">
                                                                     <NodeId>ASSIGNMENT__32</NodeId>
                                                                     <StartCondition>
                                                                        <EQInternal>
                                                                           <NodeStateVariable>
                                                                              <NodeRef dir="sibling">COMMAND__31</NodeRef>
                                                                           </NodeStateVariable>
                                                                           <NodeStateValue>FINISHED</NodeStateValue>
                                                                        </EQInternal>
                                                                     </StartCondition>
                                                                     <NodeBody>
                                                                        <Assignment>
                                                                           <RealVariable>velState</RealVariable>
                                                                           <NumericRHS>
                                                                              <SUB LineNo="231" ColNo="28">
                                                                                 <LookupNow>
                                                                                    <Name>
                                                                                       <StringValue>vel</StringValue>
                                                                                    </Name>
                                                                                 </LookupNow>
                                                                                 <RealVariable>velTarget</RealVariable>
                                                                              </SUB>
                                                                           </NumericRHS>
                                                                        </Assignment>
                                                                     </NodeBody>
                                                                  </Node>
                                                                  <Node NodeType="NodeList" epx="If" LineNo="233" ColNo="5">
                                                                     <NodeId>if__33</NodeId>
                                                                     <StartCondition>
                                                                        <EQInternal>
                                                                           <NodeStateVariable>
                                                                              <NodeRef dir="sibling">ASSIGNMENT__32</NodeRef>
                                                                           </NodeStateVariable>
                                                                           <NodeStateValue>FINISHED</NodeStateValue>
                                                                        </EQInternal>
                                                                     </StartCondition>
                                                                     <NodeBody>
                                                                        <NodeList>
                                                                           <Node NodeType="Empty" epx="Condition">
                                                                              <NodeId>ep2cp_IfTest</NodeId>
                                                                              <PostCondition>
                                                                                 <LT>
                                                                                    <RealVariable>velState</RealVariable>
                                                                                    <IntegerValue>0</IntegerValue>
                                                                                 </LT>
                                                                              </PostCondition>
                                                                           </Node>
                                                                           <Node NodeType="Assignment" epx="Then" LineNo="235" ColNo="6">
                                                                              <NodeId>ASSIGNMENT__35</NodeId>
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
                                                                                 <Assignment>
                                                                                    <IntegerVariable>velFlag</IntegerVariable>
                                                                                    <NumericRHS>
                                                                                       <IntegerValue>1</IntegerValue>
                                                                                    </NumericRHS>
                                                                                 </Assignment>
                                                                              </NodeBody>
                                                                           </Node>
                                                                           <Node NodeType="Empty" epx="ElseIf">
                                                                              <NodeId>ep2cp_ElseIf-1</NodeId>
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
                                                                              <PostCondition>
                                                                                 <GT>
                                                                                    <RealVariable>velState</RealVariable>
                                                                                    <IntegerValue>0</IntegerValue>
                                                                                 </GT>
                                                                              </PostCondition>
                                                                           </Node>
                                                                           <Node NodeType="Assignment" epx="Then" LineNo="239" ColNo="6">
                                                                              <NodeId>ASSIGNMENT__37</NodeId>
                                                                              <StartCondition>
                                                                                 <EQInternal>
                                                                                    <NodeOutcomeVariable>
                                                                                       <NodeRef dir="sibling">ep2cp_ElseIf-1</NodeRef>
                                                                                    </NodeOutcomeVariable>
                                                                                    <NodeOutcomeValue>SUCCESS</NodeOutcomeValue>
                                                                                 </EQInternal>
                                                                              </StartCondition>
                                                                              <SkipCondition>
                                                                                 <NOT>
                                                                                    <EQInternal>
                                                                                       <NodeOutcomeVariable>
                                                                                          <NodeRef dir="sibling">ep2cp_ElseIf-1</NodeRef>
                                                                                       </NodeOutcomeVariable>
                                                                                       <NodeOutcomeValue>SUCCESS</NodeOutcomeValue>
                                                                                    </EQInternal>
                                                                                 </NOT>
                                                                              </SkipCondition>
                                                                              <NodeBody>
                                                                                 <Assignment>
                                                                                    <IntegerVariable>velFlag</IntegerVariable>
                                                                                    <NumericRHS>
                                                                                       <IntegerValue>-1</IntegerValue>
                                                                                    </NumericRHS>
                                                                                 </Assignment>
                                                                              </NodeBody>
                                                                           </Node>
                                                                           <Node NodeType="Assignment" epx="Else" LineNo="243" ColNo="6">
                                                                              <NodeId>ASSIGNMENT__39</NodeId>
                                                                              <StartCondition>
                                                                                 <EQInternal>
                                                                                    <NodeFailureVariable>
                                                                                       <NodeRef dir="sibling">ep2cp_ElseIf-1</NodeRef>
                                                                                    </NodeFailureVariable>
                                                                                    <NodeFailureValue>POST_CONDITION_FAILED</NodeFailureValue>
                                                                                 </EQInternal>
                                                                              </StartCondition>
                                                                              <SkipCondition>
                                                                                 <EQInternal>
                                                                                    <NodeOutcomeVariable>
                                                                                       <NodeRef dir="sibling">ep2cp_ElseIf-1</NodeRef>
                                                                                    </NodeOutcomeVariable>
                                                                                    <NodeOutcomeValue>SKIPPED</NodeOutcomeValue>
                                                                                 </EQInternal>
                                                                              </SkipCondition>
                                                                              <NodeBody>
                                                                                 <Assignment>
                                                                                    <IntegerVariable>velFlag</IntegerVariable>
                                                                                    <NumericRHS>
                                                                                       <IntegerValue>0</IntegerValue>
                                                                                    </NumericRHS>
                                                                                 </Assignment>
                                                                              </NodeBody>
                                                                           </Node>
                                                                        </NodeList>
                                                                     </NodeBody>
                                                                  </Node>
                                                               </NodeList>
                                                            </NodeBody>
                                                         </Node>
                                                         <Node NodeType="NodeList" epx="Sequence" LineNo="251" ColNo="5">
                                                            <NodeId>Location</NodeId>
                                                            <StartCondition>
                                                               <AND>
                                                                  <EQInternal>
                                                                     <NodeStateVariable>
                                                                        <NodeRef dir="sibling">Velocity</NodeRef>
                                                                     </NodeStateVariable>
                                                                     <NodeStateValue>FINISHED</NodeStateValue>
                                                                  </EQInternal>
                                                                  <EQInternal>
                                                                     <NodeStateVariable>
                                                                        <NodeId>Velocity</NodeId>
                                                                     </NodeStateVariable>
                                                                     <NodeStateValue>FINISHED</NodeStateValue>
                                                                  </EQInternal>
                                                               </AND>
                                                            </StartCondition>
                                                            <PreCondition>
                                                               <AND>
                                                                  <IsKnown>
                                                                     <LookupNow>
                                                                        <Name>
                                                                           <StringValue>xTarget</StringValue>
                                                                        </Name>
                                                                     </LookupNow>
                                                                  </IsKnown>
                                                                  <IsKnown>
                                                                     <LookupNow>
                                                                        <Name>
                                                                           <StringValue>yTarget</StringValue>
                                                                        </Name>
                                                                     </LookupNow>
                                                                  </IsKnown>
                                                                  <IsKnown>
                                                                     <RealVariable>zTarget</RealVariable>
                                                                  </IsKnown>
                                                               </AND>
                                                            </PreCondition>
                                                            <PostCondition>
                                                               <AND>
                                                                  <IsKnown>
                                                                     <IntegerVariable>xFlag</IntegerVariable>
                                                                  </IsKnown>
                                                                  <IsKnown>
                                                                     <IntegerVariable>yFlag</IntegerVariable>
                                                                  </IsKnown>
                                                                  <IsKnown>
                                                                     <IntegerVariable>zFlag</IntegerVariable>
                                                                  </IsKnown>
                                                               </AND>
                                                            </PostCondition>
                                                            <InvariantCondition>
                                                               <NOT>
                                                                  <OR>
                                                                     <AND>
                                                                        <EQInternal>
                                                                           <NodeOutcomeVariable>
                                                                              <NodeRef dir="child">ASSIGNMENT__40</NodeRef>
                                                                           </NodeOutcomeVariable>
                                                                           <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                                        </EQInternal>
                                                                        <EQInternal>
                                                                           <NodeStateVariable>
                                                                              <NodeRef dir="child">ASSIGNMENT__40</NodeRef>
                                                                           </NodeStateVariable>
                                                                           <NodeStateValue>FINISHED</NodeStateValue>
                                                                        </EQInternal>
                                                                     </AND>
                                                                     <AND>
                                                                        <EQInternal>
                                                                           <NodeOutcomeVariable>
                                                                              <NodeRef dir="child">ASSIGNMENT__41</NodeRef>
                                                                           </NodeOutcomeVariable>
                                                                           <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                                        </EQInternal>
                                                                        <EQInternal>
                                                                           <NodeStateVariable>
                                                                              <NodeRef dir="child">ASSIGNMENT__41</NodeRef>
                                                                           </NodeStateVariable>
                                                                           <NodeStateValue>FINISHED</NodeStateValue>
                                                                        </EQInternal>
                                                                     </AND>
                                                                     <AND>
                                                                        <EQInternal>
                                                                           <NodeOutcomeVariable>
                                                                              <NodeRef dir="child">ASSIGNMENT__42</NodeRef>
                                                                           </NodeOutcomeVariable>
                                                                           <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                                        </EQInternal>
                                                                        <EQInternal>
                                                                           <NodeStateVariable>
                                                                              <NodeRef dir="child">ASSIGNMENT__42</NodeRef>
                                                                           </NodeStateVariable>
                                                                           <NodeStateValue>FINISHED</NodeStateValue>
                                                                        </EQInternal>
                                                                     </AND>
                                                                     <AND>
                                                                        <EQInternal>
                                                                           <NodeOutcomeVariable>
                                                                              <NodeRef dir="child">xLocation</NodeRef>
                                                                           </NodeOutcomeVariable>
                                                                           <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                                        </EQInternal>
                                                                        <EQInternal>
                                                                           <NodeStateVariable>
                                                                              <NodeRef dir="child">xLocation</NodeRef>
                                                                           </NodeStateVariable>
                                                                           <NodeStateValue>FINISHED</NodeStateValue>
                                                                        </EQInternal>
                                                                     </AND>
                                                                     <AND>
                                                                        <EQInternal>
                                                                           <NodeOutcomeVariable>
                                                                              <NodeRef dir="child">yLocation</NodeRef>
                                                                           </NodeOutcomeVariable>
                                                                           <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                                        </EQInternal>
                                                                        <EQInternal>
                                                                           <NodeStateVariable>
                                                                              <NodeRef dir="child">yLocation</NodeRef>
                                                                           </NodeStateVariable>
                                                                           <NodeStateValue>FINISHED</NodeStateValue>
                                                                        </EQInternal>
                                                                     </AND>
                                                                     <AND>
                                                                        <EQInternal>
                                                                           <NodeOutcomeVariable>
                                                                              <NodeRef dir="child">zLocation</NodeRef>
                                                                           </NodeOutcomeVariable>
                                                                           <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                                        </EQInternal>
                                                                        <EQInternal>
                                                                           <NodeStateVariable>
                                                                              <NodeRef dir="child">zLocation</NodeRef>
                                                                           </NodeStateVariable>
                                                                           <NodeStateValue>FINISHED</NodeStateValue>
                                                                        </EQInternal>
                                                                     </AND>
                                                                     <AND>
                                                                        <EQInternal>
                                                                           <NodeOutcomeVariable>
                                                                              <NodeRef dir="child">COMMAND__67</NodeRef>
                                                                           </NodeOutcomeVariable>
                                                                           <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                                        </EQInternal>
                                                                        <EQInternal>
                                                                           <NodeStateVariable>
                                                                              <NodeRef dir="child">COMMAND__67</NodeRef>
                                                                           </NodeStateVariable>
                                                                           <NodeStateValue>FINISHED</NodeStateValue>
                                                                        </EQInternal>
                                                                     </AND>
                                                                     <AND>
                                                                        <EQInternal>
                                                                           <NodeOutcomeVariable>
                                                                              <NodeRef dir="child">COMMAND__68</NodeRef>
                                                                           </NodeOutcomeVariable>
                                                                           <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                                        </EQInternal>
                                                                        <EQInternal>
                                                                           <NodeStateVariable>
                                                                              <NodeRef dir="child">COMMAND__68</NodeRef>
                                                                           </NodeStateVariable>
                                                                           <NodeStateValue>FINISHED</NodeStateValue>
                                                                        </EQInternal>
                                                                     </AND>
                                                                  </OR>
                                                               </NOT>
                                                            </InvariantCondition>
                                                            <NodeBody>
                                                               <NodeList>
                                                                  <Node NodeType="Assignment" LineNo="255" ColNo="5">
                                                                     <NodeId>ASSIGNMENT__40</NodeId>
                                                                     <NodeBody>
                                                                        <Assignment>
                                                                           <RealVariable>xState</RealVariable>
                                                                           <NumericRHS>
                                                                              <SUB LineNo="255" ColNo="27">
                                                                                 <LookupNow>
                                                                                    <Name>
                                                                                       <StringValue>xLoc</StringValue>
                                                                                    </Name>
                                                                                 </LookupNow>
                                                                                 <LookupNow>
                                                                                    <Name>
                                                                                       <StringValue>xTarget</StringValue>
                                                                                    </Name>
                                                                                 </LookupNow>
                                                                              </SUB>
                                                                           </NumericRHS>
                                                                        </Assignment>
                                                                     </NodeBody>
                                                                  </Node>
                                                                  <Node NodeType="Assignment" LineNo="256" ColNo="5">
                                                                     <NodeId>ASSIGNMENT__41</NodeId>
                                                                     <StartCondition>
                                                                        <EQInternal>
                                                                           <NodeStateVariable>
                                                                              <NodeRef dir="sibling">ASSIGNMENT__40</NodeRef>
                                                                           </NodeStateVariable>
                                                                           <NodeStateValue>FINISHED</NodeStateValue>
                                                                        </EQInternal>
                                                                     </StartCondition>
                                                                     <NodeBody>
                                                                        <Assignment>
                                                                           <RealVariable>yState</RealVariable>
                                                                           <NumericRHS>
                                                                              <SUB LineNo="256" ColNo="27">
                                                                                 <LookupNow>
                                                                                    <Name>
                                                                                       <StringValue>yLoc</StringValue>
                                                                                    </Name>
                                                                                 </LookupNow>
                                                                                 <LookupNow>
                                                                                    <Name>
                                                                                       <StringValue>yTarget</StringValue>
                                                                                    </Name>
                                                                                 </LookupNow>
                                                                              </SUB>
                                                                           </NumericRHS>
                                                                        </Assignment>
                                                                     </NodeBody>
                                                                  </Node>
                                                                  <Node NodeType="Assignment" LineNo="257" ColNo="5">
                                                                     <NodeId>ASSIGNMENT__42</NodeId>
                                                                     <StartCondition>
                                                                        <EQInternal>
                                                                           <NodeStateVariable>
                                                                              <NodeRef dir="sibling">ASSIGNMENT__41</NodeRef>
                                                                           </NodeStateVariable>
                                                                           <NodeStateValue>FINISHED</NodeStateValue>
                                                                        </EQInternal>
                                                                     </StartCondition>
                                                                     <NodeBody>
                                                                        <Assignment>
                                                                           <RealVariable>zState</RealVariable>
                                                                           <NumericRHS>
                                                                              <SUB LineNo="257" ColNo="27">
                                                                                 <LookupNow>
                                                                                    <Name>
                                                                                       <StringValue>zLoc</StringValue>
                                                                                    </Name>
                                                                                 </LookupNow>
                                                                                 <RealVariable>zTarget</RealVariable>
                                                                              </SUB>
                                                                           </NumericRHS>
                                                                        </Assignment>
                                                                     </NodeBody>
                                                                  </Node>
                                                                  <Node NodeType="NodeList" epx="Sequence" LineNo="262" ColNo="6">
                                                                     <NodeId>xLocation</NodeId>
                                                                     <StartCondition>
                                                                        <EQInternal>
                                                                           <NodeStateVariable>
                                                                              <NodeRef dir="sibling">ASSIGNMENT__42</NodeRef>
                                                                           </NodeStateVariable>
                                                                           <NodeStateValue>FINISHED</NodeStateValue>
                                                                        </EQInternal>
                                                                     </StartCondition>
                                                                     <InvariantCondition>
                                                                        <NOT>
                                                                           <OR>
                                                                              <AND>
                                                                                 <EQInternal>
                                                                                    <NodeOutcomeVariable>
                                                                                       <NodeRef dir="child">COMMAND__43</NodeRef>
                                                                                    </NodeOutcomeVariable>
                                                                                    <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                                                 </EQInternal>
                                                                                 <EQInternal>
                                                                                    <NodeStateVariable>
                                                                                       <NodeRef dir="child">COMMAND__43</NodeRef>
                                                                                    </NodeStateVariable>
                                                                                    <NodeStateValue>FINISHED</NodeStateValue>
                                                                                 </EQInternal>
                                                                              </AND>
                                                                              <AND>
                                                                                 <EQInternal>
                                                                                    <NodeOutcomeVariable>
                                                                                       <NodeRef dir="child">if__44</NodeRef>
                                                                                    </NodeOutcomeVariable>
                                                                                    <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                                                 </EQInternal>
                                                                                 <EQInternal>
                                                                                    <NodeStateVariable>
                                                                                       <NodeRef dir="child">if__44</NodeRef>
                                                                                    </NodeStateVariable>
                                                                                    <NodeStateValue>FINISHED</NodeStateValue>
                                                                                 </EQInternal>
                                                                              </AND>
                                                                           </OR>
                                                                        </NOT>
                                                                     </InvariantCondition>
                                                                     <NodeBody>
                                                                        <NodeList>
                                                                           <Node NodeType="Command" LineNo="261" ColNo="6">
                                                                              <NodeId>COMMAND__43</NodeId>
                                                                              <NodeBody>
                                                                                 <Command>
                                                                                    <Name>
                                                                                       <StringValue>pprint</StringValue>
                                                                                    </Name>
                                                                                    <Arguments LineNo="262" ColNo="13">
                                                                                       <StringValue>Determining x coordinate update</StringValue>
                                                                                    </Arguments>
                                                                                 </Command>
                                                                              </NodeBody>
                                                                           </Node>
                                                                           <Node NodeType="NodeList" epx="If" LineNo="264" ColNo="6">
                                                                              <NodeId>if__44</NodeId>
                                                                              <StartCondition>
                                                                                 <EQInternal>
                                                                                    <NodeStateVariable>
                                                                                       <NodeRef dir="sibling">COMMAND__43</NodeRef>
                                                                                    </NodeStateVariable>
                                                                                    <NodeStateValue>FINISHED</NodeStateValue>
                                                                                 </EQInternal>
                                                                              </StartCondition>
                                                                              <NodeBody>
                                                                                 <NodeList>
                                                                                    <Node NodeType="Empty" epx="Condition">
                                                                                       <NodeId>ep2cp_IfTest</NodeId>
                                                                                       <PostCondition>
                                                                                          <LT>
                                                                                             <RealVariable>xState</RealVariable>
                                                                                             <IntegerValue>0</IntegerValue>
                                                                                          </LT>
                                                                                       </PostCondition>
                                                                                    </Node>
                                                                                    <Node NodeType="Assignment" epx="Then" LineNo="266" ColNo="7">
                                                                                       <NodeId>ASSIGNMENT__46</NodeId>
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
                                                                                          <Assignment>
                                                                                             <IntegerVariable>xFlag</IntegerVariable>
                                                                                             <NumericRHS>
                                                                                                <IntegerValue>1</IntegerValue>
                                                                                             </NumericRHS>
                                                                                          </Assignment>
                                                                                       </NodeBody>
                                                                                    </Node>
                                                                                    <Node NodeType="Empty" epx="ElseIf">
                                                                                       <NodeId>ep2cp_ElseIf-1</NodeId>
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
                                                                                       <PostCondition>
                                                                                          <GT>
                                                                                             <RealVariable>xState</RealVariable>
                                                                                             <IntegerValue>0</IntegerValue>
                                                                                          </GT>
                                                                                       </PostCondition>
                                                                                    </Node>
                                                                                    <Node NodeType="Assignment" epx="Then" LineNo="270" ColNo="7">
                                                                                       <NodeId>ASSIGNMENT__48</NodeId>
                                                                                       <StartCondition>
                                                                                          <EQInternal>
                                                                                             <NodeOutcomeVariable>
                                                                                                <NodeRef dir="sibling">ep2cp_ElseIf-1</NodeRef>
                                                                                             </NodeOutcomeVariable>
                                                                                             <NodeOutcomeValue>SUCCESS</NodeOutcomeValue>
                                                                                          </EQInternal>
                                                                                       </StartCondition>
                                                                                       <SkipCondition>
                                                                                          <NOT>
                                                                                             <EQInternal>
                                                                                                <NodeOutcomeVariable>
                                                                                                   <NodeRef dir="sibling">ep2cp_ElseIf-1</NodeRef>
                                                                                                </NodeOutcomeVariable>
                                                                                                <NodeOutcomeValue>SUCCESS</NodeOutcomeValue>
                                                                                             </EQInternal>
                                                                                          </NOT>
                                                                                       </SkipCondition>
                                                                                       <NodeBody>
                                                                                          <Assignment>
                                                                                             <IntegerVariable>xFlag</IntegerVariable>
                                                                                             <NumericRHS>
                                                                                                <IntegerValue>-1</IntegerValue>
                                                                                             </NumericRHS>
                                                                                          </Assignment>
                                                                                       </NodeBody>
                                                                                    </Node>
                                                                                    <Node NodeType="Assignment" epx="Else" LineNo="274" ColNo="7">
                                                                                       <NodeId>ASSIGNMENT__50</NodeId>
                                                                                       <StartCondition>
                                                                                          <EQInternal>
                                                                                             <NodeFailureVariable>
                                                                                                <NodeRef dir="sibling">ep2cp_ElseIf-1</NodeRef>
                                                                                             </NodeFailureVariable>
                                                                                             <NodeFailureValue>POST_CONDITION_FAILED</NodeFailureValue>
                                                                                          </EQInternal>
                                                                                       </StartCondition>
                                                                                       <SkipCondition>
                                                                                          <EQInternal>
                                                                                             <NodeOutcomeVariable>
                                                                                                <NodeRef dir="sibling">ep2cp_ElseIf-1</NodeRef>
                                                                                             </NodeOutcomeVariable>
                                                                                             <NodeOutcomeValue>SKIPPED</NodeOutcomeValue>
                                                                                          </EQInternal>
                                                                                       </SkipCondition>
                                                                                       <NodeBody>
                                                                                          <Assignment>
                                                                                             <IntegerVariable>xFlag</IntegerVariable>
                                                                                             <NumericRHS>
                                                                                                <IntegerValue>0</IntegerValue>
                                                                                             </NumericRHS>
                                                                                          </Assignment>
                                                                                       </NodeBody>
                                                                                    </Node>
                                                                                 </NodeList>
                                                                              </NodeBody>
                                                                           </Node>
                                                                        </NodeList>
                                                                     </NodeBody>
                                                                  </Node>
                                                                  <Node NodeType="NodeList" epx="Sequence" LineNo="281" ColNo="6">
                                                                     <NodeId>yLocation</NodeId>
                                                                     <StartCondition>
                                                                        <AND>
                                                                           <EQInternal>
                                                                              <NodeStateVariable>
                                                                                 <NodeRef dir="sibling">xLocation</NodeRef>
                                                                              </NodeStateVariable>
                                                                              <NodeStateValue>FINISHED</NodeStateValue>
                                                                           </EQInternal>
                                                                           <EQInternal>
                                                                              <NodeStateVariable>
                                                                                 <NodeId>xLocation</NodeId>
                                                                              </NodeStateVariable>
                                                                              <NodeStateValue>FINISHED</NodeStateValue>
                                                                           </EQInternal>
                                                                        </AND>
                                                                     </StartCondition>
                                                                     <InvariantCondition>
                                                                        <NOT>
                                                                           <OR>
                                                                              <AND>
                                                                                 <EQInternal>
                                                                                    <NodeOutcomeVariable>
                                                                                       <NodeRef dir="child">COMMAND__51</NodeRef>
                                                                                    </NodeOutcomeVariable>
                                                                                    <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                                                 </EQInternal>
                                                                                 <EQInternal>
                                                                                    <NodeStateVariable>
                                                                                       <NodeRef dir="child">COMMAND__51</NodeRef>
                                                                                    </NodeStateVariable>
                                                                                    <NodeStateValue>FINISHED</NodeStateValue>
                                                                                 </EQInternal>
                                                                              </AND>
                                                                              <AND>
                                                                                 <EQInternal>
                                                                                    <NodeOutcomeVariable>
                                                                                       <NodeRef dir="child">if__52</NodeRef>
                                                                                    </NodeOutcomeVariable>
                                                                                    <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                                                 </EQInternal>
                                                                                 <EQInternal>
                                                                                    <NodeStateVariable>
                                                                                       <NodeRef dir="child">if__52</NodeRef>
                                                                                    </NodeStateVariable>
                                                                                    <NodeStateValue>FINISHED</NodeStateValue>
                                                                                 </EQInternal>
                                                                              </AND>
                                                                           </OR>
                                                                        </NOT>
                                                                     </InvariantCondition>
                                                                     <NodeBody>
                                                                        <NodeList>
                                                                           <Node NodeType="Command" LineNo="282" ColNo="6">
                                                                              <NodeId>COMMAND__51</NodeId>
                                                                              <NodeBody>
                                                                                 <Command>
                                                                                    <Name>
                                                                                       <StringValue>pprint</StringValue>
                                                                                    </Name>
                                                                                    <Arguments LineNo="283" ColNo="13">
                                                                                       <StringValue>Determining y coordinate update</StringValue>
                                                                                    </Arguments>
                                                                                 </Command>
                                                                              </NodeBody>
                                                                           </Node>
                                                                           <Node NodeType="NodeList" epx="If" LineNo="285" ColNo="6">
                                                                              <NodeId>if__52</NodeId>
                                                                              <StartCondition>
                                                                                 <EQInternal>
                                                                                    <NodeStateVariable>
                                                                                       <NodeRef dir="sibling">COMMAND__51</NodeRef>
                                                                                    </NodeStateVariable>
                                                                                    <NodeStateValue>FINISHED</NodeStateValue>
                                                                                 </EQInternal>
                                                                              </StartCondition>
                                                                              <NodeBody>
                                                                                 <NodeList>
                                                                                    <Node NodeType="Empty" epx="Condition">
                                                                                       <NodeId>ep2cp_IfTest</NodeId>
                                                                                       <PostCondition>
                                                                                          <LT>
                                                                                             <RealVariable>yState</RealVariable>
                                                                                             <IntegerValue>0</IntegerValue>
                                                                                          </LT>
                                                                                       </PostCondition>
                                                                                    </Node>
                                                                                    <Node NodeType="Assignment" epx="Then" LineNo="287" ColNo="7">
                                                                                       <NodeId>ASSIGNMENT__54</NodeId>
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
                                                                                          <Assignment>
                                                                                             <IntegerVariable>yFlag</IntegerVariable>
                                                                                             <NumericRHS>
                                                                                                <IntegerValue>1</IntegerValue>
                                                                                             </NumericRHS>
                                                                                          </Assignment>
                                                                                       </NodeBody>
                                                                                    </Node>
                                                                                    <Node NodeType="Empty" epx="ElseIf">
                                                                                       <NodeId>ep2cp_ElseIf-1</NodeId>
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
                                                                                       <PostCondition>
                                                                                          <GT>
                                                                                             <RealVariable>yState</RealVariable>
                                                                                             <IntegerValue>0</IntegerValue>
                                                                                          </GT>
                                                                                       </PostCondition>
                                                                                    </Node>
                                                                                    <Node NodeType="Assignment" epx="Then" LineNo="291" ColNo="7">
                                                                                       <NodeId>ASSIGNMENT__56</NodeId>
                                                                                       <StartCondition>
                                                                                          <EQInternal>
                                                                                             <NodeOutcomeVariable>
                                                                                                <NodeRef dir="sibling">ep2cp_ElseIf-1</NodeRef>
                                                                                             </NodeOutcomeVariable>
                                                                                             <NodeOutcomeValue>SUCCESS</NodeOutcomeValue>
                                                                                          </EQInternal>
                                                                                       </StartCondition>
                                                                                       <SkipCondition>
                                                                                          <NOT>
                                                                                             <EQInternal>
                                                                                                <NodeOutcomeVariable>
                                                                                                   <NodeRef dir="sibling">ep2cp_ElseIf-1</NodeRef>
                                                                                                </NodeOutcomeVariable>
                                                                                                <NodeOutcomeValue>SUCCESS</NodeOutcomeValue>
                                                                                             </EQInternal>
                                                                                          </NOT>
                                                                                       </SkipCondition>
                                                                                       <NodeBody>
                                                                                          <Assignment>
                                                                                             <IntegerVariable>yFlag</IntegerVariable>
                                                                                             <NumericRHS>
                                                                                                <IntegerValue>-1</IntegerValue>
                                                                                             </NumericRHS>
                                                                                          </Assignment>
                                                                                       </NodeBody>
                                                                                    </Node>
                                                                                    <Node NodeType="Assignment" epx="Else" LineNo="295" ColNo="7">
                                                                                       <NodeId>ASSIGNMENT__58</NodeId>
                                                                                       <StartCondition>
                                                                                          <EQInternal>
                                                                                             <NodeFailureVariable>
                                                                                                <NodeRef dir="sibling">ep2cp_ElseIf-1</NodeRef>
                                                                                             </NodeFailureVariable>
                                                                                             <NodeFailureValue>POST_CONDITION_FAILED</NodeFailureValue>
                                                                                          </EQInternal>
                                                                                       </StartCondition>
                                                                                       <SkipCondition>
                                                                                          <EQInternal>
                                                                                             <NodeOutcomeVariable>
                                                                                                <NodeRef dir="sibling">ep2cp_ElseIf-1</NodeRef>
                                                                                             </NodeOutcomeVariable>
                                                                                             <NodeOutcomeValue>SKIPPED</NodeOutcomeValue>
                                                                                          </EQInternal>
                                                                                       </SkipCondition>
                                                                                       <NodeBody>
                                                                                          <Assignment>
                                                                                             <IntegerVariable>yFlag</IntegerVariable>
                                                                                             <NumericRHS>
                                                                                                <IntegerValue>0</IntegerValue>
                                                                                             </NumericRHS>
                                                                                          </Assignment>
                                                                                       </NodeBody>
                                                                                    </Node>
                                                                                 </NodeList>
                                                                              </NodeBody>
                                                                           </Node>
                                                                        </NodeList>
                                                                     </NodeBody>
                                                                  </Node>
                                                                  <Node NodeType="NodeList" epx="Sequence" LineNo="302" ColNo="6">
                                                                     <NodeId>zLocation</NodeId>
                                                                     <StartCondition>
                                                                        <AND>
                                                                           <EQInternal>
                                                                              <NodeStateVariable>
                                                                                 <NodeRef dir="sibling">yLocation</NodeRef>
                                                                              </NodeStateVariable>
                                                                              <NodeStateValue>FINISHED</NodeStateValue>
                                                                           </EQInternal>
                                                                           <EQInternal>
                                                                              <NodeStateVariable>
                                                                                 <NodeId>yLocation</NodeId>
                                                                              </NodeStateVariable>
                                                                              <NodeStateValue>FINISHED</NodeStateValue>
                                                                           </EQInternal>
                                                                        </AND>
                                                                     </StartCondition>
                                                                     <InvariantCondition>
                                                                        <NOT>
                                                                           <OR>
                                                                              <AND>
                                                                                 <EQInternal>
                                                                                    <NodeOutcomeVariable>
                                                                                       <NodeRef dir="child">COMMAND__59</NodeRef>
                                                                                    </NodeOutcomeVariable>
                                                                                    <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                                                 </EQInternal>
                                                                                 <EQInternal>
                                                                                    <NodeStateVariable>
                                                                                       <NodeRef dir="child">COMMAND__59</NodeRef>
                                                                                    </NodeStateVariable>
                                                                                    <NodeStateValue>FINISHED</NodeStateValue>
                                                                                 </EQInternal>
                                                                              </AND>
                                                                              <AND>
                                                                                 <EQInternal>
                                                                                    <NodeOutcomeVariable>
                                                                                       <NodeRef dir="child">if__60</NodeRef>
                                                                                    </NodeOutcomeVariable>
                                                                                    <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                                                 </EQInternal>
                                                                                 <EQInternal>
                                                                                    <NodeStateVariable>
                                                                                       <NodeRef dir="child">if__60</NodeRef>
                                                                                    </NodeStateVariable>
                                                                                    <NodeStateValue>FINISHED</NodeStateValue>
                                                                                 </EQInternal>
                                                                              </AND>
                                                                           </OR>
                                                                        </NOT>
                                                                     </InvariantCondition>
                                                                     <NodeBody>
                                                                        <NodeList>
                                                                           <Node NodeType="Command" LineNo="303" ColNo="6">
                                                                              <NodeId>COMMAND__59</NodeId>
                                                                              <NodeBody>
                                                                                 <Command>
                                                                                    <Name>
                                                                                       <StringValue>pprint</StringValue>
                                                                                    </Name>
                                                                                    <Arguments LineNo="304" ColNo="13">
                                                                                       <StringValue>Determining z coordinate update</StringValue>
                                                                                    </Arguments>
                                                                                 </Command>
                                                                              </NodeBody>
                                                                           </Node>
                                                                           <Node NodeType="NodeList" epx="If" LineNo="306" ColNo="6">
                                                                              <NodeId>if__60</NodeId>
                                                                              <StartCondition>
                                                                                 <EQInternal>
                                                                                    <NodeStateVariable>
                                                                                       <NodeRef dir="sibling">COMMAND__59</NodeRef>
                                                                                    </NodeStateVariable>
                                                                                    <NodeStateValue>FINISHED</NodeStateValue>
                                                                                 </EQInternal>
                                                                              </StartCondition>
                                                                              <NodeBody>
                                                                                 <NodeList>
                                                                                    <Node NodeType="Empty" epx="Condition">
                                                                                       <NodeId>ep2cp_IfTest</NodeId>
                                                                                       <PostCondition>
                                                                                          <LT>
                                                                                             <RealVariable>zState</RealVariable>
                                                                                             <IntegerValue>0</IntegerValue>
                                                                                          </LT>
                                                                                       </PostCondition>
                                                                                    </Node>
                                                                                    <Node NodeType="Assignment" epx="Then" LineNo="308" ColNo="7">
                                                                                       <NodeId>ASSIGNMENT__62</NodeId>
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
                                                                                          <Assignment>
                                                                                             <IntegerVariable>zFlag</IntegerVariable>
                                                                                             <NumericRHS>
                                                                                                <IntegerValue>1</IntegerValue>
                                                                                             </NumericRHS>
                                                                                          </Assignment>
                                                                                       </NodeBody>
                                                                                    </Node>
                                                                                    <Node NodeType="Empty" epx="ElseIf">
                                                                                       <NodeId>ep2cp_ElseIf-1</NodeId>
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
                                                                                       <PostCondition>
                                                                                          <GT>
                                                                                             <RealVariable>zState</RealVariable>
                                                                                             <IntegerValue>0</IntegerValue>
                                                                                          </GT>
                                                                                       </PostCondition>
                                                                                    </Node>
                                                                                    <Node NodeType="Assignment" epx="Then" LineNo="312" ColNo="7">
                                                                                       <NodeId>ASSIGNMENT__64</NodeId>
                                                                                       <StartCondition>
                                                                                          <EQInternal>
                                                                                             <NodeOutcomeVariable>
                                                                                                <NodeRef dir="sibling">ep2cp_ElseIf-1</NodeRef>
                                                                                             </NodeOutcomeVariable>
                                                                                             <NodeOutcomeValue>SUCCESS</NodeOutcomeValue>
                                                                                          </EQInternal>
                                                                                       </StartCondition>
                                                                                       <SkipCondition>
                                                                                          <NOT>
                                                                                             <EQInternal>
                                                                                                <NodeOutcomeVariable>
                                                                                                   <NodeRef dir="sibling">ep2cp_ElseIf-1</NodeRef>
                                                                                                </NodeOutcomeVariable>
                                                                                                <NodeOutcomeValue>SUCCESS</NodeOutcomeValue>
                                                                                             </EQInternal>
                                                                                          </NOT>
                                                                                       </SkipCondition>
                                                                                       <NodeBody>
                                                                                          <Assignment>
                                                                                             <IntegerVariable>zFlag</IntegerVariable>
                                                                                             <NumericRHS>
                                                                                                <IntegerValue>-1</IntegerValue>
                                                                                             </NumericRHS>
                                                                                          </Assignment>
                                                                                       </NodeBody>
                                                                                    </Node>
                                                                                    <Node NodeType="Assignment" epx="Else" LineNo="316" ColNo="7">
                                                                                       <NodeId>ASSIGNMENT__66</NodeId>
                                                                                       <StartCondition>
                                                                                          <EQInternal>
                                                                                             <NodeFailureVariable>
                                                                                                <NodeRef dir="sibling">ep2cp_ElseIf-1</NodeRef>
                                                                                             </NodeFailureVariable>
                                                                                             <NodeFailureValue>POST_CONDITION_FAILED</NodeFailureValue>
                                                                                          </EQInternal>
                                                                                       </StartCondition>
                                                                                       <SkipCondition>
                                                                                          <EQInternal>
                                                                                             <NodeOutcomeVariable>
                                                                                                <NodeRef dir="sibling">ep2cp_ElseIf-1</NodeRef>
                                                                                             </NodeOutcomeVariable>
                                                                                             <NodeOutcomeValue>SKIPPED</NodeOutcomeValue>
                                                                                          </EQInternal>
                                                                                       </SkipCondition>
                                                                                       <NodeBody>
                                                                                          <Assignment>
                                                                                             <IntegerVariable>zFlag</IntegerVariable>
                                                                                             <NumericRHS>
                                                                                                <IntegerValue>0</IntegerValue>
                                                                                             </NumericRHS>
                                                                                          </Assignment>
                                                                                       </NodeBody>
                                                                                    </Node>
                                                                                 </NodeList>
                                                                              </NodeBody>
                                                                           </Node>
                                                                        </NodeList>
                                                                     </NodeBody>
                                                                  </Node>
                                                                  <Node NodeType="Command" LineNo="320" ColNo="5">
                                                                     <NodeId>COMMAND__67</NodeId>
                                                                     <StartCondition>
                                                                        <EQInternal>
                                                                           <NodeStateVariable>
                                                                              <NodeRef dir="sibling">zLocation</NodeRef>
                                                                           </NodeStateVariable>
                                                                           <NodeStateValue>FINISHED</NodeStateValue>
                                                                        </EQInternal>
                                                                     </StartCondition>
                                                                     <NodeBody>
                                                                        <Command>
                                                                           <Name>
                                                                              <StringValue>pprint</StringValue>
                                                                           </Name>
                                                                           <Arguments LineNo="321" ColNo="12">
                                                                              <StringValue>Updating Flight Parameters: velFlag =</StringValue>
                                                                              <IntegerVariable>velFlag</IntegerVariable>
                                                                              <StringValue>xFlag =</StringValue>
                                                                              <IntegerVariable>xFlag</IntegerVariable>
                                                                              <StringValue>yFlag =</StringValue>
                                                                              <IntegerVariable>yFlag</IntegerVariable>
                                                                              <StringValue>zFlag =</StringValue>
                                                                              <IntegerVariable>zFlag</IntegerVariable>
                                                                           </Arguments>
                                                                        </Command>
                                                                     </NodeBody>
                                                                  </Node>
                                                                  <Node NodeType="Command" LineNo="321" ColNo="5">
                                                                     <NodeId>COMMAND__68</NodeId>
                                                                     <StartCondition>
                                                                        <EQInternal>
                                                                           <NodeStateVariable>
                                                                              <NodeRef dir="sibling">COMMAND__67</NodeRef>
                                                                           </NodeStateVariable>
                                                                           <NodeStateValue>FINISHED</NodeStateValue>
                                                                        </EQInternal>
                                                                     </StartCondition>
                                                                     <NodeBody>
                                                                        <Command>
                                                                           <Name>
                                                                              <StringValue>UpdateFlight</StringValue>
                                                                           </Name>
                                                                           <Arguments LineNo="322" ColNo="18">
                                                                              <IntegerVariable>velFlag</IntegerVariable>
                                                                              <IntegerVariable>xFlag</IntegerVariable>
                                                                              <IntegerVariable>yFlag</IntegerVariable>
                                                                              <IntegerVariable>zFlag</IntegerVariable>
                                                                              <StringValue>A</StringValue>
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
                                       <Node NodeType="NodeList" epx="Sequence" LineNo="332" ColNo="3">
                                          <NodeId>Arrived_at_A</NodeId>
                                          <StartCondition>
                                             <AND>
                                                <EQInternal>
                                                   <NodeStateVariable>
                                                      <NodeRef dir="sibling">Not_at_A</NodeRef>
                                                   </NodeStateVariable>
                                                   <NodeStateValue>FINISHED</NodeStateValue>
                                                </EQInternal>
                                                <BooleanVariable>At_A</BooleanVariable>
                                             </AND>
                                          </StartCondition>
                                          <PreCondition>
                                             <EQInternal>
                                                <NodeStateVariable>
                                                   <NodeId>Not_at_A</NodeId>
                                                </NodeStateVariable>
                                                <NodeStateValue>FINISHED</NodeStateValue>
                                             </EQInternal>
                                          </PreCondition>
                                          <InvariantCondition>
                                             <NOT>
                                                <OR>
                                                   <AND>
                                                      <EQInternal>
                                                         <NodeOutcomeVariable>
                                                            <NodeRef dir="child">COMMAND__69</NodeRef>
                                                         </NodeOutcomeVariable>
                                                         <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                      </EQInternal>
                                                      <EQInternal>
                                                         <NodeStateVariable>
                                                            <NodeRef dir="child">COMMAND__69</NodeRef>
                                                         </NodeStateVariable>
                                                         <NodeStateValue>FINISHED</NodeStateValue>
                                                      </EQInternal>
                                                   </AND>
                                                   <AND>
                                                      <EQInternal>
                                                         <NodeOutcomeVariable>
                                                            <NodeRef dir="child">PerformScience</NodeRef>
                                                         </NodeOutcomeVariable>
                                                         <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                      </EQInternal>
                                                      <EQInternal>
                                                         <NodeStateVariable>
                                                            <NodeRef dir="child">PerformScience</NodeRef>
                                                         </NodeStateVariable>
                                                         <NodeStateValue>FINISHED</NodeStateValue>
                                                      </EQInternal>
                                                   </AND>
                                                   <AND>
                                                      <EQInternal>
                                                         <NodeOutcomeVariable>
                                                            <NodeRef dir="child">UpdatePlan</NodeRef>
                                                         </NodeOutcomeVariable>
                                                         <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                      </EQInternal>
                                                      <EQInternal>
                                                         <NodeStateVariable>
                                                            <NodeRef dir="child">UpdatePlan</NodeRef>
                                                         </NodeStateVariable>
                                                         <NodeStateValue>FINISHED</NodeStateValue>
                                                      </EQInternal>
                                                   </AND>
                                                </OR>
                                             </NOT>
                                          </InvariantCondition>
                                          <NodeBody>
                                             <NodeList>
                                                <Node NodeType="Command" LineNo="334" ColNo="3">
                                                   <NodeId>COMMAND__69</NodeId>
                                                   <NodeBody>
                                                      <Command>
                                                         <Name>
                                                            <StringValue>pprint</StringValue>
                                                         </Name>
                                                         <Arguments LineNo="335" ColNo="10">
                                                            <StringValue>Updated Flight Status: Arrived at A!</StringValue>
                                                         </Arguments>
                                                      </Command>
                                                   </NodeBody>
                                                </Node>
                                                <Node NodeType="NodeList" epx="Sequence" LineNo="339" ColNo="4">
                                                   <NodeId>PerformScience</NodeId>
                                                   <VariableDeclarations>
                                                      <DeclareVariable LineNo="338" ColNo="4">
                                                         <Name>PicTaken</Name>
                                                         <Type>Boolean</Type>
                                                      </DeclareVariable>
                                                   </VariableDeclarations>
                                                   <StartCondition>
                                                      <EQInternal>
                                                         <NodeStateVariable>
                                                            <NodeRef dir="sibling">COMMAND__69</NodeRef>
                                                         </NodeStateVariable>
                                                         <NodeStateValue>FINISHED</NodeStateValue>
                                                      </EQInternal>
                                                   </StartCondition>
                                                   <PostCondition>
                                                      <BooleanVariable>PicTaken</BooleanVariable>
                                                   </PostCondition>
                                                   <InvariantCondition>
                                                      <NOT>
                                                         <OR>
                                                            <AND>
                                                               <EQInternal>
                                                                  <NodeOutcomeVariable>
                                                                     <NodeRef dir="child">COMMAND__70</NodeRef>
                                                                  </NodeOutcomeVariable>
                                                                  <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                               </EQInternal>
                                                               <EQInternal>
                                                                  <NodeStateVariable>
                                                                     <NodeRef dir="child">COMMAND__70</NodeRef>
                                                                  </NodeStateVariable>
                                                                  <NodeStateValue>FINISHED</NodeStateValue>
                                                               </EQInternal>
                                                            </AND>
                                                            <AND>
                                                               <EQInternal>
                                                                  <NodeOutcomeVariable>
                                                                     <NodeRef dir="child">COMMAND__71</NodeRef>
                                                                  </NodeOutcomeVariable>
                                                                  <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                               </EQInternal>
                                                               <EQInternal>
                                                                  <NodeStateVariable>
                                                                     <NodeRef dir="child">COMMAND__71</NodeRef>
                                                                  </NodeStateVariable>
                                                                  <NodeStateValue>FINISHED</NodeStateValue>
                                                               </EQInternal>
                                                            </AND>
                                                            <AND>
                                                               <EQInternal>
                                                                  <NodeOutcomeVariable>
                                                                     <NodeRef dir="child">Command_TakePic</NodeRef>
                                                                  </NodeOutcomeVariable>
                                                                  <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                               </EQInternal>
                                                               <EQInternal>
                                                                  <NodeStateVariable>
                                                                     <NodeRef dir="child">Command_TakePic</NodeRef>
                                                                  </NodeStateVariable>
                                                                  <NodeStateValue>FINISHED</NodeStateValue>
                                                               </EQInternal>
                                                            </AND>
                                                            <AND>
                                                               <EQInternal>
                                                                  <NodeOutcomeVariable>
                                                                     <NodeRef dir="child">if__73</NodeRef>
                                                                  </NodeOutcomeVariable>
                                                                  <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                               </EQInternal>
                                                               <EQInternal>
                                                                  <NodeStateVariable>
                                                                     <NodeRef dir="child">if__73</NodeRef>
                                                                  </NodeStateVariable>
                                                                  <NodeStateValue>FINISHED</NodeStateValue>
                                                               </EQInternal>
                                                            </AND>
                                                         </OR>
                                                      </NOT>
                                                   </InvariantCondition>
                                                   <NodeBody>
                                                      <NodeList>
                                                         <Node NodeType="Command" LineNo="341" ColNo="4">
                                                            <NodeId>COMMAND__70</NodeId>
                                                            <NodeBody>
                                                               <Command>
                                                                  <Name>
                                                                     <StringValue>pprint</StringValue>
                                                                  </Name>
                                                                  <Arguments LineNo="342" ColNo="11">
                                                                     <StringValue> </StringValue>
                                                                  </Arguments>
                                                               </Command>
                                                            </NodeBody>
                                                         </Node>
                                                         <Node NodeType="Command" LineNo="342" ColNo="4">
                                                            <NodeId>COMMAND__71</NodeId>
                                                            <StartCondition>
                                                               <EQInternal>
                                                                  <NodeStateVariable>
                                                                     <NodeRef dir="sibling">COMMAND__70</NodeRef>
                                                                  </NodeStateVariable>
                                                                  <NodeStateValue>FINISHED</NodeStateValue>
                                                               </EQInternal>
                                                            </StartCondition>
                                                            <NodeBody>
                                                               <Command>
                                                                  <Name>
                                                                     <StringValue>pprint</StringValue>
                                                                  </Name>
                                                                  <Arguments LineNo="343" ColNo="11">
                                                                     <StringValue>Performing Science at Waypoint A</StringValue>
                                                                  </Arguments>
                                                               </Command>
                                                            </NodeBody>
                                                         </Node>
                                                         <Node NodeType="NodeList" epx="Sequence" LineNo="347" ColNo="5">
                                                            <NodeId>Command_TakePic</NodeId>
                                                            <StartCondition>
                                                               <EQInternal>
                                                                  <NodeStateVariable>
                                                                     <NodeRef dir="sibling">COMMAND__71</NodeRef>
                                                                  </NodeStateVariable>
                                                                  <NodeStateValue>FINISHED</NodeStateValue>
                                                               </EQInternal>
                                                            </StartCondition>
                                                            <InvariantCondition>
                                                               <NOT>
                                                                  <AND>
                                                                     <EQInternal>
                                                                        <NodeOutcomeVariable>
                                                                           <NodeRef dir="child">SynchronousCommand__72</NodeRef>
                                                                        </NodeOutcomeVariable>
                                                                        <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                                     </EQInternal>
                                                                     <EQInternal>
                                                                        <NodeStateVariable>
                                                                           <NodeRef dir="child">SynchronousCommand__72</NodeRef>
                                                                        </NodeStateVariable>
                                                                        <NodeStateValue>FINISHED</NodeStateValue>
                                                                     </EQInternal>
                                                                  </AND>
                                                               </NOT>
                                                            </InvariantCondition>
                                                            <NodeBody>
                                                               <NodeList>
                                                                  <Node NodeType="NodeList" epx="SynchronousCommand" LineNo="347" ColNo="5">
                                                                     <NodeId>SynchronousCommand__72</NodeId>
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
                                                                                                <StringValue>TakePic</StringValue>
                                                                                             </Name>
                                                                                             <Arguments LineNo="347" ColNo="43">
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
                                                                                             <BooleanVariable>PicTaken</BooleanVariable>
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
                                                         <Node NodeType="NodeList" epx="If" LineNo="350" ColNo="4">
                                                            <NodeId>if__73</NodeId>
                                                            <StartCondition>
                                                               <EQInternal>
                                                                  <NodeStateVariable>
                                                                     <NodeRef dir="sibling">Command_TakePic</NodeRef>
                                                                  </NodeStateVariable>
                                                                  <NodeStateValue>FINISHED</NodeStateValue>
                                                               </EQInternal>
                                                            </StartCondition>
                                                            <NodeBody>
                                                               <NodeList>
                                                                  <Node NodeType="Empty" epx="Condition">
                                                                     <NodeId>ep2cp_IfTest</NodeId>
                                                                     <PostCondition>
                                                                        <BooleanVariable>PicTaken</BooleanVariable>
                                                                     </PostCondition>
                                                                  </Node>
                                                                  <Node NodeType="Command" epx="Then" LineNo="351" ColNo="5">
                                                                     <NodeId>COMMAND__75</NodeId>
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
                                                                        <Command>
                                                                           <Name>
                                                                              <StringValue>pprint</StringValue>
                                                                           </Name>
                                                                           <Arguments LineNo="352" ColNo="12">
                                                                              <StringValue>Science successful</StringValue>
                                                                           </Arguments>
                                                                        </Command>
                                                                     </NodeBody>
                                                                  </Node>
                                                                  <Node NodeType="Command" epx="Else" LineNo="355" ColNo="5">
                                                                     <NodeId>COMMAND__77</NodeId>
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
                                                                           <Arguments LineNo="356" ColNo="12">
                                                                              <StringValue>Science FAILED!!!</StringValue>
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
                                                <Node NodeType="NodeList" epx="Sequence" LineNo="364" ColNo="4">
                                                   <NodeId>UpdatePlan</NodeId>
                                                   <VariableDeclarations>
                                                      <DeclareVariable LineNo="363" ColNo="4">
                                                         <Name>PlanUpdated</Name>
                                                         <Type>Boolean</Type>
                                                      </DeclareVariable>
                                                   </VariableDeclarations>
                                                   <StartCondition>
                                                      <EQInternal>
                                                         <NodeStateVariable>
                                                            <NodeRef dir="sibling">PerformScience</NodeRef>
                                                         </NodeStateVariable>
                                                         <NodeStateValue>FINISHED</NodeStateValue>
                                                      </EQInternal>
                                                   </StartCondition>
                                                   <PostCondition>
                                                      <BooleanVariable>PlanUpdated</BooleanVariable>
                                                   </PostCondition>
                                                   <InvariantCondition>
                                                      <NOT>
                                                         <OR>
                                                            <AND>
                                                               <EQInternal>
                                                                  <NodeOutcomeVariable>
                                                                     <NodeRef dir="child">COMMAND__78</NodeRef>
                                                                  </NodeOutcomeVariable>
                                                                  <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                               </EQInternal>
                                                               <EQInternal>
                                                                  <NodeStateVariable>
                                                                     <NodeRef dir="child">COMMAND__78</NodeRef>
                                                                  </NodeStateVariable>
                                                                  <NodeStateValue>FINISHED</NodeStateValue>
                                                               </EQInternal>
                                                            </AND>
                                                            <AND>
                                                               <EQInternal>
                                                                  <NodeOutcomeVariable>
                                                                     <NodeRef dir="child">COMMAND__79</NodeRef>
                                                                  </NodeOutcomeVariable>
                                                                  <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                               </EQInternal>
                                                               <EQInternal>
                                                                  <NodeStateVariable>
                                                                     <NodeRef dir="child">COMMAND__79</NodeRef>
                                                                  </NodeStateVariable>
                                                                  <NodeStateValue>FINISHED</NodeStateValue>
                                                               </EQInternal>
                                                            </AND>
                                                            <AND>
                                                               <EQInternal>
                                                                  <NodeOutcomeVariable>
                                                                     <NodeRef dir="child">Command_UpdatePlan</NodeRef>
                                                                  </NodeOutcomeVariable>
                                                                  <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                               </EQInternal>
                                                               <EQInternal>
                                                                  <NodeStateVariable>
                                                                     <NodeRef dir="child">Command_UpdatePlan</NodeRef>
                                                                  </NodeStateVariable>
                                                                  <NodeStateValue>FINISHED</NodeStateValue>
                                                               </EQInternal>
                                                            </AND>
                                                            <AND>
                                                               <EQInternal>
                                                                  <NodeOutcomeVariable>
                                                                     <NodeRef dir="child">if__81</NodeRef>
                                                                  </NodeOutcomeVariable>
                                                                  <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                               </EQInternal>
                                                               <EQInternal>
                                                                  <NodeStateVariable>
                                                                     <NodeRef dir="child">if__81</NodeRef>
                                                                  </NodeStateVariable>
                                                                  <NodeStateValue>FINISHED</NodeStateValue>
                                                               </EQInternal>
                                                            </AND>
                                                         </OR>
                                                      </NOT>
                                                   </InvariantCondition>
                                                   <NodeBody>
                                                      <NodeList>
                                                         <Node NodeType="Command" LineNo="366" ColNo="4">
                                                            <NodeId>COMMAND__78</NodeId>
                                                            <NodeBody>
                                                               <Command>
                                                                  <Name>
                                                                     <StringValue>pprint</StringValue>
                                                                  </Name>
                                                                  <Arguments LineNo="367" ColNo="11">
                                                                     <StringValue> </StringValue>
                                                                  </Arguments>
                                                               </Command>
                                                            </NodeBody>
                                                         </Node>
                                                         <Node NodeType="Command" LineNo="367" ColNo="4">
                                                            <NodeId>COMMAND__79</NodeId>
                                                            <StartCondition>
                                                               <EQInternal>
                                                                  <NodeStateVariable>
                                                                     <NodeRef dir="sibling">COMMAND__78</NodeRef>
                                                                  </NodeStateVariable>
                                                                  <NodeStateValue>FINISHED</NodeStateValue>
                                                               </EQInternal>
                                                            </StartCondition>
                                                            <NodeBody>
                                                               <Command>
                                                                  <Name>
                                                                     <StringValue>pprint</StringValue>
                                                                  </Name>
                                                                  <Arguments LineNo="368" ColNo="11">
                                                                     <StringValue>Updating Waypoint Plan</StringValue>
                                                                  </Arguments>
                                                               </Command>
                                                            </NodeBody>
                                                         </Node>
                                                         <Node NodeType="NodeList" epx="Sequence" LineNo="372" ColNo="5">
                                                            <NodeId>Command_UpdatePlan</NodeId>
                                                            <StartCondition>
                                                               <EQInternal>
                                                                  <NodeStateVariable>
                                                                     <NodeRef dir="sibling">COMMAND__79</NodeRef>
                                                                  </NodeStateVariable>
                                                                  <NodeStateValue>FINISHED</NodeStateValue>
                                                               </EQInternal>
                                                            </StartCondition>
                                                            <InvariantCondition>
                                                               <NOT>
                                                                  <AND>
                                                                     <EQInternal>
                                                                        <NodeOutcomeVariable>
                                                                           <NodeRef dir="child">SynchronousCommand__80</NodeRef>
                                                                        </NodeOutcomeVariable>
                                                                        <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                                     </EQInternal>
                                                                     <EQInternal>
                                                                        <NodeStateVariable>
                                                                           <NodeRef dir="child">SynchronousCommand__80</NodeRef>
                                                                        </NodeStateVariable>
                                                                        <NodeStateValue>FINISHED</NodeStateValue>
                                                                     </EQInternal>
                                                                  </AND>
                                                               </NOT>
                                                            </InvariantCondition>
                                                            <NodeBody>
                                                               <NodeList>
                                                                  <Node NodeType="NodeList" epx="SynchronousCommand" LineNo="372" ColNo="5">
                                                                     <NodeId>SynchronousCommand__80</NodeId>
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
                                                                                                <StringValue>UpdatePlan</StringValue>
                                                                                             </Name>
                                                                                             <Arguments LineNo="372" ColNo="49">
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
                                                                                             <BooleanVariable>PlanUpdated</BooleanVariable>
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
                                                         <Node NodeType="NodeList" epx="If" LineNo="375" ColNo="4">
                                                            <NodeId>if__81</NodeId>
                                                            <StartCondition>
                                                               <EQInternal>
                                                                  <NodeStateVariable>
                                                                     <NodeRef dir="sibling">Command_UpdatePlan</NodeRef>
                                                                  </NodeStateVariable>
                                                                  <NodeStateValue>FINISHED</NodeStateValue>
                                                               </EQInternal>
                                                            </StartCondition>
                                                            <NodeBody>
                                                               <NodeList>
                                                                  <Node NodeType="Empty" epx="Condition">
                                                                     <NodeId>ep2cp_IfTest</NodeId>
                                                                     <PostCondition>
                                                                        <BooleanVariable>PlanUpdated</BooleanVariable>
                                                                     </PostCondition>
                                                                  </Node>
                                                                  <Node NodeType="NodeList" epx="Then" LineNo="377" ColNo="5">
                                                                     <NodeId>BLOCK__82</NodeId>
                                                                     <InvariantCondition>
                                                                        <NOT>
                                                                           <OR>
                                                                              <AND>
                                                                                 <EQInternal>
                                                                                    <NodeOutcomeVariable>
                                                                                       <NodeRef dir="child">COMMAND__83</NodeRef>
                                                                                    </NodeOutcomeVariable>
                                                                                    <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                                                 </EQInternal>
                                                                                 <EQInternal>
                                                                                    <NodeStateVariable>
                                                                                       <NodeRef dir="child">COMMAND__83</NodeRef>
                                                                                    </NodeStateVariable>
                                                                                    <NodeStateValue>FINISHED</NodeStateValue>
                                                                                 </EQInternal>
                                                                              </AND>
                                                                              <AND>
                                                                                 <EQInternal>
                                                                                    <NodeOutcomeVariable>
                                                                                       <NodeRef dir="child">COMMAND__84</NodeRef>
                                                                                    </NodeOutcomeVariable>
                                                                                    <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                                                 </EQInternal>
                                                                                 <EQInternal>
                                                                                    <NodeStateVariable>
                                                                                       <NodeRef dir="child">COMMAND__84</NodeRef>
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
                                                                           <Node NodeType="Command" LineNo="376" ColNo="5">
                                                                              <NodeId>COMMAND__83</NodeId>
                                                                              <NodeBody>
                                                                                 <Command>
                                                                                    <Name>
                                                                                       <StringValue>pprint</StringValue>
                                                                                    </Name>
                                                                                    <Arguments LineNo="377" ColNo="12">
                                                                                       <StringValue>Plan updated successfully</StringValue>
                                                                                    </Arguments>
                                                                                 </Command>
                                                                              </NodeBody>
                                                                           </Node>
                                                                           <Node NodeType="Command" LineNo="377" ColNo="5">
                                                                              <NodeId>COMMAND__84</NodeId>
                                                                              <StartCondition>
                                                                                 <EQInternal>
                                                                                    <NodeStateVariable>
                                                                                       <NodeRef dir="sibling">COMMAND__83</NodeRef>
                                                                                    </NodeStateVariable>
                                                                                    <NodeStateValue>FINISHED</NodeStateValue>
                                                                                 </EQInternal>
                                                                              </StartCondition>
                                                                              <NodeBody>
                                                                                 <Command>
                                                                                    <Name>
                                                                                       <StringValue>pprint</StringValue>
                                                                                    </Name>
                                                                                    <Arguments LineNo="378" ColNo="12">
                                                                                       <StringValue> </StringValue>
                                                                                    </Arguments>
                                                                                 </Command>
                                                                              </NodeBody>
                                                                           </Node>
                                                                        </NodeList>
                                                                     </NodeBody>
                                                                  </Node>
                                                                  <Node NodeType="NodeList" epx="Else" LineNo="383" ColNo="5">
                                                                     <NodeId>BLOCK__85</NodeId>
                                                                     <InvariantCondition>
                                                                        <NOT>
                                                                           <OR>
                                                                              <AND>
                                                                                 <EQInternal>
                                                                                    <NodeOutcomeVariable>
                                                                                       <NodeRef dir="child">COMMAND__86</NodeRef>
                                                                                    </NodeOutcomeVariable>
                                                                                    <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                                                 </EQInternal>
                                                                                 <EQInternal>
                                                                                    <NodeStateVariable>
                                                                                       <NodeRef dir="child">COMMAND__86</NodeRef>
                                                                                    </NodeStateVariable>
                                                                                    <NodeStateValue>FINISHED</NodeStateValue>
                                                                                 </EQInternal>
                                                                              </AND>
                                                                              <AND>
                                                                                 <EQInternal>
                                                                                    <NodeOutcomeVariable>
                                                                                       <NodeRef dir="child">COMMAND__87</NodeRef>
                                                                                    </NodeOutcomeVariable>
                                                                                    <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                                                 </EQInternal>
                                                                                 <EQInternal>
                                                                                    <NodeStateVariable>
                                                                                       <NodeRef dir="child">COMMAND__87</NodeRef>
                                                                                    </NodeStateVariable>
                                                                                    <NodeStateValue>FINISHED</NodeStateValue>
                                                                                 </EQInternal>
                                                                              </AND>
                                                                           </OR>
                                                                        </NOT>
                                                                     </InvariantCondition>
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
                                                                        <NodeList>
                                                                           <Node NodeType="Command" LineNo="382" ColNo="5">
                                                                              <NodeId>COMMAND__86</NodeId>
                                                                              <NodeBody>
                                                                                 <Command>
                                                                                    <Name>
                                                                                       <StringValue>pprint</StringValue>
                                                                                    </Name>
                                                                                    <Arguments LineNo="383" ColNo="12">
                                                                                       <StringValue>Plan update FAILED!!!</StringValue>
                                                                                    </Arguments>
                                                                                 </Command>
                                                                              </NodeBody>
                                                                           </Node>
                                                                           <Node NodeType="Command" LineNo="383" ColNo="5">
                                                                              <NodeId>COMMAND__87</NodeId>
                                                                              <StartCondition>
                                                                                 <EQInternal>
                                                                                    <NodeStateVariable>
                                                                                       <NodeRef dir="sibling">COMMAND__86</NodeRef>
                                                                                    </NodeStateVariable>
                                                                                    <NodeStateValue>FINISHED</NodeStateValue>
                                                                                 </EQInternal>
                                                                              </StartCondition>
                                                                              <NodeBody>
                                                                                 <Command>
                                                                                    <Name>
                                                                                       <StringValue>pprint</StringValue>
                                                                                    </Name>
                                                                                    <Arguments LineNo="384" ColNo="12">
                                                                                       <StringValue> </StringValue>
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
                                             </NodeList>
                                          </NodeBody>
                                       </Node>
                                    </NodeList>
                                 </NodeBody>
                              </Node>
                           </NodeList>
                        </NodeBody>
                     </Node>
                     <Node NodeType="Command">
                        <NodeId>ep2cp_CmdReturn</NodeId>
                        <StartCondition>
                           <EQInternal>
                              <NodeStateVariable>
                                 <NodeRef dir="sibling">ep2cp_CmdAction_Fly2A</NodeRef>
                              </NodeStateVariable>
                              <NodeStateValue>FINISHED</NodeStateValue>
                           </EQInternal>
                        </StartCondition>
                        <NodeBody>
                           <Command>
                              <Name>
                                 <StringValue>SendReturnValue</StringValue>
                              </Name>
                              <Arguments>
                                 <StringVariable>ep2cp_hdl</StringVariable>
                                 <BooleanValue>true</BooleanValue>
                              </Arguments>
                           </Command>
                        </NodeBody>
                     </Node>
                  </NodeList>
               </NodeBody>
            </Node>
            <Node NodeType="NodeList" epx="Sequence" LineNo="394" ColNo="8">
               <NodeId>Fly2B</NodeId>
               <VariableDeclarations>
                  <DeclareVariable>
                     <Name>ep2cp_hdl</Name>
                     <Type>String</Type>
                  </DeclareVariable>
               </VariableDeclarations>
               <StartCondition>
                  <EQInternal>
                     <NodeStateVariable>
                        <NodeRef dir="sibling">Fly2A</NodeRef>
                     </NodeStateVariable>
                     <NodeStateValue>FINISHED</NodeStateValue>
                  </EQInternal>
               </StartCondition>
               <InvariantCondition>
                  <NOT>
                     <OR>
                        <AND>
                           <EQInternal>
                              <NodeOutcomeVariable>
                                 <NodeRef dir="child">ep2cp_CmdWait</NodeRef>
                              </NodeOutcomeVariable>
                              <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                           </EQInternal>
                           <EQInternal>
                              <NodeStateVariable>
                                 <NodeRef dir="child">ep2cp_CmdWait</NodeRef>
                              </NodeStateVariable>
                              <NodeStateValue>FINISHED</NodeStateValue>
                           </EQInternal>
                        </AND>
                        <AND>
                           <EQInternal>
                              <NodeOutcomeVariable>
                                 <NodeRef dir="child">ep2cp_CmdAction_Fly2B</NodeRef>
                              </NodeOutcomeVariable>
                              <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                           </EQInternal>
                           <EQInternal>
                              <NodeStateVariable>
                                 <NodeRef dir="child">ep2cp_CmdAction_Fly2B</NodeRef>
                              </NodeStateVariable>
                              <NodeStateValue>FINISHED</NodeStateValue>
                           </EQInternal>
                        </AND>
                     </OR>
                  </NOT>
               </InvariantCondition>
               <NodeBody>
                  <NodeList>
                     <Node NodeType="Command">
                        <NodeId>ep2cp_CmdWait</NodeId>
                        <EndCondition>
                           <IsKnown>
                              <StringVariable>ep2cp_hdl</StringVariable>
                           </IsKnown>
                        </EndCondition>
                        <NodeBody>
                           <Command>
                              <StringVariable>ep2cp_hdl</StringVariable>
                              <Name>
                                 <StringValue>ReceiveCommand</StringValue>
                              </Name>
                              <Arguments>
                                 <StringValue>Fly2B</StringValue>
                              </Arguments>
                           </Command>
                        </NodeBody>
                     </Node>
                     <Node NodeType="NodeList">
                        <NodeId>ep2cp_CmdAction_Fly2B</NodeId>
                        <StartCondition>
                           <EQInternal>
                              <NodeStateVariable>
                                 <NodeRef dir="sibling">ep2cp_CmdWait</NodeRef>
                              </NodeStateVariable>
                              <NodeStateValue>FINISHED</NodeStateValue>
                           </EQInternal>
                        </StartCondition>
                        <NodeBody>
                           <NodeList>
                              <Node NodeType="NodeList" epx="Sequence" LineNo="396" ColNo="2">
                                 <NodeId>BLOCK__88</NodeId>
                                 <VariableDeclarations>
                                    <DeclareVariable LineNo="395" ColNo="2">
                                       <Name>At_B</Name>
                                       <Type>Boolean</Type>
                                       <InitialValue>
                                          <BooleanValue>false</BooleanValue>
                                       </InitialValue>
                                    </DeclareVariable>
                                 </VariableDeclarations>
                                 <InvariantCondition>
                                    <NOT>
                                       <OR>
                                          <AND>
                                             <EQInternal>
                                                <NodeOutcomeVariable>
                                                   <NodeRef dir="child">COMMAND__89</NodeRef>
                                                </NodeOutcomeVariable>
                                                <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                             </EQInternal>
                                             <EQInternal>
                                                <NodeStateVariable>
                                                   <NodeRef dir="child">COMMAND__89</NodeRef>
                                                </NodeStateVariable>
                                                <NodeStateValue>FINISHED</NodeStateValue>
                                             </EQInternal>
                                          </AND>
                                          <AND>
                                             <EQInternal>
                                                <NodeOutcomeVariable>
                                                   <NodeRef dir="child">COMMAND__90</NodeRef>
                                                </NodeOutcomeVariable>
                                                <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                             </EQInternal>
                                             <EQInternal>
                                                <NodeStateVariable>
                                                   <NodeRef dir="child">COMMAND__90</NodeRef>
                                                </NodeStateVariable>
                                                <NodeStateValue>FINISHED</NodeStateValue>
                                             </EQInternal>
                                          </AND>
                                          <AND>
                                             <EQInternal>
                                                <NodeOutcomeVariable>
                                                   <NodeRef dir="child">COMMAND__91</NodeRef>
                                                </NodeOutcomeVariable>
                                                <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                             </EQInternal>
                                             <EQInternal>
                                                <NodeStateVariable>
                                                   <NodeRef dir="child">COMMAND__91</NodeRef>
                                                </NodeStateVariable>
                                                <NodeStateValue>FINISHED</NodeStateValue>
                                             </EQInternal>
                                          </AND>
                                          <AND>
                                             <EQInternal>
                                                <NodeOutcomeVariable>
                                                   <NodeRef dir="child">COMMAND__92</NodeRef>
                                                </NodeOutcomeVariable>
                                                <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                             </EQInternal>
                                             <EQInternal>
                                                <NodeStateVariable>
                                                   <NodeRef dir="child">COMMAND__92</NodeRef>
                                                </NodeStateVariable>
                                                <NodeStateValue>FINISHED</NodeStateValue>
                                             </EQInternal>
                                          </AND>
                                          <AND>
                                             <EQInternal>
                                                <NodeOutcomeVariable>
                                                   <NodeRef dir="child">COMMAND__93</NodeRef>
                                                </NodeOutcomeVariable>
                                                <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                             </EQInternal>
                                             <EQInternal>
                                                <NodeStateVariable>
                                                   <NodeRef dir="child">COMMAND__93</NodeRef>
                                                </NodeStateVariable>
                                                <NodeStateValue>FINISHED</NodeStateValue>
                                             </EQInternal>
                                          </AND>
                                          <AND>
                                             <EQInternal>
                                                <NodeOutcomeVariable>
                                                   <NodeRef dir="child">COMMAND__94</NodeRef>
                                                </NodeOutcomeVariable>
                                                <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                             </EQInternal>
                                             <EQInternal>
                                                <NodeStateVariable>
                                                   <NodeRef dir="child">COMMAND__94</NodeRef>
                                                </NodeStateVariable>
                                                <NodeStateValue>FINISHED</NodeStateValue>
                                             </EQInternal>
                                          </AND>
                                          <AND>
                                             <EQInternal>
                                                <NodeOutcomeVariable>
                                                   <NodeRef dir="child">COMMAND__95</NodeRef>
                                                </NodeOutcomeVariable>
                                                <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                             </EQInternal>
                                             <EQInternal>
                                                <NodeStateVariable>
                                                   <NodeRef dir="child">COMMAND__95</NodeRef>
                                                </NodeStateVariable>
                                                <NodeStateValue>FINISHED</NodeStateValue>
                                             </EQInternal>
                                          </AND>
                                          <AND>
                                             <EQInternal>
                                                <NodeOutcomeVariable>
                                                   <NodeRef dir="child">COMMAND__96</NodeRef>
                                                </NodeOutcomeVariable>
                                                <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                             </EQInternal>
                                             <EQInternal>
                                                <NodeStateVariable>
                                                   <NodeRef dir="child">COMMAND__96</NodeRef>
                                                </NodeStateVariable>
                                                <NodeStateValue>FINISHED</NodeStateValue>
                                             </EQInternal>
                                          </AND>
                                          <AND>
                                             <EQInternal>
                                                <NodeOutcomeVariable>
                                                   <NodeRef dir="child">Not_at_B</NodeRef>
                                                </NodeOutcomeVariable>
                                                <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                             </EQInternal>
                                             <EQInternal>
                                                <NodeStateVariable>
                                                   <NodeRef dir="child">Not_at_B</NodeRef>
                                                </NodeStateVariable>
                                                <NodeStateValue>FINISHED</NodeStateValue>
                                             </EQInternal>
                                          </AND>
                                          <AND>
                                             <EQInternal>
                                                <NodeOutcomeVariable>
                                                   <NodeRef dir="child">Arrived_at_B</NodeRef>
                                                </NodeOutcomeVariable>
                                                <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                             </EQInternal>
                                             <EQInternal>
                                                <NodeStateVariable>
                                                   <NodeRef dir="child">Arrived_at_B</NodeRef>
                                                </NodeStateVariable>
                                                <NodeStateValue>FINISHED</NodeStateValue>
                                             </EQInternal>
                                          </AND>
                                       </OR>
                                    </NOT>
                                 </InvariantCondition>
                                 <NodeBody>
                                    <NodeList>
                                       <Node NodeType="Command" LineNo="397" ColNo="2">
                                          <NodeId>COMMAND__89</NodeId>
                                          <NodeBody>
                                             <Command>
                                                <Name>
                                                   <StringValue>pprint</StringValue>
                                                </Name>
                                                <Arguments LineNo="398" ColNo="9">
                                                   <StringValue>#########################################################################</StringValue>
                                                </Arguments>
                                             </Command>
                                          </NodeBody>
                                       </Node>
                                       <Node NodeType="Command" LineNo="398" ColNo="2">
                                          <NodeId>COMMAND__90</NodeId>
                                          <StartCondition>
                                             <EQInternal>
                                                <NodeStateVariable>
                                                   <NodeRef dir="sibling">COMMAND__89</NodeRef>
                                                </NodeStateVariable>
                                                <NodeStateValue>FINISHED</NodeStateValue>
                                             </EQInternal>
                                          </StartCondition>
                                          <NodeBody>
                                             <Command>
                                                <Name>
                                                   <StringValue>pprint</StringValue>
                                                </Name>
                                                <Arguments LineNo="399" ColNo="9">
                                                   <StringValue>#########################################################################</StringValue>
                                                </Arguments>
                                             </Command>
                                          </NodeBody>
                                       </Node>
                                       <Node NodeType="Command" LineNo="399" ColNo="2">
                                          <NodeId>COMMAND__91</NodeId>
                                          <StartCondition>
                                             <EQInternal>
                                                <NodeStateVariable>
                                                   <NodeRef dir="sibling">COMMAND__90</NodeRef>
                                                </NodeStateVariable>
                                                <NodeStateValue>FINISHED</NodeStateValue>
                                             </EQInternal>
                                          </StartCondition>
                                          <NodeBody>
                                             <Command>
                                                <Name>
                                                   <StringValue>pprint</StringValue>
                                                </Name>
                                                <Arguments LineNo="400" ColNo="9">
                                                   <StringValue>#########################################################################</StringValue>
                                                </Arguments>
                                             </Command>
                                          </NodeBody>
                                       </Node>
                                       <Node NodeType="Command" LineNo="400" ColNo="2">
                                          <NodeId>COMMAND__92</NodeId>
                                          <StartCondition>
                                             <EQInternal>
                                                <NodeStateVariable>
                                                   <NodeRef dir="sibling">COMMAND__91</NodeRef>
                                                </NodeStateVariable>
                                                <NodeStateValue>FINISHED</NodeStateValue>
                                             </EQInternal>
                                          </StartCondition>
                                          <NodeBody>
                                             <Command>
                                                <Name>
                                                   <StringValue>pprint</StringValue>
                                                </Name>
                                                <Arguments LineNo="401" ColNo="9">
                                                   <StringValue>#########################################################################</StringValue>
                                                </Arguments>
                                             </Command>
                                          </NodeBody>
                                       </Node>
                                       <Node NodeType="Command" LineNo="401" ColNo="2">
                                          <NodeId>COMMAND__93</NodeId>
                                          <StartCondition>
                                             <EQInternal>
                                                <NodeStateVariable>
                                                   <NodeRef dir="sibling">COMMAND__92</NodeRef>
                                                </NodeStateVariable>
                                                <NodeStateValue>FINISHED</NodeStateValue>
                                             </EQInternal>
                                          </StartCondition>
                                          <NodeBody>
                                             <Command>
                                                <Name>
                                                   <StringValue>pprint</StringValue>
                                                </Name>
                                                <Arguments LineNo="402" ColNo="9">
                                                   <StringValue>#########################################################################</StringValue>
                                                </Arguments>
                                             </Command>
                                          </NodeBody>
                                       </Node>
                                       <Node NodeType="Command" LineNo="403" ColNo="2">
                                          <NodeId>COMMAND__94</NodeId>
                                          <StartCondition>
                                             <EQInternal>
                                                <NodeStateVariable>
                                                   <NodeRef dir="sibling">COMMAND__93</NodeRef>
                                                </NodeStateVariable>
                                                <NodeStateValue>FINISHED</NodeStateValue>
                                             </EQInternal>
                                          </StartCondition>
                                          <NodeBody>
                                             <Command>
                                                <Name>
                                                   <StringValue>pprint</StringValue>
                                                </Name>
                                                <Arguments LineNo="404" ColNo="9">
                                                   <StringValue> </StringValue>
                                                </Arguments>
                                             </Command>
                                          </NodeBody>
                                       </Node>
                                       <Node NodeType="Command" LineNo="404" ColNo="2">
                                          <NodeId>COMMAND__95</NodeId>
                                          <StartCondition>
                                             <EQInternal>
                                                <NodeStateVariable>
                                                   <NodeRef dir="sibling">COMMAND__94</NodeRef>
                                                </NodeStateVariable>
                                                <NodeStateValue>FINISHED</NodeStateValue>
                                             </EQInternal>
                                          </StartCondition>
                                          <NodeBody>
                                             <Command>
                                                <Name>
                                                   <StringValue>pprint</StringValue>
                                                </Name>
                                                <Arguments LineNo="405" ColNo="9">
                                                   <StringValue>##################### Starting flight to Waypoint B #####################</StringValue>
                                                </Arguments>
                                             </Command>
                                          </NodeBody>
                                       </Node>
                                       <Node NodeType="Command" LineNo="405" ColNo="2">
                                          <NodeId>COMMAND__96</NodeId>
                                          <StartCondition>
                                             <EQInternal>
                                                <NodeStateVariable>
                                                   <NodeRef dir="sibling">COMMAND__95</NodeRef>
                                                </NodeStateVariable>
                                                <NodeStateValue>FINISHED</NodeStateValue>
                                             </EQInternal>
                                          </StartCondition>
                                          <NodeBody>
                                             <Command>
                                                <Name>
                                                   <StringValue>pprint</StringValue>
                                                </Name>
                                                <Arguments LineNo="406" ColNo="9">
                                                   <StringValue>Waypoint B is at x =</StringValue>
                                                   <LookupNow>
                                                      <Name>
                                                         <StringValue>xWaypoint_B</StringValue>
                                                      </Name>
                                                   </LookupNow>
                                                   <StringValue>y =</StringValue>
                                                   <LookupNow>
                                                      <Name>
                                                         <StringValue>yWaypoint_B</StringValue>
                                                      </Name>
                                                   </LookupNow>
                                                   <StringValue>z =</StringValue>
                                                   <LookupNow>
                                                      <Name>
                                                         <StringValue>zWaypoint_B</StringValue>
                                                      </Name>
                                                   </LookupNow>
                                                </Arguments>
                                             </Command>
                                          </NodeBody>
                                       </Node>
                                       <Node NodeType="NodeList" epx="Sequence" LineNo="410" ColNo="3">
                                          <NodeId>Not_at_B</NodeId>
                                          <StartCondition>
                                             <AND>
                                                <EQInternal>
                                                   <NodeStateVariable>
                                                      <NodeRef dir="sibling">COMMAND__96</NodeRef>
                                                   </NodeStateVariable>
                                                   <NodeStateValue>FINISHED</NodeStateValue>
                                                </EQInternal>
                                                <NOT>
                                                   <BooleanVariable>At_B</BooleanVariable>
                                                </NOT>
                                             </AND>
                                          </StartCondition>
                                          <RepeatCondition>
                                             <NOT>
                                                <BooleanVariable>At_B</BooleanVariable>
                                             </NOT>
                                          </RepeatCondition>
                                          <PreCondition>
                                             <IsKnown>
                                                <BooleanVariable>At_B</BooleanVariable>
                                             </IsKnown>
                                          </PreCondition>
                                          <InvariantCondition>
                                             <NOT>
                                                <OR>
                                                   <AND>
                                                      <EQInternal>
                                                         <NodeOutcomeVariable>
                                                            <NodeRef dir="child">COMMAND__97</NodeRef>
                                                         </NodeOutcomeVariable>
                                                         <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                      </EQInternal>
                                                      <EQInternal>
                                                         <NodeStateVariable>
                                                            <NodeRef dir="child">COMMAND__97</NodeRef>
                                                         </NodeStateVariable>
                                                         <NodeStateValue>FINISHED</NodeStateValue>
                                                      </EQInternal>
                                                   </AND>
                                                   <AND>
                                                      <EQInternal>
                                                         <NodeOutcomeVariable>
                                                            <NodeRef dir="child">COMMAND__98</NodeRef>
                                                         </NodeOutcomeVariable>
                                                         <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                      </EQInternal>
                                                      <EQInternal>
                                                         <NodeStateVariable>
                                                            <NodeRef dir="child">COMMAND__98</NodeRef>
                                                         </NodeStateVariable>
                                                         <NodeStateValue>FINISHED</NodeStateValue>
                                                      </EQInternal>
                                                   </AND>
                                                   <AND>
                                                      <EQInternal>
                                                         <NodeOutcomeVariable>
                                                            <NodeRef dir="child">ExecuteGetParams</NodeRef>
                                                         </NodeOutcomeVariable>
                                                         <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                      </EQInternal>
                                                      <EQInternal>
                                                         <NodeStateVariable>
                                                            <NodeRef dir="child">ExecuteGetParams</NodeRef>
                                                         </NodeStateVariable>
                                                         <NodeStateValue>FINISHED</NodeStateValue>
                                                      </EQInternal>
                                                   </AND>
                                                   <AND>
                                                      <EQInternal>
                                                         <NodeOutcomeVariable>
                                                            <NodeRef dir="child">MonitorParams</NodeRef>
                                                         </NodeOutcomeVariable>
                                                         <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                      </EQInternal>
                                                      <EQInternal>
                                                         <NodeStateVariable>
                                                            <NodeRef dir="child">MonitorParams</NodeRef>
                                                         </NodeStateVariable>
                                                         <NodeStateValue>FINISHED</NodeStateValue>
                                                      </EQInternal>
                                                   </AND>
                                                </OR>
                                             </NOT>
                                          </InvariantCondition>
                                          <NodeBody>
                                             <NodeList>
                                                <Node NodeType="Command" LineNo="413" ColNo="3">
                                                   <NodeId>COMMAND__97</NodeId>
                                                   <NodeBody>
                                                      <Command>
                                                         <Name>
                                                            <StringValue>pprint</StringValue>
                                                         </Name>
                                                         <Arguments LineNo="414" ColNo="10">
                                                            <StringValue>#########################################################################</StringValue>
                                                         </Arguments>
                                                      </Command>
                                                   </NodeBody>
                                                </Node>
                                                <Node NodeType="Command" LineNo="414" ColNo="3">
                                                   <NodeId>COMMAND__98</NodeId>
                                                   <StartCondition>
                                                      <EQInternal>
                                                         <NodeStateVariable>
                                                            <NodeRef dir="sibling">COMMAND__97</NodeRef>
                                                         </NodeStateVariable>
                                                         <NodeStateValue>FINISHED</NodeStateValue>
                                                      </EQInternal>
                                                   </StartCondition>
                                                   <NodeBody>
                                                      <Command>
                                                         <Name>
                                                            <StringValue>pprint</StringValue>
                                                         </Name>
                                                         <Arguments LineNo="415" ColNo="10">
                                                            <StringValue>Currently at x =</StringValue>
                                                            <LookupNow>
                                                               <Name>
                                                                  <StringValue>xLoc</StringValue>
                                                               </Name>
                                                            </LookupNow>
                                                            <StringValue>y =</StringValue>
                                                            <LookupNow>
                                                               <Name>
                                                                  <StringValue>yLoc</StringValue>
                                                               </Name>
                                                            </LookupNow>
                                                            <StringValue>z =</StringValue>
                                                            <LookupNow>
                                                               <Name>
                                                                  <StringValue>zLoc</StringValue>
                                                               </Name>
                                                            </LookupNow>
                                                         </Arguments>
                                                      </Command>
                                                   </NodeBody>
                                                </Node>
                                                <Node NodeType="NodeList" epx="Sequence" LineNo="419" ColNo="4">
                                                   <NodeId>ExecuteGetParams</NodeId>
                                                   <VariableDeclarations>
                                                      <DeclareVariable LineNo="418" ColNo="4">
                                                         <Name>velocity</Name>
                                                         <Type>Real</Type>
                                                      </DeclareVariable>
                                                      <DeclareVariable LineNo="419" ColNo="4">
                                                         <Name>xLocation</Name>
                                                         <Type>Real</Type>
                                                      </DeclareVariable>
                                                      <DeclareVariable LineNo="420" ColNo="4">
                                                         <Name>yLocation</Name>
                                                         <Type>Real</Type>
                                                      </DeclareVariable>
                                                      <DeclareVariable LineNo="421" ColNo="4">
                                                         <Name>zLocation</Name>
                                                         <Type>Real</Type>
                                                      </DeclareVariable>
                                                   </VariableDeclarations>
                                                   <StartCondition>
                                                      <EQInternal>
                                                         <NodeStateVariable>
                                                            <NodeRef dir="sibling">COMMAND__98</NodeRef>
                                                         </NodeStateVariable>
                                                         <NodeStateValue>FINISHED</NodeStateValue>
                                                      </EQInternal>
                                                   </StartCondition>
                                                   <InvariantCondition>
                                                      <NOT>
                                                         <OR>
                                                            <AND>
                                                               <EQInternal>
                                                                  <NodeOutcomeVariable>
                                                                     <NodeRef dir="child">ASSIGNMENT__99</NodeRef>
                                                                  </NodeOutcomeVariable>
                                                                  <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                               </EQInternal>
                                                               <EQInternal>
                                                                  <NodeStateVariable>
                                                                     <NodeRef dir="child">ASSIGNMENT__99</NodeRef>
                                                                  </NodeStateVariable>
                                                                  <NodeStateValue>FINISHED</NodeStateValue>
                                                               </EQInternal>
                                                            </AND>
                                                            <AND>
                                                               <EQInternal>
                                                                  <NodeOutcomeVariable>
                                                                     <NodeRef dir="child">ASSIGNMENT__100</NodeRef>
                                                                  </NodeOutcomeVariable>
                                                                  <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                               </EQInternal>
                                                               <EQInternal>
                                                                  <NodeStateVariable>
                                                                     <NodeRef dir="child">ASSIGNMENT__100</NodeRef>
                                                                  </NodeStateVariable>
                                                                  <NodeStateValue>FINISHED</NodeStateValue>
                                                               </EQInternal>
                                                            </AND>
                                                            <AND>
                                                               <EQInternal>
                                                                  <NodeOutcomeVariable>
                                                                     <NodeRef dir="child">ASSIGNMENT__101</NodeRef>
                                                                  </NodeOutcomeVariable>
                                                                  <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                               </EQInternal>
                                                               <EQInternal>
                                                                  <NodeStateVariable>
                                                                     <NodeRef dir="child">ASSIGNMENT__101</NodeRef>
                                                                  </NodeStateVariable>
                                                                  <NodeStateValue>FINISHED</NodeStateValue>
                                                               </EQInternal>
                                                            </AND>
                                                            <AND>
                                                               <EQInternal>
                                                                  <NodeOutcomeVariable>
                                                                     <NodeRef dir="child">ASSIGNMENT__102</NodeRef>
                                                                  </NodeOutcomeVariable>
                                                                  <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                               </EQInternal>
                                                               <EQInternal>
                                                                  <NodeStateVariable>
                                                                     <NodeRef dir="child">ASSIGNMENT__102</NodeRef>
                                                                  </NodeStateVariable>
                                                                  <NodeStateValue>FINISHED</NodeStateValue>
                                                               </EQInternal>
                                                            </AND>
                                                            <AND>
                                                               <EQInternal>
                                                                  <NodeOutcomeVariable>
                                                                     <NodeRef dir="child">GetParams</NodeRef>
                                                                  </NodeOutcomeVariable>
                                                                  <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                               </EQInternal>
                                                               <EQInternal>
                                                                  <NodeStateVariable>
                                                                     <NodeRef dir="child">GetParams</NodeRef>
                                                                  </NodeStateVariable>
                                                                  <NodeStateValue>FINISHED</NodeStateValue>
                                                               </EQInternal>
                                                            </AND>
                                                            <AND>
                                                               <EQInternal>
                                                                  <NodeOutcomeVariable>
                                                                     <NodeRef dir="child">CheckLocation</NodeRef>
                                                                  </NodeOutcomeVariable>
                                                                  <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                               </EQInternal>
                                                               <EQInternal>
                                                                  <NodeStateVariable>
                                                                     <NodeRef dir="child">CheckLocation</NodeRef>
                                                                  </NodeStateVariable>
                                                                  <NodeStateValue>FINISHED</NodeStateValue>
                                                               </EQInternal>
                                                            </AND>
                                                         </OR>
                                                      </NOT>
                                                   </InvariantCondition>
                                                   <NodeBody>
                                                      <NodeList>
                                                         <Node NodeType="Assignment" LineNo="425" ColNo="4">
                                                            <NodeId>ASSIGNMENT__99</NodeId>
                                                            <NodeBody>
                                                               <Assignment>
                                                                  <RealVariable>velocity</RealVariable>
                                                                  <NumericRHS>
                                                                     <LookupNow>
                                                                        <Name>
                                                                           <StringValue>vel</StringValue>
                                                                        </Name>
                                                                     </LookupNow>
                                                                  </NumericRHS>
                                                               </Assignment>
                                                            </NodeBody>
                                                         </Node>
                                                         <Node NodeType="Assignment" LineNo="426" ColNo="4">
                                                            <NodeId>ASSIGNMENT__100</NodeId>
                                                            <StartCondition>
                                                               <EQInternal>
                                                                  <NodeStateVariable>
                                                                     <NodeRef dir="sibling">ASSIGNMENT__99</NodeRef>
                                                                  </NodeStateVariable>
                                                                  <NodeStateValue>FINISHED</NodeStateValue>
                                                               </EQInternal>
                                                            </StartCondition>
                                                            <NodeBody>
                                                               <Assignment>
                                                                  <RealVariable>xLocation</RealVariable>
                                                                  <NumericRHS>
                                                                     <LookupNow>
                                                                        <Name>
                                                                           <StringValue>xLoc</StringValue>
                                                                        </Name>
                                                                     </LookupNow>
                                                                  </NumericRHS>
                                                               </Assignment>
                                                            </NodeBody>
                                                         </Node>
                                                         <Node NodeType="Assignment" LineNo="427" ColNo="4">
                                                            <NodeId>ASSIGNMENT__101</NodeId>
                                                            <StartCondition>
                                                               <EQInternal>
                                                                  <NodeStateVariable>
                                                                     <NodeRef dir="sibling">ASSIGNMENT__100</NodeRef>
                                                                  </NodeStateVariable>
                                                                  <NodeStateValue>FINISHED</NodeStateValue>
                                                               </EQInternal>
                                                            </StartCondition>
                                                            <NodeBody>
                                                               <Assignment>
                                                                  <RealVariable>yLocation</RealVariable>
                                                                  <NumericRHS>
                                                                     <LookupNow>
                                                                        <Name>
                                                                           <StringValue>yLoc</StringValue>
                                                                        </Name>
                                                                     </LookupNow>
                                                                  </NumericRHS>
                                                               </Assignment>
                                                            </NodeBody>
                                                         </Node>
                                                         <Node NodeType="Assignment" LineNo="428" ColNo="4">
                                                            <NodeId>ASSIGNMENT__102</NodeId>
                                                            <StartCondition>
                                                               <EQInternal>
                                                                  <NodeStateVariable>
                                                                     <NodeRef dir="sibling">ASSIGNMENT__101</NodeRef>
                                                                  </NodeStateVariable>
                                                                  <NodeStateValue>FINISHED</NodeStateValue>
                                                               </EQInternal>
                                                            </StartCondition>
                                                            <NodeBody>
                                                               <Assignment>
                                                                  <RealVariable>zLocation</RealVariable>
                                                                  <NumericRHS>
                                                                     <LookupNow>
                                                                        <Name>
                                                                           <StringValue>zLoc</StringValue>
                                                                        </Name>
                                                                     </LookupNow>
                                                                  </NumericRHS>
                                                               </Assignment>
                                                            </NodeBody>
                                                         </Node>
                                                         <Node NodeType="NodeList" epx="Sequence" LineNo="432" ColNo="5">
                                                            <NodeId>GetParams</NodeId>
                                                            <VariableDeclarations>
                                                               <DeclareVariable LineNo="431" ColNo="5">
                                                                  <Name>GetParamsSuccess</Name>
                                                                  <Type>Boolean</Type>
                                                               </DeclareVariable>
                                                            </VariableDeclarations>
                                                            <StartCondition>
                                                               <EQInternal>
                                                                  <NodeStateVariable>
                                                                     <NodeRef dir="sibling">ASSIGNMENT__102</NodeRef>
                                                                  </NodeStateVariable>
                                                                  <NodeStateValue>FINISHED</NodeStateValue>
                                                               </EQInternal>
                                                            </StartCondition>
                                                            <PostCondition>
                                                               <BooleanVariable>GetParamsSuccess</BooleanVariable>
                                                            </PostCondition>
                                                            <InvariantCondition>
                                                               <NOT>
                                                                  <OR>
                                                                     <AND>
                                                                        <EQInternal>
                                                                           <NodeOutcomeVariable>
                                                                              <NodeRef dir="child">COMMAND__103</NodeRef>
                                                                           </NodeOutcomeVariable>
                                                                           <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                                        </EQInternal>
                                                                        <EQInternal>
                                                                           <NodeStateVariable>
                                                                              <NodeRef dir="child">COMMAND__103</NodeRef>
                                                                           </NodeStateVariable>
                                                                           <NodeStateValue>FINISHED</NodeStateValue>
                                                                        </EQInternal>
                                                                     </AND>
                                                                     <AND>
                                                                        <EQInternal>
                                                                           <NodeOutcomeVariable>
                                                                              <NodeRef dir="child">COMMAND__104</NodeRef>
                                                                           </NodeOutcomeVariable>
                                                                           <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                                        </EQInternal>
                                                                        <EQInternal>
                                                                           <NodeStateVariable>
                                                                              <NodeRef dir="child">COMMAND__104</NodeRef>
                                                                           </NodeStateVariable>
                                                                           <NodeStateValue>FINISHED</NodeStateValue>
                                                                        </EQInternal>
                                                                     </AND>
                                                                     <AND>
                                                                        <EQInternal>
                                                                           <NodeOutcomeVariable>
                                                                              <NodeRef dir="child">Command_GetParams</NodeRef>
                                                                           </NodeOutcomeVariable>
                                                                           <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                                        </EQInternal>
                                                                        <EQInternal>
                                                                           <NodeStateVariable>
                                                                              <NodeRef dir="child">Command_GetParams</NodeRef>
                                                                           </NodeStateVariable>
                                                                           <NodeStateValue>FINISHED</NodeStateValue>
                                                                        </EQInternal>
                                                                     </AND>
                                                                     <AND>
                                                                        <EQInternal>
                                                                           <NodeOutcomeVariable>
                                                                              <NodeRef dir="child">if__106</NodeRef>
                                                                           </NodeOutcomeVariable>
                                                                           <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                                        </EQInternal>
                                                                        <EQInternal>
                                                                           <NodeStateVariable>
                                                                              <NodeRef dir="child">if__106</NodeRef>
                                                                           </NodeStateVariable>
                                                                           <NodeStateValue>FINISHED</NodeStateValue>
                                                                        </EQInternal>
                                                                     </AND>
                                                                  </OR>
                                                               </NOT>
                                                            </InvariantCondition>
                                                            <NodeBody>
                                                               <NodeList>
                                                                  <Node NodeType="Command" LineNo="434" ColNo="5">
                                                                     <NodeId>COMMAND__103</NodeId>
                                                                     <NodeBody>
                                                                        <Command>
                                                                           <Name>
                                                                              <StringValue>pprint</StringValue>
                                                                           </Name>
                                                                           <Arguments LineNo="435" ColNo="12">
                                                                              <StringValue> </StringValue>
                                                                           </Arguments>
                                                                        </Command>
                                                                     </NodeBody>
                                                                  </Node>
                                                                  <Node NodeType="Command" LineNo="435" ColNo="5">
                                                                     <NodeId>COMMAND__104</NodeId>
                                                                     <StartCondition>
                                                                        <EQInternal>
                                                                           <NodeStateVariable>
                                                                              <NodeRef dir="sibling">COMMAND__103</NodeRef>
                                                                           </NodeStateVariable>
                                                                           <NodeStateValue>FINISHED</NodeStateValue>
                                                                        </EQInternal>
                                                                     </StartCondition>
                                                                     <NodeBody>
                                                                        <Command>
                                                                           <Name>
                                                                              <StringValue>pprint</StringValue>
                                                                           </Name>
                                                                           <Arguments LineNo="436" ColNo="12">
                                                                              <StringValue>Entering GetParams</StringValue>
                                                                           </Arguments>
                                                                        </Command>
                                                                     </NodeBody>
                                                                  </Node>
                                                                  <Node NodeType="NodeList" epx="Sequence" LineNo="440" ColNo="6">
                                                                     <NodeId>Command_GetParams</NodeId>
                                                                     <StartCondition>
                                                                        <EQInternal>
                                                                           <NodeStateVariable>
                                                                              <NodeRef dir="sibling">COMMAND__104</NodeRef>
                                                                           </NodeStateVariable>
                                                                           <NodeStateValue>FINISHED</NodeStateValue>
                                                                        </EQInternal>
                                                                     </StartCondition>
                                                                     <InvariantCondition>
                                                                        <NOT>
                                                                           <AND>
                                                                              <EQInternal>
                                                                                 <NodeOutcomeVariable>
                                                                                    <NodeRef dir="child">SynchronousCommand__105</NodeRef>
                                                                                 </NodeOutcomeVariable>
                                                                                 <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                                              </EQInternal>
                                                                              <EQInternal>
                                                                                 <NodeStateVariable>
                                                                                    <NodeRef dir="child">SynchronousCommand__105</NodeRef>
                                                                                 </NodeStateVariable>
                                                                                 <NodeStateValue>FINISHED</NodeStateValue>
                                                                              </EQInternal>
                                                                           </AND>
                                                                        </NOT>
                                                                     </InvariantCondition>
                                                                     <NodeBody>
                                                                        <NodeList>
                                                                           <Node NodeType="NodeList" epx="SynchronousCommand" LineNo="440" ColNo="6">
                                                                              <NodeId>SynchronousCommand__105</NodeId>
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
                                                                                                         <StringValue>GetParams</StringValue>
                                                                                                      </Name>
                                                                                                      <Arguments LineNo="440" ColNo="54">
                                                                                                         <RealVariable>velocity</RealVariable>
                                                                                                         <RealVariable>xLocation</RealVariable>
                                                                                                         <RealVariable>yLocation</RealVariable>
                                                                                                         <RealVariable>zLocation</RealVariable>
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
                                                                                                      <BooleanVariable>GetParamsSuccess</BooleanVariable>
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
                                                                  <Node NodeType="NodeList" epx="If" LineNo="443" ColNo="5">
                                                                     <NodeId>if__106</NodeId>
                                                                     <StartCondition>
                                                                        <EQInternal>
                                                                           <NodeStateVariable>
                                                                              <NodeRef dir="sibling">Command_GetParams</NodeRef>
                                                                           </NodeStateVariable>
                                                                           <NodeStateValue>FINISHED</NodeStateValue>
                                                                        </EQInternal>
                                                                     </StartCondition>
                                                                     <NodeBody>
                                                                        <NodeList>
                                                                           <Node NodeType="Empty" epx="Condition">
                                                                              <NodeId>ep2cp_IfTest</NodeId>
                                                                              <PostCondition>
                                                                                 <BooleanVariable>GetParamsSuccess</BooleanVariable>
                                                                              </PostCondition>
                                                                           </Node>
                                                                           <Node NodeType="NodeList" epx="Then" LineNo="445" ColNo="6">
                                                                              <NodeId>BLOCK__107</NodeId>
                                                                              <InvariantCondition>
                                                                                 <NOT>
                                                                                    <OR>
                                                                                       <AND>
                                                                                          <EQInternal>
                                                                                             <NodeOutcomeVariable>
                                                                                                <NodeRef dir="child">COMMAND__108</NodeRef>
                                                                                             </NodeOutcomeVariable>
                                                                                             <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                                                          </EQInternal>
                                                                                          <EQInternal>
                                                                                             <NodeStateVariable>
                                                                                                <NodeRef dir="child">COMMAND__108</NodeRef>
                                                                                             </NodeStateVariable>
                                                                                             <NodeStateValue>FINISHED</NodeStateValue>
                                                                                          </EQInternal>
                                                                                       </AND>
                                                                                       <AND>
                                                                                          <EQInternal>
                                                                                             <NodeOutcomeVariable>
                                                                                                <NodeRef dir="child">COMMAND__109</NodeRef>
                                                                                             </NodeOutcomeVariable>
                                                                                             <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                                                          </EQInternal>
                                                                                          <EQInternal>
                                                                                             <NodeStateVariable>
                                                                                                <NodeRef dir="child">COMMAND__109</NodeRef>
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
                                                                                    <Node NodeType="Command" LineNo="444" ColNo="6">
                                                                                       <NodeId>COMMAND__108</NodeId>
                                                                                       <NodeBody>
                                                                                          <Command>
                                                                                             <Name>
                                                                                                <StringValue>pprint</StringValue>
                                                                                             </Name>
                                                                                             <Arguments LineNo="445" ColNo="13">
                                                                                                <StringValue>Parameters successfully obtained</StringValue>
                                                                                             </Arguments>
                                                                                          </Command>
                                                                                       </NodeBody>
                                                                                    </Node>
                                                                                    <Node NodeType="Command" LineNo="445" ColNo="6">
                                                                                       <NodeId>COMMAND__109</NodeId>
                                                                                       <StartCondition>
                                                                                          <EQInternal>
                                                                                             <NodeStateVariable>
                                                                                                <NodeRef dir="sibling">COMMAND__108</NodeRef>
                                                                                             </NodeStateVariable>
                                                                                             <NodeStateValue>FINISHED</NodeStateValue>
                                                                                          </EQInternal>
                                                                                       </StartCondition>
                                                                                       <NodeBody>
                                                                                          <Command>
                                                                                             <Name>
                                                                                                <StringValue>pprint</StringValue>
                                                                                             </Name>
                                                                                             <Arguments LineNo="446" ColNo="13">
                                                                                                <StringValue>Parameters received: vel =</StringValue>
                                                                                                <LookupNow>
                                                                                                   <Name>
                                                                                                      <StringValue>vel</StringValue>
                                                                                                   </Name>
                                                                                                </LookupNow>
                                                                                                <StringValue>x =</StringValue>
                                                                                                <LookupNow>
                                                                                                   <Name>
                                                                                                      <StringValue>xLoc</StringValue>
                                                                                                   </Name>
                                                                                                </LookupNow>
                                                                                                <StringValue>y =</StringValue>
                                                                                                <LookupNow>
                                                                                                   <Name>
                                                                                                      <StringValue>yLoc</StringValue>
                                                                                                   </Name>
                                                                                                </LookupNow>
                                                                                                <StringValue>z =</StringValue>
                                                                                                <LookupNow>
                                                                                                   <Name>
                                                                                                      <StringValue>zLoc</StringValue>
                                                                                                   </Name>
                                                                                                </LookupNow>
                                                                                             </Arguments>
                                                                                          </Command>
                                                                                       </NodeBody>
                                                                                    </Node>
                                                                                 </NodeList>
                                                                              </NodeBody>
                                                                           </Node>
                                                                           <Node NodeType="Command" epx="Else" LineNo="449" ColNo="6">
                                                                              <NodeId>COMMAND__111</NodeId>
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
                                                                                    <Arguments LineNo="450" ColNo="13">
                                                                                       <StringValue>Obtaining parameters FAILED!!!</StringValue>
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
                                                         <Node NodeType="NodeList" epx="Concurrence" LineNo="456" ColNo="19">
                                                            <NodeId>CheckLocation</NodeId>
                                                            <StartCondition>
                                                               <EQInternal>
                                                                  <NodeStateVariable>
                                                                     <NodeRef dir="sibling">GetParams</NodeRef>
                                                                  </NodeStateVariable>
                                                                  <NodeStateValue>FINISHED</NodeStateValue>
                                                               </EQInternal>
                                                            </StartCondition>
                                                            <PostCondition>
                                                               <OR>
                                                                  <EQInternal>
                                                                     <NodeOutcomeVariable>
                                                                        <NodeId>EnRoute_to_B</NodeId>
                                                                     </NodeOutcomeVariable>
                                                                     <NodeOutcomeValue>SUCCESS</NodeOutcomeValue>
                                                                  </EQInternal>
                                                                  <EQInternal>
                                                                     <NodeOutcomeVariable>
                                                                        <NodeId>Arriving_at_B</NodeId>
                                                                     </NodeOutcomeVariable>
                                                                     <NodeOutcomeValue>SUCCESS</NodeOutcomeValue>
                                                                  </EQInternal>
                                                                  <EQInternal>
                                                                     <NodeOutcomeVariable>
                                                                        <NodeId>Arrived_at_B</NodeId>
                                                                     </NodeOutcomeVariable>
                                                                     <NodeOutcomeValue>SUCCESS</NodeOutcomeValue>
                                                                  </EQInternal>
                                                               </OR>
                                                            </PostCondition>
                                                            <NodeBody>
                                                               <NodeList>
                                                                  <Node NodeType="Command" LineNo="464" ColNo="6">
                                                                     <NodeId>EnRoute_to_B</NodeId>
                                                                     <StartCondition>
                                                                        <OR>
                                                                           <GT>
                                                                              <SUB LineNo="462" ColNo="42">
                                                                                 <LookupOnChange>
                                                                                    <Name>
                                                                                       <StringValue>xWaypoint_B</StringValue>
                                                                                    </Name>
                                                                                 </LookupOnChange>
                                                                                 <LookupOnChange>
                                                                                    <Name>
                                                                                       <StringValue>xLoc</StringValue>
                                                                                    </Name>
                                                                                 </LookupOnChange>
                                                                              </SUB>
                                                                              <IntegerValue>1</IntegerValue>
                                                                           </GT>
                                                                           <GT>
                                                                              <SUB LineNo="462" ColNo="86">
                                                                                 <LookupOnChange>
                                                                                    <Name>
                                                                                       <StringValue>yWaypoint_B</StringValue>
                                                                                    </Name>
                                                                                 </LookupOnChange>
                                                                                 <LookupOnChange>
                                                                                    <Name>
                                                                                       <StringValue>yLoc</StringValue>
                                                                                    </Name>
                                                                                 </LookupOnChange>
                                                                              </SUB>
                                                                              <IntegerValue>1</IntegerValue>
                                                                           </GT>
                                                                           <GT>
                                                                              <SUB LineNo="462" ColNo="130">
                                                                                 <LookupOnChange>
                                                                                    <Name>
                                                                                       <StringValue>zWaypoint_B</StringValue>
                                                                                    </Name>
                                                                                 </LookupOnChange>
                                                                                 <LookupOnChange>
                                                                                    <Name>
                                                                                       <StringValue>zLoc</StringValue>
                                                                                    </Name>
                                                                                 </LookupOnChange>
                                                                              </SUB>
                                                                              <IntegerValue>1</IntegerValue>
                                                                           </GT>
                                                                        </OR>
                                                                     </StartCondition>
                                                                     <SkipCondition>
                                                                        <AND>
                                                                           <LE>
                                                                              <SUB LineNo="463" ColNo="41">
                                                                                 <LookupOnChange>
                                                                                    <Name>
                                                                                       <StringValue>xWaypoint_B</StringValue>
                                                                                    </Name>
                                                                                 </LookupOnChange>
                                                                                 <LookupOnChange>
                                                                                    <Name>
                                                                                       <StringValue>xLoc</StringValue>
                                                                                    </Name>
                                                                                 </LookupOnChange>
                                                                              </SUB>
                                                                              <IntegerValue>1</IntegerValue>
                                                                           </LE>
                                                                           <LE>
                                                                              <SUB LineNo="463" ColNo="86">
                                                                                 <LookupOnChange>
                                                                                    <Name>
                                                                                       <StringValue>yWaypoint_B</StringValue>
                                                                                    </Name>
                                                                                 </LookupOnChange>
                                                                                 <LookupOnChange>
                                                                                    <Name>
                                                                                       <StringValue>yLoc</StringValue>
                                                                                    </Name>
                                                                                 </LookupOnChange>
                                                                              </SUB>
                                                                              <IntegerValue>1</IntegerValue>
                                                                           </LE>
                                                                           <LE>
                                                                              <SUB LineNo="463" ColNo="131">
                                                                                 <LookupOnChange>
                                                                                    <Name>
                                                                                       <StringValue>zWaypoint_B</StringValue>
                                                                                    </Name>
                                                                                 </LookupOnChange>
                                                                                 <LookupOnChange>
                                                                                    <Name>
                                                                                       <StringValue>zLoc</StringValue>
                                                                                    </Name>
                                                                                 </LookupOnChange>
                                                                              </SUB>
                                                                              <IntegerValue>1</IntegerValue>
                                                                           </LE>
                                                                        </AND>
                                                                     </SkipCondition>
                                                                     <NodeBody>
                                                                        <Command>
                                                                           <Name>
                                                                              <StringValue>pprint</StringValue>
                                                                           </Name>
                                                                           <Arguments LineNo="465" ColNo="13">
                                                                              <StringValue>Updated Flight Status: Maintaing Route to B</StringValue>
                                                                           </Arguments>
                                                                        </Command>
                                                                     </NodeBody>
                                                                  </Node>
                                                                  <Node NodeType="NodeList" epx="Sequence" LineNo="471" ColNo="6">
                                                                     <NodeId>Arriving_at_B</NodeId>
                                                                     <VariableDeclarations>
                                                                        <DeclareVariable LineNo="470" ColNo="6">
                                                                           <Name>ScienceActivated</Name>
                                                                           <Type>Boolean</Type>
                                                                        </DeclareVariable>
                                                                     </VariableDeclarations>
                                                                     <StartCondition>
                                                                        <AND>
                                                                           <LE>
                                                                              <SUB LineNo="472" ColNo="42">
                                                                                 <LookupOnChange>
                                                                                    <Name>
                                                                                       <StringValue>xWaypoint_B</StringValue>
                                                                                    </Name>
                                                                                 </LookupOnChange>
                                                                                 <LookupOnChange>
                                                                                    <Name>
                                                                                       <StringValue>xLoc</StringValue>
                                                                                    </Name>
                                                                                 </LookupOnChange>
                                                                              </SUB>
                                                                              <IntegerValue>1</IntegerValue>
                                                                           </LE>
                                                                           <LE>
                                                                              <SUB LineNo="472" ColNo="87">
                                                                                 <LookupOnChange>
                                                                                    <Name>
                                                                                       <StringValue>yWaypoint_B</StringValue>
                                                                                    </Name>
                                                                                 </LookupOnChange>
                                                                                 <LookupOnChange>
                                                                                    <Name>
                                                                                       <StringValue>yLoc</StringValue>
                                                                                    </Name>
                                                                                 </LookupOnChange>
                                                                              </SUB>
                                                                              <IntegerValue>1</IntegerValue>
                                                                           </LE>
                                                                           <LE>
                                                                              <SUB LineNo="472" ColNo="132">
                                                                                 <LookupOnChange>
                                                                                    <Name>
                                                                                       <StringValue>zWaypoint_B</StringValue>
                                                                                    </Name>
                                                                                 </LookupOnChange>
                                                                                 <LookupOnChange>
                                                                                    <Name>
                                                                                       <StringValue>zLoc</StringValue>
                                                                                    </Name>
                                                                                 </LookupOnChange>
                                                                              </SUB>
                                                                              <IntegerValue>1</IntegerValue>
                                                                           </LE>
                                                                        </AND>
                                                                     </StartCondition>
                                                                     <SkipCondition>
                                                                        <OR>
                                                                           <GT>
                                                                              <SUB LineNo="473" ColNo="41">
                                                                                 <LookupOnChange>
                                                                                    <Name>
                                                                                       <StringValue>xWaypoint_B</StringValue>
                                                                                    </Name>
                                                                                 </LookupOnChange>
                                                                                 <LookupOnChange>
                                                                                    <Name>
                                                                                       <StringValue>xLoc</StringValue>
                                                                                    </Name>
                                                                                 </LookupOnChange>
                                                                              </SUB>
                                                                              <IntegerValue>1</IntegerValue>
                                                                           </GT>
                                                                           <GT>
                                                                              <SUB LineNo="473" ColNo="85">
                                                                                 <LookupOnChange>
                                                                                    <Name>
                                                                                       <StringValue>yWaypoint_B</StringValue>
                                                                                    </Name>
                                                                                 </LookupOnChange>
                                                                                 <LookupOnChange>
                                                                                    <Name>
                                                                                       <StringValue>yLoc</StringValue>
                                                                                    </Name>
                                                                                 </LookupOnChange>
                                                                              </SUB>
                                                                              <IntegerValue>1</IntegerValue>
                                                                           </GT>
                                                                           <GT>
                                                                              <SUB LineNo="473" ColNo="129">
                                                                                 <LookupOnChange>
                                                                                    <Name>
                                                                                       <StringValue>zWaypoint_B</StringValue>
                                                                                    </Name>
                                                                                 </LookupOnChange>
                                                                                 <LookupOnChange>
                                                                                    <Name>
                                                                                       <StringValue>zLoc</StringValue>
                                                                                    </Name>
                                                                                 </LookupOnChange>
                                                                              </SUB>
                                                                              <IntegerValue>1</IntegerValue>
                                                                           </GT>
                                                                           <AND>
                                                                              <EQNumeric>
                                                                                 <SUB LineNo="473" ColNo="174">
                                                                                    <LookupOnChange>
                                                                                       <Name>
                                                                                          <StringValue>xWaypoint_B</StringValue>
                                                                                       </Name>
                                                                                    </LookupOnChange>
                                                                                    <LookupOnChange>
                                                                                       <Name>
                                                                                          <StringValue>xLoc</StringValue>
                                                                                       </Name>
                                                                                    </LookupOnChange>
                                                                                 </SUB>
                                                                                 <IntegerValue>0</IntegerValue>
                                                                              </EQNumeric>
                                                                              <EQNumeric>
                                                                                 <SUB LineNo="473" ColNo="219">
                                                                                    <LookupOnChange>
                                                                                       <Name>
                                                                                          <StringValue>yWaypoint_B</StringValue>
                                                                                       </Name>
                                                                                    </LookupOnChange>
                                                                                    <LookupOnChange>
                                                                                       <Name>
                                                                                          <StringValue>yLoc</StringValue>
                                                                                       </Name>
                                                                                    </LookupOnChange>
                                                                                 </SUB>
                                                                                 <IntegerValue>0</IntegerValue>
                                                                              </EQNumeric>
                                                                              <EQNumeric>
                                                                                 <SUB LineNo="473" ColNo="264">
                                                                                    <LookupOnChange>
                                                                                       <Name>
                                                                                          <StringValue>zWaypoint_B</StringValue>
                                                                                       </Name>
                                                                                    </LookupOnChange>
                                                                                    <LookupOnChange>
                                                                                       <Name>
                                                                                          <StringValue>zLoc</StringValue>
                                                                                       </Name>
                                                                                    </LookupOnChange>
                                                                                 </SUB>
                                                                                 <IntegerValue>0</IntegerValue>
                                                                              </EQNumeric>
                                                                           </AND>
                                                                        </OR>
                                                                     </SkipCondition>
                                                                     <PostCondition>
                                                                        <BooleanVariable>ScienceActivated</BooleanVariable>
                                                                     </PostCondition>
                                                                     <InvariantCondition>
                                                                        <NOT>
                                                                           <OR>
                                                                              <AND>
                                                                                 <EQInternal>
                                                                                    <NodeOutcomeVariable>
                                                                                       <NodeRef dir="child">COMMAND__113</NodeRef>
                                                                                    </NodeOutcomeVariable>
                                                                                    <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                                                 </EQInternal>
                                                                                 <EQInternal>
                                                                                    <NodeStateVariable>
                                                                                       <NodeRef dir="child">COMMAND__113</NodeRef>
                                                                                    </NodeStateVariable>
                                                                                    <NodeStateValue>FINISHED</NodeStateValue>
                                                                                 </EQInternal>
                                                                              </AND>
                                                                              <AND>
                                                                                 <EQInternal>
                                                                                    <NodeOutcomeVariable>
                                                                                       <NodeRef dir="child">COMMAND__114</NodeRef>
                                                                                    </NodeOutcomeVariable>
                                                                                    <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                                                 </EQInternal>
                                                                                 <EQInternal>
                                                                                    <NodeStateVariable>
                                                                                       <NodeRef dir="child">COMMAND__114</NodeRef>
                                                                                    </NodeStateVariable>
                                                                                    <NodeStateValue>FINISHED</NodeStateValue>
                                                                                 </EQInternal>
                                                                              </AND>
                                                                              <AND>
                                                                                 <EQInternal>
                                                                                    <NodeOutcomeVariable>
                                                                                       <NodeRef dir="child">Command_ActivateScience</NodeRef>
                                                                                    </NodeOutcomeVariable>
                                                                                    <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                                                 </EQInternal>
                                                                                 <EQInternal>
                                                                                    <NodeStateVariable>
                                                                                       <NodeRef dir="child">Command_ActivateScience</NodeRef>
                                                                                    </NodeStateVariable>
                                                                                    <NodeStateValue>FINISHED</NodeStateValue>
                                                                                 </EQInternal>
                                                                              </AND>
                                                                              <AND>
                                                                                 <EQInternal>
                                                                                    <NodeOutcomeVariable>
                                                                                       <NodeRef dir="child">if__116</NodeRef>
                                                                                    </NodeOutcomeVariable>
                                                                                    <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                                                 </EQInternal>
                                                                                 <EQInternal>
                                                                                    <NodeStateVariable>
                                                                                       <NodeRef dir="child">if__116</NodeRef>
                                                                                    </NodeStateVariable>
                                                                                    <NodeStateValue>FINISHED</NodeStateValue>
                                                                                 </EQInternal>
                                                                              </AND>
                                                                           </OR>
                                                                        </NOT>
                                                                     </InvariantCondition>
                                                                     <NodeBody>
                                                                        <NodeList>
                                                                           <Node NodeType="Command" LineNo="475" ColNo="6">
                                                                              <NodeId>COMMAND__113</NodeId>
                                                                              <NodeBody>
                                                                                 <Command>
                                                                                    <Name>
                                                                                       <StringValue>pprint</StringValue>
                                                                                    </Name>
                                                                                    <Arguments LineNo="476" ColNo="13">
                                                                                       <StringValue>Updated Flight Status: Arriving at B</StringValue>
                                                                                    </Arguments>
                                                                                 </Command>
                                                                              </NodeBody>
                                                                           </Node>
                                                                           <Node NodeType="Command" LineNo="476" ColNo="6">
                                                                              <NodeId>COMMAND__114</NodeId>
                                                                              <StartCondition>
                                                                                 <EQInternal>
                                                                                    <NodeStateVariable>
                                                                                       <NodeRef dir="sibling">COMMAND__113</NodeRef>
                                                                                    </NodeStateVariable>
                                                                                    <NodeStateValue>FINISHED</NodeStateValue>
                                                                                 </EQInternal>
                                                                              </StartCondition>
                                                                              <NodeBody>
                                                                                 <Command>
                                                                                    <Name>
                                                                                       <StringValue>pprint</StringValue>
                                                                                    </Name>
                                                                                    <Arguments LineNo="477" ColNo="13">
                                                                                       <StringValue>Activating science to perform at Waypoint B</StringValue>
                                                                                    </Arguments>
                                                                                 </Command>
                                                                              </NodeBody>
                                                                           </Node>
                                                                           <Node NodeType="NodeList" epx="Sequence" LineNo="481" ColNo="7">
                                                                              <NodeId>Command_ActivateScience</NodeId>
                                                                              <StartCondition>
                                                                                 <EQInternal>
                                                                                    <NodeStateVariable>
                                                                                       <NodeRef dir="sibling">COMMAND__114</NodeRef>
                                                                                    </NodeStateVariable>
                                                                                    <NodeStateValue>FINISHED</NodeStateValue>
                                                                                 </EQInternal>
                                                                              </StartCondition>
                                                                              <InvariantCondition>
                                                                                 <NOT>
                                                                                    <AND>
                                                                                       <EQInternal>
                                                                                          <NodeOutcomeVariable>
                                                                                             <NodeRef dir="child">SynchronousCommand__115</NodeRef>
                                                                                          </NodeOutcomeVariable>
                                                                                          <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                                                       </EQInternal>
                                                                                       <EQInternal>
                                                                                          <NodeStateVariable>
                                                                                             <NodeRef dir="child">SynchronousCommand__115</NodeRef>
                                                                                          </NodeStateVariable>
                                                                                          <NodeStateValue>FINISHED</NodeStateValue>
                                                                                       </EQInternal>
                                                                                    </AND>
                                                                                 </NOT>
                                                                              </InvariantCondition>
                                                                              <NodeBody>
                                                                                 <NodeList>
                                                                                    <Node NodeType="NodeList" epx="SynchronousCommand" LineNo="481" ColNo="7">
                                                                                       <NodeId>SynchronousCommand__115</NodeId>
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
                                                                                                                  <StringValue>ActivateScience</StringValue>
                                                                                                               </Name>
                                                                                                               <Arguments LineNo="481" ColNo="61">
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
                                                                                                               <BooleanVariable>ScienceActivated</BooleanVariable>
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
                                                                           <Node NodeType="NodeList" epx="If" LineNo="484" ColNo="6">
                                                                              <NodeId>if__116</NodeId>
                                                                              <StartCondition>
                                                                                 <EQInternal>
                                                                                    <NodeStateVariable>
                                                                                       <NodeRef dir="sibling">Command_ActivateScience</NodeRef>
                                                                                    </NodeStateVariable>
                                                                                    <NodeStateValue>FINISHED</NodeStateValue>
                                                                                 </EQInternal>
                                                                              </StartCondition>
                                                                              <NodeBody>
                                                                                 <NodeList>
                                                                                    <Node NodeType="Empty" epx="Condition">
                                                                                       <NodeId>ep2cp_IfTest</NodeId>
                                                                                       <PostCondition>
                                                                                          <BooleanVariable>ScienceActivated</BooleanVariable>
                                                                                       </PostCondition>
                                                                                    </Node>
                                                                                    <Node NodeType="Command" epx="Then" LineNo="485" ColNo="7">
                                                                                       <NodeId>COMMAND__118</NodeId>
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
                                                                                          <Command>
                                                                                             <Name>
                                                                                                <StringValue>pprint</StringValue>
                                                                                             </Name>
                                                                                             <Arguments LineNo="486" ColNo="14">
                                                                                                <StringValue>Science successfully activated</StringValue>
                                                                                             </Arguments>
                                                                                          </Command>
                                                                                       </NodeBody>
                                                                                    </Node>
                                                                                    <Node NodeType="Command" epx="Else" LineNo="489" ColNo="7">
                                                                                       <NodeId>COMMAND__120</NodeId>
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
                                                                                             <Arguments LineNo="490" ColNo="14">
                                                                                                <StringValue>Science activation FAILED!!!</StringValue>
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
                                                                  <Node NodeType="Assignment" LineNo="503" ColNo="6">
                                                                     <NodeId>Arrived_at_B</NodeId>
                                                                     <StartCondition>
                                                                        <AND>
                                                                           <EQNumeric>
                                                                              <LookupOnChange>
                                                                                 <Name>
                                                                                    <StringValue>xLoc</StringValue>
                                                                                 </Name>
                                                                              </LookupOnChange>
                                                                              <LookupOnChange>
                                                                                 <Name>
                                                                                    <StringValue>xWaypoint_B</StringValue>
                                                                                 </Name>
                                                                              </LookupOnChange>
                                                                           </EQNumeric>
                                                                           <EQNumeric>
                                                                              <LookupOnChange>
                                                                                 <Name>
                                                                                    <StringValue>yLoc</StringValue>
                                                                                 </Name>
                                                                              </LookupOnChange>
                                                                              <LookupOnChange>
                                                                                 <Name>
                                                                                    <StringValue>yWaypoint_B</StringValue>
                                                                                 </Name>
                                                                              </LookupOnChange>
                                                                           </EQNumeric>
                                                                           <EQNumeric>
                                                                              <LookupOnChange>
                                                                                 <Name>
                                                                                    <StringValue>zLoc</StringValue>
                                                                                 </Name>
                                                                              </LookupOnChange>
                                                                              <LookupOnChange>
                                                                                 <Name>
                                                                                    <StringValue>zWaypoint_B</StringValue>
                                                                                 </Name>
                                                                              </LookupOnChange>
                                                                           </EQNumeric>
                                                                        </AND>
                                                                     </StartCondition>
                                                                     <SkipCondition>
                                                                        <OR>
                                                                           <NENumeric>
                                                                              <LookupOnChange>
                                                                                 <Name>
                                                                                    <StringValue>xLoc</StringValue>
                                                                                 </Name>
                                                                              </LookupOnChange>
                                                                              <LookupOnChange>
                                                                                 <Name>
                                                                                    <StringValue>xWaypoint_B</StringValue>
                                                                                 </Name>
                                                                              </LookupOnChange>
                                                                           </NENumeric>
                                                                           <NENumeric>
                                                                              <LookupOnChange>
                                                                                 <Name>
                                                                                    <StringValue>yLoc</StringValue>
                                                                                 </Name>
                                                                              </LookupOnChange>
                                                                              <LookupOnChange>
                                                                                 <Name>
                                                                                    <StringValue>yWaypoint_B</StringValue>
                                                                                 </Name>
                                                                              </LookupOnChange>
                                                                           </NENumeric>
                                                                           <NENumeric>
                                                                              <LookupOnChange>
                                                                                 <Name>
                                                                                    <StringValue>zLoc</StringValue>
                                                                                 </Name>
                                                                              </LookupOnChange>
                                                                              <LookupOnChange>
                                                                                 <Name>
                                                                                    <StringValue>zWaypoint_B</StringValue>
                                                                                 </Name>
                                                                              </LookupOnChange>
                                                                           </NENumeric>
                                                                        </OR>
                                                                     </SkipCondition>
                                                                     <EndCondition>
                                                                        <BooleanVariable>At_B</BooleanVariable>
                                                                     </EndCondition>
                                                                     <PostCondition>
                                                                        <IsKnown>
                                                                           <BooleanVariable>At_B</BooleanVariable>
                                                                        </IsKnown>
                                                                     </PostCondition>
                                                                     <NodeBody>
                                                                        <Assignment>
                                                                           <BooleanVariable>At_B</BooleanVariable>
                                                                           <BooleanRHS>
                                                                              <BooleanValue>true</BooleanValue>
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
                                                <Node NodeType="NodeList" epx="Sequence" LineNo="516" ColNo="4">
                                                   <NodeId>MonitorParams</NodeId>
                                                   <VariableDeclarations>
                                                      <DeclareVariable LineNo="515" ColNo="4">
                                                         <Name>zTarget</Name>
                                                         <Type>Real</Type>
                                                         <InitialValue>
                                                            <RealValue>5</RealValue>
                                                         </InitialValue>
                                                      </DeclareVariable>
                                                      <DeclareVariable LineNo="516" ColNo="4">
                                                         <Name>velTarget</Name>
                                                         <Type>Real</Type>
                                                         <InitialValue>
                                                            <RealValue>1</RealValue>
                                                         </InitialValue>
                                                      </DeclareVariable>
                                                      <DeclareVariable LineNo="518" ColNo="4">
                                                         <Name>velState</Name>
                                                         <Type>Real</Type>
                                                      </DeclareVariable>
                                                      <DeclareVariable LineNo="519" ColNo="4">
                                                         <Name>xState</Name>
                                                         <Type>Real</Type>
                                                      </DeclareVariable>
                                                      <DeclareVariable LineNo="520" ColNo="4">
                                                         <Name>yState</Name>
                                                         <Type>Real</Type>
                                                      </DeclareVariable>
                                                      <DeclareVariable LineNo="521" ColNo="4">
                                                         <Name>zState</Name>
                                                         <Type>Real</Type>
                                                      </DeclareVariable>
                                                      <DeclareVariable LineNo="523" ColNo="4">
                                                         <Name>velFlag</Name>
                                                         <Type>Integer</Type>
                                                      </DeclareVariable>
                                                      <DeclareVariable LineNo="524" ColNo="4">
                                                         <Name>xFlag</Name>
                                                         <Type>Integer</Type>
                                                      </DeclareVariable>
                                                      <DeclareVariable LineNo="525" ColNo="4">
                                                         <Name>yFlag</Name>
                                                         <Type>Integer</Type>
                                                      </DeclareVariable>
                                                      <DeclareVariable LineNo="526" ColNo="4">
                                                         <Name>zFlag</Name>
                                                         <Type>Integer</Type>
                                                      </DeclareVariable>
                                                   </VariableDeclarations>
                                                   <StartCondition>
                                                      <EQInternal>
                                                         <NodeStateVariable>
                                                            <NodeRef dir="sibling">ExecuteGetParams</NodeRef>
                                                         </NodeStateVariable>
                                                         <NodeStateValue>FINISHED</NodeStateValue>
                                                      </EQInternal>
                                                   </StartCondition>
                                                   <SkipCondition>
                                                      <AND>
                                                         <EQInternal>
                                                            <NodeStateVariable>
                                                               <NodeRef dir="sibling">ExecuteGetParams</NodeRef>
                                                            </NodeStateVariable>
                                                            <NodeStateValue>FINISHED</NodeStateValue>
                                                         </EQInternal>
                                                         <BooleanVariable>At_B</BooleanVariable>
                                                      </AND>
                                                   </SkipCondition>
                                                   <InvariantCondition>
                                                      <NOT>
                                                         <OR>
                                                            <AND>
                                                               <EQInternal>
                                                                  <NodeOutcomeVariable>
                                                                     <NodeRef dir="child">COMMAND__122</NodeRef>
                                                                  </NodeOutcomeVariable>
                                                                  <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                               </EQInternal>
                                                               <EQInternal>
                                                                  <NodeStateVariable>
                                                                     <NodeRef dir="child">COMMAND__122</NodeRef>
                                                                  </NodeStateVariable>
                                                                  <NodeStateValue>FINISHED</NodeStateValue>
                                                               </EQInternal>
                                                            </AND>
                                                            <AND>
                                                               <EQInternal>
                                                                  <NodeOutcomeVariable>
                                                                     <NodeRef dir="child">COMMAND__123</NodeRef>
                                                                  </NodeOutcomeVariable>
                                                                  <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                               </EQInternal>
                                                               <EQInternal>
                                                                  <NodeStateVariable>
                                                                     <NodeRef dir="child">COMMAND__123</NodeRef>
                                                                  </NodeStateVariable>
                                                                  <NodeStateValue>FINISHED</NodeStateValue>
                                                               </EQInternal>
                                                            </AND>
                                                            <AND>
                                                               <EQInternal>
                                                                  <NodeOutcomeVariable>
                                                                     <NodeRef dir="child">Velocity</NodeRef>
                                                                  </NodeOutcomeVariable>
                                                                  <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                               </EQInternal>
                                                               <EQInternal>
                                                                  <NodeStateVariable>
                                                                     <NodeRef dir="child">Velocity</NodeRef>
                                                                  </NodeStateVariable>
                                                                  <NodeStateValue>FINISHED</NodeStateValue>
                                                               </EQInternal>
                                                            </AND>
                                                            <AND>
                                                               <EQInternal>
                                                                  <NodeOutcomeVariable>
                                                                     <NodeRef dir="child">Location</NodeRef>
                                                                  </NodeOutcomeVariable>
                                                                  <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                               </EQInternal>
                                                               <EQInternal>
                                                                  <NodeStateVariable>
                                                                     <NodeRef dir="child">Location</NodeRef>
                                                                  </NodeStateVariable>
                                                                  <NodeStateValue>FINISHED</NodeStateValue>
                                                               </EQInternal>
                                                            </AND>
                                                         </OR>
                                                      </NOT>
                                                   </InvariantCondition>
                                                   <NodeBody>
                                                      <NodeList>
                                                         <Node NodeType="Command" LineNo="529" ColNo="4">
                                                            <NodeId>COMMAND__122</NodeId>
                                                            <NodeBody>
                                                               <Command>
                                                                  <Name>
                                                                     <StringValue>pprint</StringValue>
                                                                  </Name>
                                                                  <Arguments LineNo="530" ColNo="11">
                                                                     <StringValue> </StringValue>
                                                                  </Arguments>
                                                               </Command>
                                                            </NodeBody>
                                                         </Node>
                                                         <Node NodeType="Command" LineNo="530" ColNo="4">
                                                            <NodeId>COMMAND__123</NodeId>
                                                            <StartCondition>
                                                               <EQInternal>
                                                                  <NodeStateVariable>
                                                                     <NodeRef dir="sibling">COMMAND__122</NodeRef>
                                                                  </NodeStateVariable>
                                                                  <NodeStateValue>FINISHED</NodeStateValue>
                                                               </EQInternal>
                                                            </StartCondition>
                                                            <NodeBody>
                                                               <Command>
                                                                  <Name>
                                                                     <StringValue>pprint</StringValue>
                                                                  </Name>
                                                                  <Arguments LineNo="531" ColNo="11">
                                                                     <StringValue>Entering MonitorParams</StringValue>
                                                                  </Arguments>
                                                               </Command>
                                                            </NodeBody>
                                                         </Node>
                                                         <Node NodeType="NodeList" epx="Sequence" LineNo="535" ColNo="5">
                                                            <NodeId>Velocity</NodeId>
                                                            <StartCondition>
                                                               <EQInternal>
                                                                  <NodeStateVariable>
                                                                     <NodeRef dir="sibling">COMMAND__123</NodeRef>
                                                                  </NodeStateVariable>
                                                                  <NodeStateValue>FINISHED</NodeStateValue>
                                                               </EQInternal>
                                                            </StartCondition>
                                                            <PreCondition>
                                                               <IsKnown>
                                                                  <RealVariable>velTarget</RealVariable>
                                                               </IsKnown>
                                                            </PreCondition>
                                                            <PostCondition>
                                                               <IsKnown>
                                                                  <IntegerVariable>velFlag</IntegerVariable>
                                                               </IsKnown>
                                                            </PostCondition>
                                                            <InvariantCondition>
                                                               <NOT>
                                                                  <OR>
                                                                     <AND>
                                                                        <EQInternal>
                                                                           <NodeOutcomeVariable>
                                                                              <NodeRef dir="child">COMMAND__124</NodeRef>
                                                                           </NodeOutcomeVariable>
                                                                           <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                                        </EQInternal>
                                                                        <EQInternal>
                                                                           <NodeStateVariable>
                                                                              <NodeRef dir="child">COMMAND__124</NodeRef>
                                                                           </NodeStateVariable>
                                                                           <NodeStateValue>FINISHED</NodeStateValue>
                                                                        </EQInternal>
                                                                     </AND>
                                                                     <AND>
                                                                        <EQInternal>
                                                                           <NodeOutcomeVariable>
                                                                              <NodeRef dir="child">ASSIGNMENT__125</NodeRef>
                                                                           </NodeOutcomeVariable>
                                                                           <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                                        </EQInternal>
                                                                        <EQInternal>
                                                                           <NodeStateVariable>
                                                                              <NodeRef dir="child">ASSIGNMENT__125</NodeRef>
                                                                           </NodeStateVariable>
                                                                           <NodeStateValue>FINISHED</NodeStateValue>
                                                                        </EQInternal>
                                                                     </AND>
                                                                     <AND>
                                                                        <EQInternal>
                                                                           <NodeOutcomeVariable>
                                                                              <NodeRef dir="child">if__126</NodeRef>
                                                                           </NodeOutcomeVariable>
                                                                           <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                                        </EQInternal>
                                                                        <EQInternal>
                                                                           <NodeStateVariable>
                                                                              <NodeRef dir="child">if__126</NodeRef>
                                                                           </NodeStateVariable>
                                                                           <NodeStateValue>FINISHED</NodeStateValue>
                                                                        </EQInternal>
                                                                     </AND>
                                                                  </OR>
                                                               </NOT>
                                                            </InvariantCondition>
                                                            <NodeBody>
                                                               <NodeList>
                                                                  <Node NodeType="Command" LineNo="537" ColNo="5">
                                                                     <NodeId>COMMAND__124</NodeId>
                                                                     <NodeBody>
                                                                        <Command>
                                                                           <Name>
                                                                              <StringValue>pprint</StringValue>
                                                                           </Name>
                                                                           <Arguments LineNo="538" ColNo="12">
                                                                              <StringValue>Determining velocity update</StringValue>
                                                                           </Arguments>
                                                                        </Command>
                                                                     </NodeBody>
                                                                  </Node>
                                                                  <Node NodeType="Assignment" LineNo="540" ColNo="5">
                                                                     <NodeId>ASSIGNMENT__125</NodeId>
                                                                     <StartCondition>
                                                                        <EQInternal>
                                                                           <NodeStateVariable>
                                                                              <NodeRef dir="sibling">COMMAND__124</NodeRef>
                                                                           </NodeStateVariable>
                                                                           <NodeStateValue>FINISHED</NodeStateValue>
                                                                        </EQInternal>
                                                                     </StartCondition>
                                                                     <NodeBody>
                                                                        <Assignment>
                                                                           <RealVariable>velState</RealVariable>
                                                                           <NumericRHS>
                                                                              <SUB LineNo="540" ColNo="28">
                                                                                 <LookupNow>
                                                                                    <Name>
                                                                                       <StringValue>vel</StringValue>
                                                                                    </Name>
                                                                                 </LookupNow>
                                                                                 <RealVariable>velTarget</RealVariable>
                                                                              </SUB>
                                                                           </NumericRHS>
                                                                        </Assignment>
                                                                     </NodeBody>
                                                                  </Node>
                                                                  <Node NodeType="NodeList" epx="If" LineNo="542" ColNo="5">
                                                                     <NodeId>if__126</NodeId>
                                                                     <StartCondition>
                                                                        <EQInternal>
                                                                           <NodeStateVariable>
                                                                              <NodeRef dir="sibling">ASSIGNMENT__125</NodeRef>
                                                                           </NodeStateVariable>
                                                                           <NodeStateValue>FINISHED</NodeStateValue>
                                                                        </EQInternal>
                                                                     </StartCondition>
                                                                     <NodeBody>
                                                                        <NodeList>
                                                                           <Node NodeType="Empty" epx="Condition">
                                                                              <NodeId>ep2cp_IfTest</NodeId>
                                                                              <PostCondition>
                                                                                 <LT>
                                                                                    <RealVariable>velState</RealVariable>
                                                                                    <IntegerValue>0</IntegerValue>
                                                                                 </LT>
                                                                              </PostCondition>
                                                                           </Node>
                                                                           <Node NodeType="Assignment" epx="Then" LineNo="544" ColNo="6">
                                                                              <NodeId>ASSIGNMENT__128</NodeId>
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
                                                                                 <Assignment>
                                                                                    <IntegerVariable>velFlag</IntegerVariable>
                                                                                    <NumericRHS>
                                                                                       <IntegerValue>1</IntegerValue>
                                                                                    </NumericRHS>
                                                                                 </Assignment>
                                                                              </NodeBody>
                                                                           </Node>
                                                                           <Node NodeType="Empty" epx="ElseIf">
                                                                              <NodeId>ep2cp_ElseIf-1</NodeId>
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
                                                                              <PostCondition>
                                                                                 <GT>
                                                                                    <RealVariable>velState</RealVariable>
                                                                                    <IntegerValue>0</IntegerValue>
                                                                                 </GT>
                                                                              </PostCondition>
                                                                           </Node>
                                                                           <Node NodeType="Assignment" epx="Then" LineNo="548" ColNo="6">
                                                                              <NodeId>ASSIGNMENT__130</NodeId>
                                                                              <StartCondition>
                                                                                 <EQInternal>
                                                                                    <NodeOutcomeVariable>
                                                                                       <NodeRef dir="sibling">ep2cp_ElseIf-1</NodeRef>
                                                                                    </NodeOutcomeVariable>
                                                                                    <NodeOutcomeValue>SUCCESS</NodeOutcomeValue>
                                                                                 </EQInternal>
                                                                              </StartCondition>
                                                                              <SkipCondition>
                                                                                 <NOT>
                                                                                    <EQInternal>
                                                                                       <NodeOutcomeVariable>
                                                                                          <NodeRef dir="sibling">ep2cp_ElseIf-1</NodeRef>
                                                                                       </NodeOutcomeVariable>
                                                                                       <NodeOutcomeValue>SUCCESS</NodeOutcomeValue>
                                                                                    </EQInternal>
                                                                                 </NOT>
                                                                              </SkipCondition>
                                                                              <NodeBody>
                                                                                 <Assignment>
                                                                                    <IntegerVariable>velFlag</IntegerVariable>
                                                                                    <NumericRHS>
                                                                                       <IntegerValue>-1</IntegerValue>
                                                                                    </NumericRHS>
                                                                                 </Assignment>
                                                                              </NodeBody>
                                                                           </Node>
                                                                           <Node NodeType="Assignment" epx="Else" LineNo="552" ColNo="6">
                                                                              <NodeId>ASSIGNMENT__132</NodeId>
                                                                              <StartCondition>
                                                                                 <EQInternal>
                                                                                    <NodeFailureVariable>
                                                                                       <NodeRef dir="sibling">ep2cp_ElseIf-1</NodeRef>
                                                                                    </NodeFailureVariable>
                                                                                    <NodeFailureValue>POST_CONDITION_FAILED</NodeFailureValue>
                                                                                 </EQInternal>
                                                                              </StartCondition>
                                                                              <SkipCondition>
                                                                                 <EQInternal>
                                                                                    <NodeOutcomeVariable>
                                                                                       <NodeRef dir="sibling">ep2cp_ElseIf-1</NodeRef>
                                                                                    </NodeOutcomeVariable>
                                                                                    <NodeOutcomeValue>SKIPPED</NodeOutcomeValue>
                                                                                 </EQInternal>
                                                                              </SkipCondition>
                                                                              <NodeBody>
                                                                                 <Assignment>
                                                                                    <IntegerVariable>velFlag</IntegerVariable>
                                                                                    <NumericRHS>
                                                                                       <IntegerValue>0</IntegerValue>
                                                                                    </NumericRHS>
                                                                                 </Assignment>
                                                                              </NodeBody>
                                                                           </Node>
                                                                        </NodeList>
                                                                     </NodeBody>
                                                                  </Node>
                                                               </NodeList>
                                                            </NodeBody>
                                                         </Node>
                                                         <Node NodeType="NodeList" epx="Sequence" LineNo="560" ColNo="5">
                                                            <NodeId>Location</NodeId>
                                                            <StartCondition>
                                                               <AND>
                                                                  <EQInternal>
                                                                     <NodeStateVariable>
                                                                        <NodeRef dir="sibling">Velocity</NodeRef>
                                                                     </NodeStateVariable>
                                                                     <NodeStateValue>FINISHED</NodeStateValue>
                                                                  </EQInternal>
                                                                  <EQInternal>
                                                                     <NodeStateVariable>
                                                                        <NodeId>Velocity</NodeId>
                                                                     </NodeStateVariable>
                                                                     <NodeStateValue>FINISHED</NodeStateValue>
                                                                  </EQInternal>
                                                               </AND>
                                                            </StartCondition>
                                                            <PreCondition>
                                                               <AND>
                                                                  <IsKnown>
                                                                     <LookupNow>
                                                                        <Name>
                                                                           <StringValue>xTarget</StringValue>
                                                                        </Name>
                                                                     </LookupNow>
                                                                  </IsKnown>
                                                                  <IsKnown>
                                                                     <LookupNow>
                                                                        <Name>
                                                                           <StringValue>yTarget</StringValue>
                                                                        </Name>
                                                                     </LookupNow>
                                                                  </IsKnown>
                                                                  <IsKnown>
                                                                     <RealVariable>zTarget</RealVariable>
                                                                  </IsKnown>
                                                               </AND>
                                                            </PreCondition>
                                                            <PostCondition>
                                                               <AND>
                                                                  <IsKnown>
                                                                     <IntegerVariable>xFlag</IntegerVariable>
                                                                  </IsKnown>
                                                                  <IsKnown>
                                                                     <IntegerVariable>yFlag</IntegerVariable>
                                                                  </IsKnown>
                                                                  <IsKnown>
                                                                     <IntegerVariable>zFlag</IntegerVariable>
                                                                  </IsKnown>
                                                               </AND>
                                                            </PostCondition>
                                                            <InvariantCondition>
                                                               <NOT>
                                                                  <OR>
                                                                     <AND>
                                                                        <EQInternal>
                                                                           <NodeOutcomeVariable>
                                                                              <NodeRef dir="child">ASSIGNMENT__133</NodeRef>
                                                                           </NodeOutcomeVariable>
                                                                           <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                                        </EQInternal>
                                                                        <EQInternal>
                                                                           <NodeStateVariable>
                                                                              <NodeRef dir="child">ASSIGNMENT__133</NodeRef>
                                                                           </NodeStateVariable>
                                                                           <NodeStateValue>FINISHED</NodeStateValue>
                                                                        </EQInternal>
                                                                     </AND>
                                                                     <AND>
                                                                        <EQInternal>
                                                                           <NodeOutcomeVariable>
                                                                              <NodeRef dir="child">ASSIGNMENT__134</NodeRef>
                                                                           </NodeOutcomeVariable>
                                                                           <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                                        </EQInternal>
                                                                        <EQInternal>
                                                                           <NodeStateVariable>
                                                                              <NodeRef dir="child">ASSIGNMENT__134</NodeRef>
                                                                           </NodeStateVariable>
                                                                           <NodeStateValue>FINISHED</NodeStateValue>
                                                                        </EQInternal>
                                                                     </AND>
                                                                     <AND>
                                                                        <EQInternal>
                                                                           <NodeOutcomeVariable>
                                                                              <NodeRef dir="child">ASSIGNMENT__135</NodeRef>
                                                                           </NodeOutcomeVariable>
                                                                           <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                                        </EQInternal>
                                                                        <EQInternal>
                                                                           <NodeStateVariable>
                                                                              <NodeRef dir="child">ASSIGNMENT__135</NodeRef>
                                                                           </NodeStateVariable>
                                                                           <NodeStateValue>FINISHED</NodeStateValue>
                                                                        </EQInternal>
                                                                     </AND>
                                                                     <AND>
                                                                        <EQInternal>
                                                                           <NodeOutcomeVariable>
                                                                              <NodeRef dir="child">xLocation</NodeRef>
                                                                           </NodeOutcomeVariable>
                                                                           <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                                        </EQInternal>
                                                                        <EQInternal>
                                                                           <NodeStateVariable>
                                                                              <NodeRef dir="child">xLocation</NodeRef>
                                                                           </NodeStateVariable>
                                                                           <NodeStateValue>FINISHED</NodeStateValue>
                                                                        </EQInternal>
                                                                     </AND>
                                                                     <AND>
                                                                        <EQInternal>
                                                                           <NodeOutcomeVariable>
                                                                              <NodeRef dir="child">yLocation</NodeRef>
                                                                           </NodeOutcomeVariable>
                                                                           <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                                        </EQInternal>
                                                                        <EQInternal>
                                                                           <NodeStateVariable>
                                                                              <NodeRef dir="child">yLocation</NodeRef>
                                                                           </NodeStateVariable>
                                                                           <NodeStateValue>FINISHED</NodeStateValue>
                                                                        </EQInternal>
                                                                     </AND>
                                                                     <AND>
                                                                        <EQInternal>
                                                                           <NodeOutcomeVariable>
                                                                              <NodeRef dir="child">zLocation</NodeRef>
                                                                           </NodeOutcomeVariable>
                                                                           <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                                        </EQInternal>
                                                                        <EQInternal>
                                                                           <NodeStateVariable>
                                                                              <NodeRef dir="child">zLocation</NodeRef>
                                                                           </NodeStateVariable>
                                                                           <NodeStateValue>FINISHED</NodeStateValue>
                                                                        </EQInternal>
                                                                     </AND>
                                                                     <AND>
                                                                        <EQInternal>
                                                                           <NodeOutcomeVariable>
                                                                              <NodeRef dir="child">COMMAND__160</NodeRef>
                                                                           </NodeOutcomeVariable>
                                                                           <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                                        </EQInternal>
                                                                        <EQInternal>
                                                                           <NodeStateVariable>
                                                                              <NodeRef dir="child">COMMAND__160</NodeRef>
                                                                           </NodeStateVariable>
                                                                           <NodeStateValue>FINISHED</NodeStateValue>
                                                                        </EQInternal>
                                                                     </AND>
                                                                     <AND>
                                                                        <EQInternal>
                                                                           <NodeOutcomeVariable>
                                                                              <NodeRef dir="child">COMMAND__161</NodeRef>
                                                                           </NodeOutcomeVariable>
                                                                           <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                                        </EQInternal>
                                                                        <EQInternal>
                                                                           <NodeStateVariable>
                                                                              <NodeRef dir="child">COMMAND__161</NodeRef>
                                                                           </NodeStateVariable>
                                                                           <NodeStateValue>FINISHED</NodeStateValue>
                                                                        </EQInternal>
                                                                     </AND>
                                                                  </OR>
                                                               </NOT>
                                                            </InvariantCondition>
                                                            <NodeBody>
                                                               <NodeList>
                                                                  <Node NodeType="Assignment" LineNo="564" ColNo="5">
                                                                     <NodeId>ASSIGNMENT__133</NodeId>
                                                                     <NodeBody>
                                                                        <Assignment>
                                                                           <RealVariable>xState</RealVariable>
                                                                           <NumericRHS>
                                                                              <SUB LineNo="564" ColNo="27">
                                                                                 <LookupNow>
                                                                                    <Name>
                                                                                       <StringValue>xLoc</StringValue>
                                                                                    </Name>
                                                                                 </LookupNow>
                                                                                 <LookupNow>
                                                                                    <Name>
                                                                                       <StringValue>xTarget</StringValue>
                                                                                    </Name>
                                                                                 </LookupNow>
                                                                              </SUB>
                                                                           </NumericRHS>
                                                                        </Assignment>
                                                                     </NodeBody>
                                                                  </Node>
                                                                  <Node NodeType="Assignment" LineNo="565" ColNo="5">
                                                                     <NodeId>ASSIGNMENT__134</NodeId>
                                                                     <StartCondition>
                                                                        <EQInternal>
                                                                           <NodeStateVariable>
                                                                              <NodeRef dir="sibling">ASSIGNMENT__133</NodeRef>
                                                                           </NodeStateVariable>
                                                                           <NodeStateValue>FINISHED</NodeStateValue>
                                                                        </EQInternal>
                                                                     </StartCondition>
                                                                     <NodeBody>
                                                                        <Assignment>
                                                                           <RealVariable>yState</RealVariable>
                                                                           <NumericRHS>
                                                                              <SUB LineNo="565" ColNo="27">
                                                                                 <LookupNow>
                                                                                    <Name>
                                                                                       <StringValue>yLoc</StringValue>
                                                                                    </Name>
                                                                                 </LookupNow>
                                                                                 <LookupNow>
                                                                                    <Name>
                                                                                       <StringValue>yTarget</StringValue>
                                                                                    </Name>
                                                                                 </LookupNow>
                                                                              </SUB>
                                                                           </NumericRHS>
                                                                        </Assignment>
                                                                     </NodeBody>
                                                                  </Node>
                                                                  <Node NodeType="Assignment" LineNo="566" ColNo="5">
                                                                     <NodeId>ASSIGNMENT__135</NodeId>
                                                                     <StartCondition>
                                                                        <EQInternal>
                                                                           <NodeStateVariable>
                                                                              <NodeRef dir="sibling">ASSIGNMENT__134</NodeRef>
                                                                           </NodeStateVariable>
                                                                           <NodeStateValue>FINISHED</NodeStateValue>
                                                                        </EQInternal>
                                                                     </StartCondition>
                                                                     <NodeBody>
                                                                        <Assignment>
                                                                           <RealVariable>zState</RealVariable>
                                                                           <NumericRHS>
                                                                              <SUB LineNo="566" ColNo="27">
                                                                                 <LookupNow>
                                                                                    <Name>
                                                                                       <StringValue>zLoc</StringValue>
                                                                                    </Name>
                                                                                 </LookupNow>
                                                                                 <RealVariable>zTarget</RealVariable>
                                                                              </SUB>
                                                                           </NumericRHS>
                                                                        </Assignment>
                                                                     </NodeBody>
                                                                  </Node>
                                                                  <Node NodeType="NodeList" epx="Sequence" LineNo="571" ColNo="6">
                                                                     <NodeId>xLocation</NodeId>
                                                                     <StartCondition>
                                                                        <EQInternal>
                                                                           <NodeStateVariable>
                                                                              <NodeRef dir="sibling">ASSIGNMENT__135</NodeRef>
                                                                           </NodeStateVariable>
                                                                           <NodeStateValue>FINISHED</NodeStateValue>
                                                                        </EQInternal>
                                                                     </StartCondition>
                                                                     <InvariantCondition>
                                                                        <NOT>
                                                                           <OR>
                                                                              <AND>
                                                                                 <EQInternal>
                                                                                    <NodeOutcomeVariable>
                                                                                       <NodeRef dir="child">COMMAND__136</NodeRef>
                                                                                    </NodeOutcomeVariable>
                                                                                    <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                                                 </EQInternal>
                                                                                 <EQInternal>
                                                                                    <NodeStateVariable>
                                                                                       <NodeRef dir="child">COMMAND__136</NodeRef>
                                                                                    </NodeStateVariable>
                                                                                    <NodeStateValue>FINISHED</NodeStateValue>
                                                                                 </EQInternal>
                                                                              </AND>
                                                                              <AND>
                                                                                 <EQInternal>
                                                                                    <NodeOutcomeVariable>
                                                                                       <NodeRef dir="child">if__137</NodeRef>
                                                                                    </NodeOutcomeVariable>
                                                                                    <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                                                 </EQInternal>
                                                                                 <EQInternal>
                                                                                    <NodeStateVariable>
                                                                                       <NodeRef dir="child">if__137</NodeRef>
                                                                                    </NodeStateVariable>
                                                                                    <NodeStateValue>FINISHED</NodeStateValue>
                                                                                 </EQInternal>
                                                                              </AND>
                                                                           </OR>
                                                                        </NOT>
                                                                     </InvariantCondition>
                                                                     <NodeBody>
                                                                        <NodeList>
                                                                           <Node NodeType="Command" LineNo="570" ColNo="6">
                                                                              <NodeId>COMMAND__136</NodeId>
                                                                              <NodeBody>
                                                                                 <Command>
                                                                                    <Name>
                                                                                       <StringValue>pprint</StringValue>
                                                                                    </Name>
                                                                                    <Arguments LineNo="571" ColNo="13">
                                                                                       <StringValue>Determining x coordinate update</StringValue>
                                                                                    </Arguments>
                                                                                 </Command>
                                                                              </NodeBody>
                                                                           </Node>
                                                                           <Node NodeType="NodeList" epx="If" LineNo="573" ColNo="6">
                                                                              <NodeId>if__137</NodeId>
                                                                              <StartCondition>
                                                                                 <EQInternal>
                                                                                    <NodeStateVariable>
                                                                                       <NodeRef dir="sibling">COMMAND__136</NodeRef>
                                                                                    </NodeStateVariable>
                                                                                    <NodeStateValue>FINISHED</NodeStateValue>
                                                                                 </EQInternal>
                                                                              </StartCondition>
                                                                              <NodeBody>
                                                                                 <NodeList>
                                                                                    <Node NodeType="Empty" epx="Condition">
                                                                                       <NodeId>ep2cp_IfTest</NodeId>
                                                                                       <PostCondition>
                                                                                          <LT>
                                                                                             <RealVariable>xState</RealVariable>
                                                                                             <IntegerValue>0</IntegerValue>
                                                                                          </LT>
                                                                                       </PostCondition>
                                                                                    </Node>
                                                                                    <Node NodeType="Assignment" epx="Then" LineNo="575" ColNo="7">
                                                                                       <NodeId>ASSIGNMENT__139</NodeId>
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
                                                                                          <Assignment>
                                                                                             <IntegerVariable>xFlag</IntegerVariable>
                                                                                             <NumericRHS>
                                                                                                <IntegerValue>1</IntegerValue>
                                                                                             </NumericRHS>
                                                                                          </Assignment>
                                                                                       </NodeBody>
                                                                                    </Node>
                                                                                    <Node NodeType="Empty" epx="ElseIf">
                                                                                       <NodeId>ep2cp_ElseIf-1</NodeId>
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
                                                                                       <PostCondition>
                                                                                          <GT>
                                                                                             <RealVariable>xState</RealVariable>
                                                                                             <IntegerValue>0</IntegerValue>
                                                                                          </GT>
                                                                                       </PostCondition>
                                                                                    </Node>
                                                                                    <Node NodeType="Assignment" epx="Then" LineNo="579" ColNo="7">
                                                                                       <NodeId>ASSIGNMENT__141</NodeId>
                                                                                       <StartCondition>
                                                                                          <EQInternal>
                                                                                             <NodeOutcomeVariable>
                                                                                                <NodeRef dir="sibling">ep2cp_ElseIf-1</NodeRef>
                                                                                             </NodeOutcomeVariable>
                                                                                             <NodeOutcomeValue>SUCCESS</NodeOutcomeValue>
                                                                                          </EQInternal>
                                                                                       </StartCondition>
                                                                                       <SkipCondition>
                                                                                          <NOT>
                                                                                             <EQInternal>
                                                                                                <NodeOutcomeVariable>
                                                                                                   <NodeRef dir="sibling">ep2cp_ElseIf-1</NodeRef>
                                                                                                </NodeOutcomeVariable>
                                                                                                <NodeOutcomeValue>SUCCESS</NodeOutcomeValue>
                                                                                             </EQInternal>
                                                                                          </NOT>
                                                                                       </SkipCondition>
                                                                                       <NodeBody>
                                                                                          <Assignment>
                                                                                             <IntegerVariable>xFlag</IntegerVariable>
                                                                                             <NumericRHS>
                                                                                                <IntegerValue>-1</IntegerValue>
                                                                                             </NumericRHS>
                                                                                          </Assignment>
                                                                                       </NodeBody>
                                                                                    </Node>
                                                                                    <Node NodeType="Assignment" epx="Else" LineNo="583" ColNo="7">
                                                                                       <NodeId>ASSIGNMENT__143</NodeId>
                                                                                       <StartCondition>
                                                                                          <EQInternal>
                                                                                             <NodeFailureVariable>
                                                                                                <NodeRef dir="sibling">ep2cp_ElseIf-1</NodeRef>
                                                                                             </NodeFailureVariable>
                                                                                             <NodeFailureValue>POST_CONDITION_FAILED</NodeFailureValue>
                                                                                          </EQInternal>
                                                                                       </StartCondition>
                                                                                       <SkipCondition>
                                                                                          <EQInternal>
                                                                                             <NodeOutcomeVariable>
                                                                                                <NodeRef dir="sibling">ep2cp_ElseIf-1</NodeRef>
                                                                                             </NodeOutcomeVariable>
                                                                                             <NodeOutcomeValue>SKIPPED</NodeOutcomeValue>
                                                                                          </EQInternal>
                                                                                       </SkipCondition>
                                                                                       <NodeBody>
                                                                                          <Assignment>
                                                                                             <IntegerVariable>xFlag</IntegerVariable>
                                                                                             <NumericRHS>
                                                                                                <IntegerValue>0</IntegerValue>
                                                                                             </NumericRHS>
                                                                                          </Assignment>
                                                                                       </NodeBody>
                                                                                    </Node>
                                                                                 </NodeList>
                                                                              </NodeBody>
                                                                           </Node>
                                                                        </NodeList>
                                                                     </NodeBody>
                                                                  </Node>
                                                                  <Node NodeType="NodeList" epx="Sequence" LineNo="590" ColNo="6">
                                                                     <NodeId>yLocation</NodeId>
                                                                     <StartCondition>
                                                                        <AND>
                                                                           <EQInternal>
                                                                              <NodeStateVariable>
                                                                                 <NodeRef dir="sibling">xLocation</NodeRef>
                                                                              </NodeStateVariable>
                                                                              <NodeStateValue>FINISHED</NodeStateValue>
                                                                           </EQInternal>
                                                                           <EQInternal>
                                                                              <NodeStateVariable>
                                                                                 <NodeId>xLocation</NodeId>
                                                                              </NodeStateVariable>
                                                                              <NodeStateValue>FINISHED</NodeStateValue>
                                                                           </EQInternal>
                                                                        </AND>
                                                                     </StartCondition>
                                                                     <InvariantCondition>
                                                                        <NOT>
                                                                           <OR>
                                                                              <AND>
                                                                                 <EQInternal>
                                                                                    <NodeOutcomeVariable>
                                                                                       <NodeRef dir="child">COMMAND__144</NodeRef>
                                                                                    </NodeOutcomeVariable>
                                                                                    <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                                                 </EQInternal>
                                                                                 <EQInternal>
                                                                                    <NodeStateVariable>
                                                                                       <NodeRef dir="child">COMMAND__144</NodeRef>
                                                                                    </NodeStateVariable>
                                                                                    <NodeStateValue>FINISHED</NodeStateValue>
                                                                                 </EQInternal>
                                                                              </AND>
                                                                              <AND>
                                                                                 <EQInternal>
                                                                                    <NodeOutcomeVariable>
                                                                                       <NodeRef dir="child">if__145</NodeRef>
                                                                                    </NodeOutcomeVariable>
                                                                                    <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                                                 </EQInternal>
                                                                                 <EQInternal>
                                                                                    <NodeStateVariable>
                                                                                       <NodeRef dir="child">if__145</NodeRef>
                                                                                    </NodeStateVariable>
                                                                                    <NodeStateValue>FINISHED</NodeStateValue>
                                                                                 </EQInternal>
                                                                              </AND>
                                                                           </OR>
                                                                        </NOT>
                                                                     </InvariantCondition>
                                                                     <NodeBody>
                                                                        <NodeList>
                                                                           <Node NodeType="Command" LineNo="591" ColNo="6">
                                                                              <NodeId>COMMAND__144</NodeId>
                                                                              <NodeBody>
                                                                                 <Command>
                                                                                    <Name>
                                                                                       <StringValue>pprint</StringValue>
                                                                                    </Name>
                                                                                    <Arguments LineNo="592" ColNo="13">
                                                                                       <StringValue>Determining y coordinate update</StringValue>
                                                                                    </Arguments>
                                                                                 </Command>
                                                                              </NodeBody>
                                                                           </Node>
                                                                           <Node NodeType="NodeList" epx="If" LineNo="594" ColNo="6">
                                                                              <NodeId>if__145</NodeId>
                                                                              <StartCondition>
                                                                                 <EQInternal>
                                                                                    <NodeStateVariable>
                                                                                       <NodeRef dir="sibling">COMMAND__144</NodeRef>
                                                                                    </NodeStateVariable>
                                                                                    <NodeStateValue>FINISHED</NodeStateValue>
                                                                                 </EQInternal>
                                                                              </StartCondition>
                                                                              <NodeBody>
                                                                                 <NodeList>
                                                                                    <Node NodeType="Empty" epx="Condition">
                                                                                       <NodeId>ep2cp_IfTest</NodeId>
                                                                                       <PostCondition>
                                                                                          <LT>
                                                                                             <RealVariable>yState</RealVariable>
                                                                                             <IntegerValue>0</IntegerValue>
                                                                                          </LT>
                                                                                       </PostCondition>
                                                                                    </Node>
                                                                                    <Node NodeType="Assignment" epx="Then" LineNo="596" ColNo="7">
                                                                                       <NodeId>ASSIGNMENT__147</NodeId>
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
                                                                                          <Assignment>
                                                                                             <IntegerVariable>yFlag</IntegerVariable>
                                                                                             <NumericRHS>
                                                                                                <IntegerValue>1</IntegerValue>
                                                                                             </NumericRHS>
                                                                                          </Assignment>
                                                                                       </NodeBody>
                                                                                    </Node>
                                                                                    <Node NodeType="Empty" epx="ElseIf">
                                                                                       <NodeId>ep2cp_ElseIf-1</NodeId>
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
                                                                                       <PostCondition>
                                                                                          <GT>
                                                                                             <RealVariable>yState</RealVariable>
                                                                                             <IntegerValue>0</IntegerValue>
                                                                                          </GT>
                                                                                       </PostCondition>
                                                                                    </Node>
                                                                                    <Node NodeType="Assignment" epx="Then" LineNo="600" ColNo="7">
                                                                                       <NodeId>ASSIGNMENT__149</NodeId>
                                                                                       <StartCondition>
                                                                                          <EQInternal>
                                                                                             <NodeOutcomeVariable>
                                                                                                <NodeRef dir="sibling">ep2cp_ElseIf-1</NodeRef>
                                                                                             </NodeOutcomeVariable>
                                                                                             <NodeOutcomeValue>SUCCESS</NodeOutcomeValue>
                                                                                          </EQInternal>
                                                                                       </StartCondition>
                                                                                       <SkipCondition>
                                                                                          <NOT>
                                                                                             <EQInternal>
                                                                                                <NodeOutcomeVariable>
                                                                                                   <NodeRef dir="sibling">ep2cp_ElseIf-1</NodeRef>
                                                                                                </NodeOutcomeVariable>
                                                                                                <NodeOutcomeValue>SUCCESS</NodeOutcomeValue>
                                                                                             </EQInternal>
                                                                                          </NOT>
                                                                                       </SkipCondition>
                                                                                       <NodeBody>
                                                                                          <Assignment>
                                                                                             <IntegerVariable>yFlag</IntegerVariable>
                                                                                             <NumericRHS>
                                                                                                <IntegerValue>-1</IntegerValue>
                                                                                             </NumericRHS>
                                                                                          </Assignment>
                                                                                       </NodeBody>
                                                                                    </Node>
                                                                                    <Node NodeType="Assignment" epx="Else" LineNo="604" ColNo="7">
                                                                                       <NodeId>ASSIGNMENT__151</NodeId>
                                                                                       <StartCondition>
                                                                                          <EQInternal>
                                                                                             <NodeFailureVariable>
                                                                                                <NodeRef dir="sibling">ep2cp_ElseIf-1</NodeRef>
                                                                                             </NodeFailureVariable>
                                                                                             <NodeFailureValue>POST_CONDITION_FAILED</NodeFailureValue>
                                                                                          </EQInternal>
                                                                                       </StartCondition>
                                                                                       <SkipCondition>
                                                                                          <EQInternal>
                                                                                             <NodeOutcomeVariable>
                                                                                                <NodeRef dir="sibling">ep2cp_ElseIf-1</NodeRef>
                                                                                             </NodeOutcomeVariable>
                                                                                             <NodeOutcomeValue>SKIPPED</NodeOutcomeValue>
                                                                                          </EQInternal>
                                                                                       </SkipCondition>
                                                                                       <NodeBody>
                                                                                          <Assignment>
                                                                                             <IntegerVariable>yFlag</IntegerVariable>
                                                                                             <NumericRHS>
                                                                                                <IntegerValue>0</IntegerValue>
                                                                                             </NumericRHS>
                                                                                          </Assignment>
                                                                                       </NodeBody>
                                                                                    </Node>
                                                                                 </NodeList>
                                                                              </NodeBody>
                                                                           </Node>
                                                                        </NodeList>
                                                                     </NodeBody>
                                                                  </Node>
                                                                  <Node NodeType="NodeList" epx="Sequence" LineNo="611" ColNo="6">
                                                                     <NodeId>zLocation</NodeId>
                                                                     <StartCondition>
                                                                        <AND>
                                                                           <EQInternal>
                                                                              <NodeStateVariable>
                                                                                 <NodeRef dir="sibling">yLocation</NodeRef>
                                                                              </NodeStateVariable>
                                                                              <NodeStateValue>FINISHED</NodeStateValue>
                                                                           </EQInternal>
                                                                           <EQInternal>
                                                                              <NodeStateVariable>
                                                                                 <NodeId>yLocation</NodeId>
                                                                              </NodeStateVariable>
                                                                              <NodeStateValue>FINISHED</NodeStateValue>
                                                                           </EQInternal>
                                                                        </AND>
                                                                     </StartCondition>
                                                                     <InvariantCondition>
                                                                        <NOT>
                                                                           <OR>
                                                                              <AND>
                                                                                 <EQInternal>
                                                                                    <NodeOutcomeVariable>
                                                                                       <NodeRef dir="child">COMMAND__152</NodeRef>
                                                                                    </NodeOutcomeVariable>
                                                                                    <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                                                 </EQInternal>
                                                                                 <EQInternal>
                                                                                    <NodeStateVariable>
                                                                                       <NodeRef dir="child">COMMAND__152</NodeRef>
                                                                                    </NodeStateVariable>
                                                                                    <NodeStateValue>FINISHED</NodeStateValue>
                                                                                 </EQInternal>
                                                                              </AND>
                                                                              <AND>
                                                                                 <EQInternal>
                                                                                    <NodeOutcomeVariable>
                                                                                       <NodeRef dir="child">if__153</NodeRef>
                                                                                    </NodeOutcomeVariable>
                                                                                    <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                                                 </EQInternal>
                                                                                 <EQInternal>
                                                                                    <NodeStateVariable>
                                                                                       <NodeRef dir="child">if__153</NodeRef>
                                                                                    </NodeStateVariable>
                                                                                    <NodeStateValue>FINISHED</NodeStateValue>
                                                                                 </EQInternal>
                                                                              </AND>
                                                                           </OR>
                                                                        </NOT>
                                                                     </InvariantCondition>
                                                                     <NodeBody>
                                                                        <NodeList>
                                                                           <Node NodeType="Command" LineNo="612" ColNo="6">
                                                                              <NodeId>COMMAND__152</NodeId>
                                                                              <NodeBody>
                                                                                 <Command>
                                                                                    <Name>
                                                                                       <StringValue>pprint</StringValue>
                                                                                    </Name>
                                                                                    <Arguments LineNo="613" ColNo="13">
                                                                                       <StringValue>Determining z coordinate update</StringValue>
                                                                                    </Arguments>
                                                                                 </Command>
                                                                              </NodeBody>
                                                                           </Node>
                                                                           <Node NodeType="NodeList" epx="If" LineNo="615" ColNo="6">
                                                                              <NodeId>if__153</NodeId>
                                                                              <StartCondition>
                                                                                 <EQInternal>
                                                                                    <NodeStateVariable>
                                                                                       <NodeRef dir="sibling">COMMAND__152</NodeRef>
                                                                                    </NodeStateVariable>
                                                                                    <NodeStateValue>FINISHED</NodeStateValue>
                                                                                 </EQInternal>
                                                                              </StartCondition>
                                                                              <NodeBody>
                                                                                 <NodeList>
                                                                                    <Node NodeType="Empty" epx="Condition">
                                                                                       <NodeId>ep2cp_IfTest</NodeId>
                                                                                       <PostCondition>
                                                                                          <LT>
                                                                                             <RealVariable>zState</RealVariable>
                                                                                             <IntegerValue>0</IntegerValue>
                                                                                          </LT>
                                                                                       </PostCondition>
                                                                                    </Node>
                                                                                    <Node NodeType="Assignment" epx="Then" LineNo="617" ColNo="7">
                                                                                       <NodeId>ASSIGNMENT__155</NodeId>
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
                                                                                          <Assignment>
                                                                                             <IntegerVariable>zFlag</IntegerVariable>
                                                                                             <NumericRHS>
                                                                                                <IntegerValue>1</IntegerValue>
                                                                                             </NumericRHS>
                                                                                          </Assignment>
                                                                                       </NodeBody>
                                                                                    </Node>
                                                                                    <Node NodeType="Empty" epx="ElseIf">
                                                                                       <NodeId>ep2cp_ElseIf-1</NodeId>
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
                                                                                       <PostCondition>
                                                                                          <GT>
                                                                                             <RealVariable>zState</RealVariable>
                                                                                             <IntegerValue>0</IntegerValue>
                                                                                          </GT>
                                                                                       </PostCondition>
                                                                                    </Node>
                                                                                    <Node NodeType="Assignment" epx="Then" LineNo="621" ColNo="7">
                                                                                       <NodeId>ASSIGNMENT__157</NodeId>
                                                                                       <StartCondition>
                                                                                          <EQInternal>
                                                                                             <NodeOutcomeVariable>
                                                                                                <NodeRef dir="sibling">ep2cp_ElseIf-1</NodeRef>
                                                                                             </NodeOutcomeVariable>
                                                                                             <NodeOutcomeValue>SUCCESS</NodeOutcomeValue>
                                                                                          </EQInternal>
                                                                                       </StartCondition>
                                                                                       <SkipCondition>
                                                                                          <NOT>
                                                                                             <EQInternal>
                                                                                                <NodeOutcomeVariable>
                                                                                                   <NodeRef dir="sibling">ep2cp_ElseIf-1</NodeRef>
                                                                                                </NodeOutcomeVariable>
                                                                                                <NodeOutcomeValue>SUCCESS</NodeOutcomeValue>
                                                                                             </EQInternal>
                                                                                          </NOT>
                                                                                       </SkipCondition>
                                                                                       <NodeBody>
                                                                                          <Assignment>
                                                                                             <IntegerVariable>zFlag</IntegerVariable>
                                                                                             <NumericRHS>
                                                                                                <IntegerValue>-1</IntegerValue>
                                                                                             </NumericRHS>
                                                                                          </Assignment>
                                                                                       </NodeBody>
                                                                                    </Node>
                                                                                    <Node NodeType="Assignment" epx="Else" LineNo="625" ColNo="7">
                                                                                       <NodeId>ASSIGNMENT__159</NodeId>
                                                                                       <StartCondition>
                                                                                          <EQInternal>
                                                                                             <NodeFailureVariable>
                                                                                                <NodeRef dir="sibling">ep2cp_ElseIf-1</NodeRef>
                                                                                             </NodeFailureVariable>
                                                                                             <NodeFailureValue>POST_CONDITION_FAILED</NodeFailureValue>
                                                                                          </EQInternal>
                                                                                       </StartCondition>
                                                                                       <SkipCondition>
                                                                                          <EQInternal>
                                                                                             <NodeOutcomeVariable>
                                                                                                <NodeRef dir="sibling">ep2cp_ElseIf-1</NodeRef>
                                                                                             </NodeOutcomeVariable>
                                                                                             <NodeOutcomeValue>SKIPPED</NodeOutcomeValue>
                                                                                          </EQInternal>
                                                                                       </SkipCondition>
                                                                                       <NodeBody>
                                                                                          <Assignment>
                                                                                             <IntegerVariable>zFlag</IntegerVariable>
                                                                                             <NumericRHS>
                                                                                                <IntegerValue>0</IntegerValue>
                                                                                             </NumericRHS>
                                                                                          </Assignment>
                                                                                       </NodeBody>
                                                                                    </Node>
                                                                                 </NodeList>
                                                                              </NodeBody>
                                                                           </Node>
                                                                        </NodeList>
                                                                     </NodeBody>
                                                                  </Node>
                                                                  <Node NodeType="Command" LineNo="629" ColNo="5">
                                                                     <NodeId>COMMAND__160</NodeId>
                                                                     <StartCondition>
                                                                        <EQInternal>
                                                                           <NodeStateVariable>
                                                                              <NodeRef dir="sibling">zLocation</NodeRef>
                                                                           </NodeStateVariable>
                                                                           <NodeStateValue>FINISHED</NodeStateValue>
                                                                        </EQInternal>
                                                                     </StartCondition>
                                                                     <NodeBody>
                                                                        <Command>
                                                                           <Name>
                                                                              <StringValue>pprint</StringValue>
                                                                           </Name>
                                                                           <Arguments LineNo="630" ColNo="12">
                                                                              <StringValue>Updating Flight Parameters: velFlag =</StringValue>
                                                                              <IntegerVariable>velFlag</IntegerVariable>
                                                                              <StringValue>xFlag =</StringValue>
                                                                              <IntegerVariable>xFlag</IntegerVariable>
                                                                              <StringValue>yFlag =</StringValue>
                                                                              <IntegerVariable>yFlag</IntegerVariable>
                                                                              <StringValue>zFlag =</StringValue>
                                                                              <IntegerVariable>zFlag</IntegerVariable>
                                                                           </Arguments>
                                                                        </Command>
                                                                     </NodeBody>
                                                                  </Node>
                                                                  <Node NodeType="Command" LineNo="630" ColNo="5">
                                                                     <NodeId>COMMAND__161</NodeId>
                                                                     <StartCondition>
                                                                        <EQInternal>
                                                                           <NodeStateVariable>
                                                                              <NodeRef dir="sibling">COMMAND__160</NodeRef>
                                                                           </NodeStateVariable>
                                                                           <NodeStateValue>FINISHED</NodeStateValue>
                                                                        </EQInternal>
                                                                     </StartCondition>
                                                                     <NodeBody>
                                                                        <Command>
                                                                           <Name>
                                                                              <StringValue>UpdateFlight</StringValue>
                                                                           </Name>
                                                                           <Arguments LineNo="631" ColNo="18">
                                                                              <IntegerVariable>velFlag</IntegerVariable>
                                                                              <IntegerVariable>xFlag</IntegerVariable>
                                                                              <IntegerVariable>yFlag</IntegerVariable>
                                                                              <IntegerVariable>zFlag</IntegerVariable>
                                                                              <StringValue>B</StringValue>
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
                                       <Node NodeType="NodeList" epx="Sequence" LineNo="641" ColNo="3">
                                          <NodeId>Arrived_at_B</NodeId>
                                          <StartCondition>
                                             <AND>
                                                <EQInternal>
                                                   <NodeStateVariable>
                                                      <NodeRef dir="sibling">Not_at_B</NodeRef>
                                                   </NodeStateVariable>
                                                   <NodeStateValue>FINISHED</NodeStateValue>
                                                </EQInternal>
                                                <BooleanVariable>At_B</BooleanVariable>
                                             </AND>
                                          </StartCondition>
                                          <InvariantCondition>
                                             <NOT>
                                                <OR>
                                                   <AND>
                                                      <EQInternal>
                                                         <NodeOutcomeVariable>
                                                            <NodeRef dir="child">COMMAND__162</NodeRef>
                                                         </NodeOutcomeVariable>
                                                         <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                      </EQInternal>
                                                      <EQInternal>
                                                         <NodeStateVariable>
                                                            <NodeRef dir="child">COMMAND__162</NodeRef>
                                                         </NodeStateVariable>
                                                         <NodeStateValue>FINISHED</NodeStateValue>
                                                      </EQInternal>
                                                   </AND>
                                                   <AND>
                                                      <EQInternal>
                                                         <NodeOutcomeVariable>
                                                            <NodeRef dir="child">PerformScience</NodeRef>
                                                         </NodeOutcomeVariable>
                                                         <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                      </EQInternal>
                                                      <EQInternal>
                                                         <NodeStateVariable>
                                                            <NodeRef dir="child">PerformScience</NodeRef>
                                                         </NodeStateVariable>
                                                         <NodeStateValue>FINISHED</NodeStateValue>
                                                      </EQInternal>
                                                   </AND>
                                                   <AND>
                                                      <EQInternal>
                                                         <NodeOutcomeVariable>
                                                            <NodeRef dir="child">UpdatePlan</NodeRef>
                                                         </NodeOutcomeVariable>
                                                         <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                      </EQInternal>
                                                      <EQInternal>
                                                         <NodeStateVariable>
                                                            <NodeRef dir="child">UpdatePlan</NodeRef>
                                                         </NodeStateVariable>
                                                         <NodeStateValue>FINISHED</NodeStateValue>
                                                      </EQInternal>
                                                   </AND>
                                                </OR>
                                             </NOT>
                                          </InvariantCondition>
                                          <NodeBody>
                                             <NodeList>
                                                <Node NodeType="Command" LineNo="643" ColNo="3">
                                                   <NodeId>COMMAND__162</NodeId>
                                                   <NodeBody>
                                                      <Command>
                                                         <Name>
                                                            <StringValue>pprint</StringValue>
                                                         </Name>
                                                         <Arguments LineNo="644" ColNo="10">
                                                            <StringValue>Updated Flight Status: Arrived at B!</StringValue>
                                                         </Arguments>
                                                      </Command>
                                                   </NodeBody>
                                                </Node>
                                                <Node NodeType="NodeList" epx="Sequence" LineNo="648" ColNo="4">
                                                   <NodeId>PerformScience</NodeId>
                                                   <VariableDeclarations>
                                                      <DeclareVariable LineNo="647" ColNo="4">
                                                         <Name>PicTaken</Name>
                                                         <Type>Boolean</Type>
                                                      </DeclareVariable>
                                                   </VariableDeclarations>
                                                   <StartCondition>
                                                      <EQInternal>
                                                         <NodeStateVariable>
                                                            <NodeRef dir="sibling">COMMAND__162</NodeRef>
                                                         </NodeStateVariable>
                                                         <NodeStateValue>FINISHED</NodeStateValue>
                                                      </EQInternal>
                                                   </StartCondition>
                                                   <PostCondition>
                                                      <BooleanVariable>PicTaken</BooleanVariable>
                                                   </PostCondition>
                                                   <InvariantCondition>
                                                      <NOT>
                                                         <OR>
                                                            <AND>
                                                               <EQInternal>
                                                                  <NodeOutcomeVariable>
                                                                     <NodeRef dir="child">COMMAND__163</NodeRef>
                                                                  </NodeOutcomeVariable>
                                                                  <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                               </EQInternal>
                                                               <EQInternal>
                                                                  <NodeStateVariable>
                                                                     <NodeRef dir="child">COMMAND__163</NodeRef>
                                                                  </NodeStateVariable>
                                                                  <NodeStateValue>FINISHED</NodeStateValue>
                                                               </EQInternal>
                                                            </AND>
                                                            <AND>
                                                               <EQInternal>
                                                                  <NodeOutcomeVariable>
                                                                     <NodeRef dir="child">COMMAND__164</NodeRef>
                                                                  </NodeOutcomeVariable>
                                                                  <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                               </EQInternal>
                                                               <EQInternal>
                                                                  <NodeStateVariable>
                                                                     <NodeRef dir="child">COMMAND__164</NodeRef>
                                                                  </NodeStateVariable>
                                                                  <NodeStateValue>FINISHED</NodeStateValue>
                                                               </EQInternal>
                                                            </AND>
                                                            <AND>
                                                               <EQInternal>
                                                                  <NodeOutcomeVariable>
                                                                     <NodeRef dir="child">Command_TakePic</NodeRef>
                                                                  </NodeOutcomeVariable>
                                                                  <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                               </EQInternal>
                                                               <EQInternal>
                                                                  <NodeStateVariable>
                                                                     <NodeRef dir="child">Command_TakePic</NodeRef>
                                                                  </NodeStateVariable>
                                                                  <NodeStateValue>FINISHED</NodeStateValue>
                                                               </EQInternal>
                                                            </AND>
                                                            <AND>
                                                               <EQInternal>
                                                                  <NodeOutcomeVariable>
                                                                     <NodeRef dir="child">if__166</NodeRef>
                                                                  </NodeOutcomeVariable>
                                                                  <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                               </EQInternal>
                                                               <EQInternal>
                                                                  <NodeStateVariable>
                                                                     <NodeRef dir="child">if__166</NodeRef>
                                                                  </NodeStateVariable>
                                                                  <NodeStateValue>FINISHED</NodeStateValue>
                                                               </EQInternal>
                                                            </AND>
                                                         </OR>
                                                      </NOT>
                                                   </InvariantCondition>
                                                   <NodeBody>
                                                      <NodeList>
                                                         <Node NodeType="Command" LineNo="650" ColNo="4">
                                                            <NodeId>COMMAND__163</NodeId>
                                                            <NodeBody>
                                                               <Command>
                                                                  <Name>
                                                                     <StringValue>pprint</StringValue>
                                                                  </Name>
                                                                  <Arguments LineNo="651" ColNo="11">
                                                                     <StringValue> </StringValue>
                                                                  </Arguments>
                                                               </Command>
                                                            </NodeBody>
                                                         </Node>
                                                         <Node NodeType="Command" LineNo="651" ColNo="4">
                                                            <NodeId>COMMAND__164</NodeId>
                                                            <StartCondition>
                                                               <EQInternal>
                                                                  <NodeStateVariable>
                                                                     <NodeRef dir="sibling">COMMAND__163</NodeRef>
                                                                  </NodeStateVariable>
                                                                  <NodeStateValue>FINISHED</NodeStateValue>
                                                               </EQInternal>
                                                            </StartCondition>
                                                            <NodeBody>
                                                               <Command>
                                                                  <Name>
                                                                     <StringValue>pprint</StringValue>
                                                                  </Name>
                                                                  <Arguments LineNo="652" ColNo="11">
                                                                     <StringValue>Performing Science at Waypoint B</StringValue>
                                                                  </Arguments>
                                                               </Command>
                                                            </NodeBody>
                                                         </Node>
                                                         <Node NodeType="NodeList" epx="Sequence" LineNo="656" ColNo="5">
                                                            <NodeId>Command_TakePic</NodeId>
                                                            <StartCondition>
                                                               <EQInternal>
                                                                  <NodeStateVariable>
                                                                     <NodeRef dir="sibling">COMMAND__164</NodeRef>
                                                                  </NodeStateVariable>
                                                                  <NodeStateValue>FINISHED</NodeStateValue>
                                                               </EQInternal>
                                                            </StartCondition>
                                                            <InvariantCondition>
                                                               <NOT>
                                                                  <AND>
                                                                     <EQInternal>
                                                                        <NodeOutcomeVariable>
                                                                           <NodeRef dir="child">SynchronousCommand__165</NodeRef>
                                                                        </NodeOutcomeVariable>
                                                                        <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                                     </EQInternal>
                                                                     <EQInternal>
                                                                        <NodeStateVariable>
                                                                           <NodeRef dir="child">SynchronousCommand__165</NodeRef>
                                                                        </NodeStateVariable>
                                                                        <NodeStateValue>FINISHED</NodeStateValue>
                                                                     </EQInternal>
                                                                  </AND>
                                                               </NOT>
                                                            </InvariantCondition>
                                                            <NodeBody>
                                                               <NodeList>
                                                                  <Node NodeType="NodeList" epx="SynchronousCommand" LineNo="656" ColNo="5">
                                                                     <NodeId>SynchronousCommand__165</NodeId>
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
                                                                                                <StringValue>TakePic</StringValue>
                                                                                             </Name>
                                                                                             <Arguments LineNo="656" ColNo="43">
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
                                                                                             <BooleanVariable>PicTaken</BooleanVariable>
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
                                                         <Node NodeType="NodeList" epx="If" LineNo="659" ColNo="4">
                                                            <NodeId>if__166</NodeId>
                                                            <StartCondition>
                                                               <EQInternal>
                                                                  <NodeStateVariable>
                                                                     <NodeRef dir="sibling">Command_TakePic</NodeRef>
                                                                  </NodeStateVariable>
                                                                  <NodeStateValue>FINISHED</NodeStateValue>
                                                               </EQInternal>
                                                            </StartCondition>
                                                            <NodeBody>
                                                               <NodeList>
                                                                  <Node NodeType="Empty" epx="Condition">
                                                                     <NodeId>ep2cp_IfTest</NodeId>
                                                                     <PostCondition>
                                                                        <BooleanVariable>PicTaken</BooleanVariable>
                                                                     </PostCondition>
                                                                  </Node>
                                                                  <Node NodeType="Command" epx="Then" LineNo="660" ColNo="5">
                                                                     <NodeId>COMMAND__168</NodeId>
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
                                                                        <Command>
                                                                           <Name>
                                                                              <StringValue>pprint</StringValue>
                                                                           </Name>
                                                                           <Arguments LineNo="661" ColNo="12">
                                                                              <StringValue>Science successful</StringValue>
                                                                           </Arguments>
                                                                        </Command>
                                                                     </NodeBody>
                                                                  </Node>
                                                                  <Node NodeType="Command" epx="Else" LineNo="664" ColNo="5">
                                                                     <NodeId>COMMAND__170</NodeId>
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
                                                                           <Arguments LineNo="665" ColNo="12">
                                                                              <StringValue>Science FAILED!!!</StringValue>
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
                                                <Node NodeType="NodeList" epx="Sequence" LineNo="673" ColNo="4">
                                                   <NodeId>UpdatePlan</NodeId>
                                                   <VariableDeclarations>
                                                      <DeclareVariable LineNo="672" ColNo="4">
                                                         <Name>PlanUpdated</Name>
                                                         <Type>Boolean</Type>
                                                      </DeclareVariable>
                                                   </VariableDeclarations>
                                                   <StartCondition>
                                                      <EQInternal>
                                                         <NodeStateVariable>
                                                            <NodeRef dir="sibling">PerformScience</NodeRef>
                                                         </NodeStateVariable>
                                                         <NodeStateValue>FINISHED</NodeStateValue>
                                                      </EQInternal>
                                                   </StartCondition>
                                                   <PostCondition>
                                                      <BooleanVariable>PlanUpdated</BooleanVariable>
                                                   </PostCondition>
                                                   <InvariantCondition>
                                                      <NOT>
                                                         <OR>
                                                            <AND>
                                                               <EQInternal>
                                                                  <NodeOutcomeVariable>
                                                                     <NodeRef dir="child">COMMAND__171</NodeRef>
                                                                  </NodeOutcomeVariable>
                                                                  <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                               </EQInternal>
                                                               <EQInternal>
                                                                  <NodeStateVariable>
                                                                     <NodeRef dir="child">COMMAND__171</NodeRef>
                                                                  </NodeStateVariable>
                                                                  <NodeStateValue>FINISHED</NodeStateValue>
                                                               </EQInternal>
                                                            </AND>
                                                            <AND>
                                                               <EQInternal>
                                                                  <NodeOutcomeVariable>
                                                                     <NodeRef dir="child">COMMAND__172</NodeRef>
                                                                  </NodeOutcomeVariable>
                                                                  <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                               </EQInternal>
                                                               <EQInternal>
                                                                  <NodeStateVariable>
                                                                     <NodeRef dir="child">COMMAND__172</NodeRef>
                                                                  </NodeStateVariable>
                                                                  <NodeStateValue>FINISHED</NodeStateValue>
                                                               </EQInternal>
                                                            </AND>
                                                            <AND>
                                                               <EQInternal>
                                                                  <NodeOutcomeVariable>
                                                                     <NodeRef dir="child">Command_UpdatePlan</NodeRef>
                                                                  </NodeOutcomeVariable>
                                                                  <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                               </EQInternal>
                                                               <EQInternal>
                                                                  <NodeStateVariable>
                                                                     <NodeRef dir="child">Command_UpdatePlan</NodeRef>
                                                                  </NodeStateVariable>
                                                                  <NodeStateValue>FINISHED</NodeStateValue>
                                                               </EQInternal>
                                                            </AND>
                                                            <AND>
                                                               <EQInternal>
                                                                  <NodeOutcomeVariable>
                                                                     <NodeRef dir="child">if__174</NodeRef>
                                                                  </NodeOutcomeVariable>
                                                                  <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                               </EQInternal>
                                                               <EQInternal>
                                                                  <NodeStateVariable>
                                                                     <NodeRef dir="child">if__174</NodeRef>
                                                                  </NodeStateVariable>
                                                                  <NodeStateValue>FINISHED</NodeStateValue>
                                                               </EQInternal>
                                                            </AND>
                                                         </OR>
                                                      </NOT>
                                                   </InvariantCondition>
                                                   <NodeBody>
                                                      <NodeList>
                                                         <Node NodeType="Command" LineNo="675" ColNo="4">
                                                            <NodeId>COMMAND__171</NodeId>
                                                            <NodeBody>
                                                               <Command>
                                                                  <Name>
                                                                     <StringValue>pprint</StringValue>
                                                                  </Name>
                                                                  <Arguments LineNo="676" ColNo="11">
                                                                     <StringValue> </StringValue>
                                                                  </Arguments>
                                                               </Command>
                                                            </NodeBody>
                                                         </Node>
                                                         <Node NodeType="Command" LineNo="676" ColNo="4">
                                                            <NodeId>COMMAND__172</NodeId>
                                                            <StartCondition>
                                                               <EQInternal>
                                                                  <NodeStateVariable>
                                                                     <NodeRef dir="sibling">COMMAND__171</NodeRef>
                                                                  </NodeStateVariable>
                                                                  <NodeStateValue>FINISHED</NodeStateValue>
                                                               </EQInternal>
                                                            </StartCondition>
                                                            <NodeBody>
                                                               <Command>
                                                                  <Name>
                                                                     <StringValue>pprint</StringValue>
                                                                  </Name>
                                                                  <Arguments LineNo="677" ColNo="11">
                                                                     <StringValue>Updating Waypoint Plan</StringValue>
                                                                  </Arguments>
                                                               </Command>
                                                            </NodeBody>
                                                         </Node>
                                                         <Node NodeType="NodeList" epx="Sequence" LineNo="681" ColNo="5">
                                                            <NodeId>Command_UpdatePlan</NodeId>
                                                            <StartCondition>
                                                               <EQInternal>
                                                                  <NodeStateVariable>
                                                                     <NodeRef dir="sibling">COMMAND__172</NodeRef>
                                                                  </NodeStateVariable>
                                                                  <NodeStateValue>FINISHED</NodeStateValue>
                                                               </EQInternal>
                                                            </StartCondition>
                                                            <InvariantCondition>
                                                               <NOT>
                                                                  <AND>
                                                                     <EQInternal>
                                                                        <NodeOutcomeVariable>
                                                                           <NodeRef dir="child">SynchronousCommand__173</NodeRef>
                                                                        </NodeOutcomeVariable>
                                                                        <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                                     </EQInternal>
                                                                     <EQInternal>
                                                                        <NodeStateVariable>
                                                                           <NodeRef dir="child">SynchronousCommand__173</NodeRef>
                                                                        </NodeStateVariable>
                                                                        <NodeStateValue>FINISHED</NodeStateValue>
                                                                     </EQInternal>
                                                                  </AND>
                                                               </NOT>
                                                            </InvariantCondition>
                                                            <NodeBody>
                                                               <NodeList>
                                                                  <Node NodeType="NodeList" epx="SynchronousCommand" LineNo="681" ColNo="5">
                                                                     <NodeId>SynchronousCommand__173</NodeId>
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
                                                                                                <StringValue>UpdatePlan</StringValue>
                                                                                             </Name>
                                                                                             <Arguments LineNo="681" ColNo="49">
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
                                                                                             <BooleanVariable>PlanUpdated</BooleanVariable>
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
                                                         <Node NodeType="NodeList" epx="If" LineNo="684" ColNo="4">
                                                            <NodeId>if__174</NodeId>
                                                            <StartCondition>
                                                               <EQInternal>
                                                                  <NodeStateVariable>
                                                                     <NodeRef dir="sibling">Command_UpdatePlan</NodeRef>
                                                                  </NodeStateVariable>
                                                                  <NodeStateValue>FINISHED</NodeStateValue>
                                                               </EQInternal>
                                                            </StartCondition>
                                                            <NodeBody>
                                                               <NodeList>
                                                                  <Node NodeType="Empty" epx="Condition">
                                                                     <NodeId>ep2cp_IfTest</NodeId>
                                                                     <PostCondition>
                                                                        <BooleanVariable>PlanUpdated</BooleanVariable>
                                                                     </PostCondition>
                                                                  </Node>
                                                                  <Node NodeType="NodeList" epx="Then" LineNo="686" ColNo="5">
                                                                     <NodeId>BLOCK__175</NodeId>
                                                                     <InvariantCondition>
                                                                        <NOT>
                                                                           <OR>
                                                                              <AND>
                                                                                 <EQInternal>
                                                                                    <NodeOutcomeVariable>
                                                                                       <NodeRef dir="child">COMMAND__176</NodeRef>
                                                                                    </NodeOutcomeVariable>
                                                                                    <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                                                 </EQInternal>
                                                                                 <EQInternal>
                                                                                    <NodeStateVariable>
                                                                                       <NodeRef dir="child">COMMAND__176</NodeRef>
                                                                                    </NodeStateVariable>
                                                                                    <NodeStateValue>FINISHED</NodeStateValue>
                                                                                 </EQInternal>
                                                                              </AND>
                                                                              <AND>
                                                                                 <EQInternal>
                                                                                    <NodeOutcomeVariable>
                                                                                       <NodeRef dir="child">COMMAND__177</NodeRef>
                                                                                    </NodeOutcomeVariable>
                                                                                    <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                                                 </EQInternal>
                                                                                 <EQInternal>
                                                                                    <NodeStateVariable>
                                                                                       <NodeRef dir="child">COMMAND__177</NodeRef>
                                                                                    </NodeStateVariable>
                                                                                    <NodeStateValue>FINISHED</NodeStateValue>
                                                                                 </EQInternal>
                                                                              </AND>
                                                                              <AND>
                                                                                 <EQInternal>
                                                                                    <NodeOutcomeVariable>
                                                                                       <NodeRef dir="child">COMMAND__178</NodeRef>
                                                                                    </NodeOutcomeVariable>
                                                                                    <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                                                 </EQInternal>
                                                                                 <EQInternal>
                                                                                    <NodeStateVariable>
                                                                                       <NodeRef dir="child">COMMAND__178</NodeRef>
                                                                                    </NodeStateVariable>
                                                                                    <NodeStateValue>FINISHED</NodeStateValue>
                                                                                 </EQInternal>
                                                                              </AND>
                                                                              <AND>
                                                                                 <EQInternal>
                                                                                    <NodeOutcomeVariable>
                                                                                       <NodeRef dir="child">COMMAND__179</NodeRef>
                                                                                    </NodeOutcomeVariable>
                                                                                    <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                                                 </EQInternal>
                                                                                 <EQInternal>
                                                                                    <NodeStateVariable>
                                                                                       <NodeRef dir="child">COMMAND__179</NodeRef>
                                                                                    </NodeStateVariable>
                                                                                    <NodeStateValue>FINISHED</NodeStateValue>
                                                                                 </EQInternal>
                                                                              </AND>
                                                                              <AND>
                                                                                 <EQInternal>
                                                                                    <NodeOutcomeVariable>
                                                                                       <NodeRef dir="child">ASSIGNMENT__180</NodeRef>
                                                                                    </NodeOutcomeVariable>
                                                                                    <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                                                 </EQInternal>
                                                                                 <EQInternal>
                                                                                    <NodeStateVariable>
                                                                                       <NodeRef dir="child">ASSIGNMENT__180</NodeRef>
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
                                                                           <Node NodeType="Command" LineNo="685" ColNo="5">
                                                                              <NodeId>COMMAND__176</NodeId>
                                                                              <NodeBody>
                                                                                 <Command>
                                                                                    <Name>
                                                                                       <StringValue>pprint</StringValue>
                                                                                    </Name>
                                                                                    <Arguments LineNo="686" ColNo="12">
                                                                                       <StringValue>Plan updated successfully</StringValue>
                                                                                    </Arguments>
                                                                                 </Command>
                                                                              </NodeBody>
                                                                           </Node>
                                                                           <Node NodeType="Command" LineNo="686" ColNo="5">
                                                                              <NodeId>COMMAND__177</NodeId>
                                                                              <StartCondition>
                                                                                 <EQInternal>
                                                                                    <NodeStateVariable>
                                                                                       <NodeRef dir="sibling">COMMAND__176</NodeRef>
                                                                                    </NodeStateVariable>
                                                                                    <NodeStateValue>FINISHED</NodeStateValue>
                                                                                 </EQInternal>
                                                                              </StartCondition>
                                                                              <NodeBody>
                                                                                 <Command>
                                                                                    <Name>
                                                                                       <StringValue>pprint</StringValue>
                                                                                    </Name>
                                                                                    <Arguments LineNo="687" ColNo="12">
                                                                                       <StringValue> </StringValue>
                                                                                    </Arguments>
                                                                                 </Command>
                                                                              </NodeBody>
                                                                           </Node>
                                                                           <Node NodeType="Command" LineNo="687" ColNo="5">
                                                                              <NodeId>COMMAND__178</NodeId>
                                                                              <StartCondition>
                                                                                 <EQInternal>
                                                                                    <NodeStateVariable>
                                                                                       <NodeRef dir="sibling">COMMAND__177</NodeRef>
                                                                                    </NodeStateVariable>
                                                                                    <NodeStateValue>FINISHED</NodeStateValue>
                                                                                 </EQInternal>
                                                                              </StartCondition>
                                                                              <NodeBody>
                                                                                 <Command>
                                                                                    <Name>
                                                                                       <StringValue>PlanComplete</StringValue>
                                                                                    </Name>
                                                                                 </Command>
                                                                              </NodeBody>
                                                                           </Node>
                                                                           <Node NodeType="Command" LineNo="688" ColNo="5">
                                                                              <NodeId>COMMAND__179</NodeId>
                                                                              <StartCondition>
                                                                                 <EQInternal>
                                                                                    <NodeStateVariable>
                                                                                       <NodeRef dir="sibling">COMMAND__178</NodeRef>
                                                                                    </NodeStateVariable>
                                                                                    <NodeStateValue>FINISHED</NodeStateValue>
                                                                                 </EQInternal>
                                                                              </StartCondition>
                                                                              <NodeBody>
                                                                                 <Command>
                                                                                    <Name>
                                                                                       <StringValue>SendReturnValue</StringValue>
                                                                                    </Name>
                                                                                    <Arguments>
                                                                                       <StringVariable>ep2cp_hdl</StringVariable>
                                                                                       <BooleanValue>true</BooleanValue>
                                                                                    </Arguments>
                                                                                 </Command>
                                                                              </NodeBody>
                                                                           </Node>
                                                                           <Node NodeType="Assignment" LineNo="690" ColNo="5">
                                                                              <NodeId>ASSIGNMENT__180</NodeId>
                                                                              <StartCondition>
                                                                                 <EQInternal>
                                                                                    <NodeStateVariable>
                                                                                       <NodeRef dir="sibling">COMMAND__179</NodeRef>
                                                                                    </NodeStateVariable>
                                                                                    <NodeStateValue>FINISHED</NodeStateValue>
                                                                                 </EQInternal>
                                                                              </StartCondition>
                                                                              <NodeBody>
                                                                                 <Assignment>
                                                                                    <BooleanVariable>WaypointPlan_Success</BooleanVariable>
                                                                                    <BooleanRHS>
                                                                                       <BooleanValue>true</BooleanValue>
                                                                                    </BooleanRHS>
                                                                                 </Assignment>
                                                                              </NodeBody>
                                                                           </Node>
                                                                        </NodeList>
                                                                     </NodeBody>
                                                                  </Node>
                                                                  <Node NodeType="NodeList" epx="Else" LineNo="694" ColNo="5">
                                                                     <NodeId>BLOCK__181</NodeId>
                                                                     <InvariantCondition>
                                                                        <NOT>
                                                                           <OR>
                                                                              <AND>
                                                                                 <EQInternal>
                                                                                    <NodeOutcomeVariable>
                                                                                       <NodeRef dir="child">COMMAND__182</NodeRef>
                                                                                    </NodeOutcomeVariable>
                                                                                    <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                                                 </EQInternal>
                                                                                 <EQInternal>
                                                                                    <NodeStateVariable>
                                                                                       <NodeRef dir="child">COMMAND__182</NodeRef>
                                                                                    </NodeStateVariable>
                                                                                    <NodeStateValue>FINISHED</NodeStateValue>
                                                                                 </EQInternal>
                                                                              </AND>
                                                                              <AND>
                                                                                 <EQInternal>
                                                                                    <NodeOutcomeVariable>
                                                                                       <NodeRef dir="child">COMMAND__183</NodeRef>
                                                                                    </NodeOutcomeVariable>
                                                                                    <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                                                 </EQInternal>
                                                                                 <EQInternal>
                                                                                    <NodeStateVariable>
                                                                                       <NodeRef dir="child">COMMAND__183</NodeRef>
                                                                                    </NodeStateVariable>
                                                                                    <NodeStateValue>FINISHED</NodeStateValue>
                                                                                 </EQInternal>
                                                                              </AND>
                                                                           </OR>
                                                                        </NOT>
                                                                     </InvariantCondition>
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
                                                                        <NodeList>
                                                                           <Node NodeType="Command" LineNo="693" ColNo="5">
                                                                              <NodeId>COMMAND__182</NodeId>
                                                                              <NodeBody>
                                                                                 <Command>
                                                                                    <Name>
                                                                                       <StringValue>pprint</StringValue>
                                                                                    </Name>
                                                                                    <Arguments LineNo="694" ColNo="12">
                                                                                       <StringValue>Plan update FAILED!!!</StringValue>
                                                                                    </Arguments>
                                                                                 </Command>
                                                                              </NodeBody>
                                                                           </Node>
                                                                           <Node NodeType="Command" LineNo="694" ColNo="5">
                                                                              <NodeId>COMMAND__183</NodeId>
                                                                              <StartCondition>
                                                                                 <EQInternal>
                                                                                    <NodeStateVariable>
                                                                                       <NodeRef dir="sibling">COMMAND__182</NodeRef>
                                                                                    </NodeStateVariable>
                                                                                    <NodeStateValue>FINISHED</NodeStateValue>
                                                                                 </EQInternal>
                                                                              </StartCondition>
                                                                              <NodeBody>
                                                                                 <Command>
                                                                                    <Name>
                                                                                       <StringValue>pprint</StringValue>
                                                                                    </Name>
                                                                                    <Arguments LineNo="695" ColNo="12">
                                                                                       <StringValue> </StringValue>
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
                                             </NodeList>
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
         </NodeList>
      </NodeBody>
   </Node>
</PlexilPlan>