import java.util.HashMap;
import java.util.Map;

public class MyListener extends MinhaGramaticaBaseListener {
    private Map<String, String> tabelaSimbolos = new HashMap<>();

    // Adiciona uma declaração à tabela de símbolos
    @Override
    public void exitNDeclaracao(MinhaGramaticaParser.NDeclaracaoContext ctx) {
        String tipo = ctx.TIPO().getText();
        String id = ctx.VAR().getText();
        if (tabelaSimbolos.containsKey(id)) {
            System.out.println("Declaração duplicada! Variável " + id + " já declarada");
        } else {
            tabelaSimbolos.put(id, tipo);
        }
    }

    public Map<String, String> getTabelaSimbolos() {
        return tabelaSimbolos;
    }
}

