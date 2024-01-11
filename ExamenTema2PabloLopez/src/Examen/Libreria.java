package Examen;

public class Libreria {

    /**
     * muestra si un numero es primo o no
     * 
     * @param n : entero
     * @return : boolean
     */

    public static boolean esPrimo(int n) {

        boolean primo = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                primo = false;
            }
        }
        if (primo) {
            return true;
        } else
            return false;
    }

    /**
     * Calcula el siguiente numero primo
     * 
     * @param n : entero
     * @return : entero
     */

    public static int siguientePrimo(int n) {

        int num = n + 1;

        while (true) {

            boolean esPrimo = true;

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    esPrimo = false;
                }
            }

            if (esPrimo) {
                return num;
            }

            num++;

        }
    }

    /**
     * Calcula el numero de digitos de un numero entero
     * 
     * @param n : entero
     * @return : entero
     */

    public static int digitos(int n) {

        int digitos = 0;

        while (n > 0) {
            n = n / 10;
            digitos++;
        }
        return digitos;

    }

    /**
     * Invierte un numero entero
     * 
     * @param n : entero
     * @return : entero
     */

    public static int voltea(int n) {
        int invertido = 0;

        while (n != 0) {
            int digito = n % 10;
            invertido = invertido * 10 + digito;
            n = n / 10;
        }

        return invertido;
    }

    /**
     * Indica el numero que esta en la posicion que indicas
     * 
     * @param n      : entero
     * @param digito : entero
     * @return : entero
     */

    public static int posicionDeDigito(int n, int pos) {
        int digito = 0;
        while (n > 0) {
            int digitoActual = n % 10;
            if (digitoActual == pos) {
                return digito;
            }
            n = n / 10;
            digito++;
        }
        return -1;
    }

    /**
     * Se le quita el digito de atras a un numero entero
     * 
     * @param n : entero
     * @return : entero
     */

    public static int quitaPorDetras(int n) {
        return n / 10;
    }

    /**
     * Se le quita el digito de adelante a un numero entero
     * 
     * @param n : entero
     * @return : entero
     */

    public static int quitaPorDelante(int n) {

        if (n < 10) {
            return n;
        }

        int digitos = 0;
        int num = n;

        while (num > 0) {
            num /= 10;
            digitos++;
        }

        int potencia = 1;

        for (int i = 0; i < digitos - 1; i++) {
            potencia *= 10;
        }

        return n % potencia;

    }

    /**
     * Añade un digito a un numero por detrás
     * 
     * @param n      : entero
     * @param digito : entero
     * @return : entero
     */

    public static int pegarPorDetras(int n, int digito) {

        int nuevoNumero = n;

        nuevoNumero = (nuevoNumero * 10) + digito;

        return nuevoNumero;

    }

}
