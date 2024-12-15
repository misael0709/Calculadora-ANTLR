package org.example;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import antlr4.gen.antlr.*;

public class Main {
    public static void main(String[] args) {
        String input = "3 + 5 - 2";

        // Crea el lexer y el parser
        CalculadoraLexer lexer = new CalculadoraLexer(CharStreams.fromString(input));
        CalculadoraParser parser = new CalculadoraParser(new CommonTokenStream(lexer));

        // Analiza la entrada
        ParseTree tree = parser.expr();

        // Muestra el árbol de análisis
        System.out.println("Árbol de análisis: " + tree.toStringTree(parser));
    }
}
