package org.example;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import antlr4.gen.antlr4.*;

public class Main {
    public static void main(String[] args) {
        String input = "45%800";

        // Crea el lexer y el parser
        CalculadoraLexer lexer = new CalculadoraLexer(CharStreams.fromString(input));
        CalculadoraParser parser = new CalculadoraParser(new CommonTokenStream(lexer));

        // Analiza la entrada
        ParseTree tree = parser.expr();

        // Usa el visitor para calcular el resultado
        Visitor visitor = new Visitor();
        int result = visitor.visit(tree);

        // Muestra el árbol de análisis y el resultado
        System.out.println("Árbol de análisis: " + tree.toStringTree(parser));
        System.out.println("Resultado: " + result);
    }
}
