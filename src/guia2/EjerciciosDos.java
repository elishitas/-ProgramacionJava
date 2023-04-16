/*
 Escribir un programa que pida tu nombre, 
lo guarde en una variable y lo muestre por pantalla.
Shift f6  
*/
package guia2;

import java.util.Scanner;

public class EjerciciosDos {
     public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese su nombre: ");
        String nombre = leer.next();

        System.out.println("Su nombre es: " + nombre);

    }
    
}
