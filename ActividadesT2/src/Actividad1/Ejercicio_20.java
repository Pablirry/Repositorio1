package Actividad1;

import java.util.Scanner;

public class Ejercicio_20 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		/*
		 * Realiza un programa que admita 3 números enteros y los devuelva ordenados de
		 * menor a mayor.
		 */
		System.out.println("Introduce un número: ");
		int n1 = sc.nextInt();
		System.out.println("Introduce otro número: ");
		int n2 = sc.nextInt();
		System.out.println("Introduce otro número: ");
		int n3 = sc.nextInt();

		Libreria.ordenar(n1, n2, n3);

	}

}
