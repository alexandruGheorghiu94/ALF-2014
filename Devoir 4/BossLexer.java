// Generated from Boss.g4 by ANTLR 4.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BossLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Expr=1, Sum=2, Sub=3, Exp=4, Div=5, Mul=6, Pri=7, INT=8, ID=9, EQUAL=10, 
		EOI=11;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"Expr", "Sum", "Sub", "Exp", "Div", "Mul", "Pri", "INT", "ID", "' = '", 
		"' $$'"
	};
	public static final String[] ruleNames = {
		"Expr", "Sum", "Sub", "Exp", "Div", "Mul", "Pri", "INT", "ID", "EQUAL", 
		"EOI"
	};


	public BossLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Boss.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\rW\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3!\n\3\3\4\3\4\3\4\3\4\3\4\5"+
		"\4(\n\4\3\5\3\5\3\5\3\5\3\5\5\5/\n\5\3\6\3\6\3\6\3\6\3\6\5\6\66\n\6\3"+
		"\7\3\7\3\7\3\7\3\7\5\7=\n\7\3\b\3\b\3\b\3\b\3\b\5\bD\n\b\3\t\6\tG\n\t"+
		"\r\t\16\tH\3\n\6\nL\n\n\r\n\16\nM\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\2\2\r\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\3\2\4\3\2\62"+
		";\4\2C\\c|^\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\3\31\3\2\2\2\5 \3\2\2\2\7\'\3\2\2\2\t.\3\2\2\2\13\65\3\2\2\2"+
		"\r<\3\2\2\2\17C\3\2\2\2\21F\3\2\2\2\23K\3\2\2\2\25O\3\2\2\2\27S\3\2\2"+
		"\2\31\32\5\5\3\2\32\4\3\2\2\2\33\34\5\7\4\2\34\35\7-\2\2\35\36\5\5\3\2"+
		"\36!\3\2\2\2\37!\5\7\4\2 \33\3\2\2\2 \37\3\2\2\2!\6\3\2\2\2\"#\5\t\5\2"+
		"#$\7/\2\2$%\5\7\4\2%(\3\2\2\2&(\5\t\5\2\'\"\3\2\2\2\'&\3\2\2\2(\b\3\2"+
		"\2\2)*\5\13\6\2*+\7`\2\2+,\5\t\5\2,/\3\2\2\2-/\5\13\6\2.)\3\2\2\2.-\3"+
		"\2\2\2/\n\3\2\2\2\60\61\5\r\7\2\61\62\7\61\2\2\62\63\5\13\6\2\63\66\3"+
		"\2\2\2\64\66\5\r\7\2\65\60\3\2\2\2\65\64\3\2\2\2\66\f\3\2\2\2\678\5\17"+
		"\b\289\7,\2\29:\5\r\7\2:=\3\2\2\2;=\5\17\b\2<\67\3\2\2\2<;\3\2\2\2=\16"+
		"\3\2\2\2>D\5\21\t\2?@\7*\2\2@A\5\5\3\2AB\7+\2\2BD\3\2\2\2C>\3\2\2\2C?"+
		"\3\2\2\2D\20\3\2\2\2EG\t\2\2\2FE\3\2\2\2GH\3\2\2\2HF\3\2\2\2HI\3\2\2\2"+
		"I\22\3\2\2\2JL\t\3\2\2KJ\3\2\2\2LM\3\2\2\2MK\3\2\2\2MN\3\2\2\2N\24\3\2"+
		"\2\2OP\7\"\2\2PQ\7?\2\2QR\7\"\2\2R\26\3\2\2\2ST\7\"\2\2TU\7&\2\2UV\7&"+
		"\2\2V\30\3\2\2\2\13\2 \'.\65<CHM\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}