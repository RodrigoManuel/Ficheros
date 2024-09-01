/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rodrigo
 */

// Para escribir datos en un fichero binario utilizaremos las clases 
// Java FileOutputStream y DataOutputStream derivadas de OutputStream.
// La clase FileOutputStream permite tener acceso al fichero para escribir bytes.
//opcional
//========
//import java.io.BufferedWriter;
//import java.io.File;
//import java.io.FileWriter;
//investigar métodos createNewFile, exists, FileWriter, entre otros.

package ficherosBinarios;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class EscribirBinarios {
    
public static void main (String[] args) {
        //objeto del tipo scanner para el ingreso de datos
        Scanner entrada = new Scanner(System.in);                                                                      
        FileOutputStream archivo = null;
        DataOutputStream salida = null;
        int entero;

        try {
            //se crea objeto del tipo FileOutputStream
            archivo = new FileOutputStream("ficheros/Datos.dat");
            //se crea objeto del tipo DataOutputStream para escribir
            salida = new DataOutputStream(archivo);

            System.out.print("Introduce número entero. -1 para terminar el programa: ");
            entero = entrada.nextInt();
            
            while (entero != -1) {
                //La clase proporciona métodos writeXxx() donde Xxx es el nombre del tipo primitivo.
                salida.writeInt(entero); //se escribe el número entero en el fichero                                   
                System.out.print("Introduce número entero. -1 para terminar el programa: ");
                entero = entrada.nextInt();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error de archivo");
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println("Error de entrada salida");
            System.out.println(e.getMessage());
        } finally {
            try {
                if (archivo != null) {
                    archivo.close();
                }
                if (salida != null) {
                    salida.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());                                                               
            }
        }
    }
}
