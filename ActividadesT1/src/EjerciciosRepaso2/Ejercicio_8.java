package EjerciciosRepaso2;

import java.util.Scanner;

public class Ejercicio_8 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        /*
         * Escriba un programa que pida dos números enteros y que escriba si el mayor es
         * múltiplo del menor.
         */

        System.out.println("COMPARADOR DE MÚLTIPLOS");

        System.out.println("Escriba un número: ");
        int n1 = sc.nextInt();
        System.out.println("Escriba otro número: ");
        int n2 = sc.nextInt();

        int mayor, menor;

        if (n1 > n2) {
            mayor = n1;
            menor = n2;
        } else {
            mayor = n2;
            menor = n1;
        }

        if (mayor % menor == 0) {
            System.out.println(mayor + " es múltiplo de " + menor);
        } else {
            System.out.println(mayor + " no es múltiplo de " + menor);
        }

    }

}
