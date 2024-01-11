package Actividad1;

import java.util.Scanner;

public class Ejercicio_11 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		/*
		 * Implementar una función que retorne el numero de veces que aparece
		 * un valor dentro del vector.
		 * int buscarValor(int v[], int valor)
		 * Generar el vector con elementos aleatorios entre 1 y 10
		 */

		System.out.println("Introduce tamaño vector: ");
		int tamanoVector = sc.nextInt();

		int vector[] = Libreria.generarVectorAleatorio(tamanoVector);

		System.out.println("VECTOR: ");
		Libreria.imprimirVector(vector);

		System.out.println("Introduce valor a buscar: ");
		int valorBuscado = sc.nextInt();

		int cant = Libreria.buscarValor(vector, valorBuscado);
		System.out.println("El valor " + valorBuscado + " aparece " + cant + " veces en el vector.");
	}

}
