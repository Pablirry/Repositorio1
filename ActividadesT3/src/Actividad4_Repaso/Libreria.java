package Actividad4_Repaso;

import java.util.Scanner;

public class Libreria {

    static Scanner sc = new Scanner(System.in);

    /**
     * Inserta un valor en el vector
     * 
     * @param v     : entero[]
     * @param valor : entero
     * @param pos   : entero
     */

    public static void insertaValor(int[] v, int valor, int pos) {
        if (pos < 0 || pos >= v.length) {
            System.out.println("ERROR fuera de rango");
            return;
        }
        for (int i = v.length - 2; i >= pos; i--) {
            v[i + 1] = v[i];
        }
        v[pos] = valor;

    }

    /**
     * Funcion para mostrar un vector
     * 
     * @param v : entero[]
     */

    public static void mostrarVector(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.print("[" + i + "]:" + v[i] + " ");
        }
        System.out.println();

    }

    /**
     * Funcion que realiza la búsqueda de una secuencia en orden creciente más larga
     * 
     * @param v : entero[]
     */

    public static void calcularSecuencia(int[] v) {

        int longMax = Integer.MIN_VALUE;
        int posIncioMax = 0;
        for (int i = 0; i < v.length - 1; i++) {
            if (v[i] < v[i + 1]) {
                int longitud = 1;
                int posIncio = i;
                while (i < v.length - 1 && v[i] < v[i + 1]) {
                    longitud++;
                    i++;
                }
                if (longitud > longMax) {
                    longMax = longitud;
                    posIncioMax = posIncio;
                }
            }
        }
        if (longMax == Integer.MIN_VALUE) {
            System.out.println("Secuencia no encontrada");
        } else {
            System.out.println("Secuencia encontrada de longitud " + longMax + " y desde la posicion " + posIncioMax);
        }

    }

    /**
     * Funcion para comparar 2 cadenas de ADN y verificar si son iguales
     * 
     * @param cadenaADN1 : caracter[]
     * @param cadenaADN2 : caracter[]
     * @return : boolean
     */

    public static boolean compararADN(char[] sec1, char[] sec2) {

        for (int i = 0; i < sec2.length; i++) {
            if (sec2[i] == sec1[0]) {
                int indexSec1 = 0;
                int indexSec2 = i;
                while (indexSec1 < sec1.length && sec1[indexSec1] == sec2[indexSec2]) {
                    indexSec1++;
                    indexSec2++;
                    if (indexSec2 == sec2.length) {
                        indexSec2 = 0;
                    }
                }

                if (indexSec1 == sec1.length) {
                    return true;
                }
            }

        }
        return false;

    }

    public static int[] generarBaraja() {
        int v[] = new int[40];
        int pos = 0;
        for (int veces = 1; veces <= 4; veces++) {
            for (int valor = 1; valor <= 7; valor++) {
                v[pos] = valor;
                pos++;
            }

            for (int valor = 10; valor <= 12; valor++) {
                v[pos] = valor;
                pos++;
            }
        }
        return v;
    }

    public static void mostrarBaraja(int[] v) {
        for (int i = 0; i < v.length; i++) {
            if (i % 10 == 0) {
                System.out.println();
            }
            System.out.print(v[i] + " ");
        }
    }

    /**
     * Funcion para rellenar una matriz en columnas impares con 11 y en filas pares
     * con 10 y el resto 0
     * 
     * @param m : entero [][]
     */

    public static void rellenarMatriz(int[][] m) {
        int filas = m.length;
        int columnas = m[0].length;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {

                if (i % 2 == 0) {
                    m[i][j] = 10;
                } else if (j % 2 != 0) {
                    m[i][j] = 11;
                } else {
                    m[i][j] = 0;
                }

            }
        }
    }

    /**
     * funcion que muestra los valores de una matriz por filas
     * 
     * @param m : entero[][]
     */
    public static void mostrarMatriz(int m[][]) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print(m[i][j] + "\t");
                // \t sirve para que salga tabulada
            }
            System.out.println();
        }
    }

    /**
     * Funcion para ingresar las notas de un estudiante en una matriz
     * 
     * @param notas : double[][]
     */

    public static void ingresarNotas(double[][] notas) {

        for (int i = 0; i < notas.length; i++) {
            System.out.println("\nIngrese las notas del estudiante " + (i + 1) + ":");
            for (int j = 0; j < notas[i].length; j++) {
                System.out.print("Ingrese la nota de la asignatura " + (j + 1) + ": ");
                notas[i][j] = sc.nextDouble();
            }
        }
    }

    public static double[] calcularMediasEstudiantes(double[][] notas) {
        double[] mediasEstudiantes = new double[notas.length];

        for (int i = 0; i < notas.length; i++) {
            double suma = 0;
            for (int j = 0; j < notas[i].length; j++) {
                suma += notas[i][j];
            }
            mediasEstudiantes[i] = suma / notas[i].length;
        }

        return mediasEstudiantes;
    }

    public static void mostrarEstudianteConMayorYMenorMedia(double[] mediasEstudiantes) {
        int estudianteMayorMedia = 0;
        int estudianteMenorMedia = 0;

        for (int i = 1; i < mediasEstudiantes.length; i++) {
            if (mediasEstudiantes[i] > mediasEstudiantes[estudianteMayorMedia]) {
                estudianteMayorMedia = i;
            }

            if (mediasEstudiantes[i] < mediasEstudiantes[estudianteMenorMedia]) {
                estudianteMenorMedia = i;
            }
        }

        System.out.println("\nEstudiante con mayor media: estudiante " + (estudianteMayorMedia + 1));
        System.out.println("Estudiante con menor media:  estudiante " + (estudianteMenorMedia + 1));

    }

    public static void mostrarEstudianteConMenorNota(double[][] notas) {

        int estudianteConMenorNota = 0;
        int asignaturaConMenorNota = 0;

        for (int i = 0; i < notas.length; i++) {
            for (int j = 1; j < notas[i].length; j++) {
                if (notas[i][j] < notas[estudianteConMenorNota][asignaturaConMenorNota]) {
                    estudianteConMenorNota = i;
                    asignaturaConMenorNota = j;
                }
            }
        }

        System.out.println(
                "\nEstudiante con menor nota en alguna asignatura: estudiante " + (estudianteConMenorNota + 1));
        System.out.println("Asignatura: " + (asignaturaConMenorNota + 1));
        System.out.println("Nota: " + notas[estudianteConMenorNota][asignaturaConMenorNota]);

    }

    public static void mostrarEstudianteConMayorNotaAsignatura(double[][] notas, int asignatura) {

        int estudianteConMayorNota = 0;

        for (int i = 1; i < notas.length; i++) {
            if (notas[i][asignatura] > notas[estudianteConMayorNota][asignatura]) {
                estudianteConMayorNota = i;
            }
        }

        System.out.println("\nEstudiante con mayor nota en la asignatura " + (asignatura + 1) + ": estudiante "
                + (estudianteConMayorNota + 1));
        System.out.println("Nota: " + notas[estudianteConMayorNota][asignatura]);
    }

    public static void mostrarMediaAsignatura(double[][] notas, int asignatura) {

        double suma = 0;

        for (int i = 0; i < notas.length; i++) {
            suma += notas[i][asignatura];
        }

        double media = suma / notas.length;

        System.out.println("\nMedia de la asignatura " + (asignatura + 1) + ": " + media);
    }

    public static boolean esMatrizMagica(int[][] matriz) {

        int n = matriz.length;

        // Calcular la suma de la primera fila para comparar con otras filas y columnas
        int sumaPrimeraFila = sumaFila(matriz, 0);

        // Verificar la suma de cada fila
        for (int i = 1; i < n; i++) {
            if (sumaFila(matriz, i) != sumaPrimeraFila) {
                return false;
            }
        }

        // Verificar la suma de cada columna
        for (int j = 0; j < n; j++) {
            if (sumaColumna(matriz, j) != sumaPrimeraFila) {
                return false;
            }
        }

        // Verificar la suma de la diagonal principal
        if (sumaDiagonalPrincipal(matriz) != sumaPrimeraFila) {
            return false;
        }

        // Verificar la suma de la diagonal secundaria
        if (sumaDiagonalSecundaria(matriz) != sumaPrimeraFila) {
            return false;
        }

        // Si pasa todas las verificaciones, la matriz es mágica
        return true;
    }

    // Función para calcular la suma de una fila
    public static int sumaFila(int[][] matriz, int fila) {
        int suma = 0;
        for (int j = 0; j < matriz.length; j++) {
            suma += matriz[fila][j];
        }
        return suma;
    }

    // Función para calcular la suma de una columna
    public static int sumaColumna(int[][] matriz, int columna) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[i][columna];
        }
        return suma;
    }

    // Función para calcular la suma de la diagonal principal
    public static int sumaDiagonalPrincipal(int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[i][i];
        }
        return suma;
    }

    // Función para calcular la suma de la diagonal secundaria
    public static int sumaDiagonalSecundaria(int[][] matriz) {
        int n = matriz.length;
        int suma = 0;
        for (int i = 0; i < n; i++) {
            suma += matriz[i][n - 1 - i];
        }
        return suma;
    }

}
