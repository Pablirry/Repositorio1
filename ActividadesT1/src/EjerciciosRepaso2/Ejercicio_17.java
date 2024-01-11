package EjerciciosRepaso2;

import java.util.Scanner;

public class Ejercicio_17 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("NÚMEROS NEGATIVOS");

        /*
         * Escriba un programa que pregunte cuántos números se van a introducir, pida
         * esos números y escriba cuántos negativos ha introducido.
         */

        System.out.print("¿Cuántos valores va a introducir? ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("¡Imposible!");
        } else {
            int cont = 0;
            for (int i = 1; i <= n; i++) {
                System.out.print("Escriba el número " + i + ": ");
                double valor = sc.nextDouble();

                if (valor < 0) {
                    cont++;
                }
            }

            if (cont == 0) {
                System.out.println("No ha escrito ningún número negativo.");
            } else if (cont == 1) {
                System.out.println("Ha escrito 1 número negativo.");
            } else {
                System.out.println("Ha escrito " + cont + " números negativos.");
            }
        }

    }

}
