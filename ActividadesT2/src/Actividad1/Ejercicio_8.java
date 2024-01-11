package Actividad1;

import java.util.Scanner;

public class Ejercicio_8 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		/*
		 * Diseñar un algoritmo que determine si tres números que pedimos por teclado
		 * están ordenaos de mayor a menor ( NO consiste en ordenar , solo indicar si
		 * están ordenados o no).
		 * A. Una función que determine si los tres números están ordenados
		 * B. Una función que recibe dos números y determinar si el primero es mayor que
		 * el segundo
		 */

		int opcion = menu();

		if (opcion == 1) {
			System.out.println("Introduce un número: ");
			int a = sc.nextInt();
			System.out.println("Introduce otro número: ");
			int b = sc.nextInt();
			System.out.println("Introduce el útimo número: ");
			int c = sc.nextInt();

			boolean ordenados = Libreria.ordenados(a, b, c);

			if (ordenados) {
				System.out.println("Los números están ordenados de mayor a menor");
			} else {
				System.out.println("Los números no están ordenados de mayor a menor");
			}
		}
		if (opcion == 2) {
			System.out.println("Introduce un número: ");
			int n1 = sc.nextInt();
			System.out.println("Introduce otro número: ");
			int n2 = sc.nextInt();

			boolean mayor = Libreria.primeroMayor(n1, n2);

			if (mayor) {
				System.out.println("El primer número es mayor que el segundo");
			} else {
				System.out.println("El primer número no es mayor que el segundo");
			}
		}

	}

	public static int menu() {
		int opcion;

		do {
			System.out.println("1. Determina si los tres números están ordenados");
			System.out.println("2. Recibe dos números y determinar si el primero es mayor que el segundo");
			System.out.print("Elige una opcion: ");
			opcion = sc.nextInt();
		} while (opcion != 1 && opcion != 2);
		return opcion;
	}

}
