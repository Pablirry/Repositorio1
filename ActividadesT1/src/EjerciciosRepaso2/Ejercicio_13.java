package EjerciciosRepaso2;

import java.util.Scanner;

public class Ejercicio_13 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("ENTRE DOS VALORES");

        /*
         * Escriba un programa que pida primero dos números enteros (mínimo y máximo) y
         * que después pida números enteros situados entre ellos. El programa terminará
         * cuando se escriba un número que no esté comprendido entre los dos valores
         * iniciales. El programa termina escribiendo la cantidad de números escritos.
         */

        System.out.print("Escriba un número: ");
        int min = sc.nextInt();

        System.out.print("Escriba un número mayor que " + min + ": ");
        int max = sc.nextInt();

        while (min >= max) {
            System.out.print(max + " no es mayor que " + min + ". Inténtelo de nuevo: ");
            max = sc.nextInt();
        }

        System.out.println();
        System.out.print("Escriba un número entre " + min + " y " + max + ": ");
        double numero = sc.nextDouble();
        int contador = 0;

        while (min <= numero && numero <= max) {
            contador++;
            System.out.print("Escriba otro número entre " + min + " y " + max + ": ");
            numero = sc.nextDouble();
        }

        System.out.println();
        if (contador == 0) {
            System.out.println("No ha escrito ningún número entre " + min + " y " + max + ".");
        } else if (contador == 1) {
            System.out.println("Ha escrito 1 número entre " + min + " y " + max + ".");
        } else {
            System.out.println("Ha escrito " + contador + " números entre " + min + " y " + max + ".");
        }
    }

}
