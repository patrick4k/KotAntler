grammar talk;

program: statment* EOF;

statment
: expression ENDL
| ID '=' expression ENDL
| ENDL
;

expression
: '-' expression #negExpr
| expression '^' expression #powExpr
| expression op=('*'|'/') expression #multDivExpr
| expression op=('+'|'-') expression #addSubExpr
| KEYWORD #keywordExpr
| NUMBER #numExpr
| STRING #strExpr
| ID #idExpr
| '|' expression '|' #absExpr
| '(' expression ')' #parExpr
| '!' expression '!' #printExpr
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

COMMENT
:'//' ~( '\r' | '\n' )* -> skip
;

WS
: [ \t\r\n] + -> skip
;
