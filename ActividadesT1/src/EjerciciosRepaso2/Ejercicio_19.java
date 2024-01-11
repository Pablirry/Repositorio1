package EjerciciosRepaso2;

import java.util.Scanner;

public class Ejercicio_19 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("SUMA DE VALORES");

        /*
         * Escriba un programa que pregunte cuantos números se van a introducir, pida
         * esos números (que puedan ser decimales) y calcule su suma.
         */

        int cant = 0;

        if (cant <= 0) {
            System.out.print("¿Cuántos valores va a introducir? ");
            cant = sc.nextInt();

            while (cant < 0) {
                System.out.println("¡Imposible! Introduce otro: ");
                cant = sc.nextInt();
            }
            if (cant > 0) {
                double suma = 0;
                for (int i = 1; i <= cant; i++) {
                    System.out.print("Escriba el valor " + i + ": ");
                    double n = sc.nextDouble();
                    suma = suma + n;
                }
                System.out.println("La suma de los números que ha escrito es " + suma);

            }

        }
        System.out.println("Gracias por su colaboración.");

    }

}
