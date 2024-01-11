package Actividad1;

import java.util.Scanner;

public class Ejercicio_5 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		/*
		 * Calcular la varianza de un vector. Se define la varianza de un vector,
		 * como la suma de los cuadrados de cada elementos divido entre el
		 * numero de elementos
		 */

		System.out.println("Introduce la longitud del vector: ");
		int n = sc.nextInt();

		int v[] = new int[n];

		Libreria.leerVector(v);

		double varianza = Libreria.varianzaVector(v);

		System.out.println("La varianza del vector introducido es: " + varianza);

	}

	public static double varianzaVector(int v[]) {
		int suma = 0;
		for (int i = 0; i < v.length; i++) {
			suma = suma + (v[i] * v[i]);
		}
		int resul = suma / v.length;
		return resul;
	}

}
