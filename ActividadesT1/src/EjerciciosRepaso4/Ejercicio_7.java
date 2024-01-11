package EjerciciosRepaso4;

import java.util.Scanner;

public class Ejercicio_7 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		/*
		 * Vamos a diseñar una calculadora que se enciende y hasta que no tecleamos -1
		 * no se apaga.
		 * Esta calculadora funciona de la siguiente manera:
		 * Recogemos los datos A y B
		 * Si operación es 1 calcula la raíz cuadrada de la suma de A y B
		 * Si operación es 2 calcula A / B. Vigilamos que B no sea 0...
		 * Si la operación es 3 calculamos la siguiente fórmula: ( A * B ) / 2.5
		 */

		// Pedir valores A y B
		System.out.println("Introduce el valor de A: ");
		double A = sc.nextInt();
		System.out.println("introduce el valor de B: ");
		double B = sc.nextInt();

		// opciones
		int opcion = 0;
		while (opcion != -1) {
			System.out.println("Que operación te gustaría hacer:");
			System.out.println("1. Calcular la raíz cuadrada de la suma de A y B");
			System.out.println("2. Calcular A / B.");
			System.out.println("3. Calcular la siguiente fórmula: ( A * B ) / 2.5");
			System.out.println("-1. Salir");
			opcion = sc.nextInt(); // Pedir opcion por teclado

			// Si ponemos la opcioon 1
			if (opcion == 1) {

				double raiz = Math.sqrt(A + B); // raiz de A+B
				System.out.println("La raíz cuadrada de la suma de A y B es: " + raiz);

			} else if (opcion == 2) { // opcion 2

				double division = A / B; // A / B
				System.out.println("La division de A y B es: " + division);

			} else if (opcion == 3) { // opcion 3

				double formula = (A * B) / 2.5; // formula
				System.out.println("La fórmula es: " + formula);

			}

			if (opcion == -1) { // opcion -1 salir del programa
				System.out.println("Saliendo");
			}

		}

	}
}
