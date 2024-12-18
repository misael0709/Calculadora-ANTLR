// Generated from C:/Users/misae/IdeaProjects/Calculadora/src/main/java/antlr4/Calculadora.g4 by ANTLR 4.13.2
package antlr4;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CalculadoraParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CalculadoraVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code Add}
	 * labeled alternative in {@link CalculadoraParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(CalculadoraParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Divide}
	 * labeled alternative in {@link CalculadoraParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivide(CalculadoraParser.DivideContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link CalculadoraParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(CalculadoraParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Percentage}
	 * labeled alternative in {@link CalculadoraParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPercentage(CalculadoraParser.PercentageContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Multiply}
	 * labeled alternative in {@link CalculadoraParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiply(CalculadoraParser.MultiplyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Subtract}
	 * labeled alternative in {@link CalculadoraParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtract(CalculadoraParser.SubtractContext ctx);
}