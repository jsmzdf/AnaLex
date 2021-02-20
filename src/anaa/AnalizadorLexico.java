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
        int cont = 1;

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
                case T_dato:
                    resultado += "  <Tipo de dato>\t\t\t\t" + lexer.lexeme + "\n";
                    break;

                case Cadena:

                    resultado += "  <Identificador> \t\t\t" + lexer.lexeme + "\n";
                    break;

                case If:
                    resultado += "  <Reservada if>\t\t\t\t" + lexer.lexeme + "\n";
                    break;
                case Elif:
                    resultado += "  <Reservada elif>\t\t\t\t" + lexer.lexeme + "\n";
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
                case Asterisco:
                    resultado += "  <Operador multiplicacion>\t\t" + lexer.lexeme + "\n";
                    break;
                case Division:
                    resultado += "  <Operador division>\t\t" + lexer.lexeme + "\n";
                    break;
                case Op_logico:
                    resultado += "  <Operador logico>\t\t\t\t" + lexer.lexeme + "\n";
                    break;
                case Op_incremento:
                    resultado += "  <Operador de incremento>\t\t\t\t" + lexer.lexeme + "\n";
                    break;
                case Op_relacional:
                    resultado += "  <Operador relacional>\t\t\t\t" + lexer.lexeme + "\n";
                    break;
                case Op_atribucion:
                    resultado += "  <Operador  de atribucion>\t\t\t\t" + lexer.lexeme + "\n";
                    break;
                case Op_booleano:
                    resultado += "  <Operador booleano>\t\t\t\t" + lexer.lexeme + "\n";
                    break;
                case Parentesis_a:
                    resultado += "  <parentesis de apertura>\t\t\t\t" + lexer.lexeme + "\n";
                    break;
                case Parentesis_c:
                    resultado += "  <parentesis de cierre>\t\t\t\t" + lexer.lexeme + "\n";
                    break;
                case Llave_a:
                    resultado += "  <llave de apertura>\t\t\t\t" + lexer.lexeme + "\n";
                    break;
                case Llave_c:
                    resultado += "  <llave de cierre>\t\t\t\t" + lexer.lexeme + "\n";
                    break;
                case Corchete_a:
                    resultado += "  <corchete de apertura>\t\t\t\t" + lexer.lexeme + "\n";
                    break;
                case Corchete_c:
                    resultado += "  <corchete de cierre>\t\t\t\t" + lexer.lexeme + "\n";
                    break;
                case Main:
                    resultado += "  <Reservada main>\t\t\t" + lexer.lexeme + "\n";
                    break;
                case P_coma:
                    resultado += "  <Signo de puntuacion>\t\t\t\t" + lexer.lexeme + "\n";
                    break;
                case Cin:
                    resultado += "  <Simbolo de entrada>" + lexer.lexeme + "\n";
                    break;
                case Static:
                    resultado += "  <Palabra reservada>\t\t\t\t" + lexer.lexeme + "\n";
                    break;
                case Noexcept:
                    resultado += "  <NN>\t\t\t\t" + lexer.lexeme + "\n";
                    break;
                case Signed:
                    resultado += "  <NN>\t\t\t\t" + lexer.lexeme + "\n";
                    break;
                case Catch:
                    resultado += "  <Reservada Catch>\t\t\t\t" + lexer.lexeme + "\n";
                    break;
                case Break:
                    resultado += "  <Reservada Break>\t\t\t\t" + lexer.lexeme + "\n";
                    break;
                case Case:
                    resultado += "  <Reservada Case>\t\t\t\t" + lexer.lexeme + "\n";
                    break;
                case Delete:
                    resultado += "  <NN>\t\t\t\t" + lexer.lexeme + "\n";
                    break;
                case Sizeof:
                    resultado += "  <NN>\t\t\t\t" + lexer.lexeme + "\n";
                    break;
                case Struct:
                    resultado += "  <NN>\t\t\t\t" + lexer.lexeme + "\n";
                    break;
                case Throw:
                    resultado += "  <NN>\t\t\t\t" + lexer.lexeme + "\n";
                    break;
                case Void:
                    resultado += "  <NN>\t\t\t\t" + lexer.lexeme + "\n";
                    break;
                case And:
                    resultado += "  <NN>\t\t\t\t" + lexer.lexeme + "\n";
                    break;
                case Class:
                    resultado += "  <Reservada Class>\t\t\t\t" + lexer.lexeme + "\n";
                    break;
                case Const:
                    resultado += "  <NN>\t\t\t\t" + lexer.lexeme + "\n";
                    break;
                case Continue:
                    resultado += "  <NN>\t\t\t\t" + lexer.lexeme + "\n";
                    break;
                case Switch:
                    resultado += "  <NN>\t\t\t\t" + lexer.lexeme + "\n";
                    break;
                case Template:
                    resultado += "  <NN>\t\t\t\t" + lexer.lexeme + "\n";
                    break;
                case Try:
                    resultado += "  <NN>\t\t\t\t" + lexer.lexeme + "\n";
                    break;
                case This:
                    resultado += "  <NN>\t\t\t\t" + lexer.lexeme + "\n";
                    break;
                case Include:
                    resultado += "  <NN>\t\t\t\t" + lexer.lexeme + "\n";
                    break;
                case Precarga:
                    resultado += "  <NN>\t\t\t\t" + lexer.lexeme + "\n";
                    break;
                case Return:
                    resultado += "  <NN>\t\t\t\t" + lexer.lexeme + "\n";
                    break;
                case Enum:
                    resultado += "  <NN>\t\t\t\t" + lexer.lexeme + "\n";
                    break;
                case Define:
                    resultado += "  <NN>\t\t\t\t" + lexer.lexeme + "\n";
                    break;
                case Goto:
                    resultado += "  <NN>\t\t\t\t" + lexer.lexeme + "\n";
                    break;
                case Short:
                    resultado += "  <NN>\t\t\t\t" + lexer.lexeme + "\n";
                    break;
                case Union:
                    resultado += "  <NN>\t\t\t\t" + lexer.lexeme + "\n";
                    break;
                case Volatile:
                    resultado += "  <NN>\t\t\t\t" + lexer.lexeme + "\n";
                    break;
                case Auto:
                    resultado += "  <NN>\t\t\t\t" + lexer.lexeme + "\n";
                    break;
                case Private:
                    resultado += "  <NN>\t\t\t\t" + lexer.lexeme + "\n";
                    break;
                case Public:
                    resultado += "  <NN>\t\t\t\t" + lexer.lexeme + "\n";
                    break;
                case Protected:
                    resultado += "  <NN>\t\t\t\t" + lexer.lexeme + "\n";
                    break;
                case Inline:
                    resultado += "  <NN>\t\t\t\t" + lexer.lexeme + "\n";
                    break;
                case Namespace:
                    resultado += "  <NN>\t\t\t\t" + lexer.lexeme + "\n";
                    break;
                case Using:
                    resultado += "  <NN>\t\t\t\t" + lexer.lexeme + "\n";
                    break;
                case Identificador:
                    resultado += "  <Identificador>\t\t\t\t" + lexer.lexeme + "\n";
                    break;
                case Numero:
                    resultado += "  <Numero>\t\t\t\t" + lexer.lexeme + "\n";
                    break;
                case Punto:
                    resultado += "  <Punto>\t\t\t\t" + lexer.lexeme + "\n";
                    break;

                case ERROR:
                    resultado += "  <Simbolo no definido>\n";
                    break;
                default:
                    resultado += "  < " + lexer.lexeme + " >\n";
                    break;
            }

        }

    }

    public String getResulta() {
        return resultado;
    }

}
