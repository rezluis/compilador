// Generated from ./MinhaGramatica.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MinhaGramaticaParser}.
 */
public interface MinhaGramaticaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code NInicio}
	 * labeled alternative in {@link MinhaGramaticaParser#inicio}.
	 * @param ctx the parse tree
	 */
	void enterNInicio(MinhaGramaticaParser.NInicioContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NInicio}
	 * labeled alternative in {@link MinhaGramaticaParser#inicio}.
	 * @param ctx the parse tree
	 */
	void exitNInicio(MinhaGramaticaParser.NInicioContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BlocoDeclaracoes}
	 * labeled alternative in {@link MinhaGramaticaParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void enterBlocoDeclaracoes(MinhaGramaticaParser.BlocoDeclaracoesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BlocoDeclaracoes}
	 * labeled alternative in {@link MinhaGramaticaParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void exitBlocoDeclaracoes(MinhaGramaticaParser.BlocoDeclaracoesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NDeclaracao}
	 * labeled alternative in {@link MinhaGramaticaParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterNDeclaracao(MinhaGramaticaParser.NDeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NDeclaracao}
	 * labeled alternative in {@link MinhaGramaticaParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitNDeclaracao(MinhaGramaticaParser.NDeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BolcoPrograma}
	 * labeled alternative in {@link MinhaGramaticaParser#algoritmo}.
	 * @param ctx the parse tree
	 */
	void enterBolcoPrograma(MinhaGramaticaParser.BolcoProgramaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BolcoPrograma}
	 * labeled alternative in {@link MinhaGramaticaParser#algoritmo}.
	 * @param ctx the parse tree
	 */
	void exitBolcoPrograma(MinhaGramaticaParser.BolcoProgramaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NInstrucao}
	 * labeled alternative in {@link MinhaGramaticaParser#instr}.
	 * @param ctx the parse tree
	 */
	void enterNInstrucao(MinhaGramaticaParser.NInstrucaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NInstrucao}
	 * labeled alternative in {@link MinhaGramaticaParser#instr}.
	 * @param ctx the parse tree
	 */
	void exitNInstrucao(MinhaGramaticaParser.NInstrucaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NFuncao}
	 * labeled alternative in {@link MinhaGramaticaParser#funcao}.
	 * @param ctx the parse tree
	 */
	void enterNFuncao(MinhaGramaticaParser.NFuncaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NFuncao}
	 * labeled alternative in {@link MinhaGramaticaParser#funcao}.
	 * @param ctx the parse tree
	 */
	void exitNFuncao(MinhaGramaticaParser.NFuncaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NParametros}
	 * labeled alternative in {@link MinhaGramaticaParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterNParametros(MinhaGramaticaParser.NParametrosContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NParametros}
	 * labeled alternative in {@link MinhaGramaticaParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitNParametros(MinhaGramaticaParser.NParametrosContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NParametro}
	 * labeled alternative in {@link MinhaGramaticaParser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterNParametro(MinhaGramaticaParser.NParametroContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NParametro}
	 * labeled alternative in {@link MinhaGramaticaParser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitNParametro(MinhaGramaticaParser.NParametroContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NAtribComAtrib}
	 * labeled alternative in {@link MinhaGramaticaParser#atrib}.
	 * @param ctx the parse tree
	 */
	void enterNAtribComAtrib(MinhaGramaticaParser.NAtribComAtribContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NAtribComAtrib}
	 * labeled alternative in {@link MinhaGramaticaParser#atrib}.
	 * @param ctx the parse tree
	 */
	void exitNAtribComAtrib(MinhaGramaticaParser.NAtribComAtribContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NAtribComOperacao}
	 * labeled alternative in {@link MinhaGramaticaParser#atrib}.
	 * @param ctx the parse tree
	 */
	void enterNAtribComOperacao(MinhaGramaticaParser.NAtribComOperacaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NAtribComOperacao}
	 * labeled alternative in {@link MinhaGramaticaParser#atrib}.
	 * @param ctx the parse tree
	 */
	void exitNAtribComOperacao(MinhaGramaticaParser.NAtribComOperacaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NAtribComPTV}
	 * labeled alternative in {@link MinhaGramaticaParser#atrib}.
	 * @param ctx the parse tree
	 */
	void enterNAtribComPTV(MinhaGramaticaParser.NAtribComPTVContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NAtribComPTV}
	 * labeled alternative in {@link MinhaGramaticaParser#atrib}.
	 * @param ctx the parse tree
	 */
	void exitNAtribComPTV(MinhaGramaticaParser.NAtribComPTVContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NAtribComVar}
	 * labeled alternative in {@link MinhaGramaticaParser#atrib}.
	 * @param ctx the parse tree
	 */
	void enterNAtribComVar(MinhaGramaticaParser.NAtribComVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NAtribComVar}
	 * labeled alternative in {@link MinhaGramaticaParser#atrib}.
	 * @param ctx the parse tree
	 */
	void exitNAtribComVar(MinhaGramaticaParser.NAtribComVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinhaGramaticaParser#acao}.
	 * @param ctx the parse tree
	 */
	void enterAcao(MinhaGramaticaParser.AcaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinhaGramaticaParser#acao}.
	 * @param ctx the parse tree
	 */
	void exitAcao(MinhaGramaticaParser.AcaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NOperacao}
	 * labeled alternative in {@link MinhaGramaticaParser#operacao}.
	 * @param ctx the parse tree
	 */
	void enterNOperacao(MinhaGramaticaParser.NOperacaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NOperacao}
	 * labeled alternative in {@link MinhaGramaticaParser#operacao}.
	 * @param ctx the parse tree
	 */
	void exitNOperacao(MinhaGramaticaParser.NOperacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinhaGramaticaParser#operando}.
	 * @param ctx the parse tree
	 */
	void enterOperando(MinhaGramaticaParser.OperandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinhaGramaticaParser#operando}.
	 * @param ctx the parse tree
	 */
	void exitOperando(MinhaGramaticaParser.OperandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinhaGramaticaParser#operacao_cauda}.
	 * @param ctx the parse tree
	 */
	void enterOperacao_cauda(MinhaGramaticaParser.Operacao_caudaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinhaGramaticaParser#operacao_cauda}.
	 * @param ctx the parse tree
	 */
	void exitOperacao_cauda(MinhaGramaticaParser.Operacao_caudaContext ctx);
}