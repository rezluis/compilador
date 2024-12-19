package src;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;

public class MainLexer {

    public static void main(String[] args) {
        String filename = "C:\\Users\\luis felipe\\UFLA 2024-2\\compiladores\\fatorial.txt";
        try {
            CharStream input = CharStreams.fromFileName(filename);
            MinhaGramaticaLexer lexer = new MinhaGramaticaLexer(input);
            Token token;
            while(!lexer._hitEOF){
                token = lexer.nextToken();
                System.out.println("Token: "+ token.toString());
                System.out.println("   Lexema: "+ token.getText());
                System.out.println("   Classe: "+ lexer.getVocabulary().getDisplayName(token.getType()));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}