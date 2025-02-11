// Generated from ./MinhaGramatica.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MinhaGramaticaParser}.
 */
public interface MinhaGramaticaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MinhaGramaticaParser#inicio}.
	 * @param ctx the parse tree
	 */
	void enterInicio(MinhaGramaticaParser.InicioContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinhaGramaticaParser#inicio}.
	 * @param ctx the parse tree
	 */
	void exitInicio(MinhaGramaticaParser.InicioContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinhaGramaticaParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracoes(MinhaGramaticaParser.DeclaracoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinhaGramaticaParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracoes(MinhaGramaticaParser.DeclaracoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinhaGramaticaParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(MinhaGramaticaParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinhaGramaticaParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(MinhaGramaticaParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinhaGramaticaParser#algoritmo}.
	 * @param ctx the parse tree
	 */
	void enterAlgoritmo(MinhaGramaticaParser.AlgoritmoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinhaGramaticaParser#algoritmo}.
	 * @param ctx the parse tree
	 */
	void exitAlgoritmo(MinhaGramaticaParser.AlgoritmoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinhaGramaticaParser#instr}.
	 * @param ctx the parse tree
	 */
	void enterInstr(MinhaGramaticaParser.InstrContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinhaGramaticaParser#instr}.
	 * @param ctx the parse tree
	 */
	void exitInstr(MinhaGramaticaParser.InstrContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinhaGramaticaParser#funcao}.
	 * @param ctx the parse tree
	 */
	void enterFuncao(MinhaGramaticaParser.FuncaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinhaGramaticaParser#funcao}.
	 * @param ctx the parse tree
	 */
	void exitFuncao(MinhaGramaticaParser.FuncaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinhaGramaticaParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(MinhaGramaticaParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinhaGramaticaParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(MinhaGramaticaParser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinhaGramaticaParser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(MinhaGramaticaParser.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinhaGramaticaParser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(MinhaGramaticaParser.ParametroContext ctx);
	/**
	 * Enter a parse tree produced by {@link MinhaGramaticaParser#atrib}.
	 * @param ctx the parse tree
	 */
	void enterAtrib(MinhaGramaticaParser.AtribContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinhaGramaticaParser#atrib}.
	 * @param ctx the parse tree
	 */
	void exitAtrib(MinhaGramaticaParser.AtribContext ctx);
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
	 * Enter a parse tree produced by {@link MinhaGramaticaParser#operacao}.
	 * @param ctx the parse tree
	 */
	void enterOperacao(MinhaGramaticaParser.OperacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MinhaGramaticaParser#operacao}.
	 * @param ctx the parse tree
	 */
	void exitOperacao(MinhaGramaticaParser.OperacaoContext ctx);
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