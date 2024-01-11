package Actividad1;

import java.util.Random;
import java.util.Scanner;

public class Libreria {

    static Scanner sc = new Scanner(System.in);

    /**
     * funcion que muestra los valores de un vector
     * 
     * @param v : entero[]
     */
    public static void mostrarVector(int v[]) {
        for (int i = 0; i < v.length; i++) {
            System.out.println("[" + i + "]:" + v[i]);
        }
    }

    /**
     * Funcion para leer un vector por teclado
     * 
     * @param v : entero[]
     */

    public static void leerVector(int v[]) {
        for (int i = 0; i < v.length; i++) {
            System.out.print("[" + i + "]: ");
            v[i] = sc.nextInt();
        }
    }

    /**
     * Muestra el contenido del vector en orden inverso
     * 
     * @param v : entero[]
     */

    public static void mostrarVectorInverso(int v[]) {

        for (int i = 9; i >= 0; i--) {
            System.out.println("[" + i + "] = " + v[i]);
        }

    }

    /**
     * Calcula la suma de los elementos del vector
     * 
     * @param v : entero[]
     * @return : entero
     */

    public static int suma(int v[]) {

        int suma = 0;
        /*
         * for (int valor : v) {
         * suma = suma + valor;
         * }
         */
        for (int i = 0; i < v.length; i++) {
            suma = suma + v[i];
        }

        return suma;

    }

    /**
     * Calcula el numero mas alto del vector
     * 
     * @param v : entero[]
     * @return : entero
     */

    public static int max(int v[]) {

        if (v.length == 0) {
            System.out.println("El vector está vacío");
        }

        int max = v[0];

        for (int i = 1; i < v.length; i++) {
            if (v[i] > max) {
                max = v[i];
            }
        }
        return max;
    }

    /**
     * Calcula la suma de los valores pares del vector
     * 
     * @param v : entero[]
     * @return : entero
     */

    public static int sumaNumerosPares(int v[]) {

        int sumaPares = 0;

        // for (int valor : v) {
        for (int i = 0; i < v.length; i++) {
            if (v[i] % 2 == 0) {
                sumaPares = sumaPares + v[i];
            }
        }

        return sumaPares;

    }

    /**
     * Calcula la suma de los valores almacenados en las posiciones impares del
     * vector
     * 
     * @param v : entero[]
     * @return : entero
     */

    public static int sumaPosicionesImpares(int v[]) {
        int sumaImpares = 0;
        for (int i = 0; i < v.length; i++) {
            if (i % 2 != 0) {
                sumaImpares = sumaImpares + v[i];
            }
        }
        return sumaImpares;
    }

    /**
     * Calcula la varianza de un vector
     * 
     * @param v : entero []
     * @return : double
     */

    public static double varianzaVector(int v[]) {
        int suma = 0;
        for (int i = 0; i < v.length; i++) {
            suma = suma + (v[i] * v[i]);
        }
        double resul = suma / v.length;
        return resul;
    }

    /**
     * Funcion que calcula la mediana de un vector.
     * 
     * @param vector : entero[]
     * @return :entero
     */

    public static int medianaVector(int vector[]) {

        // Implementación de un algoritmo de ordenación simple (por ejemplo, burbuja)
        for (int i = 0; i < vector.length - 1; i++) {
            for (int j = 0; j < vector.length - i - 1; j++) {
                if (vector[j] > vector[j + 1]) {
                    // Intercambiar elementos si están en el orden incorrecto
                    int temp = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = temp;
                }
            }
        }

        // Calculamos la longitud del vector
        int n = vector.length;

        // Verificamos si la longitud es par o impar
        if (n % 2 == 0) {
            // Si es par, promedio de los dos valores centrales
            return ((vector[n / 2 - 1] + vector[n / 2]) / 2);
        } else {
            // Si es impar, el valor central
            return vector[n / 2];
        }
    }

    public static int busqueda(float v[], float value) {
        for (int i = 0; i < v.length; i++) {
            if (v[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public static void ordenarVector(int v[]) {
        int n = v.length;
        boolean intercambio;

        do {
            intercambio = false;

            for (int i = 0; i < n - 1; i++) {

                if (v[i] % 2 != 0 && v[i + 1] % 2 == 0) {
                    int temp = v[i];
                    v[i] = v[i + 1];
                    v[i + 1] = temp;
                    intercambio = true;

                }
            }
        } while (intercambio);

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (v[i] % 2 != 0 && v[j] % 2 != 0 && v[i] < v[j]) {
                    int temp = v[i];
                    v[i] = v[j];
                    v[j] = temp;
                }
            }
        }
    }

    public static boolean tienePico(int v[]) {
        if (v.length < 3) {
            return false;
        }

        for (int i = 1; i < v.length - 1; i++) {
            if (v[i] > v[i - 1] && v[i] > v[i + 1]) {
                return true;
            }
        }
        return false;

    }

    public static boolean tieneValle(int v[]) {
        if (v.length < 3) {
            return false;
        }

        for (int i = 1; i < v.length - 1; i++) {
            if (v[i] < v[i - 1] && v[i] < v[i + 1]) {
                return true;
            }
        }

        return false;
    }

    public static int buscarValor(int v[], int valor) {

        int cont = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] == valor) {
                cont++;

            }
        }
        return cont;
    }

    public static int[] generarVectorAleatorio(int tamano) {
        int vector[] = new int[tamano];
        Random rand = new Random();
        for (int i = 0; i < tamano; i++) {
            vector[i] = rand.nextInt(10) + 1;
        }
        return vector;
    }

    public static void imprimirVector(int v[]) {
        System.out.print("[ ");
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println("]");

    }

    /**
     * Calcula la media del vector
     * @param contVeces : entero[]
     * @return : entero
     */

    public static int calcularMedia(int[] contVeces) {
        int suma = 0;
        for(int i = 0; i < contVeces.length;i++){
            suma = suma + contVeces[i];
        }

        return suma/contVeces.length;
	}

    /**
     * Funcion que genera un vector aleatorio
     * @param v : entero[]
     */

	public static void generarVector(int[] v) {

        for(int i=0;i<v.length;i++){
            v[i] = (int) (Math.random()*11);
        }
	}

    /**
     * Funcion que cuenta los valores del vector
     * @param v : entero[]
     * @param valor : entero
     * @return entero
     */

    public static int contarValor(int[] v, int valor) {
        int cont = 0;
        for(int i=0;i<v.length;i++){
            if(v[i]==valor){
                cont++;
            }
        }
        return cont;
    }
}
