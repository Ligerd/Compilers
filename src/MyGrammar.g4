grammar MyGrammar;

prog: ( stat? NEWLINE )*
;

stat:	 ID '=' expr0		#assign
	| PRINT ID   		#print
	| READ ID           #read
;

expr0:  expr1			#single0
      | expr1 ADD expr1		#add
;



expr1:  expr2			#single1
      | expr2 MULT expr2	#mult
;

expr2:  expr3			#single2
      | expr3 MINUS expr3		#minus
;

expr3: expr4                #single3
       | expr4 DIV expr4   #div
       ;


expr4:  value   #valuForVariable
        | '(' expr0 ')'		#par
;

value:          INT			#int
              | REAL			#real
              | TOINT expr4		#toint
              | TOREAL expr4		#toreal
              | ID    #identifiers
;



PRINT:	'print'
    ;

READ:	'read'
        ;

TOINT: '(int)'
    ;

TOREAL: '(real)'
    ;

ID:   ('a'..'z'|'A'..'Z')+
   ;

REAL: '0'..'9'+'.''0'..'9'+
    ;

INT: '0'..'9'+
    ;

ADD: '+'
    ;

MINUS: '-'
    ;

MULT: '*'
    ;

DIV: '/'
    ;

NEWLINE:	'\r'? '\n'
    ;

WS: [ \t\r\n]+ -> skip ;