package EjerciciosRepaso3;

import java.util.Scanner;

public class Ejercicio_1 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		/*
		 * Escriba un programa en Java que genere la siguiente serie: 5,10,15,20,25,30…
		 * El programa preguntará primero cuantos términos se quieren mostrar y después
		 * mostrará la serie correspondiente.
		 */

		System.out.print("Cuántos números quieres mostrar: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			if (i == n - 1) {
				System.out.print((i + 1) * 5);
			} else {
				System.out.print((i + 1) * 5 + ", ");

			}

		}

	}

}
