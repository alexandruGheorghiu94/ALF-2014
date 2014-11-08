//Gheorghiu Ion-Alexandru
//Groupe 1231F

grammar Boss;
r : ID EQUAL Expr EOI ;

//Expresia noastra matematica
Expr : sum ;

// functia de suma
sum : sub '+' sum 
	| sub
	;

//functia de diferenta	
sub : exp '-' sub 
	| exp
	;

//functia de exponential
exp : div '^' exp 
	| div
	;

//functia de impartire	
div : mul '/' div 
	| mul
	;

//functia de inmultire
mul : pri '*' mul 
	| pri
	;

//prioritizarea operatiilor in functie de paranteza
pri : INT
	| '(' sum ')' 
	;

//numbers , numbers everywhere
INT : [0-9]+ ;
//numele variabilei
ID : [a-zA-Z]+ ;
//separatorul variabilei de expresie 
EQUAL : [=] ;
//End Of Input
EOI : [$][$] ;
	
	