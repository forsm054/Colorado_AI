<?xml version="1.0" encoding="UTF-8"?>
<!-- Generated by PlexiLisp --><PlexilPlan xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
            xmlns:tr="extended-plexil-translator">
   <Node NodeType="Assignment">
      <NodeId>Root</NodeId>
      <VariableDeclarations>
         <DeclareVariable>
            <Name>x</Name>
            <Type>Integer</Type>
         </DeclareVariable>
      </VariableDeclarations>
      <StartCondition>
         <IsKnown>
            <LookupNow>
               <Name>
                  <StringValue>foo</StringValue>
               </Name>
            </LookupNow>
         </IsKnown>
      </StartCondition>
      <NodeBody>
         <Assignment>
            <IntegerVariable>x</IntegerVariable>
            <NumericRHS>
               <LookupOnChange>
                  <Name>
                     <StringValue>foo</StringValue>
                  </Name>
               </LookupOnChange>
            </NumericRHS>
         </Assignment>
      </NodeBody>
   </Node>
</PlexilPlan>