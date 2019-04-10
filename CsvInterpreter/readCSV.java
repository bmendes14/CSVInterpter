import java.io.IOException;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.File;
import java.sql.Array;
import java.util.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class readCSV{
   public Map<String, ArrayList<String>> read(String file) throws IOException{
      //Read file
      File initialFile = new File(file);
      //Create input stream for the initialFile
      InputStream target = new FileInputStream(initialFile);
      // create a CharStream that reads from standard input:
      CharStream input = CharStreams.fromStream(target);
      // create a lexer that feeds off of input CharStream:
      CsvLexer lexer = new CsvLexer(input);
      // create a buffer of tokens pulled from the lexer:
      CommonTokenStream tokens = new CommonTokenStream(lexer);
      // create a parser that feeds off the tokens buffer:
      CsvParser parser = new CsvParser(tokens);
      // replace error listener:
      //parser.removeErrorListeners(); // remove ConsoleErrorListener
      //parser.addErrorListener(new ErrorHandlingListener());
      // begin parsing at stat rule:
      ParseTree tree = parser.stat();
      Map<String, ArrayList<String>> csvMap = new LinkedHashMap<>();
      if (parser.getNumberOfSyntaxErrors() == 0) {
         // print LISP-style tree:
         // System.out.println(tree.toStringTree(parser));
         ParseTreeWalker walker = new ParseTreeWalker();
         ReaderListener listener0 = new ReaderListener();
         walker.walk(listener0, tree);
         csvMap = listener0.getMap();
        // System.out.println(csvMap.size());
      }
    return csvMap;
   }
}
