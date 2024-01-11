package EjerciciosRepaso2;

import java.util.Scanner;

public class Ejercicio_11 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("NÚMEROS POSITIVOS");

        /*
         * Escriba un programa que pida la cantidad de números positivos que se tienen
         * que escribir y a continuación pida números hasta que se haya escrito la
         * cantidad de números positivos indicada.
         */

        System.out.print("Escriba la cantidad de numeros positivos a escribir: ");
        int cant = sc.nextInt();

        int cont = 0;
        int contPos = 0;
        while (cant <= 0) {
            System.out.println("La cantidad tiene que ser mayor que 0. Intentelo de nuevo:  ");
            cant = sc.nextInt();
        }
        while (cont < cant) {
            System.out.print("Escriba un número: ");
            int numero = sc.nextInt();
            cont++;

            if (numero > 0) {
                contPos++;
            } else if (numero < 0) {
                System.out.println("Escriba otro numero: ");
                numero = sc.nextInt();
                cont++;
                if (numero > 0) {
                    contPos++;
                }
            }

            if (cont > cant) {
                System.out.println("Ha escrito " + cont + " números, " + contPos + " de ellos positivo.");
            } else {
                System.out.println("Has escrito " + contPos + " número positivo.");
            }
        }
    }

}
