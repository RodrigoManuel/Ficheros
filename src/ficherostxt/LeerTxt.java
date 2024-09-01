/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ficherostxt;

/**
 *
 * @author Rodrigo
 */
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class LeerTxt {
    public static void main(String[] args) {
	String nombreArchivo = "ficheros/archivo2.txt";
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(nombreArchivo);
            bufferedReader = new BufferedReader(fileReader);
            StringBuilder stringBuilder = new StringBuilder("");
            String linea;
            while ((linea = bufferedReader.readLine()) != null) {
                // Lee línea por línea, omitiendo los saltos de línea
                stringBuilder.append(linea + "\n");
            }

            System.out.println("Contenido: " + stringBuilder.toString());

        } catch (IOException e) {
            System.out.println("Excepción leyendo archivo: " + e.getMessage());
        } finally {
            try {
                if (fileReader != null)
                        fileReader.close();
                if (bufferedReader != null)
                        bufferedReader.close();
            } catch (IOException e) {
                System.out.println("Excepción cerrando: " + e.getMessage());
            }
        }
    }
}
