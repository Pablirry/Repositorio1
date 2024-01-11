package EjerciciosRepaso;

import java.util.Scanner;

public class Ejercicio_1 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        /*
         * Escribir un programa que pregunte al usuario su edad y muestre por pantalla
         * todos los años
         * que ha cumplido (desde 1 hasta su edad).
         */

        System.out.println("Introduce una edad: ");
        int edad = sc.nextInt();

        int ano = 2023 - edad;
        while (ano <= 2023) {
            System.out.println(ano);
            ano++;
        }
    }

}
