// Generated from /home/ligerd/Compilers/src/MyGrammar.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MyGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MyGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MyGrammarParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(MyGrammarParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link MyGrammarParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(MyGrammarParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code print}
	 * labeled alternative in {@link MyGrammarParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(MyGrammarParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code read}
	 * labeled alternative in {@link MyGrammarParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead(MyGrammarParser.ReadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code single0}
	 * labeled alternative in {@link MyGrammarParser#expr0}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle0(MyGrammarParser.Single0Context ctx);
	/**
	 * Visit a parse tree produced by the {@code add}
	 * labeled alternative in {@link MyGrammarParser#expr0}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(MyGrammarParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code single1}
	 * labeled alternative in {@link MyGrammarParser#expr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle1(MyGrammarParser.Single1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code mult}
	 * labeled alternative in {@link MyGrammarParser#expr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMult(MyGrammarParser.MultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code single2}
	 * labeled alternative in {@link MyGrammarParser#expr2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle2(MyGrammarParser.Single2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code minus}
	 * labeled alternative in {@link MyGrammarParser#expr2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinus(MyGrammarParser.MinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code single3}
	 * labeled alternative in {@link MyGrammarParser#expr3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle3(MyGrammarParser.Single3Context ctx);
	/**
	 * Visit a parse tree produced by the {@code div}
	 * labeled alternative in {@link MyGrammarParser#expr3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(MyGrammarParser.DivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int}
	 * labeled alternative in {@link MyGrammarParser#expr4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(MyGrammarParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code real}
	 * labeled alternative in {@link MyGrammarParser#expr4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReal(MyGrammarParser.RealContext ctx);
	/**
	 * Visit a parse tree produced by the {@code toint}
	 * labeled alternative in {@link MyGrammarParser#expr4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToint(MyGrammarParser.TointContext ctx);
	/**
	 * Visit a parse tree produced by the {@code toreal}
	 * labeled alternative in {@link MyGrammarParser#expr4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToreal(MyGrammarParser.TorealContext ctx);
	/**
	 * Visit a parse tree produced by the {@code par}
	 * labeled alternative in {@link MyGrammarParser#expr4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPar(MyGrammarParser.ParContext ctx);
}