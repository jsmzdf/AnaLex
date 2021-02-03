/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anaa;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
/**
 *
 * @author Superpros
 */
public class PrincipalGenerador {

    public static void main(String[] args) throws Exception {
        String ruta1 = "C:\\Users\\User\\Documents\\NetBeansProjects\\AnaLex\\src\\anaa\\Lexer.flex";
        String ruta2= "C:\\Users\\User\\Documents\\NetBeansProjects\\AnaLex\\src\\anaa\\LexerCup.flex";
          String[] rutaS = {"-parser", "Sintax", "C:\\Users\\User\\Documents\\NetBeansProjects\\AnaLex\\src\\anaa\\Sintax.cup"};
          generar(ruta1,ruta2,rutaS);
    }
    //C:\Users\User\Documents\NetBeansProjects\AnaLex

    public static void generar(String ruta1, String ruta2, String[] rutaS) throws IOException, Exception {
     File archivo;
     File archivo2;
         archivo = new File(ruta1);
        JFlex.Main.generate(archivo);
        archivo2 = new File(ruta2);
        JFlex.Main.generate(archivo2);
        java_cup.Main.main(rutaS);
        
    
        Path rutaSym = Paths.get("C:\\Users\\User\\Documents\\NetBeansProjects\\AnaLex\\src\\anaa\\sym.java");
        if (Files.exists(rutaSym)) {
            Files.delete(rutaSym);
        }
        Files.move(
                Paths.get("C:\\Users\\User\\Documents\\NetBeansProjects\\AnaLex\\sym.java"), 
                Paths.get("C:\\Users\\User\\Documents\\NetBeansProjects\\AnaLex\\src\\anaa\\sym.java")
        );
        Path rutaSin = Paths.get("C:\\Users\\User\\Documents\\NetBeansProjects\\AnaLex\\src\\anaa\\Sintax.java");
        if (Files.exists(rutaSin)) {
            Files.delete(rutaSin);
        }
        Files.move(
                Paths.get("C:\\Users\\User\\Documents\\NetBeansProjects\\AnaLex\\Sintax.java"), 
                Paths.get("C:\\Users\\User\\Documents\\NetBeansProjects\\AnaLex\\src\\anaa\\Sintax.java")
        );
    }
}
