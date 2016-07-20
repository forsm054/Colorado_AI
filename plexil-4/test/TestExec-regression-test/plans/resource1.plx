<?xml version="1.0" encoding="UTF-8"?>
<PlexilPlan>
  <GlobalDeclarations>
    <CommandDeclaration>
      <Name>pickup_object</Name>
      <Return>
        <Type>Integer</Type>
      </Return>
      <Parameter>
        <Type>Integer</Type>
      </Parameter>
    </CommandDeclaration>
    <CommandDeclaration>
      <Name>process_image</Name>
      <Return>
        <Type>Integer</Type>
      </Return>
    </CommandDeclaration>
    <CommandDeclaration>
      <Name>take_picture</Name>
      <Return>
        <Type>Integer</Type>
      </Return>
    </CommandDeclaration>
  </GlobalDeclarations>
  <Node NodeType="NodeList">
    <NodeId>SimpleTask</NodeId>
    <NodeBody>
      <NodeList>
        <Node NodeType="Command">
          <NodeId>PickupObject</NodeId>
          <EndCondition>
            <EQNumeric>
              <IntegerValue>10</IntegerValue>
              <IntegerVariable>returnValue</IntegerVariable>
            </EQNumeric>
          </EndCondition>
          <PostCondition>
            <EQInternal>
              <NodeCommandHandleVariable>
                <NodeId>PickupObject</NodeId>
              </NodeCommandHandleVariable>
              <NodeCommandHandleValue>COMMAND_SENT_TO_SYSTEM</NodeCommandHandleValue>
            </EQInternal>
          </PostCondition>
          <VariableDeclarations>
            <DeclareVariable>
              <Name>returnValue</Name>
              <Type>Integer</Type>
              <InitialValue>
                <IntegerValue>-1</IntegerValue>
              </InitialValue>
            </DeclareVariable>
            <DeclareVariable>
              <Name>priority10</Name>
              <Type>Integer</Type>
              <InitialValue>
                <IntegerValue>10</IntegerValue>
              </InitialValue>
            </DeclareVariable>
          </VariableDeclarations>
          <NodeBody>
            <Command>
              <ResourceList>
                <Resource>
                  <ResourceName>
                    <StringValue>right_arm</StringValue>
                  </ResourceName>
                  <ResourcePriority>
                    <IntegerVariable>priority10</IntegerVariable>
                  </ResourcePriority>
                </Resource>
                <Resource>
                  <ResourceName>
                    <StringValue>sys_memory</StringValue>
                  </ResourceName>
                  <ResourcePriority>
                    <IntegerVariable>priority10</IntegerVariable>
                  </ResourcePriority>
                  <ResourceLowerBound>
                    <RealValue>1.0</RealValue>
                  </ResourceLowerBound>
                  <ResourceUpperBound>
                    <RealValue>1.0</RealValue>
                  </ResourceUpperBound>
                </Resource>
              </ResourceList>
              <IntegerVariable>returnValue</IntegerVariable>
              <Name><StringValue>pickup_object</StringValue></Name>
              <Arguments>
                <IntegerValue>20</IntegerValue>
              </Arguments>
            </Command>
          </NodeBody>
        </Node>
        <Node NodeType="Command">
          <NodeId>ProcessImage</NodeId>
          <VariableDeclarations>
            <DeclareVariable>
              <Name>priority30</Name>
              <Type>Integer</Type>
              <InitialValue>
                <IntegerValue>30</IntegerValue>
              </InitialValue>
            </DeclareVariable>
          </VariableDeclarations>
          <PostCondition>
            <EQInternal>
              <NodeCommandHandleVariable>
                <NodeId>ProcessImage</NodeId>
              </NodeCommandHandleVariable>
              <NodeCommandHandleValue>COMMAND_SENT_TO_SYSTEM</NodeCommandHandleValue>
            </EQInternal>
          </PostCondition>
          <NodeBody>
            <Command>
              <ResourceList>
                <Resource>
                  <ResourceName>
                    <StringValue>sys_memory</StringValue>
                  </ResourceName>
                  <ResourcePriority>
                    <IntegerVariable>priority30</IntegerVariable>
                  </ResourcePriority>
                  <ResourceLowerBound>
                    <RealValue>1.0</RealValue>
                  </ResourceLowerBound>
                  <ResourceUpperBound>
                    <RealValue>1.0</RealValue>
                  </ResourceUpperBound>
                </Resource>
              </ResourceList>
              <Name><StringValue>process_image</StringValue></Name>
            </Command>
          </NodeBody>
        </Node>
        <Node NodeType="Command">
          <NodeId>TakePicture</NodeId>
          <PostCondition>
            <EQInternal>
              <NodeCommandHandleVariable>
                <NodeId>TakePicture</NodeId>
              </NodeCommandHandleVariable>
              <NodeCommandHandleValue>COMMAND_SENT_TO_SYSTEM</NodeCommandHandleValue>
            </EQInternal>
          </PostCondition>
          <VariableDeclarations>
            <DeclareVariable>
              <Name>v_priority</Name>
              <Type>Integer</Type>
              <InitialValue>
                <IntegerValue>10</IntegerValue>
              </InitialValue>
            </DeclareVariable>
          </VariableDeclarations>
          <NodeBody>
            <Command>
              <ResourceList>
                <Resource>
                  <ResourceName>
                    <StringValue>vision_system</StringValue>
                  </ResourceName>
                  <ResourcePriority>
                    <IntegerVariable>v_priority</IntegerVariable>
                  </ResourcePriority>
                </Resource>
              </ResourceList>
              <Name><StringValue>take_picture</StringValue></Name>
            </Command>
          </NodeBody>
        </Node>
      </NodeList>
    </NodeBody>
  </Node>
</PlexilPlan>