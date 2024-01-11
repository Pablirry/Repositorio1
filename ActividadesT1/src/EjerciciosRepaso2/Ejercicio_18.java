package EjerciciosRepaso2;

import java.util.Scanner;

public class Ejercicio_18 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("CONTADOR DE PARES E IMPARES");

        /*
         * Escriba un programa que pregunte cuántos números se van a introducir, pida
         * esos números, y diga al final cuántos han sido pares y cuántos impares.
         */

        System.out.print("¿Cuántos valores va a introducir? ");
        int cant = sc.nextInt();

        while (cant < 0) {
            System.out.println("¡Imposible! Introduce otro: ");
            cant = sc.nextInt();
            if (cant > 0) {
                int pares = 0;
                for (int i = 1; i <= cant; i++) {
                    System.out.print("Escriba el valor " + i + ": ");
                    int n = sc.nextInt();
                    if (n % 2 == 0) {
                        pares++;
                    }

                }
                System.out.println("Ha escrito " + pares + " números pares y " + (cant - pares) + " números impares.");
                System.out.println("Gracias por su colaboración.");
            }

        }

    }

}
