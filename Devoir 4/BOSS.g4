//Gheorghiu Ion-Alexandru
//Groupe 1231F

grammar Boss;
r : ID EQUAL Expr EOI ;

//Expresia noastra matematica
Expr = sum ;

// functia de suma
sum : sub '+' sum //{ return sub + sum ; }
	| sub
	;

//functia de diferenta	
sub : exp '-' sub //{ return exp - sub ; }
	| exp
	;

//functia de exponential
exp : mul '^' div //{ return Math.pow(div,exp); }
	| div
	;

//functia de impartire	
div : mul '/' div //{ return mul / div ;}
	| mul
	;

//functia de inmultire
mul : pri '*' mul //{ return pri * mul ;}
	| pri
	;

//prioritizarea operatiilor in functie de paranteza
pri = INT
	| '(' sum ')' //{ return sum ;}
	;

//numbers , numbers everywhere
INT : [0-9]+
//numele variabilei
ID : [a-zA-Z]+
//separatorul variabilei de expresie 
EQUAL : [ = ] 
//End Of Input
EOI : [$][$]
	
	