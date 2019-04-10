// Generated from Interpreter.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link InterpreterParser}.
 */
public interface InterpreterListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link InterpreterParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(InterpreterParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterpreterParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(InterpreterParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statAssign}
	 * labeled alternative in {@link InterpreterParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStatAssign(InterpreterParser.StatAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statAssign}
	 * labeled alternative in {@link InterpreterParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStatAssign(InterpreterParser.StatAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statExpr}
	 * labeled alternative in {@link InterpreterParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStatExpr(InterpreterParser.StatExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statExpr}
	 * labeled alternative in {@link InterpreterParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStatExpr(InterpreterParser.StatExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statLoad}
	 * labeled alternative in {@link InterpreterParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStatLoad(InterpreterParser.StatLoadContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statLoad}
	 * labeled alternative in {@link InterpreterParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStatLoad(InterpreterParser.StatLoadContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statSave}
	 * labeled alternative in {@link InterpreterParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStatSave(InterpreterParser.StatSaveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statSave}
	 * labeled alternative in {@link InterpreterParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStatSave(InterpreterParser.StatSaveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printConsole}
	 * labeled alternative in {@link InterpreterParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrintConsole(InterpreterParser.PrintConsoleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printConsole}
	 * labeled alternative in {@link InterpreterParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrintConsole(InterpreterParser.PrintConsoleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printFile}
	 * labeled alternative in {@link InterpreterParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrintFile(InterpreterParser.PrintFileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printFile}
	 * labeled alternative in {@link InterpreterParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrintFile(InterpreterParser.PrintFileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignExpr}
	 * labeled alternative in {@link InterpreterParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssignExpr(InterpreterParser.AssignExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignExpr}
	 * labeled alternative in {@link InterpreterParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssignExpr(InterpreterParser.AssignExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprSelect}
	 * labeled alternative in {@link InterpreterParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprSelect(InterpreterParser.ExprSelectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprSelect}
	 * labeled alternative in {@link InterpreterParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprSelect(InterpreterParser.ExprSelectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprUnite}
	 * labeled alternative in {@link InterpreterParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprUnite(InterpreterParser.ExprUniteContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprUnite}
	 * labeled alternative in {@link InterpreterParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprUnite(InterpreterParser.ExprUniteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprArith}
	 * labeled alternative in {@link InterpreterParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprArith(InterpreterParser.ExprArithContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprArith}
	 * labeled alternative in {@link InterpreterParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprArith(InterpreterParser.ExprArithContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprText}
	 * labeled alternative in {@link InterpreterParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprText(InterpreterParser.ExprTextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprText}
	 * labeled alternative in {@link InterpreterParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprText(InterpreterParser.ExprTextContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprId}
	 * labeled alternative in {@link InterpreterParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprId(InterpreterParser.ExprIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprId}
	 * labeled alternative in {@link InterpreterParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprId(InterpreterParser.ExprIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprCsv}
	 * labeled alternative in {@link InterpreterParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprCsv(InterpreterParser.ExprCsvContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprCsv}
	 * labeled alternative in {@link InterpreterParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprCsv(InterpreterParser.ExprCsvContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterpreterParser#load}.
	 * @param ctx the parse tree
	 */
	void enterLoad(InterpreterParser.LoadContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterpreterParser#load}.
	 * @param ctx the parse tree
	 */
	void exitLoad(InterpreterParser.LoadContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterpreterParser#save}.
	 * @param ctx the parse tree
	 */
	void enterSave(InterpreterParser.SaveContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterpreterParser#save}.
	 * @param ctx the parse tree
	 */
	void exitSave(InterpreterParser.SaveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multAr}
	 * labeled alternative in {@link InterpreterParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterMultAr(InterpreterParser.MultArContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multAr}
	 * labeled alternative in {@link InterpreterParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitMultAr(InterpreterParser.MultArContext ctx);
	/**
	 * Enter a parse tree produced by the {@code divAr}
	 * labeled alternative in {@link InterpreterParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterDivAr(InterpreterParser.DivArContext ctx);
	/**
	 * Exit a parse tree produced by the {@code divAr}
	 * labeled alternative in {@link InterpreterParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitDivAr(InterpreterParser.DivArContext ctx);
	/**
	 * Enter a parse tree produced by the {@code remAr}
	 * labeled alternative in {@link InterpreterParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterRemAr(InterpreterParser.RemArContext ctx);
	/**
	 * Exit a parse tree produced by the {@code remAr}
	 * labeled alternative in {@link InterpreterParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitRemAr(InterpreterParser.RemArContext ctx);
	/**
	 * Enter a parse tree produced by the {@code powerAr}
	 * labeled alternative in {@link InterpreterParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterPowerAr(InterpreterParser.PowerArContext ctx);
	/**
	 * Exit a parse tree produced by the {@code powerAr}
	 * labeled alternative in {@link InterpreterParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitPowerAr(InterpreterParser.PowerArContext ctx);
	/**
	 * Enter a parse tree produced by the {@code plusAr}
	 * labeled alternative in {@link InterpreterParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterPlusAr(InterpreterParser.PlusArContext ctx);
	/**
	 * Exit a parse tree produced by the {@code plusAr}
	 * labeled alternative in {@link InterpreterParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitPlusAr(InterpreterParser.PlusArContext ctx);
	/**
	 * Enter a parse tree produced by the {@code minusAr}
	 * labeled alternative in {@link InterpreterParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterMinusAr(InterpreterParser.MinusArContext ctx);
	/**
	 * Exit a parse tree produced by the {@code minusAr}
	 * labeled alternative in {@link InterpreterParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitMinusAr(InterpreterParser.MinusArContext ctx);
	/**
	 * Enter a parse tree produced by the {@code concatExpr}
	 * labeled alternative in {@link InterpreterParser#textExpr}.
	 * @param ctx the parse tree
	 */
	void enterConcatExpr(InterpreterParser.ConcatExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code concatExpr}
	 * labeled alternative in {@link InterpreterParser#textExpr}.
	 * @param ctx the parse tree
	 */
	void exitConcatExpr(InterpreterParser.ConcatExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code deleteExpr}
	 * labeled alternative in {@link InterpreterParser#textExpr}.
	 * @param ctx the parse tree
	 */
	void enterDeleteExpr(InterpreterParser.DeleteExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code deleteExpr}
	 * labeled alternative in {@link InterpreterParser#textExpr}.
	 * @param ctx the parse tree
	 */
	void exitDeleteExpr(InterpreterParser.DeleteExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code invertExpr}
	 * labeled alternative in {@link InterpreterParser#textExpr}.
	 * @param ctx the parse tree
	 */
	void enterInvertExpr(InterpreterParser.InvertExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code invertExpr}
	 * labeled alternative in {@link InterpreterParser#textExpr}.
	 * @param ctx the parse tree
	 */
	void exitInvertExpr(InterpreterParser.InvertExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterpreterParser#selectC}.
	 * @param ctx the parse tree
	 */
	void enterSelectC(InterpreterParser.SelectCContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterpreterParser#selectC}.
	 * @param ctx the parse tree
	 */
	void exitSelectC(InterpreterParser.SelectCContext ctx);
	/**
	 * Enter a parse tree produced by {@link InterpreterParser#unite}.
	 * @param ctx the parse tree
	 */
	void enterUnite(InterpreterParser.UniteContext ctx);
	/**
	 * Exit a parse tree produced by {@link InterpreterParser#unite}.
	 * @param ctx the parse tree
	 */
	void exitUnite(InterpreterParser.UniteContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableID}
	 * labeled alternative in {@link InterpreterParser#table}.
	 * @param ctx the parse tree
	 */
	void enterTableID(InterpreterParser.TableIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableID}
	 * labeled alternative in {@link InterpreterParser#table}.
	 * @param ctx the parse tree
	 */
	void exitTableID(InterpreterParser.TableIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableCSV}
	 * labeled alternative in {@link InterpreterParser#table}.
	 * @param ctx the parse tree
	 */
	void enterTableCSV(InterpreterParser.TableCSVContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableCSV}
	 * labeled alternative in {@link InterpreterParser#table}.
	 * @param ctx the parse tree
	 */
	void exitTableCSV(InterpreterParser.TableCSVContext ctx);
}