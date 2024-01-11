package EjerciciosRepaso;

import java.util.Scanner;

public class Ejercicio_4 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        /*
         * Escribir un programa que pregunte al usuario una cantidad a invertir, el
         * interés anual y el número de años, y muestre por pantalla el capital obtenido
         * en la inversión cada año que dura la inversión.
         */

        System.out.print("Ingrese la cantidad a invertir: ");
        double cant = sc.nextDouble();

        System.out.print("Ingrese el interés anual (en porcentaje): ");
        double interesAnual = sc.nextDouble() / 100.0;

        System.out.print("Ingrese el número de años de inversión: ");
        int numAnos = sc.nextInt();

        for (int i = 1; i <= numAnos; i++) {
            double capitalObtenido = cant * (1 + interesAnual);
            System.out.println("Año " + i + ": " + capitalObtenido);
            cant = capitalObtenido;
        }

    }

}
