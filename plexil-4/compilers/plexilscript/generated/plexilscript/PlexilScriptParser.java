// $ANTLR 2.7.6 (20060405): "plexilscript.g" -> "PlexilScriptParser.java"$

  package plexilscript;
  import java.util.List;
  import java.util.LinkedList;

import antlr.TokenBuffer;
import antlr.TokenStreamException;
import antlr.TokenStreamIOException;
import antlr.ANTLRException;
import antlr.LLkParser;
import antlr.Token;
import antlr.TokenStream;
import antlr.RecognitionException;
import antlr.NoViableAltException;
import antlr.MismatchedTokenException;
import antlr.SemanticException;
import antlr.ParserSharedInputState;
import antlr.collections.impl.BitSet;

public class PlexilScriptParser extends antlr.LLkParser       implements PlexilScriptParserTokenTypes
 {

protected PlexilScriptParser(TokenBuffer tokenBuf, int k) {
  super(tokenBuf,k);
  tokenNames = _tokenNames;
}

public PlexilScriptParser(TokenBuffer tokenBuf) {
  this(tokenBuf,1);
}

protected PlexilScriptParser(TokenStream lexer, int k) {
  super(lexer,k);
  tokenNames = _tokenNames;
}

public PlexilScriptParser(TokenStream lexer) {
  this(lexer,1);
}

public PlexilScriptParser(ParserSharedInputState state) {
  super(state,1);
  tokenNames = _tokenNames;
}

	public final PlexilScriptAST  plexilScript() throws RecognitionException, TokenStreamException {
		PlexilScriptAST ast = null;
		
		
		try {      // for error handling
			List<ElementAST> es;
			es=elements();
			ast = new PlexilScriptAST (es);
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_0);
		}
		return ast;
	}
	
	public final List<ElementAST>  elements() throws RecognitionException, TokenStreamException {
		List<ElementAST> ast = null;
		
		
		try {      // for error handling
			ElementAST e;
			ast = new LinkedList<ElementAST> ();
			{
			_loop4:
			do {
				if ((_tokenSet_1.member(LA(1)))) {
					e=element();
					ast.add (e);
				}
				else {
					break _loop4;
				}
				
			} while (true);
			}
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_2);
		}
		return ast;
	}
	
	public final ElementAST  element() throws RecognitionException, TokenStreamException {
		ElementAST ast = null;
		
		
		try {      // for error handling
			switch ( LA(1)) {
			case 4:
			{
				ast=initialState();
				break;
			}
			case LITERAL_script:
			{
				ast=script();
				break;
			}
			case LITERAL_state:
			{
				ast=state();
				break;
			}
			case 9:
			{
				ast=updateAck();
				break;
			}
			case LITERAL_command:
			{
				ast=command();
				break;
			}
			case 15:
			{
				ast=functionCall();
				break;
			}
			case 17:
			{
				ast=commandAbort();
				break;
			}
			case LITERAL_simultaneous:
			{
				ast=simultaneous();
				break;
			}
			case 18:
			{
				ast=commandAck();
				break;
			}
			case 19:
			{
				ast=commandAccepted();
				break;
			}
			case 20:
			{
				ast=commandDenied();
				break;
			}
			case 21:
			{
				ast=commandSentToSystem();
				break;
			}
			case 22:
			{
				ast=commandRcvdBySystem();
				break;
			}
			case 23:
			{
				ast=commandSuccess();
				break;
			}
			case 24:
			{
				ast=commandFailed();
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_3);
		}
		return ast;
	}
	
	public final InitialStateAST  initialState() throws RecognitionException, TokenStreamException {
		InitialStateAST ast = null;
		
		
		try {      // for error handling
			List<ElementAST> es;
			match(4);
			match(LBRACE);
			es=elements();
			match(RBRACE);
			ast = new InitialStateAST (es);
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_3);
		}
		return ast;
	}
	
	public final ScriptAST  script() throws RecognitionException, TokenStreamException {
		ScriptAST ast = null;
		
		
		try {      // for error handling
			List<ElementAST> es;
			match(LITERAL_script);
			match(LBRACE);
			es=elements();
			match(RBRACE);
			ast = new ScriptAST (es);
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_3);
		}
		return ast;
	}
	
	public final CommandAST  state() throws RecognitionException, TokenStreamException {
		CommandAST ast = null;
		
		Token  n = null;
		
		try {      // for error handling
			List<ParameterAST> ps; String t; List<String> vs;
			match(LITERAL_state);
			n = LT(1);
			match(ID);
			ps=parameters();
			match(EQUALS);
			vs=values();
			match(COLON);
			t=type();
			match(SEMI);
			ast = new CommandAST ("State", "Value", n.getText(), ps, t, vs);
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_3);
		}
		return ast;
	}
	
	public final UpdateAckAST  updateAck() throws RecognitionException, TokenStreamException {
		UpdateAckAST ast = null;
		
		Token  n = null;
		
		try {      // for error handling
			match(9);
			n = LT(1);
			match(ID);
			match(SEMI);
			ast = new UpdateAckAST (n.getText());
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_3);
		}
		return ast;
	}
	
	public final CommandAST  command() throws RecognitionException, TokenStreamException {
		CommandAST ast = null;
		
		Token  n = null;
		
		try {      // for error handling
			List<ParameterAST> ps; String t; List<String> vs;
			match(LITERAL_command);
			n = LT(1);
			match(ID);
			ps=parameters();
			match(EQUALS);
			vs=values();
			match(COLON);
			t=type();
			match(SEMI);
			ast = new CommandAST ("Command", "Result", n.getText(), ps, t, vs);
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_3);
		}
		return ast;
	}
	
	public final CommandAST  functionCall() throws RecognitionException, TokenStreamException {
		CommandAST ast = null;
		
		Token  n = null;
		
		try {      // for error handling
			List<ParameterAST> ps; String t; List<String> vs;
			match(15);
			n = LT(1);
			match(ID);
			ps=parameters();
			match(EQUALS);
			vs=values();
			match(COLON);
			t=type();
			match(SEMI);
			ast = new CommandAST ("FunctionCall", "Result", n.getText(), ps, t, vs);
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_3);
		}
		return ast;
	}
	
	public final CommandAST  commandAbort() throws RecognitionException, TokenStreamException {
		CommandAST ast = null;
		
		Token  n = null;
		
		try {      // for error handling
			List<ParameterAST> ps; String t; List<String> vs;
			match(17);
			n = LT(1);
			match(ID);
			ps=parameters();
			match(EQUALS);
			vs=values();
			match(COLON);
			t=type();
			match(SEMI);
			ast = new CommandAST ("CommandAbort", "Result", n.getText(), ps, t, vs);
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_3);
		}
		return ast;
	}
	
	public final SimultaneousAST  simultaneous() throws RecognitionException, TokenStreamException {
		SimultaneousAST ast = null;
		
		
		try {      // for error handling
			List<ElementAST> es;
			match(LITERAL_simultaneous);
			match(LBRACE);
			es=elements();
			match(RBRACE);
			ast = new SimultaneousAST (es);
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_3);
		}
		return ast;
	}
	
	public final CommandAST  commandAck() throws RecognitionException, TokenStreamException {
		CommandAST ast = null;
		
		Token  n = null;
		
		try {      // for error handling
			List<ParameterAST> ps; String t; List<String> vs;
			match(18);
			n = LT(1);
			match(ID);
			ps=parameters();
			match(EQUALS);
			vs=values();
			match(COLON);
			t=type();
			match(SEMI);
			ast = new CommandAST ("CommandAck", "Result", n.getText(), ps, t, vs);
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_3);
		}
		return ast;
	}
	
	public final CommandAST  commandAccepted() throws RecognitionException, TokenStreamException {
		CommandAST ast = null;
		
		Token  n = null;
		
		try {      // for error handling
			List<ParameterAST> ps;
			match(19);
			n = LT(1);
			match(ID);
			ps=parameters();
			match(SEMI);
			List<String> vs = new LinkedList<String> (); vs.add ("COMMAND_ACCEPTED");
			ast = new CommandAST ("CommandAck", "Result", n.getText(), ps, "string", vs);
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_3);
		}
		return ast;
	}
	
	public final CommandAST  commandDenied() throws RecognitionException, TokenStreamException {
		CommandAST ast = null;
		
		Token  n = null;
		
		try {      // for error handling
			List<ParameterAST> ps;
			match(20);
			n = LT(1);
			match(ID);
			ps=parameters();
			match(SEMI);
			List<String> vs = new LinkedList<String> (); vs.add ("COMMAND_DENIED");
			ast = new CommandAST ("CommandAck", "Result", n.getText(), ps, "string", vs);
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_3);
		}
		return ast;
	}
	
	public final CommandAST  commandSentToSystem() throws RecognitionException, TokenStreamException {
		CommandAST ast = null;
		
		Token  n = null;
		
		try {      // for error handling
			List<ParameterAST> ps;
			match(21);
			n = LT(1);
			match(ID);
			ps=parameters();
			match(SEMI);
			List<String> vs = new LinkedList<String> (); vs.add ("COMMAND_SENT_TO_SYSTEM");
			ast = new CommandAST ("CommandAck", "Result", n.getText(), ps, "string", vs);
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_3);
		}
		return ast;
	}
	
	public final CommandAST  commandRcvdBySystem() throws RecognitionException, TokenStreamException {
		CommandAST ast = null;
		
		Token  n = null;
		
		try {      // for error handling
			List<ParameterAST> ps;
			match(22);
			n = LT(1);
			match(ID);
			ps=parameters();
			match(SEMI);
			List<String> vs = new LinkedList<String> (); vs.add ("COMMAND_RCVD_BY_SYSTEM");
			ast = new CommandAST ("CommandAck", "Result", n.getText(), ps, "string", vs);
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_3);
		}
		return ast;
	}
	
	public final CommandAST  commandSuccess() throws RecognitionException, TokenStreamException {
		CommandAST ast = null;
		
		Token  n = null;
		
		try {      // for error handling
			List<ParameterAST> ps;
			match(23);
			n = LT(1);
			match(ID);
			ps=parameters();
			match(SEMI);
			List<String> vs = new LinkedList<String> (); vs.add ("COMMAND_SUCCESS");
			ast = new CommandAST ("CommandAck", "Result", n.getText(), ps, "string", vs);
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_3);
		}
		return ast;
	}
	
	public final CommandAST  commandFailed() throws RecognitionException, TokenStreamException {
		CommandAST ast = null;
		
		Token  n = null;
		
		try {      // for error handling
			List<ParameterAST> ps;
			match(24);
			n = LT(1);
			match(ID);
			ps=parameters();
			match(SEMI);
			List<String> vs = new LinkedList<String> (); vs.add ("COMMAND_FAILED");
			ast = new CommandAST ("CommandAck", "Result", n.getText(), ps, "string", vs);
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_3);
		}
		return ast;
	}
	
	public final List<ParameterAST>  parameters() throws RecognitionException, TokenStreamException {
		List<ParameterAST> ast = null;
		
		
		try {      // for error handling
			ParameterAST p;
			ast = new LinkedList<ParameterAST> ();
			match(LPAREN);
			{
			switch ( LA(1)) {
			case LITERAL_true:
			case LITERAL_false:
			case UNKNOWN:
			case STRING:
			case NUMBER:
			{
				p=parameter();
				ast.add (p);
				{
				_loop24:
				do {
					if ((LA(1)==COMMA)) {
						match(COMMA);
						p=parameter();
						ast.add (p);
					}
					else {
						break _loop24;
					}
					
				} while (true);
				}
				break;
			}
			case RPAREN:
			{
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
			match(RPAREN);
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_4);
		}
		return ast;
	}
	
	public final List<String>  values() throws RecognitionException, TokenStreamException {
		List<String> ast = null;
		
		
		try {      // for error handling
			String v; ast = new LinkedList<String> ();
			{
			switch ( LA(1)) {
			case LITERAL_true:
			case LITERAL_false:
			case UNKNOWN:
			case STRING:
			case NUMBER:
			{
				{
				v=value();
				ast.add (v);
				}
				break;
			}
			case LPAREN:
			{
				{
				match(LPAREN);
				v=value();
				ast.add (v);
				{
				_loop31:
				do {
					if ((LA(1)==COMMA)) {
						match(COMMA);
						v=value();
						ast.add (v);
					}
					else {
						break _loop31;
					}
					
				} while (true);
				}
				match(RPAREN);
				}
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
			}
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_5);
		}
		return ast;
	}
	
	public final String  type() throws RecognitionException, TokenStreamException {
		String ast = null;
		
		
		try {      // for error handling
			switch ( LA(1)) {
			case 33:
			{
				match(33);
				ast = "int-array";
				break;
			}
			case 34:
			{
				match(34);
				ast = "string-array";
				break;
			}
			case 35:
			{
				match(35);
				ast = "real-array";
				break;
			}
			case LITERAL_string:
			{
				match(LITERAL_string);
				ast = "string";
				break;
			}
			case 37:
			{
				match(37);
				ast = "bool-array";
				break;
			}
			case LITERAL_int:
			{
				match(LITERAL_int);
				ast = "int";
				break;
			}
			case LITERAL_real:
			{
				match(LITERAL_real);
				ast = "real";
				break;
			}
			case LITERAL_bool:
			{
				match(LITERAL_bool);
				ast = "bool";
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_6);
		}
		return ast;
	}
	
	public final ParameterAST  parameter() throws RecognitionException, TokenStreamException {
		ParameterAST ast = null;
		
		
		try {      // for error handling
			String v, t;
			v=value();
			match(COLON);
			t=type();
			ast = new ParameterAST (v, t);
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_7);
		}
		return ast;
	}
	
	public final String  value() throws RecognitionException, TokenStreamException {
		String ast = null;
		
		Token  u = null;
		Token  s = null;
		Token  n = null;
		
		try {      // for error handling
			switch ( LA(1)) {
			case LITERAL_true:
			{
				match(LITERAL_true);
				ast = "true";
				break;
			}
			case LITERAL_false:
			{
				match(LITERAL_false);
				ast = "false";
				break;
			}
			case UNKNOWN:
			{
				u = LT(1);
				match(UNKNOWN);
				ast = "Plexil_Unknown";
				break;
			}
			case STRING:
			{
				s = LT(1);
				match(STRING);
				ast = s.getText();
				break;
			}
			case NUMBER:
			{
				n = LT(1);
				match(NUMBER);
				ast = n.getText();
				break;
			}
			default:
			{
				throw new NoViableAltException(LT(1), getFilename());
			}
			}
		}
		catch (RecognitionException ex) {
			reportError(ex);
			recover(ex,_tokenSet_8);
		}
		return ast;
	}
	
	
	public static final String[] _tokenNames = {
		"<0>",
		"EOF",
		"<2>",
		"NULL_TREE_LOOKAHEAD",
		"\"initial-state\"",
		"LBRACE",
		"RBRACE",
		"\"simultaneous\"",
		"\"script\"",
		"\"update-ack\"",
		"ID",
		"SEMI",
		"\"state\"",
		"EQUALS",
		"COLON",
		"\"function-call\"",
		"\"command\"",
		"\"command-abort\"",
		"\"command-ack\"",
		"\"command-accepted\"",
		"\"command-denied\"",
		"\"command-sent-to-system\"",
		"\"command-rcvd-by-system\"",
		"\"command-success\"",
		"\"command-failed\"",
		"LPAREN",
		"COMMA",
		"RPAREN",
		"\"true\"",
		"\"false\"",
		"UNKNOWN",
		"STRING",
		"NUMBER",
		"\"int-array\"",
		"\"string-array\"",
		"\"real-array\"",
		"\"string\"",
		"\"bool-array\"",
		"\"int\"",
		"\"real\"",
		"\"bool\"",
		"LETTER",
		"DIGIT",
		"WS",
		"COMMENT"
	};
	
	private static final long[] mk_tokenSet_0() {
		long[] data = { 2L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_0 = new BitSet(mk_tokenSet_0());
	private static final long[] mk_tokenSet_1() {
		long[] data = { 33526672L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_1 = new BitSet(mk_tokenSet_1());
	private static final long[] mk_tokenSet_2() {
		long[] data = { 66L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_2 = new BitSet(mk_tokenSet_2());
	private static final long[] mk_tokenSet_3() {
		long[] data = { 33526738L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_3 = new BitSet(mk_tokenSet_3());
	private static final long[] mk_tokenSet_4() {
		long[] data = { 10240L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_4 = new BitSet(mk_tokenSet_4());
	private static final long[] mk_tokenSet_5() {
		long[] data = { 16384L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_5 = new BitSet(mk_tokenSet_5());
	private static final long[] mk_tokenSet_6() {
		long[] data = { 201328640L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_6 = new BitSet(mk_tokenSet_6());
	private static final long[] mk_tokenSet_7() {
		long[] data = { 201326592L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_7 = new BitSet(mk_tokenSet_7());
	private static final long[] mk_tokenSet_8() {
		long[] data = { 201342976L, 0L};
		return data;
	}
	public static final BitSet _tokenSet_8 = new BitSet(mk_tokenSet_8());
	
	}
