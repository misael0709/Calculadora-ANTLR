package org.example;

import antlr4.gen.antlr4.CalculadoraBaseVisitor;
import antlr4.gen.antlr4.CalculadoraParser;

public class Visitor extends CalculadoraBaseVisitor<Integer> {
    @Override
    public Integer visitAdd(CalculadoraParser.AddContext ctx){
        return visit(ctx.expr(0)) + visit(ctx.expr(1));
    }

    @Override
    public Integer visitSubtract(CalculadoraParser.SubtractContext ctx) {
        return visit(ctx.expr(0)) - visit(ctx.expr(1));
    }

    @Override
    public Integer visitMultiply(CalculadoraParser.MultiplyContext ctx) {
        return visit(ctx.expr(0)) * visit(ctx.expr(1));
    }

    @Override
    public Integer visitDivide(CalculadoraParser.DivideContext ctx) {
        int divisor = visit(ctx.expr(1));
        if (divisor == 0) throw new ArithmeticException("División entre cero no permitida");
        return visit(ctx.expr(0)) / divisor;
    }

    @Override
    public Integer visitPercentage(CalculadoraParser.PercentageContext ctx) {
        return (visit(ctx.expr(0)) * visit(ctx.expr(1))) / 100;
    }

    @Override
    public Integer visitNumber(CalculadoraParser.NumberContext ctx) {
        return Integer.parseInt(ctx.getText());
    }
}
