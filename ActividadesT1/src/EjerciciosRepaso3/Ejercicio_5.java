package EjerciciosRepaso3;

import java.util.Scanner;

public class Ejercicio_5 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		/*
		 * Escribir un programa en Java que determine si un número es mágico. Se dice
		 * que un número es mágico si las cifras que ocupan posiciones pares son ares y
		 * las que ocupan posiciones impares son impares. Ejemplo: 12345
		 * Pos 1 = 1
		 * Pos 2 = 2
		 * Pos 3 = 3
		 * Pos 4 = 4
		 * Pos 5 = 5
		 */

		System.out.print("Introduce un numero: ");
		int n = sc.nextInt();
		boolean esMagico = true;
		int posActual = 0;
		while (n > 0 && esMagico == true) {
			int cifra = n % 10; // Sacar cifra
			n = n / 10; // quitamos la ultima cifra
			posActual++; // actualizamos la posición

			if (posActual % 2 == 0 && cifra % 2 != 0) {
				// error
				esMagico = false;
			}
			if (posActual % 2 != 0 && cifra % 2 == 0) {
				// error
				esMagico = false;
			}
		}

		if (esMagico == true) {
			System.out.println("El número es mágico");
		} else {
			System.out.println("El número no es mágico");
		}
	}

}
