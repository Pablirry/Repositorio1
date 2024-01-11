package EjerciciosRepaso2;

import java.util.Scanner;

public class Ejercicio_16 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("MAYORES QUE EL PRIMERO");

        /*
         * Escriba un programa que pregunte cuántos números se van a introducir, pida
         * esos números, y muestre un mensaje cada vez que un número no sea mayor que el
         * primero.
         */

        System.out.print("¿Cuántos valores va a introducir? ");
        int valores = sc.nextInt();

        if (valores < 1) {
            System.out.println("¡Imposible!");
        } else {
            System.out.print("Escriba un número: ");
            int primero = sc.nextInt();

            for (int i = 0; i < valores - 1; i++) {
                System.out.print("Escriba un número más grande que " + primero + ": ");
                int n = sc.nextInt();

                if (n <= primero) {
                    System.out.println("¡" + n + " no es mayor que " + primero + "!");
                    i--; // Restablecer la iteración actual para volver a solicitar el número.
                } else {
                    primero = n; // Actualizar el valor de "primero" al valor ingresado
                }
            }

            System.out.println("Gracias por su colaboración.");
        }
    }

}
