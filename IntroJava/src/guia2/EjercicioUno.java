/*
Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos.
El programa deberá después mostrar el resultado de la suma
Shift f6 
*/
package guia2;

import java.util.Scanner;

public class EjercicioUno {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos números");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        int suma = num1 + num2;
        
        System.out.println("La suma de los números es: " + suma);
    }
    
}
