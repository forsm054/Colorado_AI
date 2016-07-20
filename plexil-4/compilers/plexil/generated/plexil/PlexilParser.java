// $ANTLR 3.5.2 antlr/Plexil.g 2016-05-09 09:53:04

package plexil;

import plexil.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class PlexilParser extends Parser {
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public PlexilParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public PlexilParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return PlexilParser.tokenNames; }
	@Override public String getGrammarFileName() { return "antlr/Plexil.g"; }


	    GlobalContext m_globalContext = new GlobalContext();
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



	public static class plexilPlan_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "plexilPlan"
	// antlr/Plexil.g:305:1: plexilPlan : ( declarations )? action EOF -> ^( PLEXIL ( declarations )? action ) ;
	public final PlexilParser.plexilPlan_return plexilPlan() throws RecognitionException {
		PlexilParser.plexilPlan_return retval = new PlexilParser.plexilPlan_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token EOF3=null;
		ParserRuleReturnScope declarations1 =null;
		ParserRuleReturnScope action2 =null;

		PlexilTreeNode EOF3_tree=null;
		RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
		RewriteRuleSubtreeStream stream_action=new RewriteRuleSubtreeStream(adaptor,"rule action");
		RewriteRuleSubtreeStream stream_declarations=new RewriteRuleSubtreeStream(adaptor,"rule declarations");

		 m_paraphrases.push("in plan"); 
		try {
			// antlr/Plexil.g:308:2: ( ( declarations )? action EOF -> ^( PLEXIL ( declarations )? action ) )
			// antlr/Plexil.g:309:5: ( declarations )? action EOF
			{
			// antlr/Plexil.g:309:5: ( declarations )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==BOOLEAN_KYWD||LA1_0==COMMAND_KYWD||LA1_0==DATE_KYWD||LA1_0==DURATION_KYWD||LA1_0==INTEGER_KYWD||LA1_0==LIBRARY_ACTION_KYWD||LA1_0==REAL_KYWD||LA1_0==STRING_KYWD) ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// antlr/Plexil.g:309:5: declarations
					{
					pushFollow(FOLLOW_declarations_in_plexilPlan1241);
					declarations1=declarations();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_declarations.add(declarations1.getTree());
					}
					break;

			}

			pushFollow(FOLLOW_action_in_plexilPlan1244);
			action2=action();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_action.add(action2.getTree());
			EOF3=(Token)match(input,EOF,FOLLOW_EOF_in_plexilPlan1246); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_EOF.add(EOF3);

			// AST REWRITE
			// elements: action, declarations
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (PlexilTreeNode)adaptor.nil();
			// 310:5: -> ^( PLEXIL ( declarations )? action )
			{
				// antlr/Plexil.g:310:8: ^( PLEXIL ( declarations )? action )
				{
				PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
				root_1 = (PlexilTreeNode)adaptor.becomeRoot(new PlexilPlanNode(PLEXIL), root_1);
				// antlr/Plexil.g:310:33: ( declarations )?
				if ( stream_declarations.hasNext() ) {
					adaptor.addChild(root_1, stream_declarations.nextTree());
				}
				stream_declarations.reset();

				adaptor.addChild(root_1, stream_action.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { m_paraphrases.pop(); }
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "plexilPlan"


	public static class declarations_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "declarations"
	// antlr/Plexil.g:314:1: declarations : ( declaration )+ -> ^( GLOBAL_DECLARATIONS ( declaration )+ ) ;
	public final PlexilParser.declarations_return declarations() throws RecognitionException {
		PlexilParser.declarations_return retval = new PlexilParser.declarations_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		ParserRuleReturnScope declaration4 =null;

		RewriteRuleSubtreeStream stream_declaration=new RewriteRuleSubtreeStream(adaptor,"rule declaration");

		try {
			// antlr/Plexil.g:314:14: ( ( declaration )+ -> ^( GLOBAL_DECLARATIONS ( declaration )+ ) )
			// antlr/Plexil.g:315:5: ( declaration )+
			{
			// antlr/Plexil.g:315:5: ( declaration )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==BOOLEAN_KYWD||LA2_0==COMMAND_KYWD||LA2_0==DATE_KYWD||LA2_0==DURATION_KYWD||LA2_0==INTEGER_KYWD||LA2_0==LIBRARY_ACTION_KYWD||LA2_0==REAL_KYWD||LA2_0==STRING_KYWD) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// antlr/Plexil.g:315:5: declaration
					{
					pushFollow(FOLLOW_declaration_in_declarations1280);
					declaration4=declaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_declaration.add(declaration4.getTree());
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

			// AST REWRITE
			// elements: declaration
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (PlexilTreeNode)adaptor.nil();
			// 316:5: -> ^( GLOBAL_DECLARATIONS ( declaration )+ )
			{
				// antlr/Plexil.g:316:8: ^( GLOBAL_DECLARATIONS ( declaration )+ )
				{
				PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
				root_1 = (PlexilTreeNode)adaptor.becomeRoot(new GlobalDeclarationsNode(GLOBAL_DECLARATIONS), root_1);
				if ( !(stream_declaration.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_declaration.hasNext() ) {
					adaptor.addChild(root_1, stream_declaration.nextTree());
				}
				stream_declaration.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "declarations"


	public static class declaration_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "declaration"
	// antlr/Plexil.g:318:1: declaration options {k=5; } : ( commandDeclaration | lookupDeclaration | libraryActionDeclaration );
	public final PlexilParser.declaration_return declaration() throws RecognitionException {
		PlexilParser.declaration_return retval = new PlexilParser.declaration_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		ParserRuleReturnScope commandDeclaration5 =null;
		ParserRuleReturnScope lookupDeclaration6 =null;
		ParserRuleReturnScope libraryActionDeclaration7 =null;


		try {
			// antlr/Plexil.g:320:2: ( commandDeclaration | lookupDeclaration | libraryActionDeclaration )
			int alt3=3;
			switch ( input.LA(1) ) {
			case COMMAND_KYWD:
				{
				alt3=1;
				}
				break;
			case BOOLEAN_KYWD:
			case DATE_KYWD:
			case DURATION_KYWD:
			case INTEGER_KYWD:
			case REAL_KYWD:
			case STRING_KYWD:
				{
				switch ( input.LA(2) ) {
				case LBRACKET:
					{
					int LA3_4 = input.LA(3);
					if ( (LA3_4==INT) ) {
						int LA3_7 = input.LA(4);
						if ( (LA3_7==RBRACKET) ) {
							int LA3_8 = input.LA(5);
							if ( (LA3_8==COMMAND_KYWD) ) {
								alt3=1;
							}
							else if ( (LA3_8==LOOKUP_KYWD) ) {
								alt3=2;
							}

							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 3, 8, input);
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
									new NoViableAltException("", 3, 7, input);
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
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 3, 4, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case COMMAND_KYWD:
					{
					alt3=1;
					}
					break;
				case LOOKUP_KYWD:
					{
					alt3=2;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 3, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case LIBRARY_ACTION_KYWD:
				{
				alt3=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// antlr/Plexil.g:321:5: commandDeclaration
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_commandDeclaration_in_declaration1321);
					commandDeclaration5=commandDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, commandDeclaration5.getTree());

					}
					break;
				case 2 :
					// antlr/Plexil.g:322:5: lookupDeclaration
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_lookupDeclaration_in_declaration1327);
					lookupDeclaration6=lookupDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, lookupDeclaration6.getTree());

					}
					break;
				case 3 :
					// antlr/Plexil.g:323:5: libraryActionDeclaration
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_libraryActionDeclaration_in_declaration1333);
					libraryActionDeclaration7=libraryActionDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, libraryActionDeclaration7.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "declaration"


	public static class commandDeclaration_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "commandDeclaration"
	// antlr/Plexil.g:330:1: commandDeclaration : ( ( COMMAND_KYWD NCNAME ( paramsSpec )? SEMICOLON -> ^( COMMAND_KYWD NCNAME ( paramsSpec )? ) ) | ( returnType COMMAND_KYWD NCNAME ( paramsSpec )? SEMICOLON -> ^( COMMAND_KYWD NCNAME ( paramsSpec )? returnType ) ) ) ;
	public final PlexilParser.commandDeclaration_return commandDeclaration() throws RecognitionException {
		PlexilParser.commandDeclaration_return retval = new PlexilParser.commandDeclaration_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token COMMAND_KYWD8=null;
		Token NCNAME9=null;
		Token SEMICOLON11=null;
		Token COMMAND_KYWD13=null;
		Token NCNAME14=null;
		Token SEMICOLON16=null;
		ParserRuleReturnScope paramsSpec10 =null;
		ParserRuleReturnScope returnType12 =null;
		ParserRuleReturnScope paramsSpec15 =null;

		PlexilTreeNode COMMAND_KYWD8_tree=null;
		PlexilTreeNode NCNAME9_tree=null;
		PlexilTreeNode SEMICOLON11_tree=null;
		PlexilTreeNode COMMAND_KYWD13_tree=null;
		PlexilTreeNode NCNAME14_tree=null;
		PlexilTreeNode SEMICOLON16_tree=null;
		RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
		RewriteRuleTokenStream stream_COMMAND_KYWD=new RewriteRuleTokenStream(adaptor,"token COMMAND_KYWD");
		RewriteRuleTokenStream stream_NCNAME=new RewriteRuleTokenStream(adaptor,"token NCNAME");
		RewriteRuleSubtreeStream stream_returnType=new RewriteRuleSubtreeStream(adaptor,"rule returnType");
		RewriteRuleSubtreeStream stream_paramsSpec=new RewriteRuleSubtreeStream(adaptor,"rule paramsSpec");

		 m_paraphrases.push("in command declaration"); 
		try {
			// antlr/Plexil.g:333:2: ( ( ( COMMAND_KYWD NCNAME ( paramsSpec )? SEMICOLON -> ^( COMMAND_KYWD NCNAME ( paramsSpec )? ) ) | ( returnType COMMAND_KYWD NCNAME ( paramsSpec )? SEMICOLON -> ^( COMMAND_KYWD NCNAME ( paramsSpec )? returnType ) ) ) )
			// antlr/Plexil.g:334:5: ( ( COMMAND_KYWD NCNAME ( paramsSpec )? SEMICOLON -> ^( COMMAND_KYWD NCNAME ( paramsSpec )? ) ) | ( returnType COMMAND_KYWD NCNAME ( paramsSpec )? SEMICOLON -> ^( COMMAND_KYWD NCNAME ( paramsSpec )? returnType ) ) )
			{
			// antlr/Plexil.g:334:5: ( ( COMMAND_KYWD NCNAME ( paramsSpec )? SEMICOLON -> ^( COMMAND_KYWD NCNAME ( paramsSpec )? ) ) | ( returnType COMMAND_KYWD NCNAME ( paramsSpec )? SEMICOLON -> ^( COMMAND_KYWD NCNAME ( paramsSpec )? returnType ) ) )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==COMMAND_KYWD) ) {
				alt6=1;
			}
			else if ( (LA6_0==BOOLEAN_KYWD||LA6_0==DATE_KYWD||LA6_0==DURATION_KYWD||LA6_0==INTEGER_KYWD||LA6_0==REAL_KYWD||LA6_0==STRING_KYWD) ) {
				alt6=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// antlr/Plexil.g:336:7: ( COMMAND_KYWD NCNAME ( paramsSpec )? SEMICOLON -> ^( COMMAND_KYWD NCNAME ( paramsSpec )? ) )
					{
					// antlr/Plexil.g:336:7: ( COMMAND_KYWD NCNAME ( paramsSpec )? SEMICOLON -> ^( COMMAND_KYWD NCNAME ( paramsSpec )? ) )
					// antlr/Plexil.g:336:9: COMMAND_KYWD NCNAME ( paramsSpec )? SEMICOLON
					{
					COMMAND_KYWD8=(Token)match(input,COMMAND_KYWD,FOLLOW_COMMAND_KYWD_in_commandDeclaration1380); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMAND_KYWD.add(COMMAND_KYWD8);

					NCNAME9=(Token)match(input,NCNAME,FOLLOW_NCNAME_in_commandDeclaration1382); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NCNAME.add(NCNAME9);

					// antlr/Plexil.g:336:29: ( paramsSpec )?
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0==LPAREN) ) {
						alt4=1;
					}
					switch (alt4) {
						case 1 :
							// antlr/Plexil.g:336:29: paramsSpec
							{
							pushFollow(FOLLOW_paramsSpec_in_commandDeclaration1384);
							paramsSpec10=paramsSpec();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_paramsSpec.add(paramsSpec10.getTree());
							}
							break;

					}

					SEMICOLON11=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_commandDeclaration1387); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SEMICOLON.add(SEMICOLON11);

					// AST REWRITE
					// elements: NCNAME, COMMAND_KYWD, paramsSpec
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 337:9: -> ^( COMMAND_KYWD NCNAME ( paramsSpec )? )
					{
						// antlr/Plexil.g:337:12: ^( COMMAND_KYWD NCNAME ( paramsSpec )? )
						{
						PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
						root_1 = (PlexilTreeNode)adaptor.becomeRoot(new CommandDeclarationNode(stream_COMMAND_KYWD.nextToken()), root_1);
						adaptor.addChild(root_1, stream_NCNAME.nextNode());
						// antlr/Plexil.g:337:58: ( paramsSpec )?
						if ( stream_paramsSpec.hasNext() ) {
							adaptor.addChild(root_1, stream_paramsSpec.nextTree());
						}
						stream_paramsSpec.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}

					}
					break;
				case 2 :
					// antlr/Plexil.g:341:7: ( returnType COMMAND_KYWD NCNAME ( paramsSpec )? SEMICOLON -> ^( COMMAND_KYWD NCNAME ( paramsSpec )? returnType ) )
					{
					// antlr/Plexil.g:341:7: ( returnType COMMAND_KYWD NCNAME ( paramsSpec )? SEMICOLON -> ^( COMMAND_KYWD NCNAME ( paramsSpec )? returnType ) )
					// antlr/Plexil.g:341:9: returnType COMMAND_KYWD NCNAME ( paramsSpec )? SEMICOLON
					{
					pushFollow(FOLLOW_returnType_in_commandDeclaration1437);
					returnType12=returnType();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_returnType.add(returnType12.getTree());
					COMMAND_KYWD13=(Token)match(input,COMMAND_KYWD,FOLLOW_COMMAND_KYWD_in_commandDeclaration1439); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMAND_KYWD.add(COMMAND_KYWD13);

					NCNAME14=(Token)match(input,NCNAME,FOLLOW_NCNAME_in_commandDeclaration1441); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NCNAME.add(NCNAME14);

					// antlr/Plexil.g:341:40: ( paramsSpec )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0==LPAREN) ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// antlr/Plexil.g:341:40: paramsSpec
							{
							pushFollow(FOLLOW_paramsSpec_in_commandDeclaration1443);
							paramsSpec15=paramsSpec();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_paramsSpec.add(paramsSpec15.getTree());
							}
							break;

					}

					SEMICOLON16=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_commandDeclaration1446); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_SEMICOLON.add(SEMICOLON16);

					// AST REWRITE
					// elements: NCNAME, returnType, COMMAND_KYWD, paramsSpec
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 342:10: -> ^( COMMAND_KYWD NCNAME ( paramsSpec )? returnType )
					{
						// antlr/Plexil.g:342:13: ^( COMMAND_KYWD NCNAME ( paramsSpec )? returnType )
						{
						PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
						root_1 = (PlexilTreeNode)adaptor.becomeRoot(new CommandDeclarationNode(stream_COMMAND_KYWD.nextToken()), root_1);
						adaptor.addChild(root_1, stream_NCNAME.nextNode());
						// antlr/Plexil.g:342:59: ( paramsSpec )?
						if ( stream_paramsSpec.hasNext() ) {
							adaptor.addChild(root_1, stream_paramsSpec.nextTree());
						}
						stream_paramsSpec.reset();

						adaptor.addChild(root_1, stream_returnType.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { m_paraphrases.pop(); }
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "commandDeclaration"


	public static class lookupDeclaration_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "lookupDeclaration"
	// antlr/Plexil.g:349:1: lookupDeclaration : returnType LOOKUP_KYWD NCNAME ( paramsSpec )? SEMICOLON -> ^( LOOKUP_KYWD NCNAME returnType ( paramsSpec )? ) ;
	public final PlexilParser.lookupDeclaration_return lookupDeclaration() throws RecognitionException {
		PlexilParser.lookupDeclaration_return retval = new PlexilParser.lookupDeclaration_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token LOOKUP_KYWD18=null;
		Token NCNAME19=null;
		Token SEMICOLON21=null;
		ParserRuleReturnScope returnType17 =null;
		ParserRuleReturnScope paramsSpec20 =null;

		PlexilTreeNode LOOKUP_KYWD18_tree=null;
		PlexilTreeNode NCNAME19_tree=null;
		PlexilTreeNode SEMICOLON21_tree=null;
		RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
		RewriteRuleTokenStream stream_LOOKUP_KYWD=new RewriteRuleTokenStream(adaptor,"token LOOKUP_KYWD");
		RewriteRuleTokenStream stream_NCNAME=new RewriteRuleTokenStream(adaptor,"token NCNAME");
		RewriteRuleSubtreeStream stream_returnType=new RewriteRuleSubtreeStream(adaptor,"rule returnType");
		RewriteRuleSubtreeStream stream_paramsSpec=new RewriteRuleSubtreeStream(adaptor,"rule paramsSpec");

		 m_paraphrases.push("in lookup declaration"); 
		try {
			// antlr/Plexil.g:352:2: ( returnType LOOKUP_KYWD NCNAME ( paramsSpec )? SEMICOLON -> ^( LOOKUP_KYWD NCNAME returnType ( paramsSpec )? ) )
			// antlr/Plexil.g:354:5: returnType LOOKUP_KYWD NCNAME ( paramsSpec )? SEMICOLON
			{
			pushFollow(FOLLOW_returnType_in_lookupDeclaration1519);
			returnType17=returnType();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_returnType.add(returnType17.getTree());
			LOOKUP_KYWD18=(Token)match(input,LOOKUP_KYWD,FOLLOW_LOOKUP_KYWD_in_lookupDeclaration1521); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LOOKUP_KYWD.add(LOOKUP_KYWD18);

			NCNAME19=(Token)match(input,NCNAME,FOLLOW_NCNAME_in_lookupDeclaration1523); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_NCNAME.add(NCNAME19);

			// antlr/Plexil.g:354:35: ( paramsSpec )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==LPAREN) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// antlr/Plexil.g:354:35: paramsSpec
					{
					pushFollow(FOLLOW_paramsSpec_in_lookupDeclaration1525);
					paramsSpec20=paramsSpec();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_paramsSpec.add(paramsSpec20.getTree());
					}
					break;

			}

			SEMICOLON21=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_lookupDeclaration1528); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_SEMICOLON.add(SEMICOLON21);

			// AST REWRITE
			// elements: returnType, LOOKUP_KYWD, paramsSpec, NCNAME
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (PlexilTreeNode)adaptor.nil();
			// 355:5: -> ^( LOOKUP_KYWD NCNAME returnType ( paramsSpec )? )
			{
				// antlr/Plexil.g:355:8: ^( LOOKUP_KYWD NCNAME returnType ( paramsSpec )? )
				{
				PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
				root_1 = (PlexilTreeNode)adaptor.becomeRoot(new LookupDeclarationNode(stream_LOOKUP_KYWD.nextToken()), root_1);
				adaptor.addChild(root_1, stream_NCNAME.nextNode());
				adaptor.addChild(root_1, stream_returnType.nextTree());
				// antlr/Plexil.g:355:63: ( paramsSpec )?
				if ( stream_paramsSpec.hasNext() ) {
					adaptor.addChild(root_1, stream_paramsSpec.nextTree());
				}
				stream_paramsSpec.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { m_paraphrases.pop(); }
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "lookupDeclaration"


	public static class paramsSpec_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "paramsSpec"
	// antlr/Plexil.g:358:1: paramsSpec : LPAREN ( paramsSpecGuts )? RPAREN -> ^( PARAMETERS ( paramsSpecGuts )? ) ;
	public final PlexilParser.paramsSpec_return paramsSpec() throws RecognitionException {
		PlexilParser.paramsSpec_return retval = new PlexilParser.paramsSpec_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token LPAREN22=null;
		Token RPAREN24=null;
		ParserRuleReturnScope paramsSpecGuts23 =null;

		PlexilTreeNode LPAREN22_tree=null;
		PlexilTreeNode RPAREN24_tree=null;
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleSubtreeStream stream_paramsSpecGuts=new RewriteRuleSubtreeStream(adaptor,"rule paramsSpecGuts");

		try {
			// antlr/Plexil.g:358:12: ( LPAREN ( paramsSpecGuts )? RPAREN -> ^( PARAMETERS ( paramsSpecGuts )? ) )
			// antlr/Plexil.g:359:5: LPAREN ( paramsSpecGuts )? RPAREN
			{
			LPAREN22=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_paramsSpec1563); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN22);

			// antlr/Plexil.g:359:12: ( paramsSpecGuts )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==ANY_KYWD||LA8_0==BOOLEAN_KYWD||LA8_0==DATE_KYWD||LA8_0==DURATION_KYWD||LA8_0==ELLIPSIS||LA8_0==INTEGER_KYWD||LA8_0==REAL_KYWD||LA8_0==STRING_KYWD) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// antlr/Plexil.g:359:12: paramsSpecGuts
					{
					pushFollow(FOLLOW_paramsSpecGuts_in_paramsSpec1565);
					paramsSpecGuts23=paramsSpecGuts();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_paramsSpecGuts.add(paramsSpecGuts23.getTree());
					}
					break;

			}

			RPAREN24=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_paramsSpec1568); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN24);

			// AST REWRITE
			// elements: paramsSpecGuts
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (PlexilTreeNode)adaptor.nil();
			// 360:3: -> ^( PARAMETERS ( paramsSpecGuts )? )
			{
				// antlr/Plexil.g:360:6: ^( PARAMETERS ( paramsSpecGuts )? )
				{
				PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
				root_1 = (PlexilTreeNode)adaptor.becomeRoot((PlexilTreeNode)adaptor.create(PARAMETERS, "PARAMETERS"), root_1);
				// antlr/Plexil.g:360:19: ( paramsSpecGuts )?
				if ( stream_paramsSpecGuts.hasNext() ) {
					adaptor.addChild(root_1, stream_paramsSpecGuts.nextTree());
				}
				stream_paramsSpecGuts.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "paramsSpec"


	public static class paramsSpecGuts_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "paramsSpecGuts"
	// antlr/Plexil.g:363:1: paramsSpecGuts : ( ( paramSpec ( COMMA ! paramSpec )* ) | ELLIPSIS );
	public final PlexilParser.paramsSpecGuts_return paramsSpecGuts() throws RecognitionException {
		PlexilParser.paramsSpecGuts_return retval = new PlexilParser.paramsSpecGuts_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token COMMA26=null;
		Token ELLIPSIS28=null;
		ParserRuleReturnScope paramSpec25 =null;
		ParserRuleReturnScope paramSpec27 =null;

		PlexilTreeNode COMMA26_tree=null;
		PlexilTreeNode ELLIPSIS28_tree=null;

		try {
			// antlr/Plexil.g:363:16: ( ( paramSpec ( COMMA ! paramSpec )* ) | ELLIPSIS )
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==ANY_KYWD||LA10_0==BOOLEAN_KYWD||LA10_0==DATE_KYWD||LA10_0==DURATION_KYWD||LA10_0==INTEGER_KYWD||LA10_0==REAL_KYWD||LA10_0==STRING_KYWD) ) {
				alt10=1;
			}
			else if ( (LA10_0==ELLIPSIS) ) {
				alt10=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// antlr/Plexil.g:364:7: ( paramSpec ( COMMA ! paramSpec )* )
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					// antlr/Plexil.g:364:7: ( paramSpec ( COMMA ! paramSpec )* )
					// antlr/Plexil.g:364:9: paramSpec ( COMMA ! paramSpec )*
					{
					pushFollow(FOLLOW_paramSpec_in_paramsSpecGuts1597);
					paramSpec25=paramSpec();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, paramSpec25.getTree());

					// antlr/Plexil.g:364:19: ( COMMA ! paramSpec )*
					loop9:
					while (true) {
						int alt9=2;
						int LA9_0 = input.LA(1);
						if ( (LA9_0==COMMA) ) {
							alt9=1;
						}

						switch (alt9) {
						case 1 :
							// antlr/Plexil.g:364:21: COMMA ! paramSpec
							{
							COMMA26=(Token)match(input,COMMA,FOLLOW_COMMA_in_paramsSpecGuts1601); if (state.failed) return retval;
							pushFollow(FOLLOW_paramSpec_in_paramsSpecGuts1604);
							paramSpec27=paramSpec();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, paramSpec27.getTree());

							}
							break;

						default :
							break loop9;
						}
					}

					}

					}
					break;
				case 2 :
					// antlr/Plexil.g:365:9: ELLIPSIS
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					ELLIPSIS28=(Token)match(input,ELLIPSIS,FOLLOW_ELLIPSIS_in_paramsSpecGuts1619); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					ELLIPSIS28_tree = (PlexilTreeNode)adaptor.create(ELLIPSIS28);
					adaptor.addChild(root_0, ELLIPSIS28_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "paramsSpecGuts"


	public static class paramSpec_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "paramSpec"
	// antlr/Plexil.g:368:1: paramSpec options {k=2; } : ( ( baseTypeName LBRACKET )=> baseTypeName LBRACKET INT RBRACKET -> ^( ARRAY_TYPE baseTypeName INT ) | ( baseTypeName NCNAME LBRACKET )=> baseTypeName NCNAME LBRACKET INT RBRACKET -> ^( ARRAY_TYPE baseTypeName INT NCNAME ) | paramTypeName ^ ( NCNAME )? );
	public final PlexilParser.paramSpec_return paramSpec() throws RecognitionException {
		PlexilParser.paramSpec_return retval = new PlexilParser.paramSpec_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token LBRACKET30=null;
		Token INT31=null;
		Token RBRACKET32=null;
		Token NCNAME34=null;
		Token LBRACKET35=null;
		Token INT36=null;
		Token RBRACKET37=null;
		Token NCNAME39=null;
		ParserRuleReturnScope baseTypeName29 =null;
		ParserRuleReturnScope baseTypeName33 =null;
		ParserRuleReturnScope paramTypeName38 =null;

		PlexilTreeNode LBRACKET30_tree=null;
		PlexilTreeNode INT31_tree=null;
		PlexilTreeNode RBRACKET32_tree=null;
		PlexilTreeNode NCNAME34_tree=null;
		PlexilTreeNode LBRACKET35_tree=null;
		PlexilTreeNode INT36_tree=null;
		PlexilTreeNode RBRACKET37_tree=null;
		PlexilTreeNode NCNAME39_tree=null;
		RewriteRuleTokenStream stream_LBRACKET=new RewriteRuleTokenStream(adaptor,"token LBRACKET");
		RewriteRuleTokenStream stream_RBRACKET=new RewriteRuleTokenStream(adaptor,"token RBRACKET");
		RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
		RewriteRuleTokenStream stream_NCNAME=new RewriteRuleTokenStream(adaptor,"token NCNAME");
		RewriteRuleSubtreeStream stream_baseTypeName=new RewriteRuleSubtreeStream(adaptor,"rule baseTypeName");

		try {
			// antlr/Plexil.g:370:2: ( ( baseTypeName LBRACKET )=> baseTypeName LBRACKET INT RBRACKET -> ^( ARRAY_TYPE baseTypeName INT ) | ( baseTypeName NCNAME LBRACKET )=> baseTypeName NCNAME LBRACKET INT RBRACKET -> ^( ARRAY_TYPE baseTypeName INT NCNAME ) | paramTypeName ^ ( NCNAME )? )
			int alt12=3;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==BOOLEAN_KYWD||LA12_0==DATE_KYWD||LA12_0==DURATION_KYWD||LA12_0==INTEGER_KYWD||LA12_0==REAL_KYWD||LA12_0==STRING_KYWD) ) {
				int LA12_1 = input.LA(2);
				if ( (LA12_1==LBRACKET) && (synpred1_Plexil())) {
					alt12=1;
				}
				else if ( (LA12_1==NCNAME) ) {
					int LA12_4 = input.LA(3);
					if ( (synpred2_Plexil()) ) {
						alt12=2;
					}
					else if ( (true) ) {
						alt12=3;
					}

				}
				else if ( (LA12_1==COMMA||LA12_1==RPAREN) ) {
					alt12=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 12, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA12_0==ANY_KYWD) ) {
				alt12=3;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}

			switch (alt12) {
				case 1 :
					// antlr/Plexil.g:371:5: ( baseTypeName LBRACKET )=> baseTypeName LBRACKET INT RBRACKET
					{
					pushFollow(FOLLOW_baseTypeName_in_paramSpec1660);
					baseTypeName29=baseTypeName();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_baseTypeName.add(baseTypeName29.getTree());
					LBRACKET30=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_paramSpec1662); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LBRACKET.add(LBRACKET30);

					INT31=(Token)match(input,INT,FOLLOW_INT_in_paramSpec1664); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_INT.add(INT31);

					RBRACKET32=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_paramSpec1666); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RBRACKET.add(RBRACKET32);

					// AST REWRITE
					// elements: baseTypeName, INT
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 372:42: -> ^( ARRAY_TYPE baseTypeName INT )
					{
						// antlr/Plexil.g:372:45: ^( ARRAY_TYPE baseTypeName INT )
						{
						PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
						root_1 = (PlexilTreeNode)adaptor.becomeRoot((PlexilTreeNode)adaptor.create(ARRAY_TYPE, "ARRAY_TYPE"), root_1);
						adaptor.addChild(root_1, stream_baseTypeName.nextTree());
						adaptor.addChild(root_1, stream_INT.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// antlr/Plexil.g:373:5: ( baseTypeName NCNAME LBRACKET )=> baseTypeName NCNAME LBRACKET INT RBRACKET
					{
					pushFollow(FOLLOW_baseTypeName_in_paramSpec1698);
					baseTypeName33=baseTypeName();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_baseTypeName.add(baseTypeName33.getTree());
					NCNAME34=(Token)match(input,NCNAME,FOLLOW_NCNAME_in_paramSpec1700); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NCNAME.add(NCNAME34);

					LBRACKET35=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_paramSpec1702); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LBRACKET.add(LBRACKET35);

					INT36=(Token)match(input,INT,FOLLOW_INT_in_paramSpec1704); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_INT.add(INT36);

					RBRACKET37=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_paramSpec1706); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RBRACKET.add(RBRACKET37);

					// AST REWRITE
					// elements: INT, baseTypeName, NCNAME
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 374:49: -> ^( ARRAY_TYPE baseTypeName INT NCNAME )
					{
						// antlr/Plexil.g:374:52: ^( ARRAY_TYPE baseTypeName INT NCNAME )
						{
						PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
						root_1 = (PlexilTreeNode)adaptor.becomeRoot((PlexilTreeNode)adaptor.create(ARRAY_TYPE, "ARRAY_TYPE"), root_1);
						adaptor.addChild(root_1, stream_baseTypeName.nextTree());
						adaptor.addChild(root_1, stream_INT.nextNode());
						adaptor.addChild(root_1, stream_NCNAME.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// antlr/Plexil.g:375:5: paramTypeName ^ ( NCNAME )?
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_paramTypeName_in_paramSpec1724);
					paramTypeName38=paramTypeName();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (PlexilTreeNode)adaptor.becomeRoot(paramTypeName38.getTree(), root_0);
					// antlr/Plexil.g:375:20: ( NCNAME )?
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( (LA11_0==NCNAME) ) {
						alt11=1;
					}
					switch (alt11) {
						case 1 :
							// antlr/Plexil.g:375:20: NCNAME
							{
							NCNAME39=(Token)match(input,NCNAME,FOLLOW_NCNAME_in_paramSpec1727); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							NCNAME39_tree = (PlexilTreeNode)adaptor.create(NCNAME39);
							adaptor.addChild(root_0, NCNAME39_tree);
							}

							}
							break;

					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "paramSpec"


	public static class paramTypeName_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "paramTypeName"
	// antlr/Plexil.g:378:1: paramTypeName : ( ANY_KYWD | BOOLEAN_KYWD | INTEGER_KYWD | REAL_KYWD | STRING_KYWD | DATE_KYWD | DURATION_KYWD );
	public final PlexilParser.paramTypeName_return paramTypeName() throws RecognitionException {
		PlexilParser.paramTypeName_return retval = new PlexilParser.paramTypeName_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token set40=null;

		PlexilTreeNode set40_tree=null;

		try {
			// antlr/Plexil.g:379:5: ( ANY_KYWD | BOOLEAN_KYWD | INTEGER_KYWD | REAL_KYWD | STRING_KYWD | DATE_KYWD | DURATION_KYWD )
			// antlr/Plexil.g:
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			set40=input.LT(1);
			if ( input.LA(1)==ANY_KYWD||input.LA(1)==BOOLEAN_KYWD||input.LA(1)==DATE_KYWD||input.LA(1)==DURATION_KYWD||input.LA(1)==INTEGER_KYWD||input.LA(1)==REAL_KYWD||input.LA(1)==STRING_KYWD ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (PlexilTreeNode)adaptor.create(set40));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "paramTypeName"


	public static class returnType_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "returnType"
	// antlr/Plexil.g:388:1: returnType : returnTypeSpec -> ^( RETURNS_KYWD returnTypeSpec ) ;
	public final PlexilParser.returnType_return returnType() throws RecognitionException {
		PlexilParser.returnType_return retval = new PlexilParser.returnType_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		ParserRuleReturnScope returnTypeSpec41 =null;

		RewriteRuleSubtreeStream stream_returnTypeSpec=new RewriteRuleSubtreeStream(adaptor,"rule returnTypeSpec");

		try {
			// antlr/Plexil.g:388:12: ( returnTypeSpec -> ^( RETURNS_KYWD returnTypeSpec ) )
			// antlr/Plexil.g:389:5: returnTypeSpec
			{
			pushFollow(FOLLOW_returnTypeSpec_in_returnType1807);
			returnTypeSpec41=returnTypeSpec();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_returnTypeSpec.add(returnTypeSpec41.getTree());
			// AST REWRITE
			// elements: returnTypeSpec
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (PlexilTreeNode)adaptor.nil();
			// 389:20: -> ^( RETURNS_KYWD returnTypeSpec )
			{
				// antlr/Plexil.g:389:23: ^( RETURNS_KYWD returnTypeSpec )
				{
				PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
				root_1 = (PlexilTreeNode)adaptor.becomeRoot((PlexilTreeNode)adaptor.create(RETURNS_KYWD, "RETURNS_KYWD"), root_1);
				adaptor.addChild(root_1, stream_returnTypeSpec.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "returnType"


	public static class returnTypeSpec_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "returnTypeSpec"
	// antlr/Plexil.g:392:1: returnTypeSpec : ( ( baseTypeName LBRACKET )=> baseTypeName LBRACKET INT RBRACKET -> ^( ARRAY_TYPE baseTypeName INT ) | baseTypeName );
	public final PlexilParser.returnTypeSpec_return returnTypeSpec() throws RecognitionException {
		PlexilParser.returnTypeSpec_return retval = new PlexilParser.returnTypeSpec_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token LBRACKET43=null;
		Token INT44=null;
		Token RBRACKET45=null;
		ParserRuleReturnScope baseTypeName42 =null;
		ParserRuleReturnScope baseTypeName46 =null;

		PlexilTreeNode LBRACKET43_tree=null;
		PlexilTreeNode INT44_tree=null;
		PlexilTreeNode RBRACKET45_tree=null;
		RewriteRuleTokenStream stream_LBRACKET=new RewriteRuleTokenStream(adaptor,"token LBRACKET");
		RewriteRuleTokenStream stream_RBRACKET=new RewriteRuleTokenStream(adaptor,"token RBRACKET");
		RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
		RewriteRuleSubtreeStream stream_baseTypeName=new RewriteRuleSubtreeStream(adaptor,"rule baseTypeName");

		try {
			// antlr/Plexil.g:392:16: ( ( baseTypeName LBRACKET )=> baseTypeName LBRACKET INT RBRACKET -> ^( ARRAY_TYPE baseTypeName INT ) | baseTypeName )
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==BOOLEAN_KYWD||LA13_0==DATE_KYWD||LA13_0==DURATION_KYWD||LA13_0==INTEGER_KYWD||LA13_0==REAL_KYWD||LA13_0==STRING_KYWD) ) {
				int LA13_1 = input.LA(2);
				if ( (LA13_1==LBRACKET) && (synpred3_Plexil())) {
					alt13=1;
				}
				else if ( (LA13_1==COMMAND_KYWD||LA13_1==LOOKUP_KYWD) ) {
					alt13=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 13, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}

			switch (alt13) {
				case 1 :
					// antlr/Plexil.g:393:5: ( baseTypeName LBRACKET )=> baseTypeName LBRACKET INT RBRACKET
					{
					pushFollow(FOLLOW_baseTypeName_in_returnTypeSpec1843);
					baseTypeName42=baseTypeName();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_baseTypeName.add(baseTypeName42.getTree());
					LBRACKET43=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_returnTypeSpec1845); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LBRACKET.add(LBRACKET43);

					INT44=(Token)match(input,INT,FOLLOW_INT_in_returnTypeSpec1847); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_INT.add(INT44);

					RBRACKET45=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_returnTypeSpec1849); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RBRACKET.add(RBRACKET45);

					// AST REWRITE
					// elements: baseTypeName, INT
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 394:42: -> ^( ARRAY_TYPE baseTypeName INT )
					{
						// antlr/Plexil.g:394:45: ^( ARRAY_TYPE baseTypeName INT )
						{
						PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
						root_1 = (PlexilTreeNode)adaptor.becomeRoot((PlexilTreeNode)adaptor.create(ARRAY_TYPE, "ARRAY_TYPE"), root_1);
						adaptor.addChild(root_1, stream_baseTypeName.nextTree());
						adaptor.addChild(root_1, stream_INT.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// antlr/Plexil.g:395:5: baseTypeName
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_baseTypeName_in_returnTypeSpec1865);
					baseTypeName46=baseTypeName();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, baseTypeName46.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "returnTypeSpec"


	public static class baseTypeName_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "baseTypeName"
	// antlr/Plexil.g:398:1: baseTypeName : ( BOOLEAN_KYWD | INTEGER_KYWD | REAL_KYWD | STRING_KYWD | DATE_KYWD | DURATION_KYWD );
	public final PlexilParser.baseTypeName_return baseTypeName() throws RecognitionException {
		PlexilParser.baseTypeName_return retval = new PlexilParser.baseTypeName_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token set47=null;

		PlexilTreeNode set47_tree=null;

		try {
			// antlr/Plexil.g:398:14: ( BOOLEAN_KYWD | INTEGER_KYWD | REAL_KYWD | STRING_KYWD | DATE_KYWD | DURATION_KYWD )
			// antlr/Plexil.g:
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			set47=input.LT(1);
			if ( input.LA(1)==BOOLEAN_KYWD||input.LA(1)==DATE_KYWD||input.LA(1)==DURATION_KYWD||input.LA(1)==INTEGER_KYWD||input.LA(1)==REAL_KYWD||input.LA(1)==STRING_KYWD ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (PlexilTreeNode)adaptor.create(set47));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "baseTypeName"


	public static class libraryActionDeclaration_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "libraryActionDeclaration"
	// antlr/Plexil.g:407:1: libraryActionDeclaration : LIBRARY_ACTION_KYWD ^ NCNAME ( libraryInterfaceSpec )? SEMICOLON !;
	public final PlexilParser.libraryActionDeclaration_return libraryActionDeclaration() throws RecognitionException {
		PlexilParser.libraryActionDeclaration_return retval = new PlexilParser.libraryActionDeclaration_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token LIBRARY_ACTION_KYWD48=null;
		Token NCNAME49=null;
		Token SEMICOLON51=null;
		ParserRuleReturnScope libraryInterfaceSpec50 =null;

		PlexilTreeNode LIBRARY_ACTION_KYWD48_tree=null;
		PlexilTreeNode NCNAME49_tree=null;
		PlexilTreeNode SEMICOLON51_tree=null;

		 m_paraphrases.push("in library action declaration"); 
		try {
			// antlr/Plexil.g:410:2: ( LIBRARY_ACTION_KYWD ^ NCNAME ( libraryInterfaceSpec )? SEMICOLON !)
			// antlr/Plexil.g:411:5: LIBRARY_ACTION_KYWD ^ NCNAME ( libraryInterfaceSpec )? SEMICOLON !
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			LIBRARY_ACTION_KYWD48=(Token)match(input,LIBRARY_ACTION_KYWD,FOLLOW_LIBRARY_ACTION_KYWD_in_libraryActionDeclaration1935); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LIBRARY_ACTION_KYWD48_tree = (PlexilTreeNode)adaptor.create(LIBRARY_ACTION_KYWD48);
			root_0 = (PlexilTreeNode)adaptor.becomeRoot(LIBRARY_ACTION_KYWD48_tree, root_0);
			}

			NCNAME49=(Token)match(input,NCNAME,FOLLOW_NCNAME_in_libraryActionDeclaration1938); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			NCNAME49_tree = (PlexilTreeNode)adaptor.create(NCNAME49);
			adaptor.addChild(root_0, NCNAME49_tree);
			}

			// antlr/Plexil.g:411:33: ( libraryInterfaceSpec )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==LPAREN) ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// antlr/Plexil.g:411:33: libraryInterfaceSpec
					{
					pushFollow(FOLLOW_libraryInterfaceSpec_in_libraryActionDeclaration1940);
					libraryInterfaceSpec50=libraryInterfaceSpec();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, libraryInterfaceSpec50.getTree());

					}
					break;

			}

			SEMICOLON51=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_libraryActionDeclaration1943); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { m_paraphrases.pop(); }
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "libraryActionDeclaration"


	public static class libraryInterfaceSpec_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "libraryInterfaceSpec"
	// antlr/Plexil.g:414:1: libraryInterfaceSpec : LPAREN ( libraryParamSpec ( COMMA libraryParamSpec )* )? RPAREN -> ^( PARAMETERS ( libraryParamSpec )* ) ;
	public final PlexilParser.libraryInterfaceSpec_return libraryInterfaceSpec() throws RecognitionException {
		PlexilParser.libraryInterfaceSpec_return retval = new PlexilParser.libraryInterfaceSpec_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token LPAREN52=null;
		Token COMMA54=null;
		Token RPAREN56=null;
		ParserRuleReturnScope libraryParamSpec53 =null;
		ParserRuleReturnScope libraryParamSpec55 =null;

		PlexilTreeNode LPAREN52_tree=null;
		PlexilTreeNode COMMA54_tree=null;
		PlexilTreeNode RPAREN56_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleSubtreeStream stream_libraryParamSpec=new RewriteRuleSubtreeStream(adaptor,"rule libraryParamSpec");

		 m_paraphrases.push("in library action interface declaration"); 
		try {
			// antlr/Plexil.g:417:2: ( LPAREN ( libraryParamSpec ( COMMA libraryParamSpec )* )? RPAREN -> ^( PARAMETERS ( libraryParamSpec )* ) )
			// antlr/Plexil.g:418:5: LPAREN ( libraryParamSpec ( COMMA libraryParamSpec )* )? RPAREN
			{
			LPAREN52=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_libraryInterfaceSpec1968); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN52);

			// antlr/Plexil.g:418:12: ( libraryParamSpec ( COMMA libraryParamSpec )* )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( ((LA16_0 >= IN_KYWD && LA16_0 <= IN_OUT_KYWD)) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// antlr/Plexil.g:418:14: libraryParamSpec ( COMMA libraryParamSpec )*
					{
					pushFollow(FOLLOW_libraryParamSpec_in_libraryInterfaceSpec1972);
					libraryParamSpec53=libraryParamSpec();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_libraryParamSpec.add(libraryParamSpec53.getTree());
					// antlr/Plexil.g:418:31: ( COMMA libraryParamSpec )*
					loop15:
					while (true) {
						int alt15=2;
						int LA15_0 = input.LA(1);
						if ( (LA15_0==COMMA) ) {
							alt15=1;
						}

						switch (alt15) {
						case 1 :
							// antlr/Plexil.g:418:33: COMMA libraryParamSpec
							{
							COMMA54=(Token)match(input,COMMA,FOLLOW_COMMA_in_libraryInterfaceSpec1976); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_COMMA.add(COMMA54);

							pushFollow(FOLLOW_libraryParamSpec_in_libraryInterfaceSpec1978);
							libraryParamSpec55=libraryParamSpec();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_libraryParamSpec.add(libraryParamSpec55.getTree());
							}
							break;

						default :
							break loop15;
						}
					}

					}
					break;

			}

			RPAREN56=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_libraryInterfaceSpec1986); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN56);

			// AST REWRITE
			// elements: libraryParamSpec
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (PlexilTreeNode)adaptor.nil();
			// 419:5: -> ^( PARAMETERS ( libraryParamSpec )* )
			{
				// antlr/Plexil.g:419:8: ^( PARAMETERS ( libraryParamSpec )* )
				{
				PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
				root_1 = (PlexilTreeNode)adaptor.becomeRoot((PlexilTreeNode)adaptor.create(PARAMETERS, "PARAMETERS"), root_1);
				// antlr/Plexil.g:419:21: ( libraryParamSpec )*
				while ( stream_libraryParamSpec.hasNext() ) {
					adaptor.addChild(root_1, stream_libraryParamSpec.nextTree());
				}
				stream_libraryParamSpec.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { m_paraphrases.pop(); }
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "libraryInterfaceSpec"


	public static class libraryParamSpec_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "libraryParamSpec"
	// antlr/Plexil.g:422:1: libraryParamSpec : ( IN_KYWD ^| IN_OUT_KYWD ^) baseTypeName ( ( NCNAME LBRACKET )=> NCNAME LBRACKET ! INT RBRACKET !| NCNAME ) ;
	public final PlexilParser.libraryParamSpec_return libraryParamSpec() throws RecognitionException {
		PlexilParser.libraryParamSpec_return retval = new PlexilParser.libraryParamSpec_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token IN_KYWD57=null;
		Token IN_OUT_KYWD58=null;
		Token NCNAME60=null;
		Token LBRACKET61=null;
		Token INT62=null;
		Token RBRACKET63=null;
		Token NCNAME64=null;
		ParserRuleReturnScope baseTypeName59 =null;

		PlexilTreeNode IN_KYWD57_tree=null;
		PlexilTreeNode IN_OUT_KYWD58_tree=null;
		PlexilTreeNode NCNAME60_tree=null;
		PlexilTreeNode LBRACKET61_tree=null;
		PlexilTreeNode INT62_tree=null;
		PlexilTreeNode RBRACKET63_tree=null;
		PlexilTreeNode NCNAME64_tree=null;

		try {
			// antlr/Plexil.g:422:18: ( ( IN_KYWD ^| IN_OUT_KYWD ^) baseTypeName ( ( NCNAME LBRACKET )=> NCNAME LBRACKET ! INT RBRACKET !| NCNAME ) )
			// antlr/Plexil.g:423:2: ( IN_KYWD ^| IN_OUT_KYWD ^) baseTypeName ( ( NCNAME LBRACKET )=> NCNAME LBRACKET ! INT RBRACKET !| NCNAME )
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			// antlr/Plexil.g:423:2: ( IN_KYWD ^| IN_OUT_KYWD ^)
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==IN_KYWD) ) {
				alt17=1;
			}
			else if ( (LA17_0==IN_OUT_KYWD) ) {
				alt17=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}

			switch (alt17) {
				case 1 :
					// antlr/Plexil.g:423:4: IN_KYWD ^
					{
					IN_KYWD57=(Token)match(input,IN_KYWD,FOLLOW_IN_KYWD_in_libraryParamSpec2012); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					IN_KYWD57_tree = (PlexilTreeNode)adaptor.create(IN_KYWD57);
					root_0 = (PlexilTreeNode)adaptor.becomeRoot(IN_KYWD57_tree, root_0);
					}

					}
					break;
				case 2 :
					// antlr/Plexil.g:423:15: IN_OUT_KYWD ^
					{
					IN_OUT_KYWD58=(Token)match(input,IN_OUT_KYWD,FOLLOW_IN_OUT_KYWD_in_libraryParamSpec2017); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					IN_OUT_KYWD58_tree = (PlexilTreeNode)adaptor.create(IN_OUT_KYWD58);
					root_0 = (PlexilTreeNode)adaptor.becomeRoot(IN_OUT_KYWD58_tree, root_0);
					}

					}
					break;

			}

			pushFollow(FOLLOW_baseTypeName_in_libraryParamSpec2023);
			baseTypeName59=baseTypeName();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, baseTypeName59.getTree());

			// antlr/Plexil.g:425:2: ( ( NCNAME LBRACKET )=> NCNAME LBRACKET ! INT RBRACKET !| NCNAME )
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==NCNAME) ) {
				int LA18_1 = input.LA(2);
				if ( (LA18_1==LBRACKET) && (synpred4_Plexil())) {
					alt18=1;
				}
				else if ( (LA18_1==COMMA||LA18_1==RPAREN) ) {
					alt18=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 18, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}

			switch (alt18) {
				case 1 :
					// antlr/Plexil.g:425:4: ( NCNAME LBRACKET )=> NCNAME LBRACKET ! INT RBRACKET !
					{
					NCNAME60=(Token)match(input,NCNAME,FOLLOW_NCNAME_in_libraryParamSpec2036); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NCNAME60_tree = (PlexilTreeNode)adaptor.create(NCNAME60);
					adaptor.addChild(root_0, NCNAME60_tree);
					}

					LBRACKET61=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_libraryParamSpec2038); if (state.failed) return retval;
					INT62=(Token)match(input,INT,FOLLOW_INT_in_libraryParamSpec2041); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					INT62_tree = (PlexilTreeNode)adaptor.create(INT62);
					adaptor.addChild(root_0, INT62_tree);
					}

					RBRACKET63=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_libraryParamSpec2043); if (state.failed) return retval;
					}
					break;
				case 2 :
					// antlr/Plexil.g:426:4: NCNAME
					{
					NCNAME64=(Token)match(input,NCNAME,FOLLOW_NCNAME_in_libraryParamSpec2050); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NCNAME64_tree = (PlexilTreeNode)adaptor.create(NCNAME64);
					adaptor.addChild(root_0, NCNAME64_tree);
					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "libraryParamSpec"


	public static class action_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "action"
	// antlr/Plexil.g:434:1: action : (actionId= NCNAME COLON )? rest= baseAction -> ^( ACTION ( $actionId)? $rest) ;
	public final PlexilParser.action_return action() throws RecognitionException {
		PlexilParser.action_return retval = new PlexilParser.action_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token actionId=null;
		Token COLON65=null;
		ParserRuleReturnScope rest =null;

		PlexilTreeNode actionId_tree=null;
		PlexilTreeNode COLON65_tree=null;
		RewriteRuleTokenStream stream_COLON=new RewriteRuleTokenStream(adaptor,"token COLON");
		RewriteRuleTokenStream stream_NCNAME=new RewriteRuleTokenStream(adaptor,"token NCNAME");
		RewriteRuleSubtreeStream stream_baseAction=new RewriteRuleSubtreeStream(adaptor,"rule baseAction");

		 m_paraphrases.push("in action"); 
		try {
			// antlr/Plexil.g:437:2: ( (actionId= NCNAME COLON )? rest= baseAction -> ^( ACTION ( $actionId)? $rest) )
			// antlr/Plexil.g:438:5: (actionId= NCNAME COLON )? rest= baseAction
			{
			// antlr/Plexil.g:438:5: (actionId= NCNAME COLON )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==NCNAME) ) {
				int LA19_1 = input.LA(2);
				if ( (LA19_1==COLON) ) {
					alt19=1;
				}
			}
			switch (alt19) {
				case 1 :
					// antlr/Plexil.g:438:6: actionId= NCNAME COLON
					{
					actionId=(Token)match(input,NCNAME,FOLLOW_NCNAME_in_action2085); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NCNAME.add(actionId);

					COLON65=(Token)match(input,COLON,FOLLOW_COLON_in_action2087); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COLON.add(COLON65);

					}
					break;

			}

			pushFollow(FOLLOW_baseAction_in_action2094);
			rest=baseAction();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_baseAction.add(rest.getTree());
			// AST REWRITE
			// elements: rest, actionId
			// token labels: actionId
			// rule labels: rest, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_actionId=new RewriteRuleTokenStream(adaptor,"token actionId",actionId);
			RewriteRuleSubtreeStream stream_rest=new RewriteRuleSubtreeStream(adaptor,"rule rest",rest!=null?rest.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (PlexilTreeNode)adaptor.nil();
			// 440:5: -> ^( ACTION ( $actionId)? $rest)
			{
				// antlr/Plexil.g:440:8: ^( ACTION ( $actionId)? $rest)
				{
				PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
				root_1 = (PlexilTreeNode)adaptor.becomeRoot((PlexilTreeNode)adaptor.create(ACTION, "ACTION"), root_1);
				// antlr/Plexil.g:440:18: ( $actionId)?
				if ( stream_actionId.hasNext() ) {
					adaptor.addChild(root_1, stream_actionId.nextNode());
				}
				stream_actionId.reset();

				adaptor.addChild(root_1, stream_rest.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { m_paraphrases.pop(); }
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "action"


	public static class baseAction_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "baseAction"
	// antlr/Plexil.g:443:1: baseAction : ( compoundAction | simpleAction | block );
	public final PlexilParser.baseAction_return baseAction() throws RecognitionException {
		PlexilParser.baseAction_return retval = new PlexilParser.baseAction_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		ParserRuleReturnScope compoundAction66 =null;
		ParserRuleReturnScope simpleAction67 =null;
		ParserRuleReturnScope block68 =null;


		try {
			// antlr/Plexil.g:443:12: ( compoundAction | simpleAction | block )
			int alt20=3;
			switch ( input.LA(1) ) {
			case FOR_KYWD:
			case IF_KYWD:
			case ON_COMMAND_KYWD:
			case ON_MESSAGE_KYWD:
			case WHILE_KYWD:
				{
				alt20=1;
				}
				break;
			case LIBRARY_CALL_KYWD:
			case LPAREN:
			case NCNAME:
			case REQUEST_KYWD:
			case SYNCHRONOUS_COMMAND_KYWD:
			case UPDATE_KYWD:
			case WAIT_KYWD:
				{
				alt20=2;
				}
				break;
			case CONCURRENCE_KYWD:
			case LBRACE:
			case SEQUENCE_KYWD:
			case TRY_KYWD:
			case UNCHECKED_SEQUENCE_KYWD:
				{
				alt20=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 20, 0, input);
				throw nvae;
			}
			switch (alt20) {
				case 1 :
					// antlr/Plexil.g:443:14: compoundAction
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_compoundAction_in_baseAction2121);
					compoundAction66=compoundAction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, compoundAction66.getTree());

					}
					break;
				case 2 :
					// antlr/Plexil.g:443:31: simpleAction
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_simpleAction_in_baseAction2125);
					simpleAction67=simpleAction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleAction67.getTree());

					}
					break;
				case 3 :
					// antlr/Plexil.g:443:46: block
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_block_in_baseAction2129);
					block68=block();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, block68.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "baseAction"


	public static class compoundAction_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "compoundAction"
	// antlr/Plexil.g:445:1: compoundAction : ( forAction | ifAction | onCommandAction | onMessageAction | whileAction );
	public final PlexilParser.compoundAction_return compoundAction() throws RecognitionException {
		PlexilParser.compoundAction_return retval = new PlexilParser.compoundAction_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		ParserRuleReturnScope forAction69 =null;
		ParserRuleReturnScope ifAction70 =null;
		ParserRuleReturnScope onCommandAction71 =null;
		ParserRuleReturnScope onMessageAction72 =null;
		ParserRuleReturnScope whileAction73 =null;


		try {
			// antlr/Plexil.g:445:16: ( forAction | ifAction | onCommandAction | onMessageAction | whileAction )
			int alt21=5;
			switch ( input.LA(1) ) {
			case FOR_KYWD:
				{
				alt21=1;
				}
				break;
			case IF_KYWD:
				{
				alt21=2;
				}
				break;
			case ON_COMMAND_KYWD:
				{
				alt21=3;
				}
				break;
			case ON_MESSAGE_KYWD:
				{
				alt21=4;
				}
				break;
			case WHILE_KYWD:
				{
				alt21=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}
			switch (alt21) {
				case 1 :
					// antlr/Plexil.g:445:18: forAction
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_forAction_in_compoundAction2139);
					forAction69=forAction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, forAction69.getTree());

					}
					break;
				case 2 :
					// antlr/Plexil.g:445:30: ifAction
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_ifAction_in_compoundAction2143);
					ifAction70=ifAction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, ifAction70.getTree());

					}
					break;
				case 3 :
					// antlr/Plexil.g:445:41: onCommandAction
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_onCommandAction_in_compoundAction2147);
					onCommandAction71=onCommandAction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, onCommandAction71.getTree());

					}
					break;
				case 4 :
					// antlr/Plexil.g:445:59: onMessageAction
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_onMessageAction_in_compoundAction2151);
					onMessageAction72=onMessageAction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, onMessageAction72.getTree());

					}
					break;
				case 5 :
					// antlr/Plexil.g:445:77: whileAction
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_whileAction_in_compoundAction2155);
					whileAction73=whileAction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, whileAction73.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "compoundAction"


	public static class simpleAction_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "simpleAction"
	// antlr/Plexil.g:448:1: simpleAction : ( ( NCNAME ( LBRACKET | EQUALS ) )=> assignment | ( ( NCNAME LPAREN ) | LPAREN )=> commandInvocation SEMICOLON !| libraryCall | request | update | synchCmd | waitBuiltin );
	public final PlexilParser.simpleAction_return simpleAction() throws RecognitionException {
		PlexilParser.simpleAction_return retval = new PlexilParser.simpleAction_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token SEMICOLON76=null;
		ParserRuleReturnScope assignment74 =null;
		ParserRuleReturnScope commandInvocation75 =null;
		ParserRuleReturnScope libraryCall77 =null;
		ParserRuleReturnScope request78 =null;
		ParserRuleReturnScope update79 =null;
		ParserRuleReturnScope synchCmd80 =null;
		ParserRuleReturnScope waitBuiltin81 =null;

		PlexilTreeNode SEMICOLON76_tree=null;

		try {
			// antlr/Plexil.g:448:14: ( ( NCNAME ( LBRACKET | EQUALS ) )=> assignment | ( ( NCNAME LPAREN ) | LPAREN )=> commandInvocation SEMICOLON !| libraryCall | request | update | synchCmd | waitBuiltin )
			int alt22=7;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==NCNAME) ) {
				int LA22_1 = input.LA(2);
				if ( (LA22_1==LBRACKET) && (synpred5_Plexil())) {
					alt22=1;
				}
				else if ( (LA22_1==EQUALS) && (synpred5_Plexil())) {
					alt22=1;
				}
				else if ( (LA22_1==LPAREN) && (synpred6_Plexil())) {
					alt22=2;
				}

			}
			else if ( (LA22_0==LPAREN) && (synpred6_Plexil())) {
				alt22=2;
			}
			else if ( (LA22_0==LIBRARY_CALL_KYWD) ) {
				alt22=3;
			}
			else if ( (LA22_0==REQUEST_KYWD) ) {
				alt22=4;
			}
			else if ( (LA22_0==UPDATE_KYWD) ) {
				alt22=5;
			}
			else if ( (LA22_0==SYNCHRONOUS_COMMAND_KYWD) ) {
				alt22=6;
			}
			else if ( (LA22_0==WAIT_KYWD) ) {
				alt22=7;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}

			switch (alt22) {
				case 1 :
					// antlr/Plexil.g:449:5: ( NCNAME ( LBRACKET | EQUALS ) )=> assignment
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_assignment_in_simpleAction2183);
					assignment74=assignment();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, assignment74.getTree());

					}
					break;
				case 2 :
					// antlr/Plexil.g:450:5: ( ( NCNAME LPAREN ) | LPAREN )=> commandInvocation SEMICOLON !
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_commandInvocation_in_simpleAction2203);
					commandInvocation75=commandInvocation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, commandInvocation75.getTree());

					SEMICOLON76=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_simpleAction2205); if (state.failed) return retval;
					}
					break;
				case 3 :
					// antlr/Plexil.g:451:5: libraryCall
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_libraryCall_in_simpleAction2212);
					libraryCall77=libraryCall();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, libraryCall77.getTree());

					}
					break;
				case 4 :
					// antlr/Plexil.g:452:5: request
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_request_in_simpleAction2218);
					request78=request();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, request78.getTree());

					}
					break;
				case 5 :
					// antlr/Plexil.g:453:5: update
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_update_in_simpleAction2224);
					update79=update();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, update79.getTree());

					}
					break;
				case 6 :
					// antlr/Plexil.g:454:5: synchCmd
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_synchCmd_in_simpleAction2230);
					synchCmd80=synchCmd();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, synchCmd80.getTree());

					}
					break;
				case 7 :
					// antlr/Plexil.g:455:5: waitBuiltin
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_waitBuiltin_in_simpleAction2236);
					waitBuiltin81=waitBuiltin();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, waitBuiltin81.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "simpleAction"


	public static class forAction_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "forAction"
	// antlr/Plexil.g:458:1: forAction : FOR_KYWD LPAREN baseTypeName NCNAME EQUALS loopvarinit= expression SEMICOLON endtest= expression SEMICOLON loopvarupdate= expression RPAREN action -> ^( FOR_KYWD ^( VARIABLE_DECLARATION baseTypeName NCNAME $loopvarinit) $endtest $loopvarupdate action ) ;
	public final PlexilParser.forAction_return forAction() throws RecognitionException {
		PlexilParser.forAction_return retval = new PlexilParser.forAction_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token FOR_KYWD82=null;
		Token LPAREN83=null;
		Token NCNAME85=null;
		Token EQUALS86=null;
		Token SEMICOLON87=null;
		Token SEMICOLON88=null;
		Token RPAREN89=null;
		ParserRuleReturnScope loopvarinit =null;
		ParserRuleReturnScope endtest =null;
		ParserRuleReturnScope loopvarupdate =null;
		ParserRuleReturnScope baseTypeName84 =null;
		ParserRuleReturnScope action90 =null;

		PlexilTreeNode FOR_KYWD82_tree=null;
		PlexilTreeNode LPAREN83_tree=null;
		PlexilTreeNode NCNAME85_tree=null;
		PlexilTreeNode EQUALS86_tree=null;
		PlexilTreeNode SEMICOLON87_tree=null;
		PlexilTreeNode SEMICOLON88_tree=null;
		PlexilTreeNode RPAREN89_tree=null;
		RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
		RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_FOR_KYWD=new RewriteRuleTokenStream(adaptor,"token FOR_KYWD");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleTokenStream stream_NCNAME=new RewriteRuleTokenStream(adaptor,"token NCNAME");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_baseTypeName=new RewriteRuleSubtreeStream(adaptor,"rule baseTypeName");
		RewriteRuleSubtreeStream stream_action=new RewriteRuleSubtreeStream(adaptor,"rule action");

		 m_paraphrases.push("in \"for\" statement"); 
		try {
			// antlr/Plexil.g:461:2: ( FOR_KYWD LPAREN baseTypeName NCNAME EQUALS loopvarinit= expression SEMICOLON endtest= expression SEMICOLON loopvarupdate= expression RPAREN action -> ^( FOR_KYWD ^( VARIABLE_DECLARATION baseTypeName NCNAME $loopvarinit) $endtest $loopvarupdate action ) )
			// antlr/Plexil.g:462:5: FOR_KYWD LPAREN baseTypeName NCNAME EQUALS loopvarinit= expression SEMICOLON endtest= expression SEMICOLON loopvarupdate= expression RPAREN action
			{
			FOR_KYWD82=(Token)match(input,FOR_KYWD,FOLLOW_FOR_KYWD_in_forAction2261); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_FOR_KYWD.add(FOR_KYWD82);

			LPAREN83=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_forAction2268); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN83);

			pushFollow(FOLLOW_baseTypeName_in_forAction2270);
			baseTypeName84=baseTypeName();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_baseTypeName.add(baseTypeName84.getTree());
			NCNAME85=(Token)match(input,NCNAME,FOLLOW_NCNAME_in_forAction2272); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_NCNAME.add(NCNAME85);

			EQUALS86=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_forAction2274); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_EQUALS.add(EQUALS86);

			pushFollow(FOLLOW_expression_in_forAction2278);
			loopvarinit=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(loopvarinit.getTree());
			SEMICOLON87=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_forAction2284); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_SEMICOLON.add(SEMICOLON87);

			pushFollow(FOLLOW_expression_in_forAction2288);
			endtest=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(endtest.getTree());
			SEMICOLON88=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_forAction2294); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_SEMICOLON.add(SEMICOLON88);

			pushFollow(FOLLOW_expression_in_forAction2298);
			loopvarupdate=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(loopvarupdate.getTree());
			RPAREN89=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_forAction2304); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN89);

			pushFollow(FOLLOW_action_in_forAction2310);
			action90=action();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_action.add(action90.getTree());
			// AST REWRITE
			// elements: FOR_KYWD, loopvarupdate, NCNAME, action, baseTypeName, endtest, loopvarinit
			// token labels: 
			// rule labels: loopvarupdate, loopvarinit, endtest, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_loopvarupdate=new RewriteRuleSubtreeStream(adaptor,"rule loopvarupdate",loopvarupdate!=null?loopvarupdate.getTree():null);
			RewriteRuleSubtreeStream stream_loopvarinit=new RewriteRuleSubtreeStream(adaptor,"rule loopvarinit",loopvarinit!=null?loopvarinit.getTree():null);
			RewriteRuleSubtreeStream stream_endtest=new RewriteRuleSubtreeStream(adaptor,"rule endtest",endtest!=null?endtest.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (PlexilTreeNode)adaptor.nil();
			// 468:5: -> ^( FOR_KYWD ^( VARIABLE_DECLARATION baseTypeName NCNAME $loopvarinit) $endtest $loopvarupdate action )
			{
				// antlr/Plexil.g:468:8: ^( FOR_KYWD ^( VARIABLE_DECLARATION baseTypeName NCNAME $loopvarinit) $endtest $loopvarupdate action )
				{
				PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
				root_1 = (PlexilTreeNode)adaptor.becomeRoot(stream_FOR_KYWD.nextNode(), root_1);
				// antlr/Plexil.g:468:19: ^( VARIABLE_DECLARATION baseTypeName NCNAME $loopvarinit)
				{
				PlexilTreeNode root_2 = (PlexilTreeNode)adaptor.nil();
				root_2 = (PlexilTreeNode)adaptor.becomeRoot((PlexilTreeNode)adaptor.create(VARIABLE_DECLARATION, "VARIABLE_DECLARATION"), root_2);
				adaptor.addChild(root_2, stream_baseTypeName.nextTree());
				adaptor.addChild(root_2, stream_NCNAME.nextNode());
				adaptor.addChild(root_2, stream_loopvarinit.nextTree());
				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_1, stream_endtest.nextTree());
				adaptor.addChild(root_1, stream_loopvarupdate.nextTree());
				adaptor.addChild(root_1, stream_action.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { m_paraphrases.pop(); }
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "forAction"


	public static class ifAction_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "ifAction"
	// antlr/Plexil.g:471:1: ifAction : IF_KYWD ^ expression action ( ELSEIF_KYWD ! expression action )* ( ELSE_KYWD ! action )? ENDIF_KYWD ! ( SEMICOLON !)? ;
	public final PlexilParser.ifAction_return ifAction() throws RecognitionException {
		PlexilParser.ifAction_return retval = new PlexilParser.ifAction_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token IF_KYWD91=null;
		Token ELSEIF_KYWD94=null;
		Token ELSE_KYWD97=null;
		Token ENDIF_KYWD99=null;
		Token SEMICOLON100=null;
		ParserRuleReturnScope expression92 =null;
		ParserRuleReturnScope action93 =null;
		ParserRuleReturnScope expression95 =null;
		ParserRuleReturnScope action96 =null;
		ParserRuleReturnScope action98 =null;

		PlexilTreeNode IF_KYWD91_tree=null;
		PlexilTreeNode ELSEIF_KYWD94_tree=null;
		PlexilTreeNode ELSE_KYWD97_tree=null;
		PlexilTreeNode ENDIF_KYWD99_tree=null;
		PlexilTreeNode SEMICOLON100_tree=null;

		 m_paraphrases.push("in \"if\" statement"); 
		try {
			// antlr/Plexil.g:474:2: ( IF_KYWD ^ expression action ( ELSEIF_KYWD ! expression action )* ( ELSE_KYWD ! action )? ENDIF_KYWD ! ( SEMICOLON !)? )
			// antlr/Plexil.g:475:5: IF_KYWD ^ expression action ( ELSEIF_KYWD ! expression action )* ( ELSE_KYWD ! action )? ENDIF_KYWD ! ( SEMICOLON !)?
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			IF_KYWD91=(Token)match(input,IF_KYWD,FOLLOW_IF_KYWD_in_ifAction2364); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IF_KYWD91_tree = (PlexilTreeNode)adaptor.create(IF_KYWD91);
			root_0 = (PlexilTreeNode)adaptor.becomeRoot(IF_KYWD91_tree, root_0);
			}

			pushFollow(FOLLOW_expression_in_ifAction2367);
			expression92=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression92.getTree());

			pushFollow(FOLLOW_action_in_ifAction2369);
			action93=action();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, action93.getTree());

			// antlr/Plexil.g:476:5: ( ELSEIF_KYWD ! expression action )*
			loop23:
			while (true) {
				int alt23=2;
				int LA23_0 = input.LA(1);
				if ( (LA23_0==ELSEIF_KYWD) ) {
					alt23=1;
				}

				switch (alt23) {
				case 1 :
					// antlr/Plexil.g:476:6: ELSEIF_KYWD ! expression action
					{
					ELSEIF_KYWD94=(Token)match(input,ELSEIF_KYWD,FOLLOW_ELSEIF_KYWD_in_ifAction2376); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_ifAction2379);
					expression95=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression95.getTree());

					pushFollow(FOLLOW_action_in_ifAction2381);
					action96=action();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, action96.getTree());

					}
					break;

				default :
					break loop23;
				}
			}

			// antlr/Plexil.g:477:5: ( ELSE_KYWD ! action )?
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==ELSE_KYWD) ) {
				alt24=1;
			}
			switch (alt24) {
				case 1 :
					// antlr/Plexil.g:477:6: ELSE_KYWD ! action
					{
					ELSE_KYWD97=(Token)match(input,ELSE_KYWD,FOLLOW_ELSE_KYWD_in_ifAction2390); if (state.failed) return retval;
					pushFollow(FOLLOW_action_in_ifAction2393);
					action98=action();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, action98.getTree());

					}
					break;

			}

			ENDIF_KYWD99=(Token)match(input,ENDIF_KYWD,FOLLOW_ENDIF_KYWD_in_ifAction2401); if (state.failed) return retval;
			// antlr/Plexil.g:479:14: ( SEMICOLON !)?
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==SEMICOLON) ) {
				alt25=1;
			}
			switch (alt25) {
				case 1 :
					// antlr/Plexil.g:479:14: SEMICOLON !
					{
					SEMICOLON100=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_ifAction2408); if (state.failed) return retval;
					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { m_paraphrases.pop(); }
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "ifAction"


	public static class onCommandAction_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "onCommandAction"
	// antlr/Plexil.g:482:1: onCommandAction : ON_COMMAND_KYWD ^ expression ( paramsSpec )? action ;
	public final PlexilParser.onCommandAction_return onCommandAction() throws RecognitionException {
		PlexilParser.onCommandAction_return retval = new PlexilParser.onCommandAction_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token ON_COMMAND_KYWD101=null;
		ParserRuleReturnScope expression102 =null;
		ParserRuleReturnScope paramsSpec103 =null;
		ParserRuleReturnScope action104 =null;

		PlexilTreeNode ON_COMMAND_KYWD101_tree=null;

		 m_paraphrases.push("in \"OnCommand\" statement"); 
		try {
			// antlr/Plexil.g:485:2: ( ON_COMMAND_KYWD ^ expression ( paramsSpec )? action )
			// antlr/Plexil.g:486:5: ON_COMMAND_KYWD ^ expression ( paramsSpec )? action
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			ON_COMMAND_KYWD101=(Token)match(input,ON_COMMAND_KYWD,FOLLOW_ON_COMMAND_KYWD_in_onCommandAction2436); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			ON_COMMAND_KYWD101_tree = (PlexilTreeNode)adaptor.create(ON_COMMAND_KYWD101);
			root_0 = (PlexilTreeNode)adaptor.becomeRoot(ON_COMMAND_KYWD101_tree, root_0);
			}

			pushFollow(FOLLOW_expression_in_onCommandAction2439);
			expression102=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression102.getTree());

			// antlr/Plexil.g:486:33: ( paramsSpec )?
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==LPAREN) ) {
				switch ( input.LA(2) ) {
					case DATE_KYWD:
						{
						alt26=1;
						}
						break;
					case ANY_KYWD:
					case BOOLEAN_KYWD:
					case ELLIPSIS:
					case INTEGER_KYWD:
					case REAL_KYWD:
					case RPAREN:
					case STRING_KYWD:
						{
						alt26=1;
						}
						break;
					case DURATION_KYWD:
						{
						alt26=1;
						}
						break;
				}
			}
			switch (alt26) {
				case 1 :
					// antlr/Plexil.g:486:33: paramsSpec
					{
					pushFollow(FOLLOW_paramsSpec_in_onCommandAction2441);
					paramsSpec103=paramsSpec();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, paramsSpec103.getTree());

					}
					break;

			}

			pushFollow(FOLLOW_action_in_onCommandAction2444);
			action104=action();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, action104.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { m_paraphrases.pop(); }
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "onCommandAction"


	public static class onMessageAction_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "onMessageAction"
	// antlr/Plexil.g:489:1: onMessageAction : ON_MESSAGE_KYWD ^ expression action ;
	public final PlexilParser.onMessageAction_return onMessageAction() throws RecognitionException {
		PlexilParser.onMessageAction_return retval = new PlexilParser.onMessageAction_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token ON_MESSAGE_KYWD105=null;
		ParserRuleReturnScope expression106 =null;
		ParserRuleReturnScope action107 =null;

		PlexilTreeNode ON_MESSAGE_KYWD105_tree=null;

		 m_paraphrases.push("in \"OnMessage\" statement"); 
		try {
			// antlr/Plexil.g:492:2: ( ON_MESSAGE_KYWD ^ expression action )
			// antlr/Plexil.g:493:5: ON_MESSAGE_KYWD ^ expression action
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			ON_MESSAGE_KYWD105=(Token)match(input,ON_MESSAGE_KYWD,FOLLOW_ON_MESSAGE_KYWD_in_onMessageAction2469); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			ON_MESSAGE_KYWD105_tree = new OnMessageNode(ON_MESSAGE_KYWD105) ;
			root_0 = (PlexilTreeNode)adaptor.becomeRoot(ON_MESSAGE_KYWD105_tree, root_0);
			}

			pushFollow(FOLLOW_expression_in_onMessageAction2475);
			expression106=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression106.getTree());

			pushFollow(FOLLOW_action_in_onMessageAction2477);
			action107=action();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, action107.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { m_paraphrases.pop(); }
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "onMessageAction"


	public static class whileAction_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "whileAction"
	// antlr/Plexil.g:496:1: whileAction : WHILE_KYWD ^ expression action ;
	public final PlexilParser.whileAction_return whileAction() throws RecognitionException {
		PlexilParser.whileAction_return retval = new PlexilParser.whileAction_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token WHILE_KYWD108=null;
		ParserRuleReturnScope expression109 =null;
		ParserRuleReturnScope action110 =null;

		PlexilTreeNode WHILE_KYWD108_tree=null;

		 m_paraphrases.push("in \"while\" statement"); 
		try {
			// antlr/Plexil.g:499:2: ( WHILE_KYWD ^ expression action )
			// antlr/Plexil.g:500:5: WHILE_KYWD ^ expression action
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			WHILE_KYWD108=(Token)match(input,WHILE_KYWD,FOLLOW_WHILE_KYWD_in_whileAction2502); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			WHILE_KYWD108_tree = (PlexilTreeNode)adaptor.create(WHILE_KYWD108);
			root_0 = (PlexilTreeNode)adaptor.becomeRoot(WHILE_KYWD108_tree, root_0);
			}

			pushFollow(FOLLOW_expression_in_whileAction2505);
			expression109=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression109.getTree());

			pushFollow(FOLLOW_action_in_whileAction2507);
			action110=action();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, action110.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { m_paraphrases.pop(); }
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "whileAction"


	public static class synchCmd_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "synchCmd"
	// antlr/Plexil.g:503:1: synchCmd : SYNCHRONOUS_COMMAND_KYWD ^ ( commandWithAssignment | commandInvocation ) ( TIMEOUT_KYWD ! expression ( COMMA ! expression )? )? SEMICOLON !;
	public final PlexilParser.synchCmd_return synchCmd() throws RecognitionException {
		PlexilParser.synchCmd_return retval = new PlexilParser.synchCmd_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token SYNCHRONOUS_COMMAND_KYWD111=null;
		Token TIMEOUT_KYWD114=null;
		Token COMMA116=null;
		Token SEMICOLON118=null;
		ParserRuleReturnScope commandWithAssignment112 =null;
		ParserRuleReturnScope commandInvocation113 =null;
		ParserRuleReturnScope expression115 =null;
		ParserRuleReturnScope expression117 =null;

		PlexilTreeNode SYNCHRONOUS_COMMAND_KYWD111_tree=null;
		PlexilTreeNode TIMEOUT_KYWD114_tree=null;
		PlexilTreeNode COMMA116_tree=null;
		PlexilTreeNode SEMICOLON118_tree=null;

		 m_paraphrases.push("in \"SynchronousCommand\" statement"); 
		try {
			// antlr/Plexil.g:506:2: ( SYNCHRONOUS_COMMAND_KYWD ^ ( commandWithAssignment | commandInvocation ) ( TIMEOUT_KYWD ! expression ( COMMA ! expression )? )? SEMICOLON !)
			// antlr/Plexil.g:507:5: SYNCHRONOUS_COMMAND_KYWD ^ ( commandWithAssignment | commandInvocation ) ( TIMEOUT_KYWD ! expression ( COMMA ! expression )? )? SEMICOLON !
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			SYNCHRONOUS_COMMAND_KYWD111=(Token)match(input,SYNCHRONOUS_COMMAND_KYWD,FOLLOW_SYNCHRONOUS_COMMAND_KYWD_in_synchCmd2532); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			SYNCHRONOUS_COMMAND_KYWD111_tree = (PlexilTreeNode)adaptor.create(SYNCHRONOUS_COMMAND_KYWD111);
			root_0 = (PlexilTreeNode)adaptor.becomeRoot(SYNCHRONOUS_COMMAND_KYWD111_tree, root_0);
			}

			// antlr/Plexil.g:508:5: ( commandWithAssignment | commandInvocation )
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( (LA27_0==NCNAME) ) {
				int LA27_1 = input.LA(2);
				if ( (LA27_1==EQUALS||LA27_1==LBRACKET) ) {
					alt27=1;
				}
				else if ( (LA27_1==LPAREN) ) {
					alt27=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 27, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA27_0==LPAREN) ) {
				alt27=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 27, 0, input);
				throw nvae;
			}

			switch (alt27) {
				case 1 :
					// antlr/Plexil.g:508:7: commandWithAssignment
					{
					pushFollow(FOLLOW_commandWithAssignment_in_synchCmd2541);
					commandWithAssignment112=commandWithAssignment();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, commandWithAssignment112.getTree());

					}
					break;
				case 2 :
					// antlr/Plexil.g:508:31: commandInvocation
					{
					pushFollow(FOLLOW_commandInvocation_in_synchCmd2545);
					commandInvocation113=commandInvocation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, commandInvocation113.getTree());

					}
					break;

			}

			// antlr/Plexil.g:509:2: ( TIMEOUT_KYWD ! expression ( COMMA ! expression )? )?
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==TIMEOUT_KYWD) ) {
				alt29=1;
			}
			switch (alt29) {
				case 1 :
					// antlr/Plexil.g:509:4: TIMEOUT_KYWD ! expression ( COMMA ! expression )?
					{
					TIMEOUT_KYWD114=(Token)match(input,TIMEOUT_KYWD,FOLLOW_TIMEOUT_KYWD_in_synchCmd2552); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_synchCmd2555);
					expression115=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression115.getTree());

					// antlr/Plexil.g:509:29: ( COMMA ! expression )?
					int alt28=2;
					int LA28_0 = input.LA(1);
					if ( (LA28_0==COMMA) ) {
						alt28=1;
					}
					switch (alt28) {
						case 1 :
							// antlr/Plexil.g:509:31: COMMA ! expression
							{
							COMMA116=(Token)match(input,COMMA,FOLLOW_COMMA_in_synchCmd2559); if (state.failed) return retval;
							pushFollow(FOLLOW_expression_in_synchCmd2562);
							expression117=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, expression117.getTree());

							}
							break;

					}

					}
					break;

			}

			SEMICOLON118=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_synchCmd2571); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { m_paraphrases.pop(); }
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "synchCmd"


	public static class waitBuiltin_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "waitBuiltin"
	// antlr/Plexil.g:513:1: waitBuiltin : WAIT_KYWD ^ expression ( COMMA ! ( variable | INT | DOUBLE ) )? SEMICOLON !;
	public final PlexilParser.waitBuiltin_return waitBuiltin() throws RecognitionException {
		PlexilParser.waitBuiltin_return retval = new PlexilParser.waitBuiltin_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token WAIT_KYWD119=null;
		Token COMMA121=null;
		Token INT123=null;
		Token DOUBLE124=null;
		Token SEMICOLON125=null;
		ParserRuleReturnScope expression120 =null;
		ParserRuleReturnScope variable122 =null;

		PlexilTreeNode WAIT_KYWD119_tree=null;
		PlexilTreeNode COMMA121_tree=null;
		PlexilTreeNode INT123_tree=null;
		PlexilTreeNode DOUBLE124_tree=null;
		PlexilTreeNode SEMICOLON125_tree=null;

		 m_paraphrases.push("in \"Wait\" statement"); 
		try {
			// antlr/Plexil.g:516:2: ( WAIT_KYWD ^ expression ( COMMA ! ( variable | INT | DOUBLE ) )? SEMICOLON !)
			// antlr/Plexil.g:517:2: WAIT_KYWD ^ expression ( COMMA ! ( variable | INT | DOUBLE ) )? SEMICOLON !
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			WAIT_KYWD119=(Token)match(input,WAIT_KYWD,FOLLOW_WAIT_KYWD_in_waitBuiltin2594); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			WAIT_KYWD119_tree = (PlexilTreeNode)adaptor.create(WAIT_KYWD119);
			root_0 = (PlexilTreeNode)adaptor.becomeRoot(WAIT_KYWD119_tree, root_0);
			}

			pushFollow(FOLLOW_expression_in_waitBuiltin2597);
			expression120=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression120.getTree());

			// antlr/Plexil.g:517:24: ( COMMA ! ( variable | INT | DOUBLE ) )?
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==COMMA) ) {
				alt31=1;
			}
			switch (alt31) {
				case 1 :
					// antlr/Plexil.g:517:25: COMMA ! ( variable | INT | DOUBLE )
					{
					COMMA121=(Token)match(input,COMMA,FOLLOW_COMMA_in_waitBuiltin2600); if (state.failed) return retval;
					// antlr/Plexil.g:517:32: ( variable | INT | DOUBLE )
					int alt30=3;
					switch ( input.LA(1) ) {
					case NCNAME:
						{
						alt30=1;
						}
						break;
					case INT:
						{
						alt30=2;
						}
						break;
					case DOUBLE:
						{
						alt30=3;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 30, 0, input);
						throw nvae;
					}
					switch (alt30) {
						case 1 :
							// antlr/Plexil.g:517:33: variable
							{
							pushFollow(FOLLOW_variable_in_waitBuiltin2604);
							variable122=variable();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, variable122.getTree());

							}
							break;
						case 2 :
							// antlr/Plexil.g:517:42: INT
							{
							INT123=(Token)match(input,INT,FOLLOW_INT_in_waitBuiltin2606); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							INT123_tree = (PlexilTreeNode)adaptor.create(INT123);
							adaptor.addChild(root_0, INT123_tree);
							}

							}
							break;
						case 3 :
							// antlr/Plexil.g:517:46: DOUBLE
							{
							DOUBLE124=(Token)match(input,DOUBLE,FOLLOW_DOUBLE_in_waitBuiltin2608); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							DOUBLE124_tree = (PlexilTreeNode)adaptor.create(DOUBLE124);
							adaptor.addChild(root_0, DOUBLE124_tree);
							}

							}
							break;

					}

					}
					break;

			}

			SEMICOLON125=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_waitBuiltin2613); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { m_paraphrases.pop(); }
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "waitBuiltin"


	public static class block_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "block"
	// antlr/Plexil.g:523:1: block : (variant= sequenceVariantKywd LBRACE -> $variant| LBRACE -> BLOCK ) ( comment )? ( nodeDeclaration )* ( nodeAttribute )* ( action )* RBRACE -> ^( $block ( comment )? ( nodeDeclaration )* ( nodeAttribute )* ( action )* ) ;
	public final PlexilParser.block_return block() throws RecognitionException {
		PlexilParser.block_return retval = new PlexilParser.block_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token LBRACE126=null;
		Token LBRACE127=null;
		Token RBRACE132=null;
		ParserRuleReturnScope variant =null;
		ParserRuleReturnScope comment128 =null;
		ParserRuleReturnScope nodeDeclaration129 =null;
		ParserRuleReturnScope nodeAttribute130 =null;
		ParserRuleReturnScope action131 =null;

		PlexilTreeNode LBRACE126_tree=null;
		PlexilTreeNode LBRACE127_tree=null;
		PlexilTreeNode RBRACE132_tree=null;
		RewriteRuleTokenStream stream_RBRACE=new RewriteRuleTokenStream(adaptor,"token RBRACE");
		RewriteRuleTokenStream stream_LBRACE=new RewriteRuleTokenStream(adaptor,"token LBRACE");
		RewriteRuleSubtreeStream stream_nodeAttribute=new RewriteRuleSubtreeStream(adaptor,"rule nodeAttribute");
		RewriteRuleSubtreeStream stream_action=new RewriteRuleSubtreeStream(adaptor,"rule action");
		RewriteRuleSubtreeStream stream_comment=new RewriteRuleSubtreeStream(adaptor,"rule comment");
		RewriteRuleSubtreeStream stream_sequenceVariantKywd=new RewriteRuleSubtreeStream(adaptor,"rule sequenceVariantKywd");
		RewriteRuleSubtreeStream stream_nodeDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule nodeDeclaration");

		 m_paraphrases.push("in block"); 
		try {
			// antlr/Plexil.g:526:2: ( (variant= sequenceVariantKywd LBRACE -> $variant| LBRACE -> BLOCK ) ( comment )? ( nodeDeclaration )* ( nodeAttribute )* ( action )* RBRACE -> ^( $block ( comment )? ( nodeDeclaration )* ( nodeAttribute )* ( action )* ) )
			// antlr/Plexil.g:527:5: (variant= sequenceVariantKywd LBRACE -> $variant| LBRACE -> BLOCK ) ( comment )? ( nodeDeclaration )* ( nodeAttribute )* ( action )* RBRACE
			{
			// antlr/Plexil.g:527:5: (variant= sequenceVariantKywd LBRACE -> $variant| LBRACE -> BLOCK )
			int alt32=2;
			int LA32_0 = input.LA(1);
			if ( (LA32_0==CONCURRENCE_KYWD||LA32_0==SEQUENCE_KYWD||(LA32_0 >= TRY_KYWD && LA32_0 <= UNCHECKED_SEQUENCE_KYWD)) ) {
				alt32=1;
			}
			else if ( (LA32_0==LBRACE) ) {
				alt32=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 32, 0, input);
				throw nvae;
			}

			switch (alt32) {
				case 1 :
					// antlr/Plexil.g:527:6: variant= sequenceVariantKywd LBRACE
					{
					pushFollow(FOLLOW_sequenceVariantKywd_in_block2646);
					variant=sequenceVariantKywd();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_sequenceVariantKywd.add(variant.getTree());
					LBRACE126=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_block2648); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE126);

					// AST REWRITE
					// elements: variant
					// token labels: 
					// rule labels: variant, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_variant=new RewriteRuleSubtreeStream(adaptor,"rule variant",variant!=null?variant.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 527:41: -> $variant
					{
						adaptor.addChild(root_0, stream_variant.nextTree());
					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// antlr/Plexil.g:528:8: LBRACE
					{
					LBRACE127=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_block2662); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LBRACE.add(LBRACE127);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 528:15: -> BLOCK
					{
						adaptor.addChild(root_0, (PlexilTreeNode)adaptor.create(BLOCK, "BLOCK"));
					}


					retval.tree = root_0;
					}

					}
					break;

			}

			// antlr/Plexil.g:529:5: ( comment )?
			int alt33=2;
			int LA33_0 = input.LA(1);
			if ( (LA33_0==COMMENT_KYWD) ) {
				alt33=1;
			}
			switch (alt33) {
				case 1 :
					// antlr/Plexil.g:529:5: comment
					{
					pushFollow(FOLLOW_comment_in_block2673);
					comment128=comment();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_comment.add(comment128.getTree());
					}
					break;

			}

			// antlr/Plexil.g:530:5: ( nodeDeclaration )*
			loop34:
			while (true) {
				int alt34=2;
				int LA34_0 = input.LA(1);
				if ( (LA34_0==BOOLEAN_KYWD||LA34_0==DATE_KYWD||LA34_0==DURATION_KYWD||LA34_0==INTEGER_KYWD||(LA34_0 >= IN_KYWD && LA34_0 <= IN_OUT_KYWD)||LA34_0==REAL_KYWD||LA34_0==STRING_KYWD) ) {
					alt34=1;
				}

				switch (alt34) {
				case 1 :
					// antlr/Plexil.g:530:5: nodeDeclaration
					{
					pushFollow(FOLLOW_nodeDeclaration_in_block2680);
					nodeDeclaration129=nodeDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_nodeDeclaration.add(nodeDeclaration129.getTree());
					}
					break;

				default :
					break loop34;
				}
			}

			// antlr/Plexil.g:531:5: ( nodeAttribute )*
			loop35:
			while (true) {
				int alt35=2;
				int LA35_0 = input.LA(1);
				if ( (LA35_0==END_CONDITION_KYWD||LA35_0==EXIT_CONDITION_KYWD||LA35_0==INVARIANT_CONDITION_KYWD||LA35_0==POST_CONDITION_KYWD||(LA35_0 >= PRE_CONDITION_KYWD && LA35_0 <= PRIORITY_KYWD)||LA35_0==REPEAT_CONDITION_KYWD||LA35_0==RESOURCE_KYWD||LA35_0==SKIP_CONDITION_KYWD||LA35_0==START_CONDITION_KYWD) ) {
					alt35=1;
				}

				switch (alt35) {
				case 1 :
					// antlr/Plexil.g:531:5: nodeAttribute
					{
					pushFollow(FOLLOW_nodeAttribute_in_block2687);
					nodeAttribute130=nodeAttribute();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_nodeAttribute.add(nodeAttribute130.getTree());
					}
					break;

				default :
					break loop35;
				}
			}

			// antlr/Plexil.g:532:5: ( action )*
			loop36:
			while (true) {
				int alt36=2;
				int LA36_0 = input.LA(1);
				if ( (LA36_0==CONCURRENCE_KYWD||LA36_0==FOR_KYWD||LA36_0==IF_KYWD||LA36_0==LBRACE||LA36_0==LIBRARY_CALL_KYWD||LA36_0==LPAREN||LA36_0==NCNAME||(LA36_0 >= ON_COMMAND_KYWD && LA36_0 <= ON_MESSAGE_KYWD)||LA36_0==REQUEST_KYWD||LA36_0==SEQUENCE_KYWD||LA36_0==SYNCHRONOUS_COMMAND_KYWD||(LA36_0 >= TRY_KYWD && LA36_0 <= UPDATE_KYWD)||(LA36_0 >= WAIT_KYWD && LA36_0 <= WHILE_KYWD)) ) {
					alt36=1;
				}

				switch (alt36) {
				case 1 :
					// antlr/Plexil.g:532:5: action
					{
					pushFollow(FOLLOW_action_in_block2694);
					action131=action();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_action.add(action131.getTree());
					}
					break;

				default :
					break loop36;
				}
			}

			RBRACE132=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_block2701); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RBRACE.add(RBRACE132);

			// AST REWRITE
			// elements: comment, nodeAttribute, action, block, nodeDeclaration
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (PlexilTreeNode)adaptor.nil();
			// 534:2: -> ^( $block ( comment )? ( nodeDeclaration )* ( nodeAttribute )* ( action )* )
			{
				// antlr/Plexil.g:534:5: ^( $block ( comment )? ( nodeDeclaration )* ( nodeAttribute )* ( action )* )
				{
				PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
				root_1 = (PlexilTreeNode)adaptor.becomeRoot(stream_retval.nextNode(), root_1);
				// antlr/Plexil.g:534:14: ( comment )?
				if ( stream_comment.hasNext() ) {
					adaptor.addChild(root_1, stream_comment.nextTree());
				}
				stream_comment.reset();

				// antlr/Plexil.g:534:23: ( nodeDeclaration )*
				while ( stream_nodeDeclaration.hasNext() ) {
					adaptor.addChild(root_1, stream_nodeDeclaration.nextTree());
				}
				stream_nodeDeclaration.reset();

				// antlr/Plexil.g:534:40: ( nodeAttribute )*
				while ( stream_nodeAttribute.hasNext() ) {
					adaptor.addChild(root_1, stream_nodeAttribute.nextTree());
				}
				stream_nodeAttribute.reset();

				// antlr/Plexil.g:534:55: ( action )*
				while ( stream_action.hasNext() ) {
					adaptor.addChild(root_1, stream_action.nextTree());
				}
				stream_action.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { m_paraphrases.pop(); }
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "block"


	public static class sequenceVariantKywd_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "sequenceVariantKywd"
	// antlr/Plexil.g:537:1: sequenceVariantKywd : ( CONCURRENCE_KYWD | SEQUENCE_KYWD | UNCHECKED_SEQUENCE_KYWD | TRY_KYWD );
	public final PlexilParser.sequenceVariantKywd_return sequenceVariantKywd() throws RecognitionException {
		PlexilParser.sequenceVariantKywd_return retval = new PlexilParser.sequenceVariantKywd_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token set133=null;

		PlexilTreeNode set133_tree=null;

		try {
			// antlr/Plexil.g:537:21: ( CONCURRENCE_KYWD | SEQUENCE_KYWD | UNCHECKED_SEQUENCE_KYWD | TRY_KYWD )
			// antlr/Plexil.g:
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			set133=input.LT(1);
			if ( input.LA(1)==CONCURRENCE_KYWD||input.LA(1)==SEQUENCE_KYWD||(input.LA(1) >= TRY_KYWD && input.LA(1) <= UNCHECKED_SEQUENCE_KYWD) ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (PlexilTreeNode)adaptor.create(set133));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "sequenceVariantKywd"


	public static class comment_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "comment"
	// antlr/Plexil.g:544:1: comment : COMMENT_KYWD ^ STRING SEMICOLON !;
	public final PlexilParser.comment_return comment() throws RecognitionException {
		PlexilParser.comment_return retval = new PlexilParser.comment_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token COMMENT_KYWD134=null;
		Token STRING135=null;
		Token SEMICOLON136=null;

		PlexilTreeNode COMMENT_KYWD134_tree=null;
		PlexilTreeNode STRING135_tree=null;
		PlexilTreeNode SEMICOLON136_tree=null;

		try {
			// antlr/Plexil.g:544:9: ( COMMENT_KYWD ^ STRING SEMICOLON !)
			// antlr/Plexil.g:544:11: COMMENT_KYWD ^ STRING SEMICOLON !
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			COMMENT_KYWD134=(Token)match(input,COMMENT_KYWD,FOLLOW_COMMENT_KYWD_in_comment2763); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			COMMENT_KYWD134_tree = (PlexilTreeNode)adaptor.create(COMMENT_KYWD134);
			root_0 = (PlexilTreeNode)adaptor.becomeRoot(COMMENT_KYWD134_tree, root_0);
			}

			STRING135=(Token)match(input,STRING,FOLLOW_STRING_in_comment2766); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			STRING135_tree = (PlexilTreeNode)adaptor.create(STRING135);
			adaptor.addChild(root_0, STRING135_tree);
			}

			SEMICOLON136=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_comment2768); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "comment"


	public static class nodeDeclaration_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "nodeDeclaration"
	// antlr/Plexil.g:546:1: nodeDeclaration : ( interfaceDeclaration | variableDeclaration );
	public final PlexilParser.nodeDeclaration_return nodeDeclaration() throws RecognitionException {
		PlexilParser.nodeDeclaration_return retval = new PlexilParser.nodeDeclaration_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		ParserRuleReturnScope interfaceDeclaration137 =null;
		ParserRuleReturnScope variableDeclaration138 =null;


		try {
			// antlr/Plexil.g:546:17: ( interfaceDeclaration | variableDeclaration )
			int alt37=2;
			int LA37_0 = input.LA(1);
			if ( ((LA37_0 >= IN_KYWD && LA37_0 <= IN_OUT_KYWD)) ) {
				alt37=1;
			}
			else if ( (LA37_0==BOOLEAN_KYWD||LA37_0==DATE_KYWD||LA37_0==DURATION_KYWD||LA37_0==INTEGER_KYWD||LA37_0==REAL_KYWD||LA37_0==STRING_KYWD) ) {
				alt37=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 37, 0, input);
				throw nvae;
			}

			switch (alt37) {
				case 1 :
					// antlr/Plexil.g:547:5: interfaceDeclaration
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_interfaceDeclaration_in_nodeDeclaration2782);
					interfaceDeclaration137=interfaceDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceDeclaration137.getTree());

					}
					break;
				case 2 :
					// antlr/Plexil.g:548:5: variableDeclaration
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_variableDeclaration_in_nodeDeclaration2788);
					variableDeclaration138=variableDeclaration();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variableDeclaration138.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "nodeDeclaration"


	public static class nodeAttribute_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "nodeAttribute"
	// antlr/Plexil.g:550:1: nodeAttribute : ( nodeCondition | priority | resource );
	public final PlexilParser.nodeAttribute_return nodeAttribute() throws RecognitionException {
		PlexilParser.nodeAttribute_return retval = new PlexilParser.nodeAttribute_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		ParserRuleReturnScope nodeCondition139 =null;
		ParserRuleReturnScope priority140 =null;
		ParserRuleReturnScope resource141 =null;


		try {
			// antlr/Plexil.g:550:15: ( nodeCondition | priority | resource )
			int alt38=3;
			switch ( input.LA(1) ) {
			case END_CONDITION_KYWD:
			case EXIT_CONDITION_KYWD:
			case INVARIANT_CONDITION_KYWD:
			case POST_CONDITION_KYWD:
			case PRE_CONDITION_KYWD:
			case REPEAT_CONDITION_KYWD:
			case SKIP_CONDITION_KYWD:
			case START_CONDITION_KYWD:
				{
				alt38=1;
				}
				break;
			case PRIORITY_KYWD:
				{
				alt38=2;
				}
				break;
			case RESOURCE_KYWD:
				{
				alt38=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 38, 0, input);
				throw nvae;
			}
			switch (alt38) {
				case 1 :
					// antlr/Plexil.g:551:5: nodeCondition
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_nodeCondition_in_nodeAttribute2800);
					nodeCondition139=nodeCondition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, nodeCondition139.getTree());

					}
					break;
				case 2 :
					// antlr/Plexil.g:552:5: priority
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_priority_in_nodeAttribute2806);
					priority140=priority();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, priority140.getTree());

					}
					break;
				case 3 :
					// antlr/Plexil.g:553:5: resource
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_resource_in_nodeAttribute2812);
					resource141=resource();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, resource141.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "nodeAttribute"


	public static class nodeCondition_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "nodeCondition"
	// antlr/Plexil.g:555:1: nodeCondition : conditionKywd ^ expression SEMICOLON !;
	public final PlexilParser.nodeCondition_return nodeCondition() throws RecognitionException {
		PlexilParser.nodeCondition_return retval = new PlexilParser.nodeCondition_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token SEMICOLON144=null;
		ParserRuleReturnScope conditionKywd142 =null;
		ParserRuleReturnScope expression143 =null;

		PlexilTreeNode SEMICOLON144_tree=null;

		 m_paraphrases.push("in condition"); 
		try {
			// antlr/Plexil.g:558:2: ( conditionKywd ^ expression SEMICOLON !)
			// antlr/Plexil.g:559:5: conditionKywd ^ expression SEMICOLON !
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			pushFollow(FOLLOW_conditionKywd_in_nodeCondition2836);
			conditionKywd142=conditionKywd();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) root_0 = (PlexilTreeNode)adaptor.becomeRoot(conditionKywd142.getTree(), root_0);
			pushFollow(FOLLOW_expression_in_nodeCondition2839);
			expression143=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression143.getTree());

			SEMICOLON144=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_nodeCondition2841); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { m_paraphrases.pop(); }
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "nodeCondition"


	public static class conditionKywd_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "conditionKywd"
	// antlr/Plexil.g:561:1: conditionKywd : ( END_CONDITION_KYWD | EXIT_CONDITION_KYWD | INVARIANT_CONDITION_KYWD | POST_CONDITION_KYWD | PRE_CONDITION_KYWD | REPEAT_CONDITION_KYWD | SKIP_CONDITION_KYWD | START_CONDITION_KYWD );
	public final PlexilParser.conditionKywd_return conditionKywd() throws RecognitionException {
		PlexilParser.conditionKywd_return retval = new PlexilParser.conditionKywd_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token set145=null;

		PlexilTreeNode set145_tree=null;

		try {
			// antlr/Plexil.g:561:15: ( END_CONDITION_KYWD | EXIT_CONDITION_KYWD | INVARIANT_CONDITION_KYWD | POST_CONDITION_KYWD | PRE_CONDITION_KYWD | REPEAT_CONDITION_KYWD | SKIP_CONDITION_KYWD | START_CONDITION_KYWD )
			// antlr/Plexil.g:
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			set145=input.LT(1);
			if ( input.LA(1)==END_CONDITION_KYWD||input.LA(1)==EXIT_CONDITION_KYWD||input.LA(1)==INVARIANT_CONDITION_KYWD||input.LA(1)==POST_CONDITION_KYWD||input.LA(1)==PRE_CONDITION_KYWD||input.LA(1)==REPEAT_CONDITION_KYWD||input.LA(1)==SKIP_CONDITION_KYWD||input.LA(1)==START_CONDITION_KYWD ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (PlexilTreeNode)adaptor.create(set145));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "conditionKywd"


	public static class resource_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "resource"
	// antlr/Plexil.g:572:1: resource : RESOURCE_KYWD ^ NAME_KYWD ! EQUALS ! expression ( COMMA ! ( LOWER_BOUND_KYWD EQUALS ! expression | UPPER_BOUND_KYWD EQUALS ! expression | RELEASE_AT_TERM_KYWD EQUALS ! expression | PRIORITY_KYWD EQUALS !pe= expression ) )* SEMICOLON !;
	public final PlexilParser.resource_return resource() throws RecognitionException {
		PlexilParser.resource_return retval = new PlexilParser.resource_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token RESOURCE_KYWD146=null;
		Token NAME_KYWD147=null;
		Token EQUALS148=null;
		Token COMMA150=null;
		Token LOWER_BOUND_KYWD151=null;
		Token EQUALS152=null;
		Token UPPER_BOUND_KYWD154=null;
		Token EQUALS155=null;
		Token RELEASE_AT_TERM_KYWD157=null;
		Token EQUALS158=null;
		Token PRIORITY_KYWD160=null;
		Token EQUALS161=null;
		Token SEMICOLON162=null;
		ParserRuleReturnScope pe =null;
		ParserRuleReturnScope expression149 =null;
		ParserRuleReturnScope expression153 =null;
		ParserRuleReturnScope expression156 =null;
		ParserRuleReturnScope expression159 =null;

		PlexilTreeNode RESOURCE_KYWD146_tree=null;
		PlexilTreeNode NAME_KYWD147_tree=null;
		PlexilTreeNode EQUALS148_tree=null;
		PlexilTreeNode COMMA150_tree=null;
		PlexilTreeNode LOWER_BOUND_KYWD151_tree=null;
		PlexilTreeNode EQUALS152_tree=null;
		PlexilTreeNode UPPER_BOUND_KYWD154_tree=null;
		PlexilTreeNode EQUALS155_tree=null;
		PlexilTreeNode RELEASE_AT_TERM_KYWD157_tree=null;
		PlexilTreeNode EQUALS158_tree=null;
		PlexilTreeNode PRIORITY_KYWD160_tree=null;
		PlexilTreeNode EQUALS161_tree=null;
		PlexilTreeNode SEMICOLON162_tree=null;

		 m_paraphrases.push("in resource"); 
		try {
			// antlr/Plexil.g:575:2: ( RESOURCE_KYWD ^ NAME_KYWD ! EQUALS ! expression ( COMMA ! ( LOWER_BOUND_KYWD EQUALS ! expression | UPPER_BOUND_KYWD EQUALS ! expression | RELEASE_AT_TERM_KYWD EQUALS ! expression | PRIORITY_KYWD EQUALS !pe= expression ) )* SEMICOLON !)
			// antlr/Plexil.g:576:5: RESOURCE_KYWD ^ NAME_KYWD ! EQUALS ! expression ( COMMA ! ( LOWER_BOUND_KYWD EQUALS ! expression | UPPER_BOUND_KYWD EQUALS ! expression | RELEASE_AT_TERM_KYWD EQUALS ! expression | PRIORITY_KYWD EQUALS !pe= expression ) )* SEMICOLON !
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			RESOURCE_KYWD146=(Token)match(input,RESOURCE_KYWD,FOLLOW_RESOURCE_KYWD_in_resource2922); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			RESOURCE_KYWD146_tree = (PlexilTreeNode)adaptor.create(RESOURCE_KYWD146);
			root_0 = (PlexilTreeNode)adaptor.becomeRoot(RESOURCE_KYWD146_tree, root_0);
			}

			NAME_KYWD147=(Token)match(input,NAME_KYWD,FOLLOW_NAME_KYWD_in_resource2925); if (state.failed) return retval;
			EQUALS148=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_resource2928); if (state.failed) return retval;
			pushFollow(FOLLOW_expression_in_resource2931);
			expression149=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression149.getTree());

			// antlr/Plexil.g:577:9: ( COMMA ! ( LOWER_BOUND_KYWD EQUALS ! expression | UPPER_BOUND_KYWD EQUALS ! expression | RELEASE_AT_TERM_KYWD EQUALS ! expression | PRIORITY_KYWD EQUALS !pe= expression ) )*
			loop40:
			while (true) {
				int alt40=2;
				int LA40_0 = input.LA(1);
				if ( (LA40_0==COMMA) ) {
					alt40=1;
				}

				switch (alt40) {
				case 1 :
					// antlr/Plexil.g:577:11: COMMA ! ( LOWER_BOUND_KYWD EQUALS ! expression | UPPER_BOUND_KYWD EQUALS ! expression | RELEASE_AT_TERM_KYWD EQUALS ! expression | PRIORITY_KYWD EQUALS !pe= expression )
					{
					COMMA150=(Token)match(input,COMMA,FOLLOW_COMMA_in_resource2943); if (state.failed) return retval;
					// antlr/Plexil.g:578:11: ( LOWER_BOUND_KYWD EQUALS ! expression | UPPER_BOUND_KYWD EQUALS ! expression | RELEASE_AT_TERM_KYWD EQUALS ! expression | PRIORITY_KYWD EQUALS !pe= expression )
					int alt39=4;
					switch ( input.LA(1) ) {
					case LOWER_BOUND_KYWD:
						{
						alt39=1;
						}
						break;
					case UPPER_BOUND_KYWD:
						{
						alt39=2;
						}
						break;
					case RELEASE_AT_TERM_KYWD:
						{
						alt39=3;
						}
						break;
					case PRIORITY_KYWD:
						{
						alt39=4;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 39, 0, input);
						throw nvae;
					}
					switch (alt39) {
						case 1 :
							// antlr/Plexil.g:578:13: LOWER_BOUND_KYWD EQUALS ! expression
							{
							LOWER_BOUND_KYWD151=(Token)match(input,LOWER_BOUND_KYWD,FOLLOW_LOWER_BOUND_KYWD_in_resource2958); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							LOWER_BOUND_KYWD151_tree = (PlexilTreeNode)adaptor.create(LOWER_BOUND_KYWD151);
							adaptor.addChild(root_0, LOWER_BOUND_KYWD151_tree);
							}

							EQUALS152=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_resource2960); if (state.failed) return retval;
							pushFollow(FOLLOW_expression_in_resource2963);
							expression153=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, expression153.getTree());

							}
							break;
						case 2 :
							// antlr/Plexil.g:579:13: UPPER_BOUND_KYWD EQUALS ! expression
							{
							UPPER_BOUND_KYWD154=(Token)match(input,UPPER_BOUND_KYWD,FOLLOW_UPPER_BOUND_KYWD_in_resource2977); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							UPPER_BOUND_KYWD154_tree = (PlexilTreeNode)adaptor.create(UPPER_BOUND_KYWD154);
							adaptor.addChild(root_0, UPPER_BOUND_KYWD154_tree);
							}

							EQUALS155=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_resource2979); if (state.failed) return retval;
							pushFollow(FOLLOW_expression_in_resource2982);
							expression156=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, expression156.getTree());

							}
							break;
						case 3 :
							// antlr/Plexil.g:580:9: RELEASE_AT_TERM_KYWD EQUALS ! expression
							{
							RELEASE_AT_TERM_KYWD157=(Token)match(input,RELEASE_AT_TERM_KYWD,FOLLOW_RELEASE_AT_TERM_KYWD_in_resource2992); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							RELEASE_AT_TERM_KYWD157_tree = (PlexilTreeNode)adaptor.create(RELEASE_AT_TERM_KYWD157);
							adaptor.addChild(root_0, RELEASE_AT_TERM_KYWD157_tree);
							}

							EQUALS158=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_resource2994); if (state.failed) return retval;
							pushFollow(FOLLOW_expression_in_resource2997);
							expression159=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, expression159.getTree());

							}
							break;
						case 4 :
							// antlr/Plexil.g:581:8: PRIORITY_KYWD EQUALS !pe= expression
							{
							PRIORITY_KYWD160=(Token)match(input,PRIORITY_KYWD,FOLLOW_PRIORITY_KYWD_in_resource3006); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							PRIORITY_KYWD160_tree = (PlexilTreeNode)adaptor.create(PRIORITY_KYWD160);
							adaptor.addChild(root_0, PRIORITY_KYWD160_tree);
							}

							EQUALS161=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_resource3008); if (state.failed) return retval;
							pushFollow(FOLLOW_expression_in_resource3013);
							pe=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, pe.getTree());

							}
							break;

					}

					}
					break;

				default :
					break loop40;
				}
			}

			SEMICOLON162=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_resource3046); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { m_paraphrases.pop(); }
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "resource"


	public static class priority_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "priority"
	// antlr/Plexil.g:587:1: priority : PRIORITY_KYWD ^ INT SEMICOLON !;
	public final PlexilParser.priority_return priority() throws RecognitionException {
		PlexilParser.priority_return retval = new PlexilParser.priority_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token PRIORITY_KYWD163=null;
		Token INT164=null;
		Token SEMICOLON165=null;

		PlexilTreeNode PRIORITY_KYWD163_tree=null;
		PlexilTreeNode INT164_tree=null;
		PlexilTreeNode SEMICOLON165_tree=null;

		 m_paraphrases.push("in priority"); 
		try {
			// antlr/Plexil.g:590:2: ( PRIORITY_KYWD ^ INT SEMICOLON !)
			// antlr/Plexil.g:590:4: PRIORITY_KYWD ^ INT SEMICOLON !
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			PRIORITY_KYWD163=(Token)match(input,PRIORITY_KYWD,FOLLOW_PRIORITY_KYWD_in_priority3068); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			PRIORITY_KYWD163_tree = new PriorityNode(PRIORITY_KYWD163) ;
			root_0 = (PlexilTreeNode)adaptor.becomeRoot(PRIORITY_KYWD163_tree, root_0);
			}

			INT164=(Token)match(input,INT,FOLLOW_INT_in_priority3074); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			INT164_tree = (PlexilTreeNode)adaptor.create(INT164);
			adaptor.addChild(root_0, INT164_tree);
			}

			SEMICOLON165=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_priority3076); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { m_paraphrases.pop(); }
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "priority"


	public static class interfaceDeclaration_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "interfaceDeclaration"
	// antlr/Plexil.g:592:1: interfaceDeclaration : ( in | inOut );
	public final PlexilParser.interfaceDeclaration_return interfaceDeclaration() throws RecognitionException {
		PlexilParser.interfaceDeclaration_return retval = new PlexilParser.interfaceDeclaration_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		ParserRuleReturnScope in166 =null;
		ParserRuleReturnScope inOut167 =null;


		try {
			// antlr/Plexil.g:592:22: ( in | inOut )
			int alt41=2;
			int LA41_0 = input.LA(1);
			if ( (LA41_0==IN_KYWD) ) {
				alt41=1;
			}
			else if ( (LA41_0==IN_OUT_KYWD) ) {
				alt41=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 41, 0, input);
				throw nvae;
			}

			switch (alt41) {
				case 1 :
					// antlr/Plexil.g:592:24: in
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_in_in_interfaceDeclaration3086);
					in166=in();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, in166.getTree());

					}
					break;
				case 2 :
					// antlr/Plexil.g:592:29: inOut
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_inOut_in_interfaceDeclaration3090);
					inOut167=inOut();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, inOut167.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "interfaceDeclaration"


	public static class in_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "in"
	// antlr/Plexil.g:598:1: in : IN_KYWD ^ ( ( NCNAME ( COMMA ! NCNAME )* ) | interfaceDeclarations ) SEMICOLON !;
	public final PlexilParser.in_return in() throws RecognitionException {
		PlexilParser.in_return retval = new PlexilParser.in_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token IN_KYWD168=null;
		Token NCNAME169=null;
		Token COMMA170=null;
		Token NCNAME171=null;
		Token SEMICOLON173=null;
		ParserRuleReturnScope interfaceDeclarations172 =null;

		PlexilTreeNode IN_KYWD168_tree=null;
		PlexilTreeNode NCNAME169_tree=null;
		PlexilTreeNode COMMA170_tree=null;
		PlexilTreeNode NCNAME171_tree=null;
		PlexilTreeNode SEMICOLON173_tree=null;

		 m_paraphrases.push("in \"In\" declaration"); 
		try {
			// antlr/Plexil.g:601:2: ( IN_KYWD ^ ( ( NCNAME ( COMMA ! NCNAME )* ) | interfaceDeclarations ) SEMICOLON !)
			// antlr/Plexil.g:602:5: IN_KYWD ^ ( ( NCNAME ( COMMA ! NCNAME )* ) | interfaceDeclarations ) SEMICOLON !
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			IN_KYWD168=(Token)match(input,IN_KYWD,FOLLOW_IN_KYWD_in_in3119); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IN_KYWD168_tree = (PlexilTreeNode)adaptor.create(IN_KYWD168);
			root_0 = (PlexilTreeNode)adaptor.becomeRoot(IN_KYWD168_tree, root_0);
			}

			// antlr/Plexil.g:603:7: ( ( NCNAME ( COMMA ! NCNAME )* ) | interfaceDeclarations )
			int alt43=2;
			int LA43_0 = input.LA(1);
			if ( (LA43_0==NCNAME) ) {
				alt43=1;
			}
			else if ( (LA43_0==BOOLEAN_KYWD||LA43_0==DATE_KYWD||LA43_0==DURATION_KYWD||LA43_0==INTEGER_KYWD||LA43_0==REAL_KYWD||LA43_0==STRING_KYWD) ) {
				alt43=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 43, 0, input);
				throw nvae;
			}

			switch (alt43) {
				case 1 :
					// antlr/Plexil.g:603:9: ( NCNAME ( COMMA ! NCNAME )* )
					{
					// antlr/Plexil.g:603:9: ( NCNAME ( COMMA ! NCNAME )* )
					// antlr/Plexil.g:603:10: NCNAME ( COMMA ! NCNAME )*
					{
					NCNAME169=(Token)match(input,NCNAME,FOLLOW_NCNAME_in_in3132); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NCNAME169_tree = (PlexilTreeNode)adaptor.create(NCNAME169);
					adaptor.addChild(root_0, NCNAME169_tree);
					}

					// antlr/Plexil.g:603:17: ( COMMA ! NCNAME )*
					loop42:
					while (true) {
						int alt42=2;
						int LA42_0 = input.LA(1);
						if ( (LA42_0==COMMA) ) {
							alt42=1;
						}

						switch (alt42) {
						case 1 :
							// antlr/Plexil.g:603:18: COMMA ! NCNAME
							{
							COMMA170=(Token)match(input,COMMA,FOLLOW_COMMA_in_in3135); if (state.failed) return retval;
							NCNAME171=(Token)match(input,NCNAME,FOLLOW_NCNAME_in_in3138); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							NCNAME171_tree = (PlexilTreeNode)adaptor.create(NCNAME171);
							adaptor.addChild(root_0, NCNAME171_tree);
							}

							}
							break;

						default :
							break loop42;
						}
					}

					}

					}
					break;
				case 2 :
					// antlr/Plexil.g:604:6: interfaceDeclarations
					{
					pushFollow(FOLLOW_interfaceDeclarations_in_in3148);
					interfaceDeclarations172=interfaceDeclarations();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceDeclarations172.getTree());

					}
					break;

			}

			SEMICOLON173=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_in3163); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { m_paraphrases.pop(); }
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "in"


	public static class inOut_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "inOut"
	// antlr/Plexil.g:609:1: inOut : IN_OUT_KYWD ^ ( ( NCNAME ( COMMA ! NCNAME )* ) | interfaceDeclarations ) SEMICOLON !;
	public final PlexilParser.inOut_return inOut() throws RecognitionException {
		PlexilParser.inOut_return retval = new PlexilParser.inOut_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token IN_OUT_KYWD174=null;
		Token NCNAME175=null;
		Token COMMA176=null;
		Token NCNAME177=null;
		Token SEMICOLON179=null;
		ParserRuleReturnScope interfaceDeclarations178 =null;

		PlexilTreeNode IN_OUT_KYWD174_tree=null;
		PlexilTreeNode NCNAME175_tree=null;
		PlexilTreeNode COMMA176_tree=null;
		PlexilTreeNode NCNAME177_tree=null;
		PlexilTreeNode SEMICOLON179_tree=null;

		 m_paraphrases.push("in \"InOut\" declaration"); 
		try {
			// antlr/Plexil.g:612:2: ( IN_OUT_KYWD ^ ( ( NCNAME ( COMMA ! NCNAME )* ) | interfaceDeclarations ) SEMICOLON !)
			// antlr/Plexil.g:613:5: IN_OUT_KYWD ^ ( ( NCNAME ( COMMA ! NCNAME )* ) | interfaceDeclarations ) SEMICOLON !
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			IN_OUT_KYWD174=(Token)match(input,IN_OUT_KYWD,FOLLOW_IN_OUT_KYWD_in_inOut3190); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IN_OUT_KYWD174_tree = (PlexilTreeNode)adaptor.create(IN_OUT_KYWD174);
			root_0 = (PlexilTreeNode)adaptor.becomeRoot(IN_OUT_KYWD174_tree, root_0);
			}

			// antlr/Plexil.g:614:7: ( ( NCNAME ( COMMA ! NCNAME )* ) | interfaceDeclarations )
			int alt45=2;
			int LA45_0 = input.LA(1);
			if ( (LA45_0==NCNAME) ) {
				alt45=1;
			}
			else if ( (LA45_0==BOOLEAN_KYWD||LA45_0==DATE_KYWD||LA45_0==DURATION_KYWD||LA45_0==INTEGER_KYWD||LA45_0==REAL_KYWD||LA45_0==STRING_KYWD) ) {
				alt45=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 45, 0, input);
				throw nvae;
			}

			switch (alt45) {
				case 1 :
					// antlr/Plexil.g:614:9: ( NCNAME ( COMMA ! NCNAME )* )
					{
					// antlr/Plexil.g:614:9: ( NCNAME ( COMMA ! NCNAME )* )
					// antlr/Plexil.g:614:10: NCNAME ( COMMA ! NCNAME )*
					{
					NCNAME175=(Token)match(input,NCNAME,FOLLOW_NCNAME_in_inOut3202); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NCNAME175_tree = (PlexilTreeNode)adaptor.create(NCNAME175);
					adaptor.addChild(root_0, NCNAME175_tree);
					}

					// antlr/Plexil.g:614:17: ( COMMA ! NCNAME )*
					loop44:
					while (true) {
						int alt44=2;
						int LA44_0 = input.LA(1);
						if ( (LA44_0==COMMA) ) {
							alt44=1;
						}

						switch (alt44) {
						case 1 :
							// antlr/Plexil.g:614:18: COMMA ! NCNAME
							{
							COMMA176=(Token)match(input,COMMA,FOLLOW_COMMA_in_inOut3205); if (state.failed) return retval;
							NCNAME177=(Token)match(input,NCNAME,FOLLOW_NCNAME_in_inOut3208); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							NCNAME177_tree = (PlexilTreeNode)adaptor.create(NCNAME177);
							adaptor.addChild(root_0, NCNAME177_tree);
							}

							}
							break;

						default :
							break loop44;
						}
					}

					}

					}
					break;
				case 2 :
					// antlr/Plexil.g:615:6: interfaceDeclarations
					{
					pushFollow(FOLLOW_interfaceDeclarations_in_inOut3218);
					interfaceDeclarations178=interfaceDeclarations();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, interfaceDeclarations178.getTree());

					}
					break;

			}

			SEMICOLON179=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_inOut3233); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { m_paraphrases.pop(); }
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "inOut"


	public static class interfaceDeclarations_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "interfaceDeclarations"
	// antlr/Plexil.g:620:1: interfaceDeclarations : tn= baseTypeName ! ( ( NCNAME LBRACKET )=> arrayVariableDecl[$tn.start] | scalarVariableDecl[$tn.start] ) ( COMMA ! ( ( NCNAME LBRACKET )=> arrayVariableDecl[$tn.start] | scalarVariableDecl[$tn.start] ) )* ;
	public final PlexilParser.interfaceDeclarations_return interfaceDeclarations() throws RecognitionException {
		PlexilParser.interfaceDeclarations_return retval = new PlexilParser.interfaceDeclarations_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token COMMA182=null;
		ParserRuleReturnScope tn =null;
		ParserRuleReturnScope arrayVariableDecl180 =null;
		ParserRuleReturnScope scalarVariableDecl181 =null;
		ParserRuleReturnScope arrayVariableDecl183 =null;
		ParserRuleReturnScope scalarVariableDecl184 =null;

		PlexilTreeNode COMMA182_tree=null;

		try {
			// antlr/Plexil.g:620:23: (tn= baseTypeName ! ( ( NCNAME LBRACKET )=> arrayVariableDecl[$tn.start] | scalarVariableDecl[$tn.start] ) ( COMMA ! ( ( NCNAME LBRACKET )=> arrayVariableDecl[$tn.start] | scalarVariableDecl[$tn.start] ) )* )
			// antlr/Plexil.g:621:5: tn= baseTypeName ! ( ( NCNAME LBRACKET )=> arrayVariableDecl[$tn.start] | scalarVariableDecl[$tn.start] ) ( COMMA ! ( ( NCNAME LBRACKET )=> arrayVariableDecl[$tn.start] | scalarVariableDecl[$tn.start] ) )*
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			pushFollow(FOLLOW_baseTypeName_in_interfaceDeclarations3251);
			tn=baseTypeName();
			state._fsp--;
			if (state.failed) return retval;
			// antlr/Plexil.g:622:5: ( ( NCNAME LBRACKET )=> arrayVariableDecl[$tn.start] | scalarVariableDecl[$tn.start] )
			int alt46=2;
			int LA46_0 = input.LA(1);
			if ( (LA46_0==NCNAME) ) {
				int LA46_1 = input.LA(2);
				if ( (LA46_1==LBRACKET) && (synpred7_Plexil())) {
					alt46=1;
				}
				else if ( (LA46_1==COMMA||LA46_1==EQUALS||LA46_1==SEMICOLON) ) {
					alt46=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 46, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 46, 0, input);
				throw nvae;
			}

			switch (alt46) {
				case 1 :
					// antlr/Plexil.g:622:7: ( NCNAME LBRACKET )=> arrayVariableDecl[$tn.start]
					{
					pushFollow(FOLLOW_arrayVariableDecl_in_interfaceDeclarations3268);
					arrayVariableDecl180=arrayVariableDecl((tn!=null?(tn.start):null));
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayVariableDecl180.getTree());

					}
					break;
				case 2 :
					// antlr/Plexil.g:623:7: scalarVariableDecl[$tn.start]
					{
					pushFollow(FOLLOW_scalarVariableDecl_in_interfaceDeclarations3278);
					scalarVariableDecl181=scalarVariableDecl((tn!=null?(tn.start):null));
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, scalarVariableDecl181.getTree());

					}
					break;

			}

			// antlr/Plexil.g:625:2: ( COMMA ! ( ( NCNAME LBRACKET )=> arrayVariableDecl[$tn.start] | scalarVariableDecl[$tn.start] ) )*
			loop48:
			while (true) {
				int alt48=2;
				int LA48_0 = input.LA(1);
				if ( (LA48_0==COMMA) ) {
					alt48=1;
				}

				switch (alt48) {
				case 1 :
					// antlr/Plexil.g:625:4: COMMA ! ( ( NCNAME LBRACKET )=> arrayVariableDecl[$tn.start] | scalarVariableDecl[$tn.start] )
					{
					COMMA182=(Token)match(input,COMMA,FOLLOW_COMMA_in_interfaceDeclarations3290); if (state.failed) return retval;
					// antlr/Plexil.g:626:7: ( ( NCNAME LBRACKET )=> arrayVariableDecl[$tn.start] | scalarVariableDecl[$tn.start] )
					int alt47=2;
					int LA47_0 = input.LA(1);
					if ( (LA47_0==NCNAME) ) {
						int LA47_1 = input.LA(2);
						if ( (LA47_1==LBRACKET) && (synpred8_Plexil())) {
							alt47=1;
						}
						else if ( (LA47_1==COMMA||LA47_1==EQUALS||LA47_1==SEMICOLON) ) {
							alt47=2;
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
							// antlr/Plexil.g:626:9: ( NCNAME LBRACKET )=> arrayVariableDecl[$tn.start]
							{
							pushFollow(FOLLOW_arrayVariableDecl_in_interfaceDeclarations3309);
							arrayVariableDecl183=arrayVariableDecl((tn!=null?(tn.start):null));
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, arrayVariableDecl183.getTree());

							}
							break;
						case 2 :
							// antlr/Plexil.g:627:9: scalarVariableDecl[$tn.start]
							{
							pushFollow(FOLLOW_scalarVariableDecl_in_interfaceDeclarations3321);
							scalarVariableDecl184=scalarVariableDecl((tn!=null?(tn.start):null));
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, scalarVariableDecl184.getTree());

							}
							break;

					}

					}
					break;

				default :
					break loop48;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "interfaceDeclarations"


	public static class variable_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "variable"
	// antlr/Plexil.g:632:1: variable : NCNAME ;
	public final PlexilParser.variable_return variable() throws RecognitionException {
		PlexilParser.variable_return retval = new PlexilParser.variable_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token NCNAME185=null;

		PlexilTreeNode NCNAME185_tree=null;

		try {
			// antlr/Plexil.g:632:10: ( NCNAME )
			// antlr/Plexil.g:632:12: NCNAME
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			NCNAME185=(Token)match(input,NCNAME,FOLLOW_NCNAME_in_variable3345); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			NCNAME185_tree = new VariableNode(NCNAME185) ;
			adaptor.addChild(root_0, NCNAME185_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "variable"


	public static class variableDeclaration_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "variableDeclaration"
	// antlr/Plexil.g:634:1: variableDeclaration : tn= baseTypeName ( ( NCNAME LBRACKET )=> arrayVariableDecl[$tn.start] | scalarVariableDecl[$tn.start] ) ( COMMA ( ( NCNAME LBRACKET )=> arrayVariableDecl[$tn.start] | scalarVariableDecl[$tn.start] ) )* SEMICOLON -> ^( VARIABLE_DECLARATIONS ( scalarVariableDecl )* ( arrayVariableDecl )* ) ;
	public final PlexilParser.variableDeclaration_return variableDeclaration() throws RecognitionException {
		PlexilParser.variableDeclaration_return retval = new PlexilParser.variableDeclaration_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token COMMA188=null;
		Token SEMICOLON191=null;
		ParserRuleReturnScope tn =null;
		ParserRuleReturnScope arrayVariableDecl186 =null;
		ParserRuleReturnScope scalarVariableDecl187 =null;
		ParserRuleReturnScope arrayVariableDecl189 =null;
		ParserRuleReturnScope scalarVariableDecl190 =null;

		PlexilTreeNode COMMA188_tree=null;
		PlexilTreeNode SEMICOLON191_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
		RewriteRuleSubtreeStream stream_arrayVariableDecl=new RewriteRuleSubtreeStream(adaptor,"rule arrayVariableDecl");
		RewriteRuleSubtreeStream stream_baseTypeName=new RewriteRuleSubtreeStream(adaptor,"rule baseTypeName");
		RewriteRuleSubtreeStream stream_scalarVariableDecl=new RewriteRuleSubtreeStream(adaptor,"rule scalarVariableDecl");

		 m_paraphrases.push("in variable declaration"); 
		try {
			// antlr/Plexil.g:637:2: (tn= baseTypeName ( ( NCNAME LBRACKET )=> arrayVariableDecl[$tn.start] | scalarVariableDecl[$tn.start] ) ( COMMA ( ( NCNAME LBRACKET )=> arrayVariableDecl[$tn.start] | scalarVariableDecl[$tn.start] ) )* SEMICOLON -> ^( VARIABLE_DECLARATIONS ( scalarVariableDecl )* ( arrayVariableDecl )* ) )
			// antlr/Plexil.g:638:5: tn= baseTypeName ( ( NCNAME LBRACKET )=> arrayVariableDecl[$tn.start] | scalarVariableDecl[$tn.start] ) ( COMMA ( ( NCNAME LBRACKET )=> arrayVariableDecl[$tn.start] | scalarVariableDecl[$tn.start] ) )* SEMICOLON
			{
			pushFollow(FOLLOW_baseTypeName_in_variableDeclaration3375);
			tn=baseTypeName();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_baseTypeName.add(tn.getTree());
			// antlr/Plexil.g:639:5: ( ( NCNAME LBRACKET )=> arrayVariableDecl[$tn.start] | scalarVariableDecl[$tn.start] )
			int alt49=2;
			int LA49_0 = input.LA(1);
			if ( (LA49_0==NCNAME) ) {
				int LA49_1 = input.LA(2);
				if ( (LA49_1==LBRACKET) && (synpred9_Plexil())) {
					alt49=1;
				}
				else if ( (LA49_1==COMMA||LA49_1==EQUALS||LA49_1==SEMICOLON) ) {
					alt49=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 49, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 49, 0, input);
				throw nvae;
			}

			switch (alt49) {
				case 1 :
					// antlr/Plexil.g:639:7: ( NCNAME LBRACKET )=> arrayVariableDecl[$tn.start]
					{
					pushFollow(FOLLOW_arrayVariableDecl_in_variableDeclaration3391);
					arrayVariableDecl186=arrayVariableDecl((tn!=null?(tn.start):null));
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_arrayVariableDecl.add(arrayVariableDecl186.getTree());
					}
					break;
				case 2 :
					// antlr/Plexil.g:640:7: scalarVariableDecl[$tn.start]
					{
					pushFollow(FOLLOW_scalarVariableDecl_in_variableDeclaration3401);
					scalarVariableDecl187=scalarVariableDecl((tn!=null?(tn.start):null));
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_scalarVariableDecl.add(scalarVariableDecl187.getTree());
					}
					break;

			}

			// antlr/Plexil.g:642:5: ( COMMA ( ( NCNAME LBRACKET )=> arrayVariableDecl[$tn.start] | scalarVariableDecl[$tn.start] ) )*
			loop51:
			while (true) {
				int alt51=2;
				int LA51_0 = input.LA(1);
				if ( (LA51_0==COMMA) ) {
					alt51=1;
				}

				switch (alt51) {
				case 1 :
					// antlr/Plexil.g:642:7: COMMA ( ( NCNAME LBRACKET )=> arrayVariableDecl[$tn.start] | scalarVariableDecl[$tn.start] )
					{
					COMMA188=(Token)match(input,COMMA,FOLLOW_COMMA_in_variableDeclaration3416); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA188);

					// antlr/Plexil.g:643:4: ( ( NCNAME LBRACKET )=> arrayVariableDecl[$tn.start] | scalarVariableDecl[$tn.start] )
					int alt50=2;
					int LA50_0 = input.LA(1);
					if ( (LA50_0==NCNAME) ) {
						int LA50_1 = input.LA(2);
						if ( (LA50_1==LBRACKET) && (synpred10_Plexil())) {
							alt50=1;
						}
						else if ( (LA50_1==COMMA||LA50_1==EQUALS||LA50_1==SEMICOLON) ) {
							alt50=2;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 50, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 50, 0, input);
						throw nvae;
					}

					switch (alt50) {
						case 1 :
							// antlr/Plexil.g:643:6: ( NCNAME LBRACKET )=> arrayVariableDecl[$tn.start]
							{
							pushFollow(FOLLOW_arrayVariableDecl_in_variableDeclaration3432);
							arrayVariableDecl189=arrayVariableDecl((tn!=null?(tn.start):null));
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_arrayVariableDecl.add(arrayVariableDecl189.getTree());
							}
							break;
						case 2 :
							// antlr/Plexil.g:644:6: scalarVariableDecl[$tn.start]
							{
							pushFollow(FOLLOW_scalarVariableDecl_in_variableDeclaration3441);
							scalarVariableDecl190=scalarVariableDecl((tn!=null?(tn.start):null));
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_scalarVariableDecl.add(scalarVariableDecl190.getTree());
							}
							break;

					}

					}
					break;

				default :
					break loop51;
				}
			}

			SEMICOLON191=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_variableDeclaration3457); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_SEMICOLON.add(SEMICOLON191);

			// AST REWRITE
			// elements: scalarVariableDecl, arrayVariableDecl
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (PlexilTreeNode)adaptor.nil();
			// 648:5: -> ^( VARIABLE_DECLARATIONS ( scalarVariableDecl )* ( arrayVariableDecl )* )
			{
				// antlr/Plexil.g:648:8: ^( VARIABLE_DECLARATIONS ( scalarVariableDecl )* ( arrayVariableDecl )* )
				{
				PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
				root_1 = (PlexilTreeNode)adaptor.becomeRoot((PlexilTreeNode)adaptor.create(VARIABLE_DECLARATIONS, "VARIABLE_DECLARATIONS"), root_1);
				// antlr/Plexil.g:648:32: ( scalarVariableDecl )*
				while ( stream_scalarVariableDecl.hasNext() ) {
					adaptor.addChild(root_1, stream_scalarVariableDecl.nextTree());
				}
				stream_scalarVariableDecl.reset();

				// antlr/Plexil.g:648:52: ( arrayVariableDecl )*
				while ( stream_arrayVariableDecl.hasNext() ) {
					adaptor.addChild(root_1, stream_arrayVariableDecl.nextTree());
				}
				stream_arrayVariableDecl.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { m_paraphrases.pop(); }
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "variableDeclaration"


	public static class scalarVariableDecl_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "scalarVariableDecl"
	// antlr/Plexil.g:651:1: scalarVariableDecl[Token typeName] : NCNAME ( EQUALS literalScalarValue )? -> ^( VARIABLE_DECLARATION NCNAME ( literalScalarValue )? ) ;
	public final PlexilParser.scalarVariableDecl_return scalarVariableDecl(Token typeName) throws RecognitionException {
		PlexilParser.scalarVariableDecl_return retval = new PlexilParser.scalarVariableDecl_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token NCNAME192=null;
		Token EQUALS193=null;
		ParserRuleReturnScope literalScalarValue194 =null;

		PlexilTreeNode NCNAME192_tree=null;
		PlexilTreeNode EQUALS193_tree=null;
		RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
		RewriteRuleTokenStream stream_NCNAME=new RewriteRuleTokenStream(adaptor,"token NCNAME");
		RewriteRuleSubtreeStream stream_literalScalarValue=new RewriteRuleSubtreeStream(adaptor,"rule literalScalarValue");

		try {
			// antlr/Plexil.g:651:36: ( NCNAME ( EQUALS literalScalarValue )? -> ^( VARIABLE_DECLARATION NCNAME ( literalScalarValue )? ) )
			// antlr/Plexil.g:652:5: NCNAME ( EQUALS literalScalarValue )?
			{
			NCNAME192=(Token)match(input,NCNAME,FOLLOW_NCNAME_in_scalarVariableDecl3489); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_NCNAME.add(NCNAME192);

			// antlr/Plexil.g:652:12: ( EQUALS literalScalarValue )?
			int alt52=2;
			int LA52_0 = input.LA(1);
			if ( (LA52_0==EQUALS) ) {
				alt52=1;
			}
			switch (alt52) {
				case 1 :
					// antlr/Plexil.g:652:14: EQUALS literalScalarValue
					{
					EQUALS193=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_scalarVariableDecl3493); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_EQUALS.add(EQUALS193);

					pushFollow(FOLLOW_literalScalarValue_in_scalarVariableDecl3495);
					literalScalarValue194=literalScalarValue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_literalScalarValue.add(literalScalarValue194.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: NCNAME, literalScalarValue
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (PlexilTreeNode)adaptor.nil();
			// 653:5: -> ^( VARIABLE_DECLARATION NCNAME ( literalScalarValue )? )
			{
				// antlr/Plexil.g:653:8: ^( VARIABLE_DECLARATION NCNAME ( literalScalarValue )? )
				{
				PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
				root_1 = (PlexilTreeNode)adaptor.becomeRoot((PlexilTreeNode)adaptor.create(VARIABLE_DECLARATION, "VARIABLE_DECLARATION"), root_1);
				adaptor.addChild(root_1, new PlexilTreeNode(typeName));
				adaptor.addChild(root_1, stream_NCNAME.nextNode());
				// antlr/Plexil.g:653:70: ( literalScalarValue )?
				if ( stream_literalScalarValue.hasNext() ) {
					adaptor.addChild(root_1, stream_literalScalarValue.nextTree());
				}
				stream_literalScalarValue.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "scalarVariableDecl"


	public static class arrayVariableDecl_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "arrayVariableDecl"
	// antlr/Plexil.g:656:1: arrayVariableDecl[Token typeName] : NCNAME LBRACKET INT RBRACKET ( EQUALS literalValue )? -> ^( ARRAY_VARIABLE_DECLARATION NCNAME INT ( literalValue )? ) ;
	public final PlexilParser.arrayVariableDecl_return arrayVariableDecl(Token typeName) throws RecognitionException {
		PlexilParser.arrayVariableDecl_return retval = new PlexilParser.arrayVariableDecl_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token NCNAME195=null;
		Token LBRACKET196=null;
		Token INT197=null;
		Token RBRACKET198=null;
		Token EQUALS199=null;
		ParserRuleReturnScope literalValue200 =null;

		PlexilTreeNode NCNAME195_tree=null;
		PlexilTreeNode LBRACKET196_tree=null;
		PlexilTreeNode INT197_tree=null;
		PlexilTreeNode RBRACKET198_tree=null;
		PlexilTreeNode EQUALS199_tree=null;
		RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
		RewriteRuleTokenStream stream_LBRACKET=new RewriteRuleTokenStream(adaptor,"token LBRACKET");
		RewriteRuleTokenStream stream_RBRACKET=new RewriteRuleTokenStream(adaptor,"token RBRACKET");
		RewriteRuleTokenStream stream_NCNAME=new RewriteRuleTokenStream(adaptor,"token NCNAME");
		RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
		RewriteRuleSubtreeStream stream_literalValue=new RewriteRuleSubtreeStream(adaptor,"rule literalValue");

		try {
			// antlr/Plexil.g:656:35: ( NCNAME LBRACKET INT RBRACKET ( EQUALS literalValue )? -> ^( ARRAY_VARIABLE_DECLARATION NCNAME INT ( literalValue )? ) )
			// antlr/Plexil.g:657:5: NCNAME LBRACKET INT RBRACKET ( EQUALS literalValue )?
			{
			NCNAME195=(Token)match(input,NCNAME,FOLLOW_NCNAME_in_arrayVariableDecl3531); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_NCNAME.add(NCNAME195);

			LBRACKET196=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_arrayVariableDecl3533); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LBRACKET.add(LBRACKET196);

			INT197=(Token)match(input,INT,FOLLOW_INT_in_arrayVariableDecl3535); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_INT.add(INT197);

			RBRACKET198=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_arrayVariableDecl3537); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RBRACKET.add(RBRACKET198);

			// antlr/Plexil.g:657:34: ( EQUALS literalValue )?
			int alt53=2;
			int LA53_0 = input.LA(1);
			if ( (LA53_0==EQUALS) ) {
				alt53=1;
			}
			switch (alt53) {
				case 1 :
					// antlr/Plexil.g:657:36: EQUALS literalValue
					{
					EQUALS199=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_arrayVariableDecl3541); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_EQUALS.add(EQUALS199);

					pushFollow(FOLLOW_literalValue_in_arrayVariableDecl3543);
					literalValue200=literalValue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_literalValue.add(literalValue200.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: literalValue, NCNAME, INT
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (PlexilTreeNode)adaptor.nil();
			// 658:2: -> ^( ARRAY_VARIABLE_DECLARATION NCNAME INT ( literalValue )? )
			{
				// antlr/Plexil.g:658:5: ^( ARRAY_VARIABLE_DECLARATION NCNAME INT ( literalValue )? )
				{
				PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
				root_1 = (PlexilTreeNode)adaptor.becomeRoot((PlexilTreeNode)adaptor.create(ARRAY_VARIABLE_DECLARATION, "ARRAY_VARIABLE_DECLARATION"), root_1);
				adaptor.addChild(root_1, new PlexilTreeNode(typeName));
				adaptor.addChild(root_1, stream_NCNAME.nextNode());
				adaptor.addChild(root_1, stream_INT.nextNode());
				// antlr/Plexil.g:658:77: ( literalValue )?
				if ( stream_literalValue.hasNext() ) {
					adaptor.addChild(root_1, stream_literalValue.nextTree());
				}
				stream_literalValue.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "arrayVariableDecl"


	public static class literalScalarValue_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "literalScalarValue"
	// antlr/Plexil.g:661:1: literalScalarValue : ( booleanLiteral | INT | DOUBLE | STRING | unaryMinus | dateLiteral | durationLiteral );
	public final PlexilParser.literalScalarValue_return literalScalarValue() throws RecognitionException {
		PlexilParser.literalScalarValue_return retval = new PlexilParser.literalScalarValue_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token INT202=null;
		Token DOUBLE203=null;
		Token STRING204=null;
		ParserRuleReturnScope booleanLiteral201 =null;
		ParserRuleReturnScope unaryMinus205 =null;
		ParserRuleReturnScope dateLiteral206 =null;
		ParserRuleReturnScope durationLiteral207 =null;

		PlexilTreeNode INT202_tree=null;
		PlexilTreeNode DOUBLE203_tree=null;
		PlexilTreeNode STRING204_tree=null;

		try {
			// antlr/Plexil.g:661:20: ( booleanLiteral | INT | DOUBLE | STRING | unaryMinus | dateLiteral | durationLiteral )
			int alt54=7;
			switch ( input.LA(1) ) {
			case FALSE_KYWD:
			case TRUE_KYWD:
				{
				alt54=1;
				}
				break;
			case INT:
				{
				alt54=2;
				}
				break;
			case DOUBLE:
				{
				alt54=3;
				}
				break;
			case STRING:
				{
				alt54=4;
				}
				break;
			case MINUS:
				{
				alt54=5;
				}
				break;
			case DATE_KYWD:
				{
				alt54=6;
				}
				break;
			case DURATION_KYWD:
				{
				alt54=7;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 54, 0, input);
				throw nvae;
			}
			switch (alt54) {
				case 1 :
					// antlr/Plexil.g:662:5: booleanLiteral
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_booleanLiteral_in_literalScalarValue3579);
					booleanLiteral201=booleanLiteral();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, booleanLiteral201.getTree());

					}
					break;
				case 2 :
					// antlr/Plexil.g:662:22: INT
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					INT202=(Token)match(input,INT,FOLLOW_INT_in_literalScalarValue3583); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					INT202_tree = (PlexilTreeNode)adaptor.create(INT202);
					adaptor.addChild(root_0, INT202_tree);
					}

					}
					break;
				case 3 :
					// antlr/Plexil.g:662:28: DOUBLE
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					DOUBLE203=(Token)match(input,DOUBLE,FOLLOW_DOUBLE_in_literalScalarValue3587); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					DOUBLE203_tree = (PlexilTreeNode)adaptor.create(DOUBLE203);
					adaptor.addChild(root_0, DOUBLE203_tree);
					}

					}
					break;
				case 4 :
					// antlr/Plexil.g:662:37: STRING
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					STRING204=(Token)match(input,STRING,FOLLOW_STRING_in_literalScalarValue3591); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					STRING204_tree = (PlexilTreeNode)adaptor.create(STRING204);
					adaptor.addChild(root_0, STRING204_tree);
					}

					}
					break;
				case 5 :
					// antlr/Plexil.g:662:46: unaryMinus
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_unaryMinus_in_literalScalarValue3595);
					unaryMinus205=unaryMinus();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryMinus205.getTree());

					}
					break;
				case 6 :
					// antlr/Plexil.g:663:5: dateLiteral
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_dateLiteral_in_literalScalarValue3603);
					dateLiteral206=dateLiteral();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, dateLiteral206.getTree());

					}
					break;
				case 7 :
					// antlr/Plexil.g:663:19: durationLiteral
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_durationLiteral_in_literalScalarValue3607);
					durationLiteral207=durationLiteral();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, durationLiteral207.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "literalScalarValue"


	public static class literalArrayValue_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "literalArrayValue"
	// antlr/Plexil.g:665:1: literalArrayValue : HASHPAREN ( literalScalarValue )* RPAREN -> ^( ARRAY_LITERAL ( literalScalarValue )* ) ;
	public final PlexilParser.literalArrayValue_return literalArrayValue() throws RecognitionException {
		PlexilParser.literalArrayValue_return retval = new PlexilParser.literalArrayValue_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token HASHPAREN208=null;
		Token RPAREN210=null;
		ParserRuleReturnScope literalScalarValue209 =null;

		PlexilTreeNode HASHPAREN208_tree=null;
		PlexilTreeNode RPAREN210_tree=null;
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleTokenStream stream_HASHPAREN=new RewriteRuleTokenStream(adaptor,"token HASHPAREN");
		RewriteRuleSubtreeStream stream_literalScalarValue=new RewriteRuleSubtreeStream(adaptor,"rule literalScalarValue");

		try {
			// antlr/Plexil.g:665:19: ( HASHPAREN ( literalScalarValue )* RPAREN -> ^( ARRAY_LITERAL ( literalScalarValue )* ) )
			// antlr/Plexil.g:666:5: HASHPAREN ( literalScalarValue )* RPAREN
			{
			HASHPAREN208=(Token)match(input,HASHPAREN,FOLLOW_HASHPAREN_in_literalArrayValue3620); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_HASHPAREN.add(HASHPAREN208);

			// antlr/Plexil.g:666:15: ( literalScalarValue )*
			loop55:
			while (true) {
				int alt55=2;
				int LA55_0 = input.LA(1);
				if ( (LA55_0==DATE_KYWD||(LA55_0 >= DOUBLE && LA55_0 <= DURATION_KYWD)||LA55_0==FALSE_KYWD||LA55_0==INT||LA55_0==MINUS||LA55_0==STRING||LA55_0==TRUE_KYWD) ) {
					alt55=1;
				}

				switch (alt55) {
				case 1 :
					// antlr/Plexil.g:666:15: literalScalarValue
					{
					pushFollow(FOLLOW_literalScalarValue_in_literalArrayValue3622);
					literalScalarValue209=literalScalarValue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_literalScalarValue.add(literalScalarValue209.getTree());
					}
					break;

				default :
					break loop55;
				}
			}

			RPAREN210=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_literalArrayValue3625); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN210);

			// AST REWRITE
			// elements: literalScalarValue
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (PlexilTreeNode)adaptor.nil();
			// 667:5: -> ^( ARRAY_LITERAL ( literalScalarValue )* )
			{
				// antlr/Plexil.g:667:8: ^( ARRAY_LITERAL ( literalScalarValue )* )
				{
				PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
				root_1 = (PlexilTreeNode)adaptor.becomeRoot((PlexilTreeNode)adaptor.create(ARRAY_LITERAL, "ARRAY_LITERAL"), root_1);
				// antlr/Plexil.g:667:24: ( literalScalarValue )*
				while ( stream_literalScalarValue.hasNext() ) {
					adaptor.addChild(root_1, stream_literalScalarValue.nextTree());
				}
				stream_literalScalarValue.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "literalArrayValue"


	public static class literalValue_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "literalValue"
	// antlr/Plexil.g:670:1: literalValue : ( literalScalarValue | literalArrayValue );
	public final PlexilParser.literalValue_return literalValue() throws RecognitionException {
		PlexilParser.literalValue_return retval = new PlexilParser.literalValue_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		ParserRuleReturnScope literalScalarValue211 =null;
		ParserRuleReturnScope literalArrayValue212 =null;


		try {
			// antlr/Plexil.g:670:14: ( literalScalarValue | literalArrayValue )
			int alt56=2;
			int LA56_0 = input.LA(1);
			if ( (LA56_0==DATE_KYWD||(LA56_0 >= DOUBLE && LA56_0 <= DURATION_KYWD)||LA56_0==FALSE_KYWD||LA56_0==INT||LA56_0==MINUS||LA56_0==STRING||LA56_0==TRUE_KYWD) ) {
				alt56=1;
			}
			else if ( (LA56_0==HASHPAREN) ) {
				alt56=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 56, 0, input);
				throw nvae;
			}

			switch (alt56) {
				case 1 :
					// antlr/Plexil.g:670:16: literalScalarValue
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_literalScalarValue_in_literalValue3649);
					literalScalarValue211=literalScalarValue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, literalScalarValue211.getTree());

					}
					break;
				case 2 :
					// antlr/Plexil.g:670:37: literalArrayValue
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_literalArrayValue_in_literalValue3653);
					literalArrayValue212=literalArrayValue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, literalArrayValue212.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "literalValue"


	public static class booleanLiteral_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "booleanLiteral"
	// antlr/Plexil.g:672:1: booleanLiteral : ( TRUE_KYWD | FALSE_KYWD );
	public final PlexilParser.booleanLiteral_return booleanLiteral() throws RecognitionException {
		PlexilParser.booleanLiteral_return retval = new PlexilParser.booleanLiteral_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token set213=null;

		PlexilTreeNode set213_tree=null;

		try {
			// antlr/Plexil.g:672:16: ( TRUE_KYWD | FALSE_KYWD )
			// antlr/Plexil.g:
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			set213=input.LT(1);
			if ( input.LA(1)==FALSE_KYWD||input.LA(1)==TRUE_KYWD ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (PlexilTreeNode)adaptor.create(set213));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "booleanLiteral"


	public static class realValue_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "realValue"
	// antlr/Plexil.g:674:1: realValue : ( DOUBLE | INT );
	public final PlexilParser.realValue_return realValue() throws RecognitionException {
		PlexilParser.realValue_return retval = new PlexilParser.realValue_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token set214=null;

		PlexilTreeNode set214_tree=null;

		try {
			// antlr/Plexil.g:674:11: ( DOUBLE | INT )
			// antlr/Plexil.g:
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			set214=input.LT(1);
			if ( input.LA(1)==DOUBLE||input.LA(1)==INT ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (PlexilTreeNode)adaptor.create(set214));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "realValue"


	public static class lookupArrayReference_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "lookupArrayReference"
	// antlr/Plexil.g:678:1: lookupArrayReference : lookup LBRACKET expression RBRACKET -> ^( ARRAY_REF lookup expression ) ;
	public final PlexilParser.lookupArrayReference_return lookupArrayReference() throws RecognitionException {
		PlexilParser.lookupArrayReference_return retval = new PlexilParser.lookupArrayReference_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token LBRACKET216=null;
		Token RBRACKET218=null;
		ParserRuleReturnScope lookup215 =null;
		ParserRuleReturnScope expression217 =null;

		PlexilTreeNode LBRACKET216_tree=null;
		PlexilTreeNode RBRACKET218_tree=null;
		RewriteRuleTokenStream stream_LBRACKET=new RewriteRuleTokenStream(adaptor,"token LBRACKET");
		RewriteRuleTokenStream stream_RBRACKET=new RewriteRuleTokenStream(adaptor,"token RBRACKET");
		RewriteRuleSubtreeStream stream_lookup=new RewriteRuleSubtreeStream(adaptor,"rule lookup");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// antlr/Plexil.g:678:22: ( lookup LBRACKET expression RBRACKET -> ^( ARRAY_REF lookup expression ) )
			// antlr/Plexil.g:679:5: lookup LBRACKET expression RBRACKET
			{
			pushFollow(FOLLOW_lookup_in_lookupArrayReference3694);
			lookup215=lookup();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_lookup.add(lookup215.getTree());
			LBRACKET216=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_lookupArrayReference3696); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LBRACKET.add(LBRACKET216);

			pushFollow(FOLLOW_expression_in_lookupArrayReference3698);
			expression217=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(expression217.getTree());
			RBRACKET218=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_lookupArrayReference3700); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RBRACKET.add(RBRACKET218);

			// AST REWRITE
			// elements: expression, lookup
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (PlexilTreeNode)adaptor.nil();
			// 680:5: -> ^( ARRAY_REF lookup expression )
			{
				// antlr/Plexil.g:680:8: ^( ARRAY_REF lookup expression )
				{
				PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
				root_1 = (PlexilTreeNode)adaptor.becomeRoot((PlexilTreeNode)adaptor.create(ARRAY_REF, "ARRAY_REF"), root_1);
				adaptor.addChild(root_1, stream_lookup.nextTree());
				adaptor.addChild(root_1, stream_expression.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "lookupArrayReference"


	public static class simpleArrayReference_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "simpleArrayReference"
	// antlr/Plexil.g:683:1: simpleArrayReference : variable LBRACKET expression RBRACKET -> ^( ARRAY_REF variable expression ) ;
	public final PlexilParser.simpleArrayReference_return simpleArrayReference() throws RecognitionException {
		PlexilParser.simpleArrayReference_return retval = new PlexilParser.simpleArrayReference_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token LBRACKET220=null;
		Token RBRACKET222=null;
		ParserRuleReturnScope variable219 =null;
		ParserRuleReturnScope expression221 =null;

		PlexilTreeNode LBRACKET220_tree=null;
		PlexilTreeNode RBRACKET222_tree=null;
		RewriteRuleTokenStream stream_LBRACKET=new RewriteRuleTokenStream(adaptor,"token LBRACKET");
		RewriteRuleTokenStream stream_RBRACKET=new RewriteRuleTokenStream(adaptor,"token RBRACKET");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_variable=new RewriteRuleSubtreeStream(adaptor,"rule variable");

		try {
			// antlr/Plexil.g:683:22: ( variable LBRACKET expression RBRACKET -> ^( ARRAY_REF variable expression ) )
			// antlr/Plexil.g:684:5: variable LBRACKET expression RBRACKET
			{
			pushFollow(FOLLOW_variable_in_simpleArrayReference3729);
			variable219=variable();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_variable.add(variable219.getTree());
			LBRACKET220=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_simpleArrayReference3731); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LBRACKET.add(LBRACKET220);

			pushFollow(FOLLOW_expression_in_simpleArrayReference3733);
			expression221=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(expression221.getTree());
			RBRACKET222=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_simpleArrayReference3735); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RBRACKET.add(RBRACKET222);

			// AST REWRITE
			// elements: variable, expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (PlexilTreeNode)adaptor.nil();
			// 685:5: -> ^( ARRAY_REF variable expression )
			{
				// antlr/Plexil.g:685:8: ^( ARRAY_REF variable expression )
				{
				PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
				root_1 = (PlexilTreeNode)adaptor.becomeRoot((PlexilTreeNode)adaptor.create(ARRAY_REF, "ARRAY_REF"), root_1);
				adaptor.addChild(root_1, stream_variable.nextTree());
				adaptor.addChild(root_1, stream_expression.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "simpleArrayReference"


	public static class commandInvocation_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "commandInvocation"
	// antlr/Plexil.g:688:1: commandInvocation : ( NCNAME -> ^( COMMAND_KYWD NCNAME ) | LPAREN expression RPAREN -> expression ) LPAREN ( argumentList )? RPAREN -> ^( COMMAND $commandInvocation ( argumentList )? ) ;
	public final PlexilParser.commandInvocation_return commandInvocation() throws RecognitionException {
		PlexilParser.commandInvocation_return retval = new PlexilParser.commandInvocation_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token NCNAME223=null;
		Token LPAREN224=null;
		Token RPAREN226=null;
		Token LPAREN227=null;
		Token RPAREN229=null;
		ParserRuleReturnScope expression225 =null;
		ParserRuleReturnScope argumentList228 =null;

		PlexilTreeNode NCNAME223_tree=null;
		PlexilTreeNode LPAREN224_tree=null;
		PlexilTreeNode RPAREN226_tree=null;
		PlexilTreeNode LPAREN227_tree=null;
		PlexilTreeNode RPAREN229_tree=null;
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleTokenStream stream_NCNAME=new RewriteRuleTokenStream(adaptor,"token NCNAME");
		RewriteRuleSubtreeStream stream_argumentList=new RewriteRuleSubtreeStream(adaptor,"rule argumentList");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		 m_paraphrases.push("in command"); 
		try {
			// antlr/Plexil.g:691:2: ( ( NCNAME -> ^( COMMAND_KYWD NCNAME ) | LPAREN expression RPAREN -> expression ) LPAREN ( argumentList )? RPAREN -> ^( COMMAND $commandInvocation ( argumentList )? ) )
			// antlr/Plexil.g:692:5: ( NCNAME -> ^( COMMAND_KYWD NCNAME ) | LPAREN expression RPAREN -> expression ) LPAREN ( argumentList )? RPAREN
			{
			// antlr/Plexil.g:692:5: ( NCNAME -> ^( COMMAND_KYWD NCNAME ) | LPAREN expression RPAREN -> expression )
			int alt57=2;
			int LA57_0 = input.LA(1);
			if ( (LA57_0==NCNAME) ) {
				alt57=1;
			}
			else if ( (LA57_0==LPAREN) ) {
				alt57=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 57, 0, input);
				throw nvae;
			}

			switch (alt57) {
				case 1 :
					// antlr/Plexil.g:692:7: NCNAME
					{
					NCNAME223=(Token)match(input,NCNAME,FOLLOW_NCNAME_in_commandInvocation3777); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_NCNAME.add(NCNAME223);

					// AST REWRITE
					// elements: NCNAME
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 692:14: -> ^( COMMAND_KYWD NCNAME )
					{
						// antlr/Plexil.g:692:17: ^( COMMAND_KYWD NCNAME )
						{
						PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
						root_1 = (PlexilTreeNode)adaptor.becomeRoot((PlexilTreeNode)adaptor.create(COMMAND_KYWD, "COMMAND_KYWD"), root_1);
						adaptor.addChild(root_1, stream_NCNAME.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// antlr/Plexil.g:693:7: LPAREN expression RPAREN
					{
					LPAREN224=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_commandInvocation3793); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN224);

					pushFollow(FOLLOW_expression_in_commandInvocation3795);
					expression225=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression225.getTree());
					RPAREN226=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_commandInvocation3797); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN226);

					// AST REWRITE
					// elements: expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 693:32: -> expression
					{
						adaptor.addChild(root_0, stream_expression.nextTree());
					}


					retval.tree = root_0;
					}

					}
					break;

			}

			LPAREN227=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_commandInvocation3813); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN227);

			// antlr/Plexil.g:695:12: ( argumentList )?
			int alt58=2;
			int LA58_0 = input.LA(1);
			if ( (LA58_0==ABS_KYWD||LA58_0==ARRAY_MAX_SIZE_KYWD||LA58_0==ARRAY_SIZE_KYWD||LA58_0==BAR||(LA58_0 >= CEIL_KYWD && LA58_0 <= CHILD_KYWD)||(LA58_0 >= COMMAND_ACCEPTED_KYWD && LA58_0 <= COMMAND_FAILED_KYWD)||(LA58_0 >= COMMAND_RCVD_KYWD && LA58_0 <= COMMAND_SUCCESS_KYWD)||LA58_0==DATE_KYWD||(LA58_0 >= DOUBLE && LA58_0 <= DURATION_KYWD)||(LA58_0 >= EXECUTING_STATE_KYWD && LA58_0 <= EXITED_KYWD)||LA58_0==FAILING_STATE_KYWD||(LA58_0 >= FAILURE_OUTCOME_KYWD && LA58_0 <= FLOOR_KYWD)||LA58_0==HASHPAREN||(LA58_0 >= INACTIVE_STATE_KYWD && LA58_0 <= INT)||LA58_0==INTERRUPTED_OUTCOME_KYWD||LA58_0==INVARIANT_CONDITION_FAILED_KYWD||(LA58_0 >= IS_KNOWN_KYWD && LA58_0 <= ITERATION_ENDED_STATE_KYWD)||(LA58_0 >= LOOKUP_KYWD && LA58_0 <= LOOKUP_ON_CHANGE_KYWD)||LA58_0==LPAREN||(LA58_0 >= MAX_KYWD && LA58_0 <= MIN_KYWD)||LA58_0==NCNAME||(LA58_0 >= NODE_EXECUTING_KYWD && LA58_0 <= NODE_FINISHED_KYWD)||(LA58_0 >= NODE_INACTIVE_KYWD && LA58_0 <= NODE_SUCCEEDED_KYWD)||(LA58_0 >= NODE_WAITING_KYWD && LA58_0 <= NOT_KYWD)||(LA58_0 >= PARENT_EXITED_KYWD && LA58_0 <= PARENT_KYWD)||LA58_0==POST_CONDITION_FAILED_KYWD||LA58_0==PRE_CONDITION_FAILED_KYWD||LA58_0==REAL_TO_INT_KYWD||LA58_0==ROUND_KYWD||LA58_0==SELF_KYWD||(LA58_0 >= SIBLING_KYWD && LA58_0 <= SKIPPED_OUTCOME_KYWD)||LA58_0==SQRT_KYWD||LA58_0==STRING||(LA58_0 >= STRLEN_KYWD && LA58_0 <= SUCCESS_OUTCOME_KYWD)||(LA58_0 >= TRUE_KYWD && LA58_0 <= TRUNC_KYWD)||LA58_0==WAITING_STATE_KYWD) ) {
				alt58=1;
			}
			switch (alt58) {
				case 1 :
					// antlr/Plexil.g:695:12: argumentList
					{
					pushFollow(FOLLOW_argumentList_in_commandInvocation3815);
					argumentList228=argumentList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_argumentList.add(argumentList228.getTree());
					}
					break;

			}

			RPAREN229=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_commandInvocation3818); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN229);

			// AST REWRITE
			// elements: commandInvocation, argumentList
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (PlexilTreeNode)adaptor.nil();
			// 696:5: -> ^( COMMAND $commandInvocation ( argumentList )? )
			{
				// antlr/Plexil.g:696:8: ^( COMMAND $commandInvocation ( argumentList )? )
				{
				PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
				root_1 = (PlexilTreeNode)adaptor.becomeRoot(new CommandNode(COMMAND), root_1);
				adaptor.addChild(root_1, stream_retval.nextTree());
				// antlr/Plexil.g:696:50: ( argumentList )?
				if ( stream_argumentList.hasNext() ) {
					adaptor.addChild(root_1, stream_argumentList.nextTree());
				}
				stream_argumentList.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { m_paraphrases.pop(); }
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "commandInvocation"


	public static class commandWithAssignment_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "commandWithAssignment"
	// antlr/Plexil.g:700:1: commandWithAssignment : assignmentLHS EQUALS commandInvocation -> ^( ASSIGNMENT assignmentLHS commandInvocation ) ;
	public final PlexilParser.commandWithAssignment_return commandWithAssignment() throws RecognitionException {
		PlexilParser.commandWithAssignment_return retval = new PlexilParser.commandWithAssignment_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token EQUALS231=null;
		ParserRuleReturnScope assignmentLHS230 =null;
		ParserRuleReturnScope commandInvocation232 =null;

		PlexilTreeNode EQUALS231_tree=null;
		RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
		RewriteRuleSubtreeStream stream_commandInvocation=new RewriteRuleSubtreeStream(adaptor,"rule commandInvocation");
		RewriteRuleSubtreeStream stream_assignmentLHS=new RewriteRuleSubtreeStream(adaptor,"rule assignmentLHS");

		 m_paraphrases.push("in command"); 
		try {
			// antlr/Plexil.g:703:2: ( assignmentLHS EQUALS commandInvocation -> ^( ASSIGNMENT assignmentLHS commandInvocation ) )
			// antlr/Plexil.g:704:5: assignmentLHS EQUALS commandInvocation
			{
			pushFollow(FOLLOW_assignmentLHS_in_commandWithAssignment3863);
			assignmentLHS230=assignmentLHS();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_assignmentLHS.add(assignmentLHS230.getTree());
			EQUALS231=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_commandWithAssignment3865); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_EQUALS.add(EQUALS231);

			pushFollow(FOLLOW_commandInvocation_in_commandWithAssignment3867);
			commandInvocation232=commandInvocation();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_commandInvocation.add(commandInvocation232.getTree());
			// AST REWRITE
			// elements: assignmentLHS, commandInvocation
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (PlexilTreeNode)adaptor.nil();
			// 705:2: -> ^( ASSIGNMENT assignmentLHS commandInvocation )
			{
				// antlr/Plexil.g:705:5: ^( ASSIGNMENT assignmentLHS commandInvocation )
				{
				PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
				root_1 = (PlexilTreeNode)adaptor.becomeRoot((PlexilTreeNode)adaptor.create(ASSIGNMENT, "ASSIGNMENT"), root_1);
				adaptor.addChild(root_1, stream_assignmentLHS.nextTree());
				adaptor.addChild(root_1, stream_commandInvocation.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { m_paraphrases.pop(); }
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "commandWithAssignment"


	public static class argumentList_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "argumentList"
	// antlr/Plexil.g:708:1: argumentList : argument ( COMMA argument )* -> ^( ARGUMENT_LIST ( argument )* ) ;
	public final PlexilParser.argumentList_return argumentList() throws RecognitionException {
		PlexilParser.argumentList_return retval = new PlexilParser.argumentList_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token COMMA234=null;
		ParserRuleReturnScope argument233 =null;
		ParserRuleReturnScope argument235 =null;

		PlexilTreeNode COMMA234_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_argument=new RewriteRuleSubtreeStream(adaptor,"rule argument");

		try {
			// antlr/Plexil.g:708:14: ( argument ( COMMA argument )* -> ^( ARGUMENT_LIST ( argument )* ) )
			// antlr/Plexil.g:709:5: argument ( COMMA argument )*
			{
			pushFollow(FOLLOW_argument_in_argumentList3897);
			argument233=argument();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_argument.add(argument233.getTree());
			// antlr/Plexil.g:709:14: ( COMMA argument )*
			loop59:
			while (true) {
				int alt59=2;
				int LA59_0 = input.LA(1);
				if ( (LA59_0==COMMA) ) {
					alt59=1;
				}

				switch (alt59) {
				case 1 :
					// antlr/Plexil.g:709:15: COMMA argument
					{
					COMMA234=(Token)match(input,COMMA,FOLLOW_COMMA_in_argumentList3900); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA234);

					pushFollow(FOLLOW_argument_in_argumentList3902);
					argument235=argument();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_argument.add(argument235.getTree());
					}
					break;

				default :
					break loop59;
				}
			}

			// AST REWRITE
			// elements: argument
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (PlexilTreeNode)adaptor.nil();
			// 710:5: -> ^( ARGUMENT_LIST ( argument )* )
			{
				// antlr/Plexil.g:710:8: ^( ARGUMENT_LIST ( argument )* )
				{
				PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
				root_1 = (PlexilTreeNode)adaptor.becomeRoot((PlexilTreeNode)adaptor.create(ARGUMENT_LIST, "ARGUMENT_LIST"), root_1);
				// antlr/Plexil.g:710:24: ( argument )*
				while ( stream_argument.hasNext() ) {
					adaptor.addChild(root_1, stream_argument.nextTree());
				}
				stream_argument.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "argumentList"


	public static class argument_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "argument"
	// antlr/Plexil.g:713:1: argument : expression ;
	public final PlexilParser.argument_return argument() throws RecognitionException {
		PlexilParser.argument_return retval = new PlexilParser.argument_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		ParserRuleReturnScope expression236 =null;


		try {
			// antlr/Plexil.g:713:10: ( expression )
			// antlr/Plexil.g:713:12: expression
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			pushFollow(FOLLOW_expression_in_argument3928);
			expression236=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression236.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "argument"


	public static class assignment_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "assignment"
	// antlr/Plexil.g:715:1: assignment : assignmentLHS EQUALS assignmentRHS SEMICOLON -> ^( ASSIGNMENT assignmentLHS assignmentRHS ) ;
	public final PlexilParser.assignment_return assignment() throws RecognitionException {
		PlexilParser.assignment_return retval = new PlexilParser.assignment_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token EQUALS238=null;
		Token SEMICOLON240=null;
		ParserRuleReturnScope assignmentLHS237 =null;
		ParserRuleReturnScope assignmentRHS239 =null;

		PlexilTreeNode EQUALS238_tree=null;
		PlexilTreeNode SEMICOLON240_tree=null;
		RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
		RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
		RewriteRuleSubtreeStream stream_assignmentLHS=new RewriteRuleSubtreeStream(adaptor,"rule assignmentLHS");
		RewriteRuleSubtreeStream stream_assignmentRHS=new RewriteRuleSubtreeStream(adaptor,"rule assignmentRHS");

		 m_paraphrases.push("in assignment statement"); 
		try {
			// antlr/Plexil.g:718:2: ( assignmentLHS EQUALS assignmentRHS SEMICOLON -> ^( ASSIGNMENT assignmentLHS assignmentRHS ) )
			// antlr/Plexil.g:719:5: assignmentLHS EQUALS assignmentRHS SEMICOLON
			{
			pushFollow(FOLLOW_assignmentLHS_in_assignment3952);
			assignmentLHS237=assignmentLHS();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_assignmentLHS.add(assignmentLHS237.getTree());
			EQUALS238=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_assignment3954); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_EQUALS.add(EQUALS238);

			pushFollow(FOLLOW_assignmentRHS_in_assignment3956);
			assignmentRHS239=assignmentRHS();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_assignmentRHS.add(assignmentRHS239.getTree());
			SEMICOLON240=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_assignment3958); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_SEMICOLON.add(SEMICOLON240);

			// AST REWRITE
			// elements: assignmentLHS, assignmentRHS
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (PlexilTreeNode)adaptor.nil();
			// 720:5: -> ^( ASSIGNMENT assignmentLHS assignmentRHS )
			{
				// antlr/Plexil.g:720:8: ^( ASSIGNMENT assignmentLHS assignmentRHS )
				{
				PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
				root_1 = (PlexilTreeNode)adaptor.becomeRoot((PlexilTreeNode)adaptor.create(ASSIGNMENT, "ASSIGNMENT"), root_1);
				adaptor.addChild(root_1, stream_assignmentLHS.nextTree());
				adaptor.addChild(root_1, stream_assignmentRHS.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { m_paraphrases.pop(); }
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "assignment"


	public static class assignmentLHS_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "assignmentLHS"
	// antlr/Plexil.g:723:1: assignmentLHS : ( ( NCNAME LBRACKET )=> simpleArrayReference | variable );
	public final PlexilParser.assignmentLHS_return assignmentLHS() throws RecognitionException {
		PlexilParser.assignmentLHS_return retval = new PlexilParser.assignmentLHS_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		ParserRuleReturnScope simpleArrayReference241 =null;
		ParserRuleReturnScope variable242 =null;


		try {
			// antlr/Plexil.g:723:15: ( ( NCNAME LBRACKET )=> simpleArrayReference | variable )
			int alt60=2;
			int LA60_0 = input.LA(1);
			if ( (LA60_0==NCNAME) ) {
				int LA60_1 = input.LA(2);
				if ( (LA60_1==LBRACKET) && (synpred11_Plexil())) {
					alt60=1;
				}
				else if ( (LA60_1==EQUALS) ) {
					alt60=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 60, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 60, 0, input);
				throw nvae;
			}

			switch (alt60) {
				case 1 :
					// antlr/Plexil.g:724:5: ( NCNAME LBRACKET )=> simpleArrayReference
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_simpleArrayReference_in_assignmentLHS4001);
					simpleArrayReference241=simpleArrayReference();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleArrayReference241.getTree());

					}
					break;
				case 2 :
					// antlr/Plexil.g:727:5: variable
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_variable_in_assignmentLHS4012);
					variable242=variable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variable242.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "assignmentLHS"


	public static class assignmentRHS_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "assignmentRHS"
	// antlr/Plexil.g:731:1: assignmentRHS : ( ( NCNAME LPAREN )=> commandInvocation | ( LPAREN expression RPAREN LPAREN )=> commandInvocation | expression );
	public final PlexilParser.assignmentRHS_return assignmentRHS() throws RecognitionException {
		PlexilParser.assignmentRHS_return retval = new PlexilParser.assignmentRHS_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		ParserRuleReturnScope commandInvocation243 =null;
		ParserRuleReturnScope commandInvocation244 =null;
		ParserRuleReturnScope expression245 =null;


		try {
			// antlr/Plexil.g:731:15: ( ( NCNAME LPAREN )=> commandInvocation | ( LPAREN expression RPAREN LPAREN )=> commandInvocation | expression )
			int alt61=3;
			alt61 = dfa61.predict(input);
			switch (alt61) {
				case 1 :
					// antlr/Plexil.g:732:4: ( NCNAME LPAREN )=> commandInvocation
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_commandInvocation_in_assignmentRHS4033);
					commandInvocation243=commandInvocation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, commandInvocation243.getTree());

					}
					break;
				case 2 :
					// antlr/Plexil.g:734:4: ( LPAREN expression RPAREN LPAREN )=> commandInvocation
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_commandInvocation_in_assignmentRHS4053);
					commandInvocation244=commandInvocation();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, commandInvocation244.getTree());

					}
					break;
				case 3 :
					// antlr/Plexil.g:736:4: expression
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_expression_in_assignmentRHS4061);
					expression245=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression245.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "assignmentRHS"


	public static class update_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "update"
	// antlr/Plexil.g:743:1: update : UPDATE_KYWD ^ ( pair ( COMMA ! pair )* )? SEMICOLON !;
	public final PlexilParser.update_return update() throws RecognitionException {
		PlexilParser.update_return retval = new PlexilParser.update_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token UPDATE_KYWD246=null;
		Token COMMA248=null;
		Token SEMICOLON250=null;
		ParserRuleReturnScope pair247 =null;
		ParserRuleReturnScope pair249 =null;

		PlexilTreeNode UPDATE_KYWD246_tree=null;
		PlexilTreeNode COMMA248_tree=null;
		PlexilTreeNode SEMICOLON250_tree=null;

		 m_paraphrases.push("in \"Update\" statement"); 
		try {
			// antlr/Plexil.g:746:2: ( UPDATE_KYWD ^ ( pair ( COMMA ! pair )* )? SEMICOLON !)
			// antlr/Plexil.g:747:5: UPDATE_KYWD ^ ( pair ( COMMA ! pair )* )? SEMICOLON !
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			UPDATE_KYWD246=(Token)match(input,UPDATE_KYWD,FOLLOW_UPDATE_KYWD_in_update4090); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			UPDATE_KYWD246_tree = (PlexilTreeNode)adaptor.create(UPDATE_KYWD246);
			root_0 = (PlexilTreeNode)adaptor.becomeRoot(UPDATE_KYWD246_tree, root_0);
			}

			// antlr/Plexil.g:747:18: ( pair ( COMMA ! pair )* )?
			int alt63=2;
			int LA63_0 = input.LA(1);
			if ( (LA63_0==NCNAME) ) {
				alt63=1;
			}
			switch (alt63) {
				case 1 :
					// antlr/Plexil.g:747:20: pair ( COMMA ! pair )*
					{
					pushFollow(FOLLOW_pair_in_update4095);
					pair247=pair();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, pair247.getTree());

					// antlr/Plexil.g:747:25: ( COMMA ! pair )*
					loop62:
					while (true) {
						int alt62=2;
						int LA62_0 = input.LA(1);
						if ( (LA62_0==COMMA) ) {
							alt62=1;
						}

						switch (alt62) {
						case 1 :
							// antlr/Plexil.g:747:27: COMMA ! pair
							{
							COMMA248=(Token)match(input,COMMA,FOLLOW_COMMA_in_update4099); if (state.failed) return retval;
							pushFollow(FOLLOW_pair_in_update4102);
							pair249=pair();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, pair249.getTree());

							}
							break;

						default :
							break loop62;
						}
					}

					}
					break;

			}

			SEMICOLON250=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_update4110); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { m_paraphrases.pop(); }
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "update"


	public static class request_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "request"
	// antlr/Plexil.g:755:1: request : REQUEST_KYWD ^ NCNAME ( pair ( COMMA ! pair )* )? SEMICOLON !;
	public final PlexilParser.request_return request() throws RecognitionException {
		PlexilParser.request_return retval = new PlexilParser.request_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token REQUEST_KYWD251=null;
		Token NCNAME252=null;
		Token COMMA254=null;
		Token SEMICOLON256=null;
		ParserRuleReturnScope pair253 =null;
		ParserRuleReturnScope pair255 =null;

		PlexilTreeNode REQUEST_KYWD251_tree=null;
		PlexilTreeNode NCNAME252_tree=null;
		PlexilTreeNode COMMA254_tree=null;
		PlexilTreeNode SEMICOLON256_tree=null;

		 m_paraphrases.push("in \"Request\" statement"); 
		try {
			// antlr/Plexil.g:758:2: ( REQUEST_KYWD ^ NCNAME ( pair ( COMMA ! pair )* )? SEMICOLON !)
			// antlr/Plexil.g:758:4: REQUEST_KYWD ^ NCNAME ( pair ( COMMA ! pair )* )? SEMICOLON !
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			REQUEST_KYWD251=(Token)match(input,REQUEST_KYWD,FOLLOW_REQUEST_KYWD_in_request4137); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			REQUEST_KYWD251_tree = (PlexilTreeNode)adaptor.create(REQUEST_KYWD251);
			root_0 = (PlexilTreeNode)adaptor.becomeRoot(REQUEST_KYWD251_tree, root_0);
			}

			NCNAME252=(Token)match(input,NCNAME,FOLLOW_NCNAME_in_request4140); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			NCNAME252_tree = (PlexilTreeNode)adaptor.create(NCNAME252);
			adaptor.addChild(root_0, NCNAME252_tree);
			}

			// antlr/Plexil.g:758:25: ( pair ( COMMA ! pair )* )?
			int alt65=2;
			int LA65_0 = input.LA(1);
			if ( (LA65_0==NCNAME) ) {
				alt65=1;
			}
			switch (alt65) {
				case 1 :
					// antlr/Plexil.g:758:27: pair ( COMMA ! pair )*
					{
					pushFollow(FOLLOW_pair_in_request4144);
					pair253=pair();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, pair253.getTree());

					// antlr/Plexil.g:758:32: ( COMMA ! pair )*
					loop64:
					while (true) {
						int alt64=2;
						int LA64_0 = input.LA(1);
						if ( (LA64_0==COMMA) ) {
							alt64=1;
						}

						switch (alt64) {
						case 1 :
							// antlr/Plexil.g:758:34: COMMA ! pair
							{
							COMMA254=(Token)match(input,COMMA,FOLLOW_COMMA_in_request4148); if (state.failed) return retval;
							pushFollow(FOLLOW_pair_in_request4151);
							pair255=pair();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, pair255.getTree());

							}
							break;

						default :
							break loop64;
						}
					}

					}
					break;

			}

			SEMICOLON256=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_request4159); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { m_paraphrases.pop(); }
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "request"


	public static class pair_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "pair"
	// antlr/Plexil.g:762:1: pair : NCNAME EQUALS ! expression ;
	public final PlexilParser.pair_return pair() throws RecognitionException {
		PlexilParser.pair_return retval = new PlexilParser.pair_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token NCNAME257=null;
		Token EQUALS258=null;
		ParserRuleReturnScope expression259 =null;

		PlexilTreeNode NCNAME257_tree=null;
		PlexilTreeNode EQUALS258_tree=null;

		try {
			// antlr/Plexil.g:762:6: ( NCNAME EQUALS ! expression )
			// antlr/Plexil.g:762:8: NCNAME EQUALS ! expression
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			NCNAME257=(Token)match(input,NCNAME,FOLLOW_NCNAME_in_pair4171); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			NCNAME257_tree = (PlexilTreeNode)adaptor.create(NCNAME257);
			adaptor.addChild(root_0, NCNAME257_tree);
			}

			EQUALS258=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_pair4173); if (state.failed) return retval;
			pushFollow(FOLLOW_expression_in_pair4176);
			expression259=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression259.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "pair"


	public static class libraryCall_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "libraryCall"
	// antlr/Plexil.g:768:1: libraryCall : LIBRARY_CALL_KYWD ^ libraryNodeIdRef ( aliasSpecs )? SEMICOLON !;
	public final PlexilParser.libraryCall_return libraryCall() throws RecognitionException {
		PlexilParser.libraryCall_return retval = new PlexilParser.libraryCall_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token LIBRARY_CALL_KYWD260=null;
		Token SEMICOLON263=null;
		ParserRuleReturnScope libraryNodeIdRef261 =null;
		ParserRuleReturnScope aliasSpecs262 =null;

		PlexilTreeNode LIBRARY_CALL_KYWD260_tree=null;
		PlexilTreeNode SEMICOLON263_tree=null;

		 m_paraphrases.push("in library action call"); 
		try {
			// antlr/Plexil.g:771:2: ( LIBRARY_CALL_KYWD ^ libraryNodeIdRef ( aliasSpecs )? SEMICOLON !)
			// antlr/Plexil.g:772:3: LIBRARY_CALL_KYWD ^ libraryNodeIdRef ( aliasSpecs )? SEMICOLON !
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			LIBRARY_CALL_KYWD260=(Token)match(input,LIBRARY_CALL_KYWD,FOLLOW_LIBRARY_CALL_KYWD_in_libraryCall4202); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LIBRARY_CALL_KYWD260_tree = (PlexilTreeNode)adaptor.create(LIBRARY_CALL_KYWD260);
			root_0 = (PlexilTreeNode)adaptor.becomeRoot(LIBRARY_CALL_KYWD260_tree, root_0);
			}

			pushFollow(FOLLOW_libraryNodeIdRef_in_libraryCall4205);
			libraryNodeIdRef261=libraryNodeIdRef();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, libraryNodeIdRef261.getTree());

			// antlr/Plexil.g:772:39: ( aliasSpecs )?
			int alt66=2;
			int LA66_0 = input.LA(1);
			if ( (LA66_0==LPAREN) ) {
				alt66=1;
			}
			switch (alt66) {
				case 1 :
					// antlr/Plexil.g:772:41: aliasSpecs
					{
					pushFollow(FOLLOW_aliasSpecs_in_libraryCall4209);
					aliasSpecs262=aliasSpecs();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, aliasSpecs262.getTree());

					}
					break;

			}

			SEMICOLON263=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_libraryCall4214); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { m_paraphrases.pop(); }
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "libraryCall"


	public static class libraryNodeIdRef_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "libraryNodeIdRef"
	// antlr/Plexil.g:774:1: libraryNodeIdRef : NCNAME ;
	public final PlexilParser.libraryNodeIdRef_return libraryNodeIdRef() throws RecognitionException {
		PlexilParser.libraryNodeIdRef_return retval = new PlexilParser.libraryNodeIdRef_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token NCNAME264=null;

		PlexilTreeNode NCNAME264_tree=null;

		try {
			// antlr/Plexil.g:774:18: ( NCNAME )
			// antlr/Plexil.g:774:20: NCNAME
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			NCNAME264=(Token)match(input,NCNAME,FOLLOW_NCNAME_in_libraryNodeIdRef4224); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			NCNAME264_tree = (PlexilTreeNode)adaptor.create(NCNAME264);
			adaptor.addChild(root_0, NCNAME264_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "libraryNodeIdRef"


	public static class aliasSpecs_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "aliasSpecs"
	// antlr/Plexil.g:776:1: aliasSpecs : LPAREN ( aliasSpec ( COMMA aliasSpec )* )? RPAREN -> ^( ALIASES ( aliasSpec )* ) ;
	public final PlexilParser.aliasSpecs_return aliasSpecs() throws RecognitionException {
		PlexilParser.aliasSpecs_return retval = new PlexilParser.aliasSpecs_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token LPAREN265=null;
		Token COMMA267=null;
		Token RPAREN269=null;
		ParserRuleReturnScope aliasSpec266 =null;
		ParserRuleReturnScope aliasSpec268 =null;

		PlexilTreeNode LPAREN265_tree=null;
		PlexilTreeNode COMMA267_tree=null;
		PlexilTreeNode RPAREN269_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleSubtreeStream stream_aliasSpec=new RewriteRuleSubtreeStream(adaptor,"rule aliasSpec");

		try {
			// antlr/Plexil.g:776:12: ( LPAREN ( aliasSpec ( COMMA aliasSpec )* )? RPAREN -> ^( ALIASES ( aliasSpec )* ) )
			// antlr/Plexil.g:777:3: LPAREN ( aliasSpec ( COMMA aliasSpec )* )? RPAREN
			{
			LPAREN265=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_aliasSpecs4235); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN265);

			// antlr/Plexil.g:777:10: ( aliasSpec ( COMMA aliasSpec )* )?
			int alt68=2;
			int LA68_0 = input.LA(1);
			if ( (LA68_0==NCNAME) ) {
				alt68=1;
			}
			switch (alt68) {
				case 1 :
					// antlr/Plexil.g:777:12: aliasSpec ( COMMA aliasSpec )*
					{
					pushFollow(FOLLOW_aliasSpec_in_aliasSpecs4239);
					aliasSpec266=aliasSpec();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_aliasSpec.add(aliasSpec266.getTree());
					// antlr/Plexil.g:777:22: ( COMMA aliasSpec )*
					loop67:
					while (true) {
						int alt67=2;
						int LA67_0 = input.LA(1);
						if ( (LA67_0==COMMA) ) {
							alt67=1;
						}

						switch (alt67) {
						case 1 :
							// antlr/Plexil.g:777:24: COMMA aliasSpec
							{
							COMMA267=(Token)match(input,COMMA,FOLLOW_COMMA_in_aliasSpecs4243); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_COMMA.add(COMMA267);

							pushFollow(FOLLOW_aliasSpec_in_aliasSpecs4245);
							aliasSpec268=aliasSpec();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_aliasSpec.add(aliasSpec268.getTree());
							}
							break;

						default :
							break loop67;
						}
					}

					}
					break;

			}

			RPAREN269=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_aliasSpecs4253); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN269);

			// AST REWRITE
			// elements: aliasSpec
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (PlexilTreeNode)adaptor.nil();
			// 778:3: -> ^( ALIASES ( aliasSpec )* )
			{
				// antlr/Plexil.g:778:6: ^( ALIASES ( aliasSpec )* )
				{
				PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
				root_1 = (PlexilTreeNode)adaptor.becomeRoot((PlexilTreeNode)adaptor.create(ALIASES, "ALIASES"), root_1);
				// antlr/Plexil.g:778:16: ( aliasSpec )*
				while ( stream_aliasSpec.hasNext() ) {
					adaptor.addChild(root_1, stream_aliasSpec.nextTree());
				}
				stream_aliasSpec.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "aliasSpecs"


	public static class aliasSpec_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "aliasSpec"
	// antlr/Plexil.g:781:1: aliasSpec : NCNAME EQUALS expression -> ^( ALIAS NCNAME expression ) ;
	public final PlexilParser.aliasSpec_return aliasSpec() throws RecognitionException {
		PlexilParser.aliasSpec_return retval = new PlexilParser.aliasSpec_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token NCNAME270=null;
		Token EQUALS271=null;
		ParserRuleReturnScope expression272 =null;

		PlexilTreeNode NCNAME270_tree=null;
		PlexilTreeNode EQUALS271_tree=null;
		RewriteRuleTokenStream stream_EQUALS=new RewriteRuleTokenStream(adaptor,"token EQUALS");
		RewriteRuleTokenStream stream_NCNAME=new RewriteRuleTokenStream(adaptor,"token NCNAME");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// antlr/Plexil.g:781:11: ( NCNAME EQUALS expression -> ^( ALIAS NCNAME expression ) )
			// antlr/Plexil.g:782:3: NCNAME EQUALS expression
			{
			NCNAME270=(Token)match(input,NCNAME,FOLLOW_NCNAME_in_aliasSpec4277); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_NCNAME.add(NCNAME270);

			EQUALS271=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_aliasSpec4279); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_EQUALS.add(EQUALS271);

			pushFollow(FOLLOW_expression_in_aliasSpec4281);
			expression272=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(expression272.getTree());
			// AST REWRITE
			// elements: NCNAME, expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (PlexilTreeNode)adaptor.nil();
			// 783:9: -> ^( ALIAS NCNAME expression )
			{
				// antlr/Plexil.g:783:12: ^( ALIAS NCNAME expression )
				{
				PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
				root_1 = (PlexilTreeNode)adaptor.becomeRoot((PlexilTreeNode)adaptor.create(ALIAS, "ALIAS"), root_1);
				adaptor.addChild(root_1, stream_NCNAME.nextNode());
				adaptor.addChild(root_1, stream_expression.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "aliasSpec"


	public static class nodeParameterName_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "nodeParameterName"
	// antlr/Plexil.g:786:1: nodeParameterName : NCNAME ;
	public final PlexilParser.nodeParameterName_return nodeParameterName() throws RecognitionException {
		PlexilParser.nodeParameterName_return retval = new PlexilParser.nodeParameterName_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token NCNAME273=null;

		PlexilTreeNode NCNAME273_tree=null;

		try {
			// antlr/Plexil.g:786:19: ( NCNAME )
			// antlr/Plexil.g:786:21: NCNAME
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			NCNAME273=(Token)match(input,NCNAME,FOLLOW_NCNAME_in_nodeParameterName4309); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			NCNAME273_tree = (PlexilTreeNode)adaptor.create(NCNAME273);
			adaptor.addChild(root_0, NCNAME273_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "nodeParameterName"


	public static class expression_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "expression"
	// antlr/Plexil.g:797:1: expression : logicalOr ;
	public final PlexilParser.expression_return expression() throws RecognitionException {
		PlexilParser.expression_return retval = new PlexilParser.expression_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		ParserRuleReturnScope logicalOr274 =null;


		 m_paraphrases.push("in expression"); 
		try {
			// antlr/Plexil.g:800:2: ( logicalOr )
			// antlr/Plexil.g:800:4: logicalOr
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			pushFollow(FOLLOW_logicalOr_in_expression4338);
			logicalOr274=logicalOr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, logicalOr274.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { m_paraphrases.pop(); }
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expression"


	public static class logicalOr_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "logicalOr"
	// antlr/Plexil.g:808:1: logicalOr : (o1= logicalXOR -> $o1) ( OR_KYWD on= logicalXOR -> ^( OR_KYWD $logicalOr $on) )* ;
	public final PlexilParser.logicalOr_return logicalOr() throws RecognitionException {
		PlexilParser.logicalOr_return retval = new PlexilParser.logicalOr_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token OR_KYWD275=null;
		ParserRuleReturnScope o1 =null;
		ParserRuleReturnScope on =null;

		PlexilTreeNode OR_KYWD275_tree=null;
		RewriteRuleTokenStream stream_OR_KYWD=new RewriteRuleTokenStream(adaptor,"token OR_KYWD");
		RewriteRuleSubtreeStream stream_logicalXOR=new RewriteRuleSubtreeStream(adaptor,"rule logicalXOR");

		try {
			// antlr/Plexil.g:808:11: ( (o1= logicalXOR -> $o1) ( OR_KYWD on= logicalXOR -> ^( OR_KYWD $logicalOr $on) )* )
			// antlr/Plexil.g:809:4: (o1= logicalXOR -> $o1) ( OR_KYWD on= logicalXOR -> ^( OR_KYWD $logicalOr $on) )*
			{
			// antlr/Plexil.g:809:4: (o1= logicalXOR -> $o1)
			// antlr/Plexil.g:809:6: o1= logicalXOR
			{
			pushFollow(FOLLOW_logicalXOR_in_logicalOr4360);
			o1=logicalXOR();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_logicalXOR.add(o1.getTree());
			// AST REWRITE
			// elements: o1
			// token labels: 
			// rule labels: o1, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_o1=new RewriteRuleSubtreeStream(adaptor,"rule o1",o1!=null?o1.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (PlexilTreeNode)adaptor.nil();
			// 809:20: -> $o1
			{
				adaptor.addChild(root_0, stream_o1.nextTree());
			}


			retval.tree = root_0;
			}

			}

			// antlr/Plexil.g:810:4: ( OR_KYWD on= logicalXOR -> ^( OR_KYWD $logicalOr $on) )*
			loop69:
			while (true) {
				int alt69=2;
				int LA69_0 = input.LA(1);
				if ( (LA69_0==OR_KYWD) ) {
					alt69=1;
				}

				switch (alt69) {
				case 1 :
					// antlr/Plexil.g:810:6: OR_KYWD on= logicalXOR
					{
					OR_KYWD275=(Token)match(input,OR_KYWD,FOLLOW_OR_KYWD_in_logicalOr4374); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_OR_KYWD.add(OR_KYWD275);

					pushFollow(FOLLOW_logicalXOR_in_logicalOr4378);
					on=logicalXOR();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_logicalXOR.add(on.getTree());
					// AST REWRITE
					// elements: on, OR_KYWD, logicalOr
					// token labels: 
					// rule labels: retval, on
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_on=new RewriteRuleSubtreeStream(adaptor,"rule on",on!=null?on.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 811:6: -> ^( OR_KYWD $logicalOr $on)
					{
						// antlr/Plexil.g:811:9: ^( OR_KYWD $logicalOr $on)
						{
						PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
						root_1 = (PlexilTreeNode)adaptor.becomeRoot(stream_OR_KYWD.nextNode(), root_1);
						adaptor.addChild(root_1, stream_retval.nextTree());
						adaptor.addChild(root_1, stream_on.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

				default :
					break loop69;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "logicalOr"


	public static class logicalXOR_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "logicalXOR"
	// antlr/Plexil.g:817:1: logicalXOR : (x1= logicalAnd -> $x1) ( XOR_KYWD xn= logicalAnd -> ^( XOR_KYWD $logicalXOR $xn) )* ;
	public final PlexilParser.logicalXOR_return logicalXOR() throws RecognitionException {
		PlexilParser.logicalXOR_return retval = new PlexilParser.logicalXOR_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token XOR_KYWD276=null;
		ParserRuleReturnScope x1 =null;
		ParserRuleReturnScope xn =null;

		PlexilTreeNode XOR_KYWD276_tree=null;
		RewriteRuleTokenStream stream_XOR_KYWD=new RewriteRuleTokenStream(adaptor,"token XOR_KYWD");
		RewriteRuleSubtreeStream stream_logicalAnd=new RewriteRuleSubtreeStream(adaptor,"rule logicalAnd");

		try {
			// antlr/Plexil.g:817:12: ( (x1= logicalAnd -> $x1) ( XOR_KYWD xn= logicalAnd -> ^( XOR_KYWD $logicalXOR $xn) )* )
			// antlr/Plexil.g:818:5: (x1= logicalAnd -> $x1) ( XOR_KYWD xn= logicalAnd -> ^( XOR_KYWD $logicalXOR $xn) )*
			{
			// antlr/Plexil.g:818:5: (x1= logicalAnd -> $x1)
			// antlr/Plexil.g:818:7: x1= logicalAnd
			{
			pushFollow(FOLLOW_logicalAnd_in_logicalXOR4421);
			x1=logicalAnd();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_logicalAnd.add(x1.getTree());
			// AST REWRITE
			// elements: x1
			// token labels: 
			// rule labels: x1, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_x1=new RewriteRuleSubtreeStream(adaptor,"rule x1",x1!=null?x1.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (PlexilTreeNode)adaptor.nil();
			// 818:21: -> $x1
			{
				adaptor.addChild(root_0, stream_x1.nextTree());
			}


			retval.tree = root_0;
			}

			}

			// antlr/Plexil.g:819:5: ( XOR_KYWD xn= logicalAnd -> ^( XOR_KYWD $logicalXOR $xn) )*
			loop70:
			while (true) {
				int alt70=2;
				int LA70_0 = input.LA(1);
				if ( (LA70_0==XOR_KYWD) ) {
					alt70=1;
				}

				switch (alt70) {
				case 1 :
					// antlr/Plexil.g:819:7: XOR_KYWD xn= logicalAnd
					{
					XOR_KYWD276=(Token)match(input,XOR_KYWD,FOLLOW_XOR_KYWD_in_logicalXOR4436); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_XOR_KYWD.add(XOR_KYWD276);

					pushFollow(FOLLOW_logicalAnd_in_logicalXOR4440);
					xn=logicalAnd();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_logicalAnd.add(xn.getTree());
					// AST REWRITE
					// elements: XOR_KYWD, logicalXOR, xn
					// token labels: 
					// rule labels: xn, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_xn=new RewriteRuleSubtreeStream(adaptor,"rule xn",xn!=null?xn.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 820:7: -> ^( XOR_KYWD $logicalXOR $xn)
					{
						// antlr/Plexil.g:820:10: ^( XOR_KYWD $logicalXOR $xn)
						{
						PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
						root_1 = (PlexilTreeNode)adaptor.becomeRoot(stream_XOR_KYWD.nextNode(), root_1);
						adaptor.addChild(root_1, stream_retval.nextTree());
						adaptor.addChild(root_1, stream_xn.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

				default :
					break loop70;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "logicalXOR"


	public static class logicalAnd_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "logicalAnd"
	// antlr/Plexil.g:826:1: logicalAnd : (a1= equality -> $a1) ( AND_KYWD an= equality -> ^( AND_KYWD $logicalAnd $an) )* ;
	public final PlexilParser.logicalAnd_return logicalAnd() throws RecognitionException {
		PlexilParser.logicalAnd_return retval = new PlexilParser.logicalAnd_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token AND_KYWD277=null;
		ParserRuleReturnScope a1 =null;
		ParserRuleReturnScope an =null;

		PlexilTreeNode AND_KYWD277_tree=null;
		RewriteRuleTokenStream stream_AND_KYWD=new RewriteRuleTokenStream(adaptor,"token AND_KYWD");
		RewriteRuleSubtreeStream stream_equality=new RewriteRuleSubtreeStream(adaptor,"rule equality");

		try {
			// antlr/Plexil.g:826:12: ( (a1= equality -> $a1) ( AND_KYWD an= equality -> ^( AND_KYWD $logicalAnd $an) )* )
			// antlr/Plexil.g:827:4: (a1= equality -> $a1) ( AND_KYWD an= equality -> ^( AND_KYWD $logicalAnd $an) )*
			{
			// antlr/Plexil.g:827:4: (a1= equality -> $a1)
			// antlr/Plexil.g:827:6: a1= equality
			{
			pushFollow(FOLLOW_equality_in_logicalAnd4485);
			a1=equality();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_equality.add(a1.getTree());
			// AST REWRITE
			// elements: a1
			// token labels: 
			// rule labels: a1, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_a1=new RewriteRuleSubtreeStream(adaptor,"rule a1",a1!=null?a1.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (PlexilTreeNode)adaptor.nil();
			// 827:18: -> $a1
			{
				adaptor.addChild(root_0, stream_a1.nextTree());
			}


			retval.tree = root_0;
			}

			}

			// antlr/Plexil.g:828:4: ( AND_KYWD an= equality -> ^( AND_KYWD $logicalAnd $an) )*
			loop71:
			while (true) {
				int alt71=2;
				int LA71_0 = input.LA(1);
				if ( (LA71_0==AND_KYWD) ) {
					alt71=1;
				}

				switch (alt71) {
				case 1 :
					// antlr/Plexil.g:828:6: AND_KYWD an= equality
					{
					AND_KYWD277=(Token)match(input,AND_KYWD,FOLLOW_AND_KYWD_in_logicalAnd4499); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_AND_KYWD.add(AND_KYWD277);

					pushFollow(FOLLOW_equality_in_logicalAnd4503);
					an=equality();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_equality.add(an.getTree());
					// AST REWRITE
					// elements: AND_KYWD, an, logicalAnd
					// token labels: 
					// rule labels: an, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_an=new RewriteRuleSubtreeStream(adaptor,"rule an",an!=null?an.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 829:6: -> ^( AND_KYWD $logicalAnd $an)
					{
						// antlr/Plexil.g:829:9: ^( AND_KYWD $logicalAnd $an)
						{
						PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
						root_1 = (PlexilTreeNode)adaptor.becomeRoot(stream_AND_KYWD.nextNode(), root_1);
						adaptor.addChild(root_1, stream_retval.nextTree());
						adaptor.addChild(root_1, stream_an.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

				default :
					break loop71;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "logicalAnd"


	public static class equality_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "equality"
	// antlr/Plexil.g:839:1: equality : (e1= relational -> $e1) ( equalityOp en= relational -> ^( equalityOp $equality $en) )? ;
	public final PlexilParser.equality_return equality() throws RecognitionException {
		PlexilParser.equality_return retval = new PlexilParser.equality_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		ParserRuleReturnScope e1 =null;
		ParserRuleReturnScope en =null;
		ParserRuleReturnScope equalityOp278 =null;

		RewriteRuleSubtreeStream stream_equalityOp=new RewriteRuleSubtreeStream(adaptor,"rule equalityOp");
		RewriteRuleSubtreeStream stream_relational=new RewriteRuleSubtreeStream(adaptor,"rule relational");

		try {
			// antlr/Plexil.g:839:10: ( (e1= relational -> $e1) ( equalityOp en= relational -> ^( equalityOp $equality $en) )? )
			// antlr/Plexil.g:840:5: (e1= relational -> $e1) ( equalityOp en= relational -> ^( equalityOp $equality $en) )?
			{
			// antlr/Plexil.g:840:5: (e1= relational -> $e1)
			// antlr/Plexil.g:840:7: e1= relational
			{
			pushFollow(FOLLOW_relational_in_equality4550);
			e1=relational();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_relational.add(e1.getTree());
			// AST REWRITE
			// elements: e1
			// token labels: 
			// rule labels: e1, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_e1=new RewriteRuleSubtreeStream(adaptor,"rule e1",e1!=null?e1.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (PlexilTreeNode)adaptor.nil();
			// 840:21: -> $e1
			{
				adaptor.addChild(root_0, stream_e1.nextTree());
			}


			retval.tree = root_0;
			}

			}

			// antlr/Plexil.g:841:5: ( equalityOp en= relational -> ^( equalityOp $equality $en) )?
			int alt72=2;
			int LA72_0 = input.LA(1);
			if ( (LA72_0==DEQUALS||LA72_0==NEQUALS) ) {
				alt72=1;
			}
			switch (alt72) {
				case 1 :
					// antlr/Plexil.g:841:7: equalityOp en= relational
					{
					pushFollow(FOLLOW_equalityOp_in_equality4564);
					equalityOp278=equalityOp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_equalityOp.add(equalityOp278.getTree());
					pushFollow(FOLLOW_relational_in_equality4568);
					en=relational();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_relational.add(en.getTree());
					// AST REWRITE
					// elements: equalityOp, en, equality
					// token labels: 
					// rule labels: en, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_en=new RewriteRuleSubtreeStream(adaptor,"rule en",en!=null?en.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 842:4: -> ^( equalityOp $equality $en)
					{
						// antlr/Plexil.g:842:7: ^( equalityOp $equality $en)
						{
						PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
						root_1 = (PlexilTreeNode)adaptor.becomeRoot(stream_equalityOp.nextNode(), root_1);
						adaptor.addChild(root_1, stream_retval.nextTree());
						adaptor.addChild(root_1, stream_en.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "equality"


	public static class equalityOp_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "equalityOp"
	// antlr/Plexil.g:846:1: equalityOp : ( DEQUALS | NEQUALS );
	public final PlexilParser.equalityOp_return equalityOp() throws RecognitionException {
		PlexilParser.equalityOp_return retval = new PlexilParser.equalityOp_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token set279=null;

		PlexilTreeNode set279_tree=null;

		try {
			// antlr/Plexil.g:846:12: ( DEQUALS | NEQUALS )
			// antlr/Plexil.g:
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			set279=input.LT(1);
			if ( input.LA(1)==DEQUALS||input.LA(1)==NEQUALS ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (PlexilTreeNode)adaptor.create(set279));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "equalityOp"


	public static class relational_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "relational"
	// antlr/Plexil.g:853:1: relational : (a1= additive -> $a1) ( relationalOp an= additive -> ^( relationalOp $relational $an) )? ;
	public final PlexilParser.relational_return relational() throws RecognitionException {
		PlexilParser.relational_return retval = new PlexilParser.relational_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		ParserRuleReturnScope a1 =null;
		ParserRuleReturnScope an =null;
		ParserRuleReturnScope relationalOp280 =null;

		RewriteRuleSubtreeStream stream_relationalOp=new RewriteRuleSubtreeStream(adaptor,"rule relationalOp");
		RewriteRuleSubtreeStream stream_additive=new RewriteRuleSubtreeStream(adaptor,"rule additive");

		try {
			// antlr/Plexil.g:853:12: ( (a1= additive -> $a1) ( relationalOp an= additive -> ^( relationalOp $relational $an) )? )
			// antlr/Plexil.g:854:5: (a1= additive -> $a1) ( relationalOp an= additive -> ^( relationalOp $relational $an) )?
			{
			// antlr/Plexil.g:854:5: (a1= additive -> $a1)
			// antlr/Plexil.g:854:7: a1= additive
			{
			pushFollow(FOLLOW_additive_in_relational4628);
			a1=additive();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_additive.add(a1.getTree());
			// AST REWRITE
			// elements: a1
			// token labels: 
			// rule labels: a1, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_a1=new RewriteRuleSubtreeStream(adaptor,"rule a1",a1!=null?a1.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (PlexilTreeNode)adaptor.nil();
			// 854:19: -> $a1
			{
				adaptor.addChild(root_0, stream_a1.nextTree());
			}


			retval.tree = root_0;
			}

			}

			// antlr/Plexil.g:855:2: ( relationalOp an= additive -> ^( relationalOp $relational $an) )?
			int alt73=2;
			int LA73_0 = input.LA(1);
			if ( (LA73_0==GEQ||LA73_0==GREATER||(LA73_0 >= LEQ && LA73_0 <= LESS)) ) {
				alt73=1;
			}
			switch (alt73) {
				case 1 :
					// antlr/Plexil.g:855:4: relationalOp an= additive
					{
					pushFollow(FOLLOW_relationalOp_in_relational4640);
					relationalOp280=relationalOp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_relationalOp.add(relationalOp280.getTree());
					pushFollow(FOLLOW_additive_in_relational4644);
					an=additive();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_additive.add(an.getTree());
					// AST REWRITE
					// elements: relational, relationalOp, an
					// token labels: 
					// rule labels: an, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_an=new RewriteRuleSubtreeStream(adaptor,"rule an",an!=null?an.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 856:4: -> ^( relationalOp $relational $an)
					{
						// antlr/Plexil.g:856:7: ^( relationalOp $relational $an)
						{
						PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
						root_1 = (PlexilTreeNode)adaptor.becomeRoot(stream_relationalOp.nextNode(), root_1);
						adaptor.addChild(root_1, stream_retval.nextTree());
						adaptor.addChild(root_1, stream_an.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "relational"


	public static class relationalOp_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "relationalOp"
	// antlr/Plexil.g:860:1: relationalOp : ( GREATER | GEQ | LESS | LEQ );
	public final PlexilParser.relationalOp_return relationalOp() throws RecognitionException {
		PlexilParser.relationalOp_return retval = new PlexilParser.relationalOp_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token set281=null;

		PlexilTreeNode set281_tree=null;

		try {
			// antlr/Plexil.g:860:14: ( GREATER | GEQ | LESS | LEQ )
			// antlr/Plexil.g:
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			set281=input.LT(1);
			if ( input.LA(1)==GEQ||input.LA(1)==GREATER||(input.LA(1) >= LEQ && input.LA(1) <= LESS) ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (PlexilTreeNode)adaptor.create(set281));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "relationalOp"


	public static class additive_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "additive"
	// antlr/Plexil.g:871:1: additive : (m1= multiplicative -> $m1) ( addOp mn= multiplicative -> ^( addOp $additive $mn) )* ;
	public final PlexilParser.additive_return additive() throws RecognitionException {
		PlexilParser.additive_return retval = new PlexilParser.additive_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		ParserRuleReturnScope m1 =null;
		ParserRuleReturnScope mn =null;
		ParserRuleReturnScope addOp282 =null;

		RewriteRuleSubtreeStream stream_addOp=new RewriteRuleSubtreeStream(adaptor,"rule addOp");
		RewriteRuleSubtreeStream stream_multiplicative=new RewriteRuleSubtreeStream(adaptor,"rule multiplicative");

		try {
			// antlr/Plexil.g:871:10: ( (m1= multiplicative -> $m1) ( addOp mn= multiplicative -> ^( addOp $additive $mn) )* )
			// antlr/Plexil.g:872:5: (m1= multiplicative -> $m1) ( addOp mn= multiplicative -> ^( addOp $additive $mn) )*
			{
			// antlr/Plexil.g:872:5: (m1= multiplicative -> $m1)
			// antlr/Plexil.g:872:7: m1= multiplicative
			{
			pushFollow(FOLLOW_multiplicative_in_additive4721);
			m1=multiplicative();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_multiplicative.add(m1.getTree());
			// AST REWRITE
			// elements: m1
			// token labels: 
			// rule labels: m1, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_m1=new RewriteRuleSubtreeStream(adaptor,"rule m1",m1!=null?m1.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (PlexilTreeNode)adaptor.nil();
			// 872:25: -> $m1
			{
				adaptor.addChild(root_0, stream_m1.nextTree());
			}


			retval.tree = root_0;
			}

			}

			// antlr/Plexil.g:873:5: ( addOp mn= multiplicative -> ^( addOp $additive $mn) )*
			loop74:
			while (true) {
				int alt74=2;
				int LA74_0 = input.LA(1);
				if ( (LA74_0==MINUS||LA74_0==PLUS) ) {
					alt74=1;
				}

				switch (alt74) {
				case 1 :
					// antlr/Plexil.g:873:7: addOp mn= multiplicative
					{
					pushFollow(FOLLOW_addOp_in_additive4736);
					addOp282=addOp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_addOp.add(addOp282.getTree());
					pushFollow(FOLLOW_multiplicative_in_additive4740);
					mn=multiplicative();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_multiplicative.add(mn.getTree());
					// AST REWRITE
					// elements: mn, addOp, additive
					// token labels: 
					// rule labels: mn, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_mn=new RewriteRuleSubtreeStream(adaptor,"rule mn",mn!=null?mn.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 874:4: -> ^( addOp $additive $mn)
					{
						// antlr/Plexil.g:874:7: ^( addOp $additive $mn)
						{
						PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
						root_1 = (PlexilTreeNode)adaptor.becomeRoot(stream_addOp.nextNode(), root_1);
						adaptor.addChild(root_1, stream_retval.nextTree());
						adaptor.addChild(root_1, stream_mn.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

				default :
					break loop74;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "additive"


	public static class addOp_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "addOp"
	// antlr/Plexil.g:878:1: addOp : ( PLUS | MINUS );
	public final PlexilParser.addOp_return addOp() throws RecognitionException {
		PlexilParser.addOp_return retval = new PlexilParser.addOp_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token set283=null;

		PlexilTreeNode set283_tree=null;

		try {
			// antlr/Plexil.g:878:7: ( PLUS | MINUS )
			// antlr/Plexil.g:
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			set283=input.LT(1);
			if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (PlexilTreeNode)adaptor.create(set283));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "addOp"


	public static class multiplicative_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "multiplicative"
	// antlr/Plexil.g:885:1: multiplicative : (u1= unary -> $u1) ( multOp un= unary -> ^( multOp $multiplicative $un) )* ;
	public final PlexilParser.multiplicative_return multiplicative() throws RecognitionException {
		PlexilParser.multiplicative_return retval = new PlexilParser.multiplicative_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		ParserRuleReturnScope u1 =null;
		ParserRuleReturnScope un =null;
		ParserRuleReturnScope multOp284 =null;

		RewriteRuleSubtreeStream stream_multOp=new RewriteRuleSubtreeStream(adaptor,"rule multOp");
		RewriteRuleSubtreeStream stream_unary=new RewriteRuleSubtreeStream(adaptor,"rule unary");

		try {
			// antlr/Plexil.g:885:16: ( (u1= unary -> $u1) ( multOp un= unary -> ^( multOp $multiplicative $un) )* )
			// antlr/Plexil.g:886:5: (u1= unary -> $u1) ( multOp un= unary -> ^( multOp $multiplicative $un) )*
			{
			// antlr/Plexil.g:886:5: (u1= unary -> $u1)
			// antlr/Plexil.g:886:7: u1= unary
			{
			pushFollow(FOLLOW_unary_in_multiplicative4801);
			u1=unary();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_unary.add(u1.getTree());
			// AST REWRITE
			// elements: u1
			// token labels: 
			// rule labels: u1, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_u1=new RewriteRuleSubtreeStream(adaptor,"rule u1",u1!=null?u1.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (PlexilTreeNode)adaptor.nil();
			// 886:16: -> $u1
			{
				adaptor.addChild(root_0, stream_u1.nextTree());
			}


			retval.tree = root_0;
			}

			}

			// antlr/Plexil.g:887:5: ( multOp un= unary -> ^( multOp $multiplicative $un) )*
			loop75:
			while (true) {
				int alt75=2;
				int LA75_0 = input.LA(1);
				if ( (LA75_0==ASTERISK||LA75_0==MOD_KYWD||LA75_0==PERCENT||LA75_0==SLASH) ) {
					alt75=1;
				}

				switch (alt75) {
				case 1 :
					// antlr/Plexil.g:887:7: multOp un= unary
					{
					pushFollow(FOLLOW_multOp_in_multiplicative4816);
					multOp284=multOp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_multOp.add(multOp284.getTree());
					pushFollow(FOLLOW_unary_in_multiplicative4820);
					un=unary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_unary.add(un.getTree());
					// AST REWRITE
					// elements: un, multOp, multiplicative
					// token labels: 
					// rule labels: un, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_un=new RewriteRuleSubtreeStream(adaptor,"rule un",un!=null?un.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 888:7: -> ^( multOp $multiplicative $un)
					{
						// antlr/Plexil.g:888:10: ^( multOp $multiplicative $un)
						{
						PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
						root_1 = (PlexilTreeNode)adaptor.becomeRoot(stream_multOp.nextNode(), root_1);
						adaptor.addChild(root_1, stream_retval.nextTree());
						adaptor.addChild(root_1, stream_un.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

				default :
					break loop75;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "multiplicative"


	public static class multOp_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "multOp"
	// antlr/Plexil.g:892:1: multOp : ( ASTERISK | SLASH | PERCENT | MOD_KYWD );
	public final PlexilParser.multOp_return multOp() throws RecognitionException {
		PlexilParser.multOp_return retval = new PlexilParser.multOp_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token set285=null;

		PlexilTreeNode set285_tree=null;

		try {
			// antlr/Plexil.g:892:8: ( ASTERISK | SLASH | PERCENT | MOD_KYWD )
			// antlr/Plexil.g:
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			set285=input.LT(1);
			if ( input.LA(1)==ASTERISK||input.LA(1)==MOD_KYWD||input.LA(1)==PERCENT||input.LA(1)==SLASH ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (PlexilTreeNode)adaptor.create(set285));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "multOp"


	public static class unary_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "unary"
	// antlr/Plexil.g:906:1: unary : ( unaryMinus | unaryOp ^ quantity | quantity );
	public final PlexilParser.unary_return unary() throws RecognitionException {
		PlexilParser.unary_return retval = new PlexilParser.unary_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		ParserRuleReturnScope unaryMinus286 =null;
		ParserRuleReturnScope unaryOp287 =null;
		ParserRuleReturnScope quantity288 =null;
		ParserRuleReturnScope quantity289 =null;


		try {
			// antlr/Plexil.g:906:7: ( unaryMinus | unaryOp ^ quantity | quantity )
			int alt76=3;
			switch ( input.LA(1) ) {
			case MINUS:
				{
				int LA76_1 = input.LA(2);
				if ( (LA76_1==INT) ) {
					alt76=1;
				}
				else if ( (LA76_1==DOUBLE) ) {
					alt76=1;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 76, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case NOT_KYWD:
				{
				alt76=2;
				}
				break;
			case ABS_KYWD:
			case ARRAY_MAX_SIZE_KYWD:
			case ARRAY_SIZE_KYWD:
			case BAR:
			case CEIL_KYWD:
			case CHILD_KYWD:
			case COMMAND_ACCEPTED_KYWD:
			case COMMAND_DENIED_KYWD:
			case COMMAND_FAILED_KYWD:
			case COMMAND_RCVD_KYWD:
			case COMMAND_SENT_KYWD:
			case COMMAND_SUCCESS_KYWD:
			case DATE_KYWD:
			case DOUBLE:
			case DURATION_KYWD:
			case EXECUTING_STATE_KYWD:
			case EXITED_KYWD:
			case FAILING_STATE_KYWD:
			case FAILURE_OUTCOME_KYWD:
			case FALSE_KYWD:
			case FINISHED_STATE_KYWD:
			case FINISHING_STATE_KYWD:
			case FLOOR_KYWD:
			case HASHPAREN:
			case INACTIVE_STATE_KYWD:
			case INT:
			case INTERRUPTED_OUTCOME_KYWD:
			case INVARIANT_CONDITION_FAILED_KYWD:
			case IS_KNOWN_KYWD:
			case ITERATION_ENDED_STATE_KYWD:
			case LOOKUP_KYWD:
			case LOOKUP_NOW_KYWD:
			case LOOKUP_ON_CHANGE_KYWD:
			case LPAREN:
			case MAX_KYWD:
			case MESSAGE_RECEIVED_KYWD:
			case MIN_KYWD:
			case NCNAME:
			case NODE_EXECUTING_KYWD:
			case NODE_FAILED_KYWD:
			case NODE_FINISHED_KYWD:
			case NODE_INACTIVE_KYWD:
			case NODE_INVARIANT_FAILED_KYWD:
			case NODE_ITERATION_ENDED_KYWD:
			case NODE_ITERATION_FAILED_KYWD:
			case NODE_ITERATION_SUCCEEDED_KYWD:
			case NODE_PARENT_FAILED_KYWD:
			case NODE_POSTCONDITION_FAILED_KYWD:
			case NODE_PRECONDITION_FAILED_KYWD:
			case NODE_SKIPPED_KYWD:
			case NODE_SUCCEEDED_KYWD:
			case NODE_WAITING_KYWD:
			case PARENT_EXITED_KYWD:
			case PARENT_FAILED_KYWD:
			case PARENT_KYWD:
			case POST_CONDITION_FAILED_KYWD:
			case PRE_CONDITION_FAILED_KYWD:
			case REAL_TO_INT_KYWD:
			case ROUND_KYWD:
			case SELF_KYWD:
			case SIBLING_KYWD:
			case SKIPPED_OUTCOME_KYWD:
			case SQRT_KYWD:
			case STRING:
			case STRLEN_KYWD:
			case SUCCESS_OUTCOME_KYWD:
			case TRUE_KYWD:
			case TRUNC_KYWD:
			case WAITING_STATE_KYWD:
				{
				alt76=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 76, 0, input);
				throw nvae;
			}
			switch (alt76) {
				case 1 :
					// antlr/Plexil.g:906:9: unaryMinus
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_unaryMinus_in_unary4894);
					unaryMinus286=unaryMinus();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, unaryMinus286.getTree());

					}
					break;
				case 2 :
					// antlr/Plexil.g:907:9: unaryOp ^ quantity
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_unaryOp_in_unary4904);
					unaryOp287=unaryOp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (PlexilTreeNode)adaptor.becomeRoot(unaryOp287.getTree(), root_0);
					pushFollow(FOLLOW_quantity_in_unary4907);
					quantity288=quantity();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, quantity288.getTree());

					}
					break;
				case 3 :
					// antlr/Plexil.g:908:9: quantity
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_quantity_in_unary4917);
					quantity289=quantity();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, quantity289.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "unary"


	public static class unaryOp_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "unaryOp"
	// antlr/Plexil.g:911:1: unaryOp : NOT_KYWD ;
	public final PlexilParser.unaryOp_return unaryOp() throws RecognitionException {
		PlexilParser.unaryOp_return retval = new PlexilParser.unaryOp_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token NOT_KYWD290=null;

		PlexilTreeNode NOT_KYWD290_tree=null;

		try {
			// antlr/Plexil.g:911:9: ( NOT_KYWD )
			// antlr/Plexil.g:911:11: NOT_KYWD
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			NOT_KYWD290=(Token)match(input,NOT_KYWD,FOLLOW_NOT_KYWD_in_unaryOp4932); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			NOT_KYWD290_tree = (PlexilTreeNode)adaptor.create(NOT_KYWD290);
			adaptor.addChild(root_0, NOT_KYWD290_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "unaryOp"


	public static class unaryMinus_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "unaryMinus"
	// antlr/Plexil.g:913:1: unaryMinus : ( ( MINUS i= INT ) -> ^( NEG_INT $i) | ( MINUS d= DOUBLE ) -> ^( NEG_DOUBLE $d) );
	public final PlexilParser.unaryMinus_return unaryMinus() throws RecognitionException {
		PlexilParser.unaryMinus_return retval = new PlexilParser.unaryMinus_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token i=null;
		Token d=null;
		Token MINUS291=null;
		Token MINUS292=null;

		PlexilTreeNode i_tree=null;
		PlexilTreeNode d_tree=null;
		PlexilTreeNode MINUS291_tree=null;
		PlexilTreeNode MINUS292_tree=null;
		RewriteRuleTokenStream stream_DOUBLE=new RewriteRuleTokenStream(adaptor,"token DOUBLE");
		RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
		RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");

		try {
			// antlr/Plexil.g:913:12: ( ( MINUS i= INT ) -> ^( NEG_INT $i) | ( MINUS d= DOUBLE ) -> ^( NEG_DOUBLE $d) )
			int alt77=2;
			int LA77_0 = input.LA(1);
			if ( (LA77_0==MINUS) ) {
				int LA77_1 = input.LA(2);
				if ( (LA77_1==INT) ) {
					alt77=1;
				}
				else if ( (LA77_1==DOUBLE) ) {
					alt77=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 77, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 77, 0, input);
				throw nvae;
			}

			switch (alt77) {
				case 1 :
					// antlr/Plexil.g:913:14: ( MINUS i= INT )
					{
					// antlr/Plexil.g:913:14: ( MINUS i= INT )
					// antlr/Plexil.g:913:15: MINUS i= INT
					{
					MINUS291=(Token)match(input,MINUS,FOLLOW_MINUS_in_unaryMinus4942); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_MINUS.add(MINUS291);

					i=(Token)match(input,INT,FOLLOW_INT_in_unaryMinus4946); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_INT.add(i);

					}

					// AST REWRITE
					// elements: i
					// token labels: i
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleTokenStream stream_i=new RewriteRuleTokenStream(adaptor,"token i",i);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 913:28: -> ^( NEG_INT $i)
					{
						// antlr/Plexil.g:913:31: ^( NEG_INT $i)
						{
						PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
						root_1 = (PlexilTreeNode)adaptor.becomeRoot((PlexilTreeNode)adaptor.create(NEG_INT, "NEG_INT"), root_1);
						adaptor.addChild(root_1, stream_i.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// antlr/Plexil.g:914:14: ( MINUS d= DOUBLE )
					{
					// antlr/Plexil.g:914:14: ( MINUS d= DOUBLE )
					// antlr/Plexil.g:914:15: MINUS d= DOUBLE
					{
					MINUS292=(Token)match(input,MINUS,FOLLOW_MINUS_in_unaryMinus4972); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_MINUS.add(MINUS292);

					d=(Token)match(input,DOUBLE,FOLLOW_DOUBLE_in_unaryMinus4976); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DOUBLE.add(d);

					}

					// AST REWRITE
					// elements: d
					// token labels: d
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleTokenStream stream_d=new RewriteRuleTokenStream(adaptor,"token d",d);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 914:31: -> ^( NEG_DOUBLE $d)
					{
						// antlr/Plexil.g:914:34: ^( NEG_DOUBLE $d)
						{
						PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
						root_1 = (PlexilTreeNode)adaptor.becomeRoot((PlexilTreeNode)adaptor.create(NEG_DOUBLE, "NEG_DOUBLE"), root_1);
						adaptor.addChild(root_1, stream_d.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "unaryMinus"


	public static class dateLiteral_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "dateLiteral"
	// antlr/Plexil.g:917:1: dateLiteral : ( DATE_KYWD LPAREN s= STRING RPAREN ) -> ^( DATE_LITERAL $s) ;
	public final PlexilParser.dateLiteral_return dateLiteral() throws RecognitionException {
		PlexilParser.dateLiteral_return retval = new PlexilParser.dateLiteral_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token s=null;
		Token DATE_KYWD293=null;
		Token LPAREN294=null;
		Token RPAREN295=null;

		PlexilTreeNode s_tree=null;
		PlexilTreeNode DATE_KYWD293_tree=null;
		PlexilTreeNode LPAREN294_tree=null;
		PlexilTreeNode RPAREN295_tree=null;
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleTokenStream stream_DATE_KYWD=new RewriteRuleTokenStream(adaptor,"token DATE_KYWD");

		try {
			// antlr/Plexil.g:917:13: ( ( DATE_KYWD LPAREN s= STRING RPAREN ) -> ^( DATE_LITERAL $s) )
			// antlr/Plexil.g:917:15: ( DATE_KYWD LPAREN s= STRING RPAREN )
			{
			// antlr/Plexil.g:917:15: ( DATE_KYWD LPAREN s= STRING RPAREN )
			// antlr/Plexil.g:917:16: DATE_KYWD LPAREN s= STRING RPAREN
			{
			DATE_KYWD293=(Token)match(input,DATE_KYWD,FOLLOW_DATE_KYWD_in_dateLiteral5007); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_DATE_KYWD.add(DATE_KYWD293);

			LPAREN294=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_dateLiteral5009); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN294);

			s=(Token)match(input,STRING,FOLLOW_STRING_in_dateLiteral5013); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_STRING.add(s);

			RPAREN295=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_dateLiteral5015); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN295);

			}

			// AST REWRITE
			// elements: s
			// token labels: s
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_s=new RewriteRuleTokenStream(adaptor,"token s",s);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (PlexilTreeNode)adaptor.nil();
			// 917:50: -> ^( DATE_LITERAL $s)
			{
				// antlr/Plexil.g:917:53: ^( DATE_LITERAL $s)
				{
				PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
				root_1 = (PlexilTreeNode)adaptor.becomeRoot((PlexilTreeNode)adaptor.create(DATE_LITERAL, "DATE_LITERAL"), root_1);
				adaptor.addChild(root_1, stream_s.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "dateLiteral"


	public static class durationLiteral_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "durationLiteral"
	// antlr/Plexil.g:919:1: durationLiteral : ( DURATION_KYWD LPAREN s= STRING RPAREN ) -> ^( DURATION_LITERAL $s) ;
	public final PlexilParser.durationLiteral_return durationLiteral() throws RecognitionException {
		PlexilParser.durationLiteral_return retval = new PlexilParser.durationLiteral_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token s=null;
		Token DURATION_KYWD296=null;
		Token LPAREN297=null;
		Token RPAREN298=null;

		PlexilTreeNode s_tree=null;
		PlexilTreeNode DURATION_KYWD296_tree=null;
		PlexilTreeNode LPAREN297_tree=null;
		PlexilTreeNode RPAREN298_tree=null;
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_DURATION_KYWD=new RewriteRuleTokenStream(adaptor,"token DURATION_KYWD");
		RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");

		try {
			// antlr/Plexil.g:919:17: ( ( DURATION_KYWD LPAREN s= STRING RPAREN ) -> ^( DURATION_LITERAL $s) )
			// antlr/Plexil.g:919:19: ( DURATION_KYWD LPAREN s= STRING RPAREN )
			{
			// antlr/Plexil.g:919:19: ( DURATION_KYWD LPAREN s= STRING RPAREN )
			// antlr/Plexil.g:919:20: DURATION_KYWD LPAREN s= STRING RPAREN
			{
			DURATION_KYWD296=(Token)match(input,DURATION_KYWD,FOLLOW_DURATION_KYWD_in_durationLiteral5035); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_DURATION_KYWD.add(DURATION_KYWD296);

			LPAREN297=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_durationLiteral5037); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN297);

			s=(Token)match(input,STRING,FOLLOW_STRING_in_durationLiteral5041); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_STRING.add(s);

			RPAREN298=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_durationLiteral5043); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN298);

			}

			// AST REWRITE
			// elements: s
			// token labels: s
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_s=new RewriteRuleTokenStream(adaptor,"token s",s);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (PlexilTreeNode)adaptor.nil();
			// 919:58: -> ^( DURATION_LITERAL $s)
			{
				// antlr/Plexil.g:919:61: ^( DURATION_LITERAL $s)
				{
				PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
				root_1 = (PlexilTreeNode)adaptor.becomeRoot((PlexilTreeNode)adaptor.create(DURATION_LITERAL, "DURATION_LITERAL"), root_1);
				adaptor.addChild(root_1, stream_s.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "durationLiteral"


	public static class quantity_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "quantity"
	// antlr/Plexil.g:927:1: quantity : ( LPAREN ! expression RPAREN !| BAR expression BAR -> ^( ABS_KYWD expression ) | oneArgFn ^ LPAREN ! expression RPAREN !| twoArgFn ^ LPAREN ! expression COMMA ! expression RPAREN !| isKnownExp | ( lookupExpr LBRACKET )=> lookupArrayReference | lookupExpr | messageReceivedExp | nodeStatePredicateExp | ( ( NCNAME | SELF_KYWD | PARENT_KYWD ) PERIOD COMMAND_HANDLE_KYWD )=> nodeCommandHandleVariable | ( ( NCNAME | SELF_KYWD | PARENT_KYWD ) PERIOD FAILURE_KYWD )=> nodeFailureVariable | ( ( NCNAME | SELF_KYWD | PARENT_KYWD ) PERIOD OUTCOME_KYWD )=> nodeOutcomeVariable | ( ( NCNAME | SELF_KYWD | PARENT_KYWD ) PERIOD STATE_KYWD )=> nodeStateVariable | ( ( NCNAME | SELF_KYWD | PARENT_KYWD ) PERIOD nodeStateKywd )=> nodeTimepointValue | ( NCNAME LBRACKET )=> simpleArrayReference | variable | ( ( CHILD_KYWD | SIBLING_KYWD ) LPAREN NCNAME RPAREN PERIOD COMMAND_HANDLE_KYWD )=> nodeCommandHandleVariable | ( ( CHILD_KYWD | SIBLING_KYWD ) LPAREN NCNAME RPAREN PERIOD FAILURE_KYWD )=> nodeFailureVariable | ( ( CHILD_KYWD | SIBLING_KYWD ) LPAREN NCNAME RPAREN PERIOD OUTCOME_KYWD )=> nodeOutcomeVariable | ( ( CHILD_KYWD | SIBLING_KYWD ) LPAREN NCNAME RPAREN PERIOD STATE_KYWD )=> nodeStateVariable | ( ( CHILD_KYWD | SIBLING_KYWD ) LPAREN NCNAME RPAREN PERIOD nodeStateKywd )=> nodeTimepointValue | literalValue | nodeCommandHandleKywd | nodeFailureKywd | nodeStateKywd | nodeOutcomeKywd );
	public final PlexilParser.quantity_return quantity() throws RecognitionException {
		PlexilParser.quantity_return retval = new PlexilParser.quantity_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token LPAREN299=null;
		Token RPAREN301=null;
		Token BAR302=null;
		Token BAR304=null;
		Token LPAREN306=null;
		Token RPAREN308=null;
		Token LPAREN310=null;
		Token COMMA312=null;
		Token RPAREN314=null;
		ParserRuleReturnScope expression300 =null;
		ParserRuleReturnScope expression303 =null;
		ParserRuleReturnScope oneArgFn305 =null;
		ParserRuleReturnScope expression307 =null;
		ParserRuleReturnScope twoArgFn309 =null;
		ParserRuleReturnScope expression311 =null;
		ParserRuleReturnScope expression313 =null;
		ParserRuleReturnScope isKnownExp315 =null;
		ParserRuleReturnScope lookupArrayReference316 =null;
		ParserRuleReturnScope lookupExpr317 =null;
		ParserRuleReturnScope messageReceivedExp318 =null;
		ParserRuleReturnScope nodeStatePredicateExp319 =null;
		ParserRuleReturnScope nodeCommandHandleVariable320 =null;
		ParserRuleReturnScope nodeFailureVariable321 =null;
		ParserRuleReturnScope nodeOutcomeVariable322 =null;
		ParserRuleReturnScope nodeStateVariable323 =null;
		ParserRuleReturnScope nodeTimepointValue324 =null;
		ParserRuleReturnScope simpleArrayReference325 =null;
		ParserRuleReturnScope variable326 =null;
		ParserRuleReturnScope nodeCommandHandleVariable327 =null;
		ParserRuleReturnScope nodeFailureVariable328 =null;
		ParserRuleReturnScope nodeOutcomeVariable329 =null;
		ParserRuleReturnScope nodeStateVariable330 =null;
		ParserRuleReturnScope nodeTimepointValue331 =null;
		ParserRuleReturnScope literalValue332 =null;
		ParserRuleReturnScope nodeCommandHandleKywd333 =null;
		ParserRuleReturnScope nodeFailureKywd334 =null;
		ParserRuleReturnScope nodeStateKywd335 =null;
		ParserRuleReturnScope nodeOutcomeKywd336 =null;

		PlexilTreeNode LPAREN299_tree=null;
		PlexilTreeNode RPAREN301_tree=null;
		PlexilTreeNode BAR302_tree=null;
		PlexilTreeNode BAR304_tree=null;
		PlexilTreeNode LPAREN306_tree=null;
		PlexilTreeNode RPAREN308_tree=null;
		PlexilTreeNode LPAREN310_tree=null;
		PlexilTreeNode COMMA312_tree=null;
		PlexilTreeNode RPAREN314_tree=null;
		RewriteRuleTokenStream stream_BAR=new RewriteRuleTokenStream(adaptor,"token BAR");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		try {
			// antlr/Plexil.g:927:10: ( LPAREN ! expression RPAREN !| BAR expression BAR -> ^( ABS_KYWD expression ) | oneArgFn ^ LPAREN ! expression RPAREN !| twoArgFn ^ LPAREN ! expression COMMA ! expression RPAREN !| isKnownExp | ( lookupExpr LBRACKET )=> lookupArrayReference | lookupExpr | messageReceivedExp | nodeStatePredicateExp | ( ( NCNAME | SELF_KYWD | PARENT_KYWD ) PERIOD COMMAND_HANDLE_KYWD )=> nodeCommandHandleVariable | ( ( NCNAME | SELF_KYWD | PARENT_KYWD ) PERIOD FAILURE_KYWD )=> nodeFailureVariable | ( ( NCNAME | SELF_KYWD | PARENT_KYWD ) PERIOD OUTCOME_KYWD )=> nodeOutcomeVariable | ( ( NCNAME | SELF_KYWD | PARENT_KYWD ) PERIOD STATE_KYWD )=> nodeStateVariable | ( ( NCNAME | SELF_KYWD | PARENT_KYWD ) PERIOD nodeStateKywd )=> nodeTimepointValue | ( NCNAME LBRACKET )=> simpleArrayReference | variable | ( ( CHILD_KYWD | SIBLING_KYWD ) LPAREN NCNAME RPAREN PERIOD COMMAND_HANDLE_KYWD )=> nodeCommandHandleVariable | ( ( CHILD_KYWD | SIBLING_KYWD ) LPAREN NCNAME RPAREN PERIOD FAILURE_KYWD )=> nodeFailureVariable | ( ( CHILD_KYWD | SIBLING_KYWD ) LPAREN NCNAME RPAREN PERIOD OUTCOME_KYWD )=> nodeOutcomeVariable | ( ( CHILD_KYWD | SIBLING_KYWD ) LPAREN NCNAME RPAREN PERIOD STATE_KYWD )=> nodeStateVariable | ( ( CHILD_KYWD | SIBLING_KYWD ) LPAREN NCNAME RPAREN PERIOD nodeStateKywd )=> nodeTimepointValue | literalValue | nodeCommandHandleKywd | nodeFailureKywd | nodeStateKywd | nodeOutcomeKywd )
			int alt78=26;
			alt78 = dfa78.predict(input);
			switch (alt78) {
				case 1 :
					// antlr/Plexil.g:928:5: LPAREN ! expression RPAREN !
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					LPAREN299=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_quantity5072); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_quantity5075);
					expression300=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression300.getTree());

					RPAREN301=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_quantity5077); if (state.failed) return retval;
					}
					break;
				case 2 :
					// antlr/Plexil.g:929:5: BAR expression BAR
					{
					BAR302=(Token)match(input,BAR,FOLLOW_BAR_in_quantity5084); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_BAR.add(BAR302);

					pushFollow(FOLLOW_expression_in_quantity5086);
					expression303=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression303.getTree());
					BAR304=(Token)match(input,BAR,FOLLOW_BAR_in_quantity5088); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_BAR.add(BAR304);

					// AST REWRITE
					// elements: expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (PlexilTreeNode)adaptor.nil();
					// 929:24: -> ^( ABS_KYWD expression )
					{
						// antlr/Plexil.g:929:27: ^( ABS_KYWD expression )
						{
						PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
						root_1 = (PlexilTreeNode)adaptor.becomeRoot((PlexilTreeNode)adaptor.create(ABS_KYWD, "ABS_KYWD"), root_1);
						adaptor.addChild(root_1, stream_expression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// antlr/Plexil.g:930:5: oneArgFn ^ LPAREN ! expression RPAREN !
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_oneArgFn_in_quantity5102);
					oneArgFn305=oneArgFn();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (PlexilTreeNode)adaptor.becomeRoot(oneArgFn305.getTree(), root_0);
					LPAREN306=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_quantity5105); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_quantity5108);
					expression307=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression307.getTree());

					RPAREN308=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_quantity5110); if (state.failed) return retval;
					}
					break;
				case 4 :
					// antlr/Plexil.g:931:5: twoArgFn ^ LPAREN ! expression COMMA ! expression RPAREN !
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_twoArgFn_in_quantity5117);
					twoArgFn309=twoArgFn();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (PlexilTreeNode)adaptor.becomeRoot(twoArgFn309.getTree(), root_0);
					LPAREN310=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_quantity5120); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_quantity5123);
					expression311=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression311.getTree());

					COMMA312=(Token)match(input,COMMA,FOLLOW_COMMA_in_quantity5125); if (state.failed) return retval;
					pushFollow(FOLLOW_expression_in_quantity5128);
					expression313=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression313.getTree());

					RPAREN314=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_quantity5130); if (state.failed) return retval;
					}
					break;
				case 5 :
					// antlr/Plexil.g:932:5: isKnownExp
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_isKnownExp_in_quantity5137);
					isKnownExp315=isKnownExp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, isKnownExp315.getTree());

					}
					break;
				case 6 :
					// antlr/Plexil.g:933:5: ( lookupExpr LBRACKET )=> lookupArrayReference
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_lookupArrayReference_in_quantity5151);
					lookupArrayReference316=lookupArrayReference();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, lookupArrayReference316.getTree());

					}
					break;
				case 7 :
					// antlr/Plexil.g:934:5: lookupExpr
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_lookupExpr_in_quantity5157);
					lookupExpr317=lookupExpr();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, lookupExpr317.getTree());

					}
					break;
				case 8 :
					// antlr/Plexil.g:935:5: messageReceivedExp
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_messageReceivedExp_in_quantity5163);
					messageReceivedExp318=messageReceivedExp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, messageReceivedExp318.getTree());

					}
					break;
				case 9 :
					// antlr/Plexil.g:936:5: nodeStatePredicateExp
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_nodeStatePredicateExp_in_quantity5169);
					nodeStatePredicateExp319=nodeStatePredicateExp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, nodeStatePredicateExp319.getTree());

					}
					break;
				case 10 :
					// antlr/Plexil.g:937:5: ( ( NCNAME | SELF_KYWD | PARENT_KYWD ) PERIOD COMMAND_HANDLE_KYWD )=> nodeCommandHandleVariable
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_nodeCommandHandleVariable_in_quantity5196);
					nodeCommandHandleVariable320=nodeCommandHandleVariable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, nodeCommandHandleVariable320.getTree());

					}
					break;
				case 11 :
					// antlr/Plexil.g:938:5: ( ( NCNAME | SELF_KYWD | PARENT_KYWD ) PERIOD FAILURE_KYWD )=> nodeFailureVariable
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_nodeFailureVariable_in_quantity5223);
					nodeFailureVariable321=nodeFailureVariable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, nodeFailureVariable321.getTree());

					}
					break;
				case 12 :
					// antlr/Plexil.g:939:5: ( ( NCNAME | SELF_KYWD | PARENT_KYWD ) PERIOD OUTCOME_KYWD )=> nodeOutcomeVariable
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_nodeOutcomeVariable_in_quantity5250);
					nodeOutcomeVariable322=nodeOutcomeVariable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, nodeOutcomeVariable322.getTree());

					}
					break;
				case 13 :
					// antlr/Plexil.g:940:5: ( ( NCNAME | SELF_KYWD | PARENT_KYWD ) PERIOD STATE_KYWD )=> nodeStateVariable
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_nodeStateVariable_in_quantity5277);
					nodeStateVariable323=nodeStateVariable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, nodeStateVariable323.getTree());

					}
					break;
				case 14 :
					// antlr/Plexil.g:941:5: ( ( NCNAME | SELF_KYWD | PARENT_KYWD ) PERIOD nodeStateKywd )=> nodeTimepointValue
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_nodeTimepointValue_in_quantity5304);
					nodeTimepointValue324=nodeTimepointValue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, nodeTimepointValue324.getTree());

					}
					break;
				case 15 :
					// antlr/Plexil.g:942:5: ( NCNAME LBRACKET )=> simpleArrayReference
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_simpleArrayReference_in_quantity5318);
					simpleArrayReference325=simpleArrayReference();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, simpleArrayReference325.getTree());

					}
					break;
				case 16 :
					// antlr/Plexil.g:943:5: variable
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_variable_in_quantity5324);
					variable326=variable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variable326.getTree());

					}
					break;
				case 17 :
					// antlr/Plexil.g:945:5: ( ( CHILD_KYWD | SIBLING_KYWD ) LPAREN NCNAME RPAREN PERIOD COMMAND_HANDLE_KYWD )=> nodeCommandHandleVariable
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_nodeCommandHandleVariable_in_quantity5354);
					nodeCommandHandleVariable327=nodeCommandHandleVariable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, nodeCommandHandleVariable327.getTree());

					}
					break;
				case 18 :
					// antlr/Plexil.g:946:5: ( ( CHILD_KYWD | SIBLING_KYWD ) LPAREN NCNAME RPAREN PERIOD FAILURE_KYWD )=> nodeFailureVariable
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_nodeFailureVariable_in_quantity5383);
					nodeFailureVariable328=nodeFailureVariable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, nodeFailureVariable328.getTree());

					}
					break;
				case 19 :
					// antlr/Plexil.g:947:5: ( ( CHILD_KYWD | SIBLING_KYWD ) LPAREN NCNAME RPAREN PERIOD OUTCOME_KYWD )=> nodeOutcomeVariable
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_nodeOutcomeVariable_in_quantity5412);
					nodeOutcomeVariable329=nodeOutcomeVariable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, nodeOutcomeVariable329.getTree());

					}
					break;
				case 20 :
					// antlr/Plexil.g:948:5: ( ( CHILD_KYWD | SIBLING_KYWD ) LPAREN NCNAME RPAREN PERIOD STATE_KYWD )=> nodeStateVariable
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_nodeStateVariable_in_quantity5441);
					nodeStateVariable330=nodeStateVariable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, nodeStateVariable330.getTree());

					}
					break;
				case 21 :
					// antlr/Plexil.g:949:5: ( ( CHILD_KYWD | SIBLING_KYWD ) LPAREN NCNAME RPAREN PERIOD nodeStateKywd )=> nodeTimepointValue
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_nodeTimepointValue_in_quantity5470);
					nodeTimepointValue331=nodeTimepointValue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, nodeTimepointValue331.getTree());

					}
					break;
				case 22 :
					// antlr/Plexil.g:950:5: literalValue
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_literalValue_in_quantity5476);
					literalValue332=literalValue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, literalValue332.getTree());

					}
					break;
				case 23 :
					// antlr/Plexil.g:951:5: nodeCommandHandleKywd
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_nodeCommandHandleKywd_in_quantity5482);
					nodeCommandHandleKywd333=nodeCommandHandleKywd();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, nodeCommandHandleKywd333.getTree());

					}
					break;
				case 24 :
					// antlr/Plexil.g:952:5: nodeFailureKywd
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_nodeFailureKywd_in_quantity5488);
					nodeFailureKywd334=nodeFailureKywd();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, nodeFailureKywd334.getTree());

					}
					break;
				case 25 :
					// antlr/Plexil.g:953:5: nodeStateKywd
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_nodeStateKywd_in_quantity5494);
					nodeStateKywd335=nodeStateKywd();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, nodeStateKywd335.getTree());

					}
					break;
				case 26 :
					// antlr/Plexil.g:954:5: nodeOutcomeKywd
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_nodeOutcomeKywd_in_quantity5500);
					nodeOutcomeKywd336=nodeOutcomeKywd();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, nodeOutcomeKywd336.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "quantity"


	public static class oneArgFn_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "oneArgFn"
	// antlr/Plexil.g:958:1: oneArgFn : ( SQRT_KYWD | ABS_KYWD | CEIL_KYWD | FLOOR_KYWD | ROUND_KYWD | TRUNC_KYWD | REAL_TO_INT_KYWD | STRLEN_KYWD | ARRAY_SIZE_KYWD | ARRAY_MAX_SIZE_KYWD );
	public final PlexilParser.oneArgFn_return oneArgFn() throws RecognitionException {
		PlexilParser.oneArgFn_return retval = new PlexilParser.oneArgFn_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token set337=null;

		PlexilTreeNode set337_tree=null;

		try {
			// antlr/Plexil.g:958:10: ( SQRT_KYWD | ABS_KYWD | CEIL_KYWD | FLOOR_KYWD | ROUND_KYWD | TRUNC_KYWD | REAL_TO_INT_KYWD | STRLEN_KYWD | ARRAY_SIZE_KYWD | ARRAY_MAX_SIZE_KYWD )
			// antlr/Plexil.g:
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			set337=input.LT(1);
			if ( input.LA(1)==ABS_KYWD||input.LA(1)==ARRAY_MAX_SIZE_KYWD||input.LA(1)==ARRAY_SIZE_KYWD||input.LA(1)==CEIL_KYWD||input.LA(1)==FLOOR_KYWD||input.LA(1)==REAL_TO_INT_KYWD||input.LA(1)==ROUND_KYWD||input.LA(1)==SQRT_KYWD||input.LA(1)==STRLEN_KYWD||input.LA(1)==TRUNC_KYWD ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (PlexilTreeNode)adaptor.create(set337));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "oneArgFn"


	public static class twoArgFn_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "twoArgFn"
	// antlr/Plexil.g:971:1: twoArgFn : ( MAX_KYWD | MIN_KYWD );
	public final PlexilParser.twoArgFn_return twoArgFn() throws RecognitionException {
		PlexilParser.twoArgFn_return retval = new PlexilParser.twoArgFn_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token set338=null;

		PlexilTreeNode set338_tree=null;

		try {
			// antlr/Plexil.g:971:10: ( MAX_KYWD | MIN_KYWD )
			// antlr/Plexil.g:
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			set338=input.LT(1);
			if ( input.LA(1)==MAX_KYWD||input.LA(1)==MIN_KYWD ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (PlexilTreeNode)adaptor.create(set338));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "twoArgFn"


	public static class isKnownExp_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "isKnownExp"
	// antlr/Plexil.g:975:1: isKnownExp : IS_KNOWN_KYWD ^ LPAREN ! quantity RPAREN !;
	public final PlexilParser.isKnownExp_return isKnownExp() throws RecognitionException {
		PlexilParser.isKnownExp_return retval = new PlexilParser.isKnownExp_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token IS_KNOWN_KYWD339=null;
		Token LPAREN340=null;
		Token RPAREN342=null;
		ParserRuleReturnScope quantity341 =null;

		PlexilTreeNode IS_KNOWN_KYWD339_tree=null;
		PlexilTreeNode LPAREN340_tree=null;
		PlexilTreeNode RPAREN342_tree=null;

		try {
			// antlr/Plexil.g:975:12: ( IS_KNOWN_KYWD ^ LPAREN ! quantity RPAREN !)
			// antlr/Plexil.g:976:4: IS_KNOWN_KYWD ^ LPAREN ! quantity RPAREN !
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			IS_KNOWN_KYWD339=(Token)match(input,IS_KNOWN_KYWD,FOLLOW_IS_KNOWN_KYWD_in_isKnownExp5601); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IS_KNOWN_KYWD339_tree = new IsKnownNode(IS_KNOWN_KYWD339) ;
			root_0 = (PlexilTreeNode)adaptor.becomeRoot(IS_KNOWN_KYWD339_tree, root_0);
			}

			LPAREN340=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_isKnownExp5607); if (state.failed) return retval;
			pushFollow(FOLLOW_quantity_in_isKnownExp5610);
			quantity341=quantity();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, quantity341.getTree());

			RPAREN342=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_isKnownExp5612); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "isKnownExp"


	public static class nodeStatePredicate_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "nodeStatePredicate"
	// antlr/Plexil.g:978:1: nodeStatePredicate : ( NODE_EXECUTING_KYWD | NODE_FAILED_KYWD | NODE_FINISHED_KYWD | NODE_INACTIVE_KYWD | NODE_INVARIANT_FAILED_KYWD | NODE_ITERATION_ENDED_KYWD | NODE_ITERATION_FAILED_KYWD | NODE_ITERATION_SUCCEEDED_KYWD | NODE_PARENT_FAILED_KYWD | NODE_POSTCONDITION_FAILED_KYWD | NODE_PRECONDITION_FAILED_KYWD | NODE_SKIPPED_KYWD | NODE_SUCCEEDED_KYWD | NODE_WAITING_KYWD );
	public final PlexilParser.nodeStatePredicate_return nodeStatePredicate() throws RecognitionException {
		PlexilParser.nodeStatePredicate_return retval = new PlexilParser.nodeStatePredicate_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token set343=null;

		PlexilTreeNode set343_tree=null;

		try {
			// antlr/Plexil.g:978:20: ( NODE_EXECUTING_KYWD | NODE_FAILED_KYWD | NODE_FINISHED_KYWD | NODE_INACTIVE_KYWD | NODE_INVARIANT_FAILED_KYWD | NODE_ITERATION_ENDED_KYWD | NODE_ITERATION_FAILED_KYWD | NODE_ITERATION_SUCCEEDED_KYWD | NODE_PARENT_FAILED_KYWD | NODE_POSTCONDITION_FAILED_KYWD | NODE_PRECONDITION_FAILED_KYWD | NODE_SKIPPED_KYWD | NODE_SUCCEEDED_KYWD | NODE_WAITING_KYWD )
			// antlr/Plexil.g:
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			set343=input.LT(1);
			if ( (input.LA(1) >= NODE_EXECUTING_KYWD && input.LA(1) <= NODE_FINISHED_KYWD)||(input.LA(1) >= NODE_INACTIVE_KYWD && input.LA(1) <= NODE_SUCCEEDED_KYWD)||input.LA(1)==NODE_WAITING_KYWD ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (PlexilTreeNode)adaptor.create(set343));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "nodeStatePredicate"


	public static class nodeStatePredicateExp_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "nodeStatePredicateExp"
	// antlr/Plexil.g:995:1: nodeStatePredicateExp : nodeStatePredicate ^ LPAREN ! nodeReference RPAREN !;
	public final PlexilParser.nodeStatePredicateExp_return nodeStatePredicateExp() throws RecognitionException {
		PlexilParser.nodeStatePredicateExp_return retval = new PlexilParser.nodeStatePredicateExp_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token LPAREN345=null;
		Token RPAREN347=null;
		ParserRuleReturnScope nodeStatePredicate344 =null;
		ParserRuleReturnScope nodeReference346 =null;

		PlexilTreeNode LPAREN345_tree=null;
		PlexilTreeNode RPAREN347_tree=null;

		try {
			// antlr/Plexil.g:995:23: ( nodeStatePredicate ^ LPAREN ! nodeReference RPAREN !)
			// antlr/Plexil.g:995:25: nodeStatePredicate ^ LPAREN ! nodeReference RPAREN !
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			pushFollow(FOLLOW_nodeStatePredicate_in_nodeStatePredicateExp5714);
			nodeStatePredicate344=nodeStatePredicate();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) root_0 = (PlexilTreeNode)adaptor.becomeRoot(nodeStatePredicate344.getTree(), root_0);
			LPAREN345=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_nodeStatePredicateExp5717); if (state.failed) return retval;
			pushFollow(FOLLOW_nodeReference_in_nodeStatePredicateExp5720);
			nodeReference346=nodeReference();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, nodeReference346.getTree());

			RPAREN347=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_nodeStatePredicateExp5722); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "nodeStatePredicateExp"


	public static class nodeStateKywd_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "nodeStateKywd"
	// antlr/Plexil.g:997:1: nodeStateKywd : ( EXECUTING_STATE_KYWD | FAILING_STATE_KYWD | FINISHED_STATE_KYWD | FINISHING_STATE_KYWD | INACTIVE_STATE_KYWD | ITERATION_ENDED_STATE_KYWD | WAITING_STATE_KYWD );
	public final PlexilParser.nodeStateKywd_return nodeStateKywd() throws RecognitionException {
		PlexilParser.nodeStateKywd_return retval = new PlexilParser.nodeStateKywd_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token set348=null;

		PlexilTreeNode set348_tree=null;

		try {
			// antlr/Plexil.g:997:15: ( EXECUTING_STATE_KYWD | FAILING_STATE_KYWD | FINISHED_STATE_KYWD | FINISHING_STATE_KYWD | INACTIVE_STATE_KYWD | ITERATION_ENDED_STATE_KYWD | WAITING_STATE_KYWD )
			// antlr/Plexil.g:
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			set348=input.LT(1);
			if ( input.LA(1)==EXECUTING_STATE_KYWD||input.LA(1)==FAILING_STATE_KYWD||(input.LA(1) >= FINISHED_STATE_KYWD && input.LA(1) <= FINISHING_STATE_KYWD)||input.LA(1)==INACTIVE_STATE_KYWD||input.LA(1)==ITERATION_ENDED_STATE_KYWD||input.LA(1)==WAITING_STATE_KYWD ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (PlexilTreeNode)adaptor.create(set348));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "nodeStateKywd"


	public static class messageReceivedExp_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "messageReceivedExp"
	// antlr/Plexil.g:1007:1: messageReceivedExp : MESSAGE_RECEIVED_KYWD ^ LPAREN ! STRING RPAREN !;
	public final PlexilParser.messageReceivedExp_return messageReceivedExp() throws RecognitionException {
		PlexilParser.messageReceivedExp_return retval = new PlexilParser.messageReceivedExp_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token MESSAGE_RECEIVED_KYWD349=null;
		Token LPAREN350=null;
		Token STRING351=null;
		Token RPAREN352=null;

		PlexilTreeNode MESSAGE_RECEIVED_KYWD349_tree=null;
		PlexilTreeNode LPAREN350_tree=null;
		PlexilTreeNode STRING351_tree=null;
		PlexilTreeNode RPAREN352_tree=null;

		try {
			// antlr/Plexil.g:1007:20: ( MESSAGE_RECEIVED_KYWD ^ LPAREN ! STRING RPAREN !)
			// antlr/Plexil.g:1008:3: MESSAGE_RECEIVED_KYWD ^ LPAREN ! STRING RPAREN !
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			MESSAGE_RECEIVED_KYWD349=(Token)match(input,MESSAGE_RECEIVED_KYWD,FOLLOW_MESSAGE_RECEIVED_KYWD_in_messageReceivedExp5792); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			MESSAGE_RECEIVED_KYWD349_tree = (PlexilTreeNode)adaptor.create(MESSAGE_RECEIVED_KYWD349);
			root_0 = (PlexilTreeNode)adaptor.becomeRoot(MESSAGE_RECEIVED_KYWD349_tree, root_0);
			}

			LPAREN350=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_messageReceivedExp5795); if (state.failed) return retval;
			STRING351=(Token)match(input,STRING,FOLLOW_STRING_in_messageReceivedExp5798); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			STRING351_tree = (PlexilTreeNode)adaptor.create(STRING351);
			adaptor.addChild(root_0, STRING351_tree);
			}

			RPAREN352=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_messageReceivedExp5800); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "messageReceivedExp"


	public static class nodeState_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "nodeState"
	// antlr/Plexil.g:1011:1: nodeState : ( nodeStateVariable | nodeStateKywd );
	public final PlexilParser.nodeState_return nodeState() throws RecognitionException {
		PlexilParser.nodeState_return retval = new PlexilParser.nodeState_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		ParserRuleReturnScope nodeStateVariable353 =null;
		ParserRuleReturnScope nodeStateKywd354 =null;


		try {
			// antlr/Plexil.g:1011:11: ( nodeStateVariable | nodeStateKywd )
			int alt79=2;
			int LA79_0 = input.LA(1);
			if ( (LA79_0==CHILD_KYWD||LA79_0==NCNAME||LA79_0==PARENT_KYWD||LA79_0==SELF_KYWD||LA79_0==SIBLING_KYWD) ) {
				alt79=1;
			}
			else if ( (LA79_0==EXECUTING_STATE_KYWD||LA79_0==FAILING_STATE_KYWD||(LA79_0 >= FINISHED_STATE_KYWD && LA79_0 <= FINISHING_STATE_KYWD)||LA79_0==INACTIVE_STATE_KYWD||LA79_0==ITERATION_ENDED_STATE_KYWD||LA79_0==WAITING_STATE_KYWD) ) {
				alt79=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 79, 0, input);
				throw nvae;
			}

			switch (alt79) {
				case 1 :
					// antlr/Plexil.g:1011:13: nodeStateVariable
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_nodeStateVariable_in_nodeState5811);
					nodeStateVariable353=nodeStateVariable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, nodeStateVariable353.getTree());

					}
					break;
				case 2 :
					// antlr/Plexil.g:1011:33: nodeStateKywd
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_nodeStateKywd_in_nodeState5815);
					nodeStateKywd354=nodeStateKywd();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, nodeStateKywd354.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "nodeState"


	public static class nodeStateVariable_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "nodeStateVariable"
	// antlr/Plexil.g:1013:1: nodeStateVariable : nodeReference PERIOD ! STATE_KYWD ^;
	public final PlexilParser.nodeStateVariable_return nodeStateVariable() throws RecognitionException {
		PlexilParser.nodeStateVariable_return retval = new PlexilParser.nodeStateVariable_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token PERIOD356=null;
		Token STATE_KYWD357=null;
		ParserRuleReturnScope nodeReference355 =null;

		PlexilTreeNode PERIOD356_tree=null;
		PlexilTreeNode STATE_KYWD357_tree=null;

		try {
			// antlr/Plexil.g:1013:19: ( nodeReference PERIOD ! STATE_KYWD ^)
			// antlr/Plexil.g:1013:21: nodeReference PERIOD ! STATE_KYWD ^
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			pushFollow(FOLLOW_nodeReference_in_nodeStateVariable5824);
			nodeReference355=nodeReference();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, nodeReference355.getTree());

			PERIOD356=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_nodeStateVariable5826); if (state.failed) return retval;
			STATE_KYWD357=(Token)match(input,STATE_KYWD,FOLLOW_STATE_KYWD_in_nodeStateVariable5829); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			STATE_KYWD357_tree = new NodeVariableNode(STATE_KYWD357) ;
			root_0 = (PlexilTreeNode)adaptor.becomeRoot(STATE_KYWD357_tree, root_0);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "nodeStateVariable"


	public static class nodeOutcome_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "nodeOutcome"
	// antlr/Plexil.g:1015:1: nodeOutcome : ( nodeOutcomeVariable | nodeOutcomeKywd );
	public final PlexilParser.nodeOutcome_return nodeOutcome() throws RecognitionException {
		PlexilParser.nodeOutcome_return retval = new PlexilParser.nodeOutcome_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		ParserRuleReturnScope nodeOutcomeVariable358 =null;
		ParserRuleReturnScope nodeOutcomeKywd359 =null;


		try {
			// antlr/Plexil.g:1015:13: ( nodeOutcomeVariable | nodeOutcomeKywd )
			int alt80=2;
			int LA80_0 = input.LA(1);
			if ( (LA80_0==CHILD_KYWD||LA80_0==NCNAME||LA80_0==PARENT_KYWD||LA80_0==SELF_KYWD||LA80_0==SIBLING_KYWD) ) {
				alt80=1;
			}
			else if ( (LA80_0==FAILURE_OUTCOME_KYWD||LA80_0==INTERRUPTED_OUTCOME_KYWD||LA80_0==SKIPPED_OUTCOME_KYWD||LA80_0==SUCCESS_OUTCOME_KYWD) ) {
				alt80=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 80, 0, input);
				throw nvae;
			}

			switch (alt80) {
				case 1 :
					// antlr/Plexil.g:1015:15: nodeOutcomeVariable
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_nodeOutcomeVariable_in_nodeOutcome5842);
					nodeOutcomeVariable358=nodeOutcomeVariable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, nodeOutcomeVariable358.getTree());

					}
					break;
				case 2 :
					// antlr/Plexil.g:1015:37: nodeOutcomeKywd
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_nodeOutcomeKywd_in_nodeOutcome5846);
					nodeOutcomeKywd359=nodeOutcomeKywd();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, nodeOutcomeKywd359.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "nodeOutcome"


	public static class nodeOutcomeVariable_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "nodeOutcomeVariable"
	// antlr/Plexil.g:1017:1: nodeOutcomeVariable : nodeReference PERIOD ! OUTCOME_KYWD ^;
	public final PlexilParser.nodeOutcomeVariable_return nodeOutcomeVariable() throws RecognitionException {
		PlexilParser.nodeOutcomeVariable_return retval = new PlexilParser.nodeOutcomeVariable_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token PERIOD361=null;
		Token OUTCOME_KYWD362=null;
		ParserRuleReturnScope nodeReference360 =null;

		PlexilTreeNode PERIOD361_tree=null;
		PlexilTreeNode OUTCOME_KYWD362_tree=null;

		try {
			// antlr/Plexil.g:1017:21: ( nodeReference PERIOD ! OUTCOME_KYWD ^)
			// antlr/Plexil.g:1017:23: nodeReference PERIOD ! OUTCOME_KYWD ^
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			pushFollow(FOLLOW_nodeReference_in_nodeOutcomeVariable5855);
			nodeReference360=nodeReference();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, nodeReference360.getTree());

			PERIOD361=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_nodeOutcomeVariable5857); if (state.failed) return retval;
			OUTCOME_KYWD362=(Token)match(input,OUTCOME_KYWD,FOLLOW_OUTCOME_KYWD_in_nodeOutcomeVariable5860); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			OUTCOME_KYWD362_tree = new NodeVariableNode(OUTCOME_KYWD362) ;
			root_0 = (PlexilTreeNode)adaptor.becomeRoot(OUTCOME_KYWD362_tree, root_0);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "nodeOutcomeVariable"


	public static class nodeOutcomeKywd_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "nodeOutcomeKywd"
	// antlr/Plexil.g:1019:1: nodeOutcomeKywd : ( SUCCESS_OUTCOME_KYWD | FAILURE_OUTCOME_KYWD | SKIPPED_OUTCOME_KYWD | INTERRUPTED_OUTCOME_KYWD );
	public final PlexilParser.nodeOutcomeKywd_return nodeOutcomeKywd() throws RecognitionException {
		PlexilParser.nodeOutcomeKywd_return retval = new PlexilParser.nodeOutcomeKywd_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token set363=null;

		PlexilTreeNode set363_tree=null;

		try {
			// antlr/Plexil.g:1019:17: ( SUCCESS_OUTCOME_KYWD | FAILURE_OUTCOME_KYWD | SKIPPED_OUTCOME_KYWD | INTERRUPTED_OUTCOME_KYWD )
			// antlr/Plexil.g:
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			set363=input.LT(1);
			if ( input.LA(1)==FAILURE_OUTCOME_KYWD||input.LA(1)==INTERRUPTED_OUTCOME_KYWD||input.LA(1)==SKIPPED_OUTCOME_KYWD||input.LA(1)==SUCCESS_OUTCOME_KYWD ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (PlexilTreeNode)adaptor.create(set363));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "nodeOutcomeKywd"


	public static class nodeCommandHandle_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "nodeCommandHandle"
	// antlr/Plexil.g:1026:1: nodeCommandHandle : ( nodeCommandHandleVariable | nodeCommandHandleKywd );
	public final PlexilParser.nodeCommandHandle_return nodeCommandHandle() throws RecognitionException {
		PlexilParser.nodeCommandHandle_return retval = new PlexilParser.nodeCommandHandle_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		ParserRuleReturnScope nodeCommandHandleVariable364 =null;
		ParserRuleReturnScope nodeCommandHandleKywd365 =null;


		try {
			// antlr/Plexil.g:1026:19: ( nodeCommandHandleVariable | nodeCommandHandleKywd )
			int alt81=2;
			int LA81_0 = input.LA(1);
			if ( (LA81_0==CHILD_KYWD||LA81_0==NCNAME||LA81_0==PARENT_KYWD||LA81_0==SELF_KYWD||LA81_0==SIBLING_KYWD) ) {
				alt81=1;
			}
			else if ( ((LA81_0 >= COMMAND_ACCEPTED_KYWD && LA81_0 <= COMMAND_FAILED_KYWD)||(LA81_0 >= COMMAND_RCVD_KYWD && LA81_0 <= COMMAND_SUCCESS_KYWD)) ) {
				alt81=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 81, 0, input);
				throw nvae;
			}

			switch (alt81) {
				case 1 :
					// antlr/Plexil.g:1026:21: nodeCommandHandleVariable
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_nodeCommandHandleVariable_in_nodeCommandHandle5904);
					nodeCommandHandleVariable364=nodeCommandHandleVariable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, nodeCommandHandleVariable364.getTree());

					}
					break;
				case 2 :
					// antlr/Plexil.g:1026:49: nodeCommandHandleKywd
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_nodeCommandHandleKywd_in_nodeCommandHandle5908);
					nodeCommandHandleKywd365=nodeCommandHandleKywd();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, nodeCommandHandleKywd365.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "nodeCommandHandle"


	public static class nodeCommandHandleVariable_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "nodeCommandHandleVariable"
	// antlr/Plexil.g:1028:1: nodeCommandHandleVariable : nodeReference PERIOD ! COMMAND_HANDLE_KYWD ^;
	public final PlexilParser.nodeCommandHandleVariable_return nodeCommandHandleVariable() throws RecognitionException {
		PlexilParser.nodeCommandHandleVariable_return retval = new PlexilParser.nodeCommandHandleVariable_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token PERIOD367=null;
		Token COMMAND_HANDLE_KYWD368=null;
		ParserRuleReturnScope nodeReference366 =null;

		PlexilTreeNode PERIOD367_tree=null;
		PlexilTreeNode COMMAND_HANDLE_KYWD368_tree=null;

		try {
			// antlr/Plexil.g:1028:27: ( nodeReference PERIOD ! COMMAND_HANDLE_KYWD ^)
			// antlr/Plexil.g:1028:29: nodeReference PERIOD ! COMMAND_HANDLE_KYWD ^
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			pushFollow(FOLLOW_nodeReference_in_nodeCommandHandleVariable5917);
			nodeReference366=nodeReference();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, nodeReference366.getTree());

			PERIOD367=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_nodeCommandHandleVariable5919); if (state.failed) return retval;
			COMMAND_HANDLE_KYWD368=(Token)match(input,COMMAND_HANDLE_KYWD,FOLLOW_COMMAND_HANDLE_KYWD_in_nodeCommandHandleVariable5922); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			COMMAND_HANDLE_KYWD368_tree = new NodeVariableNode(COMMAND_HANDLE_KYWD368) ;
			root_0 = (PlexilTreeNode)adaptor.becomeRoot(COMMAND_HANDLE_KYWD368_tree, root_0);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "nodeCommandHandleVariable"


	public static class nodeCommandHandleKywd_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "nodeCommandHandleKywd"
	// antlr/Plexil.g:1030:1: nodeCommandHandleKywd : ( COMMAND_ACCEPTED_KYWD | COMMAND_DENIED_KYWD | COMMAND_FAILED_KYWD | COMMAND_RCVD_KYWD | COMMAND_SENT_KYWD | COMMAND_SUCCESS_KYWD );
	public final PlexilParser.nodeCommandHandleKywd_return nodeCommandHandleKywd() throws RecognitionException {
		PlexilParser.nodeCommandHandleKywd_return retval = new PlexilParser.nodeCommandHandleKywd_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token set369=null;

		PlexilTreeNode set369_tree=null;

		try {
			// antlr/Plexil.g:1030:23: ( COMMAND_ACCEPTED_KYWD | COMMAND_DENIED_KYWD | COMMAND_FAILED_KYWD | COMMAND_RCVD_KYWD | COMMAND_SENT_KYWD | COMMAND_SUCCESS_KYWD )
			// antlr/Plexil.g:
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			set369=input.LT(1);
			if ( (input.LA(1) >= COMMAND_ACCEPTED_KYWD && input.LA(1) <= COMMAND_FAILED_KYWD)||(input.LA(1) >= COMMAND_RCVD_KYWD && input.LA(1) <= COMMAND_SUCCESS_KYWD) ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (PlexilTreeNode)adaptor.create(set369));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "nodeCommandHandleKywd"


	public static class nodeFailure_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "nodeFailure"
	// antlr/Plexil.g:1039:1: nodeFailure : ( nodeFailureVariable | nodeFailureKywd );
	public final PlexilParser.nodeFailure_return nodeFailure() throws RecognitionException {
		PlexilParser.nodeFailure_return retval = new PlexilParser.nodeFailure_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		ParserRuleReturnScope nodeFailureVariable370 =null;
		ParserRuleReturnScope nodeFailureKywd371 =null;


		try {
			// antlr/Plexil.g:1039:13: ( nodeFailureVariable | nodeFailureKywd )
			int alt82=2;
			int LA82_0 = input.LA(1);
			if ( (LA82_0==CHILD_KYWD||LA82_0==NCNAME||LA82_0==PARENT_KYWD||LA82_0==SELF_KYWD||LA82_0==SIBLING_KYWD) ) {
				alt82=1;
			}
			else if ( (LA82_0==EXITED_KYWD||LA82_0==INVARIANT_CONDITION_FAILED_KYWD||(LA82_0 >= PARENT_EXITED_KYWD && LA82_0 <= PARENT_FAILED_KYWD)||LA82_0==POST_CONDITION_FAILED_KYWD||LA82_0==PRE_CONDITION_FAILED_KYWD) ) {
				alt82=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 82, 0, input);
				throw nvae;
			}

			switch (alt82) {
				case 1 :
					// antlr/Plexil.g:1039:15: nodeFailureVariable
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_nodeFailureVariable_in_nodeFailure5979);
					nodeFailureVariable370=nodeFailureVariable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, nodeFailureVariable370.getTree());

					}
					break;
				case 2 :
					// antlr/Plexil.g:1039:37: nodeFailureKywd
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_nodeFailureKywd_in_nodeFailure5983);
					nodeFailureKywd371=nodeFailureKywd();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, nodeFailureKywd371.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "nodeFailure"


	public static class nodeFailureVariable_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "nodeFailureVariable"
	// antlr/Plexil.g:1041:1: nodeFailureVariable : nodeReference PERIOD ! FAILURE_KYWD ^;
	public final PlexilParser.nodeFailureVariable_return nodeFailureVariable() throws RecognitionException {
		PlexilParser.nodeFailureVariable_return retval = new PlexilParser.nodeFailureVariable_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token PERIOD373=null;
		Token FAILURE_KYWD374=null;
		ParserRuleReturnScope nodeReference372 =null;

		PlexilTreeNode PERIOD373_tree=null;
		PlexilTreeNode FAILURE_KYWD374_tree=null;

		try {
			// antlr/Plexil.g:1041:21: ( nodeReference PERIOD ! FAILURE_KYWD ^)
			// antlr/Plexil.g:1041:23: nodeReference PERIOD ! FAILURE_KYWD ^
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			pushFollow(FOLLOW_nodeReference_in_nodeFailureVariable5992);
			nodeReference372=nodeReference();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, nodeReference372.getTree());

			PERIOD373=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_nodeFailureVariable5994); if (state.failed) return retval;
			FAILURE_KYWD374=(Token)match(input,FAILURE_KYWD,FOLLOW_FAILURE_KYWD_in_nodeFailureVariable5997); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			FAILURE_KYWD374_tree = new NodeVariableNode(FAILURE_KYWD374) ;
			root_0 = (PlexilTreeNode)adaptor.becomeRoot(FAILURE_KYWD374_tree, root_0);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "nodeFailureVariable"


	public static class nodeFailureKywd_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "nodeFailureKywd"
	// antlr/Plexil.g:1043:1: nodeFailureKywd : ( PRE_CONDITION_FAILED_KYWD | POST_CONDITION_FAILED_KYWD | INVARIANT_CONDITION_FAILED_KYWD | PARENT_FAILED_KYWD | PARENT_EXITED_KYWD | EXITED_KYWD );
	public final PlexilParser.nodeFailureKywd_return nodeFailureKywd() throws RecognitionException {
		PlexilParser.nodeFailureKywd_return retval = new PlexilParser.nodeFailureKywd_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token set375=null;

		PlexilTreeNode set375_tree=null;

		try {
			// antlr/Plexil.g:1043:17: ( PRE_CONDITION_FAILED_KYWD | POST_CONDITION_FAILED_KYWD | INVARIANT_CONDITION_FAILED_KYWD | PARENT_FAILED_KYWD | PARENT_EXITED_KYWD | EXITED_KYWD )
			// antlr/Plexil.g:
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			set375=input.LT(1);
			if ( input.LA(1)==EXITED_KYWD||input.LA(1)==INVARIANT_CONDITION_FAILED_KYWD||(input.LA(1) >= PARENT_EXITED_KYWD && input.LA(1) <= PARENT_FAILED_KYWD)||input.LA(1)==POST_CONDITION_FAILED_KYWD||input.LA(1)==PRE_CONDITION_FAILED_KYWD ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (PlexilTreeNode)adaptor.create(set375));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "nodeFailureKywd"


	public static class nodeTimepointValue_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "nodeTimepointValue"
	// antlr/Plexil.g:1052:1: nodeTimepointValue : nodeReference PERIOD nodeStateKywd PERIOD timepoint -> ^( NODE_TIMEPOINT_VALUE nodeReference nodeStateKywd timepoint ) ;
	public final PlexilParser.nodeTimepointValue_return nodeTimepointValue() throws RecognitionException {
		PlexilParser.nodeTimepointValue_return retval = new PlexilParser.nodeTimepointValue_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token PERIOD377=null;
		Token PERIOD379=null;
		ParserRuleReturnScope nodeReference376 =null;
		ParserRuleReturnScope nodeStateKywd378 =null;
		ParserRuleReturnScope timepoint380 =null;

		PlexilTreeNode PERIOD377_tree=null;
		PlexilTreeNode PERIOD379_tree=null;
		RewriteRuleTokenStream stream_PERIOD=new RewriteRuleTokenStream(adaptor,"token PERIOD");
		RewriteRuleSubtreeStream stream_nodeStateKywd=new RewriteRuleSubtreeStream(adaptor,"rule nodeStateKywd");
		RewriteRuleSubtreeStream stream_nodeReference=new RewriteRuleSubtreeStream(adaptor,"rule nodeReference");
		RewriteRuleSubtreeStream stream_timepoint=new RewriteRuleSubtreeStream(adaptor,"rule timepoint");

		try {
			// antlr/Plexil.g:1052:20: ( nodeReference PERIOD nodeStateKywd PERIOD timepoint -> ^( NODE_TIMEPOINT_VALUE nodeReference nodeStateKywd timepoint ) )
			// antlr/Plexil.g:1053:4: nodeReference PERIOD nodeStateKywd PERIOD timepoint
			{
			pushFollow(FOLLOW_nodeReference_in_nodeTimepointValue6057);
			nodeReference376=nodeReference();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_nodeReference.add(nodeReference376.getTree());
			PERIOD377=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_nodeTimepointValue6059); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD377);

			pushFollow(FOLLOW_nodeStateKywd_in_nodeTimepointValue6061);
			nodeStateKywd378=nodeStateKywd();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_nodeStateKywd.add(nodeStateKywd378.getTree());
			PERIOD379=(Token)match(input,PERIOD,FOLLOW_PERIOD_in_nodeTimepointValue6063); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_PERIOD.add(PERIOD379);

			pushFollow(FOLLOW_timepoint_in_nodeTimepointValue6065);
			timepoint380=timepoint();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_timepoint.add(timepoint380.getTree());
			// AST REWRITE
			// elements: nodeStateKywd, timepoint, nodeReference
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (PlexilTreeNode)adaptor.nil();
			// 1054:4: -> ^( NODE_TIMEPOINT_VALUE nodeReference nodeStateKywd timepoint )
			{
				// antlr/Plexil.g:1054:7: ^( NODE_TIMEPOINT_VALUE nodeReference nodeStateKywd timepoint )
				{
				PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
				root_1 = (PlexilTreeNode)adaptor.becomeRoot((PlexilTreeNode)adaptor.create(NODE_TIMEPOINT_VALUE, "NODE_TIMEPOINT_VALUE"), root_1);
				adaptor.addChild(root_1, stream_nodeReference.nextTree());
				adaptor.addChild(root_1, stream_nodeStateKywd.nextTree());
				adaptor.addChild(root_1, stream_timepoint.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "nodeTimepointValue"


	public static class timepoint_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "timepoint"
	// antlr/Plexil.g:1057:1: timepoint : ( START_KYWD | END_KYWD );
	public final PlexilParser.timepoint_return timepoint() throws RecognitionException {
		PlexilParser.timepoint_return retval = new PlexilParser.timepoint_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token set381=null;

		PlexilTreeNode set381_tree=null;

		try {
			// antlr/Plexil.g:1057:11: ( START_KYWD | END_KYWD )
			// antlr/Plexil.g:
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			set381=input.LT(1);
			if ( input.LA(1)==END_KYWD||input.LA(1)==START_KYWD ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (PlexilTreeNode)adaptor.create(set381));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "timepoint"


	public static class nodeReference_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "nodeReference"
	// antlr/Plexil.g:1059:1: nodeReference : ( nodeId | CHILD_KYWD ^ LPAREN ! NCNAME RPAREN !| SIBLING_KYWD ^ LPAREN ! NCNAME RPAREN !);
	public final PlexilParser.nodeReference_return nodeReference() throws RecognitionException {
		PlexilParser.nodeReference_return retval = new PlexilParser.nodeReference_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token CHILD_KYWD383=null;
		Token LPAREN384=null;
		Token NCNAME385=null;
		Token RPAREN386=null;
		Token SIBLING_KYWD387=null;
		Token LPAREN388=null;
		Token NCNAME389=null;
		Token RPAREN390=null;
		ParserRuleReturnScope nodeId382 =null;

		PlexilTreeNode CHILD_KYWD383_tree=null;
		PlexilTreeNode LPAREN384_tree=null;
		PlexilTreeNode NCNAME385_tree=null;
		PlexilTreeNode RPAREN386_tree=null;
		PlexilTreeNode SIBLING_KYWD387_tree=null;
		PlexilTreeNode LPAREN388_tree=null;
		PlexilTreeNode NCNAME389_tree=null;
		PlexilTreeNode RPAREN390_tree=null;

		try {
			// antlr/Plexil.g:1059:15: ( nodeId | CHILD_KYWD ^ LPAREN ! NCNAME RPAREN !| SIBLING_KYWD ^ LPAREN ! NCNAME RPAREN !)
			int alt83=3;
			switch ( input.LA(1) ) {
			case NCNAME:
			case PARENT_KYWD:
			case SELF_KYWD:
				{
				alt83=1;
				}
				break;
			case CHILD_KYWD:
				{
				alt83=2;
				}
				break;
			case SIBLING_KYWD:
				{
				alt83=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 83, 0, input);
				throw nvae;
			}
			switch (alt83) {
				case 1 :
					// antlr/Plexil.g:1060:5: nodeId
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_nodeId_in_nodeReference6108);
					nodeId382=nodeId();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, nodeId382.getTree());

					}
					break;
				case 2 :
					// antlr/Plexil.g:1061:5: CHILD_KYWD ^ LPAREN ! NCNAME RPAREN !
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					CHILD_KYWD383=(Token)match(input,CHILD_KYWD,FOLLOW_CHILD_KYWD_in_nodeReference6114); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					CHILD_KYWD383_tree = (PlexilTreeNode)adaptor.create(CHILD_KYWD383);
					root_0 = (PlexilTreeNode)adaptor.becomeRoot(CHILD_KYWD383_tree, root_0);
					}

					LPAREN384=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_nodeReference6117); if (state.failed) return retval;
					NCNAME385=(Token)match(input,NCNAME,FOLLOW_NCNAME_in_nodeReference6120); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NCNAME385_tree = (PlexilTreeNode)adaptor.create(NCNAME385);
					adaptor.addChild(root_0, NCNAME385_tree);
					}

					RPAREN386=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_nodeReference6122); if (state.failed) return retval;
					}
					break;
				case 3 :
					// antlr/Plexil.g:1062:5: SIBLING_KYWD ^ LPAREN ! NCNAME RPAREN !
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					SIBLING_KYWD387=(Token)match(input,SIBLING_KYWD,FOLLOW_SIBLING_KYWD_in_nodeReference6129); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					SIBLING_KYWD387_tree = (PlexilTreeNode)adaptor.create(SIBLING_KYWD387);
					root_0 = (PlexilTreeNode)adaptor.becomeRoot(SIBLING_KYWD387_tree, root_0);
					}

					LPAREN388=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_nodeReference6132); if (state.failed) return retval;
					NCNAME389=(Token)match(input,NCNAME,FOLLOW_NCNAME_in_nodeReference6135); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NCNAME389_tree = (PlexilTreeNode)adaptor.create(NCNAME389);
					adaptor.addChild(root_0, NCNAME389_tree);
					}

					RPAREN390=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_nodeReference6137); if (state.failed) return retval;
					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "nodeReference"


	public static class nodeId_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "nodeId"
	// antlr/Plexil.g:1065:1: nodeId : ( SELF_KYWD | PARENT_KYWD | NCNAME );
	public final PlexilParser.nodeId_return nodeId() throws RecognitionException {
		PlexilParser.nodeId_return retval = new PlexilParser.nodeId_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token set391=null;

		PlexilTreeNode set391_tree=null;

		try {
			// antlr/Plexil.g:1065:8: ( SELF_KYWD | PARENT_KYWD | NCNAME )
			// antlr/Plexil.g:
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			set391=input.LT(1);
			if ( input.LA(1)==NCNAME||input.LA(1)==PARENT_KYWD||input.LA(1)==SELF_KYWD ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (PlexilTreeNode)adaptor.create(set391));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "nodeId"


	public static class lookupExpr_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "lookupExpr"
	// antlr/Plexil.g:1075:1: lookupExpr : ( lookupOnChange | lookupNow | lookup );
	public final PlexilParser.lookupExpr_return lookupExpr() throws RecognitionException {
		PlexilParser.lookupExpr_return retval = new PlexilParser.lookupExpr_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		ParserRuleReturnScope lookupOnChange392 =null;
		ParserRuleReturnScope lookupNow393 =null;
		ParserRuleReturnScope lookup394 =null;


		try {
			// antlr/Plexil.g:1075:12: ( lookupOnChange | lookupNow | lookup )
			int alt84=3;
			switch ( input.LA(1) ) {
			case LOOKUP_ON_CHANGE_KYWD:
				{
				alt84=1;
				}
				break;
			case LOOKUP_NOW_KYWD:
				{
				alt84=2;
				}
				break;
			case LOOKUP_KYWD:
				{
				alt84=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 84, 0, input);
				throw nvae;
			}
			switch (alt84) {
				case 1 :
					// antlr/Plexil.g:1075:14: lookupOnChange
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_lookupOnChange_in_lookupExpr6180);
					lookupOnChange392=lookupOnChange();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, lookupOnChange392.getTree());

					}
					break;
				case 2 :
					// antlr/Plexil.g:1075:31: lookupNow
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_lookupNow_in_lookupExpr6184);
					lookupNow393=lookupNow();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, lookupNow393.getTree());

					}
					break;
				case 3 :
					// antlr/Plexil.g:1075:43: lookup
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_lookup_in_lookupExpr6188);
					lookup394=lookup();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, lookup394.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "lookupExpr"


	public static class lookupOnChange_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "lookupOnChange"
	// antlr/Plexil.g:1081:1: lookupOnChange : LOOKUP_ON_CHANGE_KYWD ^ LPAREN ! lookupInvocation ( COMMA ! tolerance )? RPAREN !;
	public final PlexilParser.lookupOnChange_return lookupOnChange() throws RecognitionException {
		PlexilParser.lookupOnChange_return retval = new PlexilParser.lookupOnChange_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token LOOKUP_ON_CHANGE_KYWD395=null;
		Token LPAREN396=null;
		Token COMMA398=null;
		Token RPAREN400=null;
		ParserRuleReturnScope lookupInvocation397 =null;
		ParserRuleReturnScope tolerance399 =null;

		PlexilTreeNode LOOKUP_ON_CHANGE_KYWD395_tree=null;
		PlexilTreeNode LPAREN396_tree=null;
		PlexilTreeNode COMMA398_tree=null;
		PlexilTreeNode RPAREN400_tree=null;

		 m_paraphrases.push("in \"LookupOnChange\" expression"); 
		try {
			// antlr/Plexil.g:1084:2: ( LOOKUP_ON_CHANGE_KYWD ^ LPAREN ! lookupInvocation ( COMMA ! tolerance )? RPAREN !)
			// antlr/Plexil.g:1085:8: LOOKUP_ON_CHANGE_KYWD ^ LPAREN ! lookupInvocation ( COMMA ! tolerance )? RPAREN !
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			LOOKUP_ON_CHANGE_KYWD395=(Token)match(input,LOOKUP_ON_CHANGE_KYWD,FOLLOW_LOOKUP_ON_CHANGE_KYWD_in_lookupOnChange6219); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LOOKUP_ON_CHANGE_KYWD395_tree = (PlexilTreeNode)adaptor.create(LOOKUP_ON_CHANGE_KYWD395);
			root_0 = (PlexilTreeNode)adaptor.becomeRoot(LOOKUP_ON_CHANGE_KYWD395_tree, root_0);
			}

			LPAREN396=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_lookupOnChange6222); if (state.failed) return retval;
			pushFollow(FOLLOW_lookupInvocation_in_lookupOnChange6225);
			lookupInvocation397=lookupInvocation();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, lookupInvocation397.getTree());

			// antlr/Plexil.g:1085:56: ( COMMA ! tolerance )?
			int alt85=2;
			int LA85_0 = input.LA(1);
			if ( (LA85_0==COMMA) ) {
				alt85=1;
			}
			switch (alt85) {
				case 1 :
					// antlr/Plexil.g:1085:57: COMMA ! tolerance
					{
					COMMA398=(Token)match(input,COMMA,FOLLOW_COMMA_in_lookupOnChange6228); if (state.failed) return retval;
					pushFollow(FOLLOW_tolerance_in_lookupOnChange6231);
					tolerance399=tolerance();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, tolerance399.getTree());

					}
					break;

			}

			RPAREN400=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_lookupOnChange6235); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { m_paraphrases.pop(); }
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "lookupOnChange"


	public static class tolerance_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "tolerance"
	// antlr/Plexil.g:1088:1: tolerance : ( realValue | durationLiteral | variable );
	public final PlexilParser.tolerance_return tolerance() throws RecognitionException {
		PlexilParser.tolerance_return retval = new PlexilParser.tolerance_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		ParserRuleReturnScope realValue401 =null;
		ParserRuleReturnScope durationLiteral402 =null;
		ParserRuleReturnScope variable403 =null;


		try {
			// antlr/Plexil.g:1088:11: ( realValue | durationLiteral | variable )
			int alt86=3;
			switch ( input.LA(1) ) {
			case DOUBLE:
			case INT:
				{
				alt86=1;
				}
				break;
			case DURATION_KYWD:
				{
				alt86=2;
				}
				break;
			case NCNAME:
				{
				alt86=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 86, 0, input);
				throw nvae;
			}
			switch (alt86) {
				case 1 :
					// antlr/Plexil.g:1088:13: realValue
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_realValue_in_tolerance6245);
					realValue401=realValue();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, realValue401.getTree());

					}
					break;
				case 2 :
					// antlr/Plexil.g:1088:25: durationLiteral
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_durationLiteral_in_tolerance6249);
					durationLiteral402=durationLiteral();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, durationLiteral402.getTree());

					}
					break;
				case 3 :
					// antlr/Plexil.g:1088:43: variable
					{
					root_0 = (PlexilTreeNode)adaptor.nil();


					pushFollow(FOLLOW_variable_in_tolerance6253);
					variable403=variable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, variable403.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "tolerance"


	public static class lookupNow_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "lookupNow"
	// antlr/Plexil.g:1093:1: lookupNow : LOOKUP_NOW_KYWD ^ LPAREN ! lookupInvocation RPAREN !;
	public final PlexilParser.lookupNow_return lookupNow() throws RecognitionException {
		PlexilParser.lookupNow_return retval = new PlexilParser.lookupNow_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token LOOKUP_NOW_KYWD404=null;
		Token LPAREN405=null;
		Token RPAREN407=null;
		ParserRuleReturnScope lookupInvocation406 =null;

		PlexilTreeNode LOOKUP_NOW_KYWD404_tree=null;
		PlexilTreeNode LPAREN405_tree=null;
		PlexilTreeNode RPAREN407_tree=null;

		 m_paraphrases.push("in \"LookupNow\" expression"); 
		try {
			// antlr/Plexil.g:1096:2: ( LOOKUP_NOW_KYWD ^ LPAREN ! lookupInvocation RPAREN !)
			// antlr/Plexil.g:1097:5: LOOKUP_NOW_KYWD ^ LPAREN ! lookupInvocation RPAREN !
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			LOOKUP_NOW_KYWD404=(Token)match(input,LOOKUP_NOW_KYWD,FOLLOW_LOOKUP_NOW_KYWD_in_lookupNow6280); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LOOKUP_NOW_KYWD404_tree = (PlexilTreeNode)adaptor.create(LOOKUP_NOW_KYWD404);
			root_0 = (PlexilTreeNode)adaptor.becomeRoot(LOOKUP_NOW_KYWD404_tree, root_0);
			}

			LPAREN405=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_lookupNow6283); if (state.failed) return retval;
			pushFollow(FOLLOW_lookupInvocation_in_lookupNow6286);
			lookupInvocation406=lookupInvocation();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, lookupInvocation406.getTree());

			RPAREN407=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_lookupNow6288); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { m_paraphrases.pop(); }
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "lookupNow"


	public static class lookup_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "lookup"
	// antlr/Plexil.g:1104:1: lookup : LOOKUP_KYWD ^ LPAREN ! lookupInvocation ( COMMA ! tolerance )? RPAREN !;
	public final PlexilParser.lookup_return lookup() throws RecognitionException {
		PlexilParser.lookup_return retval = new PlexilParser.lookup_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token LOOKUP_KYWD408=null;
		Token LPAREN409=null;
		Token COMMA411=null;
		Token RPAREN413=null;
		ParserRuleReturnScope lookupInvocation410 =null;
		ParserRuleReturnScope tolerance412 =null;

		PlexilTreeNode LOOKUP_KYWD408_tree=null;
		PlexilTreeNode LPAREN409_tree=null;
		PlexilTreeNode COMMA411_tree=null;
		PlexilTreeNode RPAREN413_tree=null;

		 m_paraphrases.push("in \"Lookup\" expression"); 
		try {
			// antlr/Plexil.g:1107:2: ( LOOKUP_KYWD ^ LPAREN ! lookupInvocation ( COMMA ! tolerance )? RPAREN !)
			// antlr/Plexil.g:1108:5: LOOKUP_KYWD ^ LPAREN ! lookupInvocation ( COMMA ! tolerance )? RPAREN !
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			LOOKUP_KYWD408=(Token)match(input,LOOKUP_KYWD,FOLLOW_LOOKUP_KYWD_in_lookup6318); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LOOKUP_KYWD408_tree = (PlexilTreeNode)adaptor.create(LOOKUP_KYWD408);
			root_0 = (PlexilTreeNode)adaptor.becomeRoot(LOOKUP_KYWD408_tree, root_0);
			}

			LPAREN409=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_lookup6321); if (state.failed) return retval;
			pushFollow(FOLLOW_lookupInvocation_in_lookup6324);
			lookupInvocation410=lookupInvocation();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, lookupInvocation410.getTree());

			// antlr/Plexil.g:1108:43: ( COMMA ! tolerance )?
			int alt87=2;
			int LA87_0 = input.LA(1);
			if ( (LA87_0==COMMA) ) {
				alt87=1;
			}
			switch (alt87) {
				case 1 :
					// antlr/Plexil.g:1108:44: COMMA ! tolerance
					{
					COMMA411=(Token)match(input,COMMA,FOLLOW_COMMA_in_lookup6327); if (state.failed) return retval;
					pushFollow(FOLLOW_tolerance_in_lookup6330);
					tolerance412=tolerance();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, tolerance412.getTree());

					}
					break;

			}

			RPAREN413=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_lookup6334); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { m_paraphrases.pop(); }
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "lookup"


	public static class lookupInvocation_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "lookupInvocation"
	// antlr/Plexil.g:1111:1: lookupInvocation : ( stateName | ( LPAREN ! stateNameExp RPAREN !) ) ( LPAREN ! ( argumentList )? RPAREN !)? ;
	public final PlexilParser.lookupInvocation_return lookupInvocation() throws RecognitionException {
		PlexilParser.lookupInvocation_return retval = new PlexilParser.lookupInvocation_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token LPAREN415=null;
		Token RPAREN417=null;
		Token LPAREN418=null;
		Token RPAREN420=null;
		ParserRuleReturnScope stateName414 =null;
		ParserRuleReturnScope stateNameExp416 =null;
		ParserRuleReturnScope argumentList419 =null;

		PlexilTreeNode LPAREN415_tree=null;
		PlexilTreeNode RPAREN417_tree=null;
		PlexilTreeNode LPAREN418_tree=null;
		PlexilTreeNode RPAREN420_tree=null;

		try {
			// antlr/Plexil.g:1111:18: ( ( stateName | ( LPAREN ! stateNameExp RPAREN !) ) ( LPAREN ! ( argumentList )? RPAREN !)? )
			// antlr/Plexil.g:1112:3: ( stateName | ( LPAREN ! stateNameExp RPAREN !) ) ( LPAREN ! ( argumentList )? RPAREN !)?
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			// antlr/Plexil.g:1112:3: ( stateName | ( LPAREN ! stateNameExp RPAREN !) )
			int alt88=2;
			int LA88_0 = input.LA(1);
			if ( (LA88_0==NCNAME) ) {
				alt88=1;
			}
			else if ( (LA88_0==LPAREN) ) {
				alt88=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 88, 0, input);
				throw nvae;
			}

			switch (alt88) {
				case 1 :
					// antlr/Plexil.g:1112:5: stateName
					{
					pushFollow(FOLLOW_stateName_in_lookupInvocation6350);
					stateName414=stateName();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, stateName414.getTree());

					}
					break;
				case 2 :
					// antlr/Plexil.g:1114:5: ( LPAREN ! stateNameExp RPAREN !)
					{
					// antlr/Plexil.g:1114:5: ( LPAREN ! stateNameExp RPAREN !)
					// antlr/Plexil.g:1114:7: LPAREN ! stateNameExp RPAREN !
					{
					LPAREN415=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_lookupInvocation6364); if (state.failed) return retval;
					pushFollow(FOLLOW_stateNameExp_in_lookupInvocation6367);
					stateNameExp416=stateNameExp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, stateNameExp416.getTree());

					RPAREN417=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_lookupInvocation6369); if (state.failed) return retval;
					}

					}
					break;

			}

			// antlr/Plexil.g:1116:3: ( LPAREN ! ( argumentList )? RPAREN !)?
			int alt90=2;
			int LA90_0 = input.LA(1);
			if ( (LA90_0==LPAREN) ) {
				alt90=1;
			}
			switch (alt90) {
				case 1 :
					// antlr/Plexil.g:1116:5: LPAREN ! ( argumentList )? RPAREN !
					{
					LPAREN418=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_lookupInvocation6382); if (state.failed) return retval;
					// antlr/Plexil.g:1116:13: ( argumentList )?
					int alt89=2;
					int LA89_0 = input.LA(1);
					if ( (LA89_0==ABS_KYWD||LA89_0==ARRAY_MAX_SIZE_KYWD||LA89_0==ARRAY_SIZE_KYWD||LA89_0==BAR||(LA89_0 >= CEIL_KYWD && LA89_0 <= CHILD_KYWD)||(LA89_0 >= COMMAND_ACCEPTED_KYWD && LA89_0 <= COMMAND_FAILED_KYWD)||(LA89_0 >= COMMAND_RCVD_KYWD && LA89_0 <= COMMAND_SUCCESS_KYWD)||LA89_0==DATE_KYWD||(LA89_0 >= DOUBLE && LA89_0 <= DURATION_KYWD)||(LA89_0 >= EXECUTING_STATE_KYWD && LA89_0 <= EXITED_KYWD)||LA89_0==FAILING_STATE_KYWD||(LA89_0 >= FAILURE_OUTCOME_KYWD && LA89_0 <= FLOOR_KYWD)||LA89_0==HASHPAREN||(LA89_0 >= INACTIVE_STATE_KYWD && LA89_0 <= INT)||LA89_0==INTERRUPTED_OUTCOME_KYWD||LA89_0==INVARIANT_CONDITION_FAILED_KYWD||(LA89_0 >= IS_KNOWN_KYWD && LA89_0 <= ITERATION_ENDED_STATE_KYWD)||(LA89_0 >= LOOKUP_KYWD && LA89_0 <= LOOKUP_ON_CHANGE_KYWD)||LA89_0==LPAREN||(LA89_0 >= MAX_KYWD && LA89_0 <= MIN_KYWD)||LA89_0==NCNAME||(LA89_0 >= NODE_EXECUTING_KYWD && LA89_0 <= NODE_FINISHED_KYWD)||(LA89_0 >= NODE_INACTIVE_KYWD && LA89_0 <= NODE_SUCCEEDED_KYWD)||(LA89_0 >= NODE_WAITING_KYWD && LA89_0 <= NOT_KYWD)||(LA89_0 >= PARENT_EXITED_KYWD && LA89_0 <= PARENT_KYWD)||LA89_0==POST_CONDITION_FAILED_KYWD||LA89_0==PRE_CONDITION_FAILED_KYWD||LA89_0==REAL_TO_INT_KYWD||LA89_0==ROUND_KYWD||LA89_0==SELF_KYWD||(LA89_0 >= SIBLING_KYWD && LA89_0 <= SKIPPED_OUTCOME_KYWD)||LA89_0==SQRT_KYWD||LA89_0==STRING||(LA89_0 >= STRLEN_KYWD && LA89_0 <= SUCCESS_OUTCOME_KYWD)||(LA89_0 >= TRUE_KYWD && LA89_0 <= TRUNC_KYWD)||LA89_0==WAITING_STATE_KYWD) ) {
						alt89=1;
					}
					switch (alt89) {
						case 1 :
							// antlr/Plexil.g:1116:14: argumentList
							{
							pushFollow(FOLLOW_argumentList_in_lookupInvocation6386);
							argumentList419=argumentList();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, argumentList419.getTree());

							}
							break;

					}

					RPAREN420=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_lookupInvocation6390); if (state.failed) return retval;
					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "lookupInvocation"


	public static class stateName_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "stateName"
	// antlr/Plexil.g:1119:1: stateName : NCNAME -> ^( STATE_NAME NCNAME ) ;
	public final PlexilParser.stateName_return stateName() throws RecognitionException {
		PlexilParser.stateName_return retval = new PlexilParser.stateName_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		Token NCNAME421=null;

		PlexilTreeNode NCNAME421_tree=null;
		RewriteRuleTokenStream stream_NCNAME=new RewriteRuleTokenStream(adaptor,"token NCNAME");

		try {
			// antlr/Plexil.g:1119:11: ( NCNAME -> ^( STATE_NAME NCNAME ) )
			// antlr/Plexil.g:1120:5: NCNAME
			{
			NCNAME421=(Token)match(input,NCNAME,FOLLOW_NCNAME_in_stateName6408); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_NCNAME.add(NCNAME421);

			// AST REWRITE
			// elements: NCNAME
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (PlexilTreeNode)adaptor.nil();
			// 1120:12: -> ^( STATE_NAME NCNAME )
			{
				// antlr/Plexil.g:1120:15: ^( STATE_NAME NCNAME )
				{
				PlexilTreeNode root_1 = (PlexilTreeNode)adaptor.nil();
				root_1 = (PlexilTreeNode)adaptor.becomeRoot((PlexilTreeNode)adaptor.create(STATE_NAME, "STATE_NAME"), root_1);
				adaptor.addChild(root_1, stream_NCNAME.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "stateName"


	public static class stateNameExp_return extends ParserRuleReturnScope {
		PlexilTreeNode tree;
		@Override
		public PlexilTreeNode getTree() { return tree; }
	};


	// $ANTLR start "stateNameExp"
	// antlr/Plexil.g:1123:1: stateNameExp : expression ;
	public final PlexilParser.stateNameExp_return stateNameExp() throws RecognitionException {
		PlexilParser.stateNameExp_return retval = new PlexilParser.stateNameExp_return();
		retval.start = input.LT(1);

		PlexilTreeNode root_0 = null;

		ParserRuleReturnScope expression422 =null;


		try {
			// antlr/Plexil.g:1123:14: ( expression )
			// antlr/Plexil.g:1123:16: expression
			{
			root_0 = (PlexilTreeNode)adaptor.nil();


			pushFollow(FOLLOW_expression_in_stateNameExp6426);
			expression422=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression422.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (PlexilTreeNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (PlexilTreeNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "stateNameExp"

	// $ANTLR start synpred1_Plexil
	public final void synpred1_Plexil_fragment() throws RecognitionException {
		// antlr/Plexil.g:371:5: ( baseTypeName LBRACKET )
		// antlr/Plexil.g:371:6: baseTypeName LBRACKET
		{
		pushFollow(FOLLOW_baseTypeName_in_synpred1_Plexil1647);
		baseTypeName();
		state._fsp--;
		if (state.failed) return;

		match(input,LBRACKET,FOLLOW_LBRACKET_in_synpred1_Plexil1649); if (state.failed) return;

		}

	}
	// $ANTLR end synpred1_Plexil

	// $ANTLR start synpred2_Plexil
	public final void synpred2_Plexil_fragment() throws RecognitionException {
		// antlr/Plexil.g:373:5: ( baseTypeName NCNAME LBRACKET )
		// antlr/Plexil.g:373:6: baseTypeName NCNAME LBRACKET
		{
		pushFollow(FOLLOW_baseTypeName_in_synpred2_Plexil1683);
		baseTypeName();
		state._fsp--;
		if (state.failed) return;

		match(input,NCNAME,FOLLOW_NCNAME_in_synpred2_Plexil1685); if (state.failed) return;

		match(input,LBRACKET,FOLLOW_LBRACKET_in_synpred2_Plexil1687); if (state.failed) return;

		}

	}
	// $ANTLR end synpred2_Plexil

	// $ANTLR start synpred3_Plexil
	public final void synpred3_Plexil_fragment() throws RecognitionException {
		// antlr/Plexil.g:393:5: ( baseTypeName LBRACKET )
		// antlr/Plexil.g:393:6: baseTypeName LBRACKET
		{
		pushFollow(FOLLOW_baseTypeName_in_synpred3_Plexil1830);
		baseTypeName();
		state._fsp--;
		if (state.failed) return;

		match(input,LBRACKET,FOLLOW_LBRACKET_in_synpred3_Plexil1832); if (state.failed) return;

		}

	}
	// $ANTLR end synpred3_Plexil

	// $ANTLR start synpred4_Plexil
	public final void synpred4_Plexil_fragment() throws RecognitionException {
		// antlr/Plexil.g:425:4: ( NCNAME LBRACKET )
		// antlr/Plexil.g:425:5: NCNAME LBRACKET
		{
		match(input,NCNAME,FOLLOW_NCNAME_in_synpred4_Plexil2029); if (state.failed) return;

		match(input,LBRACKET,FOLLOW_LBRACKET_in_synpred4_Plexil2031); if (state.failed) return;

		}

	}
	// $ANTLR end synpred4_Plexil

	// $ANTLR start synpred5_Plexil
	public final void synpred5_Plexil_fragment() throws RecognitionException {
		// antlr/Plexil.g:449:5: ( NCNAME ( LBRACKET | EQUALS ) )
		// antlr/Plexil.g:449:6: NCNAME ( LBRACKET | EQUALS )
		{
		match(input,NCNAME,FOLLOW_NCNAME_in_synpred5_Plexil2170); if (state.failed) return;

		if ( input.LA(1)==EQUALS||input.LA(1)==LBRACKET ) {
			input.consume();
			state.errorRecovery=false;
			state.failed=false;
		}
		else {
			if (state.backtracking>0) {state.failed=true; return;}
			MismatchedSetException mse = new MismatchedSetException(null,input);
			throw mse;
		}
		}

	}
	// $ANTLR end synpred5_Plexil

	// $ANTLR start synpred6_Plexil
	public final void synpred6_Plexil_fragment() throws RecognitionException {
		// antlr/Plexil.g:450:5: ( ( NCNAME LPAREN ) | LPAREN )
		int alt91=2;
		int LA91_0 = input.LA(1);
		if ( (LA91_0==NCNAME) ) {
			alt91=1;
		}
		else if ( (LA91_0==LPAREN) ) {
			alt91=2;
		}

		else {
			if (state.backtracking>0) {state.failed=true; return;}
			NoViableAltException nvae =
				new NoViableAltException("", 91, 0, input);
			throw nvae;
		}

		switch (alt91) {
			case 1 :
				// antlr/Plexil.g:450:6: ( NCNAME LPAREN )
				{
				// antlr/Plexil.g:450:6: ( NCNAME LPAREN )
				// antlr/Plexil.g:450:7: NCNAME LPAREN
				{
				match(input,NCNAME,FOLLOW_NCNAME_in_synpred6_Plexil2191); if (state.failed) return;

				match(input,LPAREN,FOLLOW_LPAREN_in_synpred6_Plexil2193); if (state.failed) return;

				}

				}
				break;
			case 2 :
				// antlr/Plexil.g:450:24: LPAREN
				{
				match(input,LPAREN,FOLLOW_LPAREN_in_synpred6_Plexil2198); if (state.failed) return;

				}
				break;

		}
	}
	// $ANTLR end synpred6_Plexil

	// $ANTLR start synpred7_Plexil
	public final void synpred7_Plexil_fragment() throws RecognitionException {
		// antlr/Plexil.g:622:7: ( NCNAME LBRACKET )
		// antlr/Plexil.g:622:8: NCNAME LBRACKET
		{
		match(input,NCNAME,FOLLOW_NCNAME_in_synpred7_Plexil3261); if (state.failed) return;

		match(input,LBRACKET,FOLLOW_LBRACKET_in_synpred7_Plexil3263); if (state.failed) return;

		}

	}
	// $ANTLR end synpred7_Plexil

	// $ANTLR start synpred8_Plexil
	public final void synpred8_Plexil_fragment() throws RecognitionException {
		// antlr/Plexil.g:626:9: ( NCNAME LBRACKET )
		// antlr/Plexil.g:626:10: NCNAME LBRACKET
		{
		match(input,NCNAME,FOLLOW_NCNAME_in_synpred8_Plexil3302); if (state.failed) return;

		match(input,LBRACKET,FOLLOW_LBRACKET_in_synpred8_Plexil3304); if (state.failed) return;

		}

	}
	// $ANTLR end synpred8_Plexil

	// $ANTLR start synpred9_Plexil
	public final void synpred9_Plexil_fragment() throws RecognitionException {
		// antlr/Plexil.g:639:7: ( NCNAME LBRACKET )
		// antlr/Plexil.g:639:8: NCNAME LBRACKET
		{
		match(input,NCNAME,FOLLOW_NCNAME_in_synpred9_Plexil3384); if (state.failed) return;

		match(input,LBRACKET,FOLLOW_LBRACKET_in_synpred9_Plexil3386); if (state.failed) return;

		}

	}
	// $ANTLR end synpred9_Plexil

	// $ANTLR start synpred10_Plexil
	public final void synpred10_Plexil_fragment() throws RecognitionException {
		// antlr/Plexil.g:643:6: ( NCNAME LBRACKET )
		// antlr/Plexil.g:643:7: NCNAME LBRACKET
		{
		match(input,NCNAME,FOLLOW_NCNAME_in_synpred10_Plexil3425); if (state.failed) return;

		match(input,LBRACKET,FOLLOW_LBRACKET_in_synpred10_Plexil3427); if (state.failed) return;

		}

	}
	// $ANTLR end synpred10_Plexil

	// $ANTLR start synpred11_Plexil
	public final void synpred11_Plexil_fragment() throws RecognitionException {
		// antlr/Plexil.g:724:5: ( NCNAME LBRACKET )
		// antlr/Plexil.g:724:7: NCNAME LBRACKET
		{
		match(input,NCNAME,FOLLOW_NCNAME_in_synpred11_Plexil3989); if (state.failed) return;

		match(input,LBRACKET,FOLLOW_LBRACKET_in_synpred11_Plexil3991); if (state.failed) return;

		}

	}
	// $ANTLR end synpred11_Plexil

	// $ANTLR start synpred12_Plexil
	public final void synpred12_Plexil_fragment() throws RecognitionException {
		// antlr/Plexil.g:732:4: ( NCNAME LPAREN )
		// antlr/Plexil.g:732:5: NCNAME LPAREN
		{
		match(input,NCNAME,FOLLOW_NCNAME_in_synpred12_Plexil4026); if (state.failed) return;

		match(input,LPAREN,FOLLOW_LPAREN_in_synpred12_Plexil4028); if (state.failed) return;

		}

	}
	// $ANTLR end synpred12_Plexil

	// $ANTLR start synpred13_Plexil
	public final void synpred13_Plexil_fragment() throws RecognitionException {
		// antlr/Plexil.g:734:4: ( LPAREN expression RPAREN LPAREN )
		// antlr/Plexil.g:734:5: LPAREN expression RPAREN LPAREN
		{
		match(input,LPAREN,FOLLOW_LPAREN_in_synpred13_Plexil4042); if (state.failed) return;

		pushFollow(FOLLOW_expression_in_synpred13_Plexil4044);
		expression();
		state._fsp--;
		if (state.failed) return;

		match(input,RPAREN,FOLLOW_RPAREN_in_synpred13_Plexil4046); if (state.failed) return;

		match(input,LPAREN,FOLLOW_LPAREN_in_synpred13_Plexil4048); if (state.failed) return;

		}

	}
	// $ANTLR end synpred13_Plexil

	// $ANTLR start synpred14_Plexil
	public final void synpred14_Plexil_fragment() throws RecognitionException {
		// antlr/Plexil.g:933:5: ( lookupExpr LBRACKET )
		// antlr/Plexil.g:933:6: lookupExpr LBRACKET
		{
		pushFollow(FOLLOW_lookupExpr_in_synpred14_Plexil5144);
		lookupExpr();
		state._fsp--;
		if (state.failed) return;

		match(input,LBRACKET,FOLLOW_LBRACKET_in_synpred14_Plexil5146); if (state.failed) return;

		}

	}
	// $ANTLR end synpred14_Plexil

	// $ANTLR start synpred15_Plexil
	public final void synpred15_Plexil_fragment() throws RecognitionException {
		// antlr/Plexil.g:937:5: ( ( NCNAME | SELF_KYWD | PARENT_KYWD ) PERIOD COMMAND_HANDLE_KYWD )
		// antlr/Plexil.g:937:7: ( NCNAME | SELF_KYWD | PARENT_KYWD ) PERIOD COMMAND_HANDLE_KYWD
		{
		if ( input.LA(1)==NCNAME||input.LA(1)==PARENT_KYWD||input.LA(1)==SELF_KYWD ) {
			input.consume();
			state.errorRecovery=false;
			state.failed=false;
		}
		else {
			if (state.backtracking>0) {state.failed=true; return;}
			MismatchedSetException mse = new MismatchedSetException(null,input);
			throw mse;
		}
		match(input,PERIOD,FOLLOW_PERIOD_in_synpred15_Plexil5189); if (state.failed) return;

		match(input,COMMAND_HANDLE_KYWD,FOLLOW_COMMAND_HANDLE_KYWD_in_synpred15_Plexil5191); if (state.failed) return;

		}

	}
	// $ANTLR end synpred15_Plexil

	// $ANTLR start synpred16_Plexil
	public final void synpred16_Plexil_fragment() throws RecognitionException {
		// antlr/Plexil.g:938:5: ( ( NCNAME | SELF_KYWD | PARENT_KYWD ) PERIOD FAILURE_KYWD )
		// antlr/Plexil.g:938:7: ( NCNAME | SELF_KYWD | PARENT_KYWD ) PERIOD FAILURE_KYWD
		{
		if ( input.LA(1)==NCNAME||input.LA(1)==PARENT_KYWD||input.LA(1)==SELF_KYWD ) {
			input.consume();
			state.errorRecovery=false;
			state.failed=false;
		}
		else {
			if (state.backtracking>0) {state.failed=true; return;}
			MismatchedSetException mse = new MismatchedSetException(null,input);
			throw mse;
		}
		match(input,PERIOD,FOLLOW_PERIOD_in_synpred16_Plexil5216); if (state.failed) return;

		match(input,FAILURE_KYWD,FOLLOW_FAILURE_KYWD_in_synpred16_Plexil5218); if (state.failed) return;

		}

	}
	// $ANTLR end synpred16_Plexil

	// $ANTLR start synpred17_Plexil
	public final void synpred17_Plexil_fragment() throws RecognitionException {
		// antlr/Plexil.g:939:5: ( ( NCNAME | SELF_KYWD | PARENT_KYWD ) PERIOD OUTCOME_KYWD )
		// antlr/Plexil.g:939:7: ( NCNAME | SELF_KYWD | PARENT_KYWD ) PERIOD OUTCOME_KYWD
		{
		if ( input.LA(1)==NCNAME||input.LA(1)==PARENT_KYWD||input.LA(1)==SELF_KYWD ) {
			input.consume();
			state.errorRecovery=false;
			state.failed=false;
		}
		else {
			if (state.backtracking>0) {state.failed=true; return;}
			MismatchedSetException mse = new MismatchedSetException(null,input);
			throw mse;
		}
		match(input,PERIOD,FOLLOW_PERIOD_in_synpred17_Plexil5243); if (state.failed) return;

		match(input,OUTCOME_KYWD,FOLLOW_OUTCOME_KYWD_in_synpred17_Plexil5245); if (state.failed) return;

		}

	}
	// $ANTLR end synpred17_Plexil

	// $ANTLR start synpred18_Plexil
	public final void synpred18_Plexil_fragment() throws RecognitionException {
		// antlr/Plexil.g:940:5: ( ( NCNAME | SELF_KYWD | PARENT_KYWD ) PERIOD STATE_KYWD )
		// antlr/Plexil.g:940:7: ( NCNAME | SELF_KYWD | PARENT_KYWD ) PERIOD STATE_KYWD
		{
		if ( input.LA(1)==NCNAME||input.LA(1)==PARENT_KYWD||input.LA(1)==SELF_KYWD ) {
			input.consume();
			state.errorRecovery=false;
			state.failed=false;
		}
		else {
			if (state.backtracking>0) {state.failed=true; return;}
			MismatchedSetException mse = new MismatchedSetException(null,input);
			throw mse;
		}
		match(input,PERIOD,FOLLOW_PERIOD_in_synpred18_Plexil5270); if (state.failed) return;

		match(input,STATE_KYWD,FOLLOW_STATE_KYWD_in_synpred18_Plexil5272); if (state.failed) return;

		}

	}
	// $ANTLR end synpred18_Plexil

	// $ANTLR start synpred19_Plexil
	public final void synpred19_Plexil_fragment() throws RecognitionException {
		// antlr/Plexil.g:941:5: ( ( NCNAME | SELF_KYWD | PARENT_KYWD ) PERIOD nodeStateKywd )
		// antlr/Plexil.g:941:7: ( NCNAME | SELF_KYWD | PARENT_KYWD ) PERIOD nodeStateKywd
		{
		if ( input.LA(1)==NCNAME||input.LA(1)==PARENT_KYWD||input.LA(1)==SELF_KYWD ) {
			input.consume();
			state.errorRecovery=false;
			state.failed=false;
		}
		else {
			if (state.backtracking>0) {state.failed=true; return;}
			MismatchedSetException mse = new MismatchedSetException(null,input);
			throw mse;
		}
		match(input,PERIOD,FOLLOW_PERIOD_in_synpred19_Plexil5297); if (state.failed) return;

		pushFollow(FOLLOW_nodeStateKywd_in_synpred19_Plexil5299);
		nodeStateKywd();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred19_Plexil

	// $ANTLR start synpred20_Plexil
	public final void synpred20_Plexil_fragment() throws RecognitionException {
		// antlr/Plexil.g:942:5: ( NCNAME LBRACKET )
		// antlr/Plexil.g:942:6: NCNAME LBRACKET
		{
		match(input,NCNAME,FOLLOW_NCNAME_in_synpred20_Plexil5311); if (state.failed) return;

		match(input,LBRACKET,FOLLOW_LBRACKET_in_synpred20_Plexil5313); if (state.failed) return;

		}

	}
	// $ANTLR end synpred20_Plexil

	// $ANTLR start synpred21_Plexil
	public final void synpred21_Plexil_fragment() throws RecognitionException {
		// antlr/Plexil.g:945:5: ( ( CHILD_KYWD | SIBLING_KYWD ) LPAREN NCNAME RPAREN PERIOD COMMAND_HANDLE_KYWD )
		// antlr/Plexil.g:945:7: ( CHILD_KYWD | SIBLING_KYWD ) LPAREN NCNAME RPAREN PERIOD COMMAND_HANDLE_KYWD
		{
		if ( input.LA(1)==CHILD_KYWD||input.LA(1)==SIBLING_KYWD ) {
			input.consume();
			state.errorRecovery=false;
			state.failed=false;
		}
		else {
			if (state.backtracking>0) {state.failed=true; return;}
			MismatchedSetException mse = new MismatchedSetException(null,input);
			throw mse;
		}
		match(input,LPAREN,FOLLOW_LPAREN_in_synpred21_Plexil5341); if (state.failed) return;

		match(input,NCNAME,FOLLOW_NCNAME_in_synpred21_Plexil5343); if (state.failed) return;

		match(input,RPAREN,FOLLOW_RPAREN_in_synpred21_Plexil5345); if (state.failed) return;

		match(input,PERIOD,FOLLOW_PERIOD_in_synpred21_Plexil5347); if (state.failed) return;

		match(input,COMMAND_HANDLE_KYWD,FOLLOW_COMMAND_HANDLE_KYWD_in_synpred21_Plexil5349); if (state.failed) return;

		}

	}
	// $ANTLR end synpred21_Plexil

	// $ANTLR start synpred22_Plexil
	public final void synpred22_Plexil_fragment() throws RecognitionException {
		// antlr/Plexil.g:946:5: ( ( CHILD_KYWD | SIBLING_KYWD ) LPAREN NCNAME RPAREN PERIOD FAILURE_KYWD )
		// antlr/Plexil.g:946:7: ( CHILD_KYWD | SIBLING_KYWD ) LPAREN NCNAME RPAREN PERIOD FAILURE_KYWD
		{
		if ( input.LA(1)==CHILD_KYWD||input.LA(1)==SIBLING_KYWD ) {
			input.consume();
			state.errorRecovery=false;
			state.failed=false;
		}
		else {
			if (state.backtracking>0) {state.failed=true; return;}
			MismatchedSetException mse = new MismatchedSetException(null,input);
			throw mse;
		}
		match(input,LPAREN,FOLLOW_LPAREN_in_synpred22_Plexil5370); if (state.failed) return;

		match(input,NCNAME,FOLLOW_NCNAME_in_synpred22_Plexil5372); if (state.failed) return;

		match(input,RPAREN,FOLLOW_RPAREN_in_synpred22_Plexil5374); if (state.failed) return;

		match(input,PERIOD,FOLLOW_PERIOD_in_synpred22_Plexil5376); if (state.failed) return;

		match(input,FAILURE_KYWD,FOLLOW_FAILURE_KYWD_in_synpred22_Plexil5378); if (state.failed) return;

		}

	}
	// $ANTLR end synpred22_Plexil

	// $ANTLR start synpred23_Plexil
	public final void synpred23_Plexil_fragment() throws RecognitionException {
		// antlr/Plexil.g:947:5: ( ( CHILD_KYWD | SIBLING_KYWD ) LPAREN NCNAME RPAREN PERIOD OUTCOME_KYWD )
		// antlr/Plexil.g:947:7: ( CHILD_KYWD | SIBLING_KYWD ) LPAREN NCNAME RPAREN PERIOD OUTCOME_KYWD
		{
		if ( input.LA(1)==CHILD_KYWD||input.LA(1)==SIBLING_KYWD ) {
			input.consume();
			state.errorRecovery=false;
			state.failed=false;
		}
		else {
			if (state.backtracking>0) {state.failed=true; return;}
			MismatchedSetException mse = new MismatchedSetException(null,input);
			throw mse;
		}
		match(input,LPAREN,FOLLOW_LPAREN_in_synpred23_Plexil5399); if (state.failed) return;

		match(input,NCNAME,FOLLOW_NCNAME_in_synpred23_Plexil5401); if (state.failed) return;

		match(input,RPAREN,FOLLOW_RPAREN_in_synpred23_Plexil5403); if (state.failed) return;

		match(input,PERIOD,FOLLOW_PERIOD_in_synpred23_Plexil5405); if (state.failed) return;

		match(input,OUTCOME_KYWD,FOLLOW_OUTCOME_KYWD_in_synpred23_Plexil5407); if (state.failed) return;

		}

	}
	// $ANTLR end synpred23_Plexil

	// $ANTLR start synpred24_Plexil
	public final void synpred24_Plexil_fragment() throws RecognitionException {
		// antlr/Plexil.g:948:5: ( ( CHILD_KYWD | SIBLING_KYWD ) LPAREN NCNAME RPAREN PERIOD STATE_KYWD )
		// antlr/Plexil.g:948:7: ( CHILD_KYWD | SIBLING_KYWD ) LPAREN NCNAME RPAREN PERIOD STATE_KYWD
		{
		if ( input.LA(1)==CHILD_KYWD||input.LA(1)==SIBLING_KYWD ) {
			input.consume();
			state.errorRecovery=false;
			state.failed=false;
		}
		else {
			if (state.backtracking>0) {state.failed=true; return;}
			MismatchedSetException mse = new MismatchedSetException(null,input);
			throw mse;
		}
		match(input,LPAREN,FOLLOW_LPAREN_in_synpred24_Plexil5428); if (state.failed) return;

		match(input,NCNAME,FOLLOW_NCNAME_in_synpred24_Plexil5430); if (state.failed) return;

		match(input,RPAREN,FOLLOW_RPAREN_in_synpred24_Plexil5432); if (state.failed) return;

		match(input,PERIOD,FOLLOW_PERIOD_in_synpred24_Plexil5434); if (state.failed) return;

		match(input,STATE_KYWD,FOLLOW_STATE_KYWD_in_synpred24_Plexil5436); if (state.failed) return;

		}

	}
	// $ANTLR end synpred24_Plexil

	// $ANTLR start synpred25_Plexil
	public final void synpred25_Plexil_fragment() throws RecognitionException {
		// antlr/Plexil.g:949:5: ( ( CHILD_KYWD | SIBLING_KYWD ) LPAREN NCNAME RPAREN PERIOD nodeStateKywd )
		// antlr/Plexil.g:949:7: ( CHILD_KYWD | SIBLING_KYWD ) LPAREN NCNAME RPAREN PERIOD nodeStateKywd
		{
		if ( input.LA(1)==CHILD_KYWD||input.LA(1)==SIBLING_KYWD ) {
			input.consume();
			state.errorRecovery=false;
			state.failed=false;
		}
		else {
			if (state.backtracking>0) {state.failed=true; return;}
			MismatchedSetException mse = new MismatchedSetException(null,input);
			throw mse;
		}
		match(input,LPAREN,FOLLOW_LPAREN_in_synpred25_Plexil5457); if (state.failed) return;

		match(input,NCNAME,FOLLOW_NCNAME_in_synpred25_Plexil5459); if (state.failed) return;

		match(input,RPAREN,FOLLOW_RPAREN_in_synpred25_Plexil5461); if (state.failed) return;

		match(input,PERIOD,FOLLOW_PERIOD_in_synpred25_Plexil5463); if (state.failed) return;

		pushFollow(FOLLOW_nodeStateKywd_in_synpred25_Plexil5465);
		nodeStateKywd();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred25_Plexil

	// Delegated rules

	public final boolean synpred10_Plexil() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred10_Plexil_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred11_Plexil() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred11_Plexil_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred21_Plexil() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred21_Plexil_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred22_Plexil() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred22_Plexil_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred20_Plexil() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred20_Plexil_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred14_Plexil() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred14_Plexil_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred13_Plexil() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred13_Plexil_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred15_Plexil() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred15_Plexil_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred1_Plexil() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred1_Plexil_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred12_Plexil() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred12_Plexil_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred16_Plexil() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred16_Plexil_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred2_Plexil() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred2_Plexil_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred9_Plexil() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred9_Plexil_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred3_Plexil() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred3_Plexil_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred4_Plexil() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred4_Plexil_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred5_Plexil() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred5_Plexil_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred6_Plexil() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred6_Plexil_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred7_Plexil() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred7_Plexil_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred8_Plexil() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred8_Plexil_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred17_Plexil() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred17_Plexil_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred18_Plexil() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred18_Plexil_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred19_Plexil() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred19_Plexil_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred25_Plexil() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred25_Plexil_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred23_Plexil() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred23_Plexil_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred24_Plexil() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred24_Plexil_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}


	protected DFA61 dfa61 = new DFA61(this);
	protected DFA78 dfa78 = new DFA78(this);
	static final String DFA61_eotS =
		"\104\uffff";
	static final String DFA61_eofS =
		"\104\uffff";
	static final String DFA61_minS =
		"\1\4\1\10\1\4\31\uffff\1\0\12\uffff\33\0\2\uffff";
	static final String DFA61_maxS =
		"\1\u00b7\1\u00bb\1\u00b7\31\uffff\1\0\12\uffff\33\0\2\uffff";
	static final String DFA61_acceptS =
		"\3\uffff\1\3\76\uffff\1\1\1\2";
	static final String DFA61_specialS =
		"\34\uffff\1\0\12\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13"+
		"\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
		"\1\32\1\33\2\uffff}>";
	static final String[] DFA61_transitionS = {
			"\1\3\7\uffff\1\3\1\uffff\1\3\4\uffff\1\3\2\uffff\2\3\3\uffff\3\3\2\uffff"+
			"\3\3\3\uffff\1\3\2\uffff\2\3\11\uffff\2\3\3\uffff\1\3\1\uffff\5\3\4\uffff"+
			"\1\3\2\uffff\2\3\1\uffff\1\3\1\uffff\1\3\3\uffff\2\3\6\uffff\3\3\1\uffff"+
			"\1\2\1\uffff\4\3\3\uffff\1\1\3\uffff\3\3\1\uffff\12\3\1\uffff\2\3\7\uffff"+
			"\3\3\4\uffff\1\3\1\uffff\1\3\6\uffff\1\3\5\uffff\1\3\1\uffff\1\3\3\uffff"+
			"\2\3\3\uffff\1\3\4\uffff\1\3\2\uffff\2\3\2\uffff\2\3\7\uffff\1\3",
			"\1\3\11\uffff\1\3\25\uffff\1\3\30\uffff\1\3\1\uffff\1\3\17\uffff\3\3"+
			"\6\uffff\1\34\3\uffff\1\3\2\uffff\1\3\4\uffff\1\3\23\uffff\1\3\7\uffff"+
			"\2\3\1\uffff\1\3\22\uffff\1\3\5\uffff\1\3\32\uffff\1\3",
			"\1\53\7\uffff\1\53\1\uffff\1\53\4\uffff\1\52\2\uffff\1\53\1\64\3\uffff"+
			"\3\76\2\uffff\3\76\3\uffff\1\73\2\uffff\1\71\1\74\11\uffff\1\100\1\77"+
			"\3\uffff\1\100\1\uffff\1\101\1\67\2\100\1\53\4\uffff\1\75\2\uffff\1\100"+
			"\1\70\1\uffff\1\101\1\uffff\1\77\3\uffff\1\55\1\100\6\uffff\1\56\1\60"+
			"\1\57\1\uffff\1\51\1\uffff\1\54\1\61\1\47\1\54\3\uffff\1\63\3\uffff\3"+
			"\62\1\uffff\12\62\1\uffff\1\62\1\50\7\uffff\2\77\1\66\4\uffff\1\77\1"+
			"\uffff\1\77\6\uffff\1\53\5\uffff\1\53\1\uffff\1\66\3\uffff\1\65\1\101"+
			"\3\uffff\1\53\4\uffff\1\72\2\uffff\1\53\1\101\2\uffff\1\67\1\53\7\uffff"+
			"\1\100",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			""
	};

	static final short[] DFA61_eot = DFA.unpackEncodedString(DFA61_eotS);
	static final short[] DFA61_eof = DFA.unpackEncodedString(DFA61_eofS);
	static final char[] DFA61_min = DFA.unpackEncodedStringToUnsignedChars(DFA61_minS);
	static final char[] DFA61_max = DFA.unpackEncodedStringToUnsignedChars(DFA61_maxS);
	static final short[] DFA61_accept = DFA.unpackEncodedString(DFA61_acceptS);
	static final short[] DFA61_special = DFA.unpackEncodedString(DFA61_specialS);
	static final short[][] DFA61_transition;

	static {
		int numStates = DFA61_transitionS.length;
		DFA61_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA61_transition[i] = DFA.unpackEncodedString(DFA61_transitionS[i]);
		}
	}

	protected class DFA61 extends DFA {

		public DFA61(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 61;
			this.eot = DFA61_eot;
			this.eof = DFA61_eof;
			this.min = DFA61_min;
			this.max = DFA61_max;
			this.accept = DFA61_accept;
			this.special = DFA61_special;
			this.transition = DFA61_transition;
		}
		@Override
		public String getDescription() {
			return "731:1: assignmentRHS : ( ( NCNAME LPAREN )=> commandInvocation | ( LPAREN expression RPAREN LPAREN )=> commandInvocation | expression );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA61_28 = input.LA(1);
						 
						int index61_28 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred12_Plexil()) ) {s = 66;}
						else if ( (synpred13_Plexil()) ) {s = 67;}
						 
						input.seek(index61_28);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA61_39 = input.LA(1);
						 
						int index61_39 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred12_Plexil()) ) {s = 66;}
						else if ( (synpred13_Plexil()) ) {s = 67;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index61_39);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA61_40 = input.LA(1);
						 
						int index61_40 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred12_Plexil()) ) {s = 66;}
						else if ( (synpred13_Plexil()) ) {s = 67;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index61_40);
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA61_41 = input.LA(1);
						 
						int index61_41 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred12_Plexil()) ) {s = 66;}
						else if ( (synpred13_Plexil()) ) {s = 67;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index61_41);
						if ( s>=0 ) return s;
						break;

					case 4 : 
						int LA61_42 = input.LA(1);
						 
						int index61_42 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred12_Plexil()) ) {s = 66;}
						else if ( (synpred13_Plexil()) ) {s = 67;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index61_42);
						if ( s>=0 ) return s;
						break;

					case 5 : 
						int LA61_43 = input.LA(1);
						 
						int index61_43 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred12_Plexil()) ) {s = 66;}
						else if ( (synpred13_Plexil()) ) {s = 67;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index61_43);
						if ( s>=0 ) return s;
						break;

					case 6 : 
						int LA61_44 = input.LA(1);
						 
						int index61_44 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred12_Plexil()) ) {s = 66;}
						else if ( (synpred13_Plexil()) ) {s = 67;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index61_44);
						if ( s>=0 ) return s;
						break;

					case 7 : 
						int LA61_45 = input.LA(1);
						 
						int index61_45 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred12_Plexil()) ) {s = 66;}
						else if ( (synpred13_Plexil()) ) {s = 67;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index61_45);
						if ( s>=0 ) return s;
						break;

					case 8 : 
						int LA61_46 = input.LA(1);
						 
						int index61_46 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred12_Plexil()) ) {s = 66;}
						else if ( (synpred13_Plexil()) ) {s = 67;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index61_46);
						if ( s>=0 ) return s;
						break;

					case 9 : 
						int LA61_47 = input.LA(1);
						 
						int index61_47 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred12_Plexil()) ) {s = 66;}
						else if ( (synpred13_Plexil()) ) {s = 67;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index61_47);
						if ( s>=0 ) return s;
						break;

					case 10 : 
						int LA61_48 = input.LA(1);
						 
						int index61_48 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred12_Plexil()) ) {s = 66;}
						else if ( (synpred13_Plexil()) ) {s = 67;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index61_48);
						if ( s>=0 ) return s;
						break;

					case 11 : 
						int LA61_49 = input.LA(1);
						 
						int index61_49 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred12_Plexil()) ) {s = 66;}
						else if ( (synpred13_Plexil()) ) {s = 67;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index61_49);
						if ( s>=0 ) return s;
						break;

					case 12 : 
						int LA61_50 = input.LA(1);
						 
						int index61_50 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred12_Plexil()) ) {s = 66;}
						else if ( (synpred13_Plexil()) ) {s = 67;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index61_50);
						if ( s>=0 ) return s;
						break;

					case 13 : 
						int LA61_51 = input.LA(1);
						 
						int index61_51 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred12_Plexil()) ) {s = 66;}
						else if ( (synpred13_Plexil()) ) {s = 67;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index61_51);
						if ( s>=0 ) return s;
						break;

					case 14 : 
						int LA61_52 = input.LA(1);
						 
						int index61_52 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred12_Plexil()) ) {s = 66;}
						else if ( (synpred13_Plexil()) ) {s = 67;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index61_52);
						if ( s>=0 ) return s;
						break;

					case 15 : 
						int LA61_53 = input.LA(1);
						 
						int index61_53 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred12_Plexil()) ) {s = 66;}
						else if ( (synpred13_Plexil()) ) {s = 67;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index61_53);
						if ( s>=0 ) return s;
						break;

					case 16 : 
						int LA61_54 = input.LA(1);
						 
						int index61_54 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred12_Plexil()) ) {s = 66;}
						else if ( (synpred13_Plexil()) ) {s = 67;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index61_54);
						if ( s>=0 ) return s;
						break;

					case 17 : 
						int LA61_55 = input.LA(1);
						 
						int index61_55 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred12_Plexil()) ) {s = 66;}
						else if ( (synpred13_Plexil()) ) {s = 67;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index61_55);
						if ( s>=0 ) return s;
						break;

					case 18 : 
						int LA61_56 = input.LA(1);
						 
						int index61_56 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred12_Plexil()) ) {s = 66;}
						else if ( (synpred13_Plexil()) ) {s = 67;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index61_56);
						if ( s>=0 ) return s;
						break;

					case 19 : 
						int LA61_57 = input.LA(1);
						 
						int index61_57 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred12_Plexil()) ) {s = 66;}
						else if ( (synpred13_Plexil()) ) {s = 67;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index61_57);
						if ( s>=0 ) return s;
						break;

					case 20 : 
						int LA61_58 = input.LA(1);
						 
						int index61_58 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred12_Plexil()) ) {s = 66;}
						else if ( (synpred13_Plexil()) ) {s = 67;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index61_58);
						if ( s>=0 ) return s;
						break;

					case 21 : 
						int LA61_59 = input.LA(1);
						 
						int index61_59 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred12_Plexil()) ) {s = 66;}
						else if ( (synpred13_Plexil()) ) {s = 67;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index61_59);
						if ( s>=0 ) return s;
						break;

					case 22 : 
						int LA61_60 = input.LA(1);
						 
						int index61_60 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred12_Plexil()) ) {s = 66;}
						else if ( (synpred13_Plexil()) ) {s = 67;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index61_60);
						if ( s>=0 ) return s;
						break;

					case 23 : 
						int LA61_61 = input.LA(1);
						 
						int index61_61 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred12_Plexil()) ) {s = 66;}
						else if ( (synpred13_Plexil()) ) {s = 67;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index61_61);
						if ( s>=0 ) return s;
						break;

					case 24 : 
						int LA61_62 = input.LA(1);
						 
						int index61_62 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred12_Plexil()) ) {s = 66;}
						else if ( (synpred13_Plexil()) ) {s = 67;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index61_62);
						if ( s>=0 ) return s;
						break;

					case 25 : 
						int LA61_63 = input.LA(1);
						 
						int index61_63 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred12_Plexil()) ) {s = 66;}
						else if ( (synpred13_Plexil()) ) {s = 67;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index61_63);
						if ( s>=0 ) return s;
						break;

					case 26 : 
						int LA61_64 = input.LA(1);
						 
						int index61_64 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred12_Plexil()) ) {s = 66;}
						else if ( (synpred13_Plexil()) ) {s = 67;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index61_64);
						if ( s>=0 ) return s;
						break;

					case 27 : 
						int LA61_65 = input.LA(1);
						 
						int index61_65 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred12_Plexil()) ) {s = 66;}
						else if ( (synpred13_Plexil()) ) {s = 67;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index61_65);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 61, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA78_eotS =
		"\106\uffff";
	static final String DFA78_eofS =
		"\106\uffff";
	static final String DFA78_minS =
		"\1\4\5\uffff\1\134\4\uffff\1\10\2\134\1\u0085\14\uffff\2\0\33\uffff\3"+
		"\0\13\uffff";
	static final String DFA78_maxS =
		"\1\u00b7\5\uffff\1\134\4\uffff\1\u00bb\2\134\1\u0085\14\uffff\2\0\33\uffff"+
		"\3\0\13\uffff";
	static final String DFA78_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\5\1\uffff\1\7\1\uffff\1\10\1\11\4\uffff\1\26"+
		"\7\uffff\1\27\1\30\1\31\1\32\2\uffff\1\17\1\20\34\uffff\1\6\1\12\1\13"+
		"\1\14\1\15\1\16\1\21\1\22\1\23\1\24\1\25";
	static final String DFA78_specialS =
		"\13\uffff\1\0\17\uffff\1\1\1\2\33\uffff\1\3\1\4\1\5\13\uffff}>";
	static final String[] DFA78_transitionS = {
			"\1\3\7\uffff\1\3\1\uffff\1\3\4\uffff\1\2\2\uffff\1\3\1\14\3\uffff\3\27"+
			"\2\uffff\3\27\3\uffff\1\17\2\uffff\2\17\11\uffff\1\31\1\30\3\uffff\1"+
			"\31\1\uffff\1\32\1\17\2\31\1\3\4\uffff\1\17\2\uffff\1\31\1\17\1\uffff"+
			"\1\32\1\uffff\1\30\3\uffff\1\5\1\31\6\uffff\1\6\2\7\1\uffff\1\1\1\uffff"+
			"\1\4\1\11\1\17\1\4\3\uffff\1\13\3\uffff\3\12\1\uffff\12\12\1\uffff\1"+
			"\12\10\uffff\2\30\1\16\4\uffff\1\30\1\uffff\1\30\6\uffff\1\3\5\uffff"+
			"\1\3\1\uffff\1\16\3\uffff\1\15\1\32\3\uffff\1\3\4\uffff\1\17\2\uffff"+
			"\1\3\1\32\2\uffff\1\17\1\3\7\uffff\1\31",
			"",
			"",
			"",
			"",
			"",
			"\1\33",
			"",
			"",
			"",
			"",
			"\1\36\11\uffff\2\36\5\uffff\1\36\13\uffff\1\36\2\uffff\1\36\27\uffff"+
			"\2\36\1\uffff\1\36\2\uffff\1\36\13\uffff\1\36\1\35\2\36\1\uffff\1\36"+
			"\4\uffff\1\36\3\uffff\1\36\2\uffff\1\36\1\uffff\1\36\2\uffff\1\36\21"+
			"\uffff\3\36\7\uffff\1\36\1\34\1\uffff\1\36\7\uffff\1\36\4\uffff\1\36"+
			"\3\uffff\1\36\1\uffff\1\36\1\uffff\1\36\3\uffff\1\36\13\uffff\1\36\3"+
			"\uffff\3\36\5\uffff\2\36\1\uffff\1\36",
			"\1\70",
			"\1\71",
			"\1\72",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			""
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
			return "927:1: quantity : ( LPAREN ! expression RPAREN !| BAR expression BAR -> ^( ABS_KYWD expression ) | oneArgFn ^ LPAREN ! expression RPAREN !| twoArgFn ^ LPAREN ! expression COMMA ! expression RPAREN !| isKnownExp | ( lookupExpr LBRACKET )=> lookupArrayReference | lookupExpr | messageReceivedExp | nodeStatePredicateExp | ( ( NCNAME | SELF_KYWD | PARENT_KYWD ) PERIOD COMMAND_HANDLE_KYWD )=> nodeCommandHandleVariable | ( ( NCNAME | SELF_KYWD | PARENT_KYWD ) PERIOD FAILURE_KYWD )=> nodeFailureVariable | ( ( NCNAME | SELF_KYWD | PARENT_KYWD ) PERIOD OUTCOME_KYWD )=> nodeOutcomeVariable | ( ( NCNAME | SELF_KYWD | PARENT_KYWD ) PERIOD STATE_KYWD )=> nodeStateVariable | ( ( NCNAME | SELF_KYWD | PARENT_KYWD ) PERIOD nodeStateKywd )=> nodeTimepointValue | ( NCNAME LBRACKET )=> simpleArrayReference | variable | ( ( CHILD_KYWD | SIBLING_KYWD ) LPAREN NCNAME RPAREN PERIOD COMMAND_HANDLE_KYWD )=> nodeCommandHandleVariable | ( ( CHILD_KYWD | SIBLING_KYWD ) LPAREN NCNAME RPAREN PERIOD FAILURE_KYWD )=> nodeFailureVariable | ( ( CHILD_KYWD | SIBLING_KYWD ) LPAREN NCNAME RPAREN PERIOD OUTCOME_KYWD )=> nodeOutcomeVariable | ( ( CHILD_KYWD | SIBLING_KYWD ) LPAREN NCNAME RPAREN PERIOD STATE_KYWD )=> nodeStateVariable | ( ( CHILD_KYWD | SIBLING_KYWD ) LPAREN NCNAME RPAREN PERIOD nodeStateKywd )=> nodeTimepointValue | literalValue | nodeCommandHandleKywd | nodeFailureKywd | nodeStateKywd | nodeOutcomeKywd );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA78_11 = input.LA(1);
						 
						int index78_11 = input.index();
						input.rewind();
						s = -1;
						if ( (LA78_11==PERIOD) ) {s = 28;}
						else if ( (LA78_11==LBRACKET) && (synpred20_Plexil())) {s = 29;}
						else if ( (LA78_11==AND_KYWD||(LA78_11 >= ASTERISK && LA78_11 <= BAR)||LA78_11==COMMA||LA78_11==CONCURRENCE_KYWD||LA78_11==DEQUALS||(LA78_11 >= FOR_KYWD && LA78_11 <= GEQ)||LA78_11==GREATER||LA78_11==IF_KYWD||LA78_11==LBRACE||(LA78_11 >= LEQ && LA78_11 <= LESS)||LA78_11==LIBRARY_CALL_KYWD||LA78_11==LPAREN||LA78_11==MINUS||LA78_11==MOD_KYWD||LA78_11==NCNAME||LA78_11==NEQUALS||(LA78_11 >= ON_COMMAND_KYWD && LA78_11 <= OR_KYWD)||LA78_11==PERCENT||LA78_11==PLUS||LA78_11==RBRACKET||LA78_11==REQUEST_KYWD||LA78_11==RPAREN||LA78_11==SEMICOLON||LA78_11==SEQUENCE_KYWD||LA78_11==SLASH||LA78_11==SYNCHRONOUS_COMMAND_KYWD||(LA78_11 >= TRY_KYWD && LA78_11 <= UPDATE_KYWD)||(LA78_11 >= WAIT_KYWD && LA78_11 <= WHILE_KYWD)||LA78_11==XOR_KYWD) ) {s = 30;}
						 
						input.seek(index78_11);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA78_27 = input.LA(1);
						 
						int index78_27 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred14_Plexil()) ) {s = 59;}
						else if ( (true) ) {s = 7;}
						 
						input.seek(index78_27);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA78_28 = input.LA(1);
						 
						int index78_28 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred15_Plexil()) ) {s = 60;}
						else if ( (synpred16_Plexil()) ) {s = 61;}
						else if ( (synpred17_Plexil()) ) {s = 62;}
						else if ( (synpred18_Plexil()) ) {s = 63;}
						else if ( (synpred19_Plexil()) ) {s = 64;}
						else if ( (synpred21_Plexil()) ) {s = 65;}
						else if ( (synpred22_Plexil()) ) {s = 66;}
						else if ( (synpred23_Plexil()) ) {s = 67;}
						else if ( (synpred24_Plexil()) ) {s = 68;}
						else if ( (synpred25_Plexil()) ) {s = 69;}
						 
						input.seek(index78_28);
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA78_56 = input.LA(1);
						 
						int index78_56 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred15_Plexil()) ) {s = 60;}
						else if ( (synpred16_Plexil()) ) {s = 61;}
						else if ( (synpred17_Plexil()) ) {s = 62;}
						else if ( (synpred18_Plexil()) ) {s = 63;}
						else if ( (synpred19_Plexil()) ) {s = 64;}
						else if ( (synpred21_Plexil()) ) {s = 65;}
						else if ( (synpred22_Plexil()) ) {s = 66;}
						else if ( (synpred23_Plexil()) ) {s = 67;}
						else if ( (synpred24_Plexil()) ) {s = 68;}
						else if ( (synpred25_Plexil()) ) {s = 69;}
						 
						input.seek(index78_56);
						if ( s>=0 ) return s;
						break;

					case 4 : 
						int LA78_57 = input.LA(1);
						 
						int index78_57 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred15_Plexil()) ) {s = 60;}
						else if ( (synpred16_Plexil()) ) {s = 61;}
						else if ( (synpred17_Plexil()) ) {s = 62;}
						else if ( (synpred18_Plexil()) ) {s = 63;}
						else if ( (synpred19_Plexil()) ) {s = 64;}
						else if ( (synpred21_Plexil()) ) {s = 65;}
						else if ( (synpred22_Plexil()) ) {s = 66;}
						else if ( (synpred23_Plexil()) ) {s = 67;}
						else if ( (synpred24_Plexil()) ) {s = 68;}
						else if ( (synpred25_Plexil()) ) {s = 69;}
						 
						input.seek(index78_57);
						if ( s>=0 ) return s;
						break;

					case 5 : 
						int LA78_58 = input.LA(1);
						 
						int index78_58 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred15_Plexil()) ) {s = 60;}
						else if ( (synpred16_Plexil()) ) {s = 61;}
						else if ( (synpred17_Plexil()) ) {s = 62;}
						else if ( (synpred18_Plexil()) ) {s = 63;}
						else if ( (synpred19_Plexil()) ) {s = 64;}
						else if ( (synpred21_Plexil()) ) {s = 65;}
						else if ( (synpred22_Plexil()) ) {s = 66;}
						else if ( (synpred23_Plexil()) ) {s = 67;}
						else if ( (synpred24_Plexil()) ) {s = 68;}
						else if ( (synpred25_Plexil()) ) {s = 69;}
						 
						input.seek(index78_58);
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

	public static final BitSet FOLLOW_declarations_in_plexilPlan1241 = new BitSet(new long[]{0x0000002000000000L,0x0C00002010840041L,0x0307100010100000L});
	public static final BitSet FOLLOW_action_in_plexilPlan1244 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_plexilPlan1246 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declaration_in_declarations1280 = new BitSet(new long[]{0x0000044080200002L,0x0000000000400200L,0x0000020000010000L});
	public static final BitSet FOLLOW_commandDeclaration_in_declaration1321 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lookupDeclaration_in_declaration1327 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_libraryActionDeclaration_in_declaration1333 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMAND_KYWD_in_commandDeclaration1380 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_NCNAME_in_commandDeclaration1382 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_paramsSpec_in_commandDeclaration1384 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_commandDeclaration1387 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_returnType_in_commandDeclaration1437 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_COMMAND_KYWD_in_commandDeclaration1439 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_NCNAME_in_commandDeclaration1441 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_paramsSpec_in_commandDeclaration1443 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_commandDeclaration1446 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_returnType_in_lookupDeclaration1519 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_LOOKUP_KYWD_in_lookupDeclaration1521 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_NCNAME_in_lookupDeclaration1523 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_paramsSpec_in_lookupDeclaration1525 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_lookupDeclaration1528 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_paramsSpec1563 = new BitSet(new long[]{0x0000244000200200L,0x0000000000000200L,0x0000020001010000L});
	public static final BitSet FOLLOW_paramsSpecGuts_in_paramsSpec1565 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_RPAREN_in_paramsSpec1568 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_paramSpec_in_paramsSpecGuts1597 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_COMMA_in_paramsSpecGuts1601 = new BitSet(new long[]{0x0000044000200200L,0x0000000000000200L,0x0000020000010000L});
	public static final BitSet FOLLOW_paramSpec_in_paramsSpecGuts1604 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_ELLIPSIS_in_paramsSpecGuts1619 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_baseTypeName_in_paramSpec1660 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_LBRACKET_in_paramSpec1662 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_INT_in_paramSpec1664 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_RBRACKET_in_paramSpec1666 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_baseTypeName_in_paramSpec1698 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_NCNAME_in_paramSpec1700 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_LBRACKET_in_paramSpec1702 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_INT_in_paramSpec1704 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_RBRACKET_in_paramSpec1706 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_paramTypeName_in_paramSpec1724 = new BitSet(new long[]{0x0000000000000002L,0x0000002000000000L});
	public static final BitSet FOLLOW_NCNAME_in_paramSpec1727 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_returnTypeSpec_in_returnType1807 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_baseTypeName_in_returnTypeSpec1843 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_LBRACKET_in_returnTypeSpec1845 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_INT_in_returnTypeSpec1847 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_RBRACKET_in_returnTypeSpec1849 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_baseTypeName_in_returnTypeSpec1865 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LIBRARY_ACTION_KYWD_in_libraryActionDeclaration1935 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_NCNAME_in_libraryActionDeclaration1938 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_libraryInterfaceSpec_in_libraryActionDeclaration1940 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_libraryActionDeclaration1943 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_libraryInterfaceSpec1968 = new BitSet(new long[]{0x0000000000000000L,0x000000000000C000L,0x0000000001000000L});
	public static final BitSet FOLLOW_libraryParamSpec_in_libraryInterfaceSpec1972 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_COMMA_in_libraryInterfaceSpec1976 = new BitSet(new long[]{0x0000000000000000L,0x000000000000C000L});
	public static final BitSet FOLLOW_libraryParamSpec_in_libraryInterfaceSpec1978 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_RPAREN_in_libraryInterfaceSpec1986 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IN_KYWD_in_libraryParamSpec2012 = new BitSet(new long[]{0x0000044000200000L,0x0000000000000200L,0x0000020000010000L});
	public static final BitSet FOLLOW_IN_OUT_KYWD_in_libraryParamSpec2017 = new BitSet(new long[]{0x0000044000200000L,0x0000000000000200L,0x0000020000010000L});
	public static final BitSet FOLLOW_baseTypeName_in_libraryParamSpec2023 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_NCNAME_in_libraryParamSpec2036 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_LBRACKET_in_libraryParamSpec2038 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_INT_in_libraryParamSpec2041 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_RBRACKET_in_libraryParamSpec2043 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NCNAME_in_libraryParamSpec2050 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NCNAME_in_action2085 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_COLON_in_action2087 = new BitSet(new long[]{0x0000002000000000L,0x0C00002010840041L,0x0307100010100000L});
	public static final BitSet FOLLOW_baseAction_in_action2094 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_compoundAction_in_baseAction2121 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simpleAction_in_baseAction2125 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_block_in_baseAction2129 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forAction_in_compoundAction2139 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifAction_in_compoundAction2143 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_onCommandAction_in_compoundAction2147 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_onMessageAction_in_compoundAction2151 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whileAction_in_compoundAction2155 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_in_simpleAction2183 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_commandInvocation_in_simpleAction2203 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_simpleAction2205 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_libraryCall_in_simpleAction2212 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_request_in_simpleAction2218 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_update_in_simpleAction2224 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_synchCmd_in_simpleAction2230 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_waitBuiltin_in_simpleAction2236 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FOR_KYWD_in_forAction2261 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LPAREN_in_forAction2268 = new BitSet(new long[]{0x0000044000200000L,0x0000000000000200L,0x0000020000010000L});
	public static final BitSet FOLLOW_baseTypeName_in_forAction2270 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_NCNAME_in_forAction2272 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_EQUALS_in_forAction2274 = new BitSet(new long[]{0xFA30064738C85010L,0x037FEE23D7031590L,0x0080CC846282050EL});
	public static final BitSet FOLLOW_expression_in_forAction2278 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_forAction2284 = new BitSet(new long[]{0xFA30064738C85010L,0x037FEE23D7031590L,0x0080CC846282050EL});
	public static final BitSet FOLLOW_expression_in_forAction2288 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_forAction2294 = new BitSet(new long[]{0xFA30064738C85010L,0x037FEE23D7031590L,0x0080CC846282050EL});
	public static final BitSet FOLLOW_expression_in_forAction2298 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_RPAREN_in_forAction2304 = new BitSet(new long[]{0x0000002000000000L,0x0C00002010840041L,0x0307100010100000L});
	public static final BitSet FOLLOW_action_in_forAction2310 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_KYWD_in_ifAction2364 = new BitSet(new long[]{0xFA30064738C85010L,0x037FEE23D7031590L,0x0080CC846282050EL});
	public static final BitSet FOLLOW_expression_in_ifAction2367 = new BitSet(new long[]{0x0000002000000000L,0x0C00002010840041L,0x0307100010100000L});
	public static final BitSet FOLLOW_action_in_ifAction2369 = new BitSet(new long[]{0x0001C00000000000L});
	public static final BitSet FOLLOW_ELSEIF_KYWD_in_ifAction2376 = new BitSet(new long[]{0xFA30064738C85010L,0x037FEE23D7031590L,0x0080CC846282050EL});
	public static final BitSet FOLLOW_expression_in_ifAction2379 = new BitSet(new long[]{0x0000002000000000L,0x0C00002010840041L,0x0307100010100000L});
	public static final BitSet FOLLOW_action_in_ifAction2381 = new BitSet(new long[]{0x0001C00000000000L});
	public static final BitSet FOLLOW_ELSE_KYWD_in_ifAction2390 = new BitSet(new long[]{0x0000002000000000L,0x0C00002010840041L,0x0307100010100000L});
	public static final BitSet FOLLOW_action_in_ifAction2393 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_ENDIF_KYWD_in_ifAction2401 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_ifAction2408 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ON_COMMAND_KYWD_in_onCommandAction2436 = new BitSet(new long[]{0xFA30064738C85010L,0x037FEE23D7031590L,0x0080CC846282050EL});
	public static final BitSet FOLLOW_expression_in_onCommandAction2439 = new BitSet(new long[]{0x0000002000000000L,0x0C00002010840041L,0x0307100010100000L});
	public static final BitSet FOLLOW_paramsSpec_in_onCommandAction2441 = new BitSet(new long[]{0x0000002000000000L,0x0C00002010840041L,0x0307100010100000L});
	public static final BitSet FOLLOW_action_in_onCommandAction2444 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ON_MESSAGE_KYWD_in_onMessageAction2469 = new BitSet(new long[]{0xFA30064738C85010L,0x037FEE23D7031590L,0x0080CC846282050EL});
	public static final BitSet FOLLOW_expression_in_onMessageAction2475 = new BitSet(new long[]{0x0000002000000000L,0x0C00002010840041L,0x0307100010100000L});
	public static final BitSet FOLLOW_action_in_onMessageAction2477 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_KYWD_in_whileAction2502 = new BitSet(new long[]{0xFA30064738C85010L,0x037FEE23D7031590L,0x0080CC846282050EL});
	public static final BitSet FOLLOW_expression_in_whileAction2505 = new BitSet(new long[]{0x0000002000000000L,0x0C00002010840041L,0x0307100010100000L});
	public static final BitSet FOLLOW_action_in_whileAction2507 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SYNCHRONOUS_COMMAND_KYWD_in_synchCmd2532 = new BitSet(new long[]{0x0000000000000000L,0x0000002010000000L});
	public static final BitSet FOLLOW_commandWithAssignment_in_synchCmd2541 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000200004000000L});
	public static final BitSet FOLLOW_commandInvocation_in_synchCmd2545 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000200004000000L});
	public static final BitSet FOLLOW_TIMEOUT_KYWD_in_synchCmd2552 = new BitSet(new long[]{0xFA30064738C85010L,0x037FEE23D7031590L,0x0080CC846282050EL});
	public static final BitSet FOLLOW_expression_in_synchCmd2555 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_COMMA_in_synchCmd2559 = new BitSet(new long[]{0xFA30064738C85010L,0x037FEE23D7031590L,0x0080CC846282050EL});
	public static final BitSet FOLLOW_expression_in_synchCmd2562 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_synchCmd2571 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WAIT_KYWD_in_waitBuiltin2594 = new BitSet(new long[]{0xFA30064738C85010L,0x037FEE23D7031590L,0x0080CC846282050EL});
	public static final BitSet FOLLOW_expression_in_waitBuiltin2597 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_COMMA_in_waitBuiltin2600 = new BitSet(new long[]{0x0000020000000000L,0x0000002000000100L});
	public static final BitSet FOLLOW_variable_in_waitBuiltin2604 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_INT_in_waitBuiltin2606 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_DOUBLE_in_waitBuiltin2608 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_waitBuiltin2613 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sequenceVariantKywd_in_block2646 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_LBRACE_in_block2648 = new BitSet(new long[]{0x0042046800200000L,0x0C0000201084E241L,0x0307120890395A00L});
	public static final BitSet FOLLOW_LBRACE_in_block2662 = new BitSet(new long[]{0x0042046800200000L,0x0C0000201084E241L,0x0307120890395A00L});
	public static final BitSet FOLLOW_comment_in_block2673 = new BitSet(new long[]{0x0042046000200000L,0x0C0000201084E241L,0x0307120890395A00L});
	public static final BitSet FOLLOW_nodeDeclaration_in_block2680 = new BitSet(new long[]{0x0042046000200000L,0x0C0000201084E241L,0x0307120890395A00L});
	public static final BitSet FOLLOW_nodeAttribute_in_block2687 = new BitSet(new long[]{0x0042002000000000L,0x0C00002010842041L,0x0307100890385A00L});
	public static final BitSet FOLLOW_action_in_block2694 = new BitSet(new long[]{0x0000002000000000L,0x0C00002010840041L,0x0307100010104000L});
	public static final BitSet FOLLOW_RBRACE_in_block2701 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMENT_KYWD_in_comment2763 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_STRING_in_comment2766 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_comment2768 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_interfaceDeclaration_in_nodeDeclaration2782 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableDeclaration_in_nodeDeclaration2788 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nodeCondition_in_nodeAttribute2800 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_priority_in_nodeAttribute2806 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_resource_in_nodeAttribute2812 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_conditionKywd_in_nodeCondition2836 = new BitSet(new long[]{0xFA30064738C85010L,0x037FEE23D7031590L,0x0080CC846282050EL});
	public static final BitSet FOLLOW_expression_in_nodeCondition2839 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_nodeCondition2841 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_RESOURCE_KYWD_in_resource2922 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
	public static final BitSet FOLLOW_NAME_KYWD_in_resource2925 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_EQUALS_in_resource2928 = new BitSet(new long[]{0xFA30064738C85010L,0x037FEE23D7031590L,0x0080CC846282050EL});
	public static final BitSet FOLLOW_expression_in_resource2931 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_COMMA_in_resource2943 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L,0x0008000000041000L});
	public static final BitSet FOLLOW_LOWER_BOUND_KYWD_in_resource2958 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_EQUALS_in_resource2960 = new BitSet(new long[]{0xFA30064738C85010L,0x037FEE23D7031590L,0x0080CC846282050EL});
	public static final BitSet FOLLOW_expression_in_resource2963 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_UPPER_BOUND_KYWD_in_resource2977 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_EQUALS_in_resource2979 = new BitSet(new long[]{0xFA30064738C85010L,0x037FEE23D7031590L,0x0080CC846282050EL});
	public static final BitSet FOLLOW_expression_in_resource2982 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_RELEASE_AT_TERM_KYWD_in_resource2992 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_EQUALS_in_resource2994 = new BitSet(new long[]{0xFA30064738C85010L,0x037FEE23D7031590L,0x0080CC846282050EL});
	public static final BitSet FOLLOW_expression_in_resource2997 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_PRIORITY_KYWD_in_resource3006 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_EQUALS_in_resource3008 = new BitSet(new long[]{0xFA30064738C85010L,0x037FEE23D7031590L,0x0080CC846282050EL});
	public static final BitSet FOLLOW_expression_in_resource3013 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_resource3046 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRIORITY_KYWD_in_priority3068 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_INT_in_priority3074 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_priority3076 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_in_in_interfaceDeclaration3086 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inOut_in_interfaceDeclaration3090 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IN_KYWD_in_in3119 = new BitSet(new long[]{0x0000044000200000L,0x0000002000000200L,0x0000020000010000L});
	public static final BitSet FOLLOW_NCNAME_in_in3132 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_COMMA_in_in3135 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_NCNAME_in_in3138 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_interfaceDeclarations_in_in3148 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_in3163 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IN_OUT_KYWD_in_inOut3190 = new BitSet(new long[]{0x0000044000200000L,0x0000002000000200L,0x0000020000010000L});
	public static final BitSet FOLLOW_NCNAME_in_inOut3202 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_COMMA_in_inOut3205 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_NCNAME_in_inOut3208 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_interfaceDeclarations_in_inOut3218 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_inOut3233 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_baseTypeName_in_interfaceDeclarations3251 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_arrayVariableDecl_in_interfaceDeclarations3268 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_scalarVariableDecl_in_interfaceDeclarations3278 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_COMMA_in_interfaceDeclarations3290 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_arrayVariableDecl_in_interfaceDeclarations3309 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_scalarVariableDecl_in_interfaceDeclarations3321 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_NCNAME_in_variable3345 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_baseTypeName_in_variableDeclaration3375 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_arrayVariableDecl_in_variableDeclaration3391 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_scalarVariableDecl_in_variableDeclaration3401 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_COMMA_in_variableDeclaration3416 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_arrayVariableDecl_in_variableDeclaration3432 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_scalarVariableDecl_in_variableDeclaration3441 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_variableDeclaration3457 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NCNAME_in_scalarVariableDecl3489 = new BitSet(new long[]{0x0008000000000002L});
	public static final BitSet FOLLOW_EQUALS_in_scalarVariableDecl3493 = new BitSet(new long[]{0x1000064000000000L,0x0000000100000100L,0x0000408000000000L});
	public static final BitSet FOLLOW_literalScalarValue_in_scalarVariableDecl3495 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NCNAME_in_arrayVariableDecl3531 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_LBRACKET_in_arrayVariableDecl3533 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_INT_in_arrayVariableDecl3535 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_RBRACKET_in_arrayVariableDecl3537 = new BitSet(new long[]{0x0008000000000002L});
	public static final BitSet FOLLOW_EQUALS_in_arrayVariableDecl3541 = new BitSet(new long[]{0x1000064000000000L,0x0000000100000110L,0x0000408000000000L});
	public static final BitSet FOLLOW_literalValue_in_arrayVariableDecl3543 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_booleanLiteral_in_literalScalarValue3579 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_literalScalarValue3583 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOUBLE_in_literalScalarValue3587 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_literalScalarValue3591 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unaryMinus_in_literalScalarValue3595 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dateLiteral_in_literalScalarValue3603 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_durationLiteral_in_literalScalarValue3607 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HASHPAREN_in_literalArrayValue3620 = new BitSet(new long[]{0x1000064000000000L,0x0000000100000100L,0x0000408001000000L});
	public static final BitSet FOLLOW_literalScalarValue_in_literalArrayValue3622 = new BitSet(new long[]{0x1000064000000000L,0x0000000100000100L,0x0000408001000000L});
	public static final BitSet FOLLOW_RPAREN_in_literalArrayValue3625 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_literalScalarValue_in_literalValue3649 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_literalArrayValue_in_literalValue3653 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lookup_in_lookupArrayReference3694 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_LBRACKET_in_lookupArrayReference3696 = new BitSet(new long[]{0xFA30064738C85010L,0x037FEE23D7031590L,0x0080CC846282050EL});
	public static final BitSet FOLLOW_expression_in_lookupArrayReference3698 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_RBRACKET_in_lookupArrayReference3700 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variable_in_simpleArrayReference3729 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_LBRACKET_in_simpleArrayReference3731 = new BitSet(new long[]{0xFA30064738C85010L,0x037FEE23D7031590L,0x0080CC846282050EL});
	public static final BitSet FOLLOW_expression_in_simpleArrayReference3733 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_RBRACKET_in_simpleArrayReference3735 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NCNAME_in_commandInvocation3777 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LPAREN_in_commandInvocation3793 = new BitSet(new long[]{0xFA30064738C85010L,0x037FEE23D7031590L,0x0080CC846282050EL});
	public static final BitSet FOLLOW_expression_in_commandInvocation3795 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_RPAREN_in_commandInvocation3797 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LPAREN_in_commandInvocation3813 = new BitSet(new long[]{0xFA30064738C85010L,0x037FEE23D7031590L,0x0080CC846382050EL});
	public static final BitSet FOLLOW_argumentList_in_commandInvocation3815 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_RPAREN_in_commandInvocation3818 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignmentLHS_in_commandWithAssignment3863 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_EQUALS_in_commandWithAssignment3865 = new BitSet(new long[]{0x0000000000000000L,0x0000002010000000L});
	public static final BitSet FOLLOW_commandInvocation_in_commandWithAssignment3867 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_argument_in_argumentList3897 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_COMMA_in_argumentList3900 = new BitSet(new long[]{0xFA30064738C85010L,0x037FEE23D7031590L,0x0080CC846282050EL});
	public static final BitSet FOLLOW_argument_in_argumentList3902 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_expression_in_argument3928 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignmentLHS_in_assignment3952 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_EQUALS_in_assignment3954 = new BitSet(new long[]{0xFA30064738C85010L,0x037FEE23D7031590L,0x0080CC846282050EL});
	public static final BitSet FOLLOW_assignmentRHS_in_assignment3956 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_assignment3958 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simpleArrayReference_in_assignmentLHS4001 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variable_in_assignmentLHS4012 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_commandInvocation_in_assignmentRHS4033 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_commandInvocation_in_assignmentRHS4053 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_assignmentRHS4061 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UPDATE_KYWD_in_update4090 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_pair_in_update4095 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_COMMA_in_update4099 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_pair_in_update4102 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_update4110 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_REQUEST_KYWD_in_request4137 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_NCNAME_in_request4140 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_pair_in_request4144 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_COMMA_in_request4148 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_pair_in_request4151 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_request4159 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NCNAME_in_pair4171 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_EQUALS_in_pair4173 = new BitSet(new long[]{0xFA30064738C85010L,0x037FEE23D7031590L,0x0080CC846282050EL});
	public static final BitSet FOLLOW_expression_in_pair4176 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LIBRARY_CALL_KYWD_in_libraryCall4202 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_libraryNodeIdRef_in_libraryCall4205 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_aliasSpecs_in_libraryCall4209 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_SEMICOLON_in_libraryCall4214 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NCNAME_in_libraryNodeIdRef4224 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_aliasSpecs4235 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_aliasSpec_in_aliasSpecs4239 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_COMMA_in_aliasSpecs4243 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_aliasSpec_in_aliasSpecs4245 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_RPAREN_in_aliasSpecs4253 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NCNAME_in_aliasSpec4277 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_EQUALS_in_aliasSpec4279 = new BitSet(new long[]{0xFA30064738C85010L,0x037FEE23D7031590L,0x0080CC846282050EL});
	public static final BitSet FOLLOW_expression_in_aliasSpec4281 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NCNAME_in_nodeParameterName4309 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logicalOr_in_expression4338 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_logicalXOR_in_logicalOr4360 = new BitSet(new long[]{0x0000000000000002L,0x1000000000000000L});
	public static final BitSet FOLLOW_OR_KYWD_in_logicalOr4374 = new BitSet(new long[]{0xFA30064738C85010L,0x037FEE23D7031590L,0x0080CC846282050EL});
	public static final BitSet FOLLOW_logicalXOR_in_logicalOr4378 = new BitSet(new long[]{0x0000000000000002L,0x1000000000000000L});
	public static final BitSet FOLLOW_logicalAnd_in_logicalXOR4421 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_XOR_KYWD_in_logicalXOR4436 = new BitSet(new long[]{0xFA30064738C85010L,0x037FEE23D7031590L,0x0080CC846282050EL});
	public static final BitSet FOLLOW_logicalAnd_in_logicalXOR4440 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_equality_in_logicalAnd4485 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_AND_KYWD_in_logicalAnd4499 = new BitSet(new long[]{0xFA30064738C85010L,0x037FEE23D7031590L,0x0080CC846282050EL});
	public static final BitSet FOLLOW_equality_in_logicalAnd4503 = new BitSet(new long[]{0x0000000000000102L});
	public static final BitSet FOLLOW_relational_in_equality4550 = new BitSet(new long[]{0x0000010000000002L,0x0000010000000000L});
	public static final BitSet FOLLOW_equalityOp_in_equality4564 = new BitSet(new long[]{0xFA30064738C85010L,0x037FEE23D7031590L,0x0080CC846282050EL});
	public static final BitSet FOLLOW_relational_in_equality4568 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_additive_in_relational4628 = new BitSet(new long[]{0x0000000000000002L,0x000000000030000AL});
	public static final BitSet FOLLOW_relationalOp_in_relational4640 = new BitSet(new long[]{0xFA30064738C85010L,0x037FEE23D7031590L,0x0080CC846282050EL});
	public static final BitSet FOLLOW_additive_in_relational4644 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multiplicative_in_additive4721 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_addOp_in_additive4736 = new BitSet(new long[]{0xFA30064738C85010L,0x037FEE23D7031590L,0x0080CC846282050EL});
	public static final BitSet FOLLOW_multiplicative_in_additive4740 = new BitSet(new long[]{0x0000000000000002L,0x0000000100000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_unary_in_multiplicative4801 = new BitSet(new long[]{0x0000000000040002L,0x0000000800000000L,0x0000000100000010L});
	public static final BitSet FOLLOW_multOp_in_multiplicative4816 = new BitSet(new long[]{0xFA30064738C85010L,0x037FEE23D7031590L,0x0080CC846282050EL});
	public static final BitSet FOLLOW_unary_in_multiplicative4820 = new BitSet(new long[]{0x0000000000040002L,0x0000000800000000L,0x0000000100000010L});
	public static final BitSet FOLLOW_unaryMinus_in_unary4894 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unaryOp_in_unary4904 = new BitSet(new long[]{0xFA30064738C85010L,0x017FEE23D7031590L,0x0080CC846282050EL});
	public static final BitSet FOLLOW_quantity_in_unary4907 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_quantity_in_unary4917 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_KYWD_in_unaryOp4932 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MINUS_in_unaryMinus4942 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_INT_in_unaryMinus4946 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MINUS_in_unaryMinus4972 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_DOUBLE_in_unaryMinus4976 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DATE_KYWD_in_dateLiteral5007 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LPAREN_in_dateLiteral5009 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_STRING_in_dateLiteral5013 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_RPAREN_in_dateLiteral5015 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DURATION_KYWD_in_durationLiteral5035 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LPAREN_in_durationLiteral5037 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_STRING_in_durationLiteral5041 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_RPAREN_in_durationLiteral5043 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_quantity5072 = new BitSet(new long[]{0xFA30064738C85010L,0x037FEE23D7031590L,0x0080CC846282050EL});
	public static final BitSet FOLLOW_expression_in_quantity5075 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_RPAREN_in_quantity5077 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BAR_in_quantity5084 = new BitSet(new long[]{0xFA30064738C85010L,0x037FEE23D7031590L,0x0080CC846282050EL});
	public static final BitSet FOLLOW_expression_in_quantity5086 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_BAR_in_quantity5088 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_oneArgFn_in_quantity5102 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LPAREN_in_quantity5105 = new BitSet(new long[]{0xFA30064738C85010L,0x037FEE23D7031590L,0x0080CC846282050EL});
	public static final BitSet FOLLOW_expression_in_quantity5108 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_RPAREN_in_quantity5110 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_twoArgFn_in_quantity5117 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LPAREN_in_quantity5120 = new BitSet(new long[]{0xFA30064738C85010L,0x037FEE23D7031590L,0x0080CC846282050EL});
	public static final BitSet FOLLOW_expression_in_quantity5123 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_COMMA_in_quantity5125 = new BitSet(new long[]{0xFA30064738C85010L,0x037FEE23D7031590L,0x0080CC846282050EL});
	public static final BitSet FOLLOW_expression_in_quantity5128 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_RPAREN_in_quantity5130 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_isKnownExp_in_quantity5137 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lookupArrayReference_in_quantity5151 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lookupExpr_in_quantity5157 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_messageReceivedExp_in_quantity5163 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nodeStatePredicateExp_in_quantity5169 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nodeCommandHandleVariable_in_quantity5196 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nodeFailureVariable_in_quantity5223 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nodeOutcomeVariable_in_quantity5250 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nodeStateVariable_in_quantity5277 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nodeTimepointValue_in_quantity5304 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simpleArrayReference_in_quantity5318 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variable_in_quantity5324 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nodeCommandHandleVariable_in_quantity5354 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nodeFailureVariable_in_quantity5383 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nodeOutcomeVariable_in_quantity5412 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nodeStateVariable_in_quantity5441 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nodeTimepointValue_in_quantity5470 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_literalValue_in_quantity5476 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nodeCommandHandleKywd_in_quantity5482 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nodeFailureKywd_in_quantity5488 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nodeStateKywd_in_quantity5494 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nodeOutcomeKywd_in_quantity5500 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IS_KNOWN_KYWD_in_isKnownExp5601 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LPAREN_in_isKnownExp5607 = new BitSet(new long[]{0xFA30064738C85010L,0x017FEE23D7031590L,0x0080CC846282050EL});
	public static final BitSet FOLLOW_quantity_in_isKnownExp5610 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_RPAREN_in_isKnownExp5612 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nodeStatePredicate_in_nodeStatePredicateExp5714 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LPAREN_in_nodeStatePredicateExp5717 = new BitSet(new long[]{0x0000000000800000L,0x0000002000000000L,0x0000000022000008L});
	public static final BitSet FOLLOW_nodeReference_in_nodeStatePredicateExp5720 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_RPAREN_in_nodeStatePredicateExp5722 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MESSAGE_RECEIVED_KYWD_in_messageReceivedExp5792 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LPAREN_in_messageReceivedExp5795 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_STRING_in_messageReceivedExp5798 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_RPAREN_in_messageReceivedExp5800 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nodeStateVariable_in_nodeState5811 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nodeStateKywd_in_nodeState5815 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nodeReference_in_nodeStateVariable5824 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_PERIOD_in_nodeStateVariable5826 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_STATE_KYWD_in_nodeStateVariable5829 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nodeOutcomeVariable_in_nodeOutcome5842 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nodeOutcomeKywd_in_nodeOutcome5846 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nodeReference_in_nodeOutcomeVariable5855 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_PERIOD_in_nodeOutcomeVariable5857 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
	public static final BitSet FOLLOW_OUTCOME_KYWD_in_nodeOutcomeVariable5860 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nodeCommandHandleVariable_in_nodeCommandHandle5904 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nodeCommandHandleKywd_in_nodeCommandHandle5908 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nodeReference_in_nodeCommandHandleVariable5917 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_PERIOD_in_nodeCommandHandleVariable5919 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMAND_HANDLE_KYWD_in_nodeCommandHandleVariable5922 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nodeFailureVariable_in_nodeFailure5979 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nodeFailureKywd_in_nodeFailure5983 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nodeReference_in_nodeFailureVariable5992 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_PERIOD_in_nodeFailureVariable5994 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_FAILURE_KYWD_in_nodeFailureVariable5997 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nodeReference_in_nodeTimepointValue6057 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_PERIOD_in_nodeTimepointValue6059 = new BitSet(new long[]{0x6210000000000000L,0x0000000000020080L,0x0080000000000000L});
	public static final BitSet FOLLOW_nodeStateKywd_in_nodeTimepointValue6061 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_PERIOD_in_nodeTimepointValue6063 = new BitSet(new long[]{0x0004000000000000L,0x0000000000000000L,0x0000001000000000L});
	public static final BitSet FOLLOW_timepoint_in_nodeTimepointValue6065 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nodeId_in_nodeReference6108 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHILD_KYWD_in_nodeReference6114 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LPAREN_in_nodeReference6117 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_NCNAME_in_nodeReference6120 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_RPAREN_in_nodeReference6122 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SIBLING_KYWD_in_nodeReference6129 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LPAREN_in_nodeReference6132 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_NCNAME_in_nodeReference6135 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_RPAREN_in_nodeReference6137 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lookupOnChange_in_lookupExpr6180 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lookupNow_in_lookupExpr6184 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lookup_in_lookupExpr6188 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LOOKUP_ON_CHANGE_KYWD_in_lookupOnChange6219 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LPAREN_in_lookupOnChange6222 = new BitSet(new long[]{0x0000000000000000L,0x0000002010000000L});
	public static final BitSet FOLLOW_lookupInvocation_in_lookupOnChange6225 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_COMMA_in_lookupOnChange6228 = new BitSet(new long[]{0x0000060000000000L,0x0000002000000100L});
	public static final BitSet FOLLOW_tolerance_in_lookupOnChange6231 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_RPAREN_in_lookupOnChange6235 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_realValue_in_tolerance6245 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_durationLiteral_in_tolerance6249 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variable_in_tolerance6253 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LOOKUP_NOW_KYWD_in_lookupNow6280 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LPAREN_in_lookupNow6283 = new BitSet(new long[]{0x0000000000000000L,0x0000002010000000L});
	public static final BitSet FOLLOW_lookupInvocation_in_lookupNow6286 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_RPAREN_in_lookupNow6288 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LOOKUP_KYWD_in_lookup6318 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LPAREN_in_lookup6321 = new BitSet(new long[]{0x0000000000000000L,0x0000002010000000L});
	public static final BitSet FOLLOW_lookupInvocation_in_lookup6324 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_COMMA_in_lookup6327 = new BitSet(new long[]{0x0000060000000000L,0x0000002000000100L});
	public static final BitSet FOLLOW_tolerance_in_lookup6330 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_RPAREN_in_lookup6334 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_stateName_in_lookupInvocation6350 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
	public static final BitSet FOLLOW_LPAREN_in_lookupInvocation6364 = new BitSet(new long[]{0xFA30064738C85010L,0x037FEE23D7031590L,0x0080CC846282050EL});
	public static final BitSet FOLLOW_stateNameExp_in_lookupInvocation6367 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_RPAREN_in_lookupInvocation6369 = new BitSet(new long[]{0x0000000000000002L,0x0000000010000000L});
	public static final BitSet FOLLOW_LPAREN_in_lookupInvocation6382 = new BitSet(new long[]{0xFA30064738C85010L,0x037FEE23D7031590L,0x0080CC846382050EL});
	public static final BitSet FOLLOW_argumentList_in_lookupInvocation6386 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_RPAREN_in_lookupInvocation6390 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NCNAME_in_stateName6408 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_stateNameExp6426 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_baseTypeName_in_synpred1_Plexil1647 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_LBRACKET_in_synpred1_Plexil1649 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_baseTypeName_in_synpred2_Plexil1683 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_NCNAME_in_synpred2_Plexil1685 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_LBRACKET_in_synpred2_Plexil1687 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_baseTypeName_in_synpred3_Plexil1830 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_LBRACKET_in_synpred3_Plexil1832 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NCNAME_in_synpred4_Plexil2029 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_LBRACKET_in_synpred4_Plexil2031 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NCNAME_in_synpred5_Plexil2170 = new BitSet(new long[]{0x0008000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_set_in_synpred5_Plexil2172 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NCNAME_in_synpred6_Plexil2191 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LPAREN_in_synpred6_Plexil2193 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_synpred6_Plexil2198 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NCNAME_in_synpred7_Plexil3261 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_LBRACKET_in_synpred7_Plexil3263 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NCNAME_in_synpred8_Plexil3302 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_LBRACKET_in_synpred8_Plexil3304 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NCNAME_in_synpred9_Plexil3384 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_LBRACKET_in_synpred9_Plexil3386 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NCNAME_in_synpred10_Plexil3425 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_LBRACKET_in_synpred10_Plexil3427 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NCNAME_in_synpred11_Plexil3989 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_LBRACKET_in_synpred11_Plexil3991 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NCNAME_in_synpred12_Plexil4026 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LPAREN_in_synpred12_Plexil4028 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_synpred13_Plexil4042 = new BitSet(new long[]{0xFA30064738C85010L,0x037FEE23D7031590L,0x0080CC846282050EL});
	public static final BitSet FOLLOW_expression_in_synpred13_Plexil4044 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_RPAREN_in_synpred13_Plexil4046 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LPAREN_in_synpred13_Plexil4048 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lookupExpr_in_synpred14_Plexil5144 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_LBRACKET_in_synpred14_Plexil5146 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_synpred15_Plexil5177 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_PERIOD_in_synpred15_Plexil5189 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMAND_HANDLE_KYWD_in_synpred15_Plexil5191 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_synpred16_Plexil5204 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_PERIOD_in_synpred16_Plexil5216 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_FAILURE_KYWD_in_synpred16_Plexil5218 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_synpred17_Plexil5231 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_PERIOD_in_synpred17_Plexil5243 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
	public static final BitSet FOLLOW_OUTCOME_KYWD_in_synpred17_Plexil5245 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_synpred18_Plexil5258 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_PERIOD_in_synpred18_Plexil5270 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_STATE_KYWD_in_synpred18_Plexil5272 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_synpred19_Plexil5285 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_PERIOD_in_synpred19_Plexil5297 = new BitSet(new long[]{0x6210000000000000L,0x0000000000020080L,0x0080000000000000L});
	public static final BitSet FOLLOW_nodeStateKywd_in_synpred19_Plexil5299 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NCNAME_in_synpred20_Plexil5311 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_LBRACKET_in_synpred20_Plexil5313 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_synpred21_Plexil5333 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LPAREN_in_synpred21_Plexil5341 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_NCNAME_in_synpred21_Plexil5343 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_RPAREN_in_synpred21_Plexil5345 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_PERIOD_in_synpred21_Plexil5347 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_COMMAND_HANDLE_KYWD_in_synpred21_Plexil5349 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_synpred22_Plexil5362 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LPAREN_in_synpred22_Plexil5370 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_NCNAME_in_synpred22_Plexil5372 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_RPAREN_in_synpred22_Plexil5374 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_PERIOD_in_synpred22_Plexil5376 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_FAILURE_KYWD_in_synpred22_Plexil5378 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_synpred23_Plexil5391 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LPAREN_in_synpred23_Plexil5399 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_NCNAME_in_synpred23_Plexil5401 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_RPAREN_in_synpred23_Plexil5403 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_PERIOD_in_synpred23_Plexil5405 = new BitSet(new long[]{0x0000000000000000L,0x2000000000000000L});
	public static final BitSet FOLLOW_OUTCOME_KYWD_in_synpred23_Plexil5407 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_synpred24_Plexil5420 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LPAREN_in_synpred24_Plexil5428 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_NCNAME_in_synpred24_Plexil5430 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_RPAREN_in_synpred24_Plexil5432 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_PERIOD_in_synpred24_Plexil5434 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_STATE_KYWD_in_synpred24_Plexil5436 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_synpred25_Plexil5449 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_LPAREN_in_synpred25_Plexil5457 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_NCNAME_in_synpred25_Plexil5459 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_RPAREN_in_synpred25_Plexil5461 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_PERIOD_in_synpred25_Plexil5463 = new BitSet(new long[]{0x6210000000000000L,0x0000000000020080L,0x0080000000000000L});
	public static final BitSet FOLLOW_nodeStateKywd_in_synpred25_Plexil5465 = new BitSet(new long[]{0x0000000000000002L});
}
