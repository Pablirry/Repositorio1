package EjerciciosRepaso;

import java.util.Scanner;

public class Ejercicio_6 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        /*
         * Escribir un programa que pida al usuario un número entero y muestre por
         * pantalla un triángulo rectángulo de números como el de más abajo.
         */

        System.out.print("Por favor, ingresa un número entero: ");
        int numero = sc.nextInt();

        if (numero <= 0) {
            System.out.println("Por favor, ingresa un número entero positivo.");
        } else {
            int valor = 1;

            for (int i = 1; i <= numero; i += 2) {
                for (int j = valor; j >= 1; j -= 2) {
                    System.out.print(j + " ");
                }
                valor += 2;
                System.out.println();
            }
        }

    }

}
