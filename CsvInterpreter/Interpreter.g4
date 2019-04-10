grammar Interpreter;
////////GRUPO 10
program: stat* EOF;

stat: assign #statAssign
    | print #statExpr
    | load #statLoad
    | save #statSave;

//print no terminal de tabelas ou escrever num ficheiro
print: 'print' expr ';' #printConsole
      | 'printFile' expr ';' #printFile;

assign: ID '=' expr ';' #assignExpr;

expr: selectC #exprSelect
    | unite #exprUnite
    | arithmetic #exprArith
    | textExpr #exprText
    | ID #exprId
    | CSV #exprCsv;

//LOAD E SAVE DO PROGRAMA ATUAL
load: 'load(' ID ')' ';';
save: 'save(' ID ')' ';';

//Operações aritméticas
arithmetic: selectC '*' op=('+' | '-')? INT  #multAr
          | selectC '/' op=('+' | '-')? INT  #divAr
          | selectC '%' op=('+' | '-')? INT  #remAr
          | selectC '^' op=('+' | '-')? INT #powerAr
          | selectC '+' op=('+' | '-')? INT  #plusAr
          | selectC '-' op=('+' | '-')? INT #minusAr;

//Operações com String
textExpr: selectC '++' STRING #concatExpr
        | selectC '--' STRING #deleteExpr
        | selectC '<<' #invertExpr;

// Criar nova tabela selecionando colunas de uma tabela existente seletcC(csv, coluna1, coluna2, coluna3, colunaX) -> Colunas a selecionar
//Pode-se implementar um intervalo também
//retorna a tabela final
selectC: 'selectC(' table ',' (STRING (',' STRING)*)? ')';

//unir duas colunas de duas tabelas, tendo em conta uma coluna de comparação(p.e. nºMEC)
// unite(csv1,csv2,colunaComparaçãoCSV1,colunaComparaçãoCSV2)
//retorna a tabela final
unite: 'unite(' table ',' table ',' STRING ',' STRING ')';

//acessar a coluna INT de uma tabela
//access : table '[' ID ']';

table: ID #tableID
    |  CSV #tableCSV;

CSV: [a-zA-Z]+? '.csv';
ID: [a-zA-Z]+;
INT: [0-9]+;
STRING : '"' ('""'|~'"')* '"' ;
WS: [ \t\r\n]+ ->skip;
COMMENT: '//' .*? '\n' ->skip;
