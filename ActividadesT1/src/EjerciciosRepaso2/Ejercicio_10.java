package EjerciciosRepaso2;

import java.util.Scanner;

public class Ejercicio_10 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("CADA VEZ MÃ?S GRANDES");

        /*
         * Escriba un programa que pida nÃºmeros enteros mientras sean cada vez mÃ¡s
         * grandes.
         */

        System.out.print("Escriba un nÃºmero: ");
        int numAnt = sc.nextInt();

        while (true) {
            System.out.print("Escriba un nÃºmero mayor que " + numAnt + ": ");
            int n = sc.nextInt();
            if (n <= numAnt) {
                System.out.println(n + " no es mayor que " + numAnt);
                break;
            }
            numAnt = n;
        }

    }

}
