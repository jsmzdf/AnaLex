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

                case Cadena:

                    resultado += "  <Identificador> \t\t\t" + lexer.lexeme + "\n";
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

                case Main:
                    resultado += "  <Reservada main>\t\t\t" + lexer.lexeme + "\n";
                    break;
                case Cin:
                    resultado += "  <Simbolo de entrada>" + lexer.lexeme + "\n";
                    break;
                case Identificador:
                    resultado += "  <Identificador>\t\t\t\t" + lexer.lexeme + "\n";
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

        }

    }

    public String getResulta() {
        return resultado;
    }

}
