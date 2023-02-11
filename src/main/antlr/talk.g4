grammar talk;

program: statment* EOF;

statment
: expression ENDL #exprStat
| expression? '!' #descopeStat
| declaration ENDL #declarionStat
| ENDL #endlStat
;

declaration
: 'let' (ID|assign) (','(ID|assign))*
;

assign
: ID '=' expression
;


block
: '{' statment* '}'
;

expression
: block #blockExpr
| assign #assignmentExpr
| '-' expression #negExpr
| expression '?' expression (':' expression)? #ifExpr
| expression '^' expression #powExpr
| expression op=('*'|'/') expression #multDivExpr
| expression op=('+'|'-') expression #addSubExpr
| '|' expression '|' #absExpr
| '(' expression ')' #parExpr
| '`' expression '`' #printExpr
| KEYWORD #keywordExpr
| NUMBER #numExpr
| STRING #strExpr
| ID #idExpr
;

KEYWORD
: 'true'
| 'false'
| 'null'
;

ID: LETTER+ (LETTER|DIGIT)*;
NUMBER: DIGIT+ ('.' DIGIT+)?;
STRING: '"' .*? '"';
fragment DIGIT: [0-9];
fragment LETTER
: [a-z]
| [A-Z]
;

ENDL
: ';'
;

fragment NL: ('\r' | '\n')+;

IGNORE
: COMMENT -> skip
;

fragment COMMENT
:'//' ~( '\r' | '\n' )*
|'/*' .*? '*/'
;

WS
: [ \t\r\n] + -> skip
;
