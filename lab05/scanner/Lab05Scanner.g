lexer grammar Lab05Scanner;

@lexer::header{
  package laboratorios.lab05.scanner;
}

//ignoramos espacios en blanco
WHITESPACE  :   ( '\t' | ' ' | '\r' | '\n')+ { skip(); } ;

/*
aqui van el resto de sus reglas lexicas, recuerde NO ASOCIAR NINGUNA ACCION a cada regla
vamos a agregar la palabra reservada 'float' y a agregar los simbolos para los lexemas , ; ( ) =
*/

fragment DIGIT : '0'..'9';
fragment LETRA : 'a'..'z'|'A'..'Z'|'_';

LBRACE   :('{') {System.out.println("LBRACE");};
RBRACE   :('}') {System.out.println("RBRACE");};
