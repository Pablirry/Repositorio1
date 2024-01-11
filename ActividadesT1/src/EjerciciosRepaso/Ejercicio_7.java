package EjerciciosRepaso;

public class Ejercicio_7 {

    public static void main(String[] args) {

        /*
         * Escribir una función que muestre las permutaciones con repetición que pueden
         * hacerse con los números 1,2,3 y 4. También que muestre el número de estas.
         */

        int count = 0;

        for (int num1 = 1; num1 <= 4; num1++) {
            for (int num2 = 1; num2 <= 4; num2++) {
                for (int num3 = 1; num3 <= 4; num3++) {
                    for (int num4 = 1; num4 <= 4; num4++) {
                        count++;
                        System.out.println("Permutación " + count + ": " + num1 + " " + num2 + " " + num3 + " " + num4);
                    }
                }
            }
        }

        System.out.println("Número total de permutaciones con repetición: " + count);
    }

}
