package EjerciciosRepaso2;

import java.util.Scanner;

public class Ejercicio_6 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        /*
         * Escribir un programa que pida dos números reales por teclado y determine cual
         * es el menor y cual es el mayor o escriba si son iguales
         */

        System.out.println("Introduce un número: ");
        double n1 = sc.nextDouble();
        System.out.println("Introduce otro número: ");
        double n2 = sc.nextDouble();

        if (n1 > n2) {
            System.out.println("Menor: " + n2 + "; Mayor: " + n1);

        } else if (n2 > n1) {
            System.out.println("Menor: " + n1 + "; Mayor: " + n2);
        } else {
            System.out.println("Los dos números son iguales.");
        }

    }

}
