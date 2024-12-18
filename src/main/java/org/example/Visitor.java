package org.example;

import antlr4.gen.antlr4.CalculadoraBaseVisitor;
import antlr4.gen.antlr4.CalculadoraParser;

public class Visitor extends CalculadoraBaseVisitor<Integer> {
    @Override
    public Integer visitAdd(CalculadoraParser.AddContext ctx) {
        return visit(ctx.expr()) + visit(ctx.term());
    }

    @Override
    public Integer visitSubtract(CalculadoraParser.SubtractContext ctx) {
        return visit(ctx.expr()) - visit(ctx.term());
    }

    @Override
    public Integer visitMultiply(CalculadoraParser.MultiplyContext ctx) {
        return visit(ctx.term()) * visit(ctx.factor());
    }

    @Override
    public Integer visitDivide(CalculadoraParser.DivideContext ctx) {
        int divisor = visit(ctx.factor());
        if (divisor == 0) throw new ArithmeticException("División entre cero no permitida");
        return visit(ctx.term()) / divisor;
    }

    @Override
    public Integer visitPercentage(CalculadoraParser.PercentageContext ctx) {
        return (visit(ctx.term()) * visit(ctx.factor())) / 100;
    }

    @Override
    public Integer visitNumber(CalculadoraParser.NumberContext ctx) {
        return Integer.parseInt(ctx.getText());
    }

}
