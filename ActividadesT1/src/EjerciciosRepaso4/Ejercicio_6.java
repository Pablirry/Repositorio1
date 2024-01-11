package EjerciciosRepaso4;

import java.util.Scanner;

public class Ejercicio_6 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		/*
		 * Tenemos la pantalla del móvil bloqueada. Partiendo de un
		 * PIN_SECRETO, intentaremos desbloquear la pantalla. Tenemos hasta 3 intentos.
		 * Simula el proceso con un programa java. En caso de acceder, lanza al usuario
		 * 'login correcto'. Sino, 'llamando al policía'.
		 */

		final int PIN_SECRETO = 1234; // Define aquí tu PIN secreto
		int intentos = 3;

		boolean PinCorrecto = false;

		while (intentos > 0 && !PinCorrecto) {
			System.out.print("Introduce tu PIN: ");
			int pin = sc.nextInt();

			if (pin == PIN_SECRETO) {
				System.out.println("Login correcto");
				PinCorrecto = true;
			} else {
				intentos--;
				System.out.println("Pin incorrecto. Quedan: " + intentos + " intentos");

				if (intentos == 0) {
					System.out.println("Pin incorrecto, llamando al policía");
				}
			}
		}
	}

}
