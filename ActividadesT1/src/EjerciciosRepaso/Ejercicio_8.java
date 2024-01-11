package EjerciciosRepaso;

import java.util.Scanner;

public class Ejercicio_8 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        /*
         * Leer por teclado un número entero N no negativo y mostrar el factorial de
         * todos los números desde 0 hasta N.
         * El factorial de un número entero se expresa mediante el símbolo ‘!’ y se define de la siguiente forma:
         * Si n = 0 entonces 0! = 1
         * Si n > 0 entonces
         * n! = n * (n – 1) * (n – 2) * …. * 3 * 2 * 1
         * Por ejemplo, n = 5 entonces 5! = 5 * 4 * 3 * 2 * 1 = 120
         */

        System.out.print("Introduce un número entero positivo: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Debes introducir un número entero positivo.");
        } else {
            for (int i = 0; i <= n; i++) {
                long factorial = 1;
                for (int j = 2; j <= i; j++) {
                    factorial *= j;
                }
                System.out.println(i + "! = " + factorial);
            }
        }

    }
}