grammar testy;
prog: ( stat? NEWLINE )*
    ;

stat:	WRITE value		#write
	| ID '=' value		#assign
	| READ value   		#read
   ;

value: ID
       | INT
       | REAL
   ;

WRITE:	'write'
   ;

READ:	'read'
   ;

STRING :  '"' ( ~('\\'|'"') )* '"'
    ;
ID:   ('a'..'z'|'A'..'Z')+
   ;

INT:   '0'..'9'+
    ;

REAL: [0-9]* '.' [0-9]+
 ;

NEWLINE:	'\r'? '\n'
    ;

WS:   (' '|'\t')+ { skip(); }
    ;