package Actividad4_Repaso;

public class Libreria {

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

    public static void secuencia(int[] v) {
        int longActual = 1;
        int posIncio = 0;
        int maxLong = 1;
        int maxPosIncio = 0;

        for (int i = 1; i < v.length; i++) {
            if (v[i] > v[i - 1]) {
                longActual++;
            } else {
                if (longActual > maxLong) {
                    maxLong = longActual;
                    maxPosIncio = posIncio;
                }
                longActual = 1;
                posIncio = i;
            }
        }
        if (longActual > maxLong) {
            maxLong = longActual;
            maxPosIncio = posIncio;
        }
        System.out.println(
                "La secuencia mas larga es de longitud " + maxLong + " y comienza en la posicion " + maxPosIncio);

    }

}
