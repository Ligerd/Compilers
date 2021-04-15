// Generated from /home/ligerd/Compilers/src/MyGrammar.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MyGrammarParser}.
 */
public interface MyGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MyGrammarParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(MyGrammarParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGrammarParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(MyGrammarParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link MyGrammarParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssign(MyGrammarParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link MyGrammarParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssign(MyGrammarParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code print}
	 * labeled alternative in {@link MyGrammarParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterPrint(MyGrammarParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code print}
	 * labeled alternative in {@link MyGrammarParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitPrint(MyGrammarParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code read}
	 * labeled alternative in {@link MyGrammarParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterRead(MyGrammarParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by the {@code read}
	 * labeled alternative in {@link MyGrammarParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitRead(MyGrammarParser.ReadContext ctx);
	/**
	 * Enter a parse tree produced by the {@code single0}
	 * labeled alternative in {@link MyGrammarParser#expr0}.
	 * @param ctx the parse tree
	 */
	void enterSingle0(MyGrammarParser.Single0Context ctx);
	/**
	 * Exit a parse tree produced by the {@code single0}
	 * labeled alternative in {@link MyGrammarParser#expr0}.
	 * @param ctx the parse tree
	 */
	void exitSingle0(MyGrammarParser.Single0Context ctx);
	/**
	 * Enter a parse tree produced by the {@code add}
	 * labeled alternative in {@link MyGrammarParser#expr0}.
	 * @param ctx the parse tree
	 */
	void enterAdd(MyGrammarParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code add}
	 * labeled alternative in {@link MyGrammarParser#expr0}.
	 * @param ctx the parse tree
	 */
	void exitAdd(MyGrammarParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code single1}
	 * labeled alternative in {@link MyGrammarParser#expr1}.
	 * @param ctx the parse tree
	 */
	void enterSingle1(MyGrammarParser.Single1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code single1}
	 * labeled alternative in {@link MyGrammarParser#expr1}.
	 * @param ctx the parse tree
	 */
	void exitSingle1(MyGrammarParser.Single1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code mult}
	 * labeled alternative in {@link MyGrammarParser#expr1}.
	 * @param ctx the parse tree
	 */
	void enterMult(MyGrammarParser.MultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mult}
	 * labeled alternative in {@link MyGrammarParser#expr1}.
	 * @param ctx the parse tree
	 */
	void exitMult(MyGrammarParser.MultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code single2}
	 * labeled alternative in {@link MyGrammarParser#expr2}.
	 * @param ctx the parse tree
	 */
	void enterSingle2(MyGrammarParser.Single2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code single2}
	 * labeled alternative in {@link MyGrammarParser#expr2}.
	 * @param ctx the parse tree
	 */
	void exitSingle2(MyGrammarParser.Single2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code minus}
	 * labeled alternative in {@link MyGrammarParser#expr2}.
	 * @param ctx the parse tree
	 */
	void enterMinus(MyGrammarParser.MinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code minus}
	 * labeled alternative in {@link MyGrammarParser#expr2}.
	 * @param ctx the parse tree
	 */
	void exitMinus(MyGrammarParser.MinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code single3}
	 * labeled alternative in {@link MyGrammarParser#expr3}.
	 * @param ctx the parse tree
	 */
	void enterSingle3(MyGrammarParser.Single3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code single3}
	 * labeled alternative in {@link MyGrammarParser#expr3}.
	 * @param ctx the parse tree
	 */
	void exitSingle3(MyGrammarParser.Single3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code div}
	 * labeled alternative in {@link MyGrammarParser#expr3}.
	 * @param ctx the parse tree
	 */
	void enterDiv(MyGrammarParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code div}
	 * labeled alternative in {@link MyGrammarParser#expr3}.
	 * @param ctx the parse tree
	 */
	void exitDiv(MyGrammarParser.DivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valuForVariable}
	 * labeled alternative in {@link MyGrammarParser#expr4}.
	 * @param ctx the parse tree
	 */
	void enterValuForVariable(MyGrammarParser.ValuForVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valuForVariable}
	 * labeled alternative in {@link MyGrammarParser#expr4}.
	 * @param ctx the parse tree
	 */
	void exitValuForVariable(MyGrammarParser.ValuForVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code par}
	 * labeled alternative in {@link MyGrammarParser#expr4}.
	 * @param ctx the parse tree
	 */
	void enterPar(MyGrammarParser.ParContext ctx);
	/**
	 * Exit a parse tree produced by the {@code par}
	 * labeled alternative in {@link MyGrammarParser#expr4}.
	 * @param ctx the parse tree
	 */
	void exitPar(MyGrammarParser.ParContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numbeR}
	 * labeled alternative in {@link MyGrammarParser#value}.
	 * @param ctx the parse tree
	 */
	void enterNumbeR(MyGrammarParser.NumbeRContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numbeR}
	 * labeled alternative in {@link MyGrammarParser#value}.
	 * @param ctx the parse tree
	 */
	void exitNumbeR(MyGrammarParser.NumbeRContext ctx);
	/**
	 * Enter a parse tree produced by the {@code toint}
	 * labeled alternative in {@link MyGrammarParser#value}.
	 * @param ctx the parse tree
	 */
	void enterToint(MyGrammarParser.TointContext ctx);
	/**
	 * Exit a parse tree produced by the {@code toint}
	 * labeled alternative in {@link MyGrammarParser#value}.
	 * @param ctx the parse tree
	 */
	void exitToint(MyGrammarParser.TointContext ctx);
	/**
	 * Enter a parse tree produced by the {@code toreal}
	 * labeled alternative in {@link MyGrammarParser#value}.
	 * @param ctx the parse tree
	 */
	void enterToreal(MyGrammarParser.TorealContext ctx);
	/**
	 * Exit a parse tree produced by the {@code toreal}
	 * labeled alternative in {@link MyGrammarParser#value}.
	 * @param ctx the parse tree
	 */
	void exitToreal(MyGrammarParser.TorealContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifiers}
	 * labeled alternative in {@link MyGrammarParser#value}.
	 * @param ctx the parse tree
	 */
	void enterIdentifiers(MyGrammarParser.IdentifiersContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifiers}
	 * labeled alternative in {@link MyGrammarParser#value}.
	 * @param ctx the parse tree
	 */
	void exitIdentifiers(MyGrammarParser.IdentifiersContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link MyGrammarParser#number}.
	 * @param ctx the parse tree
	 */
	void enterInt(MyGrammarParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link MyGrammarParser#number}.
	 * @param ctx the parse tree
	 */
	void exitInt(MyGrammarParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code real}
	 * labeled alternative in {@link MyGrammarParser#number}.
	 * @param ctx the parse tree
	 */
	void enterReal(MyGrammarParser.RealContext ctx);
	/**
	 * Exit a parse tree produced by the {@code real}
	 * labeled alternative in {@link MyGrammarParser#number}.
	 * @param ctx the parse tree
	 */
	void exitReal(MyGrammarParser.RealContext ctx);
}