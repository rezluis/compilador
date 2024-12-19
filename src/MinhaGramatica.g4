grammar MinhaGramatica;



DEC: 'DECLARACOES';
ALG: 'ALGORITMO';
TIPO: 'int'|'real'|'bool'|'string';
RET: 'retorna';
REP: 'enquanto';
PARA: 'para';
AC: '{';
FC: '}';
AP: '(';
FP: ')';
CIF: '$';
PTV: ';';
VAR: CIF(LETRA|DIGITO)*;
NUM: DIGITO+('.'DIGITO+)?;
OP_ARIT: '+'|'-'|'*'|'/';
OP_RELA: '<'|'>'|'<='|'>='|'=';
FUN: [a-zA-Z][a-zA-Z0-9_]*;
fragment LETRA: [a-zA-Z];
fragment DIGITO: [0-9];
WS: [ \r\t\n]* -> skip;