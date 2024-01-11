package EjerciciosRepaso2;

import java.util.Scanner;

public class Ejercicio_14 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("DESCOMPOSICIÓN EN NÚMEROS PRIMOS");

		/*
		 * Escriba un programa que calcule la descomposición en factores primos de un
		 * número.
		 */

		System.out.println("Introduce un número entero mayor que 1: ");
		int n = sc.nextInt();

		while (n <= 1) {
			System.out.print(n + " no es mayor que 1. Inténtelo de nuevo: ");
			n = sc.nextInt();

		}

		int divisor = 2;
		System.out.print("Factores primos: ");

		while (n > 1) {
			if (n % divisor == 0) {
				System.out.print(divisor);
				n = n / divisor;
				if (n > 1) {
					System.out.print(" ");
				}
			} else {
				divisor++;
			}
		}
		System.out.println();

	}

}
