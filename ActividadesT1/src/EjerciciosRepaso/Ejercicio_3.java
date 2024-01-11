package EjerciciosRepaso;

import java.util.Scanner;

public class Ejercicio_3 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        /*
         * Escribir un programa que pida al usuario un número entero positivo y muestre
         * por pantalla la cuenta atrás
         * desde ese número hasta cero separados por comas
         */

        System.out.println("Introduce un número positivo: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("numero no valido. Introduce un numero entero positivo.");
        } else {
            System.out.println("Cuenta atrás desde " + n + " hasta 0: ");
            for (int i = n; i >= 0; i--) {
                System.out.print(i);
                if (i > 0) {
                    System.out.print(", ");
                }
            }
        }

    }

}
