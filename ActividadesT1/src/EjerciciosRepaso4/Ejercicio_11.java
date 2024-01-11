package EjerciciosRepaso4;

import java.util.Scanner;
import java.util.Random;

public class Ejercicio_11 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		/*
		 * Realice un menú de 2 opciones: En la opción 1: El usuario ingresa números
		 * indefinidamente, se analiza cada número ingresado. Si el número ingresado es
		 * par, se genera la tabla de multiplicar de dicho número. Si el número
		 * ingresado es impar, se generan 5 números impares aleatorios en el rango de 10
		 * a 990. En la opción 2: El usuario ingresa 2 números, se divide el menor para
		 * el mayor y se muestra el resultado. Se resta el mayor menos el menor y se
		 * muestra el resultado. Si los números son iguales, se envía un mensaje a
		 * pantalla.
		 */

		boolean continuar = true;
		Random random = new Random();

		int opcion = -1;
		System.out.println("Menú de Opciones:");

		while (continuar) {
			System.out.println("1. Generar tabla de multiplicar o números impares.");
			System.out.println("2. Operacion con dos números.");
			System.out.println("0. Salir");
			System.out.print("Seleccione una opción: ");
			opcion = sc.nextInt();

			// Opciones

			if (opcion == 1) {
				System.out.print("Ingrese un número: ");
				int n = sc.nextInt();

				if (n % 2 == 0) { // Si el número ingresado es par...
					System.out.println("Tabla de multiplicar de " + n + ":");
					for (int i = 1; i <= 10; i++) { // Tabla de multiplicar
						System.out.println(n + " x " + i + " = " + (n * i));
					}
				} else {
					System.out.println("Generando 5 números impares aleatorios:"); // Si el número ingresado es impar...
					for (int i = 0; i < 5; i++) {
						int impar = random.nextInt(491) * 2 + 10; // 5 numeros akeatorios entre 10 y 990
						System.out.println(impar);
					}
				}
			} else if (opcion == 2) {
				System.out.print("Ingrese el primer número: ");
				double n1 = sc.nextDouble();
				System.out.print("Ingrese el segundo número: ");
				double n2 = sc.nextDouble();

				if (n1 == n2) {
					System.out.println("Los números son iguales.");
				} else {
					double mayor = Math.max(n1, n2);
					double menor = Math.min(n1, n2);

					double division = mayor / menor;
					double resta = mayor - menor;

					System.out.println("Resultado de la división del mayor entre el menor: " + division);
					System.out.println("Resultado de la resta del mayor menos el menor: " + resta);
				}
			} else if (opcion == 0) {
				System.out.println("Saliendo del programa.");
				continuar = false;
			} else {
				System.out.println("Opción no válida. Intente de nuevo.");
			}
		}
	}

}
