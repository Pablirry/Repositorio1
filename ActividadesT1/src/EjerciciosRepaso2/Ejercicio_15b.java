package EjerciciosRepaso2;

import java.util.Scanner;

public class Ejercicio_15b {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("DIVISORES");

        /*
         * Escriba un programa que pida un número entero mayor que cero y que escriba
         * sus divisores.
         */

        System.out.println("Escriba un número mayor que 0: ");
        int n = sc.nextInt();

        while (n <= 0) {
            System.out.println("Te he pedido un número mayor que 0. Introduce otro número: ");
            n = sc.nextInt();
        }
        System.out.println("Los divisores de " + n + " son: ");
        for (int divisor = 1; divisor <= n; divisor++) {
            if (n % divisor == 0) {
                System.out.println(divisor + " ");
            }
        }
        System.out.println();

    }

}
