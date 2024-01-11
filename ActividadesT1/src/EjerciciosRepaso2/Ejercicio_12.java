package EjerciciosRepaso2;

import java.util.Scanner;

public class Ejercicio_12 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        /*
         * Escriba un programa que pida un valor límite positivo y a continuación
         * pida números hasta que la suma de los números introducidos supere
         * el límite inicial
         */

        System.out.print("Escriba el valor del límite: ");
        double limite = sc.nextDouble();

        while (limite <= 0) {
            System.out.print("El limite debe ser mayor que 0.Inténtelo de nuevo: ");
            limite = sc.nextDouble();
        }
        double suma = 0;

        while (suma < limite) {
            System.out.print("Escriba un número: ");
            double n = sc.nextDouble();
            suma += n;
        }

        System.out.println("Ha superado el límite, La suma de los numeros introducidos es: " + suma + ".");
    }

}
