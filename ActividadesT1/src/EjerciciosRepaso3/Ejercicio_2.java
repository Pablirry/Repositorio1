package EjerciciosRepaso3;

import java.util.Scanner;

public class Ejercicio_2 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        /*
         * Escriba un programa en Java que solicite 10 números enteros positivos al
         * usuario y calcule y muestre los siguientes valores:
         * La suma de todos los números leídos.
         * La media de los números.
         * El mayor número introducido.
         * El menor número introducido.
         */

        int suma = 0;
        int mayor = 0;
        int menor = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Numero (" + i + "): ");
            int n = sc.nextInt();

            while (n <= 0) {
                System.out.println("Tiene que ser mayor que 0.");
                System.out.print("Introduce de nuevo el numero " + i + ": ");
                n = sc.nextInt();
            }

            suma += n;

            if (i == 1) {
                mayor = n;
                menor = n;
            } else {
                if (n > mayor) {
                    mayor = n;
                }
                if (n < menor) {
                    menor = n;
                }
            }
        }

        double media = suma / 10.0;

        System.out.println("La suma de los numeros introducidos es: " + suma);
        System.out.println("La media de los numeros introducidos es: " + media);
        System.out.println("El mayor de los numeros introducidos es: " + mayor);
        System.out.println("El menor de los numeros introducidos es: " + menor);

    }

}
