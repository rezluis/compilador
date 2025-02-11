// Generated from ./MinhaGramatica.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class MinhaGramaticaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, DEC=4, ALG=5, TIPO=6, RET=7, REP=8, PARA=9, ATR=10, 
		AC=11, FC=12, AP=13, FP=14, CIF=15, PTV=16, VAR=17, NUM=18, OP_ARIT=19, 
		OP_RELA=20, FUN=21, WS=22;
	public static final int
		RULE_inicio = 0, RULE_declaracoes = 1, RULE_decl = 2, RULE_algoritmo = 3, 
		RULE_instr = 4, RULE_funcao = 5, RULE_parametros = 6, RULE_parametro = 7, 
		RULE_atrib = 8, RULE_acao = 9, RULE_operacao = 10, RULE_operando = 11, 
		RULE_operacao_cauda = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"inicio", "declaracoes", "decl", "algoritmo", "instr", "funcao", "parametros", 
			"parametro", "atrib", "acao", "operacao", "operando", "operacao_cauda"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'ESCREVA'", "'LEIA'", "'DECLARACOES'", "'ALGORITMO'", null, 
			"'retorna'", "'enquanto'", "'para'", "'='", "'{'", "'}'", "'('", "')'", 
			"'$'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "DEC", "ALG", "TIPO", "RET", "REP", "PARA", "ATR", 
			"AC", "FC", "AP", "FP", "CIF", "PTV", "VAR", "NUM", "OP_ARIT", "OP_RELA", 
			"FUN", "WS"
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
	public String getGrammarFileName() { return "MinhaGramatica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MinhaGramaticaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InicioContext extends ParserRuleContext {
		public AlgoritmoContext algoritmo() {
			return getRuleContext(AlgoritmoContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MinhaGramaticaParser.EOF, 0); }
		public DeclaracoesContext declaracoes() {
			return getRuleContext(DeclaracoesContext.class,0);
		}
		public InicioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).enterInicio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).exitInicio(this);
		}
	}

	public final InicioContext inicio() throws RecognitionException {
		InicioContext _localctx = new InicioContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_inicio);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEC) {
				{
				setState(26);
				declaracoes();
				}
			}

			setState(29);
			algoritmo();
			setState(30);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracoesContext extends ParserRuleContext {
		public TerminalNode DEC() { return getToken(MinhaGramaticaParser.DEC, 0); }
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public List<TerminalNode> PTV() { return getTokens(MinhaGramaticaParser.PTV); }
		public TerminalNode PTV(int i) {
			return getToken(MinhaGramaticaParser.PTV, i);
		}
		public DeclaracoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).enterDeclaracoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).exitDeclaracoes(this);
		}
	}

	public final DeclaracoesContext declaracoes() throws RecognitionException {
		DeclaracoesContext _localctx = new DeclaracoesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaracoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(DEC);
			setState(36); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(33);
				decl();
				setState(34);
				match(PTV);
				}
				}
				setState(38); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TIPO );
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclContext extends ParserRuleContext {
		public TerminalNode TIPO() { return getToken(MinhaGramaticaParser.TIPO, 0); }
		public TerminalNode VAR() { return getToken(MinhaGramaticaParser.VAR, 0); }
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).exitDecl(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(TIPO);
			setState(41);
			match(VAR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AlgoritmoContext extends ParserRuleContext {
		public TerminalNode ALG() { return getToken(MinhaGramaticaParser.ALG, 0); }
		public List<InstrContext> instr() {
			return getRuleContexts(InstrContext.class);
		}
		public InstrContext instr(int i) {
			return getRuleContext(InstrContext.class,i);
		}
		public AlgoritmoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_algoritmo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).enterAlgoritmo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).exitAlgoritmo(this);
		}
	}

	public final AlgoritmoContext algoritmo() throws RecognitionException {
		AlgoritmoContext _localctx = new AlgoritmoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_algoritmo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(ALG);
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2063692L) != 0)) {
				{
				{
				setState(44);
				instr();
				}
				}
				setState(49);
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

	@SuppressWarnings("CheckReturnValue")
	public static class InstrContext extends ParserRuleContext {
		public AtribContext atrib() {
			return getRuleContext(AtribContext.class,0);
		}
		public AcaoContext acao() {
			return getRuleContext(AcaoContext.class,0);
		}
		public InstrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).enterInstr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).exitInstr(this);
		}
	}

	public final InstrContext instr() throws RecognitionException {
		InstrContext _localctx = new InstrContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_instr);
		try {
			setState(52);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				atrib();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				acao();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FuncaoContext extends ParserRuleContext {
		public TerminalNode TIPO() { return getToken(MinhaGramaticaParser.TIPO, 0); }
		public TerminalNode FUN() { return getToken(MinhaGramaticaParser.FUN, 0); }
		public TerminalNode AP() { return getToken(MinhaGramaticaParser.AP, 0); }
		public TerminalNode FP() { return getToken(MinhaGramaticaParser.FP, 0); }
		public TerminalNode AC() { return getToken(MinhaGramaticaParser.AC, 0); }
		public TerminalNode FC() { return getToken(MinhaGramaticaParser.FC, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public List<InstrContext> instr() {
			return getRuleContexts(InstrContext.class);
		}
		public InstrContext instr(int i) {
			return getRuleContext(InstrContext.class,i);
		}
		public TerminalNode RET() { return getToken(MinhaGramaticaParser.RET, 0); }
		public TerminalNode VAR() { return getToken(MinhaGramaticaParser.VAR, 0); }
		public TerminalNode PTV() { return getToken(MinhaGramaticaParser.PTV, 0); }
		public FuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).enterFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).exitFuncao(this);
		}
	}

	public final FuncaoContext funcao() throws RecognitionException {
		FuncaoContext _localctx = new FuncaoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_funcao);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(TIPO);
			setState(55);
			match(FUN);
			setState(56);
			match(AP);
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(57);
				parametros();
				}
			}

			setState(60);
			match(FP);
			setState(61);
			match(AC);
			setState(65);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(62);
					instr();
					}
					} 
				}
				setState(67);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RET) {
				{
				setState(68);
				match(RET);
				setState(69);
				match(VAR);
				setState(70);
				match(PTV);
				}
			}

			setState(73);
			match(FC);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParametrosContext extends ParserRuleContext {
		public List<ParametroContext> parametro() {
			return getRuleContexts(ParametroContext.class);
		}
		public ParametroContext parametro(int i) {
			return getRuleContext(ParametroContext.class,i);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).enterParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).exitParametros(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			parametro();
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(76);
				match(T__0);
				setState(77);
				parametro();
				}
				}
				setState(82);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParametroContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(MinhaGramaticaParser.VAR, 0); }
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).enterParametro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).exitParametro(this);
		}
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_parametro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(VAR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AtribContext extends ParserRuleContext {
		public TerminalNode ATR() { return getToken(MinhaGramaticaParser.ATR, 0); }
		public TerminalNode VAR() { return getToken(MinhaGramaticaParser.VAR, 0); }
		public TerminalNode NUM() { return getToken(MinhaGramaticaParser.NUM, 0); }
		public TerminalNode AP() { return getToken(MinhaGramaticaParser.AP, 0); }
		public OperacaoContext operacao() {
			return getRuleContext(OperacaoContext.class,0);
		}
		public TerminalNode FP() { return getToken(MinhaGramaticaParser.FP, 0); }
		public TerminalNode PTV() { return getToken(MinhaGramaticaParser.PTV, 0); }
		public AtribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atrib; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).enterAtrib(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).exitAtrib(this);
		}
	}

	public final AtribContext atrib() throws RecognitionException {
		AtribContext _localctx = new AtribContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_atrib);
		try {
			setState(97);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				match(ATR);
				setState(92);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VAR:
					{
					setState(86);
					match(VAR);
					}
					break;
				case NUM:
					{
					setState(87);
					match(NUM);
					}
					break;
				case AP:
					{
					setState(88);
					match(AP);
					setState(89);
					operacao();
					setState(90);
					match(FP);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				operacao();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(95);
				match(PTV);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(96);
				match(VAR);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AcaoContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(MinhaGramaticaParser.VAR, 0); }
		public TerminalNode NUM() { return getToken(MinhaGramaticaParser.NUM, 0); }
		public OperacaoContext operacao() {
			return getRuleContext(OperacaoContext.class,0);
		}
		public FuncaoContext funcao() {
			return getRuleContext(FuncaoContext.class,0);
		}
		public TerminalNode REP() { return getToken(MinhaGramaticaParser.REP, 0); }
		public TerminalNode AP() { return getToken(MinhaGramaticaParser.AP, 0); }
		public TerminalNode FP() { return getToken(MinhaGramaticaParser.FP, 0); }
		public TerminalNode AC() { return getToken(MinhaGramaticaParser.AC, 0); }
		public TerminalNode FC() { return getToken(MinhaGramaticaParser.FC, 0); }
		public TerminalNode OP_RELA() { return getToken(MinhaGramaticaParser.OP_RELA, 0); }
		public TerminalNode OP_ARIT() { return getToken(MinhaGramaticaParser.OP_ARIT, 0); }
		public AcaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_acao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).enterAcao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).exitAcao(this);
		}
	}

	public final AcaoContext acao() throws RecognitionException {
		AcaoContext _localctx = new AcaoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_acao);
		try {
			setState(117);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				match(T__1);
				setState(103);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(100);
					match(VAR);
					}
					break;
				case 2:
					{
					setState(101);
					match(NUM);
					}
					break;
				case 3:
					{
					setState(102);
					operacao();
					}
					break;
				}
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				match(T__2);
				setState(106);
				match(VAR);
				}
				break;
			case TIPO:
				enterOuterAlt(_localctx, 3);
				{
				setState(107);
				funcao();
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(108);
				match(VAR);
				}
				break;
			case REP:
				enterOuterAlt(_localctx, 5);
				{
				setState(109);
				match(REP);
				}
				break;
			case AP:
				enterOuterAlt(_localctx, 6);
				{
				setState(110);
				match(AP);
				}
				break;
			case FP:
				enterOuterAlt(_localctx, 7);
				{
				setState(111);
				match(FP);
				}
				break;
			case AC:
				enterOuterAlt(_localctx, 8);
				{
				setState(112);
				match(AC);
				}
				break;
			case FC:
				enterOuterAlt(_localctx, 9);
				{
				setState(113);
				match(FC);
				}
				break;
			case OP_RELA:
				enterOuterAlt(_localctx, 10);
				{
				setState(114);
				match(OP_RELA);
				}
				break;
			case OP_ARIT:
				enterOuterAlt(_localctx, 11);
				{
				setState(115);
				match(OP_ARIT);
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 12);
				{
				setState(116);
				match(NUM);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OperacaoContext extends ParserRuleContext {
		public OperandoContext operando() {
			return getRuleContext(OperandoContext.class,0);
		}
		public Operacao_caudaContext operacao_cauda() {
			return getRuleContext(Operacao_caudaContext.class,0);
		}
		public OperacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).enterOperacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).exitOperacao(this);
		}
	}

	public final OperacaoContext operacao() throws RecognitionException {
		OperacaoContext _localctx = new OperacaoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_operacao);
		try {
			setState(121);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
			case NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				operando();
				}
				break;
			case OP_ARIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				operacao_cauda();
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

	@SuppressWarnings("CheckReturnValue")
	public static class OperandoContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(MinhaGramaticaParser.NUM, 0); }
		public TerminalNode VAR() { return getToken(MinhaGramaticaParser.VAR, 0); }
		public OperandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).enterOperando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).exitOperando(this);
		}
	}

	public final OperandoContext operando() throws RecognitionException {
		OperandoContext _localctx = new OperandoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_operando);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			_la = _input.LA(1);
			if ( !(_la==VAR || _la==NUM) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Operacao_caudaContext extends ParserRuleContext {
		public TerminalNode OP_ARIT() { return getToken(MinhaGramaticaParser.OP_ARIT, 0); }
		public OperandoContext operando() {
			return getRuleContext(OperandoContext.class,0);
		}
		public List<Operacao_caudaContext> operacao_cauda() {
			return getRuleContexts(Operacao_caudaContext.class);
		}
		public Operacao_caudaContext operacao_cauda(int i) {
			return getRuleContext(Operacao_caudaContext.class,i);
		}
		public Operacao_caudaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacao_cauda; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).enterOperacao_cauda(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MinhaGramaticaListener ) ((MinhaGramaticaListener)listener).exitOperacao_cauda(this);
		}
	}

	public final Operacao_caudaContext operacao_cauda() throws RecognitionException {
		Operacao_caudaContext _localctx = new Operacao_caudaContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_operacao_cauda);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(OP_ARIT);
			setState(126);
			operando();
			setState(130);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(127);
					operacao_cauda();
					}
					} 
				}
				setState(132);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public static final String _serializedATN =
		"\u0004\u0001\u0016\u0086\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0001\u0000\u0003\u0000\u001c\b\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0004"+
		"\u0001%\b\u0001\u000b\u0001\f\u0001&\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0005\u0003.\b\u0003\n\u0003\f\u00031\t\u0003"+
		"\u0001\u0004\u0001\u0004\u0003\u00045\b\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005;\b\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0005\u0005@\b\u0005\n\u0005\f\u0005C\t\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005H\b\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006O\b\u0006\n\u0006\f\u0006"+
		"R\t\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0003\b]\b\b\u0001\b\u0001\b\u0001\b\u0003\bb\b\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0003\th\b\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\tv\b\t\u0001\n\u0001\n\u0003\nz\b\n\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0005\f\u0081\b\f\n\f\f\f\u0084\t\f\u0001\f\u0000\u0000\r\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u0000\u0001"+
		"\u0001\u0000\u0011\u0012\u0094\u0000\u001b\u0001\u0000\u0000\u0000\u0002"+
		" \u0001\u0000\u0000\u0000\u0004(\u0001\u0000\u0000\u0000\u0006+\u0001"+
		"\u0000\u0000\u0000\b4\u0001\u0000\u0000\u0000\n6\u0001\u0000\u0000\u0000"+
		"\fK\u0001\u0000\u0000\u0000\u000eS\u0001\u0000\u0000\u0000\u0010a\u0001"+
		"\u0000\u0000\u0000\u0012u\u0001\u0000\u0000\u0000\u0014y\u0001\u0000\u0000"+
		"\u0000\u0016{\u0001\u0000\u0000\u0000\u0018}\u0001\u0000\u0000\u0000\u001a"+
		"\u001c\u0003\u0002\u0001\u0000\u001b\u001a\u0001\u0000\u0000\u0000\u001b"+
		"\u001c\u0001\u0000\u0000\u0000\u001c\u001d\u0001\u0000\u0000\u0000\u001d"+
		"\u001e\u0003\u0006\u0003\u0000\u001e\u001f\u0005\u0000\u0000\u0001\u001f"+
		"\u0001\u0001\u0000\u0000\u0000 $\u0005\u0004\u0000\u0000!\"\u0003\u0004"+
		"\u0002\u0000\"#\u0005\u0010\u0000\u0000#%\u0001\u0000\u0000\u0000$!\u0001"+
		"\u0000\u0000\u0000%&\u0001\u0000\u0000\u0000&$\u0001\u0000\u0000\u0000"+
		"&\'\u0001\u0000\u0000\u0000\'\u0003\u0001\u0000\u0000\u0000()\u0005\u0006"+
		"\u0000\u0000)*\u0005\u0011\u0000\u0000*\u0005\u0001\u0000\u0000\u0000"+
		"+/\u0005\u0005\u0000\u0000,.\u0003\b\u0004\u0000-,\u0001\u0000\u0000\u0000"+
		".1\u0001\u0000\u0000\u0000/-\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000"+
		"\u00000\u0007\u0001\u0000\u0000\u00001/\u0001\u0000\u0000\u000025\u0003"+
		"\u0010\b\u000035\u0003\u0012\t\u000042\u0001\u0000\u0000\u000043\u0001"+
		"\u0000\u0000\u00005\t\u0001\u0000\u0000\u000067\u0005\u0006\u0000\u0000"+
		"78\u0005\u0015\u0000\u00008:\u0005\r\u0000\u00009;\u0003\f\u0006\u0000"+
		":9\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000"+
		"\u0000<=\u0005\u000e\u0000\u0000=A\u0005\u000b\u0000\u0000>@\u0003\b\u0004"+
		"\u0000?>\u0001\u0000\u0000\u0000@C\u0001\u0000\u0000\u0000A?\u0001\u0000"+
		"\u0000\u0000AB\u0001\u0000\u0000\u0000BG\u0001\u0000\u0000\u0000CA\u0001"+
		"\u0000\u0000\u0000DE\u0005\u0007\u0000\u0000EF\u0005\u0011\u0000\u0000"+
		"FH\u0005\u0010\u0000\u0000GD\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000"+
		"\u0000HI\u0001\u0000\u0000\u0000IJ\u0005\f\u0000\u0000J\u000b\u0001\u0000"+
		"\u0000\u0000KP\u0003\u000e\u0007\u0000LM\u0005\u0001\u0000\u0000MO\u0003"+
		"\u000e\u0007\u0000NL\u0001\u0000\u0000\u0000OR\u0001\u0000\u0000\u0000"+
		"PN\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000Q\r\u0001\u0000\u0000"+
		"\u0000RP\u0001\u0000\u0000\u0000ST\u0005\u0011\u0000\u0000T\u000f\u0001"+
		"\u0000\u0000\u0000U\\\u0005\n\u0000\u0000V]\u0005\u0011\u0000\u0000W]"+
		"\u0005\u0012\u0000\u0000XY\u0005\r\u0000\u0000YZ\u0003\u0014\n\u0000Z"+
		"[\u0005\u000e\u0000\u0000[]\u0001\u0000\u0000\u0000\\V\u0001\u0000\u0000"+
		"\u0000\\W\u0001\u0000\u0000\u0000\\X\u0001\u0000\u0000\u0000]b\u0001\u0000"+
		"\u0000\u0000^b\u0003\u0014\n\u0000_b\u0005\u0010\u0000\u0000`b\u0005\u0011"+
		"\u0000\u0000aU\u0001\u0000\u0000\u0000a^\u0001\u0000\u0000\u0000a_\u0001"+
		"\u0000\u0000\u0000a`\u0001\u0000\u0000\u0000b\u0011\u0001\u0000\u0000"+
		"\u0000cg\u0005\u0002\u0000\u0000dh\u0005\u0011\u0000\u0000eh\u0005\u0012"+
		"\u0000\u0000fh\u0003\u0014\n\u0000gd\u0001\u0000\u0000\u0000ge\u0001\u0000"+
		"\u0000\u0000gf\u0001\u0000\u0000\u0000hv\u0001\u0000\u0000\u0000ij\u0005"+
		"\u0003\u0000\u0000jv\u0005\u0011\u0000\u0000kv\u0003\n\u0005\u0000lv\u0005"+
		"\u0011\u0000\u0000mv\u0005\b\u0000\u0000nv\u0005\r\u0000\u0000ov\u0005"+
		"\u000e\u0000\u0000pv\u0005\u000b\u0000\u0000qv\u0005\f\u0000\u0000rv\u0005"+
		"\u0014\u0000\u0000sv\u0005\u0013\u0000\u0000tv\u0005\u0012\u0000\u0000"+
		"uc\u0001\u0000\u0000\u0000ui\u0001\u0000\u0000\u0000uk\u0001\u0000\u0000"+
		"\u0000ul\u0001\u0000\u0000\u0000um\u0001\u0000\u0000\u0000un\u0001\u0000"+
		"\u0000\u0000uo\u0001\u0000\u0000\u0000up\u0001\u0000\u0000\u0000uq\u0001"+
		"\u0000\u0000\u0000ur\u0001\u0000\u0000\u0000us\u0001\u0000\u0000\u0000"+
		"ut\u0001\u0000\u0000\u0000v\u0013\u0001\u0000\u0000\u0000wz\u0003\u0016"+
		"\u000b\u0000xz\u0003\u0018\f\u0000yw\u0001\u0000\u0000\u0000yx\u0001\u0000"+
		"\u0000\u0000z\u0015\u0001\u0000\u0000\u0000{|\u0007\u0000\u0000\u0000"+
		"|\u0017\u0001\u0000\u0000\u0000}~\u0005\u0013\u0000\u0000~\u0082\u0003"+
		"\u0016\u000b\u0000\u007f\u0081\u0003\u0018\f\u0000\u0080\u007f\u0001\u0000"+
		"\u0000\u0000\u0081\u0084\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000"+
		"\u0000\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u0019\u0001\u0000"+
		"\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u000e\u001b&/4:AGP\\"+
		"aguy\u0082";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}