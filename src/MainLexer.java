import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class MainLexer {

    public static void main(String[] args) {
        String filename = "C:\\Users\\luis felipe\\UFLA 2024-2\\Compiladores\\compilador\\src\\fatorial.txt";
        try {
            CharStream input = CharStreams.fromFileName(filename);
            MinhaGramaticaLexer lexer = new MinhaGramaticaLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            MinhaGramaticaParser parser = new MinhaGramaticaParser(tokens);

            ParseTree ast = parser.inicio();

            System.out.println(ast.toStringTree());


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
