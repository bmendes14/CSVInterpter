// Generated from Interpreter.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class InterpreterLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, CSV=20, ID=21, INT=22, STRING=23, WS=24, COMMENT=25;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "CSV", "ID", "INT", "STRING", "WS", "COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'print'", "';'", "'printFile'", "'='", "'load('", "')'", "'save('", 
		"'*'", "'+'", "'-'", "'/'", "'%'", "'^'", "'++'", "'--'", "'<<'", "'selectC('", 
		"','", "'unite('"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, "CSV", "ID", "INT", "STRING", 
		"WS", "COMMENT"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public InterpreterLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Interpreter.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\33\u00b1\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\6\25"+
		"\u0080\n\25\r\25\16\25\u0081\3\25\3\25\3\25\3\25\3\25\3\26\6\26\u008a"+
		"\n\26\r\26\16\26\u008b\3\27\6\27\u008f\n\27\r\27\16\27\u0090\3\30\3\30"+
		"\3\30\3\30\7\30\u0097\n\30\f\30\16\30\u009a\13\30\3\30\3\30\3\31\6\31"+
		"\u009f\n\31\r\31\16\31\u00a0\3\31\3\31\3\32\3\32\3\32\3\32\7\32\u00a9"+
		"\n\32\f\32\16\32\u00ac\13\32\3\32\3\32\3\32\3\32\4\u0081\u00aa\2\33\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\3\2\6\4\2C\\c|\3\2\62"+
		";\3\2$$\5\2\13\f\17\17\"\"\2\u00b7\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\3\65\3\2"+
		"\2\2\5;\3\2\2\2\7=\3\2\2\2\tG\3\2\2\2\13I\3\2\2\2\rO\3\2\2\2\17Q\3\2\2"+
		"\2\21W\3\2\2\2\23Y\3\2\2\2\25[\3\2\2\2\27]\3\2\2\2\31_\3\2\2\2\33a\3\2"+
		"\2\2\35c\3\2\2\2\37f\3\2\2\2!i\3\2\2\2#l\3\2\2\2%u\3\2\2\2\'w\3\2\2\2"+
		")\177\3\2\2\2+\u0089\3\2\2\2-\u008e\3\2\2\2/\u0092\3\2\2\2\61\u009e\3"+
		"\2\2\2\63\u00a4\3\2\2\2\65\66\7r\2\2\66\67\7t\2\2\678\7k\2\289\7p\2\2"+
		"9:\7v\2\2:\4\3\2\2\2;<\7=\2\2<\6\3\2\2\2=>\7r\2\2>?\7t\2\2?@\7k\2\2@A"+
		"\7p\2\2AB\7v\2\2BC\7H\2\2CD\7k\2\2DE\7n\2\2EF\7g\2\2F\b\3\2\2\2GH\7?\2"+
		"\2H\n\3\2\2\2IJ\7n\2\2JK\7q\2\2KL\7c\2\2LM\7f\2\2MN\7*\2\2N\f\3\2\2\2"+
		"OP\7+\2\2P\16\3\2\2\2QR\7u\2\2RS\7c\2\2ST\7x\2\2TU\7g\2\2UV\7*\2\2V\20"+
		"\3\2\2\2WX\7,\2\2X\22\3\2\2\2YZ\7-\2\2Z\24\3\2\2\2[\\\7/\2\2\\\26\3\2"+
		"\2\2]^\7\61\2\2^\30\3\2\2\2_`\7\'\2\2`\32\3\2\2\2ab\7`\2\2b\34\3\2\2\2"+
		"cd\7-\2\2de\7-\2\2e\36\3\2\2\2fg\7/\2\2gh\7/\2\2h \3\2\2\2ij\7>\2\2jk"+
		"\7>\2\2k\"\3\2\2\2lm\7u\2\2mn\7g\2\2no\7n\2\2op\7g\2\2pq\7e\2\2qr\7v\2"+
		"\2rs\7E\2\2st\7*\2\2t$\3\2\2\2uv\7.\2\2v&\3\2\2\2wx\7w\2\2xy\7p\2\2yz"+
		"\7k\2\2z{\7v\2\2{|\7g\2\2|}\7*\2\2}(\3\2\2\2~\u0080\t\2\2\2\177~\3\2\2"+
		"\2\u0080\u0081\3\2\2\2\u0081\u0082\3\2\2\2\u0081\177\3\2\2\2\u0082\u0083"+
		"\3\2\2\2\u0083\u0084\7\60\2\2\u0084\u0085\7e\2\2\u0085\u0086\7u\2\2\u0086"+
		"\u0087\7x\2\2\u0087*\3\2\2\2\u0088\u008a\t\2\2\2\u0089\u0088\3\2\2\2\u008a"+
		"\u008b\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c,\3\2\2\2"+
		"\u008d\u008f\t\3\2\2\u008e\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u008e"+
		"\3\2\2\2\u0090\u0091\3\2\2\2\u0091.\3\2\2\2\u0092\u0098\7$\2\2\u0093\u0094"+
		"\7$\2\2\u0094\u0097\7$\2\2\u0095\u0097\n\4\2\2\u0096\u0093\3\2\2\2\u0096"+
		"\u0095\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2"+
		"\2\2\u0099\u009b\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u009c\7$\2\2\u009c"+
		"\60\3\2\2\2\u009d\u009f\t\5\2\2\u009e\u009d\3\2\2\2\u009f\u00a0\3\2\2"+
		"\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3"+
		"\b\31\2\2\u00a3\62\3\2\2\2\u00a4\u00a5\7\61\2\2\u00a5\u00a6\7\61\2\2\u00a6"+
		"\u00aa\3\2\2\2\u00a7\u00a9\13\2\2\2\u00a8\u00a7\3\2\2\2\u00a9\u00ac\3"+
		"\2\2\2\u00aa\u00ab\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ad\3\2\2\2\u00ac"+
		"\u00aa\3\2\2\2\u00ad\u00ae\7\f\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\b\32"+
		"\2\2\u00b0\64\3\2\2\2\n\2\u0081\u008b\u0090\u0096\u0098\u00a0\u00aa\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}