grammar Boss;
r : ID '=' expr '$''$' ;

expr = sum ;

sum : sub '+' sum { return sub + sum ; }
	| sub
	;
	
sub : exp '-' sub { return exp - sub ; }
	| exp
	;

exp : mul '^' div { return Math.pow(div,exp); }
	| div
	;
	
div : mul '/' div { return mul / div ;}
	| mul
	;

mul : pri '*' mul { return pri * mul ;}
	| pri
	;

pri = INT
	| '(' sum ')' { return sum ;}
	;

INT : [0-9]+
ID : [a-zA-Z]+
	
	