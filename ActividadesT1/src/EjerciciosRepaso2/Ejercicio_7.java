package EjerciciosRepaso2;

import java.util.Scanner;

public class Ejercicio_7 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        /*
         * Escriba un programa que pida el año actual y un año cualquiera y que escriba
         * cuántos años han pasado desde ese año o cuántos años faltan para llegar a ese
         * año.
         */

        System.out.println("¿En qué año estamos?");
        int anyo = sc.nextInt();
        System.out.println("Escriba un año cualquiera: ");
        int ano = sc.nextInt();

        if (ano > anyo) {
            int anosRest = ano - anyo;
            System.out.println("Para llegar al año " + ano + " faltan " + anosRest + " años");
        } else if (ano < anyo) {
            int anosPas = anyo - ano;
            System.out.println("Desde el año " + ano + " han pasado " + anosPas + " años");
        } else {
            System.out.println("¡Son el mismo año!");
        }
    }

}
