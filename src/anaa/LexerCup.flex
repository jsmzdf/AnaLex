package anaa;
import java_cup.runtime.Symbol;
%%
%class LexerCup
%type java_cup.runtime.Symbol
%cup
%full
%line
%char
L=[a-zA-Z_]+
C=[a-zA-Z]
D=[0-9]+(\.[0-9]+)?
DN=[0-9]
espacio=[ \t \r \n]+
%{
    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }
    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }
%}
%%

/**/
/* Espacios en blanco */
{espacio} {/*Ignore*/}

/* Comentarios */
( "//"(.)* ) {/*Ignore*/}

/* Salto de linea */
/*( "\n" ) {return new Symbol(sym.Linea, yychar, yyline, yytext());}*/

/* Comillas */
( "\"" ) {return new Symbol(sym.Comillas, yychar, yyline, yytext());}
( "," ) {return new Symbol(sym.Coma, yychar, yyline, yytext());}
( "'" ) {return new Symbol(sym.Comilla, yychar, yyline, yytext());}
/* Tipos de datos */
(byte) {return new Symbol(sym.T_dato, yychar, yyline, yytext());}

(int) {return new Symbol(sym.Int, yychar, yyline, yytext());}

(long) {return new Symbol(sym.Long, yychar, yyline, yytext());}

(double) {return new Symbol(sym.DOuble, yychar, yyline, yytext());}

(char) {return new Symbol(sym.Char, yychar, yyline, yytext());}

(float) {return new Symbol(sym.Float, yychar, yyline, yytext());}

( string ) {return new Symbol(sym.Cadena, yychar, yyline, yytext());}

/* Palabra reservada If */
( if ) {return new Symbol(sym.If, yychar, yyline, yytext());}

/* Palabra reservada Elif */
//( elif ) {return new Symbol(sym.Elif, yychar, yyline, yytext());}

/* Palabra reservada Else */
( else ) {return new Symbol(sym.Else, yychar, yyline, yytext());}

/* Palabra reservada Do */
( do ) {return new Symbol(sym.Do, yychar, yyline, yytext());}

/* Palabra reservada While */
( while ) {return new Symbol(sym.While, yychar, yyline, yytext());}

/* Palabra reservada For */
( for ) {return new Symbol(sym.For, yychar, yyline, yytext());}

/* Operador Igual */
( "=" ) {return new Symbol(sym.Igual, yychar, yyline, yytext());}

/* Operador Suma */
( "+" ) {return new Symbol(sym.Suma, yychar, yyline, yytext());}

/* Operador Resta */
( "-" ) {return new Symbol(sym.Resta, yychar, yyline, yytext());}

/* Aseterisco Puntero o multiplicacion */
( "*" ) {return new Symbol(sym.Asterisco, yychar, yyline, yytext());}

/* Operador Division */
( "/" ) {return new Symbol(sym.Division, yychar, yyline, yytext());}

/* Operadores logicos */
( "&&" | "||" | "!" | "&" | "|" ) {return new Symbol(sym.Op_logico, yychar, yyline, yytext());}

/*Operadores Relacionales */
( ">" | "<" | "==" | "!=" | ">=" | "<=" | "<<" | ">>" ) {return new Symbol(sym.Op_relacional, yychar, yyline, yytext());}

/* Operadores Atribucion */
( "+=" | "-="  | "*=" | "/=" | "%=" ) {return new Symbol(sym.Op_atribucion, yychar, yyline, yytext());}

/* Operadores Incremento y decremento */
( "++" | "--" ) {return new Symbol(sym.Op_incremento, yychar, yyline, yytext());}

/*Operadores Booleanos*/
(true | false)      {return new Symbol(sym.Op_booleano, yychar, yyline, yytext());}

/* Parentesis de apertura */
( "(" ) {return new Symbol(sym.Parentesis_a, yychar, yyline, yytext());}

/* Parentesis de cierre */
( ")" ) {return new Symbol(sym.Parentesis_c, yychar, yyline, yytext());}

/* Llave de apertura */
( "{" ) {return new Symbol(sym.Llave_a, yychar, yyline, yytext()); }

/* Llave de cierre */
( "}" ) {return new Symbol(sym.Llave_c, yychar, yyline, yytext()); }

/* Corchete de apertura */
( "[" ) {return new Symbol(sym.Corchete_a, yychar, yyline, yytext()); }

/* Corchete de cierre */
( "]" ) {return new Symbol(sym.Corchete_c, yychar, yyline, yytext());}

/* Marcador de inicio de algoritmo */
( main ) {return new Symbol(sym.Main, yychar, yyline, yytext()); }

/* Punto y coma */
( ";" ) {return new Symbol(sym.P_coma, yychar, yyline, yytext());}
( ":" ) {return new Symbol(sym.Dos_p, yychar, yyline, yytext());}

/*Entrada de datos por consola*/
( cin ) {return new Symbol(sym.Cin, yychar, yyline, yytext());}

( cout ) {return new Symbol(sym.Cout, yychar, yyline, yytext());}

//( static ) {return new Symbol(sym.Static, yychar, yyline, yytext());}

//( noexcept ) {return new Symbol(sym.Noexcept, yychar, yyline, yytext()); }

//( signed ) {return new Symbol(sym.Signed, yychar, yyline, yytext());}

//( unsigned ) {return new Symbol(sym.Unsigned, yychar, yyline, yytext()); }

//( catch ) {return new Symbol(sym.Catch, yychar, yyline, yytext());}

( break ) {return new Symbol(sym.Break, yychar, yyline, yytext());}

( case ) {return new Symbol(sym.Case, yychar, yyline, yytext());}

//( delete ) {return new Symbol(sym.Delete, yychar, yyline, yytext());}

( default ) {return new Symbol(sym.Default, yychar, yyline, yytext());}

//( sizeof ) {return new Symbol(sym.Sizeof, yychar, yyline, yytext());}

( struct ) {return new Symbol(sym.Struct, yychar, yyline, yytext());}
( "." ) {return new Symbol(sym.Punto, yychar, yyline, yytext());}
//( throw ) {return new Symbol(sym.Throw, yychar, yyline, yytext());}

( void ) {return new Symbol(sym.Void, yychar, yyline, yytext());}

//( and ) {return new Symbol(sym.And, yychar, yyline, yytext());}

//( class ) {return new Symbol(sym.Class, yychar, yyline, yytext()); }

//( const ) {return new Symbol(sym.Const, yychar, yyline, yytext());}

//( continue ) {return new Symbol(sym.Continue, yychar, yyline, yytext());}

( switch ) {return new Symbol(sym.Switch, yychar, yyline, yytext());}

//( template ) {return new Symbol(sym.Template, yychar, yyline, yytext());}

//( try ) {return new Symbol(sym.Try, yychar, yyline, yytext());}

//( this ) {return new Symbol(sym.This, yychar, yyline, yytext());}

//( include ) {return new Symbol(sym.Include, yychar, yyline, yytext());}

//( "#" ) {return new Symbol(sym.Precarga, yychar, yyline, yytext());}

( return ) {return new Symbol(sym.Return, yychar, yyline, yytext());}

//( enum ) {return new Symbol(sym.Enum, yychar, yyline, yytext());}

//( define ) {return new Symbol(sym.Define, yychar, yyline, yytext());}

//( goto ) {return new Symbol(sym.Goto, yychar, yyline, yytext());}

//( short ) {return new Symbol(sym.Short, yychar, yyline, yytext());}

//( union ) {return new Symbol(sym.Union, yychar, yyline, yytext());}

//( volatile ) {return new Symbol(sym.Volatile, yychar, yyline, yytext());}

//( auto ) {return new Symbol(sym.Auto, yychar, yyline, yytext());}

/*Proteccion datos*/
//( private ) {return new Symbol(sym.Private, yychar, yyline, yytext());}
//( public ) {return new Symbol(sym.Public, yychar, yyline, yytext());}
//( protected ) {return new Symbol(sym.Protected, yychar, yyline, yytext());}

//( inline ) {return new Symbol(sym.Incline, yychar, yyline, yytext());}

//( namespace ) {return new Symbol(sym.Namespace, yychar, yyline, yytext());}

//( using ) {return new Symbol(sym.Using, yychar, yyline, yytext());}



/* Identificador */
{L}({L}|{D})* {return new Symbol(sym.Identificador, yychar, yyline, yytext());}



/* Numero */
("(-"{D}+")")|{D}+ {return new Symbol(sym.Numero, yychar, yyline, yytext());}

({C}|{DN}) {return new Symbol(sym.Caracter, yychar, yyline, yytext());}

//{L}({C}|{D})* {return new Symbol(sym.Text, yychar, yyline, yytext());}




/* Error de analisis 
 . {return new Symbol(sym.Error, yychar, yyline, yytext());}
*/