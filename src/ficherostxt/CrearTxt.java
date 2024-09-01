/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ficherostxt;

/**
 *
 * @author Rodrigo
 */
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class CrearTxt {
    public static void main(String ars[]){
        try {
            String ruta = "ficheros/archivo2.txt";
            String contenido = "Contenido de ejemplo\nLenguajes de Programación II";
            File archivo = new File(ruta);
            
            // Si el archivo no existe es creado
            if (!archivo.exists()) {
                archivo.createNewFile();
            }
            
            try (FileWriter entrada = new FileWriter(archivo);
                 BufferedWriter salida = new BufferedWriter(entrada)) {
                salida.write(contenido);
                salida.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        } catch (NullPointerException | IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
