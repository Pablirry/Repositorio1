package Actividad1;

import java.util.Scanner;

public class Ejercicio_6 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		/*
		 * Determinar, con un programa modular, si un número real pedido por teclado
		 * tiene decimales o no.
		 */

		System.out.print("Introduce un número: ");
		double n = sc.nextDouble();

		boolean esDecimal = Libreria.esDecimal(n);

		if (esDecimal == true) {
			System.out.println("El número " + n + " tiene decimales");
		} else {
			System.out.println("El número " + n + " no tiene decimales");
		}

	}

}
