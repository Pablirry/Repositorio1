package EjerciciosRepaso2;

import java.util.Scanner;

public class Ejercicio_2 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        /*
         * Escriba un programa que pida una cantidad de segundos y que escriba cuántos
         * minutos y segundos son.
         */

        System.out.println("Introduce los segundos: ");
        int seg = sc.nextInt();

        if (seg < 0) {
            System.out.println("Segundos no válidos.");
        } else {
            int mins = seg / 60;
            int segRest = seg % 60;

            System.out.println(seg + " segundos equivalen a: " + mins + " minutos y " + segRest + " segundos.");
        }

    }

}
