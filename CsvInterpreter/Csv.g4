grammar Csv;

stat: program EOF;

program: header row+;

header: row ;

row: field (',' field)* '\r'? '\n' ;

field: TEXT #textField
      | STRING #stringField
      | #emptyField
      ;

TEXT: ~[,\n\r"]+;
STRING : '"' ('""'|~'"')* '"' ;
