/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anaa;

import java.io.IOException;
import java.io.StringReader;

/**
 *
 * @author Superpros
 */
public class AnalizadorLexico {

    private String resultado;

    protected void analizarLexico(String txtResultado) throws IOException {
     /*   int cont = 1;

        String expr = (String) txtResultado;
        Lexer lexer = new Lexer(new StringReader(expr));
        resultado = "Analizado   \t\t\t\tSímbolo\n";
        while (true) {
            Tokens token = lexer.yylex();
            if (token == null) {
                return;

            }
            switch (token) {
                case Linea:
                    cont++;

                    break;

                case Comillas:
                    resultado += "  <Comillas>\t\t\t" + lexer.lexeme + "\n";
                    break;
                case Import:
                    resultado += "  < Reservada Import>\t\t\t" + lexer.lexeme + "\n";
                    break;
                case Interface:
                    resultado += "  <Reservada Interface>\t\t\t" + lexer.lexeme + "\n";
                    break;
                case Abstract:
                    resultado += "  <Reservada Abstract>\t\t\t" + lexer.lexeme + "\n";
                    break;
                case Package:
                    resultado += "  <Reservada Package>\t\t\t" + lexer.lexeme + "\n";
                    break;
                case Static:
                    resultado += "  <Reservada Static>\t\t\t" + lexer.lexeme + "\n";
                    break;
                case Assert:
                    resultado += "  <Reservada Assert>\t\t\t" + lexer.lexeme + "\n";
                    break;
                case Catch:
                    resultado += "  <Reservada Catch>\t\t\t" + lexer.lexeme + "\n";
                    break;

                case Const:
                    resultado += "  <Reservada Const>\t\t\t" + lexer.lexeme + "\n";
                    break;
                case Continue:
                    resultado += "  <Reservada Continue>\t\t\t" + lexer.lexeme + "\n";
                    break;
                case Enum:
                    resultado += "  <Reservada Enum>\t\t\t" + lexer.lexeme + "\n";
                    break;
                case Extends:
                    resultado += "  <Reservada Extends>\t\t\t" + lexer.lexeme + "\n";
                    break;
                case Final:
                    resultado += "  <Reservada Final>\t\t\t" + lexer.lexeme + "\n";
                    break;
                case Finally:
                    resultado += "  <Reservada Finally>\t\t\t" + lexer.lexeme + "\n";
                    break;
                case Implements:
                    resultado += "  <Reservada Implements>\t\t\t" + lexer.lexeme + "\n";
                    break;
                case Instanceof:
                    resultado += "  <Reservada Instanceof>\t\t\t" + lexer.lexeme + "\n";
                    break;
                case Native:
                    resultado += "  <Reservada Native>\t\t\t" + lexer.lexeme + "\n";
                    break;
                case New:
                    resultado += "  <Reservada New>\t\t\t" + lexer.lexeme + "\n";
                    break;
                case Strictfp:
                    resultado += "  <Reservada Strictfp>\t\t\t" + lexer.lexeme + "\n";
                    break;
                case Super:
                    resultado += "  <Reservada Super>\t\t\t" + lexer.lexeme + "\n";
                    break;
                case Synchronized:
                    resultado += "  <Reservada Synchronized>\t\t\t" + lexer.lexeme + "\n";
                    break;
                case Throw:
                    resultado += "  <Reservada Throw>\t\t\t" + lexer.lexeme + "\n";
                    break;
                case Throws:
                    resultado += "  <Reservada Throws>\t\t\t" + lexer.lexeme + "\n";
                    break;
                case Transient:
                    resultado += "  <Reservada Transient>\t\t\t" + lexer.lexeme + "\n";
                    break;
                case Try:
                    resultado += "  <Reservada Try>\t\t\t" + lexer.lexeme + "\n";
                    break;
                case Class:
                    resultado += "  <Reservada Class>\t\t\t" + lexer.lexeme + "\n";
                    break;
                case Volatile:
                    resultado += "  <Reservada Volatile>\t\t\t" + lexer.lexeme + "\n";
                    break;
                    case This:
                    resultado += "  <Reservada This>\t\t\t" + lexer.lexeme + "\n";
                    break;
                case Cadena:

                    resultado += "  <Identificador> \t\t\t" + lexer.lexeme + "\n";
                    break;
                case Tipo_dato:
                    resultado += "  <Tipo de dato>\t\t\t\t" + lexer.lexeme + "\n";
                    break;
                case If:
                    resultado += "  <Reservada if>\t\t\t\t" + lexer.lexeme + "\n";
                    break;
                case Else:
                    resultado += "  <Reservada else>\t\t\t\t" + lexer.lexeme + "\n";
                    break;
                case Do:
                    resultado += "  <Reservada do>\t\t\t\t" + lexer.lexeme + "\n";
                    break;
                case While:
                    resultado += "  <Reservada while>\t\t\t" + lexer.lexeme + "\n";
                    break;
                case For:
                    resultado += "  <Reservada For>\t\t\t" + lexer.lexeme + "\n";
                    break;
                case Igual:
                    resultado += "  <Operador igual>\t\t\t" + lexer.lexeme + "\n";
                    break;
                case Suma:
                    resultado += "  <Operador suma>\t\t\t\t" + lexer.lexeme + "\n";
                    break;
                case Resta:
                    resultado += "  <Operador resta>\t\t\t\t" + lexer.lexeme + "\n";
                    break;
                case Multiplicacion:
                    resultado += "  <Operador multiplicacion>\t\t" + lexer.lexeme + "\n";
                    break;
                case Division:
                    resultado += "  <Operador division>\t\t" + lexer.lexeme + "\n";
                    break;
                case Operador_logico:
                    resultado += "  <Operador logico>\t\t" + lexer.lexeme + "\n";
                    break;
                case Operador_incremento:
                    resultado += "  <Operador incremento>\t\t" + lexer.lexeme + "\n";
                    break;
                case Operador_relacional:
                    resultado += "  <Operador relacional>\t\t\t" + lexer.lexeme + "\n";
                    break;
                case Operador_asignacion:
                    resultado += "  <Operador asignación>\t\t" + lexer.lexeme + "\n";
                    break;
                case Dato_booleano:
                    resultado += "  <Dato booleano>\t\t" + lexer.lexeme + "\n";
                    break;
                case Parentesis_apertura:
                    resultado += "  <Parentesis de apertura>\t\t" + lexer.lexeme + "\n";
                    break;
                case Coma:
                    resultado += "  <Signo de puntuacion>\t\t" + lexer.lexeme + "\n";
                    break;
                case Parentesis_cierre:
                    resultado += "  <Parentesis de cierre>\t\t\t" + lexer.lexeme + "\n";
                    break;
                case Break:
                    resultado += "  < Reservada break>\t\t\t" + lexer.lexeme + "\n";
                    break;
                case Llave_apertura:
                    resultado += "  <Llave de apertura>\t\t\t" + lexer.lexeme + "\n";
                    break;
                case Llave_cierre:
                    resultado += "  <Llave de cierre>\t\t\t" + lexer.lexeme + "\n";
                    break;
                case Corchete_apertura:
                    resultado += "  <Corchete de apertura>\t\t\t" + lexer.lexeme + "\n";
                    break;
                case Corchete_cierre:
                    resultado += "  <Corchete de cierre>\t\t\t" + lexer.lexeme + "\n";
                    break;
                case Main:
                    resultado += "  <Reservada main>\t\t\t" + lexer.lexeme + "\n";
                    break;
                case Public:
                    resultado += "  <Reservada Public>\t\t\t" + lexer.lexeme + "\n";
                    break;
                case Void:
                    resultado += "  <Reservada Void>\t\t\t" + lexer.lexeme + "\n";
                    break;
                case Private:
                    resultado += "  <Reservada Private>\t\t\t" + lexer.lexeme + "\n";
                    break;
                case Protected:
                    resultado += "  <Reservada Protected>\t\t\t" + lexer.lexeme + "\n";
                    break;
                case Default:
                    resultado += "  <Palabra reservada>\t\t\t" + lexer.lexeme + "\n";
                    break;
                case Case:
                    resultado += "  <Palabra reservada>\t\t\t " + lexer.lexeme + "\n";
                    break;
                case Modulo:
                    resultado += "  <Operador aritmético>\t\t\t   " + lexer.lexeme + "\n";
                    break;
                case Return:
                    resultado += "  <Palabra reservada>\t\t\t   " + lexer.lexeme + "\n";
                    break;
                case Switch:
                    resultado += "  <Palabra reservada>\t \t\t " + lexer.lexeme + "\n";
                    break;
                case signo_puntuacion:
                    resultado += "  <Signo de puntuación>\t\t\t\t " + lexer.lexeme + "\n";
                    break;
                case Identificador:
                    resultado += "  <Identificador>\t\t\t\t" + lexer.lexeme + "\n";
                    break;
                case Comilla:
                    resultado += "  <comilla>\t\t\t\t" + lexer.lexeme + "\n";
                    break;
                case Numero:
                    resultado += "  <Numero>\t\t\t\t" + lexer.lexeme + "\n";
                    break;
                case ERROR:
                    resultado += "  <Simbolo no definido>\n";
                    break;
                default:
                    resultado += "  < " + lexer.lexeme + " >\n";
                    break;
            }

        }*/

    }

    public String getResulta() {
        return resultado;
    }

}
