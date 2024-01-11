package Actividad1;

import java.util.Scanner;

public class Ejercicio_18 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		/*
		 * Implementar una función se simule la devolución de monedas de una máquina
		 * expendedora. El programa principal lee la cantidad de dinero y la función
		 * calcula la cantidad de monedas necesarias para cubrir la cantidad
		 * Por ejemplo 3,47 :
		 * 1 moneda de 2 €
		 * 1 moneda de 1€
		 * 2 de 20 cts
		 * 1 de 5 cts
		 * 1 de 2 cts
		 */

		System.out.println("Introduce la cantidad de monedas a devolver: ");
		double dinero = sc.nextDouble();

		Libreria.monedas(dinero);

	}

}
