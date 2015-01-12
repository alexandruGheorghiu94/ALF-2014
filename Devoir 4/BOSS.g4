//Gheorghiu Ion-Alexandru
//Groupe 1231F
//Utiliser antlr pour faire l'arbre du langage boss. 

grammar Boss;
r : ID EQUAL Expr EOI;

//Expresia noastra matematica
Expr : Sum ;

// functia de suma
Sum : Sub '+' Sum 
	| Sub
	;

//functia de diferenta	
Sub : Exp '-' Sub 
	| Exp
	;

//functia de exponential
Exp : Div '^' Exp 
	| Div
	;

//functia de impartire	
Div : Mul '/' Div 
	| Mul
	;

//functia de inmultire
Mul : Pri '*' Mul 
	| Pri
	;

//prioritizarea operatiilor in functie de paranteza
Pri : INT
	| '('Sum')' 
	;

//numbers , numbers everywhere
INT : [0-9]+ ;
//numele variabilei
ID : [a-zA-Z]+ ;
//separatorul variabilei de expresie
 
EQUAL : ' = ' ;

//End Of Input
EOI : ' $$' ;
