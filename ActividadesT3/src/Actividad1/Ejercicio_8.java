package Actividad1;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_8 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		/*
		 * Dado un vector de números reales, escriba un método que ordene los
		 * elementos del vector de tal forma que los números pares aparezcan
		 * antes que los números impares. Además, los números pares deberán
		 * estar ordenados de forma ascendente, mientras que los números
		 * impares deberán estar ordenados de forma descendente. Esto es, el
		 * vector {1,2,3,4,5,6} quedará como {2,4,6,5,3,1}.
		 */

		System.out.println("Introduce longitud del vector: ");
		int n = sc.nextInt();

		int v[] = new int[n];

		Libreria.leerVector(v);

		System.out.println("Vector Original: ");
		Libreria.mostrarVector(v);

		Libreria.ordenarVector(v);

		System.out.println("Vector Ordenado: " + Arrays.toString(v));

	}

}
