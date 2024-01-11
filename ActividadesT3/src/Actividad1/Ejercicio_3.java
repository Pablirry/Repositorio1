package Actividad1;

import java.util.Scanner;

public class Ejercicio_3 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		/*
		 * Implementar un programa con las siguientes funciones:
		 * void leerVector(int v[]) : funcionq que lee los elementos de un
		 * vector
		 * int suma(int v[]) retorna la suma de los elementos de un vector
		 * int max(int v[]) retorna el máximo de un vector
		 * int sumaNumerosPares(int v[]) retorna la suma de los valores
		 * pares de un vector
		 * int sumaPosicionesImpares(int v[]) retorna la suma de los
		 * valores almacenados en las posiciones impares del vector.
		 */

		System.out.println("Introduce el tamaño del vector: ");
		int tamano = sc.nextInt();

		int vector[] = new int[tamano];

		Libreria.leerVector(vector);
		Libreria.mostrarVector(vector);

		System.out.println("La suma de los elementos del vector es: " +
				Libreria.suma(vector));
		System.out.println("El valor mas alto del vector es: " +
				Libreria.max(vector));
		System.out.println("La suma de los valores pares del vector es: " +
				Libreria.sumaNumerosPares(vector));
		System.out.println("La suma de los valores almacenados en las posiciones impares del vector es: "
				+ Libreria.sumaPosicionesImpares(vector));

	}

	public static void leerVector(int v[]) {
		for (int i = 0; i < v.length; i++) {
			System.out.print("posición (" + (i + 1) + "): ");
			v[i] = sc.nextInt();

		}
	}

	/**
	 * lee la dimension de un vector y lo rellena con valores introducidos por
	 * teclado
	 * 
	 * @return entero[]
	 */

	public static int[] crearVector() {

		System.out.println("Introduce el tamaño del vector: ");
		int tamano = sc.nextInt();
		int vector[] = new int[tamano];

		for (int i = 0; i < vector.length; i++) {
			System.out.println("[" + i + "]: ");
			vector[i] = sc.nextInt();
		}

		return vector;

	}

	/**
	 * Funcion que muestra el contenido del vector
	 * 
	 * @param vector : vector[]
	 */

	public static void mostrarVector(int vector[]) {
		for (int i = 0; i < vector.length; i++) {
			System.out.println("[" + i + "] = " + vector[i]);
		}
	}

	/**
	 * Funcion que calcula el numero más alto del vector
	 * 
	 * @param v : entero[]
	 * @return : entero
	 */

	public int maximo(int v[]) {
		int max = v[0];
		for (int i = 0; i < v.length; i++) {
			if (max < v[i]) {
				max = v[i];
			}
		}
		return max;
	}

	/**
	 * Funcion que calcula la suma de los elementos pares del vector
	 * 
	 * @param v : entero[]
	 * @return : entero
	 */

	public static int sumaNumerosPares(int v[]) {
		int suma = 0;
		for (int i = 0; i < v.length; i++) {
			if (v[i] % 2 == 0) {
				suma = suma + v[i];
			}
		}
		return suma;
	}

	public static int sumaPosicionesImpares(int v[]) {
		int sumaImpares = 0;
		for (int i = 0; i < v.length; i++) {
			if (i % 2 != 0) {
				sumaImpares = sumaImpares + v[i];
			}
		}
		return sumaImpares;
	}

}
