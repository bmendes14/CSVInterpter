// Generated from Csv.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CsvParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, TEXT=4, STRING=5;
	public static final int
		RULE_stat = 0, RULE_program = 1, RULE_header = 2, RULE_row = 3, RULE_field = 4;
	public static final String[] ruleNames = {
		"stat", "program", "header", "row", "field"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','", "'\r'", "'\n'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "TEXT", "STRING"
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

	@Override
	public String getGrammarFileName() { return "Csv.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CsvParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StatContext extends ParserRuleContext {
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CsvParser.EOF, 0); }
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsvListener ) ((CsvListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsvListener ) ((CsvListener)listener).exitStat(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			program();
			setState(11);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramContext extends ParserRuleContext {
		public HeaderContext header() {
			return getRuleContext(HeaderContext.class,0);
		}
		public List<RowContext> row() {
			return getRuleContexts(RowContext.class);
		}
		public RowContext row(int i) {
			return getRuleContext(RowContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsvListener ) ((CsvListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsvListener ) ((CsvListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13);
			header();
			setState(15); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(14);
				row();
				}
				}
				setState(17); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << TEXT) | (1L << STRING))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HeaderContext extends ParserRuleContext {
		public RowContext row() {
			return getRuleContext(RowContext.class,0);
		}
		public HeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsvListener ) ((CsvListener)listener).enterHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsvListener ) ((CsvListener)listener).exitHeader(this);
		}
	}

	public final HeaderContext header() throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_header);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			row();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RowContext extends ParserRuleContext {
		public List<FieldContext> field() {
			return getRuleContexts(FieldContext.class);
		}
		public FieldContext field(int i) {
			return getRuleContext(FieldContext.class,i);
		}
		public RowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_row; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsvListener ) ((CsvListener)listener).enterRow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsvListener ) ((CsvListener)listener).exitRow(this);
		}
	}

	public final RowContext row() throws RecognitionException {
		RowContext _localctx = new RowContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_row);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			field();
			setState(26);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(22);
				match(T__0);
				setState(23);
				field();
				}
				}
				setState(28);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(29);
				match(T__1);
				}
			}

			setState(32);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldContext extends ParserRuleContext {
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
	 
		public FieldContext() { }
		public void copyFrom(FieldContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EmptyFieldContext extends FieldContext {
		public EmptyFieldContext(FieldContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsvListener ) ((CsvListener)listener).enterEmptyField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsvListener ) ((CsvListener)listener).exitEmptyField(this);
		}
	}
	public static class StringFieldContext extends FieldContext {
		public TerminalNode STRING() { return getToken(CsvParser.STRING, 0); }
		public StringFieldContext(FieldContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsvListener ) ((CsvListener)listener).enterStringField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsvListener ) ((CsvListener)listener).exitStringField(this);
		}
	}
	public static class TextFieldContext extends FieldContext {
		public TerminalNode TEXT() { return getToken(CsvParser.TEXT, 0); }
		public TextFieldContext(FieldContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CsvListener ) ((CsvListener)listener).enterTextField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CsvListener ) ((CsvListener)listener).exitTextField(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_field);
		try {
			setState(37);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXT:
				_localctx = new TextFieldContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				match(TEXT);
				}
				break;
			case STRING:
				_localctx = new StringFieldContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(35);
				match(STRING);
				}
				break;
			case T__0:
			case T__1:
			case T__2:
				_localctx = new EmptyFieldContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\7*\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\3\3\3\3\6\3\22\n\3\r\3\16\3\23"+
		"\3\4\3\4\3\5\3\5\3\5\7\5\33\n\5\f\5\16\5\36\13\5\3\5\5\5!\n\5\3\5\3\5"+
		"\3\6\3\6\3\6\5\6(\n\6\3\6\2\2\7\2\4\6\b\n\2\2\2)\2\f\3\2\2\2\4\17\3\2"+
		"\2\2\6\25\3\2\2\2\b\27\3\2\2\2\n\'\3\2\2\2\f\r\5\4\3\2\r\16\7\2\2\3\16"+
		"\3\3\2\2\2\17\21\5\6\4\2\20\22\5\b\5\2\21\20\3\2\2\2\22\23\3\2\2\2\23"+
		"\21\3\2\2\2\23\24\3\2\2\2\24\5\3\2\2\2\25\26\5\b\5\2\26\7\3\2\2\2\27\34"+
		"\5\n\6\2\30\31\7\3\2\2\31\33\5\n\6\2\32\30\3\2\2\2\33\36\3\2\2\2\34\32"+
		"\3\2\2\2\34\35\3\2\2\2\35 \3\2\2\2\36\34\3\2\2\2\37!\7\4\2\2 \37\3\2\2"+
		"\2 !\3\2\2\2!\"\3\2\2\2\"#\7\5\2\2#\t\3\2\2\2$(\7\6\2\2%(\7\7\2\2&(\3"+
		"\2\2\2\'$\3\2\2\2\'%\3\2\2\2\'&\3\2\2\2(\13\3\2\2\2\6\23\34 \'";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}