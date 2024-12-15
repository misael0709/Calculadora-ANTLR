// Generated from C:/Users/misae/IdeaProjects/Calculadora/src/main/java/antlr/Calculadora.g4 by ANTLR 4.13.2
package antlr4.gen.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalculadoraParser}.
 */
public interface CalculadoraListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code Add}
	 * labeled alternative in {@link CalculadoraParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAdd(CalculadoraParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Add}
	 * labeled alternative in {@link CalculadoraParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAdd(CalculadoraParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Number}
	 * labeled alternative in {@link CalculadoraParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNumber(CalculadoraParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link CalculadoraParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNumber(CalculadoraParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Subtract}
	 * labeled alternative in {@link CalculadoraParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSubtract(CalculadoraParser.SubtractContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Subtract}
	 * labeled alternative in {@link CalculadoraParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSubtract(CalculadoraParser.SubtractContext ctx);
}