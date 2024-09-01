/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rodrigo
 */

//Para leer de un fichero binario utilizaremos las clases 
//Java FileInputStream y DataInputStream derivadas de InputStream.
//La clase FileInputStream permite leer bytes de un fichero.

package ficherosBinarios;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
    
public class LeerBinarios {
    
    public static void main(String[] args) {                                                                      
        FileInputStream archivo = null;
        DataInputStream entrada = null;
        int entero;
        try {
            //se crea el objeto del tipo FileInputStream
            archivo = new FileInputStream("ficheros/Datos.dat");
            //se crea el objeto del tipo DataInputStream
            entrada = new DataInputStream(archivo);
            System.out.println("Inicio del fichero:");
            System.out.println("==================PRUEBA DE MODIFICACIÓN======================");
            while (true) {   
                //La clase proporciona métodos readXxx() donde Xxx es el nombre del tipo primitivo.
                entero = entrada.readInt();  //se lee  un entero del fichero                                           
                System.out.println(entero + " - ");  //se muestra en pantalla
            }
            //Cuando un método readXxx() alcanza el final del fichero lanza una excepción EOFException.
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (EOFException e) {
            System.out.println("Fin del fichero");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (archivo != null) {
                    archivo.close();
                }
                if (entrada != null) {
                    entrada.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());                                                               
            }
        }
    }
}

