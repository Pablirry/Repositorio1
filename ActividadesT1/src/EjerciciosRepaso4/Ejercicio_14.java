package EjerciciosRepaso4;

import java.util.Scanner;

public class Ejercicio_14 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		/*
		 * Leer una secuencia de números hasta introducir el cero y calcular la máxima
		 * diferencia entre dos valores consecutivos
		 */

		int Anterior = -1; // Usamos -1 como un valor inicial que no se encuentra en la secuencia de
							// números
		int Actual;
		int dif_max = 0; // Inicializamos con 0
		boolean continuar = true;

		boolean primerNum = true;

		System.out.println("Ingrese una secuencia de números. Introduzca 0 para finalizar.");

		while (continuar) {
			System.out.print("Ingrese un número (o 0 para finalizar): ");
			Actual = sc.nextInt();

			if (Actual == 0) {
				continuar = false; // Cambiamos el valor de 'continuar' para salir del bucle
			}

			if (continuar && !primerNum) {
				int diferencia = Math.abs(Actual - Anterior);

				if (diferencia > dif_max) {
					dif_max = diferencia;
				}
			}

			primerNum = false;
			Anterior = Actual;
		}

		if (dif_max > 0) {
			System.out.println("La máxima diferencia entre dos valores consecutivos es: " + dif_max);
		} else {
			System.out.println("No se han ingresado números para calcular la diferencia.");
		}

	}

}
