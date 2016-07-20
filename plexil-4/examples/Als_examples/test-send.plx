<?xml version="1.0" encoding="UTF-8"?>
<PlexilPlan xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
            xmlns:tr="extended-plexil-translator"
            FileName="test-send.ple">
   <GlobalDeclarations LineNo="29" ColNo="0">
      <CommandDeclaration LineNo="29" ColNo="0">
         <Name>pprint</Name>
      </CommandDeclaration>
      <CommandDeclaration LineNo="30" ColNo="0">
         <Name>test_udp_msg</Name>
      </CommandDeclaration>
      <CommandDeclaration LineNo="31" ColNo="0">
         <Name>ack_msg</Name>
         <Parameter>
            <Type>String</Type>
         </Parameter>
      </CommandDeclaration>
      <CommandDeclaration LineNo="32" ColNo="0">
         <Name>quit_msg</Name>
         <Parameter>
            <Type>String</Type>
         </Parameter>
      </CommandDeclaration>
      <StateDeclaration LineNo="33" ColNo="5">
         <Name>time</Name>
         <Return>
            <Name>_return_0</Name>
            <Type>Real</Type>
         </Return>
      </StateDeclaration>
   </GlobalDeclarations>
   <Node NodeType="NodeList" epx="UncheckedSequence" LineNo="36" ColNo="0">
      <NodeId>test_send</NodeId>
      <VariableDeclarations>
         <DeclareVariable LineNo="37" ColNo="4">
            <Name>arg1</Name>
            <Type>String</Type>
            <InitialValue>
               <StringValue>CA</StringValue>
            </InitialValue>
         </DeclareVariable>
         <DeclareVariable LineNo="38" ColNo="4">
            <Name>arg2</Name>
            <Type>Boolean</Type>
            <InitialValue>
               <BooleanValue>true</BooleanValue>
            </InitialValue>
         </DeclareVariable>
         <DeclareVariable LineNo="39" ColNo="4">
            <Name>arg3</Name>
            <Type>Integer</Type>
            <InitialValue>
               <IntegerValue>3</IntegerValue>
            </InitialValue>
         </DeclareVariable>
         <DeclareVariable LineNo="40" ColNo="4">
            <Name>arg4</Name>
            <Type>Real</Type>
            <InitialValue>
               <RealValue>3.14159</RealValue>
            </InitialValue>
         </DeclareVariable>
         <DeclareArray LineNo="41" ColNo="4">
            <Name>arg5</Name>
            <Type>Integer</Type>
            <MaxSize>3</MaxSize>
            <InitialValue>
               <IntegerValue>9</IntegerValue>
               <IntegerValue>8</IntegerValue>
               <IntegerValue>7</IntegerValue>
            </InitialValue>
         </DeclareArray>
         <DeclareArray LineNo="42" ColNo="4">
            <Name>arg6</Name>
            <Type>Real</Type>
            <MaxSize>3</MaxSize>
            <InitialValue>
               <RealValue>36.0</RealValue>
               <RealValue>-104.7</RealValue>
               <RealValue>25000.0</RealValue>
            </InitialValue>
         </DeclareArray>
         <DeclareArray LineNo="43" ColNo="4">
            <Name>arg7</Name>
            <Type>Boolean</Type>
            <MaxSize>3</MaxSize>
            <InitialValue>
               <BooleanValue>true</BooleanValue>
               <BooleanValue>true</BooleanValue>
               <BooleanValue>false</BooleanValue>
            </InitialValue>
         </DeclareArray>
         <DeclareArray LineNo="44" ColNo="4">
            <Name>arg8</Name>
            <Type>String</Type>
            <MaxSize>3</MaxSize>
            <InitialValue>
               <StringValue>foo</StringValue>
               <StringValue>baz</StringValue>
               <StringValue>bar</StringValue>
            </InitialValue>
         </DeclareArray>
         <DeclareVariable LineNo="45" ColNo="4">
            <Name>run_start_time</Name>
            <Type>Real</Type>
         </DeclareVariable>
         <DeclareVariable LineNo="46" ColNo="4">
            <Name>ackTimedOut</Name>
            <Type>Boolean</Type>
            <InitialValue>
               <BooleanValue>false</BooleanValue>
            </InitialValue>
         </DeclareVariable>
      </VariableDeclarations>
      <NodeBody>
         <NodeList>
            <Node NodeType="NodeList" epx="Sequence" LineNo="51" ColNo="8">
               <NodeId>RecordStartTime</NodeId>
               <InvariantCondition>
                  <NOT>
                     <AND>
                        <EQInternal>
                           <NodeOutcomeVariable>
                              <NodeRef dir="child">Assignment</NodeRef>
                           </NodeOutcomeVariable>
                           <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                        </EQInternal>
                        <EQInternal>
                           <NodeStateVariable>
                              <NodeRef dir="child">Assignment</NodeRef>
                           </NodeStateVariable>
                           <NodeStateValue>FINISHED</NodeStateValue>
                        </EQInternal>
                     </AND>
                  </NOT>
               </InvariantCondition>
               <NodeBody>
                  <NodeList>
                     <Node NodeType="Assignment" LineNo="51" ColNo="20">
                        <NodeId>Assignment</NodeId>
                        <NodeBody>
                           <Assignment>
                              <RealVariable>run_start_time</RealVariable>
                              <NumericRHS>
                                 <LookupNow>
                                    <Name>
                                       <StringValue>time</StringValue>
                                    </Name>
                                 </LookupNow>
                              </NumericRHS>
                           </Assignment>
                        </NodeBody>
                     </Node>
                  </NodeList>
               </NodeBody>
            </Node>
            <Node NodeType="NodeList" epx="Sequence" LineNo="55" ColNo="4">
               <NodeId>SendUdpCommand1</NodeId>
               <StartCondition>
                  <EQInternal>
                     <NodeStateVariable>
                        <NodeRef dir="sibling">RecordStartTime</NodeRef>
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
                                 <NodeRef dir="child">ReportParameters</NodeRef>
                              </NodeOutcomeVariable>
                              <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                           </EQInternal>
                           <EQInternal>
                              <NodeStateVariable>
                                 <NodeRef dir="child">ReportParameters</NodeRef>
                              </NodeStateVariable>
                              <NodeStateValue>FINISHED</NodeStateValue>
                           </EQInternal>
                        </AND>
                        <AND>
                           <EQInternal>
                              <NodeOutcomeVariable>
                                 <NodeRef dir="child">SendCommand</NodeRef>
                              </NodeOutcomeVariable>
                              <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                           </EQInternal>
                           <EQInternal>
                              <NodeStateVariable>
                                 <NodeRef dir="child">SendCommand</NodeRef>
                              </NodeStateVariable>
                              <NodeStateValue>FINISHED</NodeStateValue>
                           </EQInternal>
                        </AND>
                     </OR>
                  </NOT>
               </InvariantCondition>
               <NodeBody>
                  <NodeList>
                     <Node NodeType="Command" LineNo="58" ColNo="12">
                        <NodeId>ReportParameters</NodeId>
                        <NodeBody>
                           <Command>
                              <Name>
                                 <StringValue>pprint</StringValue>
                              </Name>
                              <Arguments LineNo="59" ColNo="20">
                                 <StringValue>
test_send: sending arg1==</StringValue>
                                 <StringVariable>arg1</StringVariable>
                                 <StringValue>, arg2==</StringValue>
                                 <BooleanVariable>arg2</BooleanVariable>
                                 <StringValue>, arg3==</StringValue>
                                 <IntegerVariable>arg3</IntegerVariable>
                                 <StringValue>, arg4==</StringValue>
                                 <RealVariable>arg4</RealVariable>
                                 <StringValue>, arg5==</StringValue>
                                 <ArrayVariable>arg5</ArrayVariable>
                                 <StringValue>, arg6==</StringValue>
                                 <ArrayVariable>arg6</ArrayVariable>
                                 <StringValue>, arg7==</StringValue>
                                 <ArrayVariable>arg7</ArrayVariable>
                                 <StringValue>, arg8==</StringValue>
                                 <ArrayVariable>arg8</ArrayVariable>
                                 <StringValue>

</StringValue>
                              </Arguments>
                           </Command>
                        </NodeBody>
                     </Node>
                     <Node NodeType="Command" LineNo="63" ColNo="12">
                        <NodeId>SendCommand</NodeId>
                        <StartCondition>
                           <EQInternal>
                              <NodeStateVariable>
                                 <NodeRef dir="sibling">ReportParameters</NodeRef>
                              </NodeStateVariable>
                              <NodeStateValue>FINISHED</NodeStateValue>
                           </EQInternal>
                        </StartCondition>
                        <NodeBody>
                           <Command>
                              <Name>
                                 <StringValue>test_udp_msg</StringValue>
                              </Name>
                              <Arguments LineNo="64" ColNo="26">
                                 <StringVariable>arg1</StringVariable>
                                 <BooleanVariable>arg2</BooleanVariable>
                                 <IntegerVariable>arg3</IntegerVariable>
                                 <RealVariable>arg4</RealVariable>
                                 <ArrayVariable>arg5</ArrayVariable>
                                 <ArrayVariable>arg6</ArrayVariable>
                                 <ArrayVariable>arg7</ArrayVariable>
                                 <ArrayVariable>arg8</ArrayVariable>
                              </Arguments>
                           </Command>
                        </NodeBody>
                     </Node>
                  </NodeList>
               </NodeBody>
            </Node>
            <Node NodeType="NodeList" epx="Concurrence" LineNo="69" ColNo="4">
               <NodeId>SendUdpCommand2</NodeId>
               <StartCondition>
                  <AND>
                     <EQInternal>
                        <NodeStateVariable>
                           <NodeRef dir="sibling">SendUdpCommand1</NodeRef>
                        </NodeStateVariable>
                        <NodeStateValue>FINISHED</NodeStateValue>
                     </EQInternal>
                     <GT>
                        <LookupOnChange>
                           <Name>
                              <StringValue>time</StringValue>
                           </Name>
                           <Tolerance>
                              <RealValue>1</RealValue>
                           </Tolerance>
                        </LookupOnChange>
                        <ADD LineNo="71" ColNo="56">
                           <RealVariable>run_start_time</RealVariable>
                           <IntegerValue>2</IntegerValue>
                        </ADD>
                     </GT>
                  </AND>
               </StartCondition>
               <InvariantCondition>
                  <EQBoolean>
                     <BooleanVariable>ackTimedOut</BooleanVariable>
                     <BooleanValue>false</BooleanValue>
                  </EQBoolean>
               </InvariantCondition>
               <NodeBody>
                  <NodeList>
                     <Node NodeType="Command" LineNo="75" ColNo="12">
                        <NodeId>ReportParameters</NodeId>
                        <NodeBody>
                           <Command>
                              <Name>
                                 <StringValue>pprint</StringValue>
                              </Name>
                              <Arguments LineNo="76" ColNo="20">
                                 <StringValue>
test_send: sending arg1==</StringValue>
                                 <StringVariable>arg1</StringVariable>
                                 <StringValue>, arg2==true, arg3==</StringValue>
                                 <IntegerVariable>arg3</IntegerVariable>
                                 <StringValue>, arg4==</StringValue>
                                 <RealVariable>arg4</RealVariable>
                                 <StringValue>, arg5==</StringValue>
                                 <ArrayVariable>arg5</ArrayVariable>
                                 <StringValue>, arg6==</StringValue>
                                 <ArrayVariable>arg6</ArrayVariable>
                                 <StringValue>, arg7==</StringValue>
                                 <ArrayVariable>arg7</ArrayVariable>
                                 <StringValue>, arg8==</StringValue>
                                 <ArrayVariable>arg8</ArrayVariable>
                                 <StringValue>

</StringValue>
                              </Arguments>
                           </Command>
                        </NodeBody>
                     </Node>
                     <Node NodeType="NodeList" epx="Sequence" LineNo="81" ColNo="12">
                        <NodeId>HandleAck</NodeId>
                        <StartCondition>
                           <EQInternal>
                              <NodeStateVariable>
                                 <NodeId>ReportParameters</NodeId>
                              </NodeStateVariable>
                              <NodeStateValue>FINISHED</NodeStateValue>
                           </EQInternal>
                        </StartCondition>
                        <InvariantCondition>
                           <NOT>
                              <AND>
                                 <EQInternal>
                                    <NodeOutcomeVariable>
                                       <NodeRef dir="child">OnCommand__3</NodeRef>
                                    </NodeOutcomeVariable>
                                    <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                 </EQInternal>
                                 <EQInternal>
                                    <NodeStateVariable>
                                       <NodeRef dir="child">OnCommand__3</NodeRef>
                                    </NodeStateVariable>
                                    <NodeStateValue>FINISHED</NodeStateValue>
                                 </EQInternal>
                              </AND>
                           </NOT>
                        </InvariantCondition>
                        <NodeBody>
                           <NodeList>
                              <Node NodeType="NodeList" epx="Sequence" LineNo="82" ColNo="12">
                                 <NodeId>OnCommand__3</NodeId>
                                 <VariableDeclarations>
                                    <DeclareVariable LineNo="81" ColNo="33">
                                       <Name>ack</Name>
                                       <Type>String</Type>
                                    </DeclareVariable>
                                    <DeclareVariable>
                                       <Name>ep2cp_hdl</Name>
                                       <Type>String</Type>
                                    </DeclareVariable>
                                 </VariableDeclarations>
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
                                                   <NodeRef dir="child">ep2cp_CmdGetParam_ack</NodeRef>
                                                </NodeOutcomeVariable>
                                                <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                             </EQInternal>
                                             <EQInternal>
                                                <NodeStateVariable>
                                                   <NodeRef dir="child">ep2cp_CmdGetParam_ack</NodeRef>
                                                </NodeStateVariable>
                                                <NodeStateValue>FINISHED</NodeStateValue>
                                             </EQInternal>
                                          </AND>
                                          <AND>
                                             <EQInternal>
                                                <NodeOutcomeVariable>
                                                   <NodeRef dir="child">ep2cp_CmdAction_ack_msg</NodeRef>
                                                </NodeOutcomeVariable>
                                                <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                             </EQInternal>
                                             <EQInternal>
                                                <NodeStateVariable>
                                                   <NodeRef dir="child">ep2cp_CmdAction_ack_msg</NodeRef>
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
                                                   <StringValue>ack_msg</StringValue>
                                                </Arguments>
                                             </Command>
                                          </NodeBody>
                                       </Node>
                                       <Node NodeType="Command">
                                          <NodeId>ep2cp_CmdGetParam_ack</NodeId>
                                          <StartCondition>
                                             <EQInternal>
                                                <NodeStateVariable>
                                                   <NodeRef dir="sibling">ep2cp_CmdWait</NodeRef>
                                                </NodeStateVariable>
                                                <NodeStateValue>FINISHED</NodeStateValue>
                                             </EQInternal>
                                          </StartCondition>
                                          <EndCondition>
                                             <IsKnown>
                                                <StringVariable>ack</StringVariable>
                                             </IsKnown>
                                          </EndCondition>
                                          <NodeBody>
                                             <Command>
                                                <StringVariable>ack</StringVariable>
                                                <Name>
                                                   <StringValue>GetParameter</StringValue>
                                                </Name>
                                                <Arguments>
                                                   <StringVariable>ep2cp_hdl</StringVariable>
                                                   <IntegerValue>0</IntegerValue>
                                                </Arguments>
                                             </Command>
                                          </NodeBody>
                                       </Node>
                                       <Node NodeType="NodeList">
                                          <NodeId>ep2cp_CmdAction_ack_msg</NodeId>
                                          <StartCondition>
                                             <EQInternal>
                                                <NodeStateVariable>
                                                   <NodeRef dir="sibling">ep2cp_CmdGetParam_ack</NodeRef>
                                                </NodeStateVariable>
                                                <NodeStateValue>FINISHED</NodeStateValue>
                                             </EQInternal>
                                          </StartCondition>
                                          <NodeBody>
                                             <NodeList>
                                                <Node NodeType="Command" LineNo="83" ColNo="16">
                                                   <NodeId>COMMAND__5</NodeId>
                                                   <NodeBody>
                                                      <Command>
                                                         <Name>
                                                            <StringValue>pprint</StringValue>
                                                         </Name>
                                                         <Arguments LineNo="84" ColNo="24">
                                                            <StringValue>
test_send: received ack

</StringValue>
                                                         </Arguments>
                                                      </Command>
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
                                                   <NodeRef dir="sibling">ep2cp_CmdAction_ack_msg</NodeRef>
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
                           </NodeList>
                        </NodeBody>
                     </Node>
                     <Node NodeType="NodeList" epx="UncheckedSequence" LineNo="88" ColNo="8">
                        <NodeId>HandleTimeout</NodeId>
                        <StartCondition>
                           <GT>
                              <LookupOnChange>
                                 <Name>
                                    <StringValue>time</StringValue>
                                 </Name>
                                 <Tolerance>
                                    <RealValue>1</RealValue>
                                 </Tolerance>
                              </LookupOnChange>
                              <ADD LineNo="90" ColNo="60">
                                 <RealVariable>run_start_time</RealVariable>
                                 <IntegerValue>4</IntegerValue>
                              </ADD>
                           </GT>
                        </StartCondition>
                        <SkipCondition>
                           <EQInternal>
                              <NodeStateVariable>
                                 <NodeId>HandleAck</NodeId>
                              </NodeStateVariable>
                              <NodeStateValue>FINISHED</NodeStateValue>
                           </EQInternal>
                        </SkipCondition>
                        <NodeBody>
                           <NodeList>
                              <Node NodeType="Command" LineNo="93" ColNo="16">
                                 <NodeId>ReportTimeout</NodeId>
                                 <NodeBody>
                                    <Command>
                                       <Name>
                                          <StringValue>pprint</StringValue>
                                       </Name>
                                       <Arguments LineNo="94" ColNo="24">
                                          <StringValue>
test_send: ack timed out

</StringValue>
                                       </Arguments>
                                    </Command>
                                 </NodeBody>
                              </Node>
                              <Node NodeType="NodeList" epx="Sequence" LineNo="98" ColNo="16">
                                 <NodeId>SignalTimeout</NodeId>
                                 <StartCondition>
                                    <EQInternal>
                                       <NodeStateVariable>
                                          <NodeRef dir="sibling">ReportTimeout</NodeRef>
                                       </NodeStateVariable>
                                       <NodeStateValue>FINISHED</NodeStateValue>
                                    </EQInternal>
                                 </StartCondition>
                                 <InvariantCondition>
                                    <NOT>
                                       <AND>
                                          <EQInternal>
                                             <NodeOutcomeVariable>
                                                <NodeRef dir="child">Assignment</NodeRef>
                                             </NodeOutcomeVariable>
                                             <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                          </EQInternal>
                                          <EQInternal>
                                             <NodeStateVariable>
                                                <NodeRef dir="child">Assignment</NodeRef>
                                             </NodeStateVariable>
                                             <NodeStateValue>FINISHED</NodeStateValue>
                                          </EQInternal>
                                       </AND>
                                    </NOT>
                                 </InvariantCondition>
                                 <NodeBody>
                                    <NodeList>
                                       <Node NodeType="Assignment" LineNo="98" ColNo="28">
                                          <NodeId>Assignment</NodeId>
                                          <NodeBody>
                                             <Assignment>
                                                <BooleanVariable>ackTimedOut</BooleanVariable>
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
                     <Node NodeType="Command" LineNo="103" ColNo="12">
                        <NodeId>SendCommand</NodeId>
                        <StartCondition>
                           <EQInternal>
                              <NodeStateVariable>
                                 <NodeId>HandleAck</NodeId>
                              </NodeStateVariable>
                              <NodeStateValue>EXECUTING</NodeStateValue>
                           </EQInternal>
                        </StartCondition>
                        <NodeBody>
                           <Command>
                              <Name>
                                 <StringValue>test_udp_msg</StringValue>
                              </Name>
                              <Arguments LineNo="104" ColNo="26">
                                 <StringVariable>arg1</StringVariable>
                                 <BooleanValue>true</BooleanValue>
                                 <IntegerVariable>arg3</IntegerVariable>
                                 <RealVariable>arg4</RealVariable>
                                 <ArrayVariable>arg5</ArrayVariable>
                                 <ArrayVariable>arg6</ArrayVariable>
                                 <ArrayVariable>arg7</ArrayVariable>
                                 <ArrayVariable>arg8</ArrayVariable>
                              </Arguments>
                           </Command>
                        </NodeBody>
                     </Node>
                  </NodeList>
               </NodeBody>
            </Node>
            <Node NodeType="NodeList" epx="Sequence" LineNo="109" ColNo="4">
               <NodeId>SendQuitCommand</NodeId>
               <StartCondition>
                  <AND>
                     <EQInternal>
                        <NodeStateVariable>
                           <NodeRef dir="sibling">SendUdpCommand2</NodeRef>
                        </NodeStateVariable>
                        <NodeStateValue>FINISHED</NodeStateValue>
                     </EQInternal>
                     <EQInternal>
                        <NodeStateVariable>
                           <NodeId>SendUdpCommand2</NodeId>
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
                                 <NodeRef dir="child">ReportSendQuit</NodeRef>
                              </NodeOutcomeVariable>
                              <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                           </EQInternal>
                           <EQInternal>
                              <NodeStateVariable>
                                 <NodeRef dir="child">ReportSendQuit</NodeRef>
                              </NodeStateVariable>
                              <NodeStateValue>FINISHED</NodeStateValue>
                           </EQInternal>
                        </AND>
                        <AND>
                           <EQInternal>
                              <NodeOutcomeVariable>
                                 <NodeRef dir="child">SendQuit</NodeRef>
                              </NodeOutcomeVariable>
                              <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                           </EQInternal>
                           <EQInternal>
                              <NodeStateVariable>
                                 <NodeRef dir="child">SendQuit</NodeRef>
                              </NodeStateVariable>
                              <NodeStateValue>FINISHED</NodeStateValue>
                           </EQInternal>
                        </AND>
                     </OR>
                  </NOT>
               </InvariantCondition>
               <NodeBody>
                  <NodeList>
                     <Node NodeType="Command" LineNo="113" ColNo="12">
                        <NodeId>ReportSendQuit</NodeId>
                        <NodeBody>
                           <Command>
                              <Name>
                                 <StringValue>pprint</StringValue>
                              </Name>
                              <Arguments LineNo="114" ColNo="20">
                                 <StringValue>
test_send: sending quit command

</StringValue>
                              </Arguments>
                           </Command>
                        </NodeBody>
                     </Node>
                     <Node NodeType="Command" LineNo="117" ColNo="12">
                        <NodeId>SendQuit</NodeId>
                        <StartCondition>
                           <EQInternal>
                              <NodeStateVariable>
                                 <NodeRef dir="sibling">ReportSendQuit</NodeRef>
                              </NodeStateVariable>
                              <NodeStateValue>FINISHED</NodeStateValue>
                           </EQInternal>
                        </StartCondition>
                        <NodeBody>
                           <Command>
                              <Name>
                                 <StringValue>quit_msg</StringValue>
                              </Name>
                              <Arguments LineNo="118" ColNo="22">
                                 <StringValue>quit</StringValue>
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
</PlexilPlan>