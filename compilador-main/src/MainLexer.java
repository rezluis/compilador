import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
public class MainLexer {
    public static void main(String[] args) {
        String filename = "src\\teste.txt";
        try {
            CharStream input = CharStreams.fromFileName(filename);
            MinhaGramaticaLexer lexer = new MinhaGramaticaLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            MinhaGramaticaParser parser = new MinhaGramaticaParser(tokens);

            ParseTree ast = parser.inicio();

            System.out.println(ast.toStringTree());

            MyListener listener = new MyListener();

            ParseTreeWalker walker = new ParseTreeWalker();

            walker.walk(listener, ast);

            System.out.println(listener.getTabelaSimbolos().toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
