package EjerciciosRepaso4;

import java.util.Scanner;

public class Ejercicio_13 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		/*
		 * Un número entero es un palíndromo si se puede leer igual de izquierda a
		 * derecha y de derecha a izquierda. Por ejemplo: 5, 121, 12321. Escriba una
		 * función para determinar si un número es un palíndromo.
		 */

		System.out.print("Ingrese un número: ");
		int n = sc.nextInt();
		int entero = n;
		int reves = 0;

		while (n > 0) {
			int digito = n % 10;
			reves = reves * 10 + digito;
			n = n / 10;
		}

		if (entero == reves) {
			System.out.println(entero + " es un palíndromo.");
		} else {
			System.out.println(entero + " no es un palíndromo.");
		}

	}

}
