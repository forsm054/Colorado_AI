// $ANTLR 3.5.2 antlr/PlexilTreeTransforms.g 2016-05-09 09:53:05

package plexil;

import plexil.*;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;


@SuppressWarnings("all")
public class PlexilTreeTransforms extends TreeRewriter {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ABS_KYWD", "ACTION", "ALIAS", 
		"ALIASES", "AND_KYWD", "ANY_KYWD", "ARGUMENT_LIST", "ARRAY_LITERAL", "ARRAY_MAX_SIZE_KYWD", 
		"ARRAY_REF", "ARRAY_SIZE_KYWD", "ARRAY_TYPE", "ARRAY_VARIABLE_DECLARATION", 
		"ASSIGNMENT", "ASTERISK", "BAR", "BLOCK", "BOOLEAN_KYWD", "CEIL_KYWD", 
		"CHILD_KYWD", "COLON", "COMMA", "COMMAND", "COMMAND_ACCEPTED_KYWD", "COMMAND_DENIED_KYWD", 
		"COMMAND_FAILED_KYWD", "COMMAND_HANDLE_KYWD", "COMMAND_KYWD", "COMMAND_RCVD_KYWD", 
		"COMMAND_SENT_KYWD", "COMMAND_SUCCESS_KYWD", "COMMENT_KYWD", "CONCAT", 
		"CONCURRENCE_KYWD", "DATE_KYWD", "DATE_LITERAL", "DEQUALS", "DOUBLE", 
		"DURATION_KYWD", "DURATION_LITERAL", "Digit", "ELLIPSIS", "ELSEIF_KYWD", 
		"ELSE_KYWD", "ENDIF_KYWD", "END_CONDITION_KYWD", "END_KYWD", "EQUALS", 
		"EXECUTING_STATE_KYWD", "EXITED_KYWD", "EXIT_CONDITION_KYWD", "Escape", 
		"Exponent", "FAILING_STATE_KYWD", "FAILURE_KYWD", "FAILURE_OUTCOME_KYWD", 
		"FALSE_KYWD", "FINISHED_STATE_KYWD", "FINISHING_STATE_KYWD", "FLOOR_KYWD", 
		"FOR_KYWD", "GEQ", "GLOBAL_DECLARATIONS", "GREATER", "HASHPAREN", "HexDigit", 
		"IF_KYWD", "INACTIVE_STATE_KYWD", "INT", "INTEGER_KYWD", "INTERRUPTED_OUTCOME_KYWD", 
		"INT_OR_DOUBLE", "INVARIANT_CONDITION_FAILED_KYWD", "INVARIANT_CONDITION_KYWD", 
		"IN_KYWD", "IN_OUT_KYWD", "IS_KNOWN_KYWD", "ITERATION_ENDED_STATE_KYWD", 
		"LBRACE", "LBRACKET", "LEQ", "LESS", "LIBRARY_ACTION_KYWD", "LIBRARY_CALL_KYWD", 
		"LOOKUP_KYWD", "LOOKUP_NOW_KYWD", "LOOKUP_ON_CHANGE_KYWD", "LOWER_BOUND_KYWD", 
		"LPAREN", "Letter", "MAX_KYWD", "MESSAGE_RECEIVED_KYWD", "MINUS", "MIN_KYWD", 
		"ML_COMMENT", "MOD_KYWD", "NAME_KYWD", "NCNAME", "NEG_DOUBLE", "NEG_INT", 
		"NEQUALS", "NODE_EXECUTING_KYWD", "NODE_FAILED_KYWD", "NODE_FINISHED_KYWD", 
		"NODE_ID", "NODE_INACTIVE_KYWD", "NODE_INVARIANT_FAILED_KYWD", "NODE_ITERATION_ENDED_KYWD", 
		"NODE_ITERATION_FAILED_KYWD", "NODE_ITERATION_SUCCEEDED_KYWD", "NODE_PARENT_FAILED_KYWD", 
		"NODE_POSTCONDITION_FAILED_KYWD", "NODE_PRECONDITION_FAILED_KYWD", "NODE_SKIPPED_KYWD", 
		"NODE_SUCCEEDED_KYWD", "NODE_TIMEPOINT_VALUE", "NODE_WAITING_KYWD", "NOT_KYWD", 
		"ON_COMMAND_KYWD", "ON_MESSAGE_KYWD", "OR_KYWD", "OUTCOME_KYWD", "OctalDigit", 
		"OctalEscape", "PARAMETERS", "PARENT_EXITED_KYWD", "PARENT_FAILED_KYWD", 
		"PARENT_KYWD", "PERCENT", "PERIOD", "PLEXIL", "PLUS", "POST_CONDITION_FAILED_KYWD", 
		"POST_CONDITION_KYWD", "PRE_CONDITION_FAILED_KYWD", "PRE_CONDITION_KYWD", 
		"PRIORITY_KYWD", "QuadDigit", "RBRACE", "RBRACKET", "REAL_KYWD", "REAL_TO_INT_KYWD", 
		"RELEASE_AT_TERM_KYWD", "REPEAT_CONDITION_KYWD", "REQUEST_KYWD", "RESOURCE_KYWD", 
		"RETURNS_KYWD", "ROUND_KYWD", "RPAREN", "SELF_KYWD", "SEMICOLON", "SEQUENCE", 
		"SEQUENCE_KYWD", "SIBLING_KYWD", "SKIPPED_OUTCOME_KYWD", "SKIP_CONDITION_KYWD", 
		"SLASH", "SL_COMMENT", "SQRT_KYWD", "START_CONDITION_KYWD", "START_KYWD", 
		"STATE_KYWD", "STATE_NAME", "STRING", "STRING_COMPARISON", "STRING_KYWD", 
		"STRLEN_KYWD", "SUCCESS_OUTCOME_KYWD", "SYNCHRONOUS_COMMAND_KYWD", "TIMEOUT_KYWD", 
		"TRUE_KYWD", "TRUNC_KYWD", "TRY_KYWD", "UNCHECKED_SEQUENCE_KYWD", "UPDATE_KYWD", 
		"UPPER_BOUND_KYWD", "UnicodeEscape", "VARIABLE_DECLARATION", "VARIABLE_DECLARATIONS", 
		"WAITING_STATE_KYWD", "WAIT_KYWD", "WHILE_KYWD", "WS", "XOR_KYWD"
	};
	public static final int EOF=-1;
	public static final int ABS_KYWD=4;
	public static final int ACTION=5;
	public static final int ALIAS=6;
	public static final int ALIASES=7;
	public static final int AND_KYWD=8;
	public static final int ANY_KYWD=9;
	public static final int ARGUMENT_LIST=10;
	public static final int ARRAY_LITERAL=11;
	public static final int ARRAY_MAX_SIZE_KYWD=12;
	public static final int ARRAY_REF=13;
	public static final int ARRAY_SIZE_KYWD=14;
	public static final int ARRAY_TYPE=15;
	public static final int ARRAY_VARIABLE_DECLARATION=16;
	public static final int ASSIGNMENT=17;
	public static final int ASTERISK=18;
	public static final int BAR=19;
	public static final int BLOCK=20;
	public static final int BOOLEAN_KYWD=21;
	public static final int CEIL_KYWD=22;
	public static final int CHILD_KYWD=23;
	public static final int COLON=24;
	public static final int COMMA=25;
	public static final int COMMAND=26;
	public static final int COMMAND_ACCEPTED_KYWD=27;
	public static final int COMMAND_DENIED_KYWD=28;
	public static final int COMMAND_FAILED_KYWD=29;
	public static final int COMMAND_HANDLE_KYWD=30;
	public static final int COMMAND_KYWD=31;
	public static final int COMMAND_RCVD_KYWD=32;
	public static final int COMMAND_SENT_KYWD=33;
	public static final int COMMAND_SUCCESS_KYWD=34;
	public static final int COMMENT_KYWD=35;
	public static final int CONCAT=36;
	public static final int CONCURRENCE_KYWD=37;
	public static final int DATE_KYWD=38;
	public static final int DATE_LITERAL=39;
	public static final int DEQUALS=40;
	public static final int DOUBLE=41;
	public static final int DURATION_KYWD=42;
	public static final int DURATION_LITERAL=43;
	public static final int Digit=44;
	public static final int ELLIPSIS=45;
	public static final int ELSEIF_KYWD=46;
	public static final int ELSE_KYWD=47;
	public static final int ENDIF_KYWD=48;
	public static final int END_CONDITION_KYWD=49;
	public static final int END_KYWD=50;
	public static final int EQUALS=51;
	public static final int EXECUTING_STATE_KYWD=52;
	public static final int EXITED_KYWD=53;
	public static final int EXIT_CONDITION_KYWD=54;
	public static final int Escape=55;
	public static final int Exponent=56;
	public static final int FAILING_STATE_KYWD=57;
	public static final int FAILURE_KYWD=58;
	public static final int FAILURE_OUTCOME_KYWD=59;
	public static final int FALSE_KYWD=60;
	public static final int FINISHED_STATE_KYWD=61;
	public static final int FINISHING_STATE_KYWD=62;
	public static final int FLOOR_KYWD=63;
	public static final int FOR_KYWD=64;
	public static final int GEQ=65;
	public static final int GLOBAL_DECLARATIONS=66;
	public static final int GREATER=67;
	public static final int HASHPAREN=68;
	public static final int HexDigit=69;
	public static final int IF_KYWD=70;
	public static final int INACTIVE_STATE_KYWD=71;
	public static final int INT=72;
	public static final int INTEGER_KYWD=73;
	public static final int INTERRUPTED_OUTCOME_KYWD=74;
	public static final int INT_OR_DOUBLE=75;
	public static final int INVARIANT_CONDITION_FAILED_KYWD=76;
	public static final int INVARIANT_CONDITION_KYWD=77;
	public static final int IN_KYWD=78;
	public static final int IN_OUT_KYWD=79;
	public static final int IS_KNOWN_KYWD=80;
	public static final int ITERATION_ENDED_STATE_KYWD=81;
	public static final int LBRACE=82;
	public static final int LBRACKET=83;
	public static final int LEQ=84;
	public static final int LESS=85;
	public static final int LIBRARY_ACTION_KYWD=86;
	public static final int LIBRARY_CALL_KYWD=87;
	public static final int LOOKUP_KYWD=88;
	public static final int LOOKUP_NOW_KYWD=89;
	public static final int LOOKUP_ON_CHANGE_KYWD=90;
	public static final int LOWER_BOUND_KYWD=91;
	public static final int LPAREN=92;
	public static final int Letter=93;
	public static final int MAX_KYWD=94;
	public static final int MESSAGE_RECEIVED_KYWD=95;
	public static final int MINUS=96;
	public static final int MIN_KYWD=97;
	public static final int ML_COMMENT=98;
	public static final int MOD_KYWD=99;
	public static final int NAME_KYWD=100;
	public static final int NCNAME=101;
	public static final int NEG_DOUBLE=102;
	public static final int NEG_INT=103;
	public static final int NEQUALS=104;
	public static final int NODE_EXECUTING_KYWD=105;
	public static final int NODE_FAILED_KYWD=106;
	public static final int NODE_FINISHED_KYWD=107;
	public static final int NODE_ID=108;
	public static final int NODE_INACTIVE_KYWD=109;
	public static final int NODE_INVARIANT_FAILED_KYWD=110;
	public static final int NODE_ITERATION_ENDED_KYWD=111;
	public static final int NODE_ITERATION_FAILED_KYWD=112;
	public static final int NODE_ITERATION_SUCCEEDED_KYWD=113;
	public static final int NODE_PARENT_FAILED_KYWD=114;
	public static final int NODE_POSTCONDITION_FAILED_KYWD=115;
	public static final int NODE_PRECONDITION_FAILED_KYWD=116;
	public static final int NODE_SKIPPED_KYWD=117;
	public static final int NODE_SUCCEEDED_KYWD=118;
	public static final int NODE_TIMEPOINT_VALUE=119;
	public static final int NODE_WAITING_KYWD=120;
	public static final int NOT_KYWD=121;
	public static final int ON_COMMAND_KYWD=122;
	public static final int ON_MESSAGE_KYWD=123;
	public static final int OR_KYWD=124;
	public static final int OUTCOME_KYWD=125;
	public static final int OctalDigit=126;
	public static final int OctalEscape=127;
	public static final int PARAMETERS=128;
	public static final int PARENT_EXITED_KYWD=129;
	public static final int PARENT_FAILED_KYWD=130;
	public static final int PARENT_KYWD=131;
	public static final int PERCENT=132;
	public static final int PERIOD=133;
	public static final int PLEXIL=134;
	public static final int PLUS=135;
	public static final int POST_CONDITION_FAILED_KYWD=136;
	public static final int POST_CONDITION_KYWD=137;
	public static final int PRE_CONDITION_FAILED_KYWD=138;
	public static final int PRE_CONDITION_KYWD=139;
	public static final int PRIORITY_KYWD=140;
	public static final int QuadDigit=141;
	public static final int RBRACE=142;
	public static final int RBRACKET=143;
	public static final int REAL_KYWD=144;
	public static final int REAL_TO_INT_KYWD=145;
	public static final int RELEASE_AT_TERM_KYWD=146;
	public static final int REPEAT_CONDITION_KYWD=147;
	public static final int REQUEST_KYWD=148;
	public static final int RESOURCE_KYWD=149;
	public static final int RETURNS_KYWD=150;
	public static final int ROUND_KYWD=151;
	public static final int RPAREN=152;
	public static final int SELF_KYWD=153;
	public static final int SEMICOLON=154;
	public static final int SEQUENCE=155;
	public static final int SEQUENCE_KYWD=156;
	public static final int SIBLING_KYWD=157;
	public static final int SKIPPED_OUTCOME_KYWD=158;
	public static final int SKIP_CONDITION_KYWD=159;
	public static final int SLASH=160;
	public static final int SL_COMMENT=161;
	public static final int SQRT_KYWD=162;
	public static final int START_CONDITION_KYWD=163;
	public static final int START_KYWD=164;
	public static final int STATE_KYWD=165;
	public static final int STATE_NAME=166;
	public static final int STRING=167;
	public static final int STRING_COMPARISON=168;
	public static final int STRING_KYWD=169;
	public static final int STRLEN_KYWD=170;
	public static final int SUCCESS_OUTCOME_KYWD=171;
	public static final int SYNCHRONOUS_COMMAND_KYWD=172;
	public static final int TIMEOUT_KYWD=173;
	public static final int TRUE_KYWD=174;
	public static final int TRUNC_KYWD=175;
	public static final int TRY_KYWD=176;
	public static final int UNCHECKED_SEQUENCE_KYWD=177;
	public static final int UPDATE_KYWD=178;
	public static final int UPPER_BOUND_KYWD=179;
	public static final int UnicodeEscape=180;
	public static final int VARIABLE_DECLARATION=181;
	public static final int VARIABLE_DECLARATIONS=182;
	public static final int WAITING_STATE_KYWD=183;
	public static final int WAIT_KYWD=184;
	public static final int WHILE_KYWD=185;
	public static final int WS=186;
	public static final int XOR_KYWD=187;

	// delegates
	public TreeRewriter[] getDelegates() {
		return new TreeRewriter[] {};
	}

	// delegators


	public PlexilTreeTransforms(TreeNodeStream input) {
		this(input, new RecognizerSharedState());
	}
	public PlexilTreeTransforms(TreeNodeStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return PlexilTreeTransforms.tokenNames; }
	@Override public String getGrammarFileName() { return "antlr/PlexilTreeTransforms.g"; }


	    GlobalContext m_globalContext = GlobalContext.getGlobalContext();
	    NodeContext m_context = m_globalContext;
	    Stack<String> m_paraphrases = new Stack<String>();

		// Overrides to enhance error reporting
		public String getErrorMessage(RecognitionException e,
			   		  				  String[] tokenNames)
		{
		  String msg = super.getErrorMessage(e, tokenNames);
		  if (m_paraphrases.size() > 0) {
			 msg = msg + " " + m_paraphrases.peek();
		  }
	      return msg;
		}

		public void displayRecognitionError(String[] tokenNames,
											RecognitionException e)
		{
		  CompilerState.getCompilerState().addDiagnostic((PlexilTreeNode) e.node,
														 getErrorHeader(e) + " " + getErrorMessage(e, tokenNames),
														 Severity.ERROR);
		}


	public static class topdown_return extends TreeRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "topdown"
	// antlr/PlexilTreeTransforms.g:79:1: topdown : enterContext ;
	@Override
	public final PlexilTreeTransforms.topdown_return topdown() throws RecognitionException {
		PlexilTreeTransforms.topdown_return retval = new PlexilTreeTransforms.topdown_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		PlexilTreeNode _first_0 = null;
		PlexilTreeNode _last = null;


		TreeRuleReturnScope enterContext1 =null;


		try {
			// antlr/PlexilTreeTransforms.g:79:8: ( enterContext )
			// antlr/PlexilTreeTransforms.g:80:9: enterContext
			{
			_last = (PlexilTreeNode)input.LT(1);
			pushFollow(FOLLOW_enterContext_in_topdown142);
			enterContext1=enterContext();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==1 ) 
			 
			if ( _first_0==null ) _first_0 = (PlexilTreeNode)enterContext1.getTree();

			if ( state.backtracking==1 ) {
			retval.tree = _first_0;
			if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
				retval.tree = (PlexilTreeNode)adaptor.getParent(retval.tree);
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "topdown"


	public static class bottomup_return extends TreeRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "bottomup"
	// antlr/PlexilTreeTransforms.g:82:1: bottomup : ( exitContext | leftAssociativeReduction | rightAssociativeReduction | identityElision | booleanEqualityReduction | trivialReduction | flattenTrivialBlocks | flattenTrivialConcurrences );
	@Override
	public final PlexilTreeTransforms.bottomup_return bottomup() throws RecognitionException {
		PlexilTreeTransforms.bottomup_return retval = new PlexilTreeTransforms.bottomup_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		PlexilTreeNode _first_0 = null;
		PlexilTreeNode _last = null;


		TreeRuleReturnScope exitContext2 =null;
		TreeRuleReturnScope leftAssociativeReduction3 =null;
		TreeRuleReturnScope rightAssociativeReduction4 =null;
		TreeRuleReturnScope identityElision5 =null;
		TreeRuleReturnScope booleanEqualityReduction6 =null;
		TreeRuleReturnScope trivialReduction7 =null;
		TreeRuleReturnScope flattenTrivialBlocks8 =null;
		TreeRuleReturnScope flattenTrivialConcurrences9 =null;


		try {
			// antlr/PlexilTreeTransforms.g:82:9: ( exitContext | leftAssociativeReduction | rightAssociativeReduction | identityElision | booleanEqualityReduction | trivialReduction | flattenTrivialBlocks | flattenTrivialConcurrences )
			int alt1=8;
			alt1 = dfa1.predict(input);
			switch (alt1) {
				case 1 :
					// antlr/PlexilTreeTransforms.g:83:9: exitContext
					{
					_last = (PlexilTreeNode)input.LT(1);
					pushFollow(FOLLOW_exitContext_in_bottomup158);
					exitContext2=exitContext();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==1 ) 
					 
					if ( _first_0==null ) _first_0 = (PlexilTreeNode)exitContext2.getTree();

					if ( state.backtracking==1 ) {
					retval.tree = _first_0;
					if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
						retval.tree = (PlexilTreeNode)adaptor.getParent(retval.tree);
					}

					}
					break;
				case 2 :
					// antlr/PlexilTreeTransforms.g:84:9: leftAssociativeReduction
					{
					_last = (PlexilTreeNode)input.LT(1);
					pushFollow(FOLLOW_leftAssociativeReduction_in_bottomup168);
					leftAssociativeReduction3=leftAssociativeReduction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==1 ) 
					 
					if ( _first_0==null ) _first_0 = (PlexilTreeNode)leftAssociativeReduction3.getTree();

					if ( state.backtracking==1 ) {
					retval.tree = _first_0;
					if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
						retval.tree = (PlexilTreeNode)adaptor.getParent(retval.tree);
					}

					}
					break;
				case 3 :
					// antlr/PlexilTreeTransforms.g:85:9: rightAssociativeReduction
					{
					_last = (PlexilTreeNode)input.LT(1);
					pushFollow(FOLLOW_rightAssociativeReduction_in_bottomup178);
					rightAssociativeReduction4=rightAssociativeReduction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==1 ) 
					 
					if ( _first_0==null ) _first_0 = (PlexilTreeNode)rightAssociativeReduction4.getTree();

					if ( state.backtracking==1 ) {
					retval.tree = _first_0;
					if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
						retval.tree = (PlexilTreeNode)adaptor.getParent(retval.tree);
					}

					}
					break;
				case 4 :
					// antlr/PlexilTreeTransforms.g:86:9: identityElision
					{
					_last = (PlexilTreeNode)input.LT(1);
					pushFollow(FOLLOW_identityElision_in_bottomup188);
					identityElision5=identityElision();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==1 ) 
					 
					if ( _first_0==null ) _first_0 = (PlexilTreeNode)identityElision5.getTree();

					if ( state.backtracking==1 ) {
					retval.tree = _first_0;
					if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
						retval.tree = (PlexilTreeNode)adaptor.getParent(retval.tree);
					}

					}
					break;
				case 5 :
					// antlr/PlexilTreeTransforms.g:87:9: booleanEqualityReduction
					{
					_last = (PlexilTreeNode)input.LT(1);
					pushFollow(FOLLOW_booleanEqualityReduction_in_bottomup198);
					booleanEqualityReduction6=booleanEqualityReduction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==1 ) 
					 
					if ( _first_0==null ) _first_0 = (PlexilTreeNode)booleanEqualityReduction6.getTree();

					if ( state.backtracking==1 ) {
					retval.tree = _first_0;
					if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
						retval.tree = (PlexilTreeNode)adaptor.getParent(retval.tree);
					}

					}
					break;
				case 6 :
					// antlr/PlexilTreeTransforms.g:88:9: trivialReduction
					{
					_last = (PlexilTreeNode)input.LT(1);
					pushFollow(FOLLOW_trivialReduction_in_bottomup208);
					trivialReduction7=trivialReduction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==1 ) 
					 
					if ( _first_0==null ) _first_0 = (PlexilTreeNode)trivialReduction7.getTree();

					if ( state.backtracking==1 ) {
					retval.tree = _first_0;
					if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
						retval.tree = (PlexilTreeNode)adaptor.getParent(retval.tree);
					}

					}
					break;
				case 7 :
					// antlr/PlexilTreeTransforms.g:89:9: flattenTrivialBlocks
					{
					_last = (PlexilTreeNode)input.LT(1);
					pushFollow(FOLLOW_flattenTrivialBlocks_in_bottomup222);
					flattenTrivialBlocks8=flattenTrivialBlocks();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==1 ) 
					 
					if ( _first_0==null ) _first_0 = (PlexilTreeNode)flattenTrivialBlocks8.getTree();

					if ( state.backtracking==1 ) {
					retval.tree = _first_0;
					if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
						retval.tree = (PlexilTreeNode)adaptor.getParent(retval.tree);
					}

					}
					break;
				case 8 :
					// antlr/PlexilTreeTransforms.g:90:9: flattenTrivialConcurrences
					{
					_last = (PlexilTreeNode)input.LT(1);
					pushFollow(FOLLOW_flattenTrivialConcurrences_in_bottomup232);
					flattenTrivialConcurrences9=flattenTrivialConcurrences();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==1 ) 
					 
					if ( _first_0==null ) _first_0 = (PlexilTreeNode)flattenTrivialConcurrences9.getTree();

					if ( state.backtracking==1 ) {
					retval.tree = _first_0;
					if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
						retval.tree = (PlexilTreeNode)adaptor.getParent(retval.tree);
					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "bottomup"


	public static class enterContext_return extends TreeRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "enterContext"
	// antlr/PlexilTreeTransforms.g:97:1: enterContext : bindingContextNode ;
	public final PlexilTreeTransforms.enterContext_return enterContext() throws RecognitionException {
		PlexilTreeTransforms.enterContext_return retval = new PlexilTreeTransforms.enterContext_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		PlexilTreeNode _first_0 = null;
		PlexilTreeNode _last = null;


		TreeRuleReturnScope bindingContextNode10 =null;


		try {
			// antlr/PlexilTreeTransforms.g:97:13: ( bindingContextNode )
			// antlr/PlexilTreeTransforms.g:98:9: bindingContextNode
			{
			_last = (PlexilTreeNode)input.LT(1);
			pushFollow(FOLLOW_bindingContextNode_in_enterContext256);
			bindingContextNode10=bindingContextNode();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==1 ) 
			 
			if ( _first_0==null ) _first_0 = (PlexilTreeNode)bindingContextNode10.getTree();

			if ( state.backtracking==1 ) {
			            m_context = (bindingContextNode10!=null?((PlexilTreeNode)bindingContextNode10.start):null).getContext();
			            // System.out.println("Enter context " + m_context.getNodeName()); // DEBUG
			        }
			if ( state.backtracking==1 ) {
			retval.tree = _first_0;
			if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
				retval.tree = (PlexilTreeNode)adaptor.getParent(retval.tree);
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "enterContext"


	public static class exitContext_return extends TreeRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "exitContext"
	// antlr/PlexilTreeTransforms.g:108:1: exitContext : bindingContextNode ;
	public final PlexilTreeTransforms.exitContext_return exitContext() throws RecognitionException {
		PlexilTreeTransforms.exitContext_return retval = new PlexilTreeTransforms.exitContext_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		PlexilTreeNode _first_0 = null;
		PlexilTreeNode _last = null;


		TreeRuleReturnScope bindingContextNode11 =null;


		try {
			// antlr/PlexilTreeTransforms.g:108:12: ( bindingContextNode )
			// antlr/PlexilTreeTransforms.g:109:9: bindingContextNode
			{
			_last = (PlexilTreeNode)input.LT(1);
			pushFollow(FOLLOW_bindingContextNode_in_exitContext286);
			bindingContextNode11=bindingContextNode();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==1 ) 
			 
			if ( _first_0==null ) _first_0 = (PlexilTreeNode)bindingContextNode11.getTree();

			if ( state.backtracking==1 ) {
			            // System.out.println("Exit context " + m_context.getNodeName()); // DEBUG
			            m_context = m_context.getParentContext();
			            // System.out.println("Restore context " + m_context.getNodeName()); // DEBUG
			        }
			if ( state.backtracking==1 ) {
			retval.tree = _first_0;
			if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
				retval.tree = (PlexilTreeNode)adaptor.getParent(retval.tree);
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "exitContext"


	public static class leftAssociativeReduction_return extends TreeRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "leftAssociativeReduction"
	// antlr/PlexilTreeTransforms.g:122:1: leftAssociativeReduction : ( ^( AND_KYWD ^( AND_KYWD (args+= . )+ ) args+= . ) -> ^( AND_KYWD ( $args)+ ) | ^( OR_KYWD ^( OR_KYWD (args+= . )+ ) args+= . ) -> ^( OR_KYWD ( $args)+ ) | ^( PLUS ^( PLUS (args+= . )+ ) args+= . ) -> ^( PLUS ( $args)+ ) | ^( MINUS ^( MINUS args+= . (args+= . )+ ) args+= . ) -> ^( MINUS ( $args)+ ) | ^( ASTERISK ^( ASTERISK (args+= . )+ ) args+= . ) -> ^( ASTERISK ( $args)+ ) | ^( SLASH ^( SLASH args+= . (args+= . )+ ) args+= . ) -> ^( ASTERISK ( $args)+ ) | ^( MAX_KYWD ^( MAX_KYWD (args+= . )+ ) args+= . ) -> ^( MAX_KYWD ( $args)+ ) | ^( MIN_KYWD ^( MIN_KYWD (args+= . )+ ) args+= . ) -> ^( MIN_KYWD ( $args)+ ) );
	public final PlexilTreeTransforms.leftAssociativeReduction_return leftAssociativeReduction() throws RecognitionException {
		PlexilTreeTransforms.leftAssociativeReduction_return retval = new PlexilTreeTransforms.leftAssociativeReduction_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		PlexilTreeNode _first_0 = null;
		PlexilTreeNode _last = null;


		PlexilTreeNode AND_KYWD12=null;
		PlexilTreeNode AND_KYWD13=null;
		PlexilTreeNode OR_KYWD14=null;
		PlexilTreeNode OR_KYWD15=null;
		PlexilTreeNode PLUS16=null;
		PlexilTreeNode PLUS17=null;
		PlexilTreeNode MINUS18=null;
		PlexilTreeNode MINUS19=null;
		PlexilTreeNode ASTERISK20=null;
		PlexilTreeNode ASTERISK21=null;
		PlexilTreeNode SLASH22=null;
		PlexilTreeNode SLASH23=null;
		PlexilTreeNode MAX_KYWD24=null;
		PlexilTreeNode MAX_KYWD25=null;
		PlexilTreeNode MIN_KYWD26=null;
		PlexilTreeNode MIN_KYWD27=null;
		PlexilTreeNode args=null;
		List<Object> list_args=null;

		PlexilTreeNode AND_KYWD12_tree=null;
		PlexilTreeNode AND_KYWD13_tree=null;
		PlexilTreeNode OR_KYWD14_tree=null;
		PlexilTreeNode OR_KYWD15_tree=null;
		PlexilTreeNode PLUS16_tree=null;
		PlexilTreeNode PLUS17_tree=null;
		PlexilTreeNode MINUS18_tree=null;
		PlexilTreeNode MINUS19_tree=null;
		PlexilTreeNode ASTERISK20_tree=null;
		PlexilTreeNode ASTERISK21_tree=null;
		PlexilTreeNode SLASH22_tree=null;
		PlexilTreeNode SLASH23_tree=null;
		PlexilTreeNode MAX_KYWD24_tree=null;
		PlexilTreeNode MAX_KYWD25_tree=null;
		PlexilTreeNode MIN_KYWD26_tree=null;
		PlexilTreeNode MIN_KYWD27_tree=null;
		PlexilTreeNode args_tree=null;
		RewriteRuleNodeStream stream_OR_KYWD=new RewriteRuleNodeStream(adaptor,"token OR_KYWD");
		RewriteRuleNodeStream stream_MIN_KYWD=new RewriteRuleNodeStream(adaptor,"token MIN_KYWD");
		RewriteRuleNodeStream stream_SLASH=new RewriteRuleNodeStream(adaptor,"token SLASH");
		RewriteRuleNodeStream stream_AND_KYWD=new RewriteRuleNodeStream(adaptor,"token AND_KYWD");
		RewriteRuleNodeStream stream_ASTERISK=new RewriteRuleNodeStream(adaptor,"token ASTERISK");
		RewriteRuleNodeStream stream_MAX_KYWD=new RewriteRuleNodeStream(adaptor,"token MAX_KYWD");
		RewriteRuleNodeStream stream_PLUS=new RewriteRuleNodeStream(adaptor,"token PLUS");
		RewriteRuleNodeStream stream_MINUS=new RewriteRuleNodeStream(adaptor,"token MINUS");

		try {
			// antlr/PlexilTreeTransforms.g:122:25: ( ^( AND_KYWD ^( AND_KYWD (args+= . )+ ) args+= . ) -> ^( AND_KYWD ( $args)+ ) | ^( OR_KYWD ^( OR_KYWD (args+= . )+ ) args+= . ) -> ^( OR_KYWD ( $args)+ ) | ^( PLUS ^( PLUS (args+= . )+ ) args+= . ) -> ^( PLUS ( $args)+ ) | ^( MINUS ^( MINUS args+= . (args+= . )+ ) args+= . ) -> ^( MINUS ( $args)+ ) | ^( ASTERISK ^( ASTERISK (args+= . )+ ) args+= . ) -> ^( ASTERISK ( $args)+ ) | ^( SLASH ^( SLASH args+= . (args+= . )+ ) args+= . ) -> ^( ASTERISK ( $args)+ ) | ^( MAX_KYWD ^( MAX_KYWD (args+= . )+ ) args+= . ) -> ^( MAX_KYWD ( $args)+ ) | ^( MIN_KYWD ^( MIN_KYWD (args+= . )+ ) args+= . ) -> ^( MIN_KYWD ( $args)+ ) )
			int alt10=8;
			switch ( input.LA(1) ) {
			case AND_KYWD:
				{
				alt10=1;
				}
				break;
			case OR_KYWD:
				{
				alt10=2;
				}
				break;
			case PLUS:
				{
				alt10=3;
				}
				break;
			case MINUS:
				{
				alt10=4;
				}
				break;
			case ASTERISK:
				{
				alt10=5;
				}
				break;
			case SLASH:
				{
				alt10=6;
				}
				break;
			case MAX_KYWD:
				{
				alt10=7;
				}
				break;
			case MIN_KYWD:
				{
				alt10=8;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}
			switch (alt10) {
				case 1 :
					// antlr/PlexilTreeTransforms.g:123:9: ^( AND_KYWD ^( AND_KYWD (args+= . )+ ) args+= . )
					{
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_1 = _last;
					PlexilTreeNode _first_1 = null;
					_last = (PlexilTreeNode)input.LT(1);
					AND_KYWD12=(PlexilTreeNode)match(input,AND_KYWD,FOLLOW_AND_KYWD_in_leftAssociativeReduction319); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_AND_KYWD.add(AND_KYWD12);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = AND_KYWD12;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_2 = _last;
					PlexilTreeNode _first_2 = null;
					_last = (PlexilTreeNode)input.LT(1);
					AND_KYWD13=(PlexilTreeNode)match(input,AND_KYWD,FOLLOW_AND_KYWD_in_leftAssociativeReduction322); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_AND_KYWD.add(AND_KYWD13);

					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = AND_KYWD13;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					// antlr/PlexilTreeTransforms.g:123:31: (args+= . )+
					int cnt2=0;
					loop2:
					while (true) {
						int alt2=2;
						int LA2_0 = input.LA(1);
						if ( ((LA2_0 >= ABS_KYWD && LA2_0 <= XOR_KYWD)) ) {
							alt2=1;
						}

						switch (alt2) {
						case 1 :
							// antlr/PlexilTreeTransforms.g:123:32: args+= .
							{
							_last = (PlexilTreeNode)input.LT(1);
							args=(PlexilTreeNode)input.LT(1);
							matchAny(input); if (state.failed) return retval;
							 
							if ( state.backtracking==1 )
							if ( _first_2==null ) _first_2 = args;

							if (list_args==null) list_args=new ArrayList<Object>();
							list_args.add(args);
							if ( state.backtracking==1 ) {
							retval.tree = _first_0;
							if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
								retval.tree = (PlexilTreeNode)adaptor.getParent(retval.tree);
							}

							}
							break;

						default :
							if ( cnt2 >= 1 ) break loop2;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(2, input);
							throw eee;
						}
						cnt2++;
					}

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_2;
					}


					_last = (PlexilTreeNode)input.LT(1);
					args=(PlexilTreeNode)input.LT(1);
					matchAny(input); if (state.failed) return retval;
					 
					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = args;

					if (list_args==null) list_args=new ArrayList<Object>();
					list_args.add(args);
					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: args, AND_KYWD
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: args
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"wildcard args",list_args);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 123:52: -> ^( AND_KYWD ( $args)+ )
					{
						// antlr/PlexilTreeTransforms.g:123:55: ^( AND_KYWD ( $args)+ )
						{
						PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
						root_1 = (PlexilTreeNode)adaptor.becomeRoot(
						stream_AND_KYWD.nextNode()
						, root_1);
						if ( !(stream_args.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_args.hasNext() ) {
							adaptor.addChild(root_1, stream_args.nextTree());
						}
						stream_args.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 2 :
					// antlr/PlexilTreeTransforms.g:124:9: ^( OR_KYWD ^( OR_KYWD (args+= . )+ ) args+= . )
					{
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_1 = _last;
					PlexilTreeNode _first_1 = null;
					_last = (PlexilTreeNode)input.LT(1);
					OR_KYWD14=(PlexilTreeNode)match(input,OR_KYWD,FOLLOW_OR_KYWD_in_leftAssociativeReduction356); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_OR_KYWD.add(OR_KYWD14);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = OR_KYWD14;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_2 = _last;
					PlexilTreeNode _first_2 = null;
					_last = (PlexilTreeNode)input.LT(1);
					OR_KYWD15=(PlexilTreeNode)match(input,OR_KYWD,FOLLOW_OR_KYWD_in_leftAssociativeReduction359); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_OR_KYWD.add(OR_KYWD15);

					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = OR_KYWD15;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					// antlr/PlexilTreeTransforms.g:124:29: (args+= . )+
					int cnt3=0;
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( ((LA3_0 >= ABS_KYWD && LA3_0 <= XOR_KYWD)) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// antlr/PlexilTreeTransforms.g:124:30: args+= .
							{
							_last = (PlexilTreeNode)input.LT(1);
							args=(PlexilTreeNode)input.LT(1);
							matchAny(input); if (state.failed) return retval;
							 
							if ( state.backtracking==1 )
							if ( _first_2==null ) _first_2 = args;

							if (list_args==null) list_args=new ArrayList<Object>();
							list_args.add(args);
							if ( state.backtracking==1 ) {
							retval.tree = _first_0;
							if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
								retval.tree = (PlexilTreeNode)adaptor.getParent(retval.tree);
							}

							}
							break;

						default :
							if ( cnt3 >= 1 ) break loop3;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(3, input);
							throw eee;
						}
						cnt3++;
					}

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_2;
					}


					_last = (PlexilTreeNode)input.LT(1);
					args=(PlexilTreeNode)input.LT(1);
					matchAny(input); if (state.failed) return retval;
					 
					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = args;

					if (list_args==null) list_args=new ArrayList<Object>();
					list_args.add(args);
					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: args, OR_KYWD
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: args
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"wildcard args",list_args);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 124:52: -> ^( OR_KYWD ( $args)+ )
					{
						// antlr/PlexilTreeTransforms.g:124:55: ^( OR_KYWD ( $args)+ )
						{
						PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
						root_1 = (PlexilTreeNode)adaptor.becomeRoot(
						stream_OR_KYWD.nextNode()
						, root_1);
						if ( !(stream_args.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_args.hasNext() ) {
							adaptor.addChild(root_1, stream_args.nextTree());
						}
						stream_args.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 3 :
					// antlr/PlexilTreeTransforms.g:125:9: ^( PLUS ^( PLUS (args+= . )+ ) args+= . )
					{
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_1 = _last;
					PlexilTreeNode _first_1 = null;
					_last = (PlexilTreeNode)input.LT(1);
					PLUS16=(PlexilTreeNode)match(input,PLUS,FOLLOW_PLUS_in_leftAssociativeReduction395); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_PLUS.add(PLUS16);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = PLUS16;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_2 = _last;
					PlexilTreeNode _first_2 = null;
					_last = (PlexilTreeNode)input.LT(1);
					PLUS17=(PlexilTreeNode)match(input,PLUS,FOLLOW_PLUS_in_leftAssociativeReduction398); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_PLUS.add(PLUS17);

					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = PLUS17;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					// antlr/PlexilTreeTransforms.g:125:23: (args+= . )+
					int cnt4=0;
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( ((LA4_0 >= ABS_KYWD && LA4_0 <= XOR_KYWD)) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// antlr/PlexilTreeTransforms.g:125:24: args+= .
							{
							_last = (PlexilTreeNode)input.LT(1);
							args=(PlexilTreeNode)input.LT(1);
							matchAny(input); if (state.failed) return retval;
							 
							if ( state.backtracking==1 )
							if ( _first_2==null ) _first_2 = args;

							if (list_args==null) list_args=new ArrayList<Object>();
							list_args.add(args);
							if ( state.backtracking==1 ) {
							retval.tree = _first_0;
							if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
								retval.tree = (PlexilTreeNode)adaptor.getParent(retval.tree);
							}

							}
							break;

						default :
							if ( cnt4 >= 1 ) break loop4;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(4, input);
							throw eee;
						}
						cnt4++;
					}

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_2;
					}


					_last = (PlexilTreeNode)input.LT(1);
					args=(PlexilTreeNode)input.LT(1);
					matchAny(input); if (state.failed) return retval;
					 
					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = args;

					if (list_args==null) list_args=new ArrayList<Object>();
					list_args.add(args);
					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: PLUS, args
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: args
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"wildcard args",list_args);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 125:52: -> ^( PLUS ( $args)+ )
					{
						// antlr/PlexilTreeTransforms.g:125:55: ^( PLUS ( $args)+ )
						{
						PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
						root_1 = (PlexilTreeNode)adaptor.becomeRoot(
						stream_PLUS.nextNode()
						, root_1);
						if ( !(stream_args.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_args.hasNext() ) {
							adaptor.addChild(root_1, stream_args.nextTree());
						}
						stream_args.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 4 :
					// antlr/PlexilTreeTransforms.g:126:9: ^( MINUS ^( MINUS args+= . (args+= . )+ ) args+= . )
					{
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_1 = _last;
					PlexilTreeNode _first_1 = null;
					_last = (PlexilTreeNode)input.LT(1);
					MINUS18=(PlexilTreeNode)match(input,MINUS,FOLLOW_MINUS_in_leftAssociativeReduction440); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_MINUS.add(MINUS18);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = MINUS18;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_2 = _last;
					PlexilTreeNode _first_2 = null;
					_last = (PlexilTreeNode)input.LT(1);
					MINUS19=(PlexilTreeNode)match(input,MINUS,FOLLOW_MINUS_in_leftAssociativeReduction443); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_MINUS.add(MINUS19);

					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = MINUS19;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (PlexilTreeNode)input.LT(1);
					args=(PlexilTreeNode)input.LT(1);
					matchAny(input); if (state.failed) return retval;
					 
					if ( state.backtracking==1 )
					if ( _first_2==null ) _first_2 = args;

					if (list_args==null) list_args=new ArrayList<Object>();
					list_args.add(args);
					// antlr/PlexilTreeTransforms.g:126:33: (args+= . )+
					int cnt5=0;
					loop5:
					while (true) {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( ((LA5_0 >= ABS_KYWD && LA5_0 <= XOR_KYWD)) ) {
							alt5=1;
						}

						switch (alt5) {
						case 1 :
							// antlr/PlexilTreeTransforms.g:126:34: args+= .
							{
							_last = (PlexilTreeNode)input.LT(1);
							args=(PlexilTreeNode)input.LT(1);
							matchAny(input); if (state.failed) return retval;
							 
							if ( state.backtracking==1 )
							if ( _first_2==null ) _first_2 = args;

							if (list_args==null) list_args=new ArrayList<Object>();
							list_args.add(args);
							if ( state.backtracking==1 ) {
							retval.tree = _first_0;
							if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
								retval.tree = (PlexilTreeNode)adaptor.getParent(retval.tree);
							}

							}
							break;

						default :
							if ( cnt5 >= 1 ) break loop5;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(5, input);
							throw eee;
						}
						cnt5++;
					}

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_2;
					}


					_last = (PlexilTreeNode)input.LT(1);
					args=(PlexilTreeNode)input.LT(1);
					matchAny(input); if (state.failed) return retval;
					 
					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = args;

					if (list_args==null) list_args=new ArrayList<Object>();
					list_args.add(args);
					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: MINUS, args
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: args
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"wildcard args",list_args);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 126:60: -> ^( MINUS ( $args)+ )
					{
						// antlr/PlexilTreeTransforms.g:126:63: ^( MINUS ( $args)+ )
						{
						PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
						root_1 = (PlexilTreeNode)adaptor.becomeRoot(
						stream_MINUS.nextNode()
						, root_1);
						if ( !(stream_args.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_args.hasNext() ) {
							adaptor.addChild(root_1, stream_args.nextTree());
						}
						stream_args.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 5 :
					// antlr/PlexilTreeTransforms.g:127:9: ^( ASTERISK ^( ASTERISK (args+= . )+ ) args+= . )
					{
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_1 = _last;
					PlexilTreeNode _first_1 = null;
					_last = (PlexilTreeNode)input.LT(1);
					ASTERISK20=(PlexilTreeNode)match(input,ASTERISK,FOLLOW_ASTERISK_in_leftAssociativeReduction487); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_ASTERISK.add(ASTERISK20);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = ASTERISK20;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_2 = _last;
					PlexilTreeNode _first_2 = null;
					_last = (PlexilTreeNode)input.LT(1);
					ASTERISK21=(PlexilTreeNode)match(input,ASTERISK,FOLLOW_ASTERISK_in_leftAssociativeReduction490); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_ASTERISK.add(ASTERISK21);

					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = ASTERISK21;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					// antlr/PlexilTreeTransforms.g:127:31: (args+= . )+
					int cnt6=0;
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( ((LA6_0 >= ABS_KYWD && LA6_0 <= XOR_KYWD)) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// antlr/PlexilTreeTransforms.g:127:32: args+= .
							{
							_last = (PlexilTreeNode)input.LT(1);
							args=(PlexilTreeNode)input.LT(1);
							matchAny(input); if (state.failed) return retval;
							 
							if ( state.backtracking==1 )
							if ( _first_2==null ) _first_2 = args;

							if (list_args==null) list_args=new ArrayList<Object>();
							list_args.add(args);
							if ( state.backtracking==1 ) {
							retval.tree = _first_0;
							if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
								retval.tree = (PlexilTreeNode)adaptor.getParent(retval.tree);
							}

							}
							break;

						default :
							if ( cnt6 >= 1 ) break loop6;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(6, input);
							throw eee;
						}
						cnt6++;
					}

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_2;
					}


					_last = (PlexilTreeNode)input.LT(1);
					args=(PlexilTreeNode)input.LT(1);
					matchAny(input); if (state.failed) return retval;
					 
					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = args;

					if (list_args==null) list_args=new ArrayList<Object>();
					list_args.add(args);
					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: ASTERISK, args
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: args
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"wildcard args",list_args);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 127:52: -> ^( ASTERISK ( $args)+ )
					{
						// antlr/PlexilTreeTransforms.g:127:55: ^( ASTERISK ( $args)+ )
						{
						PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
						root_1 = (PlexilTreeNode)adaptor.becomeRoot(
						stream_ASTERISK.nextNode()
						, root_1);
						if ( !(stream_args.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_args.hasNext() ) {
							adaptor.addChild(root_1, stream_args.nextTree());
						}
						stream_args.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 6 :
					// antlr/PlexilTreeTransforms.g:128:9: ^( SLASH ^( SLASH args+= . (args+= . )+ ) args+= . )
					{
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_1 = _last;
					PlexilTreeNode _first_1 = null;
					_last = (PlexilTreeNode)input.LT(1);
					SLASH22=(PlexilTreeNode)match(input,SLASH,FOLLOW_SLASH_in_leftAssociativeReduction524); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_SLASH.add(SLASH22);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = SLASH22;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_2 = _last;
					PlexilTreeNode _first_2 = null;
					_last = (PlexilTreeNode)input.LT(1);
					SLASH23=(PlexilTreeNode)match(input,SLASH,FOLLOW_SLASH_in_leftAssociativeReduction527); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_SLASH.add(SLASH23);

					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = SLASH23;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (PlexilTreeNode)input.LT(1);
					args=(PlexilTreeNode)input.LT(1);
					matchAny(input); if (state.failed) return retval;
					 
					if ( state.backtracking==1 )
					if ( _first_2==null ) _first_2 = args;

					if (list_args==null) list_args=new ArrayList<Object>();
					list_args.add(args);
					// antlr/PlexilTreeTransforms.g:128:33: (args+= . )+
					int cnt7=0;
					loop7:
					while (true) {
						int alt7=2;
						int LA7_0 = input.LA(1);
						if ( ((LA7_0 >= ABS_KYWD && LA7_0 <= XOR_KYWD)) ) {
							alt7=1;
						}

						switch (alt7) {
						case 1 :
							// antlr/PlexilTreeTransforms.g:128:34: args+= .
							{
							_last = (PlexilTreeNode)input.LT(1);
							args=(PlexilTreeNode)input.LT(1);
							matchAny(input); if (state.failed) return retval;
							 
							if ( state.backtracking==1 )
							if ( _first_2==null ) _first_2 = args;

							if (list_args==null) list_args=new ArrayList<Object>();
							list_args.add(args);
							if ( state.backtracking==1 ) {
							retval.tree = _first_0;
							if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
								retval.tree = (PlexilTreeNode)adaptor.getParent(retval.tree);
							}

							}
							break;

						default :
							if ( cnt7 >= 1 ) break loop7;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(7, input);
							throw eee;
						}
						cnt7++;
					}

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_2;
					}


					_last = (PlexilTreeNode)input.LT(1);
					args=(PlexilTreeNode)input.LT(1);
					matchAny(input); if (state.failed) return retval;
					 
					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = args;

					if (list_args==null) list_args=new ArrayList<Object>();
					list_args.add(args);
					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: args
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: args
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"wildcard args",list_args);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 128:54: -> ^( ASTERISK ( $args)+ )
					{
						// antlr/PlexilTreeTransforms.g:128:57: ^( ASTERISK ( $args)+ )
						{
						PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
						root_1 = (PlexilTreeNode)adaptor.becomeRoot((PlexilTreeNode)adaptor.create(ASTERISK, "ASTERISK"), root_1);
						if ( !(stream_args.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_args.hasNext() ) {
							adaptor.addChild(root_1, stream_args.nextTree());
						}
						stream_args.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 7 :
					// antlr/PlexilTreeTransforms.g:129:9: ^( MAX_KYWD ^( MAX_KYWD (args+= . )+ ) args+= . )
					{
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_1 = _last;
					PlexilTreeNode _first_1 = null;
					_last = (PlexilTreeNode)input.LT(1);
					MAX_KYWD24=(PlexilTreeNode)match(input,MAX_KYWD,FOLLOW_MAX_KYWD_in_leftAssociativeReduction565); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_MAX_KYWD.add(MAX_KYWD24);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = MAX_KYWD24;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_2 = _last;
					PlexilTreeNode _first_2 = null;
					_last = (PlexilTreeNode)input.LT(1);
					MAX_KYWD25=(PlexilTreeNode)match(input,MAX_KYWD,FOLLOW_MAX_KYWD_in_leftAssociativeReduction568); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_MAX_KYWD.add(MAX_KYWD25);

					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = MAX_KYWD25;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					// antlr/PlexilTreeTransforms.g:129:31: (args+= . )+
					int cnt8=0;
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( ((LA8_0 >= ABS_KYWD && LA8_0 <= XOR_KYWD)) ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// antlr/PlexilTreeTransforms.g:129:32: args+= .
							{
							_last = (PlexilTreeNode)input.LT(1);
							args=(PlexilTreeNode)input.LT(1);
							matchAny(input); if (state.failed) return retval;
							 
							if ( state.backtracking==1 )
							if ( _first_2==null ) _first_2 = args;

							if (list_args==null) list_args=new ArrayList<Object>();
							list_args.add(args);
							if ( state.backtracking==1 ) {
							retval.tree = _first_0;
							if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
								retval.tree = (PlexilTreeNode)adaptor.getParent(retval.tree);
							}

							}
							break;

						default :
							if ( cnt8 >= 1 ) break loop8;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(8, input);
							throw eee;
						}
						cnt8++;
					}

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_2;
					}


					_last = (PlexilTreeNode)input.LT(1);
					args=(PlexilTreeNode)input.LT(1);
					matchAny(input); if (state.failed) return retval;
					 
					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = args;

					if (list_args==null) list_args=new ArrayList<Object>();
					list_args.add(args);
					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: args, MAX_KYWD
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: args
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"wildcard args",list_args);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 129:52: -> ^( MAX_KYWD ( $args)+ )
					{
						// antlr/PlexilTreeTransforms.g:129:55: ^( MAX_KYWD ( $args)+ )
						{
						PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
						root_1 = (PlexilTreeNode)adaptor.becomeRoot(
						stream_MAX_KYWD.nextNode()
						, root_1);
						if ( !(stream_args.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_args.hasNext() ) {
							adaptor.addChild(root_1, stream_args.nextTree());
						}
						stream_args.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 8 :
					// antlr/PlexilTreeTransforms.g:130:9: ^( MIN_KYWD ^( MIN_KYWD (args+= . )+ ) args+= . )
					{
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_1 = _last;
					PlexilTreeNode _first_1 = null;
					_last = (PlexilTreeNode)input.LT(1);
					MIN_KYWD26=(PlexilTreeNode)match(input,MIN_KYWD,FOLLOW_MIN_KYWD_in_leftAssociativeReduction602); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_MIN_KYWD.add(MIN_KYWD26);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = MIN_KYWD26;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_2 = _last;
					PlexilTreeNode _first_2 = null;
					_last = (PlexilTreeNode)input.LT(1);
					MIN_KYWD27=(PlexilTreeNode)match(input,MIN_KYWD,FOLLOW_MIN_KYWD_in_leftAssociativeReduction605); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_MIN_KYWD.add(MIN_KYWD27);

					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = MIN_KYWD27;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					// antlr/PlexilTreeTransforms.g:130:31: (args+= . )+
					int cnt9=0;
					loop9:
					while (true) {
						int alt9=2;
						int LA9_0 = input.LA(1);
						if ( ((LA9_0 >= ABS_KYWD && LA9_0 <= XOR_KYWD)) ) {
							alt9=1;
						}

						switch (alt9) {
						case 1 :
							// antlr/PlexilTreeTransforms.g:130:32: args+= .
							{
							_last = (PlexilTreeNode)input.LT(1);
							args=(PlexilTreeNode)input.LT(1);
							matchAny(input); if (state.failed) return retval;
							 
							if ( state.backtracking==1 )
							if ( _first_2==null ) _first_2 = args;

							if (list_args==null) list_args=new ArrayList<Object>();
							list_args.add(args);
							if ( state.backtracking==1 ) {
							retval.tree = _first_0;
							if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
								retval.tree = (PlexilTreeNode)adaptor.getParent(retval.tree);
							}

							}
							break;

						default :
							if ( cnt9 >= 1 ) break loop9;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(9, input);
							throw eee;
						}
						cnt9++;
					}

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_2;
					}


					_last = (PlexilTreeNode)input.LT(1);
					args=(PlexilTreeNode)input.LT(1);
					matchAny(input); if (state.failed) return retval;
					 
					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = args;

					if (list_args==null) list_args=new ArrayList<Object>();
					list_args.add(args);
					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: args, MIN_KYWD
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: args
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"wildcard args",list_args);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 130:52: -> ^( MIN_KYWD ( $args)+ )
					{
						// antlr/PlexilTreeTransforms.g:130:55: ^( MIN_KYWD ( $args)+ )
						{
						PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
						root_1 = (PlexilTreeNode)adaptor.becomeRoot(
						stream_MIN_KYWD.nextNode()
						, root_1);
						if ( !(stream_args.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_args.hasNext() ) {
							adaptor.addChild(root_1, stream_args.nextTree());
						}
						stream_args.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "leftAssociativeReduction"


	public static class rightAssociativeReduction_return extends TreeRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "rightAssociativeReduction"
	// antlr/PlexilTreeTransforms.g:133:1: rightAssociativeReduction : ( ^( AND_KYWD (args+= . )+ ^( AND_KYWD (args+= . )+ ) ) -> ^( AND_KYWD ( $args)+ ) | ^( OR_KYWD (args+= . )+ ^( OR_KYWD (args+= . )+ ) ) -> ^( OR_KYWD ( $args)+ ) | ^( PLUS (args+= . )+ ^( PLUS (args+= . )+ ) ) -> ^( PLUS ( $args)+ ) | ^( ASTERISK (args+= . )+ ^( ASTERISK (args+= . )+ ) ) -> ^( ASTERISK ( $args)+ ) | ^( MAX_KYWD (args+= . )+ ^( MAX_KYWD (args+= . )+ ) ) -> ^( MAX_KYWD ( $args)+ ) | ^( MIN_KYWD (args+= . )+ ^( MIN_KYWD (args+= . )+ ) ) -> ^( MIN_KYWD ( $args)+ ) );
	public final PlexilTreeTransforms.rightAssociativeReduction_return rightAssociativeReduction() throws RecognitionException {
		PlexilTreeTransforms.rightAssociativeReduction_return retval = new PlexilTreeTransforms.rightAssociativeReduction_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		PlexilTreeNode _first_0 = null;
		PlexilTreeNode _last = null;


		PlexilTreeNode AND_KYWD28=null;
		PlexilTreeNode AND_KYWD29=null;
		PlexilTreeNode OR_KYWD30=null;
		PlexilTreeNode OR_KYWD31=null;
		PlexilTreeNode PLUS32=null;
		PlexilTreeNode PLUS33=null;
		PlexilTreeNode ASTERISK34=null;
		PlexilTreeNode ASTERISK35=null;
		PlexilTreeNode MAX_KYWD36=null;
		PlexilTreeNode MAX_KYWD37=null;
		PlexilTreeNode MIN_KYWD38=null;
		PlexilTreeNode MIN_KYWD39=null;
		PlexilTreeNode args=null;
		List<Object> list_args=null;

		PlexilTreeNode AND_KYWD28_tree=null;
		PlexilTreeNode AND_KYWD29_tree=null;
		PlexilTreeNode OR_KYWD30_tree=null;
		PlexilTreeNode OR_KYWD31_tree=null;
		PlexilTreeNode PLUS32_tree=null;
		PlexilTreeNode PLUS33_tree=null;
		PlexilTreeNode ASTERISK34_tree=null;
		PlexilTreeNode ASTERISK35_tree=null;
		PlexilTreeNode MAX_KYWD36_tree=null;
		PlexilTreeNode MAX_KYWD37_tree=null;
		PlexilTreeNode MIN_KYWD38_tree=null;
		PlexilTreeNode MIN_KYWD39_tree=null;
		PlexilTreeNode args_tree=null;
		RewriteRuleNodeStream stream_OR_KYWD=new RewriteRuleNodeStream(adaptor,"token OR_KYWD");
		RewriteRuleNodeStream stream_MIN_KYWD=new RewriteRuleNodeStream(adaptor,"token MIN_KYWD");
		RewriteRuleNodeStream stream_AND_KYWD=new RewriteRuleNodeStream(adaptor,"token AND_KYWD");
		RewriteRuleNodeStream stream_ASTERISK=new RewriteRuleNodeStream(adaptor,"token ASTERISK");
		RewriteRuleNodeStream stream_MAX_KYWD=new RewriteRuleNodeStream(adaptor,"token MAX_KYWD");
		RewriteRuleNodeStream stream_PLUS=new RewriteRuleNodeStream(adaptor,"token PLUS");

		try {
			// antlr/PlexilTreeTransforms.g:133:26: ( ^( AND_KYWD (args+= . )+ ^( AND_KYWD (args+= . )+ ) ) -> ^( AND_KYWD ( $args)+ ) | ^( OR_KYWD (args+= . )+ ^( OR_KYWD (args+= . )+ ) ) -> ^( OR_KYWD ( $args)+ ) | ^( PLUS (args+= . )+ ^( PLUS (args+= . )+ ) ) -> ^( PLUS ( $args)+ ) | ^( ASTERISK (args+= . )+ ^( ASTERISK (args+= . )+ ) ) -> ^( ASTERISK ( $args)+ ) | ^( MAX_KYWD (args+= . )+ ^( MAX_KYWD (args+= . )+ ) ) -> ^( MAX_KYWD ( $args)+ ) | ^( MIN_KYWD (args+= . )+ ^( MIN_KYWD (args+= . )+ ) ) -> ^( MIN_KYWD ( $args)+ ) )
			int alt23=6;
			switch ( input.LA(1) ) {
			case AND_KYWD:
				{
				alt23=1;
				}
				break;
			case OR_KYWD:
				{
				alt23=2;
				}
				break;
			case PLUS:
				{
				alt23=3;
				}
				break;
			case ASTERISK:
				{
				alt23=4;
				}
				break;
			case MAX_KYWD:
				{
				alt23=5;
				}
				break;
			case MIN_KYWD:
				{
				alt23=6;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 23, 0, input);
				throw nvae;
			}
			switch (alt23) {
				case 1 :
					// antlr/PlexilTreeTransforms.g:134:9: ^( AND_KYWD (args+= . )+ ^( AND_KYWD (args+= . )+ ) )
					{
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_1 = _last;
					PlexilTreeNode _first_1 = null;
					_last = (PlexilTreeNode)input.LT(1);
					AND_KYWD28=(PlexilTreeNode)match(input,AND_KYWD,FOLLOW_AND_KYWD_in_rightAssociativeReduction649); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_AND_KYWD.add(AND_KYWD28);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = AND_KYWD28;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					// antlr/PlexilTreeTransforms.g:134:20: (args+= . )+
					int cnt11=0;
					loop11:
					while (true) {
						int alt11=2;
						alt11 = dfa11.predict(input);
						switch (alt11) {
						case 1 :
							// antlr/PlexilTreeTransforms.g:134:21: args+= .
							{
							_last = (PlexilTreeNode)input.LT(1);
							args=(PlexilTreeNode)input.LT(1);
							matchAny(input); if (state.failed) return retval;
							 
							if ( state.backtracking==1 )
							if ( _first_1==null ) _first_1 = args;

							if (list_args==null) list_args=new ArrayList<Object>();
							list_args.add(args);
							if ( state.backtracking==1 ) {
							retval.tree = _first_0;
							if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
								retval.tree = (PlexilTreeNode)adaptor.getParent(retval.tree);
							}

							}
							break;

						default :
							if ( cnt11 >= 1 ) break loop11;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(11, input);
							throw eee;
						}
						cnt11++;
					}

					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_2 = _last;
					PlexilTreeNode _first_2 = null;
					_last = (PlexilTreeNode)input.LT(1);
					AND_KYWD29=(PlexilTreeNode)match(input,AND_KYWD,FOLLOW_AND_KYWD_in_rightAssociativeReduction659); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_AND_KYWD.add(AND_KYWD29);

					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = AND_KYWD29;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					// antlr/PlexilTreeTransforms.g:134:42: (args+= . )+
					int cnt12=0;
					loop12:
					while (true) {
						int alt12=2;
						int LA12_0 = input.LA(1);
						if ( ((LA12_0 >= ABS_KYWD && LA12_0 <= XOR_KYWD)) ) {
							alt12=1;
						}

						switch (alt12) {
						case 1 :
							// antlr/PlexilTreeTransforms.g:134:43: args+= .
							{
							_last = (PlexilTreeNode)input.LT(1);
							args=(PlexilTreeNode)input.LT(1);
							matchAny(input); if (state.failed) return retval;
							 
							if ( state.backtracking==1 )
							if ( _first_2==null ) _first_2 = args;

							if (list_args==null) list_args=new ArrayList<Object>();
							list_args.add(args);
							if ( state.backtracking==1 ) {
							retval.tree = _first_0;
							if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
								retval.tree = (PlexilTreeNode)adaptor.getParent(retval.tree);
							}

							}
							break;

						default :
							if ( cnt12 >= 1 ) break loop12;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(12, input);
							throw eee;
						}
						cnt12++;
					}

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_2;
					}


					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: AND_KYWD, args
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: args
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"wildcard args",list_args);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 134:56: -> ^( AND_KYWD ( $args)+ )
					{
						// antlr/PlexilTreeTransforms.g:134:59: ^( AND_KYWD ( $args)+ )
						{
						PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
						root_1 = (PlexilTreeNode)adaptor.becomeRoot(
						stream_AND_KYWD.nextNode()
						, root_1);
						if ( !(stream_args.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_args.hasNext() ) {
							adaptor.addChild(root_1, stream_args.nextTree());
						}
						stream_args.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 2 :
					// antlr/PlexilTreeTransforms.g:135:9: ^( OR_KYWD (args+= . )+ ^( OR_KYWD (args+= . )+ ) )
					{
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_1 = _last;
					PlexilTreeNode _first_1 = null;
					_last = (PlexilTreeNode)input.LT(1);
					OR_KYWD30=(PlexilTreeNode)match(input,OR_KYWD,FOLLOW_OR_KYWD_in_rightAssociativeReduction690); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_OR_KYWD.add(OR_KYWD30);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = OR_KYWD30;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					// antlr/PlexilTreeTransforms.g:135:19: (args+= . )+
					int cnt13=0;
					loop13:
					while (true) {
						int alt13=2;
						alt13 = dfa13.predict(input);
						switch (alt13) {
						case 1 :
							// antlr/PlexilTreeTransforms.g:135:20: args+= .
							{
							_last = (PlexilTreeNode)input.LT(1);
							args=(PlexilTreeNode)input.LT(1);
							matchAny(input); if (state.failed) return retval;
							 
							if ( state.backtracking==1 )
							if ( _first_1==null ) _first_1 = args;

							if (list_args==null) list_args=new ArrayList<Object>();
							list_args.add(args);
							if ( state.backtracking==1 ) {
							retval.tree = _first_0;
							if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
								retval.tree = (PlexilTreeNode)adaptor.getParent(retval.tree);
							}

							}
							break;

						default :
							if ( cnt13 >= 1 ) break loop13;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(13, input);
							throw eee;
						}
						cnt13++;
					}

					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_2 = _last;
					PlexilTreeNode _first_2 = null;
					_last = (PlexilTreeNode)input.LT(1);
					OR_KYWD31=(PlexilTreeNode)match(input,OR_KYWD,FOLLOW_OR_KYWD_in_rightAssociativeReduction700); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_OR_KYWD.add(OR_KYWD31);

					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = OR_KYWD31;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					// antlr/PlexilTreeTransforms.g:135:40: (args+= . )+
					int cnt14=0;
					loop14:
					while (true) {
						int alt14=2;
						int LA14_0 = input.LA(1);
						if ( ((LA14_0 >= ABS_KYWD && LA14_0 <= XOR_KYWD)) ) {
							alt14=1;
						}

						switch (alt14) {
						case 1 :
							// antlr/PlexilTreeTransforms.g:135:41: args+= .
							{
							_last = (PlexilTreeNode)input.LT(1);
							args=(PlexilTreeNode)input.LT(1);
							matchAny(input); if (state.failed) return retval;
							 
							if ( state.backtracking==1 )
							if ( _first_2==null ) _first_2 = args;

							if (list_args==null) list_args=new ArrayList<Object>();
							list_args.add(args);
							if ( state.backtracking==1 ) {
							retval.tree = _first_0;
							if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
								retval.tree = (PlexilTreeNode)adaptor.getParent(retval.tree);
							}

							}
							break;

						default :
							if ( cnt14 >= 1 ) break loop14;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(14, input);
							throw eee;
						}
						cnt14++;
					}

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_2;
					}


					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: args, OR_KYWD
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: args
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"wildcard args",list_args);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 135:55: -> ^( OR_KYWD ( $args)+ )
					{
						// antlr/PlexilTreeTransforms.g:135:58: ^( OR_KYWD ( $args)+ )
						{
						PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
						root_1 = (PlexilTreeNode)adaptor.becomeRoot(
						stream_OR_KYWD.nextNode()
						, root_1);
						if ( !(stream_args.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_args.hasNext() ) {
							adaptor.addChild(root_1, stream_args.nextTree());
						}
						stream_args.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 3 :
					// antlr/PlexilTreeTransforms.g:136:9: ^( PLUS (args+= . )+ ^( PLUS (args+= . )+ ) )
					{
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_1 = _last;
					PlexilTreeNode _first_1 = null;
					_last = (PlexilTreeNode)input.LT(1);
					PLUS32=(PlexilTreeNode)match(input,PLUS,FOLLOW_PLUS_in_rightAssociativeReduction732); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_PLUS.add(PLUS32);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = PLUS32;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					// antlr/PlexilTreeTransforms.g:136:16: (args+= . )+
					int cnt15=0;
					loop15:
					while (true) {
						int alt15=2;
						alt15 = dfa15.predict(input);
						switch (alt15) {
						case 1 :
							// antlr/PlexilTreeTransforms.g:136:17: args+= .
							{
							_last = (PlexilTreeNode)input.LT(1);
							args=(PlexilTreeNode)input.LT(1);
							matchAny(input); if (state.failed) return retval;
							 
							if ( state.backtracking==1 )
							if ( _first_1==null ) _first_1 = args;

							if (list_args==null) list_args=new ArrayList<Object>();
							list_args.add(args);
							if ( state.backtracking==1 ) {
							retval.tree = _first_0;
							if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
								retval.tree = (PlexilTreeNode)adaptor.getParent(retval.tree);
							}

							}
							break;

						default :
							if ( cnt15 >= 1 ) break loop15;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(15, input);
							throw eee;
						}
						cnt15++;
					}

					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_2 = _last;
					PlexilTreeNode _first_2 = null;
					_last = (PlexilTreeNode)input.LT(1);
					PLUS33=(PlexilTreeNode)match(input,PLUS,FOLLOW_PLUS_in_rightAssociativeReduction742); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_PLUS.add(PLUS33);

					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = PLUS33;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					// antlr/PlexilTreeTransforms.g:136:34: (args+= . )+
					int cnt16=0;
					loop16:
					while (true) {
						int alt16=2;
						int LA16_0 = input.LA(1);
						if ( ((LA16_0 >= ABS_KYWD && LA16_0 <= XOR_KYWD)) ) {
							alt16=1;
						}

						switch (alt16) {
						case 1 :
							// antlr/PlexilTreeTransforms.g:136:35: args+= .
							{
							_last = (PlexilTreeNode)input.LT(1);
							args=(PlexilTreeNode)input.LT(1);
							matchAny(input); if (state.failed) return retval;
							 
							if ( state.backtracking==1 )
							if ( _first_2==null ) _first_2 = args;

							if (list_args==null) list_args=new ArrayList<Object>();
							list_args.add(args);
							if ( state.backtracking==1 ) {
							retval.tree = _first_0;
							if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
								retval.tree = (PlexilTreeNode)adaptor.getParent(retval.tree);
							}

							}
							break;

						default :
							if ( cnt16 >= 1 ) break loop16;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(16, input);
							throw eee;
						}
						cnt16++;
					}

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_2;
					}


					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: args, PLUS
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: args
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"wildcard args",list_args);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 136:55: -> ^( PLUS ( $args)+ )
					{
						// antlr/PlexilTreeTransforms.g:136:58: ^( PLUS ( $args)+ )
						{
						PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
						root_1 = (PlexilTreeNode)adaptor.becomeRoot(
						stream_PLUS.nextNode()
						, root_1);
						if ( !(stream_args.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_args.hasNext() ) {
							adaptor.addChild(root_1, stream_args.nextTree());
						}
						stream_args.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 4 :
					// antlr/PlexilTreeTransforms.g:137:9: ^( ASTERISK (args+= . )+ ^( ASTERISK (args+= . )+ ) )
					{
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_1 = _last;
					PlexilTreeNode _first_1 = null;
					_last = (PlexilTreeNode)input.LT(1);
					ASTERISK34=(PlexilTreeNode)match(input,ASTERISK,FOLLOW_ASTERISK_in_rightAssociativeReduction780); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_ASTERISK.add(ASTERISK34);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = ASTERISK34;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					// antlr/PlexilTreeTransforms.g:137:20: (args+= . )+
					int cnt17=0;
					loop17:
					while (true) {
						int alt17=2;
						alt17 = dfa17.predict(input);
						switch (alt17) {
						case 1 :
							// antlr/PlexilTreeTransforms.g:137:21: args+= .
							{
							_last = (PlexilTreeNode)input.LT(1);
							args=(PlexilTreeNode)input.LT(1);
							matchAny(input); if (state.failed) return retval;
							 
							if ( state.backtracking==1 )
							if ( _first_1==null ) _first_1 = args;

							if (list_args==null) list_args=new ArrayList<Object>();
							list_args.add(args);
							if ( state.backtracking==1 ) {
							retval.tree = _first_0;
							if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
								retval.tree = (PlexilTreeNode)adaptor.getParent(retval.tree);
							}

							}
							break;

						default :
							if ( cnt17 >= 1 ) break loop17;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(17, input);
							throw eee;
						}
						cnt17++;
					}

					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_2 = _last;
					PlexilTreeNode _first_2 = null;
					_last = (PlexilTreeNode)input.LT(1);
					ASTERISK35=(PlexilTreeNode)match(input,ASTERISK,FOLLOW_ASTERISK_in_rightAssociativeReduction790); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_ASTERISK.add(ASTERISK35);

					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = ASTERISK35;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					// antlr/PlexilTreeTransforms.g:137:42: (args+= . )+
					int cnt18=0;
					loop18:
					while (true) {
						int alt18=2;
						int LA18_0 = input.LA(1);
						if ( ((LA18_0 >= ABS_KYWD && LA18_0 <= XOR_KYWD)) ) {
							alt18=1;
						}

						switch (alt18) {
						case 1 :
							// antlr/PlexilTreeTransforms.g:137:43: args+= .
							{
							_last = (PlexilTreeNode)input.LT(1);
							args=(PlexilTreeNode)input.LT(1);
							matchAny(input); if (state.failed) return retval;
							 
							if ( state.backtracking==1 )
							if ( _first_2==null ) _first_2 = args;

							if (list_args==null) list_args=new ArrayList<Object>();
							list_args.add(args);
							if ( state.backtracking==1 ) {
							retval.tree = _first_0;
							if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
								retval.tree = (PlexilTreeNode)adaptor.getParent(retval.tree);
							}

							}
							break;

						default :
							if ( cnt18 >= 1 ) break loop18;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(18, input);
							throw eee;
						}
						cnt18++;
					}

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_2;
					}


					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: args, ASTERISK
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: args
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"wildcard args",list_args);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 137:55: -> ^( ASTERISK ( $args)+ )
					{
						// antlr/PlexilTreeTransforms.g:137:58: ^( ASTERISK ( $args)+ )
						{
						PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
						root_1 = (PlexilTreeNode)adaptor.becomeRoot(
						stream_ASTERISK.nextNode()
						, root_1);
						if ( !(stream_args.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_args.hasNext() ) {
							adaptor.addChild(root_1, stream_args.nextTree());
						}
						stream_args.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 5 :
					// antlr/PlexilTreeTransforms.g:138:9: ^( MAX_KYWD (args+= . )+ ^( MAX_KYWD (args+= . )+ ) )
					{
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_1 = _last;
					PlexilTreeNode _first_1 = null;
					_last = (PlexilTreeNode)input.LT(1);
					MAX_KYWD36=(PlexilTreeNode)match(input,MAX_KYWD,FOLLOW_MAX_KYWD_in_rightAssociativeReduction820); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_MAX_KYWD.add(MAX_KYWD36);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = MAX_KYWD36;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					// antlr/PlexilTreeTransforms.g:138:20: (args+= . )+
					int cnt19=0;
					loop19:
					while (true) {
						int alt19=2;
						alt19 = dfa19.predict(input);
						switch (alt19) {
						case 1 :
							// antlr/PlexilTreeTransforms.g:138:21: args+= .
							{
							_last = (PlexilTreeNode)input.LT(1);
							args=(PlexilTreeNode)input.LT(1);
							matchAny(input); if (state.failed) return retval;
							 
							if ( state.backtracking==1 )
							if ( _first_1==null ) _first_1 = args;

							if (list_args==null) list_args=new ArrayList<Object>();
							list_args.add(args);
							if ( state.backtracking==1 ) {
							retval.tree = _first_0;
							if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
								retval.tree = (PlexilTreeNode)adaptor.getParent(retval.tree);
							}

							}
							break;

						default :
							if ( cnt19 >= 1 ) break loop19;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(19, input);
							throw eee;
						}
						cnt19++;
					}

					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_2 = _last;
					PlexilTreeNode _first_2 = null;
					_last = (PlexilTreeNode)input.LT(1);
					MAX_KYWD37=(PlexilTreeNode)match(input,MAX_KYWD,FOLLOW_MAX_KYWD_in_rightAssociativeReduction830); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_MAX_KYWD.add(MAX_KYWD37);

					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = MAX_KYWD37;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					// antlr/PlexilTreeTransforms.g:138:42: (args+= . )+
					int cnt20=0;
					loop20:
					while (true) {
						int alt20=2;
						int LA20_0 = input.LA(1);
						if ( ((LA20_0 >= ABS_KYWD && LA20_0 <= XOR_KYWD)) ) {
							alt20=1;
						}

						switch (alt20) {
						case 1 :
							// antlr/PlexilTreeTransforms.g:138:43: args+= .
							{
							_last = (PlexilTreeNode)input.LT(1);
							args=(PlexilTreeNode)input.LT(1);
							matchAny(input); if (state.failed) return retval;
							 
							if ( state.backtracking==1 )
							if ( _first_2==null ) _first_2 = args;

							if (list_args==null) list_args=new ArrayList<Object>();
							list_args.add(args);
							if ( state.backtracking==1 ) {
							retval.tree = _first_0;
							if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
								retval.tree = (PlexilTreeNode)adaptor.getParent(retval.tree);
							}

							}
							break;

						default :
							if ( cnt20 >= 1 ) break loop20;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(20, input);
							throw eee;
						}
						cnt20++;
					}

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_2;
					}


					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: args, MAX_KYWD
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: args
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"wildcard args",list_args);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 138:55: -> ^( MAX_KYWD ( $args)+ )
					{
						// antlr/PlexilTreeTransforms.g:138:58: ^( MAX_KYWD ( $args)+ )
						{
						PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
						root_1 = (PlexilTreeNode)adaptor.becomeRoot(
						stream_MAX_KYWD.nextNode()
						, root_1);
						if ( !(stream_args.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_args.hasNext() ) {
							adaptor.addChild(root_1, stream_args.nextTree());
						}
						stream_args.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 6 :
					// antlr/PlexilTreeTransforms.g:139:9: ^( MIN_KYWD (args+= . )+ ^( MIN_KYWD (args+= . )+ ) )
					{
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_1 = _last;
					PlexilTreeNode _first_1 = null;
					_last = (PlexilTreeNode)input.LT(1);
					MIN_KYWD38=(PlexilTreeNode)match(input,MIN_KYWD,FOLLOW_MIN_KYWD_in_rightAssociativeReduction860); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_MIN_KYWD.add(MIN_KYWD38);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = MIN_KYWD38;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					// antlr/PlexilTreeTransforms.g:139:20: (args+= . )+
					int cnt21=0;
					loop21:
					while (true) {
						int alt21=2;
						alt21 = dfa21.predict(input);
						switch (alt21) {
						case 1 :
							// antlr/PlexilTreeTransforms.g:139:21: args+= .
							{
							_last = (PlexilTreeNode)input.LT(1);
							args=(PlexilTreeNode)input.LT(1);
							matchAny(input); if (state.failed) return retval;
							 
							if ( state.backtracking==1 )
							if ( _first_1==null ) _first_1 = args;

							if (list_args==null) list_args=new ArrayList<Object>();
							list_args.add(args);
							if ( state.backtracking==1 ) {
							retval.tree = _first_0;
							if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
								retval.tree = (PlexilTreeNode)adaptor.getParent(retval.tree);
							}

							}
							break;

						default :
							if ( cnt21 >= 1 ) break loop21;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(21, input);
							throw eee;
						}
						cnt21++;
					}

					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_2 = _last;
					PlexilTreeNode _first_2 = null;
					_last = (PlexilTreeNode)input.LT(1);
					MIN_KYWD39=(PlexilTreeNode)match(input,MIN_KYWD,FOLLOW_MIN_KYWD_in_rightAssociativeReduction870); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_MIN_KYWD.add(MIN_KYWD39);

					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = MIN_KYWD39;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					// antlr/PlexilTreeTransforms.g:139:42: (args+= . )+
					int cnt22=0;
					loop22:
					while (true) {
						int alt22=2;
						int LA22_0 = input.LA(1);
						if ( ((LA22_0 >= ABS_KYWD && LA22_0 <= XOR_KYWD)) ) {
							alt22=1;
						}

						switch (alt22) {
						case 1 :
							// antlr/PlexilTreeTransforms.g:139:43: args+= .
							{
							_last = (PlexilTreeNode)input.LT(1);
							args=(PlexilTreeNode)input.LT(1);
							matchAny(input); if (state.failed) return retval;
							 
							if ( state.backtracking==1 )
							if ( _first_2==null ) _first_2 = args;

							if (list_args==null) list_args=new ArrayList<Object>();
							list_args.add(args);
							if ( state.backtracking==1 ) {
							retval.tree = _first_0;
							if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
								retval.tree = (PlexilTreeNode)adaptor.getParent(retval.tree);
							}

							}
							break;

						default :
							if ( cnt22 >= 1 ) break loop22;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(22, input);
							throw eee;
						}
						cnt22++;
					}

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_2;
					}


					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: args, MIN_KYWD
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: args
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"wildcard args",list_args);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 139:55: -> ^( MIN_KYWD ( $args)+ )
					{
						// antlr/PlexilTreeTransforms.g:139:58: ^( MIN_KYWD ( $args)+ )
						{
						PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
						root_1 = (PlexilTreeNode)adaptor.becomeRoot(
						stream_MIN_KYWD.nextNode()
						, root_1);
						if ( !(stream_args.hasNext()) ) {
							throw new RewriteEarlyExitException();
						}
						while ( stream_args.hasNext() ) {
							adaptor.addChild(root_1, stream_args.nextTree());
						}
						stream_args.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "rightAssociativeReduction"


	public static class trivialReduction_return extends TreeRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "trivialReduction"
	// antlr/PlexilTreeTransforms.g:142:1: trivialReduction : ( ^( AND_KYWD arg= . ) -> $arg| ^( OR_KYWD arg= . ) -> $arg| ^( PLUS arg= . ) -> $arg| ^( MINUS arg= . ) -> $arg| ^( ASTERISK arg= . ) -> $arg| ^( SLASH arg= . ) -> $arg| ^( MAX_KYWD arg= . ) -> $arg| ^( MIN_KYWD arg= . ) -> $arg);
	public final PlexilTreeTransforms.trivialReduction_return trivialReduction() throws RecognitionException {
		PlexilTreeTransforms.trivialReduction_return retval = new PlexilTreeTransforms.trivialReduction_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		PlexilTreeNode _first_0 = null;
		PlexilTreeNode _last = null;


		PlexilTreeNode AND_KYWD40=null;
		PlexilTreeNode OR_KYWD41=null;
		PlexilTreeNode PLUS42=null;
		PlexilTreeNode MINUS43=null;
		PlexilTreeNode ASTERISK44=null;
		PlexilTreeNode SLASH45=null;
		PlexilTreeNode MAX_KYWD46=null;
		PlexilTreeNode MIN_KYWD47=null;
		PlexilTreeNode arg=null;

		PlexilTreeNode AND_KYWD40_tree=null;
		PlexilTreeNode OR_KYWD41_tree=null;
		PlexilTreeNode PLUS42_tree=null;
		PlexilTreeNode MINUS43_tree=null;
		PlexilTreeNode ASTERISK44_tree=null;
		PlexilTreeNode SLASH45_tree=null;
		PlexilTreeNode MAX_KYWD46_tree=null;
		PlexilTreeNode MIN_KYWD47_tree=null;
		PlexilTreeNode arg_tree=null;
		RewriteRuleNodeStream stream_OR_KYWD=new RewriteRuleNodeStream(adaptor,"token OR_KYWD");
		RewriteRuleNodeStream stream_MIN_KYWD=new RewriteRuleNodeStream(adaptor,"token MIN_KYWD");
		RewriteRuleNodeStream stream_SLASH=new RewriteRuleNodeStream(adaptor,"token SLASH");
		RewriteRuleNodeStream stream_AND_KYWD=new RewriteRuleNodeStream(adaptor,"token AND_KYWD");
		RewriteRuleNodeStream stream_ASTERISK=new RewriteRuleNodeStream(adaptor,"token ASTERISK");
		RewriteRuleNodeStream stream_MAX_KYWD=new RewriteRuleNodeStream(adaptor,"token MAX_KYWD");
		RewriteRuleNodeStream stream_PLUS=new RewriteRuleNodeStream(adaptor,"token PLUS");
		RewriteRuleNodeStream stream_MINUS=new RewriteRuleNodeStream(adaptor,"token MINUS");

		try {
			// antlr/PlexilTreeTransforms.g:142:17: ( ^( AND_KYWD arg= . ) -> $arg| ^( OR_KYWD arg= . ) -> $arg| ^( PLUS arg= . ) -> $arg| ^( MINUS arg= . ) -> $arg| ^( ASTERISK arg= . ) -> $arg| ^( SLASH arg= . ) -> $arg| ^( MAX_KYWD arg= . ) -> $arg| ^( MIN_KYWD arg= . ) -> $arg)
			int alt24=8;
			switch ( input.LA(1) ) {
			case AND_KYWD:
				{
				alt24=1;
				}
				break;
			case OR_KYWD:
				{
				alt24=2;
				}
				break;
			case PLUS:
				{
				alt24=3;
				}
				break;
			case MINUS:
				{
				alt24=4;
				}
				break;
			case ASTERISK:
				{
				alt24=5;
				}
				break;
			case SLASH:
				{
				alt24=6;
				}
				break;
			case MAX_KYWD:
				{
				alt24=7;
				}
				break;
			case MIN_KYWD:
				{
				alt24=8;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				throw nvae;
			}
			switch (alt24) {
				case 1 :
					// antlr/PlexilTreeTransforms.g:143:9: ^( AND_KYWD arg= . )
					{
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_1 = _last;
					PlexilTreeNode _first_1 = null;
					_last = (PlexilTreeNode)input.LT(1);
					AND_KYWD40=(PlexilTreeNode)match(input,AND_KYWD,FOLLOW_AND_KYWD_in_trivialReduction910); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_AND_KYWD.add(AND_KYWD40);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = AND_KYWD40;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (PlexilTreeNode)input.LT(1);
					arg=(PlexilTreeNode)input.LT(1);
					matchAny(input); if (state.failed) return retval;
					 
					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = arg;

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: arg
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: arg
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_arg=new RewriteRuleSubtreeStream(adaptor,"wildcard arg",arg);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 143:27: -> $arg
					{
						adaptor.addChild(root_0, stream_arg.nextTree());
					}


					retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 2 :
					// antlr/PlexilTreeTransforms.g:144:9: ^( OR_KYWD arg= . )
					{
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_1 = _last;
					PlexilTreeNode _first_1 = null;
					_last = (PlexilTreeNode)input.LT(1);
					OR_KYWD41=(PlexilTreeNode)match(input,OR_KYWD,FOLLOW_OR_KYWD_in_trivialReduction931); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_OR_KYWD.add(OR_KYWD41);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = OR_KYWD41;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (PlexilTreeNode)input.LT(1);
					arg=(PlexilTreeNode)input.LT(1);
					matchAny(input); if (state.failed) return retval;
					 
					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = arg;

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: arg
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: arg
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_arg=new RewriteRuleSubtreeStream(adaptor,"wildcard arg",arg);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 144:26: -> $arg
					{
						adaptor.addChild(root_0, stream_arg.nextTree());
					}


					retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 3 :
					// antlr/PlexilTreeTransforms.g:145:9: ^( PLUS arg= . )
					{
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_1 = _last;
					PlexilTreeNode _first_1 = null;
					_last = (PlexilTreeNode)input.LT(1);
					PLUS42=(PlexilTreeNode)match(input,PLUS,FOLLOW_PLUS_in_trivialReduction952); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_PLUS.add(PLUS42);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = PLUS42;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (PlexilTreeNode)input.LT(1);
					arg=(PlexilTreeNode)input.LT(1);
					matchAny(input); if (state.failed) return retval;
					 
					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = arg;

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: arg
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: arg
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_arg=new RewriteRuleSubtreeStream(adaptor,"wildcard arg",arg);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 145:23: -> $arg
					{
						adaptor.addChild(root_0, stream_arg.nextTree());
					}


					retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 4 :
					// antlr/PlexilTreeTransforms.g:146:9: ^( MINUS arg= . )
					{
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_1 = _last;
					PlexilTreeNode _first_1 = null;
					_last = (PlexilTreeNode)input.LT(1);
					MINUS43=(PlexilTreeNode)match(input,MINUS,FOLLOW_MINUS_in_trivialReduction973); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_MINUS.add(MINUS43);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = MINUS43;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (PlexilTreeNode)input.LT(1);
					arg=(PlexilTreeNode)input.LT(1);
					matchAny(input); if (state.failed) return retval;
					 
					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = arg;

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: arg
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: arg
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_arg=new RewriteRuleSubtreeStream(adaptor,"wildcard arg",arg);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 146:24: -> $arg
					{
						adaptor.addChild(root_0, stream_arg.nextTree());
					}


					retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 5 :
					// antlr/PlexilTreeTransforms.g:147:9: ^( ASTERISK arg= . )
					{
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_1 = _last;
					PlexilTreeNode _first_1 = null;
					_last = (PlexilTreeNode)input.LT(1);
					ASTERISK44=(PlexilTreeNode)match(input,ASTERISK,FOLLOW_ASTERISK_in_trivialReduction994); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_ASTERISK.add(ASTERISK44);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = ASTERISK44;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (PlexilTreeNode)input.LT(1);
					arg=(PlexilTreeNode)input.LT(1);
					matchAny(input); if (state.failed) return retval;
					 
					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = arg;

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: arg
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: arg
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_arg=new RewriteRuleSubtreeStream(adaptor,"wildcard arg",arg);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 147:27: -> $arg
					{
						adaptor.addChild(root_0, stream_arg.nextTree());
					}


					retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 6 :
					// antlr/PlexilTreeTransforms.g:148:9: ^( SLASH arg= . )
					{
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_1 = _last;
					PlexilTreeNode _first_1 = null;
					_last = (PlexilTreeNode)input.LT(1);
					SLASH45=(PlexilTreeNode)match(input,SLASH,FOLLOW_SLASH_in_trivialReduction1015); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_SLASH.add(SLASH45);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = SLASH45;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (PlexilTreeNode)input.LT(1);
					arg=(PlexilTreeNode)input.LT(1);
					matchAny(input); if (state.failed) return retval;
					 
					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = arg;

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: arg
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: arg
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_arg=new RewriteRuleSubtreeStream(adaptor,"wildcard arg",arg);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 148:24: -> $arg
					{
						adaptor.addChild(root_0, stream_arg.nextTree());
					}


					retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 7 :
					// antlr/PlexilTreeTransforms.g:149:9: ^( MAX_KYWD arg= . )
					{
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_1 = _last;
					PlexilTreeNode _first_1 = null;
					_last = (PlexilTreeNode)input.LT(1);
					MAX_KYWD46=(PlexilTreeNode)match(input,MAX_KYWD,FOLLOW_MAX_KYWD_in_trivialReduction1036); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_MAX_KYWD.add(MAX_KYWD46);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = MAX_KYWD46;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (PlexilTreeNode)input.LT(1);
					arg=(PlexilTreeNode)input.LT(1);
					matchAny(input); if (state.failed) return retval;
					 
					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = arg;

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: arg
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: arg
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_arg=new RewriteRuleSubtreeStream(adaptor,"wildcard arg",arg);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 149:27: -> $arg
					{
						adaptor.addChild(root_0, stream_arg.nextTree());
					}


					retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 8 :
					// antlr/PlexilTreeTransforms.g:150:9: ^( MIN_KYWD arg= . )
					{
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_1 = _last;
					PlexilTreeNode _first_1 = null;
					_last = (PlexilTreeNode)input.LT(1);
					MIN_KYWD47=(PlexilTreeNode)match(input,MIN_KYWD,FOLLOW_MIN_KYWD_in_trivialReduction1057); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_MIN_KYWD.add(MIN_KYWD47);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = MIN_KYWD47;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (PlexilTreeNode)input.LT(1);
					arg=(PlexilTreeNode)input.LT(1);
					matchAny(input); if (state.failed) return retval;
					 
					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = arg;

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: arg
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: arg
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_arg=new RewriteRuleSubtreeStream(adaptor,"wildcard arg",arg);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 150:27: -> $arg
					{
						adaptor.addChild(root_0, stream_arg.nextTree());
					}


					retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "trivialReduction"


	public static class identityElision_return extends TreeRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "identityElision"
	// antlr/PlexilTreeTransforms.g:157:1: identityElision : ( ^( AND_KYWD (args+= . )* TRUE_KYWD (args+= . )* ) -> ^( AND_KYWD ( $args)* ) | ^( OR_KYWD (args+= . )* FALSE_KYWD (args+= . )* ) -> ^( OR_KYWD ( $args)* ) | ^( PLUS (args+= . )* i= INT (args+= . )* {...}?) -> ^( PLUS ( $args)* ) | ^( PLUS (args+= . )* d= DOUBLE (args+= . )* {...}?) -> ^( PLUS ( $args)* ) | ^( MINUS (args+= . )+ i= INT (args+= . )* {...}?) -> ^( MINUS ( $args)* ) | ^( MINUS (args+= . )+ d= DOUBLE (args+= . )* {...}?) -> ^( MINUS ( $args)* ) | ^( ASTERISK (args+= . )* i= INT (args+= . )* {...}?) -> ^( ASTERISK ( $args)* ) | ^( ASTERISK (args+= . )* d= DOUBLE (args+= . )* {...}?) -> ^( ASTERISK ( $args)* ) | ^( SLASH (args+= . )+ i= INT (args+= . )* {...}?) -> ^( SLASH ( $args)* ) | ^( SLASH (args+= . )+ d= DOUBLE (args+= . )* {...}?) -> ^( SLASH ( $args)* ) );
	public final PlexilTreeTransforms.identityElision_return identityElision() throws RecognitionException {
		PlexilTreeTransforms.identityElision_return retval = new PlexilTreeTransforms.identityElision_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		PlexilTreeNode _first_0 = null;
		PlexilTreeNode _last = null;


		PlexilTreeNode i=null;
		PlexilTreeNode d=null;
		PlexilTreeNode AND_KYWD48=null;
		PlexilTreeNode TRUE_KYWD49=null;
		PlexilTreeNode OR_KYWD50=null;
		PlexilTreeNode FALSE_KYWD51=null;
		PlexilTreeNode PLUS52=null;
		PlexilTreeNode PLUS53=null;
		PlexilTreeNode MINUS54=null;
		PlexilTreeNode MINUS55=null;
		PlexilTreeNode ASTERISK56=null;
		PlexilTreeNode ASTERISK57=null;
		PlexilTreeNode SLASH58=null;
		PlexilTreeNode SLASH59=null;
		PlexilTreeNode args=null;
		List<Object> list_args=null;

		PlexilTreeNode i_tree=null;
		PlexilTreeNode d_tree=null;
		PlexilTreeNode AND_KYWD48_tree=null;
		PlexilTreeNode TRUE_KYWD49_tree=null;
		PlexilTreeNode OR_KYWD50_tree=null;
		PlexilTreeNode FALSE_KYWD51_tree=null;
		PlexilTreeNode PLUS52_tree=null;
		PlexilTreeNode PLUS53_tree=null;
		PlexilTreeNode MINUS54_tree=null;
		PlexilTreeNode MINUS55_tree=null;
		PlexilTreeNode ASTERISK56_tree=null;
		PlexilTreeNode ASTERISK57_tree=null;
		PlexilTreeNode SLASH58_tree=null;
		PlexilTreeNode SLASH59_tree=null;
		PlexilTreeNode args_tree=null;
		RewriteRuleNodeStream stream_OR_KYWD=new RewriteRuleNodeStream(adaptor,"token OR_KYWD");
		RewriteRuleNodeStream stream_FALSE_KYWD=new RewriteRuleNodeStream(adaptor,"token FALSE_KYWD");
		RewriteRuleNodeStream stream_SLASH=new RewriteRuleNodeStream(adaptor,"token SLASH");
		RewriteRuleNodeStream stream_AND_KYWD=new RewriteRuleNodeStream(adaptor,"token AND_KYWD");
		RewriteRuleNodeStream stream_ASTERISK=new RewriteRuleNodeStream(adaptor,"token ASTERISK");
		RewriteRuleNodeStream stream_DOUBLE=new RewriteRuleNodeStream(adaptor,"token DOUBLE");
		RewriteRuleNodeStream stream_INT=new RewriteRuleNodeStream(adaptor,"token INT");
		RewriteRuleNodeStream stream_TRUE_KYWD=new RewriteRuleNodeStream(adaptor,"token TRUE_KYWD");
		RewriteRuleNodeStream stream_PLUS=new RewriteRuleNodeStream(adaptor,"token PLUS");
		RewriteRuleNodeStream stream_MINUS=new RewriteRuleNodeStream(adaptor,"token MINUS");

		try {
			// antlr/PlexilTreeTransforms.g:157:16: ( ^( AND_KYWD (args+= . )* TRUE_KYWD (args+= . )* ) -> ^( AND_KYWD ( $args)* ) | ^( OR_KYWD (args+= . )* FALSE_KYWD (args+= . )* ) -> ^( OR_KYWD ( $args)* ) | ^( PLUS (args+= . )* i= INT (args+= . )* {...}?) -> ^( PLUS ( $args)* ) | ^( PLUS (args+= . )* d= DOUBLE (args+= . )* {...}?) -> ^( PLUS ( $args)* ) | ^( MINUS (args+= . )+ i= INT (args+= . )* {...}?) -> ^( MINUS ( $args)* ) | ^( MINUS (args+= . )+ d= DOUBLE (args+= . )* {...}?) -> ^( MINUS ( $args)* ) | ^( ASTERISK (args+= . )* i= INT (args+= . )* {...}?) -> ^( ASTERISK ( $args)* ) | ^( ASTERISK (args+= . )* d= DOUBLE (args+= . )* {...}?) -> ^( ASTERISK ( $args)* ) | ^( SLASH (args+= . )+ i= INT (args+= . )* {...}?) -> ^( SLASH ( $args)* ) | ^( SLASH (args+= . )+ d= DOUBLE (args+= . )* {...}?) -> ^( SLASH ( $args)* ) )
			int alt45=10;
			alt45 = dfa45.predict(input);
			switch (alt45) {
				case 1 :
					// antlr/PlexilTreeTransforms.g:158:9: ^( AND_KYWD (args+= . )* TRUE_KYWD (args+= . )* )
					{
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_1 = _last;
					PlexilTreeNode _first_1 = null;
					_last = (PlexilTreeNode)input.LT(1);
					AND_KYWD48=(PlexilTreeNode)match(input,AND_KYWD,FOLLOW_AND_KYWD_in_identityElision1092); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_AND_KYWD.add(AND_KYWD48);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = AND_KYWD48;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					// antlr/PlexilTreeTransforms.g:158:20: (args+= . )*
					loop25:
					while (true) {
						int alt25=2;
						alt25 = dfa25.predict(input);
						switch (alt25) {
						case 1 :
							// antlr/PlexilTreeTransforms.g:158:21: args+= .
							{
							_last = (PlexilTreeNode)input.LT(1);
							args=(PlexilTreeNode)input.LT(1);
							matchAny(input); if (state.failed) return retval;
							 
							if ( state.backtracking==1 )
							if ( _first_1==null ) _first_1 = args;

							if (list_args==null) list_args=new ArrayList<Object>();
							list_args.add(args);
							if ( state.backtracking==1 ) {
							retval.tree = _first_0;
							if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
								retval.tree = (PlexilTreeNode)adaptor.getParent(retval.tree);
							}

							}
							break;

						default :
							break loop25;
						}
					}

					_last = (PlexilTreeNode)input.LT(1);
					TRUE_KYWD49=(PlexilTreeNode)match(input,TRUE_KYWD,FOLLOW_TRUE_KYWD_in_identityElision1101); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_TRUE_KYWD.add(TRUE_KYWD49);

					// antlr/PlexilTreeTransforms.g:158:41: (args+= . )*
					loop26:
					while (true) {
						int alt26=2;
						int LA26_0 = input.LA(1);
						if ( ((LA26_0 >= ABS_KYWD && LA26_0 <= XOR_KYWD)) ) {
							alt26=1;
						}

						switch (alt26) {
						case 1 :
							// antlr/PlexilTreeTransforms.g:158:42: args+= .
							{
							_last = (PlexilTreeNode)input.LT(1);
							args=(PlexilTreeNode)input.LT(1);
							matchAny(input); if (state.failed) return retval;
							 
							if ( state.backtracking==1 )
							if ( _first_1==null ) _first_1 = args;

							if (list_args==null) list_args=new ArrayList<Object>();
							list_args.add(args);
							if ( state.backtracking==1 ) {
							retval.tree = _first_0;
							if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
								retval.tree = (PlexilTreeNode)adaptor.getParent(retval.tree);
							}

							}
							break;

						default :
							break loop26;
						}
					}

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: AND_KYWD, args
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: args
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"wildcard args",list_args);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 158:53: -> ^( AND_KYWD ( $args)* )
					{
						// antlr/PlexilTreeTransforms.g:158:56: ^( AND_KYWD ( $args)* )
						{
						PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
						root_1 = (PlexilTreeNode)adaptor.becomeRoot(
						stream_AND_KYWD.nextNode()
						, root_1);
						// antlr/PlexilTreeTransforms.g:158:68: ( $args)*
						while ( stream_args.hasNext() ) {
							adaptor.addChild(root_1, stream_args.nextTree());
						}
						stream_args.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 2 :
					// antlr/PlexilTreeTransforms.g:159:9: ^( OR_KYWD (args+= . )* FALSE_KYWD (args+= . )* )
					{
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_1 = _last;
					PlexilTreeNode _first_1 = null;
					_last = (PlexilTreeNode)input.LT(1);
					OR_KYWD50=(PlexilTreeNode)match(input,OR_KYWD,FOLLOW_OR_KYWD_in_identityElision1130); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_OR_KYWD.add(OR_KYWD50);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = OR_KYWD50;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					// antlr/PlexilTreeTransforms.g:159:19: (args+= . )*
					loop27:
					while (true) {
						int alt27=2;
						alt27 = dfa27.predict(input);
						switch (alt27) {
						case 1 :
							// antlr/PlexilTreeTransforms.g:159:20: args+= .
							{
							_last = (PlexilTreeNode)input.LT(1);
							args=(PlexilTreeNode)input.LT(1);
							matchAny(input); if (state.failed) return retval;
							 
							if ( state.backtracking==1 )
							if ( _first_1==null ) _first_1 = args;

							if (list_args==null) list_args=new ArrayList<Object>();
							list_args.add(args);
							if ( state.backtracking==1 ) {
							retval.tree = _first_0;
							if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
								retval.tree = (PlexilTreeNode)adaptor.getParent(retval.tree);
							}

							}
							break;

						default :
							break loop27;
						}
					}

					_last = (PlexilTreeNode)input.LT(1);
					FALSE_KYWD51=(PlexilTreeNode)match(input,FALSE_KYWD,FOLLOW_FALSE_KYWD_in_identityElision1139); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_FALSE_KYWD.add(FALSE_KYWD51);

					// antlr/PlexilTreeTransforms.g:159:41: (args+= . )*
					loop28:
					while (true) {
						int alt28=2;
						int LA28_0 = input.LA(1);
						if ( ((LA28_0 >= ABS_KYWD && LA28_0 <= XOR_KYWD)) ) {
							alt28=1;
						}

						switch (alt28) {
						case 1 :
							// antlr/PlexilTreeTransforms.g:159:42: args+= .
							{
							_last = (PlexilTreeNode)input.LT(1);
							args=(PlexilTreeNode)input.LT(1);
							matchAny(input); if (state.failed) return retval;
							 
							if ( state.backtracking==1 )
							if ( _first_1==null ) _first_1 = args;

							if (list_args==null) list_args=new ArrayList<Object>();
							list_args.add(args);
							if ( state.backtracking==1 ) {
							retval.tree = _first_0;
							if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
								retval.tree = (PlexilTreeNode)adaptor.getParent(retval.tree);
							}

							}
							break;

						default :
							break loop28;
						}
					}

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: OR_KYWD, args
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: args
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"wildcard args",list_args);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 159:53: -> ^( OR_KYWD ( $args)* )
					{
						// antlr/PlexilTreeTransforms.g:159:56: ^( OR_KYWD ( $args)* )
						{
						PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
						root_1 = (PlexilTreeNode)adaptor.becomeRoot(
						stream_OR_KYWD.nextNode()
						, root_1);
						// antlr/PlexilTreeTransforms.g:159:67: ( $args)*
						while ( stream_args.hasNext() ) {
							adaptor.addChild(root_1, stream_args.nextTree());
						}
						stream_args.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 3 :
					// antlr/PlexilTreeTransforms.g:160:9: ^( PLUS (args+= . )* i= INT (args+= . )* {...}?)
					{
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_1 = _last;
					PlexilTreeNode _first_1 = null;
					_last = (PlexilTreeNode)input.LT(1);
					PLUS52=(PlexilTreeNode)match(input,PLUS,FOLLOW_PLUS_in_identityElision1168); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_PLUS.add(PLUS52);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = PLUS52;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					// antlr/PlexilTreeTransforms.g:160:16: (args+= . )*
					loop29:
					while (true) {
						int alt29=2;
						alt29 = dfa29.predict(input);
						switch (alt29) {
						case 1 :
							// antlr/PlexilTreeTransforms.g:160:17: args+= .
							{
							_last = (PlexilTreeNode)input.LT(1);
							args=(PlexilTreeNode)input.LT(1);
							matchAny(input); if (state.failed) return retval;
							 
							if ( state.backtracking==1 )
							if ( _first_1==null ) _first_1 = args;

							if (list_args==null) list_args=new ArrayList<Object>();
							list_args.add(args);
							if ( state.backtracking==1 ) {
							retval.tree = _first_0;
							if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
								retval.tree = (PlexilTreeNode)adaptor.getParent(retval.tree);
							}

							}
							break;

						default :
							break loop29;
						}
					}

					_last = (PlexilTreeNode)input.LT(1);
					i=(PlexilTreeNode)match(input,INT,FOLLOW_INT_in_identityElision1179); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_INT.add(i);

					// antlr/PlexilTreeTransforms.g:160:33: (args+= . )*
					loop30:
					while (true) {
						int alt30=2;
						int LA30_0 = input.LA(1);
						if ( ((LA30_0 >= ABS_KYWD && LA30_0 <= XOR_KYWD)) ) {
							alt30=1;
						}

						switch (alt30) {
						case 1 :
							// antlr/PlexilTreeTransforms.g:160:34: args+= .
							{
							_last = (PlexilTreeNode)input.LT(1);
							args=(PlexilTreeNode)input.LT(1);
							matchAny(input); if (state.failed) return retval;
							 
							if ( state.backtracking==1 )
							if ( _first_1==null ) _first_1 = args;

							if (list_args==null) list_args=new ArrayList<Object>();
							list_args.add(args);
							if ( state.backtracking==1 ) {
							retval.tree = _first_0;
							if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
								retval.tree = (PlexilTreeNode)adaptor.getParent(retval.tree);
							}

							}
							break;

						default :
							break loop30;
						}
					}

					if ( !((Integer.valueOf((i!=null?i.getText():null)) == 0)) ) {
						if (state.backtracking>0) {state.failed=true; return retval;}
						throw new FailedPredicateException(input, "identityElision", "Integer.valueOf($i.text) == 0");
					}
					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: PLUS, args
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: args
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"wildcard args",list_args);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 160:78: -> ^( PLUS ( $args)* )
					{
						// antlr/PlexilTreeTransforms.g:160:81: ^( PLUS ( $args)* )
						{
						PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
						root_1 = (PlexilTreeNode)adaptor.becomeRoot(
						stream_PLUS.nextNode()
						, root_1);
						// antlr/PlexilTreeTransforms.g:160:89: ( $args)*
						while ( stream_args.hasNext() ) {
							adaptor.addChild(root_1, stream_args.nextTree());
						}
						stream_args.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 4 :
					// antlr/PlexilTreeTransforms.g:161:9: ^( PLUS (args+= . )* d= DOUBLE (args+= . )* {...}?)
					{
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_1 = _last;
					PlexilTreeNode _first_1 = null;
					_last = (PlexilTreeNode)input.LT(1);
					PLUS53=(PlexilTreeNode)match(input,PLUS,FOLLOW_PLUS_in_identityElision1210); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_PLUS.add(PLUS53);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = PLUS53;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					// antlr/PlexilTreeTransforms.g:161:16: (args+= . )*
					loop31:
					while (true) {
						int alt31=2;
						alt31 = dfa31.predict(input);
						switch (alt31) {
						case 1 :
							// antlr/PlexilTreeTransforms.g:161:17: args+= .
							{
							_last = (PlexilTreeNode)input.LT(1);
							args=(PlexilTreeNode)input.LT(1);
							matchAny(input); if (state.failed) return retval;
							 
							if ( state.backtracking==1 )
							if ( _first_1==null ) _first_1 = args;

							if (list_args==null) list_args=new ArrayList<Object>();
							list_args.add(args);
							if ( state.backtracking==1 ) {
							retval.tree = _first_0;
							if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
								retval.tree = (PlexilTreeNode)adaptor.getParent(retval.tree);
							}

							}
							break;

						default :
							break loop31;
						}
					}

					_last = (PlexilTreeNode)input.LT(1);
					d=(PlexilTreeNode)match(input,DOUBLE,FOLLOW_DOUBLE_in_identityElision1221); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_DOUBLE.add(d);

					// antlr/PlexilTreeTransforms.g:161:36: (args+= . )*
					loop32:
					while (true) {
						int alt32=2;
						int LA32_0 = input.LA(1);
						if ( ((LA32_0 >= ABS_KYWD && LA32_0 <= XOR_KYWD)) ) {
							alt32=1;
						}

						switch (alt32) {
						case 1 :
							// antlr/PlexilTreeTransforms.g:161:37: args+= .
							{
							_last = (PlexilTreeNode)input.LT(1);
							args=(PlexilTreeNode)input.LT(1);
							matchAny(input); if (state.failed) return retval;
							 
							if ( state.backtracking==1 )
							if ( _first_1==null ) _first_1 = args;

							if (list_args==null) list_args=new ArrayList<Object>();
							list_args.add(args);
							if ( state.backtracking==1 ) {
							retval.tree = _first_0;
							if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
								retval.tree = (PlexilTreeNode)adaptor.getParent(retval.tree);
							}

							}
							break;

						default :
							break loop32;
						}
					}

					if ( !((Double.valueOf((d!=null?d.getText():null)) == 0)) ) {
						if (state.backtracking>0) {state.failed=true; return retval;}
						throw new FailedPredicateException(input, "identityElision", "Double.valueOf($d.text) == 0");
					}
					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: args, PLUS
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: args
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"wildcard args",list_args);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 161:80: -> ^( PLUS ( $args)* )
					{
						// antlr/PlexilTreeTransforms.g:161:83: ^( PLUS ( $args)* )
						{
						PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
						root_1 = (PlexilTreeNode)adaptor.becomeRoot(
						stream_PLUS.nextNode()
						, root_1);
						// antlr/PlexilTreeTransforms.g:161:91: ( $args)*
						while ( stream_args.hasNext() ) {
							adaptor.addChild(root_1, stream_args.nextTree());
						}
						stream_args.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 5 :
					// antlr/PlexilTreeTransforms.g:162:9: ^( MINUS (args+= . )+ i= INT (args+= . )* {...}?)
					{
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_1 = _last;
					PlexilTreeNode _first_1 = null;
					_last = (PlexilTreeNode)input.LT(1);
					MINUS54=(PlexilTreeNode)match(input,MINUS,FOLLOW_MINUS_in_identityElision1252); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_MINUS.add(MINUS54);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = MINUS54;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					// antlr/PlexilTreeTransforms.g:162:17: (args+= . )+
					int cnt33=0;
					loop33:
					while (true) {
						int alt33=2;
						alt33 = dfa33.predict(input);
						switch (alt33) {
						case 1 :
							// antlr/PlexilTreeTransforms.g:162:18: args+= .
							{
							_last = (PlexilTreeNode)input.LT(1);
							args=(PlexilTreeNode)input.LT(1);
							matchAny(input); if (state.failed) return retval;
							 
							if ( state.backtracking==1 )
							if ( _first_1==null ) _first_1 = args;

							if (list_args==null) list_args=new ArrayList<Object>();
							list_args.add(args);
							if ( state.backtracking==1 ) {
							retval.tree = _first_0;
							if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
								retval.tree = (PlexilTreeNode)adaptor.getParent(retval.tree);
							}

							}
							break;

						default :
							if ( cnt33 >= 1 ) break loop33;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(33, input);
							throw eee;
						}
						cnt33++;
					}

					_last = (PlexilTreeNode)input.LT(1);
					i=(PlexilTreeNode)match(input,INT,FOLLOW_INT_in_identityElision1263); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_INT.add(i);

					// antlr/PlexilTreeTransforms.g:162:34: (args+= . )*
					loop34:
					while (true) {
						int alt34=2;
						int LA34_0 = input.LA(1);
						if ( ((LA34_0 >= ABS_KYWD && LA34_0 <= XOR_KYWD)) ) {
							alt34=1;
						}

						switch (alt34) {
						case 1 :
							// antlr/PlexilTreeTransforms.g:162:35: args+= .
							{
							_last = (PlexilTreeNode)input.LT(1);
							args=(PlexilTreeNode)input.LT(1);
							matchAny(input); if (state.failed) return retval;
							 
							if ( state.backtracking==1 )
							if ( _first_1==null ) _first_1 = args;

							if (list_args==null) list_args=new ArrayList<Object>();
							list_args.add(args);
							if ( state.backtracking==1 ) {
							retval.tree = _first_0;
							if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
								retval.tree = (PlexilTreeNode)adaptor.getParent(retval.tree);
							}

							}
							break;

						default :
							break loop34;
						}
					}

					if ( !((Integer.valueOf((i!=null?i.getText():null)) == 0)) ) {
						if (state.backtracking>0) {state.failed=true; return retval;}
						throw new FailedPredicateException(input, "identityElision", "Integer.valueOf($i.text) == 0");
					}
					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: args, MINUS
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: args
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"wildcard args",list_args);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 162:79: -> ^( MINUS ( $args)* )
					{
						// antlr/PlexilTreeTransforms.g:162:82: ^( MINUS ( $args)* )
						{
						PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
						root_1 = (PlexilTreeNode)adaptor.becomeRoot(
						stream_MINUS.nextNode()
						, root_1);
						// antlr/PlexilTreeTransforms.g:162:91: ( $args)*
						while ( stream_args.hasNext() ) {
							adaptor.addChild(root_1, stream_args.nextTree());
						}
						stream_args.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 6 :
					// antlr/PlexilTreeTransforms.g:163:9: ^( MINUS (args+= . )+ d= DOUBLE (args+= . )* {...}?)
					{
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_1 = _last;
					PlexilTreeNode _first_1 = null;
					_last = (PlexilTreeNode)input.LT(1);
					MINUS55=(PlexilTreeNode)match(input,MINUS,FOLLOW_MINUS_in_identityElision1294); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_MINUS.add(MINUS55);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = MINUS55;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					// antlr/PlexilTreeTransforms.g:163:17: (args+= . )+
					int cnt35=0;
					loop35:
					while (true) {
						int alt35=2;
						alt35 = dfa35.predict(input);
						switch (alt35) {
						case 1 :
							// antlr/PlexilTreeTransforms.g:163:18: args+= .
							{
							_last = (PlexilTreeNode)input.LT(1);
							args=(PlexilTreeNode)input.LT(1);
							matchAny(input); if (state.failed) return retval;
							 
							if ( state.backtracking==1 )
							if ( _first_1==null ) _first_1 = args;

							if (list_args==null) list_args=new ArrayList<Object>();
							list_args.add(args);
							if ( state.backtracking==1 ) {
							retval.tree = _first_0;
							if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
								retval.tree = (PlexilTreeNode)adaptor.getParent(retval.tree);
							}

							}
							break;

						default :
							if ( cnt35 >= 1 ) break loop35;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(35, input);
							throw eee;
						}
						cnt35++;
					}

					_last = (PlexilTreeNode)input.LT(1);
					d=(PlexilTreeNode)match(input,DOUBLE,FOLLOW_DOUBLE_in_identityElision1305); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_DOUBLE.add(d);

					// antlr/PlexilTreeTransforms.g:163:37: (args+= . )*
					loop36:
					while (true) {
						int alt36=2;
						int LA36_0 = input.LA(1);
						if ( ((LA36_0 >= ABS_KYWD && LA36_0 <= XOR_KYWD)) ) {
							alt36=1;
						}

						switch (alt36) {
						case 1 :
							// antlr/PlexilTreeTransforms.g:163:38: args+= .
							{
							_last = (PlexilTreeNode)input.LT(1);
							args=(PlexilTreeNode)input.LT(1);
							matchAny(input); if (state.failed) return retval;
							 
							if ( state.backtracking==1 )
							if ( _first_1==null ) _first_1 = args;

							if (list_args==null) list_args=new ArrayList<Object>();
							list_args.add(args);
							if ( state.backtracking==1 ) {
							retval.tree = _first_0;
							if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
								retval.tree = (PlexilTreeNode)adaptor.getParent(retval.tree);
							}

							}
							break;

						default :
							break loop36;
						}
					}

					if ( !((Double.valueOf((d!=null?d.getText():null)) == 0)) ) {
						if (state.backtracking>0) {state.failed=true; return retval;}
						throw new FailedPredicateException(input, "identityElision", "Double.valueOf($d.text) == 0");
					}
					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: MINUS, args
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: args
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"wildcard args",list_args);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 163:81: -> ^( MINUS ( $args)* )
					{
						// antlr/PlexilTreeTransforms.g:163:84: ^( MINUS ( $args)* )
						{
						PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
						root_1 = (PlexilTreeNode)adaptor.becomeRoot(
						stream_MINUS.nextNode()
						, root_1);
						// antlr/PlexilTreeTransforms.g:163:93: ( $args)*
						while ( stream_args.hasNext() ) {
							adaptor.addChild(root_1, stream_args.nextTree());
						}
						stream_args.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 7 :
					// antlr/PlexilTreeTransforms.g:164:9: ^( ASTERISK (args+= . )* i= INT (args+= . )* {...}?)
					{
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_1 = _last;
					PlexilTreeNode _first_1 = null;
					_last = (PlexilTreeNode)input.LT(1);
					ASTERISK56=(PlexilTreeNode)match(input,ASTERISK,FOLLOW_ASTERISK_in_identityElision1336); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_ASTERISK.add(ASTERISK56);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = ASTERISK56;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					// antlr/PlexilTreeTransforms.g:164:20: (args+= . )*
					loop37:
					while (true) {
						int alt37=2;
						alt37 = dfa37.predict(input);
						switch (alt37) {
						case 1 :
							// antlr/PlexilTreeTransforms.g:164:21: args+= .
							{
							_last = (PlexilTreeNode)input.LT(1);
							args=(PlexilTreeNode)input.LT(1);
							matchAny(input); if (state.failed) return retval;
							 
							if ( state.backtracking==1 )
							if ( _first_1==null ) _first_1 = args;

							if (list_args==null) list_args=new ArrayList<Object>();
							list_args.add(args);
							if ( state.backtracking==1 ) {
							retval.tree = _first_0;
							if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
								retval.tree = (PlexilTreeNode)adaptor.getParent(retval.tree);
							}

							}
							break;

						default :
							break loop37;
						}
					}

					_last = (PlexilTreeNode)input.LT(1);
					i=(PlexilTreeNode)match(input,INT,FOLLOW_INT_in_identityElision1347); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_INT.add(i);

					// antlr/PlexilTreeTransforms.g:164:37: (args+= . )*
					loop38:
					while (true) {
						int alt38=2;
						int LA38_0 = input.LA(1);
						if ( ((LA38_0 >= ABS_KYWD && LA38_0 <= XOR_KYWD)) ) {
							alt38=1;
						}

						switch (alt38) {
						case 1 :
							// antlr/PlexilTreeTransforms.g:164:38: args+= .
							{
							_last = (PlexilTreeNode)input.LT(1);
							args=(PlexilTreeNode)input.LT(1);
							matchAny(input); if (state.failed) return retval;
							 
							if ( state.backtracking==1 )
							if ( _first_1==null ) _first_1 = args;

							if (list_args==null) list_args=new ArrayList<Object>();
							list_args.add(args);
							if ( state.backtracking==1 ) {
							retval.tree = _first_0;
							if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
								retval.tree = (PlexilTreeNode)adaptor.getParent(retval.tree);
							}

							}
							break;

						default :
							break loop38;
						}
					}

					if ( !((Integer.valueOf((i!=null?i.getText():null)) == 1)) ) {
						if (state.backtracking>0) {state.failed=true; return retval;}
						throw new FailedPredicateException(input, "identityElision", "Integer.valueOf($i.text) == 1");
					}
					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: ASTERISK, args
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: args
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"wildcard args",list_args);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 164:82: -> ^( ASTERISK ( $args)* )
					{
						// antlr/PlexilTreeTransforms.g:164:85: ^( ASTERISK ( $args)* )
						{
						PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
						root_1 = (PlexilTreeNode)adaptor.becomeRoot(
						stream_ASTERISK.nextNode()
						, root_1);
						// antlr/PlexilTreeTransforms.g:164:97: ( $args)*
						while ( stream_args.hasNext() ) {
							adaptor.addChild(root_1, stream_args.nextTree());
						}
						stream_args.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 8 :
					// antlr/PlexilTreeTransforms.g:165:9: ^( ASTERISK (args+= . )* d= DOUBLE (args+= . )* {...}?)
					{
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_1 = _last;
					PlexilTreeNode _first_1 = null;
					_last = (PlexilTreeNode)input.LT(1);
					ASTERISK57=(PlexilTreeNode)match(input,ASTERISK,FOLLOW_ASTERISK_in_identityElision1378); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_ASTERISK.add(ASTERISK57);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = ASTERISK57;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					// antlr/PlexilTreeTransforms.g:165:20: (args+= . )*
					loop39:
					while (true) {
						int alt39=2;
						alt39 = dfa39.predict(input);
						switch (alt39) {
						case 1 :
							// antlr/PlexilTreeTransforms.g:165:21: args+= .
							{
							_last = (PlexilTreeNode)input.LT(1);
							args=(PlexilTreeNode)input.LT(1);
							matchAny(input); if (state.failed) return retval;
							 
							if ( state.backtracking==1 )
							if ( _first_1==null ) _first_1 = args;

							if (list_args==null) list_args=new ArrayList<Object>();
							list_args.add(args);
							if ( state.backtracking==1 ) {
							retval.tree = _first_0;
							if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
								retval.tree = (PlexilTreeNode)adaptor.getParent(retval.tree);
							}

							}
							break;

						default :
							break loop39;
						}
					}

					_last = (PlexilTreeNode)input.LT(1);
					d=(PlexilTreeNode)match(input,DOUBLE,FOLLOW_DOUBLE_in_identityElision1389); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_DOUBLE.add(d);

					// antlr/PlexilTreeTransforms.g:165:40: (args+= . )*
					loop40:
					while (true) {
						int alt40=2;
						int LA40_0 = input.LA(1);
						if ( ((LA40_0 >= ABS_KYWD && LA40_0 <= XOR_KYWD)) ) {
							alt40=1;
						}

						switch (alt40) {
						case 1 :
							// antlr/PlexilTreeTransforms.g:165:41: args+= .
							{
							_last = (PlexilTreeNode)input.LT(1);
							args=(PlexilTreeNode)input.LT(1);
							matchAny(input); if (state.failed) return retval;
							 
							if ( state.backtracking==1 )
							if ( _first_1==null ) _first_1 = args;

							if (list_args==null) list_args=new ArrayList<Object>();
							list_args.add(args);
							if ( state.backtracking==1 ) {
							retval.tree = _first_0;
							if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
								retval.tree = (PlexilTreeNode)adaptor.getParent(retval.tree);
							}

							}
							break;

						default :
							break loop40;
						}
					}

					if ( !((Double.valueOf((d!=null?d.getText():null)) == 1)) ) {
						if (state.backtracking>0) {state.failed=true; return retval;}
						throw new FailedPredicateException(input, "identityElision", "Double.valueOf($d.text) == 1");
					}
					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: ASTERISK, args
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: args
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"wildcard args",list_args);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 165:84: -> ^( ASTERISK ( $args)* )
					{
						// antlr/PlexilTreeTransforms.g:165:87: ^( ASTERISK ( $args)* )
						{
						PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
						root_1 = (PlexilTreeNode)adaptor.becomeRoot(
						stream_ASTERISK.nextNode()
						, root_1);
						// antlr/PlexilTreeTransforms.g:165:99: ( $args)*
						while ( stream_args.hasNext() ) {
							adaptor.addChild(root_1, stream_args.nextTree());
						}
						stream_args.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 9 :
					// antlr/PlexilTreeTransforms.g:166:9: ^( SLASH (args+= . )+ i= INT (args+= . )* {...}?)
					{
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_1 = _last;
					PlexilTreeNode _first_1 = null;
					_last = (PlexilTreeNode)input.LT(1);
					SLASH58=(PlexilTreeNode)match(input,SLASH,FOLLOW_SLASH_in_identityElision1420); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_SLASH.add(SLASH58);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = SLASH58;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					// antlr/PlexilTreeTransforms.g:166:17: (args+= . )+
					int cnt41=0;
					loop41:
					while (true) {
						int alt41=2;
						alt41 = dfa41.predict(input);
						switch (alt41) {
						case 1 :
							// antlr/PlexilTreeTransforms.g:166:18: args+= .
							{
							_last = (PlexilTreeNode)input.LT(1);
							args=(PlexilTreeNode)input.LT(1);
							matchAny(input); if (state.failed) return retval;
							 
							if ( state.backtracking==1 )
							if ( _first_1==null ) _first_1 = args;

							if (list_args==null) list_args=new ArrayList<Object>();
							list_args.add(args);
							if ( state.backtracking==1 ) {
							retval.tree = _first_0;
							if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
								retval.tree = (PlexilTreeNode)adaptor.getParent(retval.tree);
							}

							}
							break;

						default :
							if ( cnt41 >= 1 ) break loop41;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(41, input);
							throw eee;
						}
						cnt41++;
					}

					_last = (PlexilTreeNode)input.LT(1);
					i=(PlexilTreeNode)match(input,INT,FOLLOW_INT_in_identityElision1431); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_INT.add(i);

					// antlr/PlexilTreeTransforms.g:166:34: (args+= . )*
					loop42:
					while (true) {
						int alt42=2;
						int LA42_0 = input.LA(1);
						if ( ((LA42_0 >= ABS_KYWD && LA42_0 <= XOR_KYWD)) ) {
							alt42=1;
						}

						switch (alt42) {
						case 1 :
							// antlr/PlexilTreeTransforms.g:166:35: args+= .
							{
							_last = (PlexilTreeNode)input.LT(1);
							args=(PlexilTreeNode)input.LT(1);
							matchAny(input); if (state.failed) return retval;
							 
							if ( state.backtracking==1 )
							if ( _first_1==null ) _first_1 = args;

							if (list_args==null) list_args=new ArrayList<Object>();
							list_args.add(args);
							if ( state.backtracking==1 ) {
							retval.tree = _first_0;
							if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
								retval.tree = (PlexilTreeNode)adaptor.getParent(retval.tree);
							}

							}
							break;

						default :
							break loop42;
						}
					}

					if ( !((Integer.valueOf((i!=null?i.getText():null)) == 1)) ) {
						if (state.backtracking>0) {state.failed=true; return retval;}
						throw new FailedPredicateException(input, "identityElision", "Integer.valueOf($i.text) == 1");
					}
					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: SLASH, args
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: args
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"wildcard args",list_args);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 166:79: -> ^( SLASH ( $args)* )
					{
						// antlr/PlexilTreeTransforms.g:166:82: ^( SLASH ( $args)* )
						{
						PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
						root_1 = (PlexilTreeNode)adaptor.becomeRoot(
						stream_SLASH.nextNode()
						, root_1);
						// antlr/PlexilTreeTransforms.g:166:91: ( $args)*
						while ( stream_args.hasNext() ) {
							adaptor.addChild(root_1, stream_args.nextTree());
						}
						stream_args.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 10 :
					// antlr/PlexilTreeTransforms.g:167:9: ^( SLASH (args+= . )+ d= DOUBLE (args+= . )* {...}?)
					{
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_1 = _last;
					PlexilTreeNode _first_1 = null;
					_last = (PlexilTreeNode)input.LT(1);
					SLASH59=(PlexilTreeNode)match(input,SLASH,FOLLOW_SLASH_in_identityElision1462); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_SLASH.add(SLASH59);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = SLASH59;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					// antlr/PlexilTreeTransforms.g:167:17: (args+= . )+
					int cnt43=0;
					loop43:
					while (true) {
						int alt43=2;
						alt43 = dfa43.predict(input);
						switch (alt43) {
						case 1 :
							// antlr/PlexilTreeTransforms.g:167:18: args+= .
							{
							_last = (PlexilTreeNode)input.LT(1);
							args=(PlexilTreeNode)input.LT(1);
							matchAny(input); if (state.failed) return retval;
							 
							if ( state.backtracking==1 )
							if ( _first_1==null ) _first_1 = args;

							if (list_args==null) list_args=new ArrayList<Object>();
							list_args.add(args);
							if ( state.backtracking==1 ) {
							retval.tree = _first_0;
							if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
								retval.tree = (PlexilTreeNode)adaptor.getParent(retval.tree);
							}

							}
							break;

						default :
							if ( cnt43 >= 1 ) break loop43;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(43, input);
							throw eee;
						}
						cnt43++;
					}

					_last = (PlexilTreeNode)input.LT(1);
					d=(PlexilTreeNode)match(input,DOUBLE,FOLLOW_DOUBLE_in_identityElision1473); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_DOUBLE.add(d);

					// antlr/PlexilTreeTransforms.g:167:37: (args+= . )*
					loop44:
					while (true) {
						int alt44=2;
						int LA44_0 = input.LA(1);
						if ( ((LA44_0 >= ABS_KYWD && LA44_0 <= XOR_KYWD)) ) {
							alt44=1;
						}

						switch (alt44) {
						case 1 :
							// antlr/PlexilTreeTransforms.g:167:38: args+= .
							{
							_last = (PlexilTreeNode)input.LT(1);
							args=(PlexilTreeNode)input.LT(1);
							matchAny(input); if (state.failed) return retval;
							 
							if ( state.backtracking==1 )
							if ( _first_1==null ) _first_1 = args;

							if (list_args==null) list_args=new ArrayList<Object>();
							list_args.add(args);
							if ( state.backtracking==1 ) {
							retval.tree = _first_0;
							if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
								retval.tree = (PlexilTreeNode)adaptor.getParent(retval.tree);
							}

							}
							break;

						default :
							break loop44;
						}
					}

					if ( !((Double.valueOf((d!=null?d.getText():null)) == 1)) ) {
						if (state.backtracking>0) {state.failed=true; return retval;}
						throw new FailedPredicateException(input, "identityElision", "Double.valueOf($d.text) == 1");
					}
					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: SLASH, args
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: args
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"wildcard args",list_args);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 167:81: -> ^( SLASH ( $args)* )
					{
						// antlr/PlexilTreeTransforms.g:167:84: ^( SLASH ( $args)* )
						{
						PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
						root_1 = (PlexilTreeNode)adaptor.becomeRoot(
						stream_SLASH.nextNode()
						, root_1);
						// antlr/PlexilTreeTransforms.g:167:93: ( $args)*
						while ( stream_args.hasNext() ) {
							adaptor.addChild(root_1, stream_args.nextTree());
						}
						stream_args.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "identityElision"


	public static class booleanEqualityReduction_return extends TreeRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "booleanEqualityReduction"
	// antlr/PlexilTreeTransforms.g:170:1: booleanEqualityReduction : ( ^( DEQUALS arg= . TRUE_KYWD ) -> $arg| ^( DEQUALS TRUE_KYWD arg= . ) -> $arg| ^( DEQUALS arg= . FALSE_KYWD ) -> ^( NOT_KYWD $arg) | ^( DEQUALS FALSE_KYWD arg= . ) -> ^( NOT_KYWD $arg) | ^( NEQUALS arg= . FALSE_KYWD ) -> $arg| ^( NEQUALS FALSE_KYWD arg= . ) -> $arg| ^( NEQUALS arg= . TRUE_KYWD ) -> ^( NOT_KYWD $arg) | ^( NEQUALS TRUE_KYWD arg= . ) -> ^( NOT_KYWD $arg) );
	public final PlexilTreeTransforms.booleanEqualityReduction_return booleanEqualityReduction() throws RecognitionException {
		PlexilTreeTransforms.booleanEqualityReduction_return retval = new PlexilTreeTransforms.booleanEqualityReduction_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		PlexilTreeNode _first_0 = null;
		PlexilTreeNode _last = null;


		PlexilTreeNode DEQUALS60=null;
		PlexilTreeNode TRUE_KYWD61=null;
		PlexilTreeNode DEQUALS62=null;
		PlexilTreeNode TRUE_KYWD63=null;
		PlexilTreeNode DEQUALS64=null;
		PlexilTreeNode FALSE_KYWD65=null;
		PlexilTreeNode DEQUALS66=null;
		PlexilTreeNode FALSE_KYWD67=null;
		PlexilTreeNode NEQUALS68=null;
		PlexilTreeNode FALSE_KYWD69=null;
		PlexilTreeNode NEQUALS70=null;
		PlexilTreeNode FALSE_KYWD71=null;
		PlexilTreeNode NEQUALS72=null;
		PlexilTreeNode TRUE_KYWD73=null;
		PlexilTreeNode NEQUALS74=null;
		PlexilTreeNode TRUE_KYWD75=null;
		PlexilTreeNode arg=null;

		PlexilTreeNode DEQUALS60_tree=null;
		PlexilTreeNode TRUE_KYWD61_tree=null;
		PlexilTreeNode DEQUALS62_tree=null;
		PlexilTreeNode TRUE_KYWD63_tree=null;
		PlexilTreeNode DEQUALS64_tree=null;
		PlexilTreeNode FALSE_KYWD65_tree=null;
		PlexilTreeNode DEQUALS66_tree=null;
		PlexilTreeNode FALSE_KYWD67_tree=null;
		PlexilTreeNode NEQUALS68_tree=null;
		PlexilTreeNode FALSE_KYWD69_tree=null;
		PlexilTreeNode NEQUALS70_tree=null;
		PlexilTreeNode FALSE_KYWD71_tree=null;
		PlexilTreeNode NEQUALS72_tree=null;
		PlexilTreeNode TRUE_KYWD73_tree=null;
		PlexilTreeNode NEQUALS74_tree=null;
		PlexilTreeNode TRUE_KYWD75_tree=null;
		PlexilTreeNode arg_tree=null;
		RewriteRuleNodeStream stream_DEQUALS=new RewriteRuleNodeStream(adaptor,"token DEQUALS");
		RewriteRuleNodeStream stream_FALSE_KYWD=new RewriteRuleNodeStream(adaptor,"token FALSE_KYWD");
		RewriteRuleNodeStream stream_NEQUALS=new RewriteRuleNodeStream(adaptor,"token NEQUALS");
		RewriteRuleNodeStream stream_TRUE_KYWD=new RewriteRuleNodeStream(adaptor,"token TRUE_KYWD");

		try {
			// antlr/PlexilTreeTransforms.g:170:25: ( ^( DEQUALS arg= . TRUE_KYWD ) -> $arg| ^( DEQUALS TRUE_KYWD arg= . ) -> $arg| ^( DEQUALS arg= . FALSE_KYWD ) -> ^( NOT_KYWD $arg) | ^( DEQUALS FALSE_KYWD arg= . ) -> ^( NOT_KYWD $arg) | ^( NEQUALS arg= . FALSE_KYWD ) -> $arg| ^( NEQUALS FALSE_KYWD arg= . ) -> $arg| ^( NEQUALS arg= . TRUE_KYWD ) -> ^( NOT_KYWD $arg) | ^( NEQUALS TRUE_KYWD arg= . ) -> ^( NOT_KYWD $arg) )
			int alt46=8;
			alt46 = dfa46.predict(input);
			switch (alt46) {
				case 1 :
					// antlr/PlexilTreeTransforms.g:171:9: ^( DEQUALS arg= . TRUE_KYWD )
					{
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_1 = _last;
					PlexilTreeNode _first_1 = null;
					_last = (PlexilTreeNode)input.LT(1);
					DEQUALS60=(PlexilTreeNode)match(input,DEQUALS,FOLLOW_DEQUALS_in_booleanEqualityReduction1514); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_DEQUALS.add(DEQUALS60);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = DEQUALS60;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (PlexilTreeNode)input.LT(1);
					arg=(PlexilTreeNode)input.LT(1);
					matchAny(input); if (state.failed) return retval;
					 
					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = arg;

					_last = (PlexilTreeNode)input.LT(1);
					TRUE_KYWD61=(PlexilTreeNode)match(input,TRUE_KYWD,FOLLOW_TRUE_KYWD_in_booleanEqualityReduction1520); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_TRUE_KYWD.add(TRUE_KYWD61);

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: arg
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: arg
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_arg=new RewriteRuleSubtreeStream(adaptor,"wildcard arg",arg);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 171:36: -> $arg
					{
						adaptor.addChild(root_0, stream_arg.nextTree());
					}


					retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 2 :
					// antlr/PlexilTreeTransforms.g:172:9: ^( DEQUALS TRUE_KYWD arg= . )
					{
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_1 = _last;
					PlexilTreeNode _first_1 = null;
					_last = (PlexilTreeNode)input.LT(1);
					DEQUALS62=(PlexilTreeNode)match(input,DEQUALS,FOLLOW_DEQUALS_in_booleanEqualityReduction1537); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_DEQUALS.add(DEQUALS62);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = DEQUALS62;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (PlexilTreeNode)input.LT(1);
					TRUE_KYWD63=(PlexilTreeNode)match(input,TRUE_KYWD,FOLLOW_TRUE_KYWD_in_booleanEqualityReduction1539); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_TRUE_KYWD.add(TRUE_KYWD63);

					_last = (PlexilTreeNode)input.LT(1);
					arg=(PlexilTreeNode)input.LT(1);
					matchAny(input); if (state.failed) return retval;
					 
					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = arg;

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: arg
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: arg
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_arg=new RewriteRuleSubtreeStream(adaptor,"wildcard arg",arg);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 172:36: -> $arg
					{
						adaptor.addChild(root_0, stream_arg.nextTree());
					}


					retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 3 :
					// antlr/PlexilTreeTransforms.g:173:9: ^( DEQUALS arg= . FALSE_KYWD )
					{
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_1 = _last;
					PlexilTreeNode _first_1 = null;
					_last = (PlexilTreeNode)input.LT(1);
					DEQUALS64=(PlexilTreeNode)match(input,DEQUALS,FOLLOW_DEQUALS_in_booleanEqualityReduction1560); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_DEQUALS.add(DEQUALS64);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = DEQUALS64;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (PlexilTreeNode)input.LT(1);
					arg=(PlexilTreeNode)input.LT(1);
					matchAny(input); if (state.failed) return retval;
					 
					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = arg;

					_last = (PlexilTreeNode)input.LT(1);
					FALSE_KYWD65=(PlexilTreeNode)match(input,FALSE_KYWD,FOLLOW_FALSE_KYWD_in_booleanEqualityReduction1566); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_FALSE_KYWD.add(FALSE_KYWD65);

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: arg
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: arg
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_arg=new RewriteRuleSubtreeStream(adaptor,"wildcard arg",arg);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 173:37: -> ^( NOT_KYWD $arg)
					{
						// antlr/PlexilTreeTransforms.g:173:40: ^( NOT_KYWD $arg)
						{
						PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
						root_1 = (PlexilTreeNode)adaptor.becomeRoot((PlexilTreeNode)adaptor.create(NOT_KYWD, "NOT_KYWD"), root_1);
						adaptor.addChild(root_1, stream_arg.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 4 :
					// antlr/PlexilTreeTransforms.g:174:9: ^( DEQUALS FALSE_KYWD arg= . )
					{
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_1 = _last;
					PlexilTreeNode _first_1 = null;
					_last = (PlexilTreeNode)input.LT(1);
					DEQUALS66=(PlexilTreeNode)match(input,DEQUALS,FOLLOW_DEQUALS_in_booleanEqualityReduction1587); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_DEQUALS.add(DEQUALS66);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = DEQUALS66;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (PlexilTreeNode)input.LT(1);
					FALSE_KYWD67=(PlexilTreeNode)match(input,FALSE_KYWD,FOLLOW_FALSE_KYWD_in_booleanEqualityReduction1589); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_FALSE_KYWD.add(FALSE_KYWD67);

					_last = (PlexilTreeNode)input.LT(1);
					arg=(PlexilTreeNode)input.LT(1);
					matchAny(input); if (state.failed) return retval;
					 
					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = arg;

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: arg
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: arg
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_arg=new RewriteRuleSubtreeStream(adaptor,"wildcard arg",arg);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 174:37: -> ^( NOT_KYWD $arg)
					{
						// antlr/PlexilTreeTransforms.g:174:40: ^( NOT_KYWD $arg)
						{
						PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
						root_1 = (PlexilTreeNode)adaptor.becomeRoot((PlexilTreeNode)adaptor.create(NOT_KYWD, "NOT_KYWD"), root_1);
						adaptor.addChild(root_1, stream_arg.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 5 :
					// antlr/PlexilTreeTransforms.g:175:9: ^( NEQUALS arg= . FALSE_KYWD )
					{
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_1 = _last;
					PlexilTreeNode _first_1 = null;
					_last = (PlexilTreeNode)input.LT(1);
					NEQUALS68=(PlexilTreeNode)match(input,NEQUALS,FOLLOW_NEQUALS_in_booleanEqualityReduction1614); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_NEQUALS.add(NEQUALS68);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = NEQUALS68;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (PlexilTreeNode)input.LT(1);
					arg=(PlexilTreeNode)input.LT(1);
					matchAny(input); if (state.failed) return retval;
					 
					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = arg;

					_last = (PlexilTreeNode)input.LT(1);
					FALSE_KYWD69=(PlexilTreeNode)match(input,FALSE_KYWD,FOLLOW_FALSE_KYWD_in_booleanEqualityReduction1620); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_FALSE_KYWD.add(FALSE_KYWD69);

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: arg
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: arg
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_arg=new RewriteRuleSubtreeStream(adaptor,"wildcard arg",arg);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 175:37: -> $arg
					{
						adaptor.addChild(root_0, stream_arg.nextTree());
					}


					retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 6 :
					// antlr/PlexilTreeTransforms.g:176:9: ^( NEQUALS FALSE_KYWD arg= . )
					{
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_1 = _last;
					PlexilTreeNode _first_1 = null;
					_last = (PlexilTreeNode)input.LT(1);
					NEQUALS70=(PlexilTreeNode)match(input,NEQUALS,FOLLOW_NEQUALS_in_booleanEqualityReduction1637); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_NEQUALS.add(NEQUALS70);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = NEQUALS70;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (PlexilTreeNode)input.LT(1);
					FALSE_KYWD71=(PlexilTreeNode)match(input,FALSE_KYWD,FOLLOW_FALSE_KYWD_in_booleanEqualityReduction1639); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_FALSE_KYWD.add(FALSE_KYWD71);

					_last = (PlexilTreeNode)input.LT(1);
					arg=(PlexilTreeNode)input.LT(1);
					matchAny(input); if (state.failed) return retval;
					 
					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = arg;

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: arg
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: arg
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_arg=new RewriteRuleSubtreeStream(adaptor,"wildcard arg",arg);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 176:37: -> $arg
					{
						adaptor.addChild(root_0, stream_arg.nextTree());
					}


					retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 7 :
					// antlr/PlexilTreeTransforms.g:177:9: ^( NEQUALS arg= . TRUE_KYWD )
					{
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_1 = _last;
					PlexilTreeNode _first_1 = null;
					_last = (PlexilTreeNode)input.LT(1);
					NEQUALS72=(PlexilTreeNode)match(input,NEQUALS,FOLLOW_NEQUALS_in_booleanEqualityReduction1660); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_NEQUALS.add(NEQUALS72);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = NEQUALS72;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (PlexilTreeNode)input.LT(1);
					arg=(PlexilTreeNode)input.LT(1);
					matchAny(input); if (state.failed) return retval;
					 
					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = arg;

					_last = (PlexilTreeNode)input.LT(1);
					TRUE_KYWD73=(PlexilTreeNode)match(input,TRUE_KYWD,FOLLOW_TRUE_KYWD_in_booleanEqualityReduction1666); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_TRUE_KYWD.add(TRUE_KYWD73);

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: arg
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: arg
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_arg=new RewriteRuleSubtreeStream(adaptor,"wildcard arg",arg);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 177:36: -> ^( NOT_KYWD $arg)
					{
						// antlr/PlexilTreeTransforms.g:177:39: ^( NOT_KYWD $arg)
						{
						PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
						root_1 = (PlexilTreeNode)adaptor.becomeRoot((PlexilTreeNode)adaptor.create(NOT_KYWD, "NOT_KYWD"), root_1);
						adaptor.addChild(root_1, stream_arg.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 8 :
					// antlr/PlexilTreeTransforms.g:178:9: ^( NEQUALS TRUE_KYWD arg= . )
					{
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_1 = _last;
					PlexilTreeNode _first_1 = null;
					_last = (PlexilTreeNode)input.LT(1);
					NEQUALS74=(PlexilTreeNode)match(input,NEQUALS,FOLLOW_NEQUALS_in_booleanEqualityReduction1687); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_NEQUALS.add(NEQUALS74);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = NEQUALS74;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (PlexilTreeNode)input.LT(1);
					TRUE_KYWD75=(PlexilTreeNode)match(input,TRUE_KYWD,FOLLOW_TRUE_KYWD_in_booleanEqualityReduction1689); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_TRUE_KYWD.add(TRUE_KYWD75);

					_last = (PlexilTreeNode)input.LT(1);
					arg=(PlexilTreeNode)input.LT(1);
					matchAny(input); if (state.failed) return retval;
					 
					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = arg;

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: arg
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: arg
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_arg=new RewriteRuleSubtreeStream(adaptor,"wildcard arg",arg);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 178:36: -> ^( NOT_KYWD $arg)
					{
						// antlr/PlexilTreeTransforms.g:178:39: ^( NOT_KYWD $arg)
						{
						PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
						root_1 = (PlexilTreeNode)adaptor.becomeRoot((PlexilTreeNode)adaptor.create(NOT_KYWD, "NOT_KYWD"), root_1);
						adaptor.addChild(root_1, stream_arg.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "booleanEqualityReduction"


	public static class flattenTrivialBlocks_return extends TreeRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "flattenTrivialBlocks"
	// antlr/PlexilTreeTransforms.g:183:1: flattenTrivialBlocks : ( ^( ACTION ^( BLOCK innerUnnamed= unnamedAction ) ) -> $innerUnnamed| ^( ACTION ^( BLOCK innerNamed= namedAction ) ) -> $innerNamed| ^( ACTION outerId= NCNAME ^( BLOCK ^( ACTION body= . ) ) ) -> ^( ACTION $outerId $body) );
	public final PlexilTreeTransforms.flattenTrivialBlocks_return flattenTrivialBlocks() throws RecognitionException {
		PlexilTreeTransforms.flattenTrivialBlocks_return retval = new PlexilTreeTransforms.flattenTrivialBlocks_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		PlexilTreeNode _first_0 = null;
		PlexilTreeNode _last = null;


		PlexilTreeNode outerId=null;
		PlexilTreeNode ACTION76=null;
		PlexilTreeNode BLOCK77=null;
		PlexilTreeNode ACTION78=null;
		PlexilTreeNode BLOCK79=null;
		PlexilTreeNode ACTION80=null;
		PlexilTreeNode BLOCK81=null;
		PlexilTreeNode ACTION82=null;
		PlexilTreeNode body=null;
		TreeRuleReturnScope innerUnnamed =null;
		TreeRuleReturnScope innerNamed =null;

		PlexilTreeNode outerId_tree=null;
		PlexilTreeNode ACTION76_tree=null;
		PlexilTreeNode BLOCK77_tree=null;
		PlexilTreeNode ACTION78_tree=null;
		PlexilTreeNode BLOCK79_tree=null;
		PlexilTreeNode ACTION80_tree=null;
		PlexilTreeNode BLOCK81_tree=null;
		PlexilTreeNode ACTION82_tree=null;
		PlexilTreeNode body_tree=null;
		RewriteRuleNodeStream stream_ACTION=new RewriteRuleNodeStream(adaptor,"token ACTION");
		RewriteRuleNodeStream stream_BLOCK=new RewriteRuleNodeStream(adaptor,"token BLOCK");
		RewriteRuleNodeStream stream_NCNAME=new RewriteRuleNodeStream(adaptor,"token NCNAME");
		RewriteRuleSubtreeStream stream_namedAction=new RewriteRuleSubtreeStream(adaptor,"rule namedAction");
		RewriteRuleSubtreeStream stream_unnamedAction=new RewriteRuleSubtreeStream(adaptor,"rule unnamedAction");

		try {
			// antlr/PlexilTreeTransforms.g:183:21: ( ^( ACTION ^( BLOCK innerUnnamed= unnamedAction ) ) -> $innerUnnamed| ^( ACTION ^( BLOCK innerNamed= namedAction ) ) -> $innerNamed| ^( ACTION outerId= NCNAME ^( BLOCK ^( ACTION body= . ) ) ) -> ^( ACTION $outerId $body) )
			int alt47=3;
			int LA47_0 = input.LA(1);
			if ( (LA47_0==ACTION) ) {
				int LA47_1 = input.LA(2);
				if ( (LA47_1==DOWN) ) {
					int LA47_2 = input.LA(3);
					if ( (LA47_2==BLOCK) ) {
						int LA47_3 = input.LA(4);
						if ( (LA47_3==DOWN) ) {
							int LA47_5 = input.LA(5);
							if ( (LA47_5==ACTION) ) {
								int LA47_6 = input.LA(6);
								if ( (LA47_6==DOWN) ) {
									int LA47_7 = input.LA(7);
									if ( (LA47_7==NCNAME) ) {
										int LA47_8 = input.LA(8);
										if ( ((LA47_8 >= ABS_KYWD && LA47_8 <= XOR_KYWD)) ) {
											alt47=2;
										}
										else if ( ((LA47_8 >= DOWN && LA47_8 <= UP)) ) {
											alt47=1;
										}

										else {
											if (state.backtracking>0) {state.failed=true; return retval;}
											int nvaeMark = input.mark();
											try {
												for (int nvaeConsume = 0; nvaeConsume < 8 - 1; nvaeConsume++) {
													input.consume();
												}
												NoViableAltException nvae =
													new NoViableAltException("", 47, 8, input);
												throw nvae;
											} finally {
												input.rewind(nvaeMark);
											}
										}

									}
									else if ( ((LA47_7 >= ABS_KYWD && LA47_7 <= NAME_KYWD)||(LA47_7 >= NEG_DOUBLE && LA47_7 <= XOR_KYWD)) ) {
										alt47=1;
									}

									else {
										if (state.backtracking>0) {state.failed=true; return retval;}
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 47, 7, input);
											throw nvae;
										} finally {
											input.rewind(nvaeMark);
										}
									}

								}

								else {
									if (state.backtracking>0) {state.failed=true; return retval;}
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 47, 6, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 47, 5, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 47, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}
					else if ( (LA47_2==NCNAME) ) {
						alt47=3;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 47, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 47, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 47, 0, input);
				throw nvae;
			}

			switch (alt47) {
				case 1 :
					// antlr/PlexilTreeTransforms.g:184:9: ^( ACTION ^( BLOCK innerUnnamed= unnamedAction ) )
					{
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_1 = _last;
					PlexilTreeNode _first_1 = null;
					_last = (PlexilTreeNode)input.LT(1);
					ACTION76=(PlexilTreeNode)match(input,ACTION,FOLLOW_ACTION_in_flattenTrivialBlocks1726); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_ACTION.add(ACTION76);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = ACTION76;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_2 = _last;
					PlexilTreeNode _first_2 = null;
					_last = (PlexilTreeNode)input.LT(1);
					BLOCK77=(PlexilTreeNode)match(input,BLOCK,FOLLOW_BLOCK_in_flattenTrivialBlocks1729); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_BLOCK.add(BLOCK77);

					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = BLOCK77;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (PlexilTreeNode)input.LT(1);
					pushFollow(FOLLOW_unnamedAction_in_flattenTrivialBlocks1733);
					innerUnnamed=unnamedAction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==1 ) stream_unnamedAction.add(innerUnnamed.getTree());
					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_2;
					}


					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: innerUnnamed
					// token labels: 
					// rule labels: innerUnnamed, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_innerUnnamed=new RewriteRuleSubtreeStream(adaptor,"rule innerUnnamed",innerUnnamed!=null?innerUnnamed.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 185:9: -> $innerUnnamed
					{
						adaptor.addChild(root_0, stream_innerUnnamed.nextTree());
					}


					retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 2 :
					// antlr/PlexilTreeTransforms.g:186:9: ^( ACTION ^( BLOCK innerNamed= namedAction ) )
					{
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_1 = _last;
					PlexilTreeNode _first_1 = null;
					_last = (PlexilTreeNode)input.LT(1);
					ACTION78=(PlexilTreeNode)match(input,ACTION,FOLLOW_ACTION_in_flattenTrivialBlocks1759); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_ACTION.add(ACTION78);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = ACTION78;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_2 = _last;
					PlexilTreeNode _first_2 = null;
					_last = (PlexilTreeNode)input.LT(1);
					BLOCK79=(PlexilTreeNode)match(input,BLOCK,FOLLOW_BLOCK_in_flattenTrivialBlocks1762); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_BLOCK.add(BLOCK79);

					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = BLOCK79;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (PlexilTreeNode)input.LT(1);
					pushFollow(FOLLOW_namedAction_in_flattenTrivialBlocks1766);
					innerNamed=namedAction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==1 ) stream_namedAction.add(innerNamed.getTree());
					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_2;
					}


					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: innerNamed
					// token labels: 
					// rule labels: innerNamed, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_innerNamed=new RewriteRuleSubtreeStream(adaptor,"rule innerNamed",innerNamed!=null?innerNamed.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 187:9: -> $innerNamed
					{
						adaptor.addChild(root_0, stream_innerNamed.nextTree());
					}


					retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 3 :
					// antlr/PlexilTreeTransforms.g:188:9: ^( ACTION outerId= NCNAME ^( BLOCK ^( ACTION body= . ) ) )
					{
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_1 = _last;
					PlexilTreeNode _first_1 = null;
					_last = (PlexilTreeNode)input.LT(1);
					ACTION80=(PlexilTreeNode)match(input,ACTION,FOLLOW_ACTION_in_flattenTrivialBlocks1792); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_ACTION.add(ACTION80);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = ACTION80;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (PlexilTreeNode)input.LT(1);
					outerId=(PlexilTreeNode)match(input,NCNAME,FOLLOW_NCNAME_in_flattenTrivialBlocks1796); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_NCNAME.add(outerId);

					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_2 = _last;
					PlexilTreeNode _first_2 = null;
					_last = (PlexilTreeNode)input.LT(1);
					BLOCK81=(PlexilTreeNode)match(input,BLOCK,FOLLOW_BLOCK_in_flattenTrivialBlocks1799); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_BLOCK.add(BLOCK81);

					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = BLOCK81;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_3 = _last;
					PlexilTreeNode _first_3 = null;
					_last = (PlexilTreeNode)input.LT(1);
					ACTION82=(PlexilTreeNode)match(input,ACTION,FOLLOW_ACTION_in_flattenTrivialBlocks1802); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_ACTION.add(ACTION82);

					if ( state.backtracking==1 )
					if ( _first_2==null ) _first_2 = ACTION82;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (PlexilTreeNode)input.LT(1);
					body=(PlexilTreeNode)input.LT(1);
					matchAny(input); if (state.failed) return retval;
					 
					if ( state.backtracking==1 )
					if ( _first_3==null ) _first_3 = body;

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_3;
					}


					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_2;
					}


					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: ACTION, outerId, body
					// token labels: outerId
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: body
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleNodeStream stream_outerId=new RewriteRuleNodeStream(adaptor,"token outerId",outerId);
					RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"wildcard body",body);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 189:9: -> ^( ACTION $outerId $body)
					{
						// antlr/PlexilTreeTransforms.g:189:12: ^( ACTION $outerId $body)
						{
						PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
						root_1 = (PlexilTreeNode)adaptor.becomeRoot(
						stream_ACTION.nextNode()
						, root_1);
						adaptor.addChild(root_1, stream_outerId.nextNode());
						adaptor.addChild(root_1, stream_body.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "flattenTrivialBlocks"


	public static class flattenTrivialConcurrences_return extends TreeRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "flattenTrivialConcurrences"
	// antlr/PlexilTreeTransforms.g:192:1: flattenTrivialConcurrences : ( ^( ACTION ^( CONCURRENCE_KYWD innerUnnamed= unnamedAction ) ) -> $innerUnnamed| ^( ACTION ^( CONCURRENCE_KYWD innerNamed= namedAction ) ) -> $innerNamed| ^( ACTION outerId= NCNAME ^( CONCURRENCE_KYWD ^( ACTION body= . ) ) ) -> ^( ACTION $outerId $body) );
	public final PlexilTreeTransforms.flattenTrivialConcurrences_return flattenTrivialConcurrences() throws RecognitionException {
		PlexilTreeTransforms.flattenTrivialConcurrences_return retval = new PlexilTreeTransforms.flattenTrivialConcurrences_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		PlexilTreeNode _first_0 = null;
		PlexilTreeNode _last = null;


		PlexilTreeNode outerId=null;
		PlexilTreeNode ACTION83=null;
		PlexilTreeNode CONCURRENCE_KYWD84=null;
		PlexilTreeNode ACTION85=null;
		PlexilTreeNode CONCURRENCE_KYWD86=null;
		PlexilTreeNode ACTION87=null;
		PlexilTreeNode CONCURRENCE_KYWD88=null;
		PlexilTreeNode ACTION89=null;
		PlexilTreeNode body=null;
		TreeRuleReturnScope innerUnnamed =null;
		TreeRuleReturnScope innerNamed =null;

		PlexilTreeNode outerId_tree=null;
		PlexilTreeNode ACTION83_tree=null;
		PlexilTreeNode CONCURRENCE_KYWD84_tree=null;
		PlexilTreeNode ACTION85_tree=null;
		PlexilTreeNode CONCURRENCE_KYWD86_tree=null;
		PlexilTreeNode ACTION87_tree=null;
		PlexilTreeNode CONCURRENCE_KYWD88_tree=null;
		PlexilTreeNode ACTION89_tree=null;
		PlexilTreeNode body_tree=null;
		RewriteRuleNodeStream stream_ACTION=new RewriteRuleNodeStream(adaptor,"token ACTION");
		RewriteRuleNodeStream stream_CONCURRENCE_KYWD=new RewriteRuleNodeStream(adaptor,"token CONCURRENCE_KYWD");
		RewriteRuleNodeStream stream_NCNAME=new RewriteRuleNodeStream(adaptor,"token NCNAME");
		RewriteRuleSubtreeStream stream_namedAction=new RewriteRuleSubtreeStream(adaptor,"rule namedAction");
		RewriteRuleSubtreeStream stream_unnamedAction=new RewriteRuleSubtreeStream(adaptor,"rule unnamedAction");

		try {
			// antlr/PlexilTreeTransforms.g:192:27: ( ^( ACTION ^( CONCURRENCE_KYWD innerUnnamed= unnamedAction ) ) -> $innerUnnamed| ^( ACTION ^( CONCURRENCE_KYWD innerNamed= namedAction ) ) -> $innerNamed| ^( ACTION outerId= NCNAME ^( CONCURRENCE_KYWD ^( ACTION body= . ) ) ) -> ^( ACTION $outerId $body) )
			int alt48=3;
			int LA48_0 = input.LA(1);
			if ( (LA48_0==ACTION) ) {
				int LA48_1 = input.LA(2);
				if ( (LA48_1==DOWN) ) {
					int LA48_2 = input.LA(3);
					if ( (LA48_2==CONCURRENCE_KYWD) ) {
						int LA48_3 = input.LA(4);
						if ( (LA48_3==DOWN) ) {
							int LA48_5 = input.LA(5);
							if ( (LA48_5==ACTION) ) {
								int LA48_6 = input.LA(6);
								if ( (LA48_6==DOWN) ) {
									int LA48_7 = input.LA(7);
									if ( (LA48_7==NCNAME) ) {
										int LA48_8 = input.LA(8);
										if ( ((LA48_8 >= ABS_KYWD && LA48_8 <= XOR_KYWD)) ) {
											alt48=2;
										}
										else if ( ((LA48_8 >= DOWN && LA48_8 <= UP)) ) {
											alt48=1;
										}

										else {
											if (state.backtracking>0) {state.failed=true; return retval;}
											int nvaeMark = input.mark();
											try {
												for (int nvaeConsume = 0; nvaeConsume < 8 - 1; nvaeConsume++) {
													input.consume();
												}
												NoViableAltException nvae =
													new NoViableAltException("", 48, 8, input);
												throw nvae;
											} finally {
												input.rewind(nvaeMark);
											}
										}

									}
									else if ( ((LA48_7 >= ABS_KYWD && LA48_7 <= NAME_KYWD)||(LA48_7 >= NEG_DOUBLE && LA48_7 <= XOR_KYWD)) ) {
										alt48=1;
									}

									else {
										if (state.backtracking>0) {state.failed=true; return retval;}
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 48, 7, input);
											throw nvae;
										} finally {
											input.rewind(nvaeMark);
										}
									}

								}

								else {
									if (state.backtracking>0) {state.failed=true; return retval;}
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 48, 6, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 48, 5, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 48, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}
					else if ( (LA48_2==NCNAME) ) {
						alt48=3;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 48, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 48, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 48, 0, input);
				throw nvae;
			}

			switch (alt48) {
				case 1 :
					// antlr/PlexilTreeTransforms.g:193:9: ^( ACTION ^( CONCURRENCE_KYWD innerUnnamed= unnamedAction ) )
					{
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_1 = _last;
					PlexilTreeNode _first_1 = null;
					_last = (PlexilTreeNode)input.LT(1);
					ACTION83=(PlexilTreeNode)match(input,ACTION,FOLLOW_ACTION_in_flattenTrivialConcurrences1850); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_ACTION.add(ACTION83);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = ACTION83;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_2 = _last;
					PlexilTreeNode _first_2 = null;
					_last = (PlexilTreeNode)input.LT(1);
					CONCURRENCE_KYWD84=(PlexilTreeNode)match(input,CONCURRENCE_KYWD,FOLLOW_CONCURRENCE_KYWD_in_flattenTrivialConcurrences1853); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_CONCURRENCE_KYWD.add(CONCURRENCE_KYWD84);

					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = CONCURRENCE_KYWD84;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (PlexilTreeNode)input.LT(1);
					pushFollow(FOLLOW_unnamedAction_in_flattenTrivialConcurrences1857);
					innerUnnamed=unnamedAction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==1 ) stream_unnamedAction.add(innerUnnamed.getTree());
					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_2;
					}


					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: innerUnnamed
					// token labels: 
					// rule labels: innerUnnamed, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_innerUnnamed=new RewriteRuleSubtreeStream(adaptor,"rule innerUnnamed",innerUnnamed!=null?innerUnnamed.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 194:9: -> $innerUnnamed
					{
						adaptor.addChild(root_0, stream_innerUnnamed.nextTree());
					}


					retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 2 :
					// antlr/PlexilTreeTransforms.g:195:9: ^( ACTION ^( CONCURRENCE_KYWD innerNamed= namedAction ) )
					{
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_1 = _last;
					PlexilTreeNode _first_1 = null;
					_last = (PlexilTreeNode)input.LT(1);
					ACTION85=(PlexilTreeNode)match(input,ACTION,FOLLOW_ACTION_in_flattenTrivialConcurrences1883); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_ACTION.add(ACTION85);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = ACTION85;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_2 = _last;
					PlexilTreeNode _first_2 = null;
					_last = (PlexilTreeNode)input.LT(1);
					CONCURRENCE_KYWD86=(PlexilTreeNode)match(input,CONCURRENCE_KYWD,FOLLOW_CONCURRENCE_KYWD_in_flattenTrivialConcurrences1886); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_CONCURRENCE_KYWD.add(CONCURRENCE_KYWD86);

					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = CONCURRENCE_KYWD86;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (PlexilTreeNode)input.LT(1);
					pushFollow(FOLLOW_namedAction_in_flattenTrivialConcurrences1890);
					innerNamed=namedAction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==1 ) stream_namedAction.add(innerNamed.getTree());
					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_2;
					}


					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: innerNamed
					// token labels: 
					// rule labels: innerNamed, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_innerNamed=new RewriteRuleSubtreeStream(adaptor,"rule innerNamed",innerNamed!=null?innerNamed.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 196:9: -> $innerNamed
					{
						adaptor.addChild(root_0, stream_innerNamed.nextTree());
					}


					retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;
				case 3 :
					// antlr/PlexilTreeTransforms.g:197:9: ^( ACTION outerId= NCNAME ^( CONCURRENCE_KYWD ^( ACTION body= . ) ) )
					{
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_1 = _last;
					PlexilTreeNode _first_1 = null;
					_last = (PlexilTreeNode)input.LT(1);
					ACTION87=(PlexilTreeNode)match(input,ACTION,FOLLOW_ACTION_in_flattenTrivialConcurrences1916); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_ACTION.add(ACTION87);

					if ( state.backtracking==1 )
					if ( _first_0==null ) _first_0 = ACTION87;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (PlexilTreeNode)input.LT(1);
					outerId=(PlexilTreeNode)match(input,NCNAME,FOLLOW_NCNAME_in_flattenTrivialConcurrences1920); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_NCNAME.add(outerId);

					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_2 = _last;
					PlexilTreeNode _first_2 = null;
					_last = (PlexilTreeNode)input.LT(1);
					CONCURRENCE_KYWD88=(PlexilTreeNode)match(input,CONCURRENCE_KYWD,FOLLOW_CONCURRENCE_KYWD_in_flattenTrivialConcurrences1923); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_CONCURRENCE_KYWD.add(CONCURRENCE_KYWD88);

					if ( state.backtracking==1 )
					if ( _first_1==null ) _first_1 = CONCURRENCE_KYWD88;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (PlexilTreeNode)input.LT(1);
					{
					PlexilTreeNode _save_last_3 = _last;
					PlexilTreeNode _first_3 = null;
					_last = (PlexilTreeNode)input.LT(1);
					ACTION89=(PlexilTreeNode)match(input,ACTION,FOLLOW_ACTION_in_flattenTrivialConcurrences1926); if (state.failed) return retval;
					 
					if ( state.backtracking==1 ) stream_ACTION.add(ACTION89);

					if ( state.backtracking==1 )
					if ( _first_2==null ) _first_2 = ACTION89;
					match(input, Token.DOWN, null); if (state.failed) return retval;
					_last = (PlexilTreeNode)input.LT(1);
					body=(PlexilTreeNode)input.LT(1);
					matchAny(input); if (state.failed) return retval;
					 
					if ( state.backtracking==1 )
					if ( _first_3==null ) _first_3 = body;

					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_3;
					}


					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_2;
					}


					match(input, Token.UP, null); if (state.failed) return retval;
					_last = _save_last_1;
					}


					// AST REWRITE
					// elements: ACTION, body, outerId
					// token labels: outerId
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: body
					if ( state.backtracking==1 ) {
					retval.tree = root_0;
					RewriteRuleNodeStream stream_outerId=new RewriteRuleNodeStream(adaptor,"token outerId",outerId);
					RewriteRuleSubtreeStream stream_body=new RewriteRuleSubtreeStream(adaptor,"wildcard body",body);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 198:9: -> ^( ACTION $outerId $body)
					{
						// antlr/PlexilTreeTransforms.g:198:12: ^( ACTION $outerId $body)
						{
						PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
						root_1 = (PlexilTreeNode)adaptor.becomeRoot(
						stream_ACTION.nextNode()
						, root_1);
						adaptor.addChild(root_1, stream_outerId.nextNode());
						adaptor.addChild(root_1, stream_body.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
					input.replaceChildren(adaptor.getParent(retval.start),
										  adaptor.getChildIndex(retval.start),
										  adaptor.getChildIndex(_last),
										  retval.tree);
					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "flattenTrivialConcurrences"


	public static class bindingContextNode_return extends TreeRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "bindingContextNode"
	// antlr/PlexilTreeTransforms.g:205:1: bindingContextNode : ( BLOCK | CONCURRENCE_KYWD | SEQUENCE_KYWD | UNCHECKED_SEQUENCE_KYWD | TRY_KYWD | FOR_KYWD );
	public final PlexilTreeTransforms.bindingContextNode_return bindingContextNode() throws RecognitionException {
		PlexilTreeTransforms.bindingContextNode_return retval = new PlexilTreeTransforms.bindingContextNode_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		PlexilTreeNode _first_0 = null;
		PlexilTreeNode _last = null;


		PlexilTreeNode set90=null;

		PlexilTreeNode set90_tree=null;

		try {
			// antlr/PlexilTreeTransforms.g:205:19: ( BLOCK | CONCURRENCE_KYWD | SEQUENCE_KYWD | UNCHECKED_SEQUENCE_KYWD | TRY_KYWD | FOR_KYWD )
			// antlr/PlexilTreeTransforms.g:
			{
			_last = (PlexilTreeNode)input.LT(1);
			set90=(PlexilTreeNode)input.LT(1);
			if ( input.LA(1)==BLOCK||input.LA(1)==CONCURRENCE_KYWD||input.LA(1)==FOR_KYWD||input.LA(1)==SEQUENCE_KYWD||(input.LA(1) >= TRY_KYWD && input.LA(1) <= UNCHECKED_SEQUENCE_KYWD) ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}

			if ( state.backtracking==1 ) {
			retval.tree = _first_0;
			if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
				retval.tree = (PlexilTreeNode)adaptor.getParent(retval.tree);
			}
			 

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "bindingContextNode"


	public static class associativeOp_return extends TreeRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "associativeOp"
	// antlr/PlexilTreeTransforms.g:215:1: associativeOp : ( OR_KYWD | AND_KYWD | PLUS | MINUS | ASTERISK | MAX_KYWD | MIN_KYWD );
	public final PlexilTreeTransforms.associativeOp_return associativeOp() throws RecognitionException {
		PlexilTreeTransforms.associativeOp_return retval = new PlexilTreeTransforms.associativeOp_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		PlexilTreeNode _first_0 = null;
		PlexilTreeNode _last = null;


		PlexilTreeNode set91=null;

		PlexilTreeNode set91_tree=null;

		try {
			// antlr/PlexilTreeTransforms.g:215:14: ( OR_KYWD | AND_KYWD | PLUS | MINUS | ASTERISK | MAX_KYWD | MIN_KYWD )
			// antlr/PlexilTreeTransforms.g:
			{
			_last = (PlexilTreeNode)input.LT(1);
			set91=(PlexilTreeNode)input.LT(1);
			if ( input.LA(1)==AND_KYWD||input.LA(1)==ASTERISK||input.LA(1)==MAX_KYWD||(input.LA(1) >= MINUS && input.LA(1) <= MIN_KYWD)||input.LA(1)==OR_KYWD||input.LA(1)==PLUS ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}

			if ( state.backtracking==1 ) {
			retval.tree = _first_0;
			if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
				retval.tree = (PlexilTreeNode)adaptor.getParent(retval.tree);
			}
			 

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "associativeOp"


	public static class namedAction_return extends TreeRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "namedAction"
	// antlr/PlexilTreeTransforms.g:225:1: namedAction : ^( ACTION NCNAME . ) ;
	public final PlexilTreeTransforms.namedAction_return namedAction() throws RecognitionException {
		PlexilTreeTransforms.namedAction_return retval = new PlexilTreeTransforms.namedAction_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		PlexilTreeNode _first_0 = null;
		PlexilTreeNode _last = null;


		PlexilTreeNode ACTION92=null;
		PlexilTreeNode NCNAME93=null;
		PlexilTreeNode wildcard94=null;

		PlexilTreeNode ACTION92_tree=null;
		PlexilTreeNode NCNAME93_tree=null;
		PlexilTreeNode wildcard94_tree=null;

		try {
			// antlr/PlexilTreeTransforms.g:225:12: ( ^( ACTION NCNAME . ) )
			// antlr/PlexilTreeTransforms.g:226:9: ^( ACTION NCNAME . )
			{
			_last = (PlexilTreeNode)input.LT(1);
			{
			PlexilTreeNode _save_last_1 = _last;
			PlexilTreeNode _first_1 = null;
			_last = (PlexilTreeNode)input.LT(1);
			ACTION92=(PlexilTreeNode)match(input,ACTION,FOLLOW_ACTION_in_namedAction2119); if (state.failed) return retval;

			if ( state.backtracking==1 )
			if ( _first_0==null ) _first_0 = ACTION92;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			_last = (PlexilTreeNode)input.LT(1);
			NCNAME93=(PlexilTreeNode)match(input,NCNAME,FOLLOW_NCNAME_in_namedAction2121); if (state.failed) return retval;
			 
			if ( state.backtracking==1 )
			if ( _first_1==null ) _first_1 = NCNAME93;

			_last = (PlexilTreeNode)input.LT(1);
			wildcard94=(PlexilTreeNode)input.LT(1);
			matchAny(input); if (state.failed) return retval;
			 
			if ( state.backtracking==1 )
			if ( _first_1==null ) _first_1 = wildcard94;

			match(input, Token.UP, null); if (state.failed) return retval;
			_last = _save_last_1;
			}


			if ( state.backtracking==1 ) {
			retval.tree = _first_0;
			if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
				retval.tree = (PlexilTreeNode)adaptor.getParent(retval.tree);
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "namedAction"


	public static class unnamedAction_return extends TreeRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "unnamedAction"
	// antlr/PlexilTreeTransforms.g:229:1: unnamedAction : ^( ACTION . ) ;
	public final PlexilTreeTransforms.unnamedAction_return unnamedAction() throws RecognitionException {
		PlexilTreeTransforms.unnamedAction_return retval = new PlexilTreeTransforms.unnamedAction_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		PlexilTreeNode _first_0 = null;
		PlexilTreeNode _last = null;


		PlexilTreeNode ACTION95=null;
		PlexilTreeNode wildcard96=null;

		PlexilTreeNode ACTION95_tree=null;
		PlexilTreeNode wildcard96_tree=null;

		try {
			// antlr/PlexilTreeTransforms.g:229:14: ( ^( ACTION . ) )
			// antlr/PlexilTreeTransforms.g:230:9: ^( ACTION . )
			{
			_last = (PlexilTreeNode)input.LT(1);
			{
			PlexilTreeNode _save_last_1 = _last;
			PlexilTreeNode _first_1 = null;
			_last = (PlexilTreeNode)input.LT(1);
			ACTION95=(PlexilTreeNode)match(input,ACTION,FOLLOW_ACTION_in_unnamedAction2142); if (state.failed) return retval;

			if ( state.backtracking==1 )
			if ( _first_0==null ) _first_0 = ACTION95;
			match(input, Token.DOWN, null); if (state.failed) return retval;
			_last = (PlexilTreeNode)input.LT(1);
			wildcard96=(PlexilTreeNode)input.LT(1);
			matchAny(input); if (state.failed) return retval;
			 
			if ( state.backtracking==1 )
			if ( _first_1==null ) _first_1 = wildcard96;

			match(input, Token.UP, null); if (state.failed) return retval;
			_last = _save_last_1;
			}


			if ( state.backtracking==1 ) {
			retval.tree = _first_0;
			if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
				retval.tree = (PlexilTreeNode)adaptor.getParent(retval.tree);
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "unnamedAction"


	public static class condition_return extends TreeRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "condition"
	// antlr/PlexilTreeTransforms.g:233:1: condition : ^( conditionKywd . ) ;
	public final PlexilTreeTransforms.condition_return condition() throws RecognitionException {
		PlexilTreeTransforms.condition_return retval = new PlexilTreeTransforms.condition_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		PlexilTreeNode _first_0 = null;
		PlexilTreeNode _last = null;


		PlexilTreeNode wildcard98=null;
		TreeRuleReturnScope conditionKywd97 =null;

		PlexilTreeNode wildcard98_tree=null;

		try {
			// antlr/PlexilTreeTransforms.g:233:10: ( ^( conditionKywd . ) )
			// antlr/PlexilTreeTransforms.g:234:9: ^( conditionKywd . )
			{
			_last = (PlexilTreeNode)input.LT(1);
			{
			PlexilTreeNode _save_last_1 = _last;
			PlexilTreeNode _first_1 = null;
			_last = (PlexilTreeNode)input.LT(1);
			pushFollow(FOLLOW_conditionKywd_in_condition2163);
			conditionKywd97=conditionKywd();
			state._fsp--;
			if (state.failed) return retval;

			if ( state.backtracking==1 )
			if ( _first_0==null ) _first_0 = (PlexilTreeNode)conditionKywd97.getTree();
			match(input, Token.DOWN, null); if (state.failed) return retval;
			_last = (PlexilTreeNode)input.LT(1);
			wildcard98=(PlexilTreeNode)input.LT(1);
			matchAny(input); if (state.failed) return retval;
			 
			if ( state.backtracking==1 )
			if ( _first_1==null ) _first_1 = wildcard98;

			match(input, Token.UP, null); if (state.failed) return retval;
			_last = _save_last_1;
			}


			if ( state.backtracking==1 ) {
			retval.tree = _first_0;
			if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
				retval.tree = (PlexilTreeNode)adaptor.getParent(retval.tree);
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "condition"


	public static class conditionKywd_return extends TreeRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "conditionKywd"
	// antlr/PlexilTreeTransforms.g:238:1: conditionKywd : ( END_CONDITION_KYWD | EXIT_CONDITION_KYWD | INVARIANT_CONDITION_KYWD | POST_CONDITION_KYWD | PRE_CONDITION_KYWD | REPEAT_CONDITION_KYWD | SKIP_CONDITION_KYWD | START_CONDITION_KYWD );
	public final PlexilTreeTransforms.conditionKywd_return conditionKywd() throws RecognitionException {
		PlexilTreeTransforms.conditionKywd_return retval = new PlexilTreeTransforms.conditionKywd_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		PlexilTreeNode _first_0 = null;
		PlexilTreeNode _last = null;


		PlexilTreeNode set99=null;

		PlexilTreeNode set99_tree=null;

		try {
			// antlr/PlexilTreeTransforms.g:238:14: ( END_CONDITION_KYWD | EXIT_CONDITION_KYWD | INVARIANT_CONDITION_KYWD | POST_CONDITION_KYWD | PRE_CONDITION_KYWD | REPEAT_CONDITION_KYWD | SKIP_CONDITION_KYWD | START_CONDITION_KYWD )
			// antlr/PlexilTreeTransforms.g:
			{
			_last = (PlexilTreeNode)input.LT(1);
			set99=(PlexilTreeNode)input.LT(1);
			if ( input.LA(1)==END_CONDITION_KYWD||input.LA(1)==EXIT_CONDITION_KYWD||input.LA(1)==INVARIANT_CONDITION_KYWD||input.LA(1)==POST_CONDITION_KYWD||input.LA(1)==PRE_CONDITION_KYWD||input.LA(1)==REPEAT_CONDITION_KYWD||input.LA(1)==SKIP_CONDITION_KYWD||input.LA(1)==START_CONDITION_KYWD ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}

			if ( state.backtracking==1 ) {
			retval.tree = _first_0;
			if ( adaptor.getParent(retval.tree)!=null && adaptor.isNil( adaptor.getParent(retval.tree) ) )
				retval.tree = (PlexilTreeNode)adaptor.getParent(retval.tree);
			}
			 

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "conditionKywd"

	// $ANTLR start synpred2_PlexilTreeTransforms
	public final void synpred2_PlexilTreeTransforms_fragment() throws RecognitionException {
		// antlr/PlexilTreeTransforms.g:84:9: ( leftAssociativeReduction )
		// antlr/PlexilTreeTransforms.g:84:9: leftAssociativeReduction
		{
		pushFollow(FOLLOW_leftAssociativeReduction_in_synpred2_PlexilTreeTransforms168);
		leftAssociativeReduction();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred2_PlexilTreeTransforms

	// $ANTLR start synpred3_PlexilTreeTransforms
	public final void synpred3_PlexilTreeTransforms_fragment() throws RecognitionException {
		// antlr/PlexilTreeTransforms.g:85:9: ( rightAssociativeReduction )
		// antlr/PlexilTreeTransforms.g:85:9: rightAssociativeReduction
		{
		pushFollow(FOLLOW_rightAssociativeReduction_in_synpred3_PlexilTreeTransforms178);
		rightAssociativeReduction();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred3_PlexilTreeTransforms

	// $ANTLR start synpred4_PlexilTreeTransforms
	public final void synpred4_PlexilTreeTransforms_fragment() throws RecognitionException {
		// antlr/PlexilTreeTransforms.g:86:9: ( identityElision )
		// antlr/PlexilTreeTransforms.g:86:9: identityElision
		{
		pushFollow(FOLLOW_identityElision_in_synpred4_PlexilTreeTransforms188);
		identityElision();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred4_PlexilTreeTransforms

	// $ANTLR start synpred6_PlexilTreeTransforms
	public final void synpred6_PlexilTreeTransforms_fragment() throws RecognitionException {
		// antlr/PlexilTreeTransforms.g:88:9: ( trivialReduction )
		// antlr/PlexilTreeTransforms.g:88:9: trivialReduction
		{
		pushFollow(FOLLOW_trivialReduction_in_synpred6_PlexilTreeTransforms208);
		trivialReduction();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred6_PlexilTreeTransforms

	// $ANTLR start synpred47_PlexilTreeTransforms
	public final void synpred47_PlexilTreeTransforms_fragment() throws RecognitionException {
		PlexilTreeNode args=null;
		List<Object> list_args=null;


		// antlr/PlexilTreeTransforms.g:158:21: (args+= . )
		// antlr/PlexilTreeTransforms.g:158:21: args+= .
		{
		args=(PlexilTreeNode)input.LT(1);
		matchAny(input); if (state.failed) return;

		if (list_args==null) list_args=new ArrayList<Object>();
		list_args.add(args);
		}

	}
	// $ANTLR end synpred47_PlexilTreeTransforms

	// $ANTLR start synpred50_PlexilTreeTransforms
	public final void synpred50_PlexilTreeTransforms_fragment() throws RecognitionException {
		PlexilTreeNode args=null;
		List<Object> list_args=null;


		// antlr/PlexilTreeTransforms.g:159:20: (args+= . )
		// antlr/PlexilTreeTransforms.g:159:20: args+= .
		{
		args=(PlexilTreeNode)input.LT(1);
		matchAny(input); if (state.failed) return;

		if (list_args==null) list_args=new ArrayList<Object>();
		list_args.add(args);
		}

	}
	// $ANTLR end synpred50_PlexilTreeTransforms

	// $ANTLR start synpred53_PlexilTreeTransforms
	public final void synpred53_PlexilTreeTransforms_fragment() throws RecognitionException {
		PlexilTreeNode args=null;
		List<Object> list_args=null;


		// antlr/PlexilTreeTransforms.g:160:17: (args+= . )
		// antlr/PlexilTreeTransforms.g:160:17: args+= .
		{
		args=(PlexilTreeNode)input.LT(1);
		matchAny(input); if (state.failed) return;

		if (list_args==null) list_args=new ArrayList<Object>();
		list_args.add(args);
		}

	}
	// $ANTLR end synpred53_PlexilTreeTransforms

	// $ANTLR start synpred55_PlexilTreeTransforms
	public final void synpred55_PlexilTreeTransforms_fragment() throws RecognitionException {
		PlexilTreeNode i=null;
		PlexilTreeNode args=null;
		List<Object> list_args=null;


		// antlr/PlexilTreeTransforms.g:160:9: ( ^( PLUS (args+= . )* i= INT (args+= . )* {...}?) )
		// antlr/PlexilTreeTransforms.g:160:9: ^( PLUS (args+= . )* i= INT (args+= . )* {...}?)
		{
		match(input,PLUS,FOLLOW_PLUS_in_synpred55_PlexilTreeTransforms1168); if (state.failed) return;

		match(input, Token.DOWN, null); if (state.failed) return;
		// antlr/PlexilTreeTransforms.g:160:16: (args+= . )*
		loop70:
		while (true) {
			int alt70=2;
			alt70 = dfa70.predict(input);
			switch (alt70) {
			case 1 :
				// antlr/PlexilTreeTransforms.g:160:17: args+= .
				{
				args=(PlexilTreeNode)input.LT(1);
				matchAny(input); if (state.failed) return;

				if (list_args==null) list_args=new ArrayList<Object>();
				list_args.add(args);
				}
				break;

			default :
				break loop70;
			}
		}

		i=(PlexilTreeNode)match(input,INT,FOLLOW_INT_in_synpred55_PlexilTreeTransforms1179); if (state.failed) return;

		// antlr/PlexilTreeTransforms.g:160:33: (args+= . )*
		loop71:
		while (true) {
			int alt71=2;
			int LA71_0 = input.LA(1);
			if ( ((LA71_0 >= ABS_KYWD && LA71_0 <= XOR_KYWD)) ) {
				alt71=1;
			}

			switch (alt71) {
			case 1 :
				// antlr/PlexilTreeTransforms.g:160:34: args+= .
				{
				args=(PlexilTreeNode)input.LT(1);
				matchAny(input); if (state.failed) return;

				if (list_args==null) list_args=new ArrayList<Object>();
				list_args.add(args);
				}
				break;

			default :
				break loop71;
			}
		}

		if ( !((Integer.valueOf((i!=null?i.getText():null)) == 0)) ) {
			if (state.backtracking>0) {state.failed=true; return;}
			throw new FailedPredicateException(input, "synpred55_PlexilTreeTransforms", "Integer.valueOf($i.text) == 0");
		}
		match(input, Token.UP, null); if (state.failed) return;


		}

	}
	// $ANTLR end synpred55_PlexilTreeTransforms

	// $ANTLR start synpred56_PlexilTreeTransforms
	public final void synpred56_PlexilTreeTransforms_fragment() throws RecognitionException {
		PlexilTreeNode args=null;
		List<Object> list_args=null;


		// antlr/PlexilTreeTransforms.g:161:17: (args+= . )
		// antlr/PlexilTreeTransforms.g:161:17: args+= .
		{
		args=(PlexilTreeNode)input.LT(1);
		matchAny(input); if (state.failed) return;

		if (list_args==null) list_args=new ArrayList<Object>();
		list_args.add(args);
		}

	}
	// $ANTLR end synpred56_PlexilTreeTransforms

	// $ANTLR start synpred58_PlexilTreeTransforms
	public final void synpred58_PlexilTreeTransforms_fragment() throws RecognitionException {
		PlexilTreeNode d=null;
		PlexilTreeNode args=null;
		List<Object> list_args=null;


		// antlr/PlexilTreeTransforms.g:161:9: ( ^( PLUS (args+= . )* d= DOUBLE (args+= . )* {...}?) )
		// antlr/PlexilTreeTransforms.g:161:9: ^( PLUS (args+= . )* d= DOUBLE (args+= . )* {...}?)
		{
		match(input,PLUS,FOLLOW_PLUS_in_synpred58_PlexilTreeTransforms1210); if (state.failed) return;

		match(input, Token.DOWN, null); if (state.failed) return;
		// antlr/PlexilTreeTransforms.g:161:16: (args+= . )*
		loop72:
		while (true) {
			int alt72=2;
			alt72 = dfa72.predict(input);
			switch (alt72) {
			case 1 :
				// antlr/PlexilTreeTransforms.g:161:17: args+= .
				{
				args=(PlexilTreeNode)input.LT(1);
				matchAny(input); if (state.failed) return;

				if (list_args==null) list_args=new ArrayList<Object>();
				list_args.add(args);
				}
				break;

			default :
				break loop72;
			}
		}

		d=(PlexilTreeNode)match(input,DOUBLE,FOLLOW_DOUBLE_in_synpred58_PlexilTreeTransforms1221); if (state.failed) return;

		// antlr/PlexilTreeTransforms.g:161:36: (args+= . )*
		loop73:
		while (true) {
			int alt73=2;
			int LA73_0 = input.LA(1);
			if ( ((LA73_0 >= ABS_KYWD && LA73_0 <= XOR_KYWD)) ) {
				alt73=1;
			}

			switch (alt73) {
			case 1 :
				// antlr/PlexilTreeTransforms.g:161:37: args+= .
				{
				args=(PlexilTreeNode)input.LT(1);
				matchAny(input); if (state.failed) return;

				if (list_args==null) list_args=new ArrayList<Object>();
				list_args.add(args);
				}
				break;

			default :
				break loop73;
			}
		}

		if ( !((Double.valueOf((d!=null?d.getText():null)) == 0)) ) {
			if (state.backtracking>0) {state.failed=true; return;}
			throw new FailedPredicateException(input, "synpred58_PlexilTreeTransforms", "Double.valueOf($d.text) == 0");
		}
		match(input, Token.UP, null); if (state.failed) return;


		}

	}
	// $ANTLR end synpred58_PlexilTreeTransforms

	// $ANTLR start synpred59_PlexilTreeTransforms
	public final void synpred59_PlexilTreeTransforms_fragment() throws RecognitionException {
		PlexilTreeNode args=null;
		List<Object> list_args=null;


		// antlr/PlexilTreeTransforms.g:162:18: (args+= . )
		// antlr/PlexilTreeTransforms.g:162:18: args+= .
		{
		args=(PlexilTreeNode)input.LT(1);
		matchAny(input); if (state.failed) return;

		if (list_args==null) list_args=new ArrayList<Object>();
		list_args.add(args);
		}

	}
	// $ANTLR end synpred59_PlexilTreeTransforms

	// $ANTLR start synpred61_PlexilTreeTransforms
	public final void synpred61_PlexilTreeTransforms_fragment() throws RecognitionException {
		PlexilTreeNode i=null;
		PlexilTreeNode args=null;
		List<Object> list_args=null;


		// antlr/PlexilTreeTransforms.g:162:9: ( ^( MINUS (args+= . )+ i= INT (args+= . )* {...}?) )
		// antlr/PlexilTreeTransforms.g:162:9: ^( MINUS (args+= . )+ i= INT (args+= . )* {...}?)
		{
		match(input,MINUS,FOLLOW_MINUS_in_synpred61_PlexilTreeTransforms1252); if (state.failed) return;

		match(input, Token.DOWN, null); if (state.failed) return;
		// antlr/PlexilTreeTransforms.g:162:17: (args+= . )+
		int cnt74=0;
		loop74:
		while (true) {
			int alt74=2;
			alt74 = dfa74.predict(input);
			switch (alt74) {
			case 1 :
				// antlr/PlexilTreeTransforms.g:162:18: args+= .
				{
				args=(PlexilTreeNode)input.LT(1);
				matchAny(input); if (state.failed) return;

				if (list_args==null) list_args=new ArrayList<Object>();
				list_args.add(args);
				}
				break;

			default :
				if ( cnt74 >= 1 ) break loop74;
				if (state.backtracking>0) {state.failed=true; return;}
				EarlyExitException eee = new EarlyExitException(74, input);
				throw eee;
			}
			cnt74++;
		}

		i=(PlexilTreeNode)match(input,INT,FOLLOW_INT_in_synpred61_PlexilTreeTransforms1263); if (state.failed) return;

		// antlr/PlexilTreeTransforms.g:162:34: (args+= . )*
		loop75:
		while (true) {
			int alt75=2;
			int LA75_0 = input.LA(1);
			if ( ((LA75_0 >= ABS_KYWD && LA75_0 <= XOR_KYWD)) ) {
				alt75=1;
			}

			switch (alt75) {
			case 1 :
				// antlr/PlexilTreeTransforms.g:162:35: args+= .
				{
				args=(PlexilTreeNode)input.LT(1);
				matchAny(input); if (state.failed) return;

				if (list_args==null) list_args=new ArrayList<Object>();
				list_args.add(args);
				}
				break;

			default :
				break loop75;
			}
		}

		if ( !((Integer.valueOf((i!=null?i.getText():null)) == 0)) ) {
			if (state.backtracking>0) {state.failed=true; return;}
			throw new FailedPredicateException(input, "synpred61_PlexilTreeTransforms", "Integer.valueOf($i.text) == 0");
		}
		match(input, Token.UP, null); if (state.failed) return;


		}

	}
	// $ANTLR end synpred61_PlexilTreeTransforms

	// $ANTLR start synpred62_PlexilTreeTransforms
	public final void synpred62_PlexilTreeTransforms_fragment() throws RecognitionException {
		PlexilTreeNode args=null;
		List<Object> list_args=null;


		// antlr/PlexilTreeTransforms.g:163:18: (args+= . )
		// antlr/PlexilTreeTransforms.g:163:18: args+= .
		{
		args=(PlexilTreeNode)input.LT(1);
		matchAny(input); if (state.failed) return;

		if (list_args==null) list_args=new ArrayList<Object>();
		list_args.add(args);
		}

	}
	// $ANTLR end synpred62_PlexilTreeTransforms

	// $ANTLR start synpred64_PlexilTreeTransforms
	public final void synpred64_PlexilTreeTransforms_fragment() throws RecognitionException {
		PlexilTreeNode d=null;
		PlexilTreeNode args=null;
		List<Object> list_args=null;


		// antlr/PlexilTreeTransforms.g:163:9: ( ^( MINUS (args+= . )+ d= DOUBLE (args+= . )* {...}?) )
		// antlr/PlexilTreeTransforms.g:163:9: ^( MINUS (args+= . )+ d= DOUBLE (args+= . )* {...}?)
		{
		match(input,MINUS,FOLLOW_MINUS_in_synpred64_PlexilTreeTransforms1294); if (state.failed) return;

		match(input, Token.DOWN, null); if (state.failed) return;
		// antlr/PlexilTreeTransforms.g:163:17: (args+= . )+
		int cnt76=0;
		loop76:
		while (true) {
			int alt76=2;
			alt76 = dfa76.predict(input);
			switch (alt76) {
			case 1 :
				// antlr/PlexilTreeTransforms.g:163:18: args+= .
				{
				args=(PlexilTreeNode)input.LT(1);
				matchAny(input); if (state.failed) return;

				if (list_args==null) list_args=new ArrayList<Object>();
				list_args.add(args);
				}
				break;

			default :
				if ( cnt76 >= 1 ) break loop76;
				if (state.backtracking>0) {state.failed=true; return;}
				EarlyExitException eee = new EarlyExitException(76, input);
				throw eee;
			}
			cnt76++;
		}

		d=(PlexilTreeNode)match(input,DOUBLE,FOLLOW_DOUBLE_in_synpred64_PlexilTreeTransforms1305); if (state.failed) return;

		// antlr/PlexilTreeTransforms.g:163:37: (args+= . )*
		loop77:
		while (true) {
			int alt77=2;
			int LA77_0 = input.LA(1);
			if ( ((LA77_0 >= ABS_KYWD && LA77_0 <= XOR_KYWD)) ) {
				alt77=1;
			}

			switch (alt77) {
			case 1 :
				// antlr/PlexilTreeTransforms.g:163:38: args+= .
				{
				args=(PlexilTreeNode)input.LT(1);
				matchAny(input); if (state.failed) return;

				if (list_args==null) list_args=new ArrayList<Object>();
				list_args.add(args);
				}
				break;

			default :
				break loop77;
			}
		}

		if ( !((Double.valueOf((d!=null?d.getText():null)) == 0)) ) {
			if (state.backtracking>0) {state.failed=true; return;}
			throw new FailedPredicateException(input, "synpred64_PlexilTreeTransforms", "Double.valueOf($d.text) == 0");
		}
		match(input, Token.UP, null); if (state.failed) return;


		}

	}
	// $ANTLR end synpred64_PlexilTreeTransforms

	// $ANTLR start synpred65_PlexilTreeTransforms
	public final void synpred65_PlexilTreeTransforms_fragment() throws RecognitionException {
		PlexilTreeNode args=null;
		List<Object> list_args=null;


		// antlr/PlexilTreeTransforms.g:164:21: (args+= . )
		// antlr/PlexilTreeTransforms.g:164:21: args+= .
		{
		args=(PlexilTreeNode)input.LT(1);
		matchAny(input); if (state.failed) return;

		if (list_args==null) list_args=new ArrayList<Object>();
		list_args.add(args);
		}

	}
	// $ANTLR end synpred65_PlexilTreeTransforms

	// $ANTLR start synpred67_PlexilTreeTransforms
	public final void synpred67_PlexilTreeTransforms_fragment() throws RecognitionException {
		PlexilTreeNode i=null;
		PlexilTreeNode args=null;
		List<Object> list_args=null;


		// antlr/PlexilTreeTransforms.g:164:9: ( ^( ASTERISK (args+= . )* i= INT (args+= . )* {...}?) )
		// antlr/PlexilTreeTransforms.g:164:9: ^( ASTERISK (args+= . )* i= INT (args+= . )* {...}?)
		{
		match(input,ASTERISK,FOLLOW_ASTERISK_in_synpred67_PlexilTreeTransforms1336); if (state.failed) return;

		match(input, Token.DOWN, null); if (state.failed) return;
		// antlr/PlexilTreeTransforms.g:164:20: (args+= . )*
		loop78:
		while (true) {
			int alt78=2;
			alt78 = dfa78.predict(input);
			switch (alt78) {
			case 1 :
				// antlr/PlexilTreeTransforms.g:164:21: args+= .
				{
				args=(PlexilTreeNode)input.LT(1);
				matchAny(input); if (state.failed) return;

				if (list_args==null) list_args=new ArrayList<Object>();
				list_args.add(args);
				}
				break;

			default :
				break loop78;
			}
		}

		i=(PlexilTreeNode)match(input,INT,FOLLOW_INT_in_synpred67_PlexilTreeTransforms1347); if (state.failed) return;

		// antlr/PlexilTreeTransforms.g:164:37: (args+= . )*
		loop79:
		while (true) {
			int alt79=2;
			int LA79_0 = input.LA(1);
			if ( ((LA79_0 >= ABS_KYWD && LA79_0 <= XOR_KYWD)) ) {
				alt79=1;
			}

			switch (alt79) {
			case 1 :
				// antlr/PlexilTreeTransforms.g:164:38: args+= .
				{
				args=(PlexilTreeNode)input.LT(1);
				matchAny(input); if (state.failed) return;

				if (list_args==null) list_args=new ArrayList<Object>();
				list_args.add(args);
				}
				break;

			default :
				break loop79;
			}
		}

		if ( !((Integer.valueOf((i!=null?i.getText():null)) == 1)) ) {
			if (state.backtracking>0) {state.failed=true; return;}
			throw new FailedPredicateException(input, "synpred67_PlexilTreeTransforms", "Integer.valueOf($i.text) == 1");
		}
		match(input, Token.UP, null); if (state.failed) return;


		}

	}
	// $ANTLR end synpred67_PlexilTreeTransforms

	// $ANTLR start synpred68_PlexilTreeTransforms
	public final void synpred68_PlexilTreeTransforms_fragment() throws RecognitionException {
		PlexilTreeNode args=null;
		List<Object> list_args=null;


		// antlr/PlexilTreeTransforms.g:165:21: (args+= . )
		// antlr/PlexilTreeTransforms.g:165:21: args+= .
		{
		args=(PlexilTreeNode)input.LT(1);
		matchAny(input); if (state.failed) return;

		if (list_args==null) list_args=new ArrayList<Object>();
		list_args.add(args);
		}

	}
	// $ANTLR end synpred68_PlexilTreeTransforms

	// $ANTLR start synpred70_PlexilTreeTransforms
	public final void synpred70_PlexilTreeTransforms_fragment() throws RecognitionException {
		PlexilTreeNode d=null;
		PlexilTreeNode args=null;
		List<Object> list_args=null;


		// antlr/PlexilTreeTransforms.g:165:9: ( ^( ASTERISK (args+= . )* d= DOUBLE (args+= . )* {...}?) )
		// antlr/PlexilTreeTransforms.g:165:9: ^( ASTERISK (args+= . )* d= DOUBLE (args+= . )* {...}?)
		{
		match(input,ASTERISK,FOLLOW_ASTERISK_in_synpred70_PlexilTreeTransforms1378); if (state.failed) return;

		match(input, Token.DOWN, null); if (state.failed) return;
		// antlr/PlexilTreeTransforms.g:165:20: (args+= . )*
		loop80:
		while (true) {
			int alt80=2;
			alt80 = dfa80.predict(input);
			switch (alt80) {
			case 1 :
				// antlr/PlexilTreeTransforms.g:165:21: args+= .
				{
				args=(PlexilTreeNode)input.LT(1);
				matchAny(input); if (state.failed) return;

				if (list_args==null) list_args=new ArrayList<Object>();
				list_args.add(args);
				}
				break;

			default :
				break loop80;
			}
		}

		d=(PlexilTreeNode)match(input,DOUBLE,FOLLOW_DOUBLE_in_synpred70_PlexilTreeTransforms1389); if (state.failed) return;

		// antlr/PlexilTreeTransforms.g:165:40: (args+= . )*
		loop81:
		while (true) {
			int alt81=2;
			int LA81_0 = input.LA(1);
			if ( ((LA81_0 >= ABS_KYWD && LA81_0 <= XOR_KYWD)) ) {
				alt81=1;
			}

			switch (alt81) {
			case 1 :
				// antlr/PlexilTreeTransforms.g:165:41: args+= .
				{
				args=(PlexilTreeNode)input.LT(1);
				matchAny(input); if (state.failed) return;

				if (list_args==null) list_args=new ArrayList<Object>();
				list_args.add(args);
				}
				break;

			default :
				break loop81;
			}
		}

		if ( !((Double.valueOf((d!=null?d.getText():null)) == 1)) ) {
			if (state.backtracking>0) {state.failed=true; return;}
			throw new FailedPredicateException(input, "synpred70_PlexilTreeTransforms", "Double.valueOf($d.text) == 1");
		}
		match(input, Token.UP, null); if (state.failed) return;


		}

	}
	// $ANTLR end synpred70_PlexilTreeTransforms

	// $ANTLR start synpred71_PlexilTreeTransforms
	public final void synpred71_PlexilTreeTransforms_fragment() throws RecognitionException {
		PlexilTreeNode args=null;
		List<Object> list_args=null;


		// antlr/PlexilTreeTransforms.g:166:18: (args+= . )
		// antlr/PlexilTreeTransforms.g:166:18: args+= .
		{
		args=(PlexilTreeNode)input.LT(1);
		matchAny(input); if (state.failed) return;

		if (list_args==null) list_args=new ArrayList<Object>();
		list_args.add(args);
		}

	}
	// $ANTLR end synpred71_PlexilTreeTransforms

	// $ANTLR start synpred73_PlexilTreeTransforms
	public final void synpred73_PlexilTreeTransforms_fragment() throws RecognitionException {
		PlexilTreeNode i=null;
		PlexilTreeNode args=null;
		List<Object> list_args=null;


		// antlr/PlexilTreeTransforms.g:166:9: ( ^( SLASH (args+= . )+ i= INT (args+= . )* {...}?) )
		// antlr/PlexilTreeTransforms.g:166:9: ^( SLASH (args+= . )+ i= INT (args+= . )* {...}?)
		{
		match(input,SLASH,FOLLOW_SLASH_in_synpred73_PlexilTreeTransforms1420); if (state.failed) return;

		match(input, Token.DOWN, null); if (state.failed) return;
		// antlr/PlexilTreeTransforms.g:166:17: (args+= . )+
		int cnt82=0;
		loop82:
		while (true) {
			int alt82=2;
			alt82 = dfa82.predict(input);
			switch (alt82) {
			case 1 :
				// antlr/PlexilTreeTransforms.g:166:18: args+= .
				{
				args=(PlexilTreeNode)input.LT(1);
				matchAny(input); if (state.failed) return;

				if (list_args==null) list_args=new ArrayList<Object>();
				list_args.add(args);
				}
				break;

			default :
				if ( cnt82 >= 1 ) break loop82;
				if (state.backtracking>0) {state.failed=true; return;}
				EarlyExitException eee = new EarlyExitException(82, input);
				throw eee;
			}
			cnt82++;
		}

		i=(PlexilTreeNode)match(input,INT,FOLLOW_INT_in_synpred73_PlexilTreeTransforms1431); if (state.failed) return;

		// antlr/PlexilTreeTransforms.g:166:34: (args+= . )*
		loop83:
		while (true) {
			int alt83=2;
			int LA83_0 = input.LA(1);
			if ( ((LA83_0 >= ABS_KYWD && LA83_0 <= XOR_KYWD)) ) {
				alt83=1;
			}

			switch (alt83) {
			case 1 :
				// antlr/PlexilTreeTransforms.g:166:35: args+= .
				{
				args=(PlexilTreeNode)input.LT(1);
				matchAny(input); if (state.failed) return;

				if (list_args==null) list_args=new ArrayList<Object>();
				list_args.add(args);
				}
				break;

			default :
				break loop83;
			}
		}

		if ( !((Integer.valueOf((i!=null?i.getText():null)) == 1)) ) {
			if (state.backtracking>0) {state.failed=true; return;}
			throw new FailedPredicateException(input, "synpred73_PlexilTreeTransforms", "Integer.valueOf($i.text) == 1");
		}
		match(input, Token.UP, null); if (state.failed) return;


		}

	}
	// $ANTLR end synpred73_PlexilTreeTransforms

	// $ANTLR start synpred74_PlexilTreeTransforms
	public final void synpred74_PlexilTreeTransforms_fragment() throws RecognitionException {
		PlexilTreeNode args=null;
		List<Object> list_args=null;


		// antlr/PlexilTreeTransforms.g:167:18: (args+= . )
		// antlr/PlexilTreeTransforms.g:167:18: args+= .
		{
		args=(PlexilTreeNode)input.LT(1);
		matchAny(input); if (state.failed) return;

		if (list_args==null) list_args=new ArrayList<Object>();
		list_args.add(args);
		}

	}
	// $ANTLR end synpred74_PlexilTreeTransforms

	// $ANTLR start synpred76_PlexilTreeTransforms
	public final void synpred76_PlexilTreeTransforms_fragment() throws RecognitionException {
		PlexilTreeNode arg=null;


		// antlr/PlexilTreeTransforms.g:171:9: ( ^( DEQUALS arg= . TRUE_KYWD ) )
		// antlr/PlexilTreeTransforms.g:171:9: ^( DEQUALS arg= . TRUE_KYWD )
		{
		match(input,DEQUALS,FOLLOW_DEQUALS_in_synpred76_PlexilTreeTransforms1514); if (state.failed) return;

		match(input, Token.DOWN, null); if (state.failed) return;
		arg=(PlexilTreeNode)input.LT(1);
		matchAny(input); if (state.failed) return;

		match(input,TRUE_KYWD,FOLLOW_TRUE_KYWD_in_synpred76_PlexilTreeTransforms1520); if (state.failed) return;

		match(input, Token.UP, null); if (state.failed) return;


		}

	}
	// $ANTLR end synpred76_PlexilTreeTransforms

	// $ANTLR start synpred77_PlexilTreeTransforms
	public final void synpred77_PlexilTreeTransforms_fragment() throws RecognitionException {
		PlexilTreeNode arg=null;


		// antlr/PlexilTreeTransforms.g:172:9: ( ^( DEQUALS TRUE_KYWD arg= . ) )
		// antlr/PlexilTreeTransforms.g:172:9: ^( DEQUALS TRUE_KYWD arg= . )
		{
		match(input,DEQUALS,FOLLOW_DEQUALS_in_synpred77_PlexilTreeTransforms1537); if (state.failed) return;

		match(input, Token.DOWN, null); if (state.failed) return;
		match(input,TRUE_KYWD,FOLLOW_TRUE_KYWD_in_synpred77_PlexilTreeTransforms1539); if (state.failed) return;

		arg=(PlexilTreeNode)input.LT(1);
		matchAny(input); if (state.failed) return;

		match(input, Token.UP, null); if (state.failed) return;


		}

	}
	// $ANTLR end synpred77_PlexilTreeTransforms

	// $ANTLR start synpred78_PlexilTreeTransforms
	public final void synpred78_PlexilTreeTransforms_fragment() throws RecognitionException {
		PlexilTreeNode arg=null;


		// antlr/PlexilTreeTransforms.g:173:9: ( ^( DEQUALS arg= . FALSE_KYWD ) )
		// antlr/PlexilTreeTransforms.g:173:9: ^( DEQUALS arg= . FALSE_KYWD )
		{
		match(input,DEQUALS,FOLLOW_DEQUALS_in_synpred78_PlexilTreeTransforms1560); if (state.failed) return;

		match(input, Token.DOWN, null); if (state.failed) return;
		arg=(PlexilTreeNode)input.LT(1);
		matchAny(input); if (state.failed) return;

		match(input,FALSE_KYWD,FOLLOW_FALSE_KYWD_in_synpred78_PlexilTreeTransforms1566); if (state.failed) return;

		match(input, Token.UP, null); if (state.failed) return;


		}

	}
	// $ANTLR end synpred78_PlexilTreeTransforms

	// $ANTLR start synpred79_PlexilTreeTransforms
	public final void synpred79_PlexilTreeTransforms_fragment() throws RecognitionException {
		PlexilTreeNode arg=null;


		// antlr/PlexilTreeTransforms.g:174:9: ( ^( DEQUALS FALSE_KYWD arg= . ) )
		// antlr/PlexilTreeTransforms.g:174:9: ^( DEQUALS FALSE_KYWD arg= . )
		{
		match(input,DEQUALS,FOLLOW_DEQUALS_in_synpred79_PlexilTreeTransforms1587); if (state.failed) return;

		match(input, Token.DOWN, null); if (state.failed) return;
		match(input,FALSE_KYWD,FOLLOW_FALSE_KYWD_in_synpred79_PlexilTreeTransforms1589); if (state.failed) return;

		arg=(PlexilTreeNode)input.LT(1);
		matchAny(input); if (state.failed) return;

		match(input, Token.UP, null); if (state.failed) return;


		}

	}
	// $ANTLR end synpred79_PlexilTreeTransforms

	// $ANTLR start synpred80_PlexilTreeTransforms
	public final void synpred80_PlexilTreeTransforms_fragment() throws RecognitionException {
		PlexilTreeNode arg=null;


		// antlr/PlexilTreeTransforms.g:175:9: ( ^( NEQUALS arg= . FALSE_KYWD ) )
		// antlr/PlexilTreeTransforms.g:175:9: ^( NEQUALS arg= . FALSE_KYWD )
		{
		match(input,NEQUALS,FOLLOW_NEQUALS_in_synpred80_PlexilTreeTransforms1614); if (state.failed) return;

		match(input, Token.DOWN, null); if (state.failed) return;
		arg=(PlexilTreeNode)input.LT(1);
		matchAny(input); if (state.failed) return;

		match(input,FALSE_KYWD,FOLLOW_FALSE_KYWD_in_synpred80_PlexilTreeTransforms1620); if (state.failed) return;

		match(input, Token.UP, null); if (state.failed) return;


		}

	}
	// $ANTLR end synpred80_PlexilTreeTransforms

	// $ANTLR start synpred81_PlexilTreeTransforms
	public final void synpred81_PlexilTreeTransforms_fragment() throws RecognitionException {
		PlexilTreeNode arg=null;


		// antlr/PlexilTreeTransforms.g:176:9: ( ^( NEQUALS FALSE_KYWD arg= . ) )
		// antlr/PlexilTreeTransforms.g:176:9: ^( NEQUALS FALSE_KYWD arg= . )
		{
		match(input,NEQUALS,FOLLOW_NEQUALS_in_synpred81_PlexilTreeTransforms1637); if (state.failed) return;

		match(input, Token.DOWN, null); if (state.failed) return;
		match(input,FALSE_KYWD,FOLLOW_FALSE_KYWD_in_synpred81_PlexilTreeTransforms1639); if (state.failed) return;

		arg=(PlexilTreeNode)input.LT(1);
		matchAny(input); if (state.failed) return;

		match(input, Token.UP, null); if (state.failed) return;


		}

	}
	// $ANTLR end synpred81_PlexilTreeTransforms

	// $ANTLR start synpred82_PlexilTreeTransforms
	public final void synpred82_PlexilTreeTransforms_fragment() throws RecognitionException {
		PlexilTreeNode arg=null;


		// antlr/PlexilTreeTransforms.g:177:9: ( ^( NEQUALS arg= . TRUE_KYWD ) )
		// antlr/PlexilTreeTransforms.g:177:9: ^( NEQUALS arg= . TRUE_KYWD )
		{
		match(input,NEQUALS,FOLLOW_NEQUALS_in_synpred82_PlexilTreeTransforms1660); if (state.failed) return;

		match(input, Token.DOWN, null); if (state.failed) return;
		arg=(PlexilTreeNode)input.LT(1);
		matchAny(input); if (state.failed) return;

		match(input,TRUE_KYWD,FOLLOW_TRUE_KYWD_in_synpred82_PlexilTreeTransforms1666); if (state.failed) return;

		match(input, Token.UP, null); if (state.failed) return;


		}

	}
	// $ANTLR end synpred82_PlexilTreeTransforms

	// Delegated rules

	public final boolean synpred6_PlexilTreeTransforms() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred6_PlexilTreeTransforms_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred65_PlexilTreeTransforms() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred65_PlexilTreeTransforms_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred58_PlexilTreeTransforms() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred58_PlexilTreeTransforms_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred77_PlexilTreeTransforms() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred77_PlexilTreeTransforms_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred74_PlexilTreeTransforms() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred74_PlexilTreeTransforms_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred68_PlexilTreeTransforms() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred68_PlexilTreeTransforms_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred62_PlexilTreeTransforms() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred62_PlexilTreeTransforms_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred56_PlexilTreeTransforms() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred56_PlexilTreeTransforms_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred81_PlexilTreeTransforms() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred81_PlexilTreeTransforms_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred55_PlexilTreeTransforms() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred55_PlexilTreeTransforms_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred82_PlexilTreeTransforms() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred82_PlexilTreeTransforms_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred3_PlexilTreeTransforms() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred3_PlexilTreeTransforms_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred67_PlexilTreeTransforms() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred67_PlexilTreeTransforms_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred70_PlexilTreeTransforms() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred70_PlexilTreeTransforms_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred79_PlexilTreeTransforms() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred79_PlexilTreeTransforms_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred53_PlexilTreeTransforms() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred53_PlexilTreeTransforms_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred80_PlexilTreeTransforms() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred80_PlexilTreeTransforms_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred73_PlexilTreeTransforms() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred73_PlexilTreeTransforms_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred61_PlexilTreeTransforms() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred61_PlexilTreeTransforms_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred64_PlexilTreeTransforms() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred64_PlexilTreeTransforms_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred76_PlexilTreeTransforms() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred76_PlexilTreeTransforms_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred50_PlexilTreeTransforms() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred50_PlexilTreeTransforms_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred4_PlexilTreeTransforms() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred4_PlexilTreeTransforms_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred71_PlexilTreeTransforms() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred71_PlexilTreeTransforms_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred47_PlexilTreeTransforms() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred47_PlexilTreeTransforms_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred59_PlexilTreeTransforms() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred59_PlexilTreeTransforms_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred78_PlexilTreeTransforms() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred78_PlexilTreeTransforms_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred2_PlexilTreeTransforms() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred2_PlexilTreeTransforms_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}


	protected DFA1 dfa1 = new DFA1(this);
	protected DFA11 dfa11 = new DFA11(this);
	protected DFA13 dfa13 = new DFA13(this);
	protected DFA15 dfa15 = new DFA15(this);
	protected DFA17 dfa17 = new DFA17(this);
	protected DFA19 dfa19 = new DFA19(this);
	protected DFA21 dfa21 = new DFA21(this);
	protected DFA45 dfa45 = new DFA45(this);
	protected DFA25 dfa25 = new DFA25(this);
	protected DFA27 dfa27 = new DFA27(this);
	protected DFA29 dfa29 = new DFA29(this);
	protected DFA31 dfa31 = new DFA31(this);
	protected DFA33 dfa33 = new DFA33(this);
	protected DFA35 dfa35 = new DFA35(this);
	protected DFA37 dfa37 = new DFA37(this);
	protected DFA39 dfa39 = new DFA39(this);
	protected DFA41 dfa41 = new DFA41(this);
	protected DFA43 dfa43 = new DFA43(this);
	protected DFA46 dfa46 = new DFA46(this);
	protected DFA70 dfa70 = new DFA70(this);
	protected DFA72 dfa72 = new DFA72(this);
	protected DFA74 dfa74 = new DFA74(this);
	protected DFA76 dfa76 = new DFA76(this);
	protected DFA78 dfa78 = new DFA78(this);
	protected DFA80 dfa80 = new DFA80(this);
	protected DFA82 dfa82 = new DFA82(this);
	static final String DFA1_eotS =
		"\u0138\uffff";
	static final String DFA1_eofS =
		"\u0138\uffff";
	static final String DFA1_minS =
		"\1\5\1\uffff\10\2\1\uffff\1\2\10\4\1\24\26\2\1\uffff\1\24\1\uffff\1\4"+
		"\3\2\1\uffff\1\4\3\2\1\0\1\4\3\2\1\4\3\2\1\0\1\4\4\2\1\4\3\2\1\0\5\2\1"+
		"\0\1\4\1\uffff\2\4\4\2\1\4\3\2\1\0\5\2\1\0\3\4\1\uffff\3\4\1\2\2\4\1\3"+
		"\2\4\1\2\2\4\1\3\2\4\1\2\2\4\1\3\2\4\4\2\2\4\1\2\1\3\1\2\2\4\1\3\2\4\4"+
		"\2\2\4\1\2\1\3\1\2\1\3\1\2\1\3\1\uffff\1\3\1\2\2\3\1\2\2\3\1\2\2\3\1\2"+
		"\2\3\1\2\2\3\1\2\1\3\2\4\1\2\1\3\1\2\2\3\1\2\2\3\1\2\1\3\2\4\1\2\1\3\1"+
		"\2\5\3\3\2\1\3\1\4\2\3\3\2\1\3\1\4\2\3\4\2\1\3\1\4\2\3\1\2\4\3\4\2\1\3"+
		"\1\4\2\3\1\2\4\3\4\2\2\4\2\0\2\4\2\0\2\4\3\0\2\3\1\0\3\2\2\4\3\0\2\3\1"+
		"\0\3\2\4\4\1\2\1\3\1\2\1\3\1\2\1\3\1\0\1\4\2\0\1\2\1\3\1\0\1\4\2\0\1\2"+
		"\1\3\1\2\17\3\3\0\1\3\1\0\1\3\2\0";
	static final String DFA1_maxS =
		"\1\u00b1\1\uffff\10\2\1\uffff\1\2\10\u00bb\1\145\26\u00bb\1\uffff\1\45"+
		"\1\uffff\4\u00bb\1\uffff\4\u00bb\1\0\10\u00bb\1\0\11\u00bb\1\0\5\u00bb"+
		"\1\0\1\u00bb\1\uffff\12\u00bb\1\0\5\u00bb\1\0\3\u00bb\1\uffff\57\u00bb"+
		"\1\uffff\126\u00bb\2\0\2\u00bb\2\0\2\u00bb\3\0\2\u00bb\1\0\5\u00bb\3\0"+
		"\2\u00bb\1\0\15\u00bb\1\0\1\u00bb\2\0\2\u00bb\1\0\1\u00bb\2\0\22\u00bb"+
		"\3\0\1\u00bb\1\0\1\u00bb\2\0";
	static final String DFA1_acceptS =
		"\1\uffff\1\1\10\uffff\1\5\40\uffff\1\7\1\uffff\1\10\4\uffff\1\6\37\uffff"+
		"\1\4\24\uffff\1\3\57\uffff\1\2\u00a0\uffff";
	static final String DFA1_specialS =
		"\67\uffff\1\26\10\uffff\1\32\11\uffff\1\3\5\uffff\1\5\14\uffff\1\16\5"+
		"\uffff\1\21\u008a\uffff\1\10\1\25\2\uffff\1\14\1\33\2\uffff\1\20\1\24"+
		"\1\6\2\uffff\1\12\5\uffff\1\11\1\13\1\22\2\uffff\1\30\15\uffff\1\1\1\uffff"+
		"\1\35\1\4\2\uffff\1\34\1\uffff\1\17\1\23\22\uffff\1\27\1\0\1\7\1\uffff"+
		"\1\15\1\uffff\1\31\1\2}>";
	static final String[] DFA1_transitionS = {
			"\1\13\2\uffff\1\2\11\uffff\1\6\1\uffff\1\1\20\uffff\1\1\2\uffff\1\12"+
			"\27\uffff\1\1\35\uffff\1\10\1\uffff\1\5\1\11\6\uffff\1\12\23\uffff\1"+
			"\3\12\uffff\1\4\24\uffff\1\1\3\uffff\1\7\17\uffff\2\1",
			"",
			"\1\14",
			"\1\15",
			"\1\16",
			"\1\17",
			"\1\20",
			"\1\21",
			"\1\22",
			"\1\23",
			"",
			"\1\24",
			"\4\27\1\25\u00a5\27\1\26\15\27",
			"\70\32\1\31\77\32\1\30\77\32",
			"\45\36\1\35\36\36\1\34\76\36\1\33\64\36",
			"\134\40\1\37\133\40",
			"\16\44\1\41\26\44\1\43\36\44\1\42\163\44",
			"\u009c\46\1\45\33\46",
			"\132\50\1\47\135\50",
			"\135\52\1\51\132\52",
			"\1\53\20\uffff\1\55\77\uffff\1\54",
			"\1\56\1\62\4\61\1\57\u00a5\61\1\60\15\61",
			"\1\63\1\67\4\66\1\64\u00a5\66\1\65\15\66",
			"\1\63\1\62\4\61\1\57\u00a5\61\1\60\15\61",
			"\1\70\1\62\70\73\1\72\77\73\1\71\77\73",
			"\1\74\1\100\70\77\1\76\77\77\1\75\77\77",
			"\1\74\1\62\70\73\1\72\77\73\1\71\77\73",
			"\1\101\1\62\45\105\1\104\36\105\1\103\76\105\1\102\64\105",
			"\1\106\1\112\45\113\1\111\36\113\1\110\76\113\1\107\64\113",
			"\1\106\1\120\45\117\1\116\36\117\1\115\76\117\1\114\64\117",
			"\1\106\1\62\45\105\1\104\36\105\1\103\76\105\1\102\64\105",
			"\1\121\1\62\u00b8\122",
			"\1\123\1\62\u00b8\122",
			"\1\124\1\62\16\130\1\125\26\130\1\127\36\130\1\126\163\130",
			"\1\131\1\135\16\136\1\132\26\136\1\134\36\136\1\133\163\136",
			"\1\131\1\143\16\142\1\137\26\142\1\141\36\142\1\140\163\142",
			"\1\131\1\62\16\130\1\125\26\130\1\127\36\130\1\126\163\130",
			"\1\144\1\62\u00b8\122",
			"\1\145\1\62\u00b8\122",
			"\1\146\1\62\u00b8\147",
			"\1\150\1\62\u00b8\147",
			"\1\151\1\62\u00b8\147",
			"\1\152\1\62\u00b8\147",
			"",
			"\1\53\20\uffff\1\55",
			"",
			"\u00b8\153",
			"\1\154\1\uffff\4\61\1\57\u00a5\61\1\60\15\61",
			"\1\155\1\122\4\66\1\64\u00a5\66\1\65\15\66",
			"\1\155\1\uffff\4\61\1\57\u00a5\61\1\60\15\61",
			"",
			"\u00b8\156",
			"\1\157\1\122\4\66\1\64\u00a5\66\1\65\15\66",
			"\1\160\1\122\4\66\1\64\u00a5\66\1\65\15\66",
			"\1\160\1\122\4\66\1\64\u00a5\66\1\65\15\66",
			"\1\uffff",
			"\u00b8\161",
			"\1\162\1\uffff\70\73\1\72\77\73\1\71\77\73",
			"\1\163\1\122\70\77\1\76\77\77\1\75\77\77",
			"\1\163\1\uffff\70\73\1\72\77\73\1\71\77\73",
			"\u00b8\164",
			"\1\165\1\122\70\77\1\76\77\77\1\75\77\77",
			"\1\166\1\122\70\77\1\76\77\77\1\75\77\77",
			"\1\166\1\122\70\77\1\76\77\77\1\75\77\77",
			"\1\uffff",
			"\u00b8\167",
			"\1\170\1\uffff\45\105\1\104\36\105\1\103\76\105\1\102\64\105",
			"\1\171\1\122\45\113\1\111\36\113\1\110\76\113\1\107\64\113",
			"\1\171\1\122\45\117\1\116\36\117\1\115\76\117\1\114\64\117",
			"\1\171\1\uffff\45\105\1\104\36\105\1\103\76\105\1\102\64\105",
			"\u00b8\172",
			"\1\173\1\122\45\113\1\111\36\113\1\110\76\113\1\107\64\113",
			"\1\174\1\122\45\113\1\111\36\113\1\110\76\113\1\107\64\113",
			"\1\174\1\122\45\u0080\1\177\36\u0080\1\176\76\u0080\1\175\64\u0080",
			"\1\uffff",
			"\1\174\1\122\45\113\1\111\36\113\1\110\76\113\1\107\64\113",
			"\1\u0081\1\122\45\117\1\116\36\117\1\115\76\117\1\114\64\117",
			"\1\u0082\1\122\45\u0080\1\177\36\u0080\1\176\76\u0080\1\175\64\u0080",
			"\1\u0082\1\122\45\117\1\116\36\117\1\115\76\117\1\114\64\117",
			"\1\u0082\1\122\45\117\1\116\36\117\1\115\76\117\1\114\64\117",
			"\1\uffff",
			"\u00b8\u0083",
			"",
			"\u00b8\u0084",
			"\u00b8\u0085",
			"\1\u0086\1\uffff\16\130\1\125\26\130\1\127\36\130\1\126\163\130",
			"\1\u0087\1\122\16\136\1\132\26\136\1\134\36\136\1\133\163\136",
			"\1\u0087\1\122\16\142\1\137\26\142\1\141\36\142\1\140\163\142",
			"\1\u0087\1\uffff\16\130\1\125\26\130\1\127\36\130\1\126\163\130",
			"\u00b8\u0088",
			"\1\u0089\1\122\16\136\1\132\26\136\1\134\36\136\1\133\163\136",
			"\1\u008a\1\122\16\136\1\132\26\136\1\134\36\136\1\133\163\136",
			"\1\u008a\1\122\16\u008e\1\u008b\26\u008e\1\u008d\36\u008e\1\u008c\163"+
			"\u008e",
			"\1\uffff",
			"\1\u008a\1\122\16\136\1\132\26\136\1\134\36\136\1\133\163\136",
			"\1\u008f\1\122\16\142\1\137\26\142\1\141\36\142\1\140\163\142",
			"\1\u0090\1\122\16\u008e\1\u008b\26\u008e\1\u008d\36\u008e\1\u008c\163"+
			"\u008e",
			"\1\u0090\1\122\16\142\1\137\26\142\1\141\36\142\1\140\163\142",
			"\1\u0090\1\122\16\142\1\137\26\142\1\141\36\142\1\140\163\142",
			"\1\uffff",
			"\u00b8\u0091",
			"\u00b8\u0092",
			"\u00b8\u0093",
			"",
			"\u00b8\u0094",
			"\u00b8\u0095",
			"\u00b8\u0096",
			"\1\u0097\1\u0098\u00b8\153",
			"\u00b8\u0099",
			"\u00b8\u009a",
			"\1\u009b\u00b8\156",
			"\u00b8\u009c",
			"\u00b8\u009d",
			"\1\u0097\1\u009e\u00b8\161",
			"\u00b8\u009f",
			"\u00b8\u00a0",
			"\1\u00a1\u00b8\164",
			"\u00b8\u00a2",
			"\u00b8\u00a3",
			"\1\u0097\1\u00a4\u00b8\167",
			"\u00b8\u00a5",
			"\u00b8\u00a6",
			"\1\u00a7\u00b8\172",
			"\u00b8\u00a8",
			"\u00b8\u00a9",
			"\1\u00aa\1\122\45\u0080\1\177\36\u0080\1\176\76\u0080\1\175\64\u0080",
			"\1\u00ab\1\122\45\u0080\1\177\36\u0080\1\176\76\u0080\1\175\64\u0080",
			"\1\u00ab\1\122\45\u0080\1\177\36\u0080\1\176\76\u0080\1\175\64\u0080",
			"\1\u00ab\1\122\45\u0080\1\177\36\u0080\1\176\76\u0080\1\175\64\u0080",
			"\u00b8\u00ac",
			"\u00b8\u00ad",
			"\1\u0097\1\u00af\u00b8\u00ae",
			"\1\u00af\u00b8\u0084",
			"\1\u0097\1\u00b0\u00b8\u0085",
			"\u00b8\u00b1",
			"\u00b8\u00b2",
			"\1\u00b3\u00b8\u0088",
			"\u00b8\u00b4",
			"\u00b8\u00b5",
			"\1\u00b6\1\122\16\u008e\1\u008b\26\u008e\1\u008d\36\u008e\1\u008c\163"+
			"\u008e",
			"\1\u00b7\1\122\16\u008e\1\u008b\26\u008e\1\u008d\36\u008e\1\u008c\163"+
			"\u008e",
			"\1\u00b7\1\122\16\u008e\1\u008b\26\u008e\1\u008d\36\u008e\1\u008c\163"+
			"\u008e",
			"\1\u00b7\1\122\16\u008e\1\u008b\26\u008e\1\u008d\36\u008e\1\u008c\163"+
			"\u008e",
			"\u00b8\u00b8",
			"\u00b8\u00b9",
			"\1\u0097\1\u00bb\u00b8\u00ba",
			"\1\u00bb\u00b8\u0092",
			"\1\u0097\1\u00bc\u00b8\u0093",
			"\1\u00bd\u00b8\u0094",
			"\1\u0097\1\u00be\u00b8\u0095",
			"\1\u00bf\u00b8\u0096",
			"",
			"\1\62\4\u00c2\1\u00c0\u00a5\u00c2\1\u00c1\15\u00c2",
			"\1\147\1\u00c3\u00b8\u0099",
			"\1\u00c4\u00b8\u009a",
			"\1\62\4\61\1\57\u00a5\61\1\60\15\61",
			"\1\147\1\u00c5\u00b8\u009c",
			"\1\u00c6\u00b8\u009d",
			"\1\62\70\u00c9\1\u00c8\77\u00c9\1\u00c7\77\u00c9",
			"\1\147\1\u00ca\u00b8\u009f",
			"\1\u00cb\u00b8\u00a0",
			"\1\62\70\73\1\72\77\73\1\71\77\73",
			"\1\147\1\u00cc\u00b8\u00a2",
			"\1\u00cd\u00b8\u00a3",
			"\1\62\45\u00d1\1\u00d0\36\u00d1\1\u00cf\76\u00d1\1\u00ce\64\u00d1",
			"\1\147\1\u00d2\u00b8\u00a5",
			"\1\u00d3\u00b8\u00a6",
			"\1\62\45\105\1\104\36\105\1\103\76\105\1\102\64\105",
			"\1\147\1\u00d4\u00b8\u00a8",
			"\1\u00d5\u00b8\u00a9",
			"\u00b8\u00d6",
			"\u00b8\u00d7",
			"\1\147\1\u00d8\u00b8\u00ac",
			"\1\u00d9\u00b8\u00ad",
			"\1\u0097\1\u00da\u00b8\u00ae",
			"\1\62\u00b8\122",
			"\1\62\16\u00de\1\u00db\26\u00de\1\u00dd\36\u00de\1\u00dc\163\u00de",
			"\1\147\1\u00df\u00b8\u00b1",
			"\1\u00e0\u00b8\u00b2",
			"\1\62\16\130\1\125\26\130\1\127\36\130\1\126\163\130",
			"\1\147\1\u00e1\u00b8\u00b4",
			"\1\u00e2\u00b8\u00b5",
			"\u00b8\u00e3",
			"\u00b8\u00e4",
			"\1\147\1\u00e5\u00b8\u00b8",
			"\1\u00e6\u00b8\u00b9",
			"\1\u0097\1\u00e7\u00b8\u00ba",
			"\1\62\u00b8\122",
			"\1\62\132\u00e9\1\u00e8\135\u00e9",
			"\1\62\u00b8\147",
			"\1\62\135\u00eb\1\u00ea\132\u00eb",
			"\1\62\u00b8\147",
			"\1\u00ec\1\u0097\4\61\1\57\u00a5\61\1\60\15\61",
			"\1\u00ed\1\u00ee\4\66\1\64\u00a5\66\1\65\15\66",
			"\1\u00ed\1\u0097\4\61\1\57\u00a5\61\1\60\15\61",
			"\1\147\4\61\1\57\u00a5\61\1\60\15\61",
			"\4\61\1\57\u00a5\61\1\60\15\61",
			"\1\u00ef\4\66\1\64\u00a5\66\1\65\15\66",
			"\1\122\4\66\1\64\u00a5\66\1\65\15\66",
			"\1\u00f0\1\u0097\70\73\1\72\77\73\1\71\77\73",
			"\1\u00f1\1\u00f2\70\77\1\76\77\77\1\75\77\77",
			"\1\u00f1\1\u0097\70\73\1\72\77\73\1\71\77\73",
			"\1\147\70\73\1\72\77\73\1\71\77\73",
			"\70\73\1\72\77\73\1\71\77\73",
			"\1\u00f3\70\77\1\76\77\77\1\75\77\77",
			"\1\122\70\77\1\76\77\77\1\75\77\77",
			"\1\u00f4\1\u0097\45\105\1\104\36\105\1\103\76\105\1\102\64\105",
			"\1\u00f5\1\u00f6\45\113\1\111\36\113\1\110\76\113\1\107\64\113",
			"\1\u00f5\1\u00f7\45\117\1\116\36\117\1\115\76\117\1\114\64\117",
			"\1\u00f5\1\u0097\45\105\1\104\36\105\1\103\76\105\1\102\64\105",
			"\1\147\45\105\1\104\36\105\1\103\76\105\1\102\64\105",
			"\45\105\1\104\36\105\1\103\76\105\1\102\64\105",
			"\1\u00f8\45\113\1\111\36\113\1\110\76\113\1\107\64\113",
			"\1\122\45\113\1\111\36\113\1\110\76\113\1\107\64\113",
			"\1\147\1\u00f9\u00b8\u00d6",
			"\1\u00fa\u00b8\u00d7",
			"\1\u00fb\45\117\1\116\36\117\1\115\76\117\1\114\64\117",
			"\1\122\45\117\1\116\36\117\1\115\76\117\1\114\64\117",
			"\1\62\45\u00fe\1\u00fd\36\u00fe\1\u00fc\163\u00fe",
			"\1\u00ff\1\u0097\16\130\1\125\26\130\1\127\36\130\1\126\163\130",
			"\1\u0100\1\u0101\16\136\1\132\26\136\1\134\36\136\1\133\163\136",
			"\1\u0100\1\u0102\16\142\1\137\26\142\1\141\36\142\1\140\163\142",
			"\1\u0100\1\u0097\16\130\1\125\26\130\1\127\36\130\1\126\163\130",
			"\1\147\16\130\1\125\26\130\1\127\36\130\1\126\163\130",
			"\16\130\1\125\26\130\1\127\36\130\1\126\163\130",
			"\1\u0103\16\136\1\132\26\136\1\134\36\136\1\133\163\136",
			"\1\122\16\136\1\132\26\136\1\134\36\136\1\133\163\136",
			"\1\147\1\u0104\u00b8\u00e3",
			"\1\u0105\u00b8\u00e4",
			"\1\u0106\16\142\1\137\26\142\1\141\36\142\1\140\163\142",
			"\1\122\16\142\1\137\26\142\1\141\36\142\1\140\163\142",
			"\1\62\45\u0109\1\u0108\36\u0109\1\u0107\163\u0109",
			"\1\u010a\1\u0097\u00b8\147",
			"\1\u010b\1\u0097\u00b8\147",
			"\1\u010c\1\u0097\u00b8\147",
			"\1\u010d\1\u0097\u00b8\147",
			"\u00b8\u010e",
			"\u00b8\u010f",
			"\1\uffff",
			"\1\uffff",
			"\u00b8\u0110",
			"\u00b8\u0111",
			"\1\uffff",
			"\1\uffff",
			"\u00b8\u0112",
			"\u00b8\u0113",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\u0114\45\u0080\1\177\36\u0080\1\176\76\u0080\1\175\64\u0080",
			"\1\122\45\u0080\1\177\36\u0080\1\176\76\u0080\1\175\64\u0080",
			"\1\uffff",
			"\1\u0115\1\u0116\u00b8\122",
			"\1\u0115\1\u0117\u00b8\122",
			"\1\u0115\1\u0097\u00b8\122",
			"\u00b8\u0118",
			"\u00b8\u0119",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\u011a\16\u008e\1\u008b\26\u008e\1\u008d\36\u008e\1\u008c\163\u008e",
			"\1\122\16\u008e\1\u008b\26\u008e\1\u008d\36\u008e\1\u008c\163\u008e",
			"\1\uffff",
			"\1\u011b\1\u011c\u00b8\122",
			"\1\u011b\1\u011d\u00b8\122",
			"\1\u011b\1\u0097\u00b8\122",
			"\u00b8\u011e",
			"\u00b8\u011f",
			"\u00b8\u0120",
			"\u00b8\u0121",
			"\1\147\1\u0122\u00b8\u010e",
			"\1\u0123\u00b8\u010f",
			"\1\147\1\u0124\u00b8\u0110",
			"\1\u0125\u00b8\u0111",
			"\1\147\1\u0126\u00b8\u0112",
			"\1\u0127\u00b8\u0113",
			"\1\uffff",
			"\u00b8\u0128",
			"\1\uffff",
			"\1\uffff",
			"\1\147\1\u0129\u00b8\u0118",
			"\1\u012a\u00b8\u0119",
			"\1\uffff",
			"\u00b8\u012b",
			"\1\uffff",
			"\1\uffff",
			"\1\147\1\u012c\u00b8\u011e",
			"\1\u012d\u00b8\u011f",
			"\1\147\1\u012e\u00b8\u0120",
			"\1\u012f\u00b8\u0121",
			"\1\u0130\4\61\1\57\u00a5\61\1\60\15\61",
			"\1\u0097\4\61\1\57\u00a5\61\1\60\15\61",
			"\1\u0131\70\73\1\72\77\73\1\71\77\73",
			"\1\u0097\70\73\1\72\77\73\1\71\77\73",
			"\1\u0132\45\105\1\104\36\105\1\103\76\105\1\102\64\105",
			"\1\u0097\45\105\1\104\36\105\1\103\76\105\1\102\64\105",
			"\1\u0133\u00b8\u0128",
			"\1\u0134\16\130\1\125\26\130\1\127\36\130\1\126\163\130",
			"\1\u0097\16\130\1\125\26\130\1\127\36\130\1\126\163\130",
			"\1\u0135\u00b8\u012b",
			"\1\u0136\u00b8\147",
			"\1\u0097\u00b8\147",
			"\1\u0137\u00b8\147",
			"\1\u0097\u00b8\147",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\u0097\u00b8\122",
			"\1\uffff",
			"\1\u0097\u00b8\122",
			"\1\uffff",
			"\1\uffff"
	};

	static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
	static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
	static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
	static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
	static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
	static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
	static final short[][] DFA1_transition;

	static {
		int numStates = DFA1_transitionS.length;
		DFA1_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
		}
	}

	protected class DFA1 extends DFA {

		public DFA1(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 1;
			this.eot = DFA1_eot;
			this.eof = DFA1_eof;
			this.min = DFA1_min;
			this.max = DFA1_max;
			this.accept = DFA1_accept;
			this.special = DFA1_special;
			this.transition = DFA1_transition;
		}
		@Override
		public String getDescription() {
			return "82:1: bottomup : ( exitContext | leftAssociativeReduction | rightAssociativeReduction | identityElision | booleanEqualityReduction | trivialReduction | flattenTrivialBlocks | flattenTrivialConcurrences );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TreeNodeStream input = (TreeNodeStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA1_305 = input.LA(1);
						 
						int index1_305 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred2_PlexilTreeTransforms()) ) {s = 151;}
						else if ( (synpred3_PlexilTreeTransforms()) ) {s = 103;}
						 
						input.seek(index1_305);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA1_276 = input.LA(1);
						 
						int index1_276 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_PlexilTreeTransforms()) ) {s = 103;}
						else if ( (synpred4_PlexilTreeTransforms()) ) {s = 82;}
						 
						input.seek(index1_276);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA1_311 = input.LA(1);
						 
						int index1_311 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred2_PlexilTreeTransforms()) ) {s = 151;}
						else if ( (synpred3_PlexilTreeTransforms()) ) {s = 103;}
						 
						input.seek(index1_311);
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA1_74 = input.LA(1);
						 
						int index1_74 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_PlexilTreeTransforms()) ) {s = 82;}
						else if ( (synpred6_PlexilTreeTransforms()) ) {s = 50;}
						 
						input.seek(index1_74);
						if ( s>=0 ) return s;
						break;

					case 4 : 
						int LA1_279 = input.LA(1);
						 
						int index1_279 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred2_PlexilTreeTransforms()) ) {s = 151;}
						else if ( (synpred4_PlexilTreeTransforms()) ) {s = 82;}
						 
						input.seek(index1_279);
						if ( s>=0 ) return s;
						break;

					case 5 : 
						int LA1_80 = input.LA(1);
						 
						int index1_80 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_PlexilTreeTransforms()) ) {s = 82;}
						else if ( (synpred6_PlexilTreeTransforms()) ) {s = 50;}
						 
						input.seek(index1_80);
						if ( s>=0 ) return s;
						break;

					case 6 : 
						int LA1_248 = input.LA(1);
						 
						int index1_248 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_PlexilTreeTransforms()) ) {s = 103;}
						else if ( (synpred4_PlexilTreeTransforms()) ) {s = 82;}
						 
						input.seek(index1_248);
						if ( s>=0 ) return s;
						break;

					case 7 : 
						int LA1_306 = input.LA(1);
						 
						int index1_306 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred2_PlexilTreeTransforms()) ) {s = 151;}
						else if ( (synpred3_PlexilTreeTransforms()) ) {s = 103;}
						 
						input.seek(index1_306);
						if ( s>=0 ) return s;
						break;

					case 8 : 
						int LA1_238 = input.LA(1);
						 
						int index1_238 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred2_PlexilTreeTransforms()) ) {s = 151;}
						else if ( (synpred4_PlexilTreeTransforms()) ) {s = 82;}
						 
						input.seek(index1_238);
						if ( s>=0 ) return s;
						break;

					case 9 : 
						int LA1_257 = input.LA(1);
						 
						int index1_257 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred2_PlexilTreeTransforms()) ) {s = 151;}
						else if ( (synpred4_PlexilTreeTransforms()) ) {s = 82;}
						 
						input.seek(index1_257);
						if ( s>=0 ) return s;
						break;

					case 10 : 
						int LA1_251 = input.LA(1);
						 
						int index1_251 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_PlexilTreeTransforms()) ) {s = 103;}
						else if ( (synpred4_PlexilTreeTransforms()) ) {s = 82;}
						 
						input.seek(index1_251);
						if ( s>=0 ) return s;
						break;

					case 11 : 
						int LA1_258 = input.LA(1);
						 
						int index1_258 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred2_PlexilTreeTransforms()) ) {s = 151;}
						else if ( (synpred4_PlexilTreeTransforms()) ) {s = 82;}
						 
						input.seek(index1_258);
						if ( s>=0 ) return s;
						break;

					case 12 : 
						int LA1_242 = input.LA(1);
						 
						int index1_242 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred2_PlexilTreeTransforms()) ) {s = 151;}
						else if ( (synpred4_PlexilTreeTransforms()) ) {s = 82;}
						 
						input.seek(index1_242);
						if ( s>=0 ) return s;
						break;

					case 13 : 
						int LA1_308 = input.LA(1);
						 
						int index1_308 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred2_PlexilTreeTransforms()) ) {s = 151;}
						else if ( (synpred3_PlexilTreeTransforms()) ) {s = 103;}
						 
						input.seek(index1_308);
						if ( s>=0 ) return s;
						break;

					case 14 : 
						int LA1_93 = input.LA(1);
						 
						int index1_93 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_PlexilTreeTransforms()) ) {s = 82;}
						else if ( (synpred6_PlexilTreeTransforms()) ) {s = 50;}
						 
						input.seek(index1_93);
						if ( s>=0 ) return s;
						break;

					case 15 : 
						int LA1_284 = input.LA(1);
						 
						int index1_284 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred2_PlexilTreeTransforms()) ) {s = 151;}
						else if ( (synpred4_PlexilTreeTransforms()) ) {s = 82;}
						 
						input.seek(index1_284);
						if ( s>=0 ) return s;
						break;

					case 16 : 
						int LA1_246 = input.LA(1);
						 
						int index1_246 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred2_PlexilTreeTransforms()) ) {s = 151;}
						else if ( (synpred4_PlexilTreeTransforms()) ) {s = 82;}
						 
						input.seek(index1_246);
						if ( s>=0 ) return s;
						break;

					case 17 : 
						int LA1_99 = input.LA(1);
						 
						int index1_99 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_PlexilTreeTransforms()) ) {s = 82;}
						else if ( (synpred6_PlexilTreeTransforms()) ) {s = 50;}
						 
						input.seek(index1_99);
						if ( s>=0 ) return s;
						break;

					case 18 : 
						int LA1_259 = input.LA(1);
						 
						int index1_259 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_PlexilTreeTransforms()) ) {s = 103;}
						else if ( (synpred4_PlexilTreeTransforms()) ) {s = 82;}
						 
						input.seek(index1_259);
						if ( s>=0 ) return s;
						break;

					case 19 : 
						int LA1_285 = input.LA(1);
						 
						int index1_285 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred2_PlexilTreeTransforms()) ) {s = 151;}
						else if ( (synpred4_PlexilTreeTransforms()) ) {s = 82;}
						 
						input.seek(index1_285);
						if ( s>=0 ) return s;
						break;

					case 20 : 
						int LA1_247 = input.LA(1);
						 
						int index1_247 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred2_PlexilTreeTransforms()) ) {s = 151;}
						else if ( (synpred4_PlexilTreeTransforms()) ) {s = 82;}
						 
						input.seek(index1_247);
						if ( s>=0 ) return s;
						break;

					case 21 : 
						int LA1_239 = input.LA(1);
						 
						int index1_239 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_PlexilTreeTransforms()) ) {s = 103;}
						else if ( (synpred4_PlexilTreeTransforms()) ) {s = 82;}
						 
						input.seek(index1_239);
						if ( s>=0 ) return s;
						break;

					case 22 : 
						int LA1_55 = input.LA(1);
						 
						int index1_55 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_PlexilTreeTransforms()) ) {s = 82;}
						else if ( (synpred6_PlexilTreeTransforms()) ) {s = 50;}
						 
						input.seek(index1_55);
						if ( s>=0 ) return s;
						break;

					case 23 : 
						int LA1_304 = input.LA(1);
						 
						int index1_304 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred2_PlexilTreeTransforms()) ) {s = 151;}
						else if ( (synpred3_PlexilTreeTransforms()) ) {s = 103;}
						 
						input.seek(index1_304);
						if ( s>=0 ) return s;
						break;

					case 24 : 
						int LA1_262 = input.LA(1);
						 
						int index1_262 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_PlexilTreeTransforms()) ) {s = 103;}
						else if ( (synpred4_PlexilTreeTransforms()) ) {s = 82;}
						 
						input.seek(index1_262);
						if ( s>=0 ) return s;
						break;

					case 25 : 
						int LA1_310 = input.LA(1);
						 
						int index1_310 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred2_PlexilTreeTransforms()) ) {s = 151;}
						else if ( (synpred3_PlexilTreeTransforms()) ) {s = 103;}
						 
						input.seek(index1_310);
						if ( s>=0 ) return s;
						break;

					case 26 : 
						int LA1_64 = input.LA(1);
						 
						int index1_64 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_PlexilTreeTransforms()) ) {s = 82;}
						else if ( (synpred6_PlexilTreeTransforms()) ) {s = 50;}
						 
						input.seek(index1_64);
						if ( s>=0 ) return s;
						break;

					case 27 : 
						int LA1_243 = input.LA(1);
						 
						int index1_243 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_PlexilTreeTransforms()) ) {s = 103;}
						else if ( (synpred4_PlexilTreeTransforms()) ) {s = 82;}
						 
						input.seek(index1_243);
						if ( s>=0 ) return s;
						break;

					case 28 : 
						int LA1_282 = input.LA(1);
						 
						int index1_282 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_PlexilTreeTransforms()) ) {s = 103;}
						else if ( (synpred4_PlexilTreeTransforms()) ) {s = 82;}
						 
						input.seek(index1_282);
						if ( s>=0 ) return s;
						break;

					case 29 : 
						int LA1_278 = input.LA(1);
						 
						int index1_278 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred2_PlexilTreeTransforms()) ) {s = 151;}
						else if ( (synpred4_PlexilTreeTransforms()) ) {s = 82;}
						 
						input.seek(index1_278);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 1, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA11_eotS =
		"\7\uffff";
	static final String DFA11_eofS =
		"\7\uffff";
	static final String DFA11_minS =
		"\1\4\1\2\1\uffff\1\4\1\2\1\uffff\1\3";
	static final String DFA11_maxS =
		"\2\u00bb\1\uffff\2\u00bb\1\uffff\1\u00bb";
	static final String DFA11_acceptS =
		"\2\uffff\1\1\2\uffff\1\2\1\uffff";
	static final String DFA11_specialS =
		"\7\uffff}>";
	static final String[] DFA11_transitionS = {
			"\4\2\1\1\u00b3\2",
			"\1\3\1\uffff\u00b8\2",
			"",
			"\u00b8\4",
			"\1\5\1\6\u00b8\4",
			"",
			"\1\5\u00b8\2"
	};

	static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
	static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
	static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
	static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
	static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
	static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
	static final short[][] DFA11_transition;

	static {
		int numStates = DFA11_transitionS.length;
		DFA11_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
		}
	}

	protected class DFA11 extends DFA {

		public DFA11(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 11;
			this.eot = DFA11_eot;
			this.eof = DFA11_eof;
			this.min = DFA11_min;
			this.max = DFA11_max;
			this.accept = DFA11_accept;
			this.special = DFA11_special;
			this.transition = DFA11_transition;
		}
		@Override
		public String getDescription() {
			return "()+ loopback of 134:20: (args+= . )+";
		}
	}

	static final String DFA13_eotS =
		"\7\uffff";
	static final String DFA13_eofS =
		"\7\uffff";
	static final String DFA13_minS =
		"\1\4\1\2\1\uffff\1\4\1\2\1\uffff\1\3";
	static final String DFA13_maxS =
		"\2\u00bb\1\uffff\2\u00bb\1\uffff\1\u00bb";
	static final String DFA13_acceptS =
		"\2\uffff\1\1\2\uffff\1\2\1\uffff";
	static final String DFA13_specialS =
		"\7\uffff}>";
	static final String[] DFA13_transitionS = {
			"\170\2\1\1\77\2",
			"\1\3\1\uffff\u00b8\2",
			"",
			"\u00b8\4",
			"\1\5\1\6\u00b8\4",
			"",
			"\1\5\u00b8\2"
	};

	static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
	static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
	static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
	static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
	static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
	static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
	static final short[][] DFA13_transition;

	static {
		int numStates = DFA13_transitionS.length;
		DFA13_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
		}
	}

	protected class DFA13 extends DFA {

		public DFA13(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 13;
			this.eot = DFA13_eot;
			this.eof = DFA13_eof;
			this.min = DFA13_min;
			this.max = DFA13_max;
			this.accept = DFA13_accept;
			this.special = DFA13_special;
			this.transition = DFA13_transition;
		}
		@Override
		public String getDescription() {
			return "()+ loopback of 135:19: (args+= . )+";
		}
	}

	static final String DFA15_eotS =
		"\7\uffff";
	static final String DFA15_eofS =
		"\7\uffff";
	static final String DFA15_minS =
		"\1\4\1\2\1\uffff\1\4\1\2\1\uffff\1\3";
	static final String DFA15_maxS =
		"\2\u00bb\1\uffff\2\u00bb\1\uffff\1\u00bb";
	static final String DFA15_acceptS =
		"\2\uffff\1\1\2\uffff\1\2\1\uffff";
	static final String DFA15_specialS =
		"\7\uffff}>";
	static final String[] DFA15_transitionS = {
			"\u0083\2\1\1\64\2",
			"\1\3\1\uffff\u00b8\2",
			"",
			"\u00b8\4",
			"\1\5\1\6\u00b8\4",
			"",
			"\1\5\u00b8\2"
	};

	static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
	static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
	static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
	static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
	static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
	static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
	static final short[][] DFA15_transition;

	static {
		int numStates = DFA15_transitionS.length;
		DFA15_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
		}
	}

	protected class DFA15 extends DFA {

		public DFA15(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 15;
			this.eot = DFA15_eot;
			this.eof = DFA15_eof;
			this.min = DFA15_min;
			this.max = DFA15_max;
			this.accept = DFA15_accept;
			this.special = DFA15_special;
			this.transition = DFA15_transition;
		}
		@Override
		public String getDescription() {
			return "()+ loopback of 136:16: (args+= . )+";
		}
	}

	static final String DFA17_eotS =
		"\7\uffff";
	static final String DFA17_eofS =
		"\7\uffff";
	static final String DFA17_minS =
		"\1\4\1\2\1\uffff\1\4\1\2\1\uffff\1\3";
	static final String DFA17_maxS =
		"\2\u00bb\1\uffff\2\u00bb\1\uffff\1\u00bb";
	static final String DFA17_acceptS =
		"\2\uffff\1\1\2\uffff\1\2\1\uffff";
	static final String DFA17_specialS =
		"\7\uffff}>";
	static final String[] DFA17_transitionS = {
			"\16\2\1\1\u00a9\2",
			"\1\3\1\uffff\u00b8\2",
			"",
			"\u00b8\4",
			"\1\5\1\6\u00b8\4",
			"",
			"\1\5\u00b8\2"
	};

	static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
	static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
	static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
	static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
	static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
	static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
	static final short[][] DFA17_transition;

	static {
		int numStates = DFA17_transitionS.length;
		DFA17_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
		}
	}

	protected class DFA17 extends DFA {

		public DFA17(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 17;
			this.eot = DFA17_eot;
			this.eof = DFA17_eof;
			this.min = DFA17_min;
			this.max = DFA17_max;
			this.accept = DFA17_accept;
			this.special = DFA17_special;
			this.transition = DFA17_transition;
		}
		@Override
		public String getDescription() {
			return "()+ loopback of 137:20: (args+= . )+";
		}
	}

	static final String DFA19_eotS =
		"\7\uffff";
	static final String DFA19_eofS =
		"\7\uffff";
	static final String DFA19_minS =
		"\1\4\1\2\1\uffff\1\4\1\2\1\uffff\1\3";
	static final String DFA19_maxS =
		"\2\u00bb\1\uffff\2\u00bb\1\uffff\1\u00bb";
	static final String DFA19_acceptS =
		"\2\uffff\1\1\2\uffff\1\2\1\uffff";
	static final String DFA19_specialS =
		"\7\uffff}>";
	static final String[] DFA19_transitionS = {
			"\132\2\1\1\135\2",
			"\1\3\1\uffff\u00b8\2",
			"",
			"\u00b8\4",
			"\1\5\1\6\u00b8\4",
			"",
			"\1\5\u00b8\2"
	};

	static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
	static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
	static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
	static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
	static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
	static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
	static final short[][] DFA19_transition;

	static {
		int numStates = DFA19_transitionS.length;
		DFA19_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
		}
	}

	protected class DFA19 extends DFA {

		public DFA19(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 19;
			this.eot = DFA19_eot;
			this.eof = DFA19_eof;
			this.min = DFA19_min;
			this.max = DFA19_max;
			this.accept = DFA19_accept;
			this.special = DFA19_special;
			this.transition = DFA19_transition;
		}
		@Override
		public String getDescription() {
			return "()+ loopback of 138:20: (args+= . )+";
		}
	}

	static final String DFA21_eotS =
		"\7\uffff";
	static final String DFA21_eofS =
		"\7\uffff";
	static final String DFA21_minS =
		"\1\4\1\2\1\uffff\1\4\1\2\1\uffff\1\3";
	static final String DFA21_maxS =
		"\2\u00bb\1\uffff\2\u00bb\1\uffff\1\u00bb";
	static final String DFA21_acceptS =
		"\2\uffff\1\1\2\uffff\1\2\1\uffff";
	static final String DFA21_specialS =
		"\7\uffff}>";
	static final String[] DFA21_transitionS = {
			"\135\2\1\1\132\2",
			"\1\3\1\uffff\u00b8\2",
			"",
			"\u00b8\4",
			"\1\5\1\6\u00b8\4",
			"",
			"\1\5\u00b8\2"
	};

	static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
	static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
	static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
	static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
	static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
	static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
	static final short[][] DFA21_transition;

	static {
		int numStates = DFA21_transitionS.length;
		DFA21_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
		}
	}

	protected class DFA21 extends DFA {

		public DFA21(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 21;
			this.eot = DFA21_eot;
			this.eof = DFA21_eof;
			this.min = DFA21_min;
			this.max = DFA21_max;
			this.accept = DFA21_accept;
			this.special = DFA21_special;
			this.transition = DFA21_transition;
		}
		@Override
		public String getDescription() {
			return "()+ loopback of 139:20: (args+= . )+";
		}
	}

	static final String DFA45_eotS =
		"\174\uffff";
	static final String DFA45_eofS =
		"\174\uffff";
	static final String DFA45_minS =
		"\1\10\2\uffff\4\2\4\4\10\2\1\4\2\2\1\uffff\4\2\1\uffff\1\4\2\2\1\4\2\2"+
		"\1\uffff\4\2\1\uffff\1\4\2\2\1\3\1\4\2\2\1\0\1\2\1\4\1\3\1\2\1\uffff\4"+
		"\2\1\uffff\1\2\1\3\1\4\2\2\1\0\1\2\1\4\1\3\1\2\1\uffff\4\2\1\uffff\1\2"+
		"\1\4\1\3\1\4\1\3\2\4\1\0\3\2\2\4\1\3\1\4\1\3\2\4\1\0\3\2\1\0\1\4\4\3\1"+
		"\4\5\3\1\4\3\0\13\3\1\0";
	static final String DFA45_maxS =
		"\1\u00a0\2\uffff\4\2\17\u00bb\1\uffff\4\u00bb\1\uffff\6\u00bb\1\uffff"+
		"\4\u00bb\1\uffff\7\u00bb\1\0\4\u00bb\1\uffff\4\u00bb\1\uffff\5\u00bb\1"+
		"\0\4\u00bb\1\uffff\4\u00bb\1\uffff\7\u00bb\1\0\12\u00bb\1\0\3\u00bb\1"+
		"\0\14\u00bb\3\0\13\u00bb\1\0";
	static final String DFA45_acceptS =
		"\1\uffff\1\1\1\2\23\uffff\1\3\4\uffff\1\4\6\uffff\1\7\4\uffff\1\10\14"+
		"\uffff\1\5\4\uffff\1\6\12\uffff\1\11\4\uffff\1\12\62\uffff";
	static final String DFA45_specialS =
		"\57\uffff\1\10\17\uffff\1\6\21\uffff\1\7\12\uffff\1\0\3\uffff\1\1\14\uffff"+
		"\1\2\1\3\1\4\13\uffff\1\5}>";
	static final String[] DFA45_transitionS = {
			"\1\1\11\uffff\1\5\115\uffff\1\4\33\uffff\1\2\12\uffff\1\3\30\uffff\1"+
			"\6",
			"",
			"",
			"\1\7",
			"\1\10",
			"\1\11",
			"\1\12",
			"\45\15\1\14\36\15\1\13\163\15",
			"\u00b8\16",
			"\45\21\1\20\36\21\1\17\163\21",
			"\u00b8\22",
			"\1\23\1\26\45\27\1\25\36\27\1\24\163\27",
			"\1\23\1\33\45\32\1\31\36\32\1\30\163\32",
			"\1\23\1\uffff\45\15\1\14\36\15\1\13\163\15",
			"\1\34\1\uffff\45\16\1\36\36\16\1\35\163\16",
			"\1\37\1\42\45\43\1\41\36\43\1\40\163\43",
			"\1\37\1\47\45\46\1\45\36\46\1\44\163\46",
			"\1\37\1\uffff\45\21\1\20\36\21\1\17\163\21",
			"\1\50\1\uffff\45\22\1\52\36\22\1\51\163\22",
			"\u00b8\53",
			"\1\54\1\26\45\27\1\25\36\27\1\24\163\27",
			"\1\54\1\57\45\60\1\56\36\60\1\55\163\60",
			"",
			"\1\54\1\26\45\27\1\25\36\27\1\24\163\27",
			"\1\61\1\57\45\60\1\56\36\60\1\55\163\60",
			"\1\61\1\33\45\32\1\31\36\32\1\30\163\32",
			"\1\61\1\33\45\32\1\31\36\32\1\30\163\32",
			"",
			"\u00b8\62",
			"\1\34\1\64\45\66\1\65\36\66\1\63\163\66",
			"\1\34\1\71\45\72\1\70\36\72\1\67\163\72",
			"\u00b8\73",
			"\1\74\1\42\45\43\1\41\36\43\1\40\163\43",
			"\1\74\1\77\45\100\1\76\36\100\1\75\163\100",
			"",
			"\1\74\1\42\45\43\1\41\36\43\1\40\163\43",
			"\1\101\1\77\45\100\1\76\36\100\1\75\163\100",
			"\1\101\1\47\45\46\1\45\36\46\1\44\163\46",
			"\1\101\1\47\45\46\1\45\36\46\1\44\163\46",
			"",
			"\u00b8\102",
			"\1\50\1\104\45\106\1\105\36\106\1\103\163\106",
			"\1\50\1\111\45\112\1\110\36\112\1\107\163\112",
			"\1\113\u00b8\53",
			"\u00b8\114",
			"\1\115\1\57\45\60\1\56\36\60\1\55\163\60",
			"\1\115\1\57\45\60\1\56\36\60\1\55\163\60",
			"\1\uffff",
			"\1\115\1\57\45\60\1\56\36\60\1\55\163\60",
			"\u00b8\116",
			"\1\117\u00b8\62",
			"\1\120\1\64\45\66\1\65\36\66\1\63\163\66",
			"",
			"\1\120\1\121\45\124\1\123\36\124\1\122\163\124",
			"\1\120\1\64\45\66\1\65\36\66\1\63\163\66",
			"\1\125\1\121\45\124\1\123\36\124\1\122\163\124",
			"\1\125\1\71\45\72\1\70\36\72\1\67\163\72",
			"",
			"\1\125\1\71\45\72\1\70\36\72\1\67\163\72",
			"\1\126\u00b8\73",
			"\u00b8\127",
			"\1\130\1\77\45\100\1\76\36\100\1\75\163\100",
			"\1\130\1\77\45\100\1\76\36\100\1\75\163\100",
			"\1\uffff",
			"\1\130\1\77\45\100\1\76\36\100\1\75\163\100",
			"\u00b8\131",
			"\1\132\u00b8\102",
			"\1\133\1\104\45\106\1\105\36\106\1\103\163\106",
			"",
			"\1\133\1\134\45\137\1\136\36\137\1\135\163\137",
			"\1\133\1\104\45\106\1\105\36\106\1\103\163\106",
			"\1\141\1\140\45\137\1\136\36\137\1\135\163\137",
			"\1\141\1\111\45\112\1\110\36\112\1\107\163\112",
			"",
			"\1\141\1\111\45\112\1\110\36\112\1\107\163\112",
			"\45\15\1\14\36\15\1\13\163\15",
			"\1\142\u00b8\114",
			"\u00b8\143",
			"\1\144\u00b8\116",
			"\45\16\1\36\36\16\1\35\163\16",
			"\u00b8\145",
			"\1\uffff",
			"\1\146\1\121\45\124\1\123\36\124\1\122\163\124",
			"\1\146\1\121\45\124\1\123\36\124\1\122\163\124",
			"\1\146\1\121\45\124\1\123\36\124\1\122\163\124",
			"\u00b8\147",
			"\45\21\1\20\36\21\1\17\163\21",
			"\1\150\u00b8\127",
			"\u00b8\151",
			"\1\152\u00b8\131",
			"\45\22\1\52\36\22\1\51\163\22",
			"\u00b8\153",
			"\1\uffff",
			"\1\154\1\155\45\137\1\136\36\137\1\135\163\137",
			"\1\154\1\156\45\137\1\136\36\137\1\135\163\137",
			"\1\154\1\157\45\137\1\136\36\137\1\135\163\137",
			"\1\uffff",
			"\u00b8\160",
			"\1\26\45\27\1\25\36\27\1\24\163\27",
			"\1\161\u00b8\143",
			"\1\33\45\32\1\31\36\32\1\30\163\32",
			"\1\162\u00b8\145",
			"\u00b8\163",
			"\1\164\u00b8\147",
			"\1\42\45\43\1\41\36\43\1\40\163\43",
			"\1\165\u00b8\151",
			"\1\47\45\46\1\45\36\46\1\44\163\46",
			"\1\166\u00b8\153",
			"\u00b8\167",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\170\u00b8\160",
			"\1\57\45\60\1\56\36\60\1\55\163\60",
			"\1\64\45\66\1\65\36\66\1\63\163\66",
			"\1\171\u00b8\163",
			"\1\71\45\72\1\70\36\72\1\67\163\72",
			"\1\77\45\100\1\76\36\100\1\75\163\100",
			"\1\104\45\106\1\105\36\106\1\103\163\106",
			"\1\172\u00b8\167",
			"\1\111\45\112\1\110\36\112\1\107\163\112",
			"\1\121\45\124\1\123\36\124\1\122\163\124",
			"\1\173\45\137\1\136\36\137\1\135\163\137",
			"\1\uffff"
	};

	static final short[] DFA45_eot = DFA.unpackEncodedString(DFA45_eotS);
	static final short[] DFA45_eof = DFA.unpackEncodedString(DFA45_eofS);
	static final char[] DFA45_min = DFA.unpackEncodedStringToUnsignedChars(DFA45_minS);
	static final char[] DFA45_max = DFA.unpackEncodedStringToUnsignedChars(DFA45_maxS);
	static final short[] DFA45_accept = DFA.unpackEncodedString(DFA45_acceptS);
	static final short[] DFA45_special = DFA.unpackEncodedString(DFA45_specialS);
	static final short[][] DFA45_transition;

	static {
		int numStates = DFA45_transitionS.length;
		DFA45_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA45_transition[i] = DFA.unpackEncodedString(DFA45_transitionS[i]);
		}
	}

	protected class DFA45 extends DFA {

		public DFA45(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 45;
			this.eot = DFA45_eot;
			this.eof = DFA45_eof;
			this.min = DFA45_min;
			this.max = DFA45_max;
			this.accept = DFA45_accept;
			this.special = DFA45_special;
			this.transition = DFA45_transition;
		}
		@Override
		public String getDescription() {
			return "157:1: identityElision : ( ^( AND_KYWD (args+= . )* TRUE_KYWD (args+= . )* ) -> ^( AND_KYWD ( $args)* ) | ^( OR_KYWD (args+= . )* FALSE_KYWD (args+= . )* ) -> ^( OR_KYWD ( $args)* ) | ^( PLUS (args+= . )* i= INT (args+= . )* {...}?) -> ^( PLUS ( $args)* ) | ^( PLUS (args+= . )* d= DOUBLE (args+= . )* {...}?) -> ^( PLUS ( $args)* ) | ^( MINUS (args+= . )+ i= INT (args+= . )* {...}?) -> ^( MINUS ( $args)* ) | ^( MINUS (args+= . )+ d= DOUBLE (args+= . )* {...}?) -> ^( MINUS ( $args)* ) | ^( ASTERISK (args+= . )* i= INT (args+= . )* {...}?) -> ^( ASTERISK ( $args)* ) | ^( ASTERISK (args+= . )* d= DOUBLE (args+= . )* {...}?) -> ^( ASTERISK ( $args)* ) | ^( SLASH (args+= . )+ i= INT (args+= . )* {...}?) -> ^( SLASH ( $args)* ) | ^( SLASH (args+= . )+ d= DOUBLE (args+= . )* {...}?) -> ^( SLASH ( $args)* ) );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TreeNodeStream input = (TreeNodeStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA45_92 = input.LA(1);
						 
						int index45_92 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred73_PlexilTreeTransforms()) ) {s = 68;}
						else if ( (true) ) {s = 73;}
						 
						input.seek(index45_92);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA45_96 = input.LA(1);
						 
						int index45_96 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred73_PlexilTreeTransforms()) ) {s = 68;}
						else if ( (true) ) {s = 73;}
						 
						input.seek(index45_96);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA45_109 = input.LA(1);
						 
						int index45_109 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred73_PlexilTreeTransforms()) ) {s = 68;}
						else if ( (true) ) {s = 73;}
						 
						input.seek(index45_109);
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA45_110 = input.LA(1);
						 
						int index45_110 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred73_PlexilTreeTransforms()) ) {s = 68;}
						else if ( (true) ) {s = 73;}
						 
						input.seek(index45_110);
						if ( s>=0 ) return s;
						break;

					case 4 : 
						int LA45_111 = input.LA(1);
						 
						int index45_111 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred73_PlexilTreeTransforms()) ) {s = 68;}
						else if ( (true) ) {s = 73;}
						 
						input.seek(index45_111);
						if ( s>=0 ) return s;
						break;

					case 5 : 
						int LA45_123 = input.LA(1);
						 
						int index45_123 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred73_PlexilTreeTransforms()) ) {s = 68;}
						else if ( (true) ) {s = 73;}
						 
						input.seek(index45_123);
						if ( s>=0 ) return s;
						break;

					case 6 : 
						int LA45_63 = input.LA(1);
						 
						int index45_63 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred67_PlexilTreeTransforms()) ) {s = 34;}
						else if ( (synpred70_PlexilTreeTransforms()) ) {s = 39;}
						 
						input.seek(index45_63);
						if ( s>=0 ) return s;
						break;

					case 7 : 
						int LA45_81 = input.LA(1);
						 
						int index45_81 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred61_PlexilTreeTransforms()) ) {s = 52;}
						else if ( (synpred64_PlexilTreeTransforms()) ) {s = 57;}
						 
						input.seek(index45_81);
						if ( s>=0 ) return s;
						break;

					case 8 : 
						int LA45_47 = input.LA(1);
						 
						int index45_47 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred55_PlexilTreeTransforms()) ) {s = 22;}
						else if ( (synpred58_PlexilTreeTransforms()) ) {s = 27;}
						 
						input.seek(index45_47);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 45, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA25_eotS =
		"\13\uffff";
	static final String DFA25_eofS =
		"\13\uffff";
	static final String DFA25_minS =
		"\1\4\1\2\1\uffff\1\0\1\uffff\1\2\1\4\1\0\2\3\1\0";
	static final String DFA25_maxS =
		"\2\u00bb\1\uffff\1\0\1\uffff\2\u00bb\1\0\2\u00bb\1\0";
	static final String DFA25_acceptS =
		"\2\uffff\1\1\1\uffff\1\2\6\uffff";
	static final String DFA25_specialS =
		"\3\uffff\1\0\3\uffff\1\1\2\uffff\1\2}>";
	static final String[] DFA25_transitionS = {
			"\u00aa\2\1\1\15\2",
			"\1\2\1\4\u00aa\5\1\3\15\5",
			"",
			"\1\uffff",
			"",
			"\1\6\1\4\u00aa\5\1\7\15\5",
			"\u00b8\10",
			"\1\uffff",
			"\1\11\u00b8\10",
			"\1\4\u00aa\5\1\12\15\5",
			"\1\uffff"
	};

	static final short[] DFA25_eot = DFA.unpackEncodedString(DFA25_eotS);
	static final short[] DFA25_eof = DFA.unpackEncodedString(DFA25_eofS);
	static final char[] DFA25_min = DFA.unpackEncodedStringToUnsignedChars(DFA25_minS);
	static final char[] DFA25_max = DFA.unpackEncodedStringToUnsignedChars(DFA25_maxS);
	static final short[] DFA25_accept = DFA.unpackEncodedString(DFA25_acceptS);
	static final short[] DFA25_special = DFA.unpackEncodedString(DFA25_specialS);
	static final short[][] DFA25_transition;

	static {
		int numStates = DFA25_transitionS.length;
		DFA25_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA25_transition[i] = DFA.unpackEncodedString(DFA25_transitionS[i]);
		}
	}

	protected class DFA25 extends DFA {

		public DFA25(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 25;
			this.eot = DFA25_eot;
			this.eof = DFA25_eof;
			this.min = DFA25_min;
			this.max = DFA25_max;
			this.accept = DFA25_accept;
			this.special = DFA25_special;
			this.transition = DFA25_transition;
		}
		@Override
		public String getDescription() {
			return "()* loopback of 158:20: (args+= . )*";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TreeNodeStream input = (TreeNodeStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA25_3 = input.LA(1);
						 
						int index25_3 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred47_PlexilTreeTransforms()) ) {s = 2;}
						else if ( (true) ) {s = 4;}
						 
						input.seek(index25_3);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA25_7 = input.LA(1);
						 
						int index25_7 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred47_PlexilTreeTransforms()) ) {s = 2;}
						else if ( (true) ) {s = 4;}
						 
						input.seek(index25_7);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA25_10 = input.LA(1);
						 
						int index25_10 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred47_PlexilTreeTransforms()) ) {s = 2;}
						else if ( (true) ) {s = 4;}
						 
						input.seek(index25_10);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 25, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA27_eotS =
		"\13\uffff";
	static final String DFA27_eofS =
		"\13\uffff";
	static final String DFA27_minS =
		"\1\4\1\2\1\uffff\1\0\1\uffff\1\2\1\4\1\0\2\3\1\0";
	static final String DFA27_maxS =
		"\2\u00bb\1\uffff\1\0\1\uffff\2\u00bb\1\0\2\u00bb\1\0";
	static final String DFA27_acceptS =
		"\2\uffff\1\1\1\uffff\1\2\6\uffff";
	static final String DFA27_specialS =
		"\3\uffff\1\0\3\uffff\1\1\2\uffff\1\2}>";
	static final String[] DFA27_transitionS = {
			"\70\2\1\1\177\2",
			"\1\2\1\4\70\5\1\3\177\5",
			"",
			"\1\uffff",
			"",
			"\1\6\1\4\70\5\1\7\177\5",
			"\u00b8\10",
			"\1\uffff",
			"\1\11\u00b8\10",
			"\1\4\70\5\1\12\177\5",
			"\1\uffff"
	};

	static final short[] DFA27_eot = DFA.unpackEncodedString(DFA27_eotS);
	static final short[] DFA27_eof = DFA.unpackEncodedString(DFA27_eofS);
	static final char[] DFA27_min = DFA.unpackEncodedStringToUnsignedChars(DFA27_minS);
	static final char[] DFA27_max = DFA.unpackEncodedStringToUnsignedChars(DFA27_maxS);
	static final short[] DFA27_accept = DFA.unpackEncodedString(DFA27_acceptS);
	static final short[] DFA27_special = DFA.unpackEncodedString(DFA27_specialS);
	static final short[][] DFA27_transition;

	static {
		int numStates = DFA27_transitionS.length;
		DFA27_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA27_transition[i] = DFA.unpackEncodedString(DFA27_transitionS[i]);
		}
	}

	protected class DFA27 extends DFA {

		public DFA27(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 27;
			this.eot = DFA27_eot;
			this.eof = DFA27_eof;
			this.min = DFA27_min;
			this.max = DFA27_max;
			this.accept = DFA27_accept;
			this.special = DFA27_special;
			this.transition = DFA27_transition;
		}
		@Override
		public String getDescription() {
			return "()* loopback of 159:19: (args+= . )*";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TreeNodeStream input = (TreeNodeStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA27_3 = input.LA(1);
						 
						int index27_3 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred50_PlexilTreeTransforms()) ) {s = 2;}
						else if ( (true) ) {s = 4;}
						 
						input.seek(index27_3);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA27_7 = input.LA(1);
						 
						int index27_7 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred50_PlexilTreeTransforms()) ) {s = 2;}
						else if ( (true) ) {s = 4;}
						 
						input.seek(index27_7);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA27_10 = input.LA(1);
						 
						int index27_10 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred50_PlexilTreeTransforms()) ) {s = 2;}
						else if ( (true) ) {s = 4;}
						 
						input.seek(index27_10);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 27, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA29_eotS =
		"\13\uffff";
	static final String DFA29_eofS =
		"\13\uffff";
	static final String DFA29_minS =
		"\1\4\1\2\1\uffff\1\0\1\uffff\1\2\1\4\1\0\2\3\1\0";
	static final String DFA29_maxS =
		"\2\u00bb\1\uffff\1\0\1\uffff\2\u00bb\1\0\2\u00bb\1\0";
	static final String DFA29_acceptS =
		"\2\uffff\1\1\1\uffff\1\2\6\uffff";
	static final String DFA29_specialS =
		"\3\uffff\1\0\3\uffff\1\1\2\uffff\1\2}>";
	static final String[] DFA29_transitionS = {
			"\104\2\1\1\163\2",
			"\1\2\1\4\104\5\1\3\163\5",
			"",
			"\1\uffff",
			"",
			"\1\6\1\4\104\5\1\7\163\5",
			"\u00b8\10",
			"\1\uffff",
			"\1\11\u00b8\10",
			"\1\4\104\5\1\12\163\5",
			"\1\uffff"
	};

	static final short[] DFA29_eot = DFA.unpackEncodedString(DFA29_eotS);
	static final short[] DFA29_eof = DFA.unpackEncodedString(DFA29_eofS);
	static final char[] DFA29_min = DFA.unpackEncodedStringToUnsignedChars(DFA29_minS);
	static final char[] DFA29_max = DFA.unpackEncodedStringToUnsignedChars(DFA29_maxS);
	static final short[] DFA29_accept = DFA.unpackEncodedString(DFA29_acceptS);
	static final short[] DFA29_special = DFA.unpackEncodedString(DFA29_specialS);
	static final short[][] DFA29_transition;

	static {
		int numStates = DFA29_transitionS.length;
		DFA29_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA29_transition[i] = DFA.unpackEncodedString(DFA29_transitionS[i]);
		}
	}

	protected class DFA29 extends DFA {

		public DFA29(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 29;
			this.eot = DFA29_eot;
			this.eof = DFA29_eof;
			this.min = DFA29_min;
			this.max = DFA29_max;
			this.accept = DFA29_accept;
			this.special = DFA29_special;
			this.transition = DFA29_transition;
		}
		@Override
		public String getDescription() {
			return "()* loopback of 160:16: (args+= . )*";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TreeNodeStream input = (TreeNodeStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA29_3 = input.LA(1);
						 
						int index29_3 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred53_PlexilTreeTransforms()) ) {s = 2;}
						else if ( (true) ) {s = 4;}
						 
						input.seek(index29_3);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA29_7 = input.LA(1);
						 
						int index29_7 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred53_PlexilTreeTransforms()) ) {s = 2;}
						else if ( (true) ) {s = 4;}
						 
						input.seek(index29_7);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA29_10 = input.LA(1);
						 
						int index29_10 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred53_PlexilTreeTransforms()) ) {s = 2;}
						else if ( (true) ) {s = 4;}
						 
						input.seek(index29_10);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 29, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA31_eotS =
		"\13\uffff";
	static final String DFA31_eofS =
		"\13\uffff";
	static final String DFA31_minS =
		"\1\4\1\2\1\uffff\1\0\1\uffff\1\2\1\4\1\0\2\3\1\0";
	static final String DFA31_maxS =
		"\2\u00bb\1\uffff\1\0\1\uffff\2\u00bb\1\0\2\u00bb\1\0";
	static final String DFA31_acceptS =
		"\2\uffff\1\1\1\uffff\1\2\6\uffff";
	static final String DFA31_specialS =
		"\3\uffff\1\0\3\uffff\1\1\2\uffff\1\2}>";
	static final String[] DFA31_transitionS = {
			"\45\2\1\1\u0092\2",
			"\1\2\1\4\45\5\1\3\u0092\5",
			"",
			"\1\uffff",
			"",
			"\1\6\1\4\45\5\1\7\u0092\5",
			"\u00b8\10",
			"\1\uffff",
			"\1\11\u00b8\10",
			"\1\4\45\5\1\12\u0092\5",
			"\1\uffff"
	};

	static final short[] DFA31_eot = DFA.unpackEncodedString(DFA31_eotS);
	static final short[] DFA31_eof = DFA.unpackEncodedString(DFA31_eofS);
	static final char[] DFA31_min = DFA.unpackEncodedStringToUnsignedChars(DFA31_minS);
	static final char[] DFA31_max = DFA.unpackEncodedStringToUnsignedChars(DFA31_maxS);
	static final short[] DFA31_accept = DFA.unpackEncodedString(DFA31_acceptS);
	static final short[] DFA31_special = DFA.unpackEncodedString(DFA31_specialS);
	static final short[][] DFA31_transition;

	static {
		int numStates = DFA31_transitionS.length;
		DFA31_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA31_transition[i] = DFA.unpackEncodedString(DFA31_transitionS[i]);
		}
	}

	protected class DFA31 extends DFA {

		public DFA31(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 31;
			this.eot = DFA31_eot;
			this.eof = DFA31_eof;
			this.min = DFA31_min;
			this.max = DFA31_max;
			this.accept = DFA31_accept;
			this.special = DFA31_special;
			this.transition = DFA31_transition;
		}
		@Override
		public String getDescription() {
			return "()* loopback of 161:16: (args+= . )*";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TreeNodeStream input = (TreeNodeStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA31_3 = input.LA(1);
						 
						int index31_3 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred56_PlexilTreeTransforms()) ) {s = 2;}
						else if ( (true) ) {s = 4;}
						 
						input.seek(index31_3);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA31_7 = input.LA(1);
						 
						int index31_7 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred56_PlexilTreeTransforms()) ) {s = 2;}
						else if ( (true) ) {s = 4;}
						 
						input.seek(index31_7);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA31_10 = input.LA(1);
						 
						int index31_10 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred56_PlexilTreeTransforms()) ) {s = 2;}
						else if ( (true) ) {s = 4;}
						 
						input.seek(index31_10);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 31, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA33_eotS =
		"\13\uffff";
	static final String DFA33_eofS =
		"\13\uffff";
	static final String DFA33_minS =
		"\1\4\1\2\1\uffff\1\0\1\uffff\1\2\1\4\1\0\2\3\1\0";
	static final String DFA33_maxS =
		"\2\u00bb\1\uffff\1\0\1\uffff\2\u00bb\1\0\2\u00bb\1\0";
	static final String DFA33_acceptS =
		"\2\uffff\1\1\1\uffff\1\2\6\uffff";
	static final String DFA33_specialS =
		"\3\uffff\1\0\3\uffff\1\1\2\uffff\1\2}>";
	static final String[] DFA33_transitionS = {
			"\104\2\1\1\163\2",
			"\1\2\1\4\104\5\1\3\163\5",
			"",
			"\1\uffff",
			"",
			"\1\6\1\4\104\5\1\7\163\5",
			"\u00b8\10",
			"\1\uffff",
			"\1\11\u00b8\10",
			"\1\4\104\5\1\12\163\5",
			"\1\uffff"
	};

	static final short[] DFA33_eot = DFA.unpackEncodedString(DFA33_eotS);
	static final short[] DFA33_eof = DFA.unpackEncodedString(DFA33_eofS);
	static final char[] DFA33_min = DFA.unpackEncodedStringToUnsignedChars(DFA33_minS);
	static final char[] DFA33_max = DFA.unpackEncodedStringToUnsignedChars(DFA33_maxS);
	static final short[] DFA33_accept = DFA.unpackEncodedString(DFA33_acceptS);
	static final short[] DFA33_special = DFA.unpackEncodedString(DFA33_specialS);
	static final short[][] DFA33_transition;

	static {
		int numStates = DFA33_transitionS.length;
		DFA33_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA33_transition[i] = DFA.unpackEncodedString(DFA33_transitionS[i]);
		}
	}

	protected class DFA33 extends DFA {

		public DFA33(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 33;
			this.eot = DFA33_eot;
			this.eof = DFA33_eof;
			this.min = DFA33_min;
			this.max = DFA33_max;
			this.accept = DFA33_accept;
			this.special = DFA33_special;
			this.transition = DFA33_transition;
		}
		@Override
		public String getDescription() {
			return "()+ loopback of 162:17: (args+= . )+";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TreeNodeStream input = (TreeNodeStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA33_3 = input.LA(1);
						 
						int index33_3 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred59_PlexilTreeTransforms()) ) {s = 2;}
						else if ( (true) ) {s = 4;}
						 
						input.seek(index33_3);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA33_7 = input.LA(1);
						 
						int index33_7 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred59_PlexilTreeTransforms()) ) {s = 2;}
						else if ( (true) ) {s = 4;}
						 
						input.seek(index33_7);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA33_10 = input.LA(1);
						 
						int index33_10 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred59_PlexilTreeTransforms()) ) {s = 2;}
						else if ( (true) ) {s = 4;}
						 
						input.seek(index33_10);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 33, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA35_eotS =
		"\13\uffff";
	static final String DFA35_eofS =
		"\13\uffff";
	static final String DFA35_minS =
		"\1\4\1\2\1\uffff\1\0\1\uffff\1\2\1\4\1\0\2\3\1\0";
	static final String DFA35_maxS =
		"\2\u00bb\1\uffff\1\0\1\uffff\2\u00bb\1\0\2\u00bb\1\0";
	static final String DFA35_acceptS =
		"\2\uffff\1\1\1\uffff\1\2\6\uffff";
	static final String DFA35_specialS =
		"\3\uffff\1\0\3\uffff\1\1\2\uffff\1\2}>";
	static final String[] DFA35_transitionS = {
			"\45\2\1\1\u0092\2",
			"\1\2\1\4\45\5\1\3\u0092\5",
			"",
			"\1\uffff",
			"",
			"\1\6\1\4\45\5\1\7\u0092\5",
			"\u00b8\10",
			"\1\uffff",
			"\1\11\u00b8\10",
			"\1\4\45\5\1\12\u0092\5",
			"\1\uffff"
	};

	static final short[] DFA35_eot = DFA.unpackEncodedString(DFA35_eotS);
	static final short[] DFA35_eof = DFA.unpackEncodedString(DFA35_eofS);
	static final char[] DFA35_min = DFA.unpackEncodedStringToUnsignedChars(DFA35_minS);
	static final char[] DFA35_max = DFA.unpackEncodedStringToUnsignedChars(DFA35_maxS);
	static final short[] DFA35_accept = DFA.unpackEncodedString(DFA35_acceptS);
	static final short[] DFA35_special = DFA.unpackEncodedString(DFA35_specialS);
	static final short[][] DFA35_transition;

	static {
		int numStates = DFA35_transitionS.length;
		DFA35_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA35_transition[i] = DFA.unpackEncodedString(DFA35_transitionS[i]);
		}
	}

	protected class DFA35 extends DFA {

		public DFA35(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 35;
			this.eot = DFA35_eot;
			this.eof = DFA35_eof;
			this.min = DFA35_min;
			this.max = DFA35_max;
			this.accept = DFA35_accept;
			this.special = DFA35_special;
			this.transition = DFA35_transition;
		}
		@Override
		public String getDescription() {
			return "()+ loopback of 163:17: (args+= . )+";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TreeNodeStream input = (TreeNodeStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA35_3 = input.LA(1);
						 
						int index35_3 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred62_PlexilTreeTransforms()) ) {s = 2;}
						else if ( (true) ) {s = 4;}
						 
						input.seek(index35_3);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA35_7 = input.LA(1);
						 
						int index35_7 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred62_PlexilTreeTransforms()) ) {s = 2;}
						else if ( (true) ) {s = 4;}
						 
						input.seek(index35_7);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA35_10 = input.LA(1);
						 
						int index35_10 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred62_PlexilTreeTransforms()) ) {s = 2;}
						else if ( (true) ) {s = 4;}
						 
						input.seek(index35_10);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 35, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA37_eotS =
		"\13\uffff";
	static final String DFA37_eofS =
		"\13\uffff";
	static final String DFA37_minS =
		"\1\4\1\2\1\uffff\1\0\1\uffff\1\2\1\4\1\0\2\3\1\0";
	static final String DFA37_maxS =
		"\2\u00bb\1\uffff\1\0\1\uffff\2\u00bb\1\0\2\u00bb\1\0";
	static final String DFA37_acceptS =
		"\2\uffff\1\1\1\uffff\1\2\6\uffff";
	static final String DFA37_specialS =
		"\3\uffff\1\0\3\uffff\1\1\2\uffff\1\2}>";
	static final String[] DFA37_transitionS = {
			"\104\2\1\1\163\2",
			"\1\2\1\4\104\5\1\3\163\5",
			"",
			"\1\uffff",
			"",
			"\1\6\1\4\104\5\1\7\163\5",
			"\u00b8\10",
			"\1\uffff",
			"\1\11\u00b8\10",
			"\1\4\104\5\1\12\163\5",
			"\1\uffff"
	};

	static final short[] DFA37_eot = DFA.unpackEncodedString(DFA37_eotS);
	static final short[] DFA37_eof = DFA.unpackEncodedString(DFA37_eofS);
	static final char[] DFA37_min = DFA.unpackEncodedStringToUnsignedChars(DFA37_minS);
	static final char[] DFA37_max = DFA.unpackEncodedStringToUnsignedChars(DFA37_maxS);
	static final short[] DFA37_accept = DFA.unpackEncodedString(DFA37_acceptS);
	static final short[] DFA37_special = DFA.unpackEncodedString(DFA37_specialS);
	static final short[][] DFA37_transition;

	static {
		int numStates = DFA37_transitionS.length;
		DFA37_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA37_transition[i] = DFA.unpackEncodedString(DFA37_transitionS[i]);
		}
	}

	protected class DFA37 extends DFA {

		public DFA37(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 37;
			this.eot = DFA37_eot;
			this.eof = DFA37_eof;
			this.min = DFA37_min;
			this.max = DFA37_max;
			this.accept = DFA37_accept;
			this.special = DFA37_special;
			this.transition = DFA37_transition;
		}
		@Override
		public String getDescription() {
			return "()* loopback of 164:20: (args+= . )*";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TreeNodeStream input = (TreeNodeStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA37_3 = input.LA(1);
						 
						int index37_3 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred65_PlexilTreeTransforms()) ) {s = 2;}
						else if ( (true) ) {s = 4;}
						 
						input.seek(index37_3);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA37_7 = input.LA(1);
						 
						int index37_7 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred65_PlexilTreeTransforms()) ) {s = 2;}
						else if ( (true) ) {s = 4;}
						 
						input.seek(index37_7);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA37_10 = input.LA(1);
						 
						int index37_10 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred65_PlexilTreeTransforms()) ) {s = 2;}
						else if ( (true) ) {s = 4;}
						 
						input.seek(index37_10);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 37, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA39_eotS =
		"\13\uffff";
	static final String DFA39_eofS =
		"\13\uffff";
	static final String DFA39_minS =
		"\1\4\1\2\1\uffff\1\0\1\uffff\1\2\1\4\1\0\2\3\1\0";
	static final String DFA39_maxS =
		"\2\u00bb\1\uffff\1\0\1\uffff\2\u00bb\1\0\2\u00bb\1\0";
	static final String DFA39_acceptS =
		"\2\uffff\1\1\1\uffff\1\2\6\uffff";
	static final String DFA39_specialS =
		"\3\uffff\1\0\3\uffff\1\1\2\uffff\1\2}>";
	static final String[] DFA39_transitionS = {
			"\45\2\1\1\u0092\2",
			"\1\2\1\4\45\5\1\3\u0092\5",
			"",
			"\1\uffff",
			"",
			"\1\6\1\4\45\5\1\7\u0092\5",
			"\u00b8\10",
			"\1\uffff",
			"\1\11\u00b8\10",
			"\1\4\45\5\1\12\u0092\5",
			"\1\uffff"
	};

	static final short[] DFA39_eot = DFA.unpackEncodedString(DFA39_eotS);
	static final short[] DFA39_eof = DFA.unpackEncodedString(DFA39_eofS);
	static final char[] DFA39_min = DFA.unpackEncodedStringToUnsignedChars(DFA39_minS);
	static final char[] DFA39_max = DFA.unpackEncodedStringToUnsignedChars(DFA39_maxS);
	static final short[] DFA39_accept = DFA.unpackEncodedString(DFA39_acceptS);
	static final short[] DFA39_special = DFA.unpackEncodedString(DFA39_specialS);
	static final short[][] DFA39_transition;

	static {
		int numStates = DFA39_transitionS.length;
		DFA39_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA39_transition[i] = DFA.unpackEncodedString(DFA39_transitionS[i]);
		}
	}

	protected class DFA39 extends DFA {

		public DFA39(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 39;
			this.eot = DFA39_eot;
			this.eof = DFA39_eof;
			this.min = DFA39_min;
			this.max = DFA39_max;
			this.accept = DFA39_accept;
			this.special = DFA39_special;
			this.transition = DFA39_transition;
		}
		@Override
		public String getDescription() {
			return "()* loopback of 165:20: (args+= . )*";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TreeNodeStream input = (TreeNodeStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA39_3 = input.LA(1);
						 
						int index39_3 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred68_PlexilTreeTransforms()) ) {s = 2;}
						else if ( (true) ) {s = 4;}
						 
						input.seek(index39_3);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA39_7 = input.LA(1);
						 
						int index39_7 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred68_PlexilTreeTransforms()) ) {s = 2;}
						else if ( (true) ) {s = 4;}
						 
						input.seek(index39_7);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA39_10 = input.LA(1);
						 
						int index39_10 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred68_PlexilTreeTransforms()) ) {s = 2;}
						else if ( (true) ) {s = 4;}
						 
						input.seek(index39_10);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 39, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA41_eotS =
		"\13\uffff";
	static final String DFA41_eofS =
		"\13\uffff";
	static final String DFA41_minS =
		"\1\4\1\2\1\uffff\1\0\1\uffff\1\2\1\4\1\0\2\3\1\0";
	static final String DFA41_maxS =
		"\2\u00bb\1\uffff\1\0\1\uffff\2\u00bb\1\0\2\u00bb\1\0";
	static final String DFA41_acceptS =
		"\2\uffff\1\1\1\uffff\1\2\6\uffff";
	static final String DFA41_specialS =
		"\3\uffff\1\0\3\uffff\1\1\2\uffff\1\2}>";
	static final String[] DFA41_transitionS = {
			"\104\2\1\1\163\2",
			"\1\2\1\4\104\5\1\3\163\5",
			"",
			"\1\uffff",
			"",
			"\1\6\1\4\104\5\1\7\163\5",
			"\u00b8\10",
			"\1\uffff",
			"\1\11\u00b8\10",
			"\1\4\104\5\1\12\163\5",
			"\1\uffff"
	};

	static final short[] DFA41_eot = DFA.unpackEncodedString(DFA41_eotS);
	static final short[] DFA41_eof = DFA.unpackEncodedString(DFA41_eofS);
	static final char[] DFA41_min = DFA.unpackEncodedStringToUnsignedChars(DFA41_minS);
	static final char[] DFA41_max = DFA.unpackEncodedStringToUnsignedChars(DFA41_maxS);
	static final short[] DFA41_accept = DFA.unpackEncodedString(DFA41_acceptS);
	static final short[] DFA41_special = DFA.unpackEncodedString(DFA41_specialS);
	static final short[][] DFA41_transition;

	static {
		int numStates = DFA41_transitionS.length;
		DFA41_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA41_transition[i] = DFA.unpackEncodedString(DFA41_transitionS[i]);
		}
	}

	protected class DFA41 extends DFA {

		public DFA41(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 41;
			this.eot = DFA41_eot;
			this.eof = DFA41_eof;
			this.min = DFA41_min;
			this.max = DFA41_max;
			this.accept = DFA41_accept;
			this.special = DFA41_special;
			this.transition = DFA41_transition;
		}
		@Override
		public String getDescription() {
			return "()+ loopback of 166:17: (args+= . )+";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TreeNodeStream input = (TreeNodeStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA41_3 = input.LA(1);
						 
						int index41_3 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred71_PlexilTreeTransforms()) ) {s = 2;}
						else if ( (true) ) {s = 4;}
						 
						input.seek(index41_3);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA41_7 = input.LA(1);
						 
						int index41_7 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred71_PlexilTreeTransforms()) ) {s = 2;}
						else if ( (true) ) {s = 4;}
						 
						input.seek(index41_7);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA41_10 = input.LA(1);
						 
						int index41_10 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred71_PlexilTreeTransforms()) ) {s = 2;}
						else if ( (true) ) {s = 4;}
						 
						input.seek(index41_10);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 41, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA43_eotS =
		"\13\uffff";
	static final String DFA43_eofS =
		"\13\uffff";
	static final String DFA43_minS =
		"\1\4\1\2\1\uffff\1\0\1\uffff\1\2\1\4\1\0\2\3\1\0";
	static final String DFA43_maxS =
		"\2\u00bb\1\uffff\1\0\1\uffff\2\u00bb\1\0\2\u00bb\1\0";
	static final String DFA43_acceptS =
		"\2\uffff\1\1\1\uffff\1\2\6\uffff";
	static final String DFA43_specialS =
		"\3\uffff\1\0\3\uffff\1\1\2\uffff\1\2}>";
	static final String[] DFA43_transitionS = {
			"\45\2\1\1\u0092\2",
			"\1\2\1\4\45\5\1\3\u0092\5",
			"",
			"\1\uffff",
			"",
			"\1\6\1\4\45\5\1\7\u0092\5",
			"\u00b8\10",
			"\1\uffff",
			"\1\11\u00b8\10",
			"\1\4\45\5\1\12\u0092\5",
			"\1\uffff"
	};

	static final short[] DFA43_eot = DFA.unpackEncodedString(DFA43_eotS);
	static final short[] DFA43_eof = DFA.unpackEncodedString(DFA43_eofS);
	static final char[] DFA43_min = DFA.unpackEncodedStringToUnsignedChars(DFA43_minS);
	static final char[] DFA43_max = DFA.unpackEncodedStringToUnsignedChars(DFA43_maxS);
	static final short[] DFA43_accept = DFA.unpackEncodedString(DFA43_acceptS);
	static final short[] DFA43_special = DFA.unpackEncodedString(DFA43_specialS);
	static final short[][] DFA43_transition;

	static {
		int numStates = DFA43_transitionS.length;
		DFA43_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA43_transition[i] = DFA.unpackEncodedString(DFA43_transitionS[i]);
		}
	}

	protected class DFA43 extends DFA {

		public DFA43(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 43;
			this.eot = DFA43_eot;
			this.eof = DFA43_eof;
			this.min = DFA43_min;
			this.max = DFA43_max;
			this.accept = DFA43_accept;
			this.special = DFA43_special;
			this.transition = DFA43_transition;
		}
		@Override
		public String getDescription() {
			return "()+ loopback of 167:17: (args+= . )+";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TreeNodeStream input = (TreeNodeStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA43_3 = input.LA(1);
						 
						int index43_3 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred74_PlexilTreeTransforms()) ) {s = 2;}
						else if ( (true) ) {s = 4;}
						 
						input.seek(index43_3);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA43_7 = input.LA(1);
						 
						int index43_7 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred74_PlexilTreeTransforms()) ) {s = 2;}
						else if ( (true) ) {s = 4;}
						 
						input.seek(index43_7);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA43_10 = input.LA(1);
						 
						int index43_10 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred74_PlexilTreeTransforms()) ) {s = 2;}
						else if ( (true) ) {s = 4;}
						 
						input.seek(index43_10);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 43, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA46_eotS =
		"\51\uffff";
	static final String DFA46_eofS =
		"\51\uffff";
	static final String DFA46_minS =
		"\1\50\2\2\2\4\7\2\1\4\1\2\1\uffff\2\2\3\uffff\1\2\1\4\1\2\1\uffff\2\2"+
		"\3\uffff\1\0\1\3\4\0\1\3\3\0\2\74";
	static final String DFA46_maxS =
		"\1\150\2\2\4\u00bb\1\u00ae\2\u00bb\1\u00ae\1\3\1\u00bb\1\3\1\uffff\2\3"+
		"\3\uffff\1\3\1\u00bb\1\3\1\uffff\2\3\3\uffff\1\0\1\u00bb\4\0\1\u00bb\3"+
		"\0\2\u00ae";
	static final String DFA46_acceptS =
		"\16\uffff\1\2\2\uffff\1\4\1\1\1\3\3\uffff\1\6\2\uffff\1\10\1\5\1\7\14"+
		"\uffff";
	static final String DFA46_specialS =
		"\35\uffff\1\0\1\uffff\1\1\1\2\1\3\1\4\1\uffff\1\6\1\5\1\7\2\uffff}>";
	static final String[] DFA46_transitionS = {
			"\1\1\77\uffff\1\2",
			"\1\3",
			"\1\4",
			"\70\7\1\6\161\7\1\5\15\7",
			"\70\12\1\10\161\12\1\11\15\12",
			"\1\14\1\uffff\70\16\1\15\161\16\1\13\15\16",
			"\1\14\1\uffff\70\21\1\20\161\21\1\17\15\21",
			"\1\14\71\uffff\1\23\161\uffff\1\22",
			"\1\25\1\uffff\70\27\1\24\161\27\1\26\15\27",
			"\1\25\1\uffff\70\32\1\30\161\32\1\31\15\32",
			"\1\25\71\uffff\1\33\161\uffff\1\34",
			"\1\16\1\35",
			"\u00b8\36",
			"\1\16\1\37",
			"",
			"\1\21\1\40",
			"\1\21\1\41",
			"",
			"",
			"",
			"\1\27\1\42",
			"\u00b8\43",
			"\1\27\1\44",
			"",
			"\1\32\1\45",
			"\1\32\1\46",
			"",
			"",
			"",
			"\1\uffff",
			"\1\47\u00b8\36",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\50\u00b8\43",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\23\161\uffff\1\22",
			"\1\33\161\uffff\1\34"
	};

	static final short[] DFA46_eot = DFA.unpackEncodedString(DFA46_eotS);
	static final short[] DFA46_eof = DFA.unpackEncodedString(DFA46_eofS);
	static final char[] DFA46_min = DFA.unpackEncodedStringToUnsignedChars(DFA46_minS);
	static final char[] DFA46_max = DFA.unpackEncodedStringToUnsignedChars(DFA46_maxS);
	static final short[] DFA46_accept = DFA.unpackEncodedString(DFA46_acceptS);
	static final short[] DFA46_special = DFA.unpackEncodedString(DFA46_specialS);
	static final short[][] DFA46_transition;

	static {
		int numStates = DFA46_transitionS.length;
		DFA46_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA46_transition[i] = DFA.unpackEncodedString(DFA46_transitionS[i]);
		}
	}

	protected class DFA46 extends DFA {

		public DFA46(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 46;
			this.eot = DFA46_eot;
			this.eof = DFA46_eof;
			this.min = DFA46_min;
			this.max = DFA46_max;
			this.accept = DFA46_accept;
			this.special = DFA46_special;
			this.transition = DFA46_transition;
		}
		@Override
		public String getDescription() {
			return "170:1: booleanEqualityReduction : ( ^( DEQUALS arg= . TRUE_KYWD ) -> $arg| ^( DEQUALS TRUE_KYWD arg= . ) -> $arg| ^( DEQUALS arg= . FALSE_KYWD ) -> ^( NOT_KYWD $arg) | ^( DEQUALS FALSE_KYWD arg= . ) -> ^( NOT_KYWD $arg) | ^( NEQUALS arg= . FALSE_KYWD ) -> $arg| ^( NEQUALS FALSE_KYWD arg= . ) -> $arg| ^( NEQUALS arg= . TRUE_KYWD ) -> ^( NOT_KYWD $arg) | ^( NEQUALS TRUE_KYWD arg= . ) -> ^( NOT_KYWD $arg) );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TreeNodeStream input = (TreeNodeStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA46_29 = input.LA(1);
						 
						int index46_29 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred76_PlexilTreeTransforms()) ) {s = 18;}
						else if ( (synpred77_PlexilTreeTransforms()) ) {s = 14;}
						 
						input.seek(index46_29);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA46_31 = input.LA(1);
						 
						int index46_31 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred77_PlexilTreeTransforms()) ) {s = 14;}
						else if ( (synpred78_PlexilTreeTransforms()) ) {s = 19;}
						 
						input.seek(index46_31);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA46_32 = input.LA(1);
						 
						int index46_32 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred76_PlexilTreeTransforms()) ) {s = 18;}
						else if ( (synpred79_PlexilTreeTransforms()) ) {s = 17;}
						 
						input.seek(index46_32);
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA46_33 = input.LA(1);
						 
						int index46_33 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred78_PlexilTreeTransforms()) ) {s = 19;}
						else if ( (synpred79_PlexilTreeTransforms()) ) {s = 17;}
						 
						input.seek(index46_33);
						if ( s>=0 ) return s;
						break;

					case 4 : 
						int LA46_34 = input.LA(1);
						 
						int index46_34 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred80_PlexilTreeTransforms()) ) {s = 27;}
						else if ( (synpred81_PlexilTreeTransforms()) ) {s = 23;}
						 
						input.seek(index46_34);
						if ( s>=0 ) return s;
						break;

					case 5 : 
						int LA46_37 = input.LA(1);
						 
						int index46_37 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred80_PlexilTreeTransforms()) ) {s = 27;}
						else if ( (true) ) {s = 26;}
						 
						input.seek(index46_37);
						if ( s>=0 ) return s;
						break;

					case 6 : 
						int LA46_36 = input.LA(1);
						 
						int index46_36 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred81_PlexilTreeTransforms()) ) {s = 23;}
						else if ( (synpred82_PlexilTreeTransforms()) ) {s = 28;}
						 
						input.seek(index46_36);
						if ( s>=0 ) return s;
						break;

					case 7 : 
						int LA46_38 = input.LA(1);
						 
						int index46_38 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred82_PlexilTreeTransforms()) ) {s = 28;}
						else if ( (true) ) {s = 26;}
						 
						input.seek(index46_38);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 46, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA70_eotS =
		"\13\uffff";
	static final String DFA70_eofS =
		"\13\uffff";
	static final String DFA70_minS =
		"\1\4\1\2\1\uffff\1\0\1\uffff\1\2\1\4\1\0\2\3\1\0";
	static final String DFA70_maxS =
		"\2\u00bb\1\uffff\1\0\1\uffff\2\u00bb\1\0\2\u00bb\1\0";
	static final String DFA70_acceptS =
		"\2\uffff\1\1\1\uffff\1\2\6\uffff";
	static final String DFA70_specialS =
		"\3\uffff\1\0\3\uffff\1\1\2\uffff\1\2}>";
	static final String[] DFA70_transitionS = {
			"\104\2\1\1\163\2",
			"\1\2\1\4\104\5\1\3\163\5",
			"",
			"\1\uffff",
			"",
			"\1\6\1\4\104\5\1\7\163\5",
			"\u00b8\10",
			"\1\uffff",
			"\1\11\u00b8\10",
			"\1\4\104\5\1\12\163\5",
			"\1\uffff"
	};

	static final short[] DFA70_eot = DFA.unpackEncodedString(DFA70_eotS);
	static final short[] DFA70_eof = DFA.unpackEncodedString(DFA70_eofS);
	static final char[] DFA70_min = DFA.unpackEncodedStringToUnsignedChars(DFA70_minS);
	static final char[] DFA70_max = DFA.unpackEncodedStringToUnsignedChars(DFA70_maxS);
	static final short[] DFA70_accept = DFA.unpackEncodedString(DFA70_acceptS);
	static final short[] DFA70_special = DFA.unpackEncodedString(DFA70_specialS);
	static final short[][] DFA70_transition;

	static {
		int numStates = DFA70_transitionS.length;
		DFA70_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA70_transition[i] = DFA.unpackEncodedString(DFA70_transitionS[i]);
		}
	}

	protected class DFA70 extends DFA {

		public DFA70(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 70;
			this.eot = DFA70_eot;
			this.eof = DFA70_eof;
			this.min = DFA70_min;
			this.max = DFA70_max;
			this.accept = DFA70_accept;
			this.special = DFA70_special;
			this.transition = DFA70_transition;
		}
		@Override
		public String getDescription() {
			return "()* loopback of 160:16: (args+= . )*";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TreeNodeStream input = (TreeNodeStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA70_3 = input.LA(1);
						 
						int index70_3 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred53_PlexilTreeTransforms()) ) {s = 2;}
						else if ( (true) ) {s = 4;}
						 
						input.seek(index70_3);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA70_7 = input.LA(1);
						 
						int index70_7 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred53_PlexilTreeTransforms()) ) {s = 2;}
						else if ( (true) ) {s = 4;}
						 
						input.seek(index70_7);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA70_10 = input.LA(1);
						 
						int index70_10 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred53_PlexilTreeTransforms()) ) {s = 2;}
						else if ( (true) ) {s = 4;}
						 
						input.seek(index70_10);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 70, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA72_eotS =
		"\13\uffff";
	static final String DFA72_eofS =
		"\13\uffff";
	static final String DFA72_minS =
		"\1\4\1\2\1\uffff\1\0\1\uffff\1\2\1\4\1\0\2\3\1\0";
	static final String DFA72_maxS =
		"\2\u00bb\1\uffff\1\0\1\uffff\2\u00bb\1\0\2\u00bb\1\0";
	static final String DFA72_acceptS =
		"\2\uffff\1\1\1\uffff\1\2\6\uffff";
	static final String DFA72_specialS =
		"\3\uffff\1\0\3\uffff\1\1\2\uffff\1\2}>";
	static final String[] DFA72_transitionS = {
			"\45\2\1\1\u0092\2",
			"\1\2\1\4\45\5\1\3\u0092\5",
			"",
			"\1\uffff",
			"",
			"\1\6\1\4\45\5\1\7\u0092\5",
			"\u00b8\10",
			"\1\uffff",
			"\1\11\u00b8\10",
			"\1\4\45\5\1\12\u0092\5",
			"\1\uffff"
	};

	static final short[] DFA72_eot = DFA.unpackEncodedString(DFA72_eotS);
	static final short[] DFA72_eof = DFA.unpackEncodedString(DFA72_eofS);
	static final char[] DFA72_min = DFA.unpackEncodedStringToUnsignedChars(DFA72_minS);
	static final char[] DFA72_max = DFA.unpackEncodedStringToUnsignedChars(DFA72_maxS);
	static final short[] DFA72_accept = DFA.unpackEncodedString(DFA72_acceptS);
	static final short[] DFA72_special = DFA.unpackEncodedString(DFA72_specialS);
	static final short[][] DFA72_transition;

	static {
		int numStates = DFA72_transitionS.length;
		DFA72_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA72_transition[i] = DFA.unpackEncodedString(DFA72_transitionS[i]);
		}
	}

	protected class DFA72 extends DFA {

		public DFA72(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 72;
			this.eot = DFA72_eot;
			this.eof = DFA72_eof;
			this.min = DFA72_min;
			this.max = DFA72_max;
			this.accept = DFA72_accept;
			this.special = DFA72_special;
			this.transition = DFA72_transition;
		}
		@Override
		public String getDescription() {
			return "()* loopback of 161:16: (args+= . )*";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TreeNodeStream input = (TreeNodeStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA72_3 = input.LA(1);
						 
						int index72_3 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred56_PlexilTreeTransforms()) ) {s = 2;}
						else if ( (true) ) {s = 4;}
						 
						input.seek(index72_3);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA72_7 = input.LA(1);
						 
						int index72_7 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred56_PlexilTreeTransforms()) ) {s = 2;}
						else if ( (true) ) {s = 4;}
						 
						input.seek(index72_7);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA72_10 = input.LA(1);
						 
						int index72_10 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred56_PlexilTreeTransforms()) ) {s = 2;}
						else if ( (true) ) {s = 4;}
						 
						input.seek(index72_10);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 72, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA74_eotS =
		"\13\uffff";
	static final String DFA74_eofS =
		"\13\uffff";
	static final String DFA74_minS =
		"\1\4\1\2\1\uffff\1\0\1\uffff\1\2\1\4\1\0\2\3\1\0";
	static final String DFA74_maxS =
		"\2\u00bb\1\uffff\1\0\1\uffff\2\u00bb\1\0\2\u00bb\1\0";
	static final String DFA74_acceptS =
		"\2\uffff\1\1\1\uffff\1\2\6\uffff";
	static final String DFA74_specialS =
		"\3\uffff\1\0\3\uffff\1\1\2\uffff\1\2}>";
	static final String[] DFA74_transitionS = {
			"\104\2\1\1\163\2",
			"\1\2\1\4\104\5\1\3\163\5",
			"",
			"\1\uffff",
			"",
			"\1\6\1\4\104\5\1\7\163\5",
			"\u00b8\10",
			"\1\uffff",
			"\1\11\u00b8\10",
			"\1\4\104\5\1\12\163\5",
			"\1\uffff"
	};

	static final short[] DFA74_eot = DFA.unpackEncodedString(DFA74_eotS);
	static final short[] DFA74_eof = DFA.unpackEncodedString(DFA74_eofS);
	static final char[] DFA74_min = DFA.unpackEncodedStringToUnsignedChars(DFA74_minS);
	static final char[] DFA74_max = DFA.unpackEncodedStringToUnsignedChars(DFA74_maxS);
	static final short[] DFA74_accept = DFA.unpackEncodedString(DFA74_acceptS);
	static final short[] DFA74_special = DFA.unpackEncodedString(DFA74_specialS);
	static final short[][] DFA74_transition;

	static {
		int numStates = DFA74_transitionS.length;
		DFA74_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA74_transition[i] = DFA.unpackEncodedString(DFA74_transitionS[i]);
		}
	}

	protected class DFA74 extends DFA {

		public DFA74(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 74;
			this.eot = DFA74_eot;
			this.eof = DFA74_eof;
			this.min = DFA74_min;
			this.max = DFA74_max;
			this.accept = DFA74_accept;
			this.special = DFA74_special;
			this.transition = DFA74_transition;
		}
		@Override
		public String getDescription() {
			return "()+ loopback of 162:17: (args+= . )+";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TreeNodeStream input = (TreeNodeStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA74_3 = input.LA(1);
						 
						int index74_3 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred59_PlexilTreeTransforms()) ) {s = 2;}
						else if ( (true) ) {s = 4;}
						 
						input.seek(index74_3);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA74_7 = input.LA(1);
						 
						int index74_7 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred59_PlexilTreeTransforms()) ) {s = 2;}
						else if ( (true) ) {s = 4;}
						 
						input.seek(index74_7);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA74_10 = input.LA(1);
						 
						int index74_10 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred59_PlexilTreeTransforms()) ) {s = 2;}
						else if ( (true) ) {s = 4;}
						 
						input.seek(index74_10);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 74, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA76_eotS =
		"\13\uffff";
	static final String DFA76_eofS =
		"\13\uffff";
	static final String DFA76_minS =
		"\1\4\1\2\1\uffff\1\0\1\uffff\1\2\1\4\1\0\2\3\1\0";
	static final String DFA76_maxS =
		"\2\u00bb\1\uffff\1\0\1\uffff\2\u00bb\1\0\2\u00bb\1\0";
	static final String DFA76_acceptS =
		"\2\uffff\1\1\1\uffff\1\2\6\uffff";
	static final String DFA76_specialS =
		"\3\uffff\1\0\3\uffff\1\1\2\uffff\1\2}>";
	static final String[] DFA76_transitionS = {
			"\45\2\1\1\u0092\2",
			"\1\2\1\4\45\5\1\3\u0092\5",
			"",
			"\1\uffff",
			"",
			"\1\6\1\4\45\5\1\7\u0092\5",
			"\u00b8\10",
			"\1\uffff",
			"\1\11\u00b8\10",
			"\1\4\45\5\1\12\u0092\5",
			"\1\uffff"
	};

	static final short[] DFA76_eot = DFA.unpackEncodedString(DFA76_eotS);
	static final short[] DFA76_eof = DFA.unpackEncodedString(DFA76_eofS);
	static final char[] DFA76_min = DFA.unpackEncodedStringToUnsignedChars(DFA76_minS);
	static final char[] DFA76_max = DFA.unpackEncodedStringToUnsignedChars(DFA76_maxS);
	static final short[] DFA76_accept = DFA.unpackEncodedString(DFA76_acceptS);
	static final short[] DFA76_special = DFA.unpackEncodedString(DFA76_specialS);
	static final short[][] DFA76_transition;

	static {
		int numStates = DFA76_transitionS.length;
		DFA76_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA76_transition[i] = DFA.unpackEncodedString(DFA76_transitionS[i]);
		}
	}

	protected class DFA76 extends DFA {

		public DFA76(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 76;
			this.eot = DFA76_eot;
			this.eof = DFA76_eof;
			this.min = DFA76_min;
			this.max = DFA76_max;
			this.accept = DFA76_accept;
			this.special = DFA76_special;
			this.transition = DFA76_transition;
		}
		@Override
		public String getDescription() {
			return "()+ loopback of 163:17: (args+= . )+";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TreeNodeStream input = (TreeNodeStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA76_3 = input.LA(1);
						 
						int index76_3 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred62_PlexilTreeTransforms()) ) {s = 2;}
						else if ( (true) ) {s = 4;}
						 
						input.seek(index76_3);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA76_7 = input.LA(1);
						 
						int index76_7 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred62_PlexilTreeTransforms()) ) {s = 2;}
						else if ( (true) ) {s = 4;}
						 
						input.seek(index76_7);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA76_10 = input.LA(1);
						 
						int index76_10 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred62_PlexilTreeTransforms()) ) {s = 2;}
						else if ( (true) ) {s = 4;}
						 
						input.seek(index76_10);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 76, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA78_eotS =
		"\13\uffff";
	static final String DFA78_eofS =
		"\13\uffff";
	static final String DFA78_minS =
		"\1\4\1\2\1\uffff\1\0\1\uffff\1\2\1\4\1\0\2\3\1\0";
	static final String DFA78_maxS =
		"\2\u00bb\1\uffff\1\0\1\uffff\2\u00bb\1\0\2\u00bb\1\0";
	static final String DFA78_acceptS =
		"\2\uffff\1\1\1\uffff\1\2\6\uffff";
	static final String DFA78_specialS =
		"\3\uffff\1\0\3\uffff\1\1\2\uffff\1\2}>";
	static final String[] DFA78_transitionS = {
			"\104\2\1\1\163\2",
			"\1\2\1\4\104\5\1\3\163\5",
			"",
			"\1\uffff",
			"",
			"\1\6\1\4\104\5\1\7\163\5",
			"\u00b8\10",
			"\1\uffff",
			"\1\11\u00b8\10",
			"\1\4\104\5\1\12\163\5",
			"\1\uffff"
	};

	static final short[] DFA78_eot = DFA.unpackEncodedString(DFA78_eotS);
	static final short[] DFA78_eof = DFA.unpackEncodedString(DFA78_eofS);
	static final char[] DFA78_min = DFA.unpackEncodedStringToUnsignedChars(DFA78_minS);
	static final char[] DFA78_max = DFA.unpackEncodedStringToUnsignedChars(DFA78_maxS);
	static final short[] DFA78_accept = DFA.unpackEncodedString(DFA78_acceptS);
	static final short[] DFA78_special = DFA.unpackEncodedString(DFA78_specialS);
	static final short[][] DFA78_transition;

	static {
		int numStates = DFA78_transitionS.length;
		DFA78_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA78_transition[i] = DFA.unpackEncodedString(DFA78_transitionS[i]);
		}
	}

	protected class DFA78 extends DFA {

		public DFA78(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 78;
			this.eot = DFA78_eot;
			this.eof = DFA78_eof;
			this.min = DFA78_min;
			this.max = DFA78_max;
			this.accept = DFA78_accept;
			this.special = DFA78_special;
			this.transition = DFA78_transition;
		}
		@Override
		public String getDescription() {
			return "()* loopback of 164:20: (args+= . )*";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TreeNodeStream input = (TreeNodeStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA78_3 = input.LA(1);
						 
						int index78_3 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred65_PlexilTreeTransforms()) ) {s = 2;}
						else if ( (true) ) {s = 4;}
						 
						input.seek(index78_3);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA78_7 = input.LA(1);
						 
						int index78_7 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred65_PlexilTreeTransforms()) ) {s = 2;}
						else if ( (true) ) {s = 4;}
						 
						input.seek(index78_7);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA78_10 = input.LA(1);
						 
						int index78_10 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred65_PlexilTreeTransforms()) ) {s = 2;}
						else if ( (true) ) {s = 4;}
						 
						input.seek(index78_10);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 78, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA80_eotS =
		"\13\uffff";
	static final String DFA80_eofS =
		"\13\uffff";
	static final String DFA80_minS =
		"\1\4\1\2\1\uffff\1\0\1\uffff\1\2\1\4\1\0\2\3\1\0";
	static final String DFA80_maxS =
		"\2\u00bb\1\uffff\1\0\1\uffff\2\u00bb\1\0\2\u00bb\1\0";
	static final String DFA80_acceptS =
		"\2\uffff\1\1\1\uffff\1\2\6\uffff";
	static final String DFA80_specialS =
		"\3\uffff\1\0\3\uffff\1\1\2\uffff\1\2}>";
	static final String[] DFA80_transitionS = {
			"\45\2\1\1\u0092\2",
			"\1\2\1\4\45\5\1\3\u0092\5",
			"",
			"\1\uffff",
			"",
			"\1\6\1\4\45\5\1\7\u0092\5",
			"\u00b8\10",
			"\1\uffff",
			"\1\11\u00b8\10",
			"\1\4\45\5\1\12\u0092\5",
			"\1\uffff"
	};

	static final short[] DFA80_eot = DFA.unpackEncodedString(DFA80_eotS);
	static final short[] DFA80_eof = DFA.unpackEncodedString(DFA80_eofS);
	static final char[] DFA80_min = DFA.unpackEncodedStringToUnsignedChars(DFA80_minS);
	static final char[] DFA80_max = DFA.unpackEncodedStringToUnsignedChars(DFA80_maxS);
	static final short[] DFA80_accept = DFA.unpackEncodedString(DFA80_acceptS);
	static final short[] DFA80_special = DFA.unpackEncodedString(DFA80_specialS);
	static final short[][] DFA80_transition;

	static {
		int numStates = DFA80_transitionS.length;
		DFA80_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA80_transition[i] = DFA.unpackEncodedString(DFA80_transitionS[i]);
		}
	}

	protected class DFA80 extends DFA {

		public DFA80(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 80;
			this.eot = DFA80_eot;
			this.eof = DFA80_eof;
			this.min = DFA80_min;
			this.max = DFA80_max;
			this.accept = DFA80_accept;
			this.special = DFA80_special;
			this.transition = DFA80_transition;
		}
		@Override
		public String getDescription() {
			return "()* loopback of 165:20: (args+= . )*";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TreeNodeStream input = (TreeNodeStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA80_3 = input.LA(1);
						 
						int index80_3 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred68_PlexilTreeTransforms()) ) {s = 2;}
						else if ( (true) ) {s = 4;}
						 
						input.seek(index80_3);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA80_7 = input.LA(1);
						 
						int index80_7 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred68_PlexilTreeTransforms()) ) {s = 2;}
						else if ( (true) ) {s = 4;}
						 
						input.seek(index80_7);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA80_10 = input.LA(1);
						 
						int index80_10 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred68_PlexilTreeTransforms()) ) {s = 2;}
						else if ( (true) ) {s = 4;}
						 
						input.seek(index80_10);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 80, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA82_eotS =
		"\13\uffff";
	static final String DFA82_eofS =
		"\13\uffff";
	static final String DFA82_minS =
		"\1\4\1\2\1\uffff\1\0\1\uffff\1\2\1\4\1\0\2\3\1\0";
	static final String DFA82_maxS =
		"\2\u00bb\1\uffff\1\0\1\uffff\2\u00bb\1\0\2\u00bb\1\0";
	static final String DFA82_acceptS =
		"\2\uffff\1\1\1\uffff\1\2\6\uffff";
	static final String DFA82_specialS =
		"\3\uffff\1\0\3\uffff\1\1\2\uffff\1\2}>";
	static final String[] DFA82_transitionS = {
			"\104\2\1\1\163\2",
			"\1\2\1\4\104\5\1\3\163\5",
			"",
			"\1\uffff",
			"",
			"\1\6\1\4\104\5\1\7\163\5",
			"\u00b8\10",
			"\1\uffff",
			"\1\11\u00b8\10",
			"\1\4\104\5\1\12\163\5",
			"\1\uffff"
	};

	static final short[] DFA82_eot = DFA.unpackEncodedString(DFA82_eotS);
	static final short[] DFA82_eof = DFA.unpackEncodedString(DFA82_eofS);
	static final char[] DFA82_min = DFA.unpackEncodedStringToUnsignedChars(DFA82_minS);
	static final char[] DFA82_max = DFA.unpackEncodedStringToUnsignedChars(DFA82_maxS);
	static final short[] DFA82_accept = DFA.unpackEncodedString(DFA82_acceptS);
	static final short[] DFA82_special = DFA.unpackEncodedString(DFA82_specialS);
	static final short[][] DFA82_transition;

	static {
		int numStates = DFA82_transitionS.length;
		DFA82_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA82_transition[i] = DFA.unpackEncodedString(DFA82_transitionS[i]);
		}
	}

	protected class DFA82 extends DFA {

		public DFA82(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 82;
			this.eot = DFA82_eot;
			this.eof = DFA82_eof;
			this.min = DFA82_min;
			this.max = DFA82_max;
			this.accept = DFA82_accept;
			this.special = DFA82_special;
			this.transition = DFA82_transition;
		}
		@Override
		public String getDescription() {
			return "()+ loopback of 166:17: (args+= . )+";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TreeNodeStream input = (TreeNodeStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA82_3 = input.LA(1);
						 
						int index82_3 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred71_PlexilTreeTransforms()) ) {s = 2;}
						else if ( (true) ) {s = 4;}
						 
						input.seek(index82_3);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA82_7 = input.LA(1);
						 
						int index82_7 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred71_PlexilTreeTransforms()) ) {s = 2;}
						else if ( (true) ) {s = 4;}
						 
						input.seek(index82_7);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA82_10 = input.LA(1);
						 
						int index82_10 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred71_PlexilTreeTransforms()) ) {s = 2;}
						else if ( (true) ) {s = 4;}
						 
						input.seek(index82_10);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 82, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	public static final BitSet FOLLOW_enterContext_in_topdown142 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exitContext_in_bottomup158 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_leftAssociativeReduction_in_bottomup168 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rightAssociativeReduction_in_bottomup178 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identityElision_in_bottomup188 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_booleanEqualityReduction_in_bottomup198 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_trivialReduction_in_bottomup208 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_flattenTrivialBlocks_in_bottomup222 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_flattenTrivialConcurrences_in_bottomup232 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bindingContextNode_in_enterContext256 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bindingContextNode_in_exitContext286 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AND_KYWD_in_leftAssociativeReduction319 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_AND_KYWD_in_leftAssociativeReduction322 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_OR_KYWD_in_leftAssociativeReduction356 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_OR_KYWD_in_leftAssociativeReduction359 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_PLUS_in_leftAssociativeReduction395 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_PLUS_in_leftAssociativeReduction398 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_MINUS_in_leftAssociativeReduction440 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_MINUS_in_leftAssociativeReduction443 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ASTERISK_in_leftAssociativeReduction487 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ASTERISK_in_leftAssociativeReduction490 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_SLASH_in_leftAssociativeReduction524 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_SLASH_in_leftAssociativeReduction527 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_MAX_KYWD_in_leftAssociativeReduction565 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_MAX_KYWD_in_leftAssociativeReduction568 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_MIN_KYWD_in_leftAssociativeReduction602 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_MIN_KYWD_in_leftAssociativeReduction605 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_AND_KYWD_in_rightAssociativeReduction649 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_AND_KYWD_in_rightAssociativeReduction659 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_OR_KYWD_in_rightAssociativeReduction690 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_OR_KYWD_in_rightAssociativeReduction700 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_PLUS_in_rightAssociativeReduction732 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_PLUS_in_rightAssociativeReduction742 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ASTERISK_in_rightAssociativeReduction780 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ASTERISK_in_rightAssociativeReduction790 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_MAX_KYWD_in_rightAssociativeReduction820 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_MAX_KYWD_in_rightAssociativeReduction830 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_MIN_KYWD_in_rightAssociativeReduction860 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_MIN_KYWD_in_rightAssociativeReduction870 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_AND_KYWD_in_trivialReduction910 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_OR_KYWD_in_trivialReduction931 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_PLUS_in_trivialReduction952 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_MINUS_in_trivialReduction973 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ASTERISK_in_trivialReduction994 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_SLASH_in_trivialReduction1015 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_MAX_KYWD_in_trivialReduction1036 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_MIN_KYWD_in_trivialReduction1057 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_AND_KYWD_in_identityElision1092 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TRUE_KYWD_in_identityElision1101 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF8L,0xFFFFFFFFFFFFFFFFL,0x0FFFFFFFFFFFFFFFL});
	public static final BitSet FOLLOW_OR_KYWD_in_identityElision1130 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_FALSE_KYWD_in_identityElision1139 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF8L,0xFFFFFFFFFFFFFFFFL,0x0FFFFFFFFFFFFFFFL});
	public static final BitSet FOLLOW_PLUS_in_identityElision1168 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INT_in_identityElision1179 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF8L,0xFFFFFFFFFFFFFFFFL,0x0FFFFFFFFFFFFFFFL});
	public static final BitSet FOLLOW_PLUS_in_identityElision1210 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_DOUBLE_in_identityElision1221 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF8L,0xFFFFFFFFFFFFFFFFL,0x0FFFFFFFFFFFFFFFL});
	public static final BitSet FOLLOW_MINUS_in_identityElision1252 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INT_in_identityElision1263 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF8L,0xFFFFFFFFFFFFFFFFL,0x0FFFFFFFFFFFFFFFL});
	public static final BitSet FOLLOW_MINUS_in_identityElision1294 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_DOUBLE_in_identityElision1305 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF8L,0xFFFFFFFFFFFFFFFFL,0x0FFFFFFFFFFFFFFFL});
	public static final BitSet FOLLOW_ASTERISK_in_identityElision1336 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INT_in_identityElision1347 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF8L,0xFFFFFFFFFFFFFFFFL,0x0FFFFFFFFFFFFFFFL});
	public static final BitSet FOLLOW_ASTERISK_in_identityElision1378 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_DOUBLE_in_identityElision1389 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF8L,0xFFFFFFFFFFFFFFFFL,0x0FFFFFFFFFFFFFFFL});
	public static final BitSet FOLLOW_SLASH_in_identityElision1420 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INT_in_identityElision1431 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF8L,0xFFFFFFFFFFFFFFFFL,0x0FFFFFFFFFFFFFFFL});
	public static final BitSet FOLLOW_SLASH_in_identityElision1462 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_DOUBLE_in_identityElision1473 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF8L,0xFFFFFFFFFFFFFFFFL,0x0FFFFFFFFFFFFFFFL});
	public static final BitSet FOLLOW_DEQUALS_in_booleanEqualityReduction1514 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TRUE_KYWD_in_booleanEqualityReduction1520 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DEQUALS_in_booleanEqualityReduction1537 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TRUE_KYWD_in_booleanEqualityReduction1539 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x0FFFFFFFFFFFFFFFL});
	public static final BitSet FOLLOW_DEQUALS_in_booleanEqualityReduction1560 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_FALSE_KYWD_in_booleanEqualityReduction1566 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DEQUALS_in_booleanEqualityReduction1587 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_FALSE_KYWD_in_booleanEqualityReduction1589 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x0FFFFFFFFFFFFFFFL});
	public static final BitSet FOLLOW_NEQUALS_in_booleanEqualityReduction1614 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_FALSE_KYWD_in_booleanEqualityReduction1620 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NEQUALS_in_booleanEqualityReduction1637 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_FALSE_KYWD_in_booleanEqualityReduction1639 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x0FFFFFFFFFFFFFFFL});
	public static final BitSet FOLLOW_NEQUALS_in_booleanEqualityReduction1660 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TRUE_KYWD_in_booleanEqualityReduction1666 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NEQUALS_in_booleanEqualityReduction1687 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TRUE_KYWD_in_booleanEqualityReduction1689 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x0FFFFFFFFFFFFFFFL});
	public static final BitSet FOLLOW_ACTION_in_flattenTrivialBlocks1726 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_BLOCK_in_flattenTrivialBlocks1729 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_unnamedAction_in_flattenTrivialBlocks1733 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ACTION_in_flattenTrivialBlocks1759 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_BLOCK_in_flattenTrivialBlocks1762 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_namedAction_in_flattenTrivialBlocks1766 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ACTION_in_flattenTrivialBlocks1792 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_NCNAME_in_flattenTrivialBlocks1796 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_BLOCK_in_flattenTrivialBlocks1799 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ACTION_in_flattenTrivialBlocks1802 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ACTION_in_flattenTrivialConcurrences1850 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_CONCURRENCE_KYWD_in_flattenTrivialConcurrences1853 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_unnamedAction_in_flattenTrivialConcurrences1857 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ACTION_in_flattenTrivialConcurrences1883 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_CONCURRENCE_KYWD_in_flattenTrivialConcurrences1886 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_namedAction_in_flattenTrivialConcurrences1890 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_ACTION_in_flattenTrivialConcurrences1916 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_NCNAME_in_flattenTrivialConcurrences1920 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_CONCURRENCE_KYWD_in_flattenTrivialConcurrences1923 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ACTION_in_flattenTrivialConcurrences1926 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_ACTION_in_namedAction2119 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_NCNAME_in_namedAction2121 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x0FFFFFFFFFFFFFFFL});
	public static final BitSet FOLLOW_ACTION_in_unnamedAction2142 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_conditionKywd_in_condition2163 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_leftAssociativeReduction_in_synpred2_PlexilTreeTransforms168 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rightAssociativeReduction_in_synpred3_PlexilTreeTransforms178 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identityElision_in_synpred4_PlexilTreeTransforms188 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_trivialReduction_in_synpred6_PlexilTreeTransforms208 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PLUS_in_synpred55_PlexilTreeTransforms1168 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INT_in_synpred55_PlexilTreeTransforms1179 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF8L,0xFFFFFFFFFFFFFFFFL,0x0FFFFFFFFFFFFFFFL});
	public static final BitSet FOLLOW_PLUS_in_synpred58_PlexilTreeTransforms1210 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_DOUBLE_in_synpred58_PlexilTreeTransforms1221 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF8L,0xFFFFFFFFFFFFFFFFL,0x0FFFFFFFFFFFFFFFL});
	public static final BitSet FOLLOW_MINUS_in_synpred61_PlexilTreeTransforms1252 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INT_in_synpred61_PlexilTreeTransforms1263 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF8L,0xFFFFFFFFFFFFFFFFL,0x0FFFFFFFFFFFFFFFL});
	public static final BitSet FOLLOW_MINUS_in_synpred64_PlexilTreeTransforms1294 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_DOUBLE_in_synpred64_PlexilTreeTransforms1305 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF8L,0xFFFFFFFFFFFFFFFFL,0x0FFFFFFFFFFFFFFFL});
	public static final BitSet FOLLOW_ASTERISK_in_synpred67_PlexilTreeTransforms1336 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INT_in_synpred67_PlexilTreeTransforms1347 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF8L,0xFFFFFFFFFFFFFFFFL,0x0FFFFFFFFFFFFFFFL});
	public static final BitSet FOLLOW_ASTERISK_in_synpred70_PlexilTreeTransforms1378 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_DOUBLE_in_synpred70_PlexilTreeTransforms1389 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF8L,0xFFFFFFFFFFFFFFFFL,0x0FFFFFFFFFFFFFFFL});
	public static final BitSet FOLLOW_SLASH_in_synpred73_PlexilTreeTransforms1420 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_INT_in_synpred73_PlexilTreeTransforms1431 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF8L,0xFFFFFFFFFFFFFFFFL,0x0FFFFFFFFFFFFFFFL});
	public static final BitSet FOLLOW_DEQUALS_in_synpred76_PlexilTreeTransforms1514 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TRUE_KYWD_in_synpred76_PlexilTreeTransforms1520 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DEQUALS_in_synpred77_PlexilTreeTransforms1537 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TRUE_KYWD_in_synpred77_PlexilTreeTransforms1539 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x0FFFFFFFFFFFFFFFL});
	public static final BitSet FOLLOW_DEQUALS_in_synpred78_PlexilTreeTransforms1560 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_FALSE_KYWD_in_synpred78_PlexilTreeTransforms1566 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_DEQUALS_in_synpred79_PlexilTreeTransforms1587 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_FALSE_KYWD_in_synpred79_PlexilTreeTransforms1589 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x0FFFFFFFFFFFFFFFL});
	public static final BitSet FOLLOW_NEQUALS_in_synpred80_PlexilTreeTransforms1614 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_FALSE_KYWD_in_synpred80_PlexilTreeTransforms1620 = new BitSet(new long[]{0x0000000000000008L});
	public static final BitSet FOLLOW_NEQUALS_in_synpred81_PlexilTreeTransforms1637 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_FALSE_KYWD_in_synpred81_PlexilTreeTransforms1639 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0xFFFFFFFFFFFFFFFFL,0x0FFFFFFFFFFFFFFFL});
	public static final BitSet FOLLOW_NEQUALS_in_synpred82_PlexilTreeTransforms1660 = new BitSet(new long[]{0x0000000000000004L});
	public static final BitSet FOLLOW_TRUE_KYWD_in_synpred82_PlexilTreeTransforms1666 = new BitSet(new long[]{0x0000000000000008L});
}
