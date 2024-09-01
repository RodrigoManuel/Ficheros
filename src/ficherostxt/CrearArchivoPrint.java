/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ficherostxt;

/**
 *
 * @author Rodrigo
 */
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class CrearArchivoPrint {
    public static void main(String ars[]){
        
        try (PrintWriter archivo = new PrintWriter("ficheros/archivo1.txt", "UTF-8")) {
            archivo.println("Lenguajes de Programación II");
            archivo.println("Facultad Politécnica - UNA");
            archivo.close();
        } catch (FileNotFoundException | UnsupportedEncodingException e) {
            System.out.println(e.getMessage());
        } 
    }
}
