// $ANTLR 2.7.6 (20060405): "plexilscript.g" -> "PlexilScriptLexer.java"$

  package plexilscript;
  import java.util.List;
  import java.util.LinkedList;

public interface PlexilScriptParserTokenTypes {
	int EOF = 1;
	int NULL_TREE_LOOKAHEAD = 3;
	// "initial-state" = 4
	int LBRACE = 5;
	int RBRACE = 6;
	int LITERAL_simultaneous = 7;
	int LITERAL_script = 8;
	// "update-ack" = 9
	int ID = 10;
	int SEMI = 11;
	int LITERAL_state = 12;
	int EQUALS = 13;
	int COLON = 14;
	// "function-call" = 15
	int LITERAL_command = 16;
	// "command-abort" = 17
	// "command-ack" = 18
	// "command-accepted" = 19
	// "command-denied" = 20
	// "command-sent-to-system" = 21
	// "command-rcvd-by-system" = 22
	// "command-success" = 23
	// "command-failed" = 24
	int LPAREN = 25;
	int COMMA = 26;
	int RPAREN = 27;
	int LITERAL_true = 28;
	int LITERAL_false = 29;
	int UNKNOWN = 30;
	int STRING = 31;
	int NUMBER = 32;
	// "int-array" = 33
	// "string-array" = 34
	// "real-array" = 35
	int LITERAL_string = 36;
	// "bool-array" = 37
	int LITERAL_int = 38;
	int LITERAL_real = 39;
	int LITERAL_bool = 40;
	int LETTER = 41;
	int DIGIT = 42;
	int WS = 43;
	int COMMENT = 44;
}
