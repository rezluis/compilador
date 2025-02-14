import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyListener extends MinhaGramaticaBaseListener {
    private Map<String, String> tabelaSimbolos = new HashMap<>();

    public Map<String, String> getTabelaSimbolos() {
        return tabelaSimbolos;
    }

    // Checagem de declarações duplicadas
    @Override
    public void exitNDeclaracao(MinhaGramaticaParser.NDeclaracaoContext ctx) {
        String tipo = ctx.TIPO().getText();
        String id = ctx.VAR().getText();

        if (tabelaSimbolos.containsKey(id)) {
            System.out.println("Erro: Variável '" + id + "' já foi declarada!");
        } else {
            tabelaSimbolos.put(id, tipo);
        }
    }

    // Checagem de variáveis não declaradas em ações (LEIA e ESCREVA)
    @Override
    public void exitAcao(MinhaGramaticaParser.AcaoContext ctx) {
        if (ctx.getText().startsWith("LEIA")) {
            String var = ctx.VAR().getText();
            if (!tabelaSimbolos.containsKey(var)) {
                System.out.println("Erro: Variável '" + var + "' não foi declarada antes da leitura.");
            }
        } else if (ctx.getText().startsWith("ESCREVA")) {
            String valor = ctx.getChild(1).getText();
            if (valor.startsWith("$")) { // Se for uma variável
                if (!tabelaSimbolos.containsKey(valor)) {
                    System.out.println("Erro: Variável '" + valor + "' não foi declarada antes da escrita.");
                }
            }
        }
    }

    // Checagem de variáveis não declaradas em operações
    @Override
    public void exitOperacao(MinhaGramaticaParser.OperacaoContext ctx) {
        List<MinhaGramaticaParser.OperandoContext> operandos = ctx.getRuleContexts(MinhaGramaticaParser.OperandoContext.class);
        for (MinhaGramaticaParser.OperandoContext operando : operandos) {
            if (operando.VAR() != null) { // Verifica apenas variáveis
                String var = operando.VAR().getText();
                if (!tabelaSimbolos.containsKey(var)) {
                    System.out.println("Erro: Variável '" + var + "' usada sem declaração.");
                }
            }
        }
    }

    // Checagem de tipos em atribuições
    @Override
    public void exitNAtribComAtrib(MinhaGramaticaParser.NAtribComAtribContext ctx) {
        if (ctx.VAR() == null) {
            System.out.println("Erro: Atribuição inválida. Nenhuma variável encontrada antes do '='.");
            return;
        }

        String var = ctx.VAR().getText();
        String tipoVar = tabelaSimbolos.get(var);

        if (tipoVar == null) {
            System.out.println("Erro: Variável '" + var + "' não foi declarada antes da atribuição.");
            return;
        }

        String valorAtribuido = ctx.getChild(2).getText();
        String tipoValor = inferirTipo(valorAtribuido);

        if (!tipoValor.equals(tipoVar)) {
            System.out.println("Erro: Tipo incompatível na atribuição. Variável '" + var + "' é do tipo '" + tipoVar + "', mas recebeu um valor do tipo '" + tipoValor + "'.");
        }
    }

    // Método auxiliar para inferir o tipo de um valor
    private String inferirTipo(String valor) {
        if (valor.matches("\\d+")) { // Inteiro
            return "int";
        } else if (valor.matches("\\d+\\.\\d+")) { // Real
            return "real";
        } else if (valor.equals("true") || valor.equals("false")) { // Booleano
            return "bool";
        } else if (valor.startsWith("$")) { // Variável
            return tabelaSimbolos.getOrDefault(valor, "desconhecido");
        } else { // String ou desconhecido
            return "string";
        }
    }

    // Checagem de tipos em operações aritméticas
    @Override
    public void exitOperacao_cauda(MinhaGramaticaParser.Operacao_caudaContext ctx) {
        String tipoOperando1 = inferirTipo(ctx.operando().getText());
        String tipoOperando2 = inferirTipo(ctx.operando().getText());

        if (!tipoOperando1.equals("int") && !tipoOperando1.equals("real")) {
            System.out.println("Erro: Operação aritmética inválida. O operando '" + ctx.operando().getText() + "' não é um número.");
        }

        if (!tipoOperando2.equals("int") && !tipoOperando2.equals("real")) {
            System.out.println("Erro: Operação aritmética inválida. O operando '" + ctx.operando().getText() + "' não é um número.");
        }
    }

    @Override
    public void exitOpcoes(MinhaGramaticaParser.OperacaoContext ctx) {

    }

    @Override
    public void enterNOperacao(MinhaGramaticaParser.OperacaoContext ctx) {

    }
}