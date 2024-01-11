package Actividad1;

import java.util.Scanner;

public class Ejercicio_13 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		/*
		 * Determinar mediante una función si un número introducido por teclado es primo
		 * o no. Un número primo solo es divisible por él mismo y por la unidad
		 */

		System.out.println("Introduce un numero: ");
		int n = sc.nextInt();

		Libreria.esPrimo(n);

	}

}
