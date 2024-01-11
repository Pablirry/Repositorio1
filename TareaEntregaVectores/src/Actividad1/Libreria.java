package Actividad1;

import java.util.Scanner;

public class Libreria {

    static Scanner sc = new Scanner(System.in);

    /**
     * Funcion que lee un vector de tamaño dado por teclado
     * 
     * @return : entero
     */

    public static int[] leerVector() {

        System.out.println("Introduce el tamaño del vector: ");
        int tamano = sc.nextInt();
        int v[] = new int[tamano];

        for (int i = 0; i < v.length; i++) {
            System.out.print("[" + i + "]: ");
            v[i] = sc.nextInt();
        }

        return v;

    }

    /**
     * Funcion que imprime un vector
     * 
     * @param v : entero[]
     */

    public static void imprimirVector(int v[]) {
        System.out.println("EL VECTOR ES: ");
        for (int i = 0; i < v.length; i++) {
            System.out.println("[" + i + "]:" + v[i]);
        }
    }

    /**
     * Funcion que muestra cuantas veces se ha repetido determinado valor del vector
     * 
     * @param v : entero[]
     */

    public static void mostrarRepetidos(int[] v) {
        System.out.println("Repeticiones:");

        int[] vect = new int[1001];

        for (int i = 0; i < v.length; i++) {
            vect[v[i]]++;
        }

        for (int i = 0; i < vect.length; i++) {
            if (vect[i] > 0) {
                System.out.println("El valor " + i + " aparece " + vect[i] + " veces.");
            }
        }
    }

    /**
     * Funcion que calcula los numero que faltan de un vector con un maximo y un
     * minimo
     * 
     * @param v : entero[]
     */

    public static void buscarAusentes(int[] v) {

        if (v.length == 0) {
            System.out.println("El vector está vacío.");
        }

        int min = v[0];
        int max = v[0];

        for (int i = 1; i < v.length; i++) {
            if (v[i] < min) {
                min = v[i];
            }
            if (v[i] > max) {
                max = v[i];
            }
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);

        System.out.print("Faltan (");
        int i = min + 1;
        while (i < max) {
            boolean presente = false;

            int j = 0;
            while (j < v.length) {
                if (i == v[j]) {
                    presente = true;
                    break;
                }
                j++;
            }

            if (!presente) {
                System.out.print(i);
                if (i < max - 1) {
                    System.out.print(",");
                }
            }
            i++;
        }
        System.out.println(")");
    }

    /**
     * Funcion que calcula el promedio de un vector entero
     * 
     * @param v : entero[]
     * @return : entero
     */

    public static int promedio(int[] v) {
        if (v.length == 0) {
            System.out.println("El vector está vacío");

        }

        int min = v[0];
        int max = v[0];

        for (int i = 1; i < v.length; i++) {
            if (v[i] < min) {
                min = v[i];
            }
            if (v[i] > max) {
                max = v[i];
            }
        }

        int promedio = (min + max) / 2;
        int valor = v[0];

        for (int i = 1; i < v.length; i++) {
            if (Math.abs(promedio - v[i]) < Math.abs(promedio - valor)) {
                valor = v[i];
            }
        }

        return valor;
    }

}
