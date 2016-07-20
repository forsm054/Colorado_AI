<?xml version="1.0" encoding="UTF-8"?>
<PlexilPlan xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
            xmlns:tr="extended-plexil-translator"
            FileName="test-recv.ple">
   <GlobalDeclarations LineNo="29" ColNo="0">
      <CommandDeclaration LineNo="29" ColNo="0">
         <Name>pprint</Name>
      </CommandDeclaration>
      <CommandDeclaration LineNo="30" ColNo="0">
         <Name>ack_msg</Name>
         <Parameter>
            <Type>String</Type>
         </Parameter>
      </CommandDeclaration>
      <CommandDeclaration LineNo="31" ColNo="0">
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
      <NodeId>test_recv</NodeId>
      <VariableDeclarations>
         <DeclareVariable LineNo="37" ColNo="4">
            <Name>run_start_time</Name>
            <Type>Real</Type>
         </DeclareVariable>
         <DeclareVariable LineNo="38" ColNo="4">
            <Name>timeout</Name>
            <Type>Integer</Type>
            <InitialValue>
               <IntegerValue>10</IntegerValue>
            </InitialValue>
         </DeclareVariable>
         <DeclareVariable LineNo="39" ColNo="4">
            <Name>continue</Name>
            <Type>Boolean</Type>
            <InitialValue>
               <BooleanValue>true</BooleanValue>
            </InitialValue>
         </DeclareVariable>
         <DeclareVariable LineNo="40" ColNo="4">
            <Name>send_ack</Name>
            <Type>Boolean</Type>
            <InitialValue>
               <BooleanValue>true</BooleanValue>
            </InitialValue>
         </DeclareVariable>
      </VariableDeclarations>
      <NodeBody>
         <NodeList>
            <Node NodeType="NodeList" epx="Sequence" LineNo="45" ColNo="8">
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
                     <Node NodeType="Assignment" LineNo="45" ColNo="20">
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
            <Node NodeType="NodeList" epx="Concurrence" LineNo="48" ColNo="4">
               <NodeId>WaitForTimeoutOrCommand</NodeId>
               <StartCondition>
                  <EQInternal>
                     <NodeStateVariable>
                        <NodeRef dir="sibling">RecordStartTime</NodeRef>
                     </NodeStateVariable>
                     <NodeStateValue>FINISHED</NodeStateValue>
                  </EQInternal>
               </StartCondition>
               <InvariantCondition>
                  <EQBoolean>
                     <BooleanVariable>continue</BooleanVariable>
                     <BooleanValue>true</BooleanValue>
                  </EQBoolean>
               </InvariantCondition>
               <NodeBody>
                  <NodeList>
                     <Node NodeType="NodeList" epx="Sequence" LineNo="52" ColNo="8">
                        <NodeId>HandleCommand</NodeId>
                        <RepeatCondition>
                           <BooleanVariable>continue</BooleanVariable>
                        </RepeatCondition>
                        <InvariantCondition>
                           <NOT>
                              <OR>
                                 <AND>
                                    <EQInternal>
                                       <NodeOutcomeVariable>
                                          <NodeRef dir="child">ReceiveCommand</NodeRef>
                                       </NodeOutcomeVariable>
                                       <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                    </EQInternal>
                                    <EQInternal>
                                       <NodeStateVariable>
                                          <NodeRef dir="child">ReceiveCommand</NodeRef>
                                       </NodeStateVariable>
                                       <NodeStateValue>FINISHED</NodeStateValue>
                                    </EQInternal>
                                 </AND>
                                 <AND>
                                    <EQInternal>
                                       <NodeOutcomeVariable>
                                          <NodeRef dir="child">SendCommandAck</NodeRef>
                                       </NodeOutcomeVariable>
                                       <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                    </EQInternal>
                                    <EQInternal>
                                       <NodeStateVariable>
                                          <NodeRef dir="child">SendCommandAck</NodeRef>
                                       </NodeStateVariable>
                                       <NodeStateValue>FINISHED</NodeStateValue>
                                    </EQInternal>
                                 </AND>
                              </OR>
                           </NOT>
                        </InvariantCondition>
                        <NodeBody>
                           <NodeList>
                              <Node NodeType="NodeList" epx="Sequence" LineNo="56" ColNo="12">
                                 <NodeId>ReceiveCommand</NodeId>
                                 <InvariantCondition>
                                    <NOT>
                                       <AND>
                                          <EQInternal>
                                             <NodeOutcomeVariable>
                                                <NodeRef dir="child">OnCommand__0</NodeRef>
                                             </NodeOutcomeVariable>
                                             <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                          </EQInternal>
                                          <EQInternal>
                                             <NodeStateVariable>
                                                <NodeRef dir="child">OnCommand__0</NodeRef>
                                             </NodeStateVariable>
                                             <NodeStateValue>FINISHED</NodeStateValue>
                                          </EQInternal>
                                       </AND>
                                    </NOT>
                                 </InvariantCondition>
                                 <NodeBody>
                                    <NodeList>
                                       <Node NodeType="NodeList" epx="Sequence" LineNo="58" ColNo="16">
                                          <NodeId>OnCommand__0</NodeId>
                                          <VariableDeclarations>
                                             <DeclareVariable LineNo="57" ColNo="42">
                                                <Name>arg1</Name>
                                                <Type>String</Type>
                                             </DeclareVariable>
                                             <DeclareVariable LineNo="57" ColNo="55">
                                                <Name>arg2</Name>
                                                <Type>Boolean</Type>
                                             </DeclareVariable>
                                             <DeclareVariable LineNo="57" ColNo="69">
                                                <Name>arg3</Name>
                                                <Type>Integer</Type>
                                             </DeclareVariable>
                                             <DeclareVariable LineNo="57" ColNo="83">
                                                <Name>arg4</Name>
                                                <Type>Real</Type>
                                             </DeclareVariable>
                                             <DeclareVariable LineNo="57" ColNo="94">
                                                <Name>arg5</Name>
                                                <Type>Integer</Type>
                                             </DeclareVariable>
                                             <DeclareVariable LineNo="57" ColNo="108">
                                                <Name>arg6</Name>
                                                <Type>Real</Type>
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
                                                            <NodeRef dir="child">ep2cp_CmdGetParam_arg1</NodeRef>
                                                         </NodeOutcomeVariable>
                                                         <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                      </EQInternal>
                                                      <EQInternal>
                                                         <NodeStateVariable>
                                                            <NodeRef dir="child">ep2cp_CmdGetParam_arg1</NodeRef>
                                                         </NodeStateVariable>
                                                         <NodeStateValue>FINISHED</NodeStateValue>
                                                      </EQInternal>
                                                   </AND>
                                                   <AND>
                                                      <EQInternal>
                                                         <NodeOutcomeVariable>
                                                            <NodeRef dir="child">ep2cp_CmdGetParam_arg2</NodeRef>
                                                         </NodeOutcomeVariable>
                                                         <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                      </EQInternal>
                                                      <EQInternal>
                                                         <NodeStateVariable>
                                                            <NodeRef dir="child">ep2cp_CmdGetParam_arg2</NodeRef>
                                                         </NodeStateVariable>
                                                         <NodeStateValue>FINISHED</NodeStateValue>
                                                      </EQInternal>
                                                   </AND>
                                                   <AND>
                                                      <EQInternal>
                                                         <NodeOutcomeVariable>
                                                            <NodeRef dir="child">ep2cp_CmdGetParam_arg3</NodeRef>
                                                         </NodeOutcomeVariable>
                                                         <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                      </EQInternal>
                                                      <EQInternal>
                                                         <NodeStateVariable>
                                                            <NodeRef dir="child">ep2cp_CmdGetParam_arg3</NodeRef>
                                                         </NodeStateVariable>
                                                         <NodeStateValue>FINISHED</NodeStateValue>
                                                      </EQInternal>
                                                   </AND>
                                                   <AND>
                                                      <EQInternal>
                                                         <NodeOutcomeVariable>
                                                            <NodeRef dir="child">ep2cp_CmdGetParam_arg4</NodeRef>
                                                         </NodeOutcomeVariable>
                                                         <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                      </EQInternal>
                                                      <EQInternal>
                                                         <NodeStateVariable>
                                                            <NodeRef dir="child">ep2cp_CmdGetParam_arg4</NodeRef>
                                                         </NodeStateVariable>
                                                         <NodeStateValue>FINISHED</NodeStateValue>
                                                      </EQInternal>
                                                   </AND>
                                                   <AND>
                                                      <EQInternal>
                                                         <NodeOutcomeVariable>
                                                            <NodeRef dir="child">ep2cp_CmdGetParam_arg5</NodeRef>
                                                         </NodeOutcomeVariable>
                                                         <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                      </EQInternal>
                                                      <EQInternal>
                                                         <NodeStateVariable>
                                                            <NodeRef dir="child">ep2cp_CmdGetParam_arg5</NodeRef>
                                                         </NodeStateVariable>
                                                         <NodeStateValue>FINISHED</NodeStateValue>
                                                      </EQInternal>
                                                   </AND>
                                                   <AND>
                                                      <EQInternal>
                                                         <NodeOutcomeVariable>
                                                            <NodeRef dir="child">ep2cp_CmdGetParam_arg6</NodeRef>
                                                         </NodeOutcomeVariable>
                                                         <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                      </EQInternal>
                                                      <EQInternal>
                                                         <NodeStateVariable>
                                                            <NodeRef dir="child">ep2cp_CmdGetParam_arg6</NodeRef>
                                                         </NodeStateVariable>
                                                         <NodeStateValue>FINISHED</NodeStateValue>
                                                      </EQInternal>
                                                   </AND>
                                                   <AND>
                                                      <EQInternal>
                                                         <NodeOutcomeVariable>
                                                            <NodeRef dir="child">ep2cp_CmdAction_test_udp_msg</NodeRef>
                                                         </NodeOutcomeVariable>
                                                         <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                      </EQInternal>
                                                      <EQInternal>
                                                         <NodeStateVariable>
                                                            <NodeRef dir="child">ep2cp_CmdAction_test_udp_msg</NodeRef>
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
                                                            <StringValue>test_udp_msg</StringValue>
                                                         </Arguments>
                                                      </Command>
                                                   </NodeBody>
                                                </Node>
                                                <Node NodeType="Command">
                                                   <NodeId>ep2cp_CmdGetParam_arg1</NodeId>
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
                                                         <StringVariable>arg1</StringVariable>
                                                      </IsKnown>
                                                   </EndCondition>
                                                   <NodeBody>
                                                      <Command>
                                                         <StringVariable>arg1</StringVariable>
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
                                                <Node NodeType="Command">
                                                   <NodeId>ep2cp_CmdGetParam_arg2</NodeId>
                                                   <StartCondition>
                                                      <EQInternal>
                                                         <NodeStateVariable>
                                                            <NodeRef dir="sibling">ep2cp_CmdGetParam_arg1</NodeRef>
                                                         </NodeStateVariable>
                                                         <NodeStateValue>FINISHED</NodeStateValue>
                                                      </EQInternal>
                                                   </StartCondition>
                                                   <EndCondition>
                                                      <IsKnown>
                                                         <BooleanVariable>arg2</BooleanVariable>
                                                      </IsKnown>
                                                   </EndCondition>
                                                   <NodeBody>
                                                      <Command>
                                                         <BooleanVariable>arg2</BooleanVariable>
                                                         <Name>
                                                            <StringValue>GetParameter</StringValue>
                                                         </Name>
                                                         <Arguments>
                                                            <StringVariable>ep2cp_hdl</StringVariable>
                                                            <IntegerValue>1</IntegerValue>
                                                         </Arguments>
                                                      </Command>
                                                   </NodeBody>
                                                </Node>
                                                <Node NodeType="Command">
                                                   <NodeId>ep2cp_CmdGetParam_arg3</NodeId>
                                                   <StartCondition>
                                                      <EQInternal>
                                                         <NodeStateVariable>
                                                            <NodeRef dir="sibling">ep2cp_CmdGetParam_arg2</NodeRef>
                                                         </NodeStateVariable>
                                                         <NodeStateValue>FINISHED</NodeStateValue>
                                                      </EQInternal>
                                                   </StartCondition>
                                                   <EndCondition>
                                                      <IsKnown>
                                                         <IntegerVariable>arg3</IntegerVariable>
                                                      </IsKnown>
                                                   </EndCondition>
                                                   <NodeBody>
                                                      <Command>
                                                         <IntegerVariable>arg3</IntegerVariable>
                                                         <Name>
                                                            <StringValue>GetParameter</StringValue>
                                                         </Name>
                                                         <Arguments>
                                                            <StringVariable>ep2cp_hdl</StringVariable>
                                                            <IntegerValue>2</IntegerValue>
                                                         </Arguments>
                                                      </Command>
                                                   </NodeBody>
                                                </Node>
                                                <Node NodeType="Command">
                                                   <NodeId>ep2cp_CmdGetParam_arg4</NodeId>
                                                   <StartCondition>
                                                      <EQInternal>
                                                         <NodeStateVariable>
                                                            <NodeRef dir="sibling">ep2cp_CmdGetParam_arg3</NodeRef>
                                                         </NodeStateVariable>
                                                         <NodeStateValue>FINISHED</NodeStateValue>
                                                      </EQInternal>
                                                   </StartCondition>
                                                   <EndCondition>
                                                      <IsKnown>
                                                         <RealVariable>arg4</RealVariable>
                                                      </IsKnown>
                                                   </EndCondition>
                                                   <NodeBody>
                                                      <Command>
                                                         <RealVariable>arg4</RealVariable>
                                                         <Name>
                                                            <StringValue>GetParameter</StringValue>
                                                         </Name>
                                                         <Arguments>
                                                            <StringVariable>ep2cp_hdl</StringVariable>
                                                            <IntegerValue>3</IntegerValue>
                                                         </Arguments>
                                                      </Command>
                                                   </NodeBody>
                                                </Node>
                                                <Node NodeType="Command">
                                                   <NodeId>ep2cp_CmdGetParam_arg5</NodeId>
                                                   <StartCondition>
                                                      <EQInternal>
                                                         <NodeStateVariable>
                                                            <NodeRef dir="sibling">ep2cp_CmdGetParam_arg4</NodeRef>
                                                         </NodeStateVariable>
                                                         <NodeStateValue>FINISHED</NodeStateValue>
                                                      </EQInternal>
                                                   </StartCondition>
                                                   <EndCondition>
                                                      <IsKnown>
                                                         <IntegerVariable>arg5</IntegerVariable>
                                                      </IsKnown>
                                                   </EndCondition>
                                                   <NodeBody>
                                                      <Command>
                                                         <IntegerVariable>arg5</IntegerVariable>
                                                         <Name>
                                                            <StringValue>GetParameter</StringValue>
                                                         </Name>
                                                         <Arguments>
                                                            <StringVariable>ep2cp_hdl</StringVariable>
                                                            <IntegerValue>4</IntegerValue>
                                                         </Arguments>
                                                      </Command>
                                                   </NodeBody>
                                                </Node>
                                                <Node NodeType="Command">
                                                   <NodeId>ep2cp_CmdGetParam_arg6</NodeId>
                                                   <StartCondition>
                                                      <EQInternal>
                                                         <NodeStateVariable>
                                                            <NodeRef dir="sibling">ep2cp_CmdGetParam_arg5</NodeRef>
                                                         </NodeStateVariable>
                                                         <NodeStateValue>FINISHED</NodeStateValue>
                                                      </EQInternal>
                                                   </StartCondition>
                                                   <EndCondition>
                                                      <IsKnown>
                                                         <RealVariable>arg6</RealVariable>
                                                      </IsKnown>
                                                   </EndCondition>
                                                   <NodeBody>
                                                      <Command>
                                                         <RealVariable>arg6</RealVariable>
                                                         <Name>
                                                            <StringValue>GetParameter</StringValue>
                                                         </Name>
                                                         <Arguments>
                                                            <StringVariable>ep2cp_hdl</StringVariable>
                                                            <IntegerValue>5</IntegerValue>
                                                         </Arguments>
                                                      </Command>
                                                   </NodeBody>
                                                </Node>
                                                <Node NodeType="NodeList">
                                                   <NodeId>ep2cp_CmdAction_test_udp_msg</NodeId>
                                                   <StartCondition>
                                                      <EQInternal>
                                                         <NodeStateVariable>
                                                            <NodeRef dir="sibling">ep2cp_CmdGetParam_arg6</NodeRef>
                                                         </NodeStateVariable>
                                                         <NodeStateValue>FINISHED</NodeStateValue>
                                                      </EQInternal>
                                                   </StartCondition>
                                                   <NodeBody>
                                                      <NodeList>
                                                         <Node NodeType="NodeList" epx="Sequence" LineNo="60" ColNo="20">
                                                            <NodeId>BLOCK__1</NodeId>
                                                            <InvariantCondition>
                                                               <NOT>
                                                                  <OR>
                                                                     <AND>
                                                                        <EQInternal>
                                                                           <NodeOutcomeVariable>
                                                                              <NodeRef dir="child">ReportCommand</NodeRef>
                                                                           </NodeOutcomeVariable>
                                                                           <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                                        </EQInternal>
                                                                        <EQInternal>
                                                                           <NodeStateVariable>
                                                                              <NodeRef dir="child">ReportCommand</NodeRef>
                                                                           </NodeStateVariable>
                                                                           <NodeStateValue>FINISHED</NodeStateValue>
                                                                        </EQInternal>
                                                                     </AND>
                                                                     <AND>
                                                                        <EQInternal>
                                                                           <NodeOutcomeVariable>
                                                                              <NodeRef dir="child">CheckForAckRequest</NodeRef>
                                                                           </NodeOutcomeVariable>
                                                                           <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                                        </EQInternal>
                                                                        <EQInternal>
                                                                           <NodeStateVariable>
                                                                              <NodeRef dir="child">CheckForAckRequest</NodeRef>
                                                                           </NodeStateVariable>
                                                                           <NodeStateValue>FINISHED</NodeStateValue>
                                                                        </EQInternal>
                                                                     </AND>
                                                                  </OR>
                                                               </NOT>
                                                            </InvariantCondition>
                                                            <NodeBody>
                                                               <NodeList>
                                                                  <Node NodeType="NodeList" epx="Sequence" LineNo="62" ColNo="22">
                                                                     <NodeId>ReportCommand</NodeId>
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
                                                                           </OR>
                                                                        </NOT>
                                                                     </InvariantCondition>
                                                                     <NodeBody>
                                                                        <NodeList>
                                                                           <Node NodeType="Command" LineNo="61" ColNo="22">
                                                                              <NodeId>COMMAND__2</NodeId>
                                                                              <NodeBody>
                                                                                 <Command>
                                                                                    <Name>
                                                                                       <StringValue>pprint</StringValue>
                                                                                    </Name>
                                                                                    <Arguments LineNo="62" ColNo="29">
                                                                                       <StringValue>!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!</StringValue>
                                                                                    </Arguments>
                                                                                 </Command>
                                                                              </NodeBody>
                                                                           </Node>
                                                                           <Node NodeType="Command" LineNo="62" ColNo="24">
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
                                                                                    <Arguments LineNo="63" ColNo="32">
                                                                                       <StringValue>
test_recv: received arg1==</StringValue>
                                                                                       <StringVariable>arg1</StringVariable>
                                                                                       <StringValue>, arg2==</StringValue>
                                                                                       <BooleanVariable>arg2</BooleanVariable>
                                                                                       <StringValue>, arg3==</StringValue>
                                                                                       <IntegerVariable>arg3</IntegerVariable>
                                                                                       <StringValue>, arg4==</StringValue>
                                                                                       <RealVariable>arg4</RealVariable>
                                                                                       <StringValue>, arg5==</StringValue>
                                                                                       <IntegerVariable>arg5</IntegerVariable>
                                                                                       <StringValue>, arg6==</StringValue>
                                                                                       <RealVariable>arg6</RealVariable>
                                                                                       <StringValue>, arg7==</StringValue>
                                                                                       <StringValue>, arg8==</StringValue>
                                                                                       <StringValue>

</StringValue>
                                                                                    </Arguments>
                                                                                 </Command>
                                                                              </NodeBody>
                                                                           </Node>
                                                                        </NodeList>
                                                                     </NodeBody>
                                                                  </Node>
                                                                  <Node NodeType="NodeList" epx="Sequence" LineNo="68" ColNo="24">
                                                                     <NodeId>CheckForAckRequest</NodeId>
                                                                     <StartCondition>
                                                                        <EQInternal>
                                                                           <NodeStateVariable>
                                                                              <NodeRef dir="sibling">ReportCommand</NodeRef>
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
                                                                           </OR>
                                                                        </NOT>
                                                                     </InvariantCondition>
                                                                     <NodeBody>
                                                                        <NodeList>
                                                                           <Node NodeType="Assignment" LineNo="68" ColNo="36">
                                                                              <NodeId>Assignment</NodeId>
                                                                              <NodeBody>
                                                                                 <Assignment>
                                                                                    <BooleanVariable>send_ack</BooleanVariable>
                                                                                    <BooleanRHS>
                                                                                       <BooleanVariable>arg2</BooleanVariable>
                                                                                    </BooleanRHS>
                                                                                 </Assignment>
                                                                              </NodeBody>
                                                                           </Node>
                                                                           <Node NodeType="Command" LineNo="68" ColNo="24">
                                                                              <NodeId>COMMAND__4</NodeId>
                                                                              <StartCondition>
                                                                                 <EQInternal>
                                                                                    <NodeStateVariable>
                                                                                       <NodeRef dir="sibling">Assignment</NodeRef>
                                                                                    </NodeStateVariable>
                                                                                    <NodeStateValue>FINISHED</NodeStateValue>
                                                                                 </EQInternal>
                                                                              </StartCondition>
                                                                              <NodeBody>
                                                                                 <Command>
                                                                                    <Name>
                                                                                       <StringValue>pprint</StringValue>
                                                                                    </Name>
                                                                                    <Arguments LineNo="69" ColNo="31">
                                                                                       <BooleanVariable>send_ack</BooleanVariable>
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
                                                <Node NodeType="Command">
                                                   <NodeId>ep2cp_CmdReturn</NodeId>
                                                   <StartCondition>
                                                      <EQInternal>
                                                         <NodeStateVariable>
                                                            <NodeRef dir="sibling">ep2cp_CmdAction_test_udp_msg</NodeRef>
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
                              <Node NodeType="NodeList" epx="Sequence" LineNo="74" ColNo="12">
                                 <NodeId>SendCommandAck</NodeId>
                                 <StartCondition>
                                    <EQInternal>
                                       <NodeStateVariable>
                                          <NodeRef dir="sibling">ReceiveCommand</NodeRef>
                                       </NodeStateVariable>
                                       <NodeStateValue>FINISHED</NodeStateValue>
                                    </EQInternal>
                                 </StartCondition>
                                 <SkipCondition>
                                    <AND>
                                       <EQInternal>
                                          <NodeStateVariable>
                                             <NodeRef dir="sibling">ReceiveCommand</NodeRef>
                                          </NodeStateVariable>
                                          <NodeStateValue>FINISHED</NodeStateValue>
                                       </EQInternal>
                                       <NEBoolean>
                                          <BooleanVariable>send_ack</BooleanVariable>
                                          <BooleanValue>true</BooleanValue>
                                       </NEBoolean>
                                    </AND>
                                 </SkipCondition>
                                 <InvariantCondition>
                                    <NOT>
                                       <OR>
                                          <AND>
                                             <EQInternal>
                                                <NodeOutcomeVariable>
                                                   <NodeRef dir="child">ReportSendingAck</NodeRef>
                                                </NodeOutcomeVariable>
                                                <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                             </EQInternal>
                                             <EQInternal>
                                                <NodeStateVariable>
                                                   <NodeRef dir="child">ReportSendingAck</NodeRef>
                                                </NodeStateVariable>
                                                <NodeStateValue>FINISHED</NodeStateValue>
                                             </EQInternal>
                                          </AND>
                                          <AND>
                                             <EQInternal>
                                                <NodeOutcomeVariable>
                                                   <NodeRef dir="child">SendAck</NodeRef>
                                                </NodeOutcomeVariable>
                                                <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                             </EQInternal>
                                             <EQInternal>
                                                <NodeStateVariable>
                                                   <NodeRef dir="child">SendAck</NodeRef>
                                                </NodeStateVariable>
                                                <NodeStateValue>FINISHED</NodeStateValue>
                                             </EQInternal>
                                          </AND>
                                       </OR>
                                    </NOT>
                                 </InvariantCondition>
                                 <NodeBody>
                                    <NodeList>
                                       <Node NodeType="Command" LineNo="79" ColNo="20">
                                          <NodeId>ReportSendingAck</NodeId>
                                          <NodeBody>
                                             <Command>
                                                <Name>
                                                   <StringValue>pprint</StringValue>
                                                </Name>
                                                <Arguments LineNo="80" ColNo="28">
                                                   <StringValue>
test_recv: sending ack

</StringValue>
                                                </Arguments>
                                             </Command>
                                          </NodeBody>
                                       </Node>
                                       <Node NodeType="Command" LineNo="83" ColNo="20">
                                          <NodeId>SendAck</NodeId>
                                          <StartCondition>
                                             <EQInternal>
                                                <NodeStateVariable>
                                                   <NodeRef dir="sibling">ReportSendingAck</NodeRef>
                                                </NodeStateVariable>
                                                <NodeStateValue>FINISHED</NodeStateValue>
                                             </EQInternal>
                                          </StartCondition>
                                          <NodeBody>
                                             <Command>
                                                <Name>
                                                   <StringValue>ack_msg</StringValue>
                                                </Name>
                                                <Arguments LineNo="84" ColNo="29">
                                                   <StringValue>ack</StringValue>
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
                     <Node NodeType="NodeList" epx="UncheckedSequence" LineNo="89" ColNo="8">
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
                              <ADD LineNo="91" ColNo="60">
                                 <RealVariable>run_start_time</RealVariable>
                                 <IntegerVariable>timeout</IntegerVariable>
                              </ADD>
                           </GT>
                        </StartCondition>
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
test_recv: timed out after </StringValue>
                                          <IntegerVariable>timeout</IntegerVariable>
                                          <StringValue> seconds

</StringValue>
                                       </Arguments>
                                    </Command>
                                 </NodeBody>
                              </Node>
                              <Node NodeType="Assignment" LineNo="99" ColNo="16">
                                 <NodeId>SignalTimeout</NodeId>
                                 <Priority>1</Priority>
                                 <StartCondition>
                                    <EQInternal>
                                       <NodeStateVariable>
                                          <NodeRef dir="sibling">ReportTimeout</NodeRef>
                                       </NodeStateVariable>
                                       <NodeStateValue>FINISHED</NodeStateValue>
                                    </EQInternal>
                                 </StartCondition>
                                 <NodeBody>
                                    <Assignment>
                                       <BooleanVariable>continue</BooleanVariable>
                                       <BooleanRHS>
                                          <BooleanValue>false</BooleanValue>
                                       </BooleanRHS>
                                    </Assignment>
                                 </NodeBody>
                              </Node>
                           </NodeList>
                        </NodeBody>
                     </Node>
                     <Node NodeType="NodeList" epx="UncheckedSequence" LineNo="103" ColNo="8">
                        <NodeId>HandleQuitMessage</NodeId>
                        <NodeBody>
                           <NodeList>
                              <Node NodeType="NodeList" epx="Sequence" LineNo="105" ColNo="12">
                                 <NodeId>OnCommand__9</NodeId>
                                 <VariableDeclarations>
                                    <DeclareVariable LineNo="104" ColNo="34">
                                       <Name>junk</Name>
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
                                                   <NodeRef dir="child">ep2cp_CmdGetParam_junk</NodeRef>
                                                </NodeOutcomeVariable>
                                                <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                             </EQInternal>
                                             <EQInternal>
                                                <NodeStateVariable>
                                                   <NodeRef dir="child">ep2cp_CmdGetParam_junk</NodeRef>
                                                </NodeStateVariable>
                                                <NodeStateValue>FINISHED</NodeStateValue>
                                             </EQInternal>
                                          </AND>
                                          <AND>
                                             <EQInternal>
                                                <NodeOutcomeVariable>
                                                   <NodeRef dir="child">ep2cp_CmdAction_quit_msg</NodeRef>
                                                </NodeOutcomeVariable>
                                                <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                             </EQInternal>
                                             <EQInternal>
                                                <NodeStateVariable>
                                                   <NodeRef dir="child">ep2cp_CmdAction_quit_msg</NodeRef>
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
                                                   <StringValue>quit_msg</StringValue>
                                                </Arguments>
                                             </Command>
                                          </NodeBody>
                                       </Node>
                                       <Node NodeType="Command">
                                          <NodeId>ep2cp_CmdGetParam_junk</NodeId>
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
                                                <StringVariable>junk</StringVariable>
                                             </IsKnown>
                                          </EndCondition>
                                          <NodeBody>
                                             <Command>
                                                <StringVariable>junk</StringVariable>
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
                                          <NodeId>ep2cp_CmdAction_quit_msg</NodeId>
                                          <StartCondition>
                                             <EQInternal>
                                                <NodeStateVariable>
                                                   <NodeRef dir="sibling">ep2cp_CmdGetParam_junk</NodeRef>
                                                </NodeStateVariable>
                                                <NodeStateValue>FINISHED</NodeStateValue>
                                             </EQInternal>
                                          </StartCondition>
                                          <NodeBody>
                                             <NodeList>
                                                <Node NodeType="NodeList" epx="Sequence" LineNo="107" ColNo="16">
                                                   <NodeId>BLOCK__10</NodeId>
                                                   <InvariantCondition>
                                                      <NOT>
                                                         <OR>
                                                            <AND>
                                                               <EQInternal>
                                                                  <NodeOutcomeVariable>
                                                                     <NodeRef dir="child">ReportQuitReceived</NodeRef>
                                                                  </NodeOutcomeVariable>
                                                                  <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                               </EQInternal>
                                                               <EQInternal>
                                                                  <NodeStateVariable>
                                                                     <NodeRef dir="child">ReportQuitReceived</NodeRef>
                                                                  </NodeStateVariable>
                                                                  <NodeStateValue>FINISHED</NodeStateValue>
                                                               </EQInternal>
                                                            </AND>
                                                            <AND>
                                                               <EQInternal>
                                                                  <NodeOutcomeVariable>
                                                                     <NodeRef dir="child">SignalQuit</NodeRef>
                                                                  </NodeOutcomeVariable>
                                                                  <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                                               </EQInternal>
                                                               <EQInternal>
                                                                  <NodeStateVariable>
                                                                     <NodeRef dir="child">SignalQuit</NodeRef>
                                                                  </NodeStateVariable>
                                                                  <NodeStateValue>FINISHED</NodeStateValue>
                                                               </EQInternal>
                                                            </AND>
                                                         </OR>
                                                      </NOT>
                                                   </InvariantCondition>
                                                   <NodeBody>
                                                      <NodeList>
                                                         <Node NodeType="Command" LineNo="108" ColNo="20">
                                                            <NodeId>ReportQuitReceived</NodeId>
                                                            <NodeBody>
                                                               <Command>
                                                                  <Name>
                                                                     <StringValue>pprint</StringValue>
                                                                  </Name>
                                                                  <Arguments LineNo="109" ColNo="28">
                                                                     <StringValue>
test_recv: received quit command

</StringValue>
                                                                  </Arguments>
                                                               </Command>
                                                            </NodeBody>
                                                         </Node>
                                                         <Node NodeType="Assignment" LineNo="114" ColNo="20">
                                                            <NodeId>SignalQuit</NodeId>
                                                            <Priority>0</Priority>
                                                            <StartCondition>
                                                               <EQInternal>
                                                                  <NodeStateVariable>
                                                                     <NodeRef dir="sibling">ReportQuitReceived</NodeRef>
                                                                  </NodeStateVariable>
                                                                  <NodeStateValue>FINISHED</NodeStateValue>
                                                               </EQInternal>
                                                            </StartCondition>
                                                            <NodeBody>
                                                               <Assignment>
                                                                  <BooleanVariable>continue</BooleanVariable>
                                                                  <BooleanRHS>
                                                                     <BooleanValue>false</BooleanValue>
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
                                       <Node NodeType="Command">
                                          <NodeId>ep2cp_CmdReturn</NodeId>
                                          <StartCondition>
                                             <EQInternal>
                                                <NodeStateVariable>
                                                   <NodeRef dir="sibling">ep2cp_CmdAction_quit_msg</NodeRef>
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
                  </NodeList>
               </NodeBody>
            </Node>
         </NodeList>
      </NodeBody>
   </Node>
</PlexilPlan>