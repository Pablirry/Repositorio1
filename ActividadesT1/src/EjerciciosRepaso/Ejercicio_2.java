package EjerciciosRepaso;

import java.util.Scanner;

public class Ejercicio_2 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        /*
         * Escribir un programa que pida al usuario un numero entero positivo y muestre
         * por pantalla todos
         * los numeros impares desde 1 hasta ese numero separados por comas.
         */

        System.out.print("Introduce un número entero positivo: ");
        int n = sc.nextInt();

        System.out.println("Numeros impares hasta " + n + ": ");

        if (n > 0) {
            int cont = 1;

            while (cont <= n) {
                if (cont % 2 != 0) {
                    System.out.print(cont);

                    // Coma solo si no es el último número impar
                    if (cont < n - 1) {

                        System.out.print(", ");
                    }
                }

                cont++;
            }

            System.out.println(); // Salto de línea al final
        } else {
            System.out.println("Número no válido. ");
        }

    }

}
