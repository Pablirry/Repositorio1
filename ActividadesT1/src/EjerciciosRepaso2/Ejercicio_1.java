package EjerciciosRepaso2;

import java.util.Scanner;

public class Ejercicio_1 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        /*
         * Escriba un programa que pida dos números y que escriba su media aritmética.
         * Se recuerda que la media aritmética de dos números es la suma de ambos
         * números dividida por 2.
         */

        System.out.println("Introduce un numero: ");
        double n1 = sc.nextDouble();
        System.out.println("Introduce otro numero: ");
        double n2 = sc.nextDouble();

        if (n1 < 0 || n2 < 0) {
            System.out.println("Los numeros no pueden ser negativos");
        } else {
            double media = (n1 + n2) / 2.0;
            System.out.println("La media de " + n1 + " y " + n2 + " es " + media);
        }

    }

}
