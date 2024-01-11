package Actividad1;

import java.util.Scanner;

public class Libreria {

    static Scanner sc = new Scanner(System.in);

    /**
     * Función para leer las dimensiones y valores de la matriz
     * 
     * @param m : entero[][]
     */

    public static void leerMatriz(int[][] m) {
        System.out.print("Número de filas: ");
        int filas = sc.nextInt();
        System.out.print("Número de columnas: ");
        int columnas = sc.nextInt();

        m = new int[filas][columnas];

        System.out.println("Ingrese los valores de la matriz:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("[" + i + "][" + j + "]: ");
                m[i][j] = sc.nextInt();
            }
        }

    }

    /**
     * Función para verificar si una matriz es MCCUD
     * 
     * @param m : entero[][]
     * @return boolean
     */
    public static boolean mccud(int[][] m) {
        for (int i = 0; i < m.length - 1; i++) {
            if (!todosDistintos(m[i]) || maximo(m[i]) >= maximo(m[i + 1]) || posMax(m[i]) == posMax(m[i + 1]))
                return false;
        }
        return true;
    }

    /**
     * Función para verificar si todos los elementos de una fila son distintos
     * 
     * @param m : entero[]
     * @return : boolean
     */
    public static boolean todosDistintos(int[] m) {
        for (int i = 0; i < m.length - 1; i++) {
            for (int j = i + 1; j < m.length; j++) {
                if (m[i] == m[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Función para obtener el máximo de una fila
     * 
     * @param m : entero[]
     * @return : entero
     */
    public static int maximo(int[] m) {
        int max = m[0];
        for (int i = 1; i < m.length; i++) {
            if (m[i] > max) {
                max = m[i];
            }
        }
        return max;
    }

    /**
     * Función para obtener la posición del máximo
     * 
     * @param m : entero[]
     * @return : entero
     */
    public static int posMax(int[] m) {
        int max = m[0];
        int pos = 0;
        for (int i = 1; i < m.length; i++) {
            if (m[i] > max) {
                max = m[i];
                pos = i;
            }
        }
        return pos;
    }

    /**
     * Función para imprimir la matriz por pantalla
     * 
     * @param m : entero[][]
     */
    public static void imprimeMatriz(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }

}