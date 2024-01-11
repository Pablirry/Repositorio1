package EjerciciosRepaso;

import java.util.Scanner;

public class Ejercicio_5b {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        /*
         * Escribir un programa que pida al usuario un número entero y muestre por
         * pantalla un triángulo rectángulo invertido, de altura el número
         * introducido.
         */

        System.out.println("Introduce un numero entero: ");
        int n = sc.nextInt();

        while (n <= 0) {
            System.out.println("Número no válido. Introduce otro: ");
            n = sc.nextInt();
        }

        for (int i = n; i >= 1; i--) {
            System.out.println();
            for (int j = i; j >= 1; j--) {
                System.out.print("* ");
            }
        }
    }

}
