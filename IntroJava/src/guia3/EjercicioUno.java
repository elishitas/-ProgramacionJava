/*
/*Crear un programa que dado un número determine si es par o impar.
 */
package guia3;

import java.util.Scanner;

/**
 *
 * @author araya
 */
public class EjercicioUno {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int num = leer.nextInt();
        if (num % 2 != 0) {
      //Si el número dividido por 2 su resto NO da 0, entonces:       
            System.out.println("El número es impar");
        } else {
            System.out.println("El número es par");
        }
    }
    
}
