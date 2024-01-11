package Actividad;

import java.util.Scanner;

public class Libreria {

    static Scanner sc = new Scanner(System.in);

    /**
     * Muestra un menu, pide por teclado la opcion y devuelve la opcion elegida
     * 
     * @return : entero
     */

    public static int menu() {
        int opcion;

        System.out.println("1.- numero cuñados");
        System.out.println("2.- numeros familia");
        System.out.print("Introduce opcion: ");
        opcion = sc.nextInt();

        return opcion;

    }

    /**
     * Calcula el numero de digitos de un numero
     * 
     * @param numero : entero
     * @return : entero
     */

    public static int numeroDeDigitos(int numero) {
        int contador = 0;

        if (numero == 0) {
            contador = 1;
        } else {
            while (numero != 0) {
                numero = numero / 10;
                contador++;
            }
        }

        return contador;
    }

    /**
     * Calcula el inverso de un numero
     * 
     * @param numero : entero
     * @return : entero
     */

    public static int numeroInverso(int numero) {
        int inverso = 0;
        int uDigito;

        while (numero != 0) {
            uDigito = numero % 10;
            inverso = inverso * 10 + uDigito;
            numero = numero / 10;
        }

        return inverso;
    }

    /**
     * Determina si un numero contiene un digito determinado
     * 
     * @param numero : entero
     * @param digito : entero
     * @return : boolean
     */

    public static boolean contieneDigito(int numero, int digito) {
    	
    	boolean contienes = false;

        while (numero != 0) {
            int digitoActual = numero % 10;
            if (digitoActual == digito) {
                contienes = true;
            }
            numero = numero / 10;
        }
        return contienes;

    }

}
