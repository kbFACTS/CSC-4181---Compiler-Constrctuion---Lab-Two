public interface ParserTokens
{
	static public final int EOF = -1;
	static public final int ADDOP = 1;
   static public final int MULOP = 12;
	//static public final int EXP = 13;
   static public final int WORD = 2;
	static public final int LPAREN = 10;
   static public final int RPAREN = 11;
	static public final int NUMBER = 20;
	static public final int NEWLINE = 90;
	static public final int ERROR = 99;
}