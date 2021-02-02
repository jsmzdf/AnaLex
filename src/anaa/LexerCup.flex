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
D=[0-9]+
G=[_]+
//espacio=[ ,\t,\r,\n]+
espacio=[\n\t\r]+
%{
    private Symbol symbol(int type,Object value){
        return new Symbol(type,yyline,yycolumn,value);
    }

    private Symbol symbol(int type){
        return new Symbol(type,yyline,yycolumn);
    }
%}
%%
{espacio } {/*Ignore*/}

( "//"(.)* ) {/*Ignore*/}

/*Comillas*/
( "\"" ) { return  new Symbol(sym.Comillas,yychar,yyline,yytext());}

/*Tipos de datos*/
( byte | int | char | long | float | double  | boolean | short ) {return new Symbol(sym.Tipo_dato, yychar, yyline, yytext());}

/*Cadena*/
( String ) {return new Symbol(sym.Cadena, yychar, yyline, yytext());}

/*if*/
( if ) {return new Symbol(sym.If, yychar, yyline, yytext());}

/*else*/
( else ) {return new Symbol(sym.Else, yychar, yyline, yytext());}

/*do*/
( do ) {return new Symbol(sym.Do, yychar, yyline, yytext());}

/*while*/
( while ) {return new Symbol(sym.While, yychar, yyline, yytext());}

/*for*/
( for ) {return new Symbol(sym.For, yychar, yyline, yytext());}

/*switch*/
( switch ) {return new Symbol(sym.Switch, yychar, yyline, yytext());}

/*case*/
( case ) {return new Symbol(sym.Case, yychar, yyline, yytext());}

/*default*/
( default ) {return new Symbol(sym.Default, yychar, yyline, yytext());}

/*break*/
( break ) {return new Symbol(sym.Break, yychar, yyline, yytext());}

/*return*/
( return ) {return new Symbol(sym.Return, yychar, yyline, yytext());}

/*igual*/
( "=" ) {return new Symbol(sym.Igual, yychar, yyline, yytext());}

/*simbolo de suma*/
( "+" ) {return new Symbol(sym.Suma, yychar, yyline, yytext());}

/*simbolo resta*/
( "-" ) {return new Symbol(sym.Resta, yychar, yyline, yytext());}

/*simbolo Multiplicacion*/
( "*" ) {return new Symbol(sym.Multiplicacion, yychar, yyline, yytext());}

/*simbolo division*/
( "/" ) {return new Symbol(sym.Division, yychar, yyline, yytext());}

/*simbolo modulo*/
( "%" ) {return new Symbol(sym.Modulo, yychar, yyline, yytext());}

/*operadores logicos*/
( "&&" | "||" | "!" | "&" | "|" ) {return new Symbol(sym.Operador_logico, yychar, yyline, yytext());}

/*operadores relacionales*/
( ">" | "<" | "==" | "!=" | ">=" | "<="  ) {return new Symbol(sym.Operador_relacional, yychar, yyline, yytext());}

/*operadores de asignacion*/
( "+=" | "-="  | "*=" | "/=" | "%=" ) {return new Symbol(sym.Operador_asignacion, yychar, yyline, yytext());}

/*operadores unarios*/
( "++" | "--" ) {return new Symbol(sym.Operador_unario, yychar, yyline, yytext());}

/*simbolos booleanos*/
(true | false) {return new Symbol(sym.Dato_booleano, yychar, yyline, yytext());}

/* Parentesis de apertura */
( "(" ) {return new Symbol(sym.Parentesis_apertura, yychar, yyline, yytext());}

/* Parentesis de cierre */
( ")" ) {return new Symbol(sym.Parentesis_cierre, yychar, yyline, yytext());}

/* Llave de apertura */
( "{" ) {return new Symbol(sym.Llave_apertura, yychar, yyline, yytext());}

/* Llave de cierre */
( "}" ) {return new Symbol(sym.Llave_cierre, yychar, yyline, yytext());}

/* Corchete de apertura */
( "[" ) {return new Symbol(sym.Corchete_apertura, yychar, yyline, yytext());}

/* Corchete de cierre */
( "]" ) {return new Symbol(sym.Corchete_cierre, yychar, yyline, yytext());}

/* Marcador de importar */
( "import" ) {return new Symbol(sym.Import, yychar, yyline, yytext());}

/* Marcador de main */
( "main" ) {return new Symbol(sym.Main, yychar, yyline, yytext());}

/* Marcador de interface */
( "interface" ) {return new Symbol(sym.Interface, yychar, yyline, yytext());}

/* Marcador de abstract */
( "abstract" ) {return new Symbol(sym.Abstract, yychar, yyline, yytext());}

/* Marcador de package */
( "package" ) {return new Symbol(sym.Package, yychar, yyline, yytext());}

/* Marcador de static */
( "static" ) {return new Symbol(sym.Static, yychar, yyline, yytext());}

/* Marcador de assert */
( "assert" ) {return new Symbol(sym.Assert, yychar, yyline, yytext());}

/* Marcador de catch */
( "catch" ) {return new Symbol(sym.Catch, yychar, yyline, yytext());}

/* Marcador de const */
( "const" ) {return new Symbol(sym.Const, yychar, yyline, yytext());}

/* Marcador de continue */
( "continue" ) {return new Symbol(sym.Continue, yychar, yyline, yytext());}

/* Marcador de enum */
( "enum" ) {return new Symbol(sym.Enum, yychar, yyline, yytext());}

/* Marcador de extends */
( "extends" ) {return new Symbol(sym.Extends, yychar, yyline, yytext());}

/* Marcador de final */
( "final" ) {return new Symbol(sym.Final, yychar, yyline, yytext());}

/* Marcador de finally */
("finally" ) {return new Symbol(sym.Finally, yychar, yyline, yytext());}

/* Marcador de implements */
( "implements" ) {return new Symbol(sym.Implements, yychar, yyline, yytext());}

/* Marcador de instanceof */
( "instanceof" ) {return new Symbol(sym.Instanceof, yychar, yyline, yytext());}

/* Marcador de native */
( "native" ) {return new Symbol(sym.Native, yychar, yyline, yytext());}

/* Marcador de new */
( "new" ) {return new Symbol(sym.New, yychar, yyline, yytext());}

/* Marcador de strictfp */
( "strictfp" ) {return new Symbol(sym.Strictfp, yychar, yyline, yytext());}

/* Marcador de super */
( "super" ) {return new Symbol(sym.Super, yychar, yyline, yytext());}

/* Marcador de synchronized */
( "synchronized" ) {return new Symbol(sym.Synchronized, yychar, yyline, yytext());}

/* Marcador de throw */
( "throw" ) {return new Symbol(sym.Throw, yychar, yyline, yytext());}

/* Marcador de throws */ 
( "throws" ) {return new Symbol(sym.Throws, yychar, yyline, yytext());}

/* Marcador de transient */
( "transient" ) {return new Symbol(sym.Transient, yychar, yyline, yytext());}

/* Marcador de try */ 
( "try" ) {return new Symbol(sym.Try, yychar, yyline, yytext());}

/* Marcador de volatile */ 
( "volatile" ) {return new Symbol(sym.Volatile, yychar, yyline, yytext());}

/* Marcador de class */ 
( "class" ) {return new Symbol(sym.Class, yychar, yyline, yytext());}

/* Marcador de public */ 
( "public" ) {return new Symbol(sym.Public, yychar, yyline, yytext());}

/* Marcador de void */ 
( "void" ) {return new Symbol(sym.Void, yychar, yyline, yytext());}

/* Marcador de private */
( "private" ) {return new Symbol(sym.Private, yychar, yyline, yytext());}

/* Marcador de this */ 
( "this" ) {return new Symbol(sym.This, yychar, yyline, yytext());}

/* Marcador de protected */ 
( "protected" ) {return new Symbol(sym.Protected, yychar, yyline, yytext());}
 
/* Marcador de coma */
( "," ) {return new Symbol(sym.Coma, yychar, yyline, yytext());}

/* Marcador de signos */ 
( ";" ) {return new Symbol(sym.PuntoyComa, yychar, yyline, yytext());}

( "." ) {return new Symbol(sym.Punto, yychar, yyline, yytext());}

( ":" ) {return new Symbol(sym.Dospuntos, yychar, yyline, yytext());}

/* Marcador de identificador */
{L}({G}|{L}|{D})* {return new Symbol(sym.Identificador, yychar, yyline, yytext());}

/* Marcador de nunero */
("(-"{D}+")")|{D}+ {return new Symbol(sym.Numero, yychar, yyline, yytext());}

/* Marcador de error */
  . {return new Symbol(sym.ERROR, yychar, yyline, yytext());}
