package EjerciciosRepaso3;

import java.util.Scanner;

public class Ejercicio_3 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        /*
         * Escriba un programa en Java que solicite números al usuario hasta que se
         * hayan introducido 10 números o la suma de todos los números leídos sea mayor
         * que 100. A continuación mostrar un mensaje indicando qué condición se ha
         * cumplido (es decir, si se han introducido 10 números o si su suma es mayor
         * que 100).
         */

        int cont = 0;
        int suma = 0;

        while (cont < 10 && suma <= 100) {
            System.out.println("Introduce un numero: ");
            int n = sc.nextInt();
            suma += n;
            cont++;
        }

        if (cont == 10)
            System.out.println("Se han introducido 10 numeros");
        else
            System.out.println("La suma de los numeros introducidos es mayor que 100");

    }

}
