/*
Dada una cantidad de grados 
centígrados se debe mostrar su equivalente en grados Fahrenheit. 
La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package guia2;

import java.util.Scanner;

public class EjercicioCuatro {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de grados centígrados: ");
        double centigrados = leer.nextDouble();
        double F = 32 + (9 * centigrados / 5);
        System.out.println("Los grados convetidos a Fahrenheit " + F);
    }    
    
    
}
