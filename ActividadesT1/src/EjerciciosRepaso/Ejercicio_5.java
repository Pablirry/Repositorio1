package EjerciciosRepaso;

import java.util.Scanner;

public class Ejercicio_5 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        /*
         * Escribir un programa que pida al usuario un número entero y muestre por
         * pantalla un triángulo rectángulo, de altura el número
         * introducido.
         */

        System.out.println("Introduce un numero entero: ");
        int n = sc.nextInt();

        while (n <= 0) {
            System.out.println("Número no válido. Introduce otro: ");
            n = sc.nextInt();
        }

        for (int i = 1; i <= n; i++) {
            System.out.println();
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
        }
        System.out.println();
    }

}
