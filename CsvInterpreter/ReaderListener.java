// Generated from Csv.g4 by ANTLR 4.7.1

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import java.lang.Math.*;
import java.util.*;


public class ReaderListener extends CsvBaseListener {
  private ParseTreeProperty<ArrayList<String>> parseTree = new ParseTreeProperty<ArrayList<String>>();
  private ParseTreeProperty<String> parseTreeElement = new ParseTreeProperty<String>();
  private Map<String, ArrayList<String>> csvMap = new LinkedHashMap<>();
  public Map<String, ArrayList<String>> getMap(){
    return csvMap;
  }
	@Override public void exitStat(CsvParser.StatContext ctx) {

  }
	@Override public void exitProgram(CsvParser.ProgramContext ctx) {
    ArrayList<String> header = parseTree.get(ctx.header());
    ArrayList<String> empty = new ArrayList<>();
    for(int i =0;i<header.size();i++){
      csvMap.put(header.get(i),empty);
    }
    for(int z = 0;z < ctx.row().size();z++){
      for(int y = 0; y< parseTree.get(ctx.row(z)).size();y++){
        ArrayList<String> temporary =  csvMap.get(header.get(y));
        temporary.add(parseTreeElement.get(ctx.row(z).field(y)));
        csvMap.put(header.get(y), temporary);
      }
    }
  }
	@Override public void exitHeader(CsvParser.HeaderContext ctx) {
    ArrayList<String> x = new ArrayList<>();
    for(int i = 0; i< ctx.row().field().size();i++){
      x.add(parseTreeElement.get(ctx.row().field(i)));
    }
    parseTree.put(ctx,x);
  }
	@Override public void exitRow(CsvParser.RowContext ctx) {
    ArrayList<String> x = new ArrayList<>();
    for(int i = 0; i< ctx.field().size();i++){
      x.add(parseTreeElement.get(ctx.field(i)));
    }
    parseTree.put(ctx,x);
  }
	@Override public void exitTextField(CsvParser.TextFieldContext ctx) {
    parseTreeElement.put(ctx,ctx.TEXT().getText());
  }
	@Override public void exitStringField(CsvParser.StringFieldContext ctx) {
    parseTreeElement.put(ctx,ctx.STRING().getText());
  }
	@Override public void exitEmptyField(CsvParser.EmptyFieldContext ctx) {
    parseTreeElement.put(ctx,"");
  }
}
