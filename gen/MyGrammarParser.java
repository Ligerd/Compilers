// Generated from /home/ligerd/Compilers/src/MyGrammar.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MyGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, PRINT=4, READ=5, TOINT=6, TOREAL=7, ID=8, REAL=9, 
		INT=10, ADD=11, MINUS=12, MULT=13, DIV=14, NEWLINE=15, WS=16;
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_expr0 = 2, RULE_expr1 = 3, RULE_expr2 = 4, 
		RULE_expr3 = 5, RULE_expr4 = 6, RULE_value = 7, RULE_number = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stat", "expr0", "expr1", "expr2", "expr3", "expr4", "value", 
			"number"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'('", "')'", "'print'", "'read'", "'(int)'", "'(real)'", 
			null, null, null, "'+'", "'-'", "'*'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "PRINT", "READ", "TOINT", "TOREAL", "ID", "REAL", 
			"INT", "ADD", "MINUS", "MULT", "DIV", "NEWLINE", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "MyGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MyGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(MyGrammarParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(MyGrammarParser.NEWLINE, i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << READ) | (1L << ID) | (1L << NEWLINE))) != 0)) {
				{
				{
				setState(19);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << READ) | (1L << ID))) != 0)) {
					{
					setState(18);
					stat();
					}
				}

				setState(21);
				match(NEWLINE);
				}
				}
				setState(26);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class StatContext extends ParserRuleContext {
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	 
		public StatContext() { }
		public void copyFrom(StatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrintContext extends StatContext {
		public TerminalNode PRINT() { return getToken(MyGrammarParser.PRINT, 0); }
		public TerminalNode ID() { return getToken(MyGrammarParser.ID, 0); }
		public PrintContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReadContext extends StatContext {
		public TerminalNode READ() { return getToken(MyGrammarParser.READ, 0); }
		public TerminalNode ID() { return getToken(MyGrammarParser.ID, 0); }
		public ReadContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitRead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitRead(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignContext extends StatContext {
		public TerminalNode ID() { return getToken(MyGrammarParser.ID, 0); }
		public Expr0Context expr0() {
			return getRuleContext(Expr0Context.class,0);
		}
		public AssignContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(34);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(27);
				match(ID);
				setState(28);
				match(T__0);
				setState(29);
				expr0();
				}
				break;
			case PRINT:
				_localctx = new PrintContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(30);
				match(PRINT);
				setState(31);
				match(ID);
				}
				break;
			case READ:
				_localctx = new ReadContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(32);
				match(READ);
				setState(33);
				match(ID);
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

	public static class Expr0Context extends ParserRuleContext {
		public Expr0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr0; }
	 
		public Expr0Context() { }
		public void copyFrom(Expr0Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Single0Context extends Expr0Context {
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public Single0Context(Expr0Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterSingle0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitSingle0(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitSingle0(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddContext extends Expr0Context {
		public List<Expr1Context> expr1() {
			return getRuleContexts(Expr1Context.class);
		}
		public Expr1Context expr1(int i) {
			return getRuleContext(Expr1Context.class,i);
		}
		public TerminalNode ADD() { return getToken(MyGrammarParser.ADD, 0); }
		public AddContext(Expr0Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitAdd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr0Context expr0() throws RecognitionException {
		Expr0Context _localctx = new Expr0Context(_ctx, getState());
		enterRule(_localctx, 4, RULE_expr0);
		try {
			setState(41);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new Single0Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				expr1();
				}
				break;
			case 2:
				_localctx = new AddContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				expr1();
				setState(38);
				match(ADD);
				setState(39);
				expr1();
				}
				break;
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

	public static class Expr1Context extends ParserRuleContext {
		public Expr1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr1; }
	 
		public Expr1Context() { }
		public void copyFrom(Expr1Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Single1Context extends Expr1Context {
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public Single1Context(Expr1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterSingle1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitSingle1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitSingle1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultContext extends Expr1Context {
		public List<Expr2Context> expr2() {
			return getRuleContexts(Expr2Context.class);
		}
		public Expr2Context expr2(int i) {
			return getRuleContext(Expr2Context.class,i);
		}
		public TerminalNode MULT() { return getToken(MyGrammarParser.MULT, 0); }
		public MultContext(Expr1Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitMult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitMult(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr1Context expr1() throws RecognitionException {
		Expr1Context _localctx = new Expr1Context(_ctx, getState());
		enterRule(_localctx, 6, RULE_expr1);
		try {
			setState(48);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new Single1Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				expr2();
				}
				break;
			case 2:
				_localctx = new MultContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				expr2();
				setState(45);
				match(MULT);
				setState(46);
				expr2();
				}
				break;
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

	public static class Expr2Context extends ParserRuleContext {
		public Expr2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr2; }
	 
		public Expr2Context() { }
		public void copyFrom(Expr2Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MinusContext extends Expr2Context {
		public List<Expr3Context> expr3() {
			return getRuleContexts(Expr3Context.class);
		}
		public Expr3Context expr3(int i) {
			return getRuleContext(Expr3Context.class,i);
		}
		public TerminalNode MINUS() { return getToken(MyGrammarParser.MINUS, 0); }
		public MinusContext(Expr2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Single2Context extends Expr2Context {
		public Expr3Context expr3() {
			return getRuleContext(Expr3Context.class,0);
		}
		public Single2Context(Expr2Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterSingle2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitSingle2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitSingle2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr2Context expr2() throws RecognitionException {
		Expr2Context _localctx = new Expr2Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_expr2);
		try {
			setState(55);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new Single2Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				expr3();
				}
				break;
			case 2:
				_localctx = new MinusContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				expr3();
				setState(52);
				match(MINUS);
				setState(53);
				expr3();
				}
				break;
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

	public static class Expr3Context extends ParserRuleContext {
		public Expr3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr3; }
	 
		public Expr3Context() { }
		public void copyFrom(Expr3Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DivContext extends Expr3Context {
		public List<Expr4Context> expr4() {
			return getRuleContexts(Expr4Context.class);
		}
		public Expr4Context expr4(int i) {
			return getRuleContext(Expr4Context.class,i);
		}
		public TerminalNode DIV() { return getToken(MyGrammarParser.DIV, 0); }
		public DivContext(Expr3Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Single3Context extends Expr3Context {
		public Expr4Context expr4() {
			return getRuleContext(Expr4Context.class,0);
		}
		public Single3Context(Expr3Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterSingle3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitSingle3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitSingle3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr3Context expr3() throws RecognitionException {
		Expr3Context _localctx = new Expr3Context(_ctx, getState());
		enterRule(_localctx, 10, RULE_expr3);
		try {
			setState(62);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new Single3Context(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				expr4();
				}
				break;
			case 2:
				_localctx = new DivContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				expr4();
				setState(59);
				match(DIV);
				setState(60);
				expr4();
				}
				break;
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

	public static class Expr4Context extends ParserRuleContext {
		public Expr4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr4; }
	 
		public Expr4Context() { }
		public void copyFrom(Expr4Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParContext extends Expr4Context {
		public Expr0Context expr0() {
			return getRuleContext(Expr0Context.class,0);
		}
		public ParContext(Expr4Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitPar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitPar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValuForVariableContext extends Expr4Context {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public ValuForVariableContext(Expr4Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterValuForVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitValuForVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitValuForVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr4Context expr4() throws RecognitionException {
		Expr4Context _localctx = new Expr4Context(_ctx, getState());
		enterRule(_localctx, 12, RULE_expr4);
		try {
			setState(69);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TOINT:
			case TOREAL:
			case ID:
			case REAL:
			case INT:
				_localctx = new ValuForVariableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				value();
				}
				break;
			case T__1:
				_localctx = new ParContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				match(T__1);
				setState(66);
				expr0();
				setState(67);
				match(T__2);
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

	public static class ValueContext extends ParserRuleContext {
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	 
		public ValueContext() { }
		public void copyFrom(ValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NumbeRContext extends ValueContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public NumbeRContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterNumbeR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitNumbeR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitNumbeR(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TointContext extends ValueContext {
		public TerminalNode TOINT() { return getToken(MyGrammarParser.TOINT, 0); }
		public Expr4Context expr4() {
			return getRuleContext(Expr4Context.class,0);
		}
		public TointContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterToint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitToint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitToint(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdentifiersContext extends ValueContext {
		public TerminalNode ID() { return getToken(MyGrammarParser.ID, 0); }
		public IdentifiersContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterIdentifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitIdentifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitIdentifiers(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TorealContext extends ValueContext {
		public TerminalNode TOREAL() { return getToken(MyGrammarParser.TOREAL, 0); }
		public Expr4Context expr4() {
			return getRuleContext(Expr4Context.class,0);
		}
		public TorealContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterToreal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitToreal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitToreal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_value);
		try {
			setState(77);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REAL:
			case INT:
				_localctx = new NumbeRContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				number();
				}
				break;
			case TOINT:
				_localctx = new TointContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				match(TOINT);
				setState(73);
				expr4();
				}
				break;
			case TOREAL:
				_localctx = new TorealContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(74);
				match(TOREAL);
				setState(75);
				expr4();
				}
				break;
			case ID:
				_localctx = new IdentifiersContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(76);
				match(ID);
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

	public static class NumberContext extends ParserRuleContext {
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	 
		public NumberContext() { }
		public void copyFrom(NumberContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RealContext extends NumberContext {
		public TerminalNode REAL() { return getToken(MyGrammarParser.REAL, 0); }
		public RealContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterReal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitReal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitReal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntContext extends NumberContext {
		public TerminalNode INT() { return getToken(MyGrammarParser.INT, 0); }
		public IntContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGrammarVisitor ) return ((MyGrammarVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_number);
		try {
			setState(81);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				_localctx = new IntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				match(INT);
				}
				break;
			case REAL:
				_localctx = new RealContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				match(REAL);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\22V\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\5\2\26"+
		"\n\2\3\2\7\2\31\n\2\f\2\16\2\34\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3%"+
		"\n\3\3\4\3\4\3\4\3\4\3\4\5\4,\n\4\3\5\3\5\3\5\3\5\3\5\5\5\63\n\5\3\6\3"+
		"\6\3\6\3\6\3\6\5\6:\n\6\3\7\3\7\3\7\3\7\3\7\5\7A\n\7\3\b\3\b\3\b\3\b\3"+
		"\b\5\bH\n\b\3\t\3\t\3\t\3\t\3\t\3\t\5\tP\n\t\3\n\3\n\5\nT\n\n\3\n\2\2"+
		"\13\2\4\6\b\n\f\16\20\22\2\2\2Y\2\32\3\2\2\2\4$\3\2\2\2\6+\3\2\2\2\b\62"+
		"\3\2\2\2\n9\3\2\2\2\f@\3\2\2\2\16G\3\2\2\2\20O\3\2\2\2\22S\3\2\2\2\24"+
		"\26\5\4\3\2\25\24\3\2\2\2\25\26\3\2\2\2\26\27\3\2\2\2\27\31\7\21\2\2\30"+
		"\25\3\2\2\2\31\34\3\2\2\2\32\30\3\2\2\2\32\33\3\2\2\2\33\3\3\2\2\2\34"+
		"\32\3\2\2\2\35\36\7\n\2\2\36\37\7\3\2\2\37%\5\6\4\2 !\7\6\2\2!%\7\n\2"+
		"\2\"#\7\7\2\2#%\7\n\2\2$\35\3\2\2\2$ \3\2\2\2$\"\3\2\2\2%\5\3\2\2\2&,"+
		"\5\b\5\2\'(\5\b\5\2()\7\r\2\2)*\5\b\5\2*,\3\2\2\2+&\3\2\2\2+\'\3\2\2\2"+
		",\7\3\2\2\2-\63\5\n\6\2./\5\n\6\2/\60\7\17\2\2\60\61\5\n\6\2\61\63\3\2"+
		"\2\2\62-\3\2\2\2\62.\3\2\2\2\63\t\3\2\2\2\64:\5\f\7\2\65\66\5\f\7\2\66"+
		"\67\7\16\2\2\678\5\f\7\28:\3\2\2\29\64\3\2\2\29\65\3\2\2\2:\13\3\2\2\2"+
		";A\5\16\b\2<=\5\16\b\2=>\7\20\2\2>?\5\16\b\2?A\3\2\2\2@;\3\2\2\2@<\3\2"+
		"\2\2A\r\3\2\2\2BH\5\20\t\2CD\7\4\2\2DE\5\6\4\2EF\7\5\2\2FH\3\2\2\2GB\3"+
		"\2\2\2GC\3\2\2\2H\17\3\2\2\2IP\5\22\n\2JK\7\b\2\2KP\5\16\b\2LM\7\t\2\2"+
		"MP\5\16\b\2NP\7\n\2\2OI\3\2\2\2OJ\3\2\2\2OL\3\2\2\2ON\3\2\2\2P\21\3\2"+
		"\2\2QT\7\f\2\2RT\7\13\2\2SQ\3\2\2\2SR\3\2\2\2T\23\3\2\2\2\f\25\32$+\62"+
		"9@GOS";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}