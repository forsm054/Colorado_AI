<?xml version="1.0" encoding="UTF-8"?>
<PlexilPlan xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
            xmlns:tr="extended-plexil-translator"
            FileName="test.ple">
   <GlobalDeclarations LineNo="2" ColNo="0">
      <CommandDeclaration LineNo="2" ColNo="0">
         <Name>pprint</Name>
      </CommandDeclaration>
      <CommandDeclaration LineNo="3" ColNo="8">
         <Name>Test</Name>
         <Return>
            <Name>_return_0</Name>
            <Type>Boolean</Type>
         </Return>
         <Parameter>
            <Name>x</Name>
            <Type>Real</Type>
         </Parameter>
         <Parameter>
            <Name>y</Name>
            <Type>Real</Type>
         </Parameter>
      </CommandDeclaration>
   </GlobalDeclarations>
   <Node NodeType="NodeList" epx="Sequence" LineNo="7" ColNo="1">
      <NodeId>Test</NodeId>
      <VariableDeclarations>
         <DeclareVariable LineNo="6" ColNo="1">
            <Name>TestSuccess</Name>
            <Type>Boolean</Type>
         </DeclareVariable>
         <DeclareVariable LineNo="7" ColNo="1">
            <Name>a</Name>
            <Type>Real</Type>
         </DeclareVariable>
         <DeclareVariable LineNo="8" ColNo="1">
            <Name>b</Name>
            <Type>Real</Type>
         </DeclareVariable>
      </VariableDeclarations>
      <InvariantCondition>
         <NOT>
            <OR>
               <AND>
                  <EQInternal>
                     <NodeOutcomeVariable>
                        <NodeRef dir="child">ASSIGNMENT__0</NodeRef>
                     </NodeOutcomeVariable>
                     <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                  </EQInternal>
                  <EQInternal>
                     <NodeStateVariable>
                        <NodeRef dir="child">ASSIGNMENT__0</NodeRef>
                     </NodeStateVariable>
                     <NodeStateValue>FINISHED</NodeStateValue>
                  </EQInternal>
               </AND>
               <AND>
                  <EQInternal>
                     <NodeOutcomeVariable>
                        <NodeRef dir="child">ASSIGNMENT__1</NodeRef>
                     </NodeOutcomeVariable>
                     <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                  </EQInternal>
                  <EQInternal>
                     <NodeStateVariable>
                        <NodeRef dir="child">ASSIGNMENT__1</NodeRef>
                     </NodeStateVariable>
                     <NodeStateValue>FINISHED</NodeStateValue>
                  </EQInternal>
               </AND>
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
                        <NodeRef dir="child">if__3</NodeRef>
                     </NodeOutcomeVariable>
                     <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                  </EQInternal>
                  <EQInternal>
                     <NodeStateVariable>
                        <NodeRef dir="child">if__3</NodeRef>
                     </NodeStateVariable>
                     <NodeStateValue>FINISHED</NodeStateValue>
                  </EQInternal>
               </AND>
            </OR>
         </NOT>
      </InvariantCondition>
      <NodeBody>
         <NodeList>
            <Node NodeType="Assignment" LineNo="11" ColNo="1">
               <NodeId>ASSIGNMENT__0</NodeId>
               <NodeBody>
                  <Assignment>
                     <RealVariable>a</RealVariable>
                     <NumericRHS>
                        <LookupNow>
                           <Name>
                              <StringValue>c</StringValue>
                           </Name>
                        </LookupNow>
                     </NumericRHS>
                  </Assignment>
               </NodeBody>
            </Node>
            <Node NodeType="Assignment" LineNo="12" ColNo="1">
               <NodeId>ASSIGNMENT__1</NodeId>
               <StartCondition>
                  <EQInternal>
                     <NodeStateVariable>
                        <NodeRef dir="sibling">ASSIGNMENT__0</NodeRef>
                     </NodeStateVariable>
                     <NodeStateValue>FINISHED</NodeStateValue>
                  </EQInternal>
               </StartCondition>
               <NodeBody>
                  <Assignment>
                     <RealVariable>b</RealVariable>
                     <NumericRHS>
                        <LookupNow>
                           <Name>
                              <StringValue>d</StringValue>
                           </Name>
                        </LookupNow>
                     </NumericRHS>
                  </Assignment>
               </NodeBody>
            </Node>
            <Node NodeType="NodeList" epx="SynchronousCommand" LineNo="14" ColNo="1">
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
                                          <StringValue>Test</StringValue>
                                       </Name>
                                       <Arguments LineNo="14" ColNo="39">
                                          <RealVariable>a</RealVariable>
                                          <RealVariable>b</RealVariable>
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
                                       <BooleanVariable>TestSuccess</BooleanVariable>
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
            <Node NodeType="NodeList" epx="If" LineNo="16" ColNo="1">
               <NodeId>if__3</NodeId>
               <StartCondition>
                  <EQInternal>
                     <NodeStateVariable>
                        <NodeRef dir="sibling">SynchronousCommand__2</NodeRef>
                     </NodeStateVariable>
                     <NodeStateValue>FINISHED</NodeStateValue>
                  </EQInternal>
               </StartCondition>
               <NodeBody>
                  <NodeList>
                     <Node NodeType="Empty" epx="Condition">
                        <NodeId>ep2cp_IfTest</NodeId>
                        <PostCondition>
                           <BooleanVariable>TestSuccess</BooleanVariable>
                        </PostCondition>
                     </Node>
                     <Node NodeType="NodeList" epx="Then" LineNo="18" ColNo="2">
                        <NodeId>BLOCK__4</NodeId>
                        <InvariantCondition>
                           <NOT>
                              <OR>
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
                                          <NodeRef dir="child">COMMAND__6</NodeRef>
                                       </NodeOutcomeVariable>
                                       <NodeOutcomeValue>FAILURE</NodeOutcomeValue>
                                    </EQInternal>
                                    <EQInternal>
                                       <NodeStateVariable>
                                          <NodeRef dir="child">COMMAND__6</NodeRef>
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
                              <Node NodeType="Command" LineNo="17" ColNo="2">
                                 <NodeId>COMMAND__5</NodeId>
                                 <NodeBody>
                                    <Command>
                                       <Name>
                                          <StringValue>pprint</StringValue>
                                       </Name>
                                       <Arguments LineNo="18" ColNo="9">
                                          <StringValue>Command Worked</StringValue>
                                       </Arguments>
                                    </Command>
                                 </NodeBody>
                              </Node>
                              <Node NodeType="Command" LineNo="18" ColNo="2">
                                 <NodeId>COMMAND__6</NodeId>
                                 <StartCondition>
                                    <EQInternal>
                                       <NodeStateVariable>
                                          <NodeRef dir="sibling">COMMAND__5</NodeRef>
                                       </NodeStateVariable>
                                       <NodeStateValue>FINISHED</NodeStateValue>
                                    </EQInternal>
                                 </StartCondition>
                                 <NodeBody>
                                    <Command>
                                       <Name>
                                          <StringValue>pprint</StringValue>
                                       </Name>
                                       <Arguments LineNo="19" ColNo="9">
                                          <RealVariable>a</RealVariable>
                                          <RealVariable>b</RealVariable>
                                       </Arguments>
                                    </Command>
                                 </NodeBody>
                              </Node>
                           </NodeList>
                        </NodeBody>
                     </Node>
                     <Node NodeType="Command" epx="Else" LineNo="22" ColNo="2">
                        <NodeId>COMMAND__8</NodeId>
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
                              <Arguments LineNo="23" ColNo="9">
                                 <StringValue>Command FAILED</StringValue>
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