grammar MinhaGramatica;

inicio: (declaracoes)? algoritmo EOF #NInicio;
declaracoes: DEC (decl PTV)+ #BlocoDeclaracoes;
decl: TIPO VAR #NDeclaracao;
algoritmo: ALG (instr)* #BolcoPrograma;
instr: atrib #NInstrucao | acao #NInstrucao;
funcao: TIPO FUN AP (parametros)? FP AC (instr)* (RET VAR PTV)? FC #NFuncao;
parametros: parametro (',' parametro)* #NParametros;
parametro: VAR #NParametro;
atrib: VAR ATR (VAR|NUM|'(' operacao ')') #NAtribComAtrib
     | operacao                      #NAtribComOperacao
     | PTV                            #NAtribComPTV
     | VAR                            #NAtribComVar;

acao: 'ESCREVA' (VAR|NUM|operacao)| 'LEIA' VAR | funcao | VAR | REP | AP | FP | AC | FC | OP_RELA | OP_ARIT | NUM;
operacao: operando #NOperacao|operacao_cauda #NOperacao;
operando: NUM|VAR #NOperando;
operacao_cauda: OP_ARIT operando (operacao_cauda)*;

DEC: 'DECLARACOES';
ALG: 'ALGORITMO';
TIPO: 'int'|'real'|'bool'|'string';
RET: 'retorna';
REP: 'enquanto';
PARA: 'para';
ATR: '=';
AC: '{';
FC: '}';
AP: '(';
FP: ')';
CIF: '$';
PTV: ';';
VAR: CIF(LETRA|DIGITO)*;
NUM: DIGITO+('.'DIGITO+)?;
OP_ARIT: '+'|'-'|'*'|'/';
OP_RELA: '<'|'>'|'<='|'>='|'==';
FUN: [a-zA-Z][a-zA-Z0-9_]*;
fragment LETRA: [a-zA-Z];
fragment DIGITO: [0-9];
WS: [ \r\t\n]* -> skip;