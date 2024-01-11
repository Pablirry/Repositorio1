package EjerciciosRepaso2;

import java.util.Scanner;

public class Ejercicio_20 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        /*
         * Escriba un programa que pida dos números enteros y escriba la suma de todos
         * los enteros desde el primer número hasta el segundo.
         */

        int n1;
        while (true) {
            System.out.println("Escriba un número entero positivo: ");
            n1 = sc.nextInt();
            if (n1 > 0) {
                break; // Salir del bucle si el número es positivo.
            } else {
                System.out.println("¡Le he pedido un número entero positivo! Introduce otro: ");
            }
        }

        int n2;
        while (true) {
            System.out.println("Escriba un número entero mayor que " + n1 + ": ");
            n2 = sc.nextInt();
            if (n2 > n1) {
                break; // Salir del bucle si el número es mayor que n1.
            } else {
                System.out.println("¡Le he pedido un número entero mayor que " + n1 + "!");
            }
        }

        int suma = 0;
        for (int i = n1; i <= n2; i++) {
            suma += i;
        }

        System.out.println("La suma desde " + n1 + " hasta " + n2 + " es " + suma);
    }

}
