package anaa;
import static anaa.Tokens.*;
%%
%class Lexer
%type Tokens
L=[a-zA-Z_]+
D=[0-9]+
G=[_]+
espacio=[ \t\r]+
%{
    public String lexeme;
%}
%%
{espacio} {/*Ignore*/}

( "//"(.)* ) {/*Ignore*/}


( "\n" ) {return Linea;}


( "\"" ) {lexeme=yytext(); return Comillas;}

( byte | int | char | long | float | double  | boolean | short) {lexeme=yytext(); return Tipo_dato;}


( String ) {lexeme=yytext(); return Cadena;}


( if ) {lexeme=yytext(); return If;}


( else ) {lexeme=yytext(); return Else;}


( do ) {lexeme=yytext(); return Do;}


( while ) {lexeme=yytext(); return While;}


( for ) {lexeme=yytext(); return For;}


( switch ) {lexeme=yytext(); return Switch;}


( case ) {lexeme=yytext(); return Case;}


( default ) {lexeme=yytext(); return Default;}

( break ) {lexeme=yytext(); return Break;}


( return ) {lexeme=yytext(); return Return;}


( "=" ) {lexeme=yytext(); return Igual;}


( "+" ) {lexeme=yytext(); return Suma;}


( "-" ) {lexeme=yytext(); return Resta;}


( "*" ) {lexeme=yytext(); return Multiplicacion;}


( "/" ) {lexeme=yytext(); return Division;}


( "%" ) {lexeme=yytext(); return Modulo;}


( "&&" | "||" | "!" | "&" | "|" ) {lexeme=yytext(); return Operador_logico;}


( ">" | "<" | "==" | "!=" | ">=" | "<="  ) {lexeme = yytext(); return Operador_relacional;}


( "+=" | "-="  | "*=" | "/=" | "%=" ) {lexeme = yytext(); return Operador_asignacion;}


( "++" | "--" ) {lexeme = yytext(); return Operador_unario;}


(true | false)      {lexeme = yytext(); return Dato_booleano;}


( "(" ) {lexeme=yytext(); return Parentesis_apertura;}


( ")" ) {lexeme=yytext(); return Parentesis_cierre;}


( "{" ) {lexeme=yytext(); return Llave_apertura;}


( "}" ) {lexeme=yytext(); return Llave_cierre;}

( "[" ) {lexeme = yytext(); return Corchete_apertura;}

( "]" ) {lexeme = yytext(); return Corchete_cierre;}

( "import" ) {lexeme=yytext(); return Import;}

( "main" ) {lexeme=yytext(); return Main;}
 
( "interface" ) {lexeme=yytext(); return Interface;}
( "abstract" ) {lexeme=yytext(); return Abstract;}
( "package" ) {lexeme=yytext(); return Package;}
( "static" ) {lexeme=yytext(); return Static;}
( "assert" ) {lexeme=yytext(); return Assert;}
( "catch" ) {lexeme=yytext(); return Catch;}
( "const" ) {lexeme=yytext(); return Const;}
( "continue" ) {lexeme=yytext(); return Continue;}
( "enum" ) {lexeme=yytext(); return Enum;}
( "extends" ) {lexeme=yytext(); return Extends;}

( "final" ) {lexeme=yytext(); return Final;}

( "finally" ) {lexeme=yytext(); return Finally;}

( "implements" ) {lexeme=yytext(); return Implements;}

( "instanceof" ) {lexeme=yytext(); return Instanceof;}

( "native" ) {lexeme=yytext(); return Native;}

( "new" ) {lexeme=yytext(); return New;}

( "strictfp" ) {lexeme=yytext(); return Strictfp;}

( "super" ) {lexeme=yytext(); return Super;}

( "synchronized" ) {lexeme=yytext(); return Synchronized;}

( "throw" ) {lexeme=yytext(); return Throw;}

( "throws" ) {lexeme=yytext(); return Throws;}

( "transient" ) {lexeme=yytext(); return Transient;}

( "try" ) {lexeme=yytext(); return Try;}

( "volatile" ) {lexeme=yytext(); return Volatile;}

( "class" ) {lexeme=yytext(); return Class;}
( "public" ) {lexeme=yytext(); return Public;}

( "void" ) {lexeme=yytext(); return Void;}

( "private" ) {lexeme=yytext(); return Private;}

( "this" ) {lexeme=yytext(); return This;}


( "protected" ) {lexeme=yytext(); return Protected;}


( "," ) {lexeme=yytext(); return Coma;}



( ";" |"." |":") {lexeme=yytext(); return signo_puntuacion;}


{L}({G}|{L}|{D})* {lexeme=yytext(); return Identificador;}

("'") {lexeme=yytext(); return Comilla;}


("(-"{D}+")")|{D}+ {lexeme=yytext(); return Numero;}


 . {return ERROR;}
