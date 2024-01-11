package Actividad1;

import java.util.Scanner;

public class Ejercicio_10 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		/*
		 * Se dice que un vector tiene un pico, si dada una posición i los valores
		 * de las posiciones -1 y i+1 son menores que ella.
		 * Se dice que un vector tiene un valle cuando dada una posición i los
		 * valores de las posiciones -1 y +1 son mayores que ella.
		 * Implementar una función que determine si tiene pico y una función
		 * que determine si un vector tiene valle.
		 */

		System.out.print("Introduce longitud del vector: ");
		int n = sc.nextInt();

		int[] vector = new int[n];

		Libreria.leerVector(vector);

		if (Libreria.tienePico(vector)) {
			System.out.println("El vector tiene pico");
		} else {
			System.out.println("El vector no tiene pico");
		}

		if (Libreria.tieneValle(vector)) {
			System.out.println("El vector tiene valle");
		} else {
			System.out.println("El vector no tiene valle");
		}

	}

}
