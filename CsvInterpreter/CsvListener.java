// Generated from Csv.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CsvParser}.
 */
public interface CsvListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CsvParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(CsvParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsvParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(CsvParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsvParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CsvParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsvParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CsvParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsvParser#header}.
	 * @param ctx the parse tree
	 */
	void enterHeader(CsvParser.HeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsvParser#header}.
	 * @param ctx the parse tree
	 */
	void exitHeader(CsvParser.HeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link CsvParser#row}.
	 * @param ctx the parse tree
	 */
	void enterRow(CsvParser.RowContext ctx);
	/**
	 * Exit a parse tree produced by {@link CsvParser#row}.
	 * @param ctx the parse tree
	 */
	void exitRow(CsvParser.RowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code textField}
	 * labeled alternative in {@link CsvParser#field}.
	 * @param ctx the parse tree
	 */
	void enterTextField(CsvParser.TextFieldContext ctx);
	/**
	 * Exit a parse tree produced by the {@code textField}
	 * labeled alternative in {@link CsvParser#field}.
	 * @param ctx the parse tree
	 */
	void exitTextField(CsvParser.TextFieldContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringField}
	 * labeled alternative in {@link CsvParser#field}.
	 * @param ctx the parse tree
	 */
	void enterStringField(CsvParser.StringFieldContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringField}
	 * labeled alternative in {@link CsvParser#field}.
	 * @param ctx the parse tree
	 */
	void exitStringField(CsvParser.StringFieldContext ctx);
	/**
	 * Enter a parse tree produced by the {@code emptyField}
	 * labeled alternative in {@link CsvParser#field}.
	 * @param ctx the parse tree
	 */
	void enterEmptyField(CsvParser.EmptyFieldContext ctx);
	/**
	 * Exit a parse tree produced by the {@code emptyField}
	 * labeled alternative in {@link CsvParser#field}.
	 * @param ctx the parse tree
	 */
	void exitEmptyField(CsvParser.EmptyFieldContext ctx);
}