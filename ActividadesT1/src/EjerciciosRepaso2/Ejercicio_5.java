package EjerciciosRepaso2;

import java.util.Scanner;

public class Ejercicio_5 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        /*
         * Mejorar el programa anterior para que tenga en cuenta si el divisor es cero,
         * que muestre un mensaje indicando que no se puede dividir
         */

        System.out.print("Introduce el dividendo: ");
        int dividendo = sc.nextInt();

        System.out.print("Introduce el divisor: ");
        int divisor = sc.nextInt();

        if (divisor != 0) {
            if (dividendo % divisor == 0) {
                System.out.println("La división es exacta.");
                System.out.println("Cociente= " + dividendo / divisor);
            } else {
                System.out.println("La división no es exacta.");
                System.out.println("Cociente= " + dividendo / divisor);
                System.out.println("Resto= " + dividendo % divisor);
            }
        } else {
            System.out.println("No se puede dividir por 0");
        }
    }

}
