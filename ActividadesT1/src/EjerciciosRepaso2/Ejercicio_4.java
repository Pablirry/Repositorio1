package EjerciciosRepaso2;

import java.util.Scanner;

public class Ejercicio_4 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        /*
         * Escribir un programa que pida dos números por teclado, el dividendo y un
         * divisor. Escribir un mensaje que determine si la división es exacta o no.
         */

        System.out.print("Introduce el dividendo: ");
        int dividendo = sc.nextInt();

        System.out.print("Introduce el divisor: ");
        int divisor = sc.nextInt();

        if (dividendo % divisor == 0) {
            System.out.println("La división es exacta.");
            System.out.println("Cociente= " + dividendo / divisor);
        } else {
            System.out.println("La división no es exacta.");
            System.out.println("Cociente= " + dividendo / divisor);
            System.out.println("Resto= " + dividendo % divisor);
        }

    }

}
