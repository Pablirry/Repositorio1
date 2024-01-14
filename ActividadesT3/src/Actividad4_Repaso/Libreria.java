package Actividad4_Repaso;

import java.util.Arrays;

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

    public static boolean compararADN(char[] cadenaADN1, char[] cadenaADN2) {

        if (cadenaADN1.length != cadenaADN2.length) {
            return false;
        }

        // Concatenar la cadenaADN1 consigo misma para abordar la propiedad cíclica
        char[] cadenaADNConcatenada = new char[cadenaADN1.length * 2];
        System.arraycopy(cadenaADN1, 0, cadenaADNConcatenada, 0, cadenaADN1.length);
        System.arraycopy(cadenaADN1, 0, cadenaADNConcatenada, cadenaADN1.length, cadenaADN1.length);

        // Verificar si cadenaADN2 es una subcadena de cadenaADNConcatenada
        for (int i = 0; i < cadenaADNConcatenada.length - cadenaADN2.length + 1; i++) {
            boolean coinciden = true;
            for (int j = 0; j < cadenaADN2.length; j++) {
                if (cadenaADNConcatenada[i + j] != cadenaADN2[j]) {
                    coinciden = false;
                    break;
                }
            }
            if (coinciden) {
                return true;
            }
        }

        return false;

    }

    public static int[] generarBaraja() {
        int[] baraja = new int[40];
        int cont = 0;

        for (int i = 1; i <= 7; i++) {
            for (int j = 0; j < 4; j++) {
                baraja[cont] = i;
                cont++;
            }
        }

        // Inicializar la baraja con valores

        return baraja;

    }

    public static void mezclarBaraja(int[] baraja) {

        for (int i = 0; i < baraja.length; i++) {
            int posAleatoria = (int) (Math.random() * baraja.length);
            int aux = baraja[i];
            baraja[i] = baraja[posAleatoria];
            baraja[posAleatoria] = aux;
        }

    }

    public static char elegirCarta(int pos) {
        char[] simbolos = { 'O', 'C', 'B' };
        int valor = pos % 10;

        if (valor == 8) {
            return simbolos[pos / 10 - 1];
        } else {
            return (char) (valor + '0');
        }
    }

    public static int calcularPuntuacion(int[] jugada) {

        double puntuacion = 0;

        for (int carta : jugada) {
            if (carta <= 7) {
                puntuacion += carta;
            } else {
                puntuacion += 0.5;
            }
        }

        return (int) puntuacion;
    }

    public static void jugar(int[] baraja) {
        int[] jugador = new int[5];
        int indiceJugador = 0;

        // Cada jugador elige una carta
        for (int i = 0; i < 5; i++) {
            jugador[indiceJugador] = baraja[i];
            indiceJugador++;
        }

        // Mostrar cartas del jugador
        System.out.println("Cartas del jugador: " + Arrays.toString(jugador));

        // Calcular puntuación del jugador
        double puntuacionJugador = calcularPuntuacion(jugador);
        System.out.println("Puntuación del jugador: " + puntuacionJugador);
    }

    public static void rellenarMatriz(int[][] m) {
        int filas = m.length;
        int columnas = m[0].length;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {

                if(i%2==0){
                    m[i][j]=10;
                }
                else if(j%2!=0){
                    m[i][j]=11;
                }
                else{
                    m[i][j]=0;
                }

            }
        }
    }

    /**
     * funcion que muestra los valores de una matriz por filas
     * 
     * @param m matriz de enteros
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


}
