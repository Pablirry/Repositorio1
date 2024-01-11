package Actividad1;

import java.util.Scanner;

public class Ejercicio_1 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		/*
		 * Escribir un programa que lea 10 números de tipo entero y los
		 * almacene en un vector. Implementar una función que muestre el
		 * contenido del vector indicando para cada elemento su posición.
		 */

		int[] vector = new int[10];
		System.out.println("Introduce 10 numeros: ");

		for (int i = 0; i < 10; i++) {
			vector[i] = sc.nextInt();
		}

		Libreria.mostrarVector(vector);

	}

}
