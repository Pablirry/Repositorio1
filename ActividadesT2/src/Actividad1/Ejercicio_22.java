package Actividad1;

import java.util.Scanner;

public class Ejercicio_22 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		/*
		 * Realiza una función que devuelva cuantas cifras pares contiene un número.
		 * Implementar la función gemela que retorne cuantas cifras impares contiene el
		 * número parado como parámetro.
		 */

		System.out.println("Introduce un número: ");
		int n = sc.nextInt();

		System.out.println("El número tiene " + Libreria.cifrasPares(n) + " cifras pares");
		System.out.println("El número tiene " + Libreria.cifrasImpares(n) + " cifras impares");

	}

}
