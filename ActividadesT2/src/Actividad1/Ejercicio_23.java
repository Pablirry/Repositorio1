package Actividad1;

import java.util.Scanner;

public class Ejercicio_23 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		/*
		 * Implementar una función que calcule la suma de los dígitos de un número.
		 */

		System.out.println("Introduce un número: ");
		int n = sc.nextInt();

		int sumaDig = Libreria.sumaDigitos(n);

		System.out.println("La suma de los dígitos del número introducido es: " + sumaDig);

	}

}
