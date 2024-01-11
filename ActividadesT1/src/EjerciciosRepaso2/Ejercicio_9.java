package EjerciciosRepaso2;

import java.util.Scanner;

public class Ejercicio_9 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        /*
         * Escriba un programa que pida dos números enteros. El programa pedirá de nuevo
         * el segundo número mientras no sea mayor que el primero. El programa terminará
         * escribiendo los dos números.
         */

        System.out.println("NÚMERO MAYOR");

        System.out.print("Escriba un número: ");
        int n1 = sc.nextInt();
        System.out.print("Escriba un número mayor que " + n1 + ": ");
        int n2 = sc.nextInt();

        while (n1 >= n2) {
            System.out.print(n2 + " no es mayor que " + n1 + ". Inténtelo de nuevo: ");
            n2 = sc.nextInt();
        }
        System.out.println("Los números que ha escrito son " + n1 + " y " + n2);

    }

}
