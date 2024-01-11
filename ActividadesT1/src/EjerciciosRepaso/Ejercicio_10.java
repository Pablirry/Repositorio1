package EjerciciosRepaso;

public class Ejercicio_10 {

    public static void main(String[] args) {

        /*
         * mostrar las letras del abecedario (sin la Ñ) en mayúsculas y en orden
         * inverso. A continuación en cada fila mostrar una letra menos hasta llegar a
         * mostrar solamente la A.
         */

        for (char abec = 'Z'; abec >= 'A';) {
            for (char c = abec; c >= 'A'; c--) {
                System.out.print(c);
            }
            System.out.println();
            abec--;
        }

    }

}
