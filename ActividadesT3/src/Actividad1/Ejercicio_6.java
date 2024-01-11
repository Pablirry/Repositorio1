package Actividad1;

import java.util.Scanner;

public class Ejercicio_6 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		/*
		 * Calcular la mediana de un vector. Es aquella que deja tantos menores
		 * como mayores. solución ordenar y retornar la posición central
		 */

		System.out.println("Introduce la longitud del vector: ");
		int n = sc.nextInt();

		int v[] = new int[n];

		Libreria.leerVector(v);

		double mediana = Libreria.medianaVector(v);

		System.out.println("La mediana del vector introducido es: " + mediana);

	}

	/**
	 * Funcion que calcula la mediana de un vector.
	 * 
	 * @param vector : entero[]
	 * @return :entero
	 */

	public static int medianaVector(int vector[]) {

		// Implementación de un algoritmo de ordenación simple (por ejemplo, burbuja)
		for (int i = 0; i < vector.length - 1; i++) {
			for (int j = 0; j < vector.length - i - 1; j++) {
				if (vector[j] > vector[j + 1]) {
					// Intercambiar elementos si están en el orden incorrecto
					int temp = vector[j];
					vector[j] = vector[j + 1];
					vector[j + 1] = temp;
				}
			}
		}

		// Calculamos la longitud del vector
		int n = vector.length;

		// Verificamos si la longitud es par o impar
		if (n % 2 == 0) {
			// Si es par, promedio de los dos valores centrales
			return ((vector[n / 2 - 1] + vector[n / 2]) / 2);
		} else {
			// Si es impar, el valor central
			return vector[n / 2];
		}
	}
}
