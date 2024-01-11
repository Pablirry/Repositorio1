package EjerciciosRepaso2;

import java.util.Scanner;

public class Ejercicio_15 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("PARES E IMPARES");

        /*
         * Escriba un programa que pida dos números enteros y escriba qué números son
         * pares y cuáles impares desde el primero hasta el segundo.
         */

        System.out.print("Escriba un número entero: ");
        int n1 = sc.nextInt();

        System.out.print("Escriba un número entero mayor o igual que " + n1 + ": ");
        int n2 = sc.nextInt();

        while (n2 < n1) {
            System.out.println("¡Le he pedido un número entero mayor o igual que " + n1 + "! Introduce otro: ");
            n2 = sc.nextInt();
        }
        for (int i = n1; i <= n2; i++) {
            if (i % 2 == 0) {
                System.out.println("El número " + i + " es par.");
            } else {
                System.out.println("El número " + i + " es impar.");

            }
        }

    }

}
