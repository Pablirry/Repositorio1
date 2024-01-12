package Actividad2;

import java.util.Scanner;

public class Libreria {

    static Scanner sc = new Scanner(System.in);

    /**
     * Funcion que lee una matriz
     * 
     * @param m : entero[][]
     */

    public static void leerMatriz(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print("Ingrese el valor de la posicion [" + i + "][" + j + "]: ");
                m[i][j] = sc.nextInt();
            }
        }
    }

    /**
     * Funcion para mostrar una matriz
     * 
     * @param m : entero[][]
     */

    public static void mostrarMatriz(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Funcion que suma los valores por filas de una matriz
     * 
     * @param m : entero[][]
     */

    public static void sumaFilas(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            int suma = 0;
            for (int j = 0; j < m[0].length; j++) {
                suma += m[i][j];
            }
            System.out.println("[" + i + "] = " + suma);
        }

    }

    /**
     * Funcion que suma los valores por columnas de una matriz
     * 
     * @param m : entero[][]
     */

    public static void sumaColumnas(int[][] m) {
        for (int j = 0; j < m[0].length; j++) {
            int suma = 0;
            for (int i = 0; i < m.length; i++) {
                suma += m[i][j];
            }
            System.out.println("[ " + j + "] = " + suma);
        }
    }

    /**
     * Funcion que intercambia las filas y columnas de una matriz
     * 
     * @param m : entero[][]
     * @return : entero[][]
     */

    public static int[][] intercambia(int[][] m) {
        int numFilas = m.length;
        int numColumnas = m[0].length;
        int nuevaMatriz[][] = new int[numColumnas][numFilas];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                nuevaMatriz[j][i] = m[i][j];
            }
        }
        return nuevaMatriz;
    }

    /**
     * Funcion que determina si una matriz es simetrica
     * @param m : entero[][]
     * @return : boolean
     */

    public static boolean esSelectiva(int[][] m) {
        int numFilas = m.length;
        int numColumnas = m[0].length;
        if (numFilas != numColumnas) {
            return false;
        }

        for (int i = 0; i < m.length; i++) {
            if (m[i][i] != 1) {
                return false;
            }
        }
        return true;
    }

    /**
     * Función para verificar si una matriz tiene punto silla
     * 
     * @param m : entero[][]
     * @return : boolean
     */

    public static boolean tienePuntoSilla(int[][] m) {
        boolean tienePunto = false;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                int maxFila = encontrarMaximoEnFila(m, i);
                int minColumna = encontrarMinimoEnColumna(m, j);
                if(m[i][j] == maxFila && m[i][j] == minColumna){
                    System.out.println("La posición [" + i + "][" + j + "] es un punto silla");

                    tienePunto=true;
                }
            }
            
        }
        return tienePunto;

    }

    /**
     * Función auxiliar para encontrar el mínimo en una columna
     * 
     * @param m       : entero[][]
     * @param columna : entero
     * @return : entero
     */

    private static int encontrarMinimoEnColumna(int[][] m, int columna) {
        int minimo = Integer.MAX_VALUE;
        for (int i = 0; i < m.length; i++) {
            if (m[i][columna] < minimo) {
                minimo = m[i][columna];
            }
        }
        return minimo;
    }

    /**
     * Función auxiliar para encontrar el máximo en una fila
     * 
     * @param m    : entero[][]
     * @param fila : entero
     * @return : entero
     */

    private static int encontrarMaximoEnFila(int[][] m, int fila) {
        int maximo = Integer.MIN_VALUE;
        for (int j = 0; j < m[0].length; j++) {
            if (m[fila][j] > maximo) {
                maximo = m[fila][j];
            }
        }
        return maximo;
    }

    /**
     * Funcion para crear una matriz mediante la formula m[i][j]=i+j
     * @return : entero[][]
     */

    public static int[][] crearMatriz() {
        System.out.println("Introduzca la dimension de la matriz: ");
        int dimension = sc.nextInt();
        int[][] m = new int[dimension][dimension];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                m[i][j] = i + j;
            }
        }
        return m;
    }

    /**
     * Función para mostrar el triángulo superior de una matriz
     * @param matriz : entero[][]
     */
    public static void trianguloSuperior(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (j >= i) {
                    System.out.print(matriz[i][j] + " ");
                } else {
                    System.out.print("  "); // Espacios en blanco para las posiciones fuera del triángulo superior
                }
            }
            System.out.println();
        }
    }

    /**
     * Función para mostrar el triángulo inferior de una matriz
     * @param matriz : entroo[][]
     */
    public static void trianguloInferior(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (j <= i) {
                    System.out.print(matriz[i][j] + " ");
                } else {
                    System.out.print("  "); // Espacios en blanco para las posiciones fuera del triángulo inferior
                }
            }
            System.out.println();
        }
    }


    /**
     * Función para crear una matriz aleatoria de dimension impar
     * 
     * @return : entero[][]
     */
    

    public static int[][] crearMatrizReloj() {

        System.out.println("Introduce dimension: ");
        int dimension = sc.nextInt();
        
        while(dimension%2 == 0){
            System.out.println("ERROR, introduce dimension: ");
            dimension=sc.nextInt();
        }

        int [][] m = new int[dimension][dimension];
        for(int i = 0; i<m.length;i++){
            for(int j = 0; j<m[0].length;j++){
                m[i][j]= (int) (Math.random()*9)+1;
            }
        }
        return m;
    }

    /**
     * Función para mostrar el reloj de arena de una matriz
     * @param matriz : entero[][]
     */
    public static void mostrarRelojDeArena(int[][] matriz) {
        int dimension = matriz.length;

        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                if (i <= j && i + j <= dimension - 1) {
                    System.out.print(matriz[i][j] + "   ");
                } else if (i >= j && i + j >= dimension - 1) {
                    System.out.print(matriz[i][j] + "   ");
                } else {
                    System.out.print("    "); // Espacios en blanco para posiciones fuera del reloj de arena
                }
            }
            System.out.println();
        }
    }

}
