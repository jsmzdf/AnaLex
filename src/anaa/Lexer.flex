package anaa;
import static anaa.Tokens.*;
%%
%class Lexer
%type Tokens
L=[a-zA-Z_]+
D=[0-9]+(\.[0-9]+)?
espacio=[ \t\r]+
%{
    public String lexeme;
%}
%%

/* Espacios en blanco */
{espacio} {/*Ignore*/}

/* Comentarios */
( "//"(.)* ) {/*Ignore*/}

/* Salto de linea */
( "\n" ) {return Linea;}

/* Comillas */
( "\"" ) {lexeme=yytext(); return Comillas;}

/* Tipos de datos */
( byte | int | char | long | float | double ) {lexeme=yytext(); return T_dato;}
//( "," ) {lexeme=yytext(); return Coma;}

/* Tipo de dato String */
( String ) {lexeme=yytext(); return Cadena;}

/* Palabra reservada If */
( if ) {lexeme=yytext(); return If;}

/* Palabra reservada Elif */
( elif ) {lexeme=yytext(); return Elif;}

/* Palabra reservada Else */
( else ) {lexeme=yytext(); return Else;}

/* Palabra reservada Do */
( do ) {lexeme=yytext(); return Do;}

/* Palabra reservada While */
( while ) {lexeme=yytext(); return While;}

/* Palabra reservada For */
( for ) {lexeme=yytext(); return For;}

/* Operador Igual */
( "=" ) {lexeme=yytext(); return Igual;}

/* Operador Suma */
( "+" ) {lexeme=yytext(); return Suma;}

/* Operador Resta */
( "-" ) {lexeme=yytext(); return Resta;}

/* Aseterisco Puntero o multiplicacion */
( "*" ) {lexeme=yytext(); return Asterisco;}

/* Operador Division */
( "/" ) {lexeme=yytext(); return Division;}

/* Operadores logicos */
( "&&" | "||" | "!" | "&" | "|" ) {lexeme=yytext(); return Op_logico;}

/*Operadores Relacionales */
( ">" | "<" | "==" | "!=" | ">=" | "<=" | "<<" | ">>" ) {lexeme = yytext(); return Op_relacional;}

/* Operadores Atribucion */
( "+=" | "-="  | "*=" | "/=" | "%=" ) {lexeme = yytext(); return Op_atribucion;}

/* Operadores Incremento y decremento */
( "++" | "--" ) {lexeme = yytext(); return Op_incremento;}

/*Operadores Booleanos*/
(true | false)      {lexeme = yytext(); return Op_booleano;}

/* Parentesis de apertura */
( "(" ) {lexeme=yytext(); return Parentesis_a;}

/* Parentesis de cierre */
( ")" ) {lexeme=yytext(); return Parentesis_c;}

/* Llave de apertura */
( "{" ) {lexeme=yytext(); return Llave_a;}

/* Llave de cierre */
( "}" ) {lexeme=yytext(); return Llave_c;}

/* Corchete de apertura */
( "[" ) {lexeme = yytext(); return Corchete_a;}

/* Corchete de cierre */
( "]" ) {lexeme = yytext(); return Corchete_c;}

/* Marcador de inicio de algoritmo */
( main ) {lexeme=yytext(); return Main;}

/* Punto y coma */
( ";" ) {lexeme=yytext(); return P_coma;}

/*Entrada de datos por consola*/
( cin ) {lexeme=yytext(); return Cin;}

/*Entrada de datos por consola*/
( cout ) {lexeme=yytext(); return Cout;}


( static ) {lexeme=yytext(); return Static;}

( noexcept ) {lexeme=yytext(); return Noexcept;}

( signed ) {lexeme=yytext(); return Signed;}

( unsigned ) {lexeme=yytext(); return Unsigned;}

( catch ) {lexeme=yytext(); return Catch;}

( break ) {lexeme=yytext(); return Break;}

( case ) {lexeme=yytext(); return Case;}

( delete ) {lexeme=yytext(); return Delete;}

( default ) {lexeme=yytext(); return Default;}

( sizeof ) {lexeme=yytext(); return Sizeof;}

( struct ) {lexeme=yytext(); return Struct;}

( throw ) {lexeme=yytext(); return Throw;}

( void ) {lexeme=yytext(); return Void;}

( and ) {lexeme=yytext(); return And;}

( class ) {lexeme=yytext(); return Class;}

( const ) {lexeme=yytext(); return Const;}

( continue ) {lexeme=yytext(); return Continue;}

( switch ) {lexeme=yytext(); return Switch;}

( template ) {lexeme=yytext(); return Template;}

( try ) {lexeme=yytext(); return Try;}

( this ) {lexeme=yytext(); return This;}

( include ) {lexeme=yytext(); return Include;}

( "#" ) {lexeme=yytext(); return Precarga;}

( return ) {lexeme=yytext(); return Return;}

( enum ) {lexeme=yytext(); return Enum;}

( define ) {lexeme=yytext(); return Define;}

( goto ) {lexeme=yytext(); return Goto;}

( short ) {lexeme=yytext(); return Short;}

( union ) {lexeme=yytext(); return Union;}

( volatile ) {lexeme=yytext(); return Volatile;}

( auto ) {lexeme=yytext(); return Auto;}


/*Proteccion datos*/
( private ) {lexeme=yytext(); return Private;}
( public ) {lexeme=yytext(); return Public;}
( protected ) {lexeme=yytext(); return Protected;}

( inline ) {lexeme=yytext(); return Inline;}

( namespace ) {lexeme=yytext(); return Namespace;}

( using ) {lexeme=yytext(); return Using;}


/* Identificador */
{L}({L}|{D})* {lexeme=yytext(); return Identificador;}

/* Numero */
("(-"{D}+")")|{D}+ {lexeme=yytext(); return Numero;}
( "." ) {lexeme=yytext(); return Punto;}

/* Error de analisis */
 . {return ERROR;}
