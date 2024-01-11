package EjerciciosRepaso2;

import java.util.Scanner;

public class Ejercicio_3 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        /*
         * Escriba un programa que pida una cantidad de segundos y que escriba cuántas
         * horas, minutos y segundos son.
         */

        System.out.println("Introduce los segundos: ");
        int seg = sc.nextInt();

        if (seg < 0) {
            System.out.println("Segundos no válidos.");
        } else {
            int horas = seg / 3600;
            int segRest = seg % 3600;
            int mins = segRest / 60;
            segRest = segRest % 60;

            System.out.println(seg + " segundos equivalen a: " + horas + " horas, " + mins + " minutos y " + segRest
                    + " segundos.");
        }

    }

}
