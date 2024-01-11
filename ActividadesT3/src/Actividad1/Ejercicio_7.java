package Actividad1;

import java.util.Scanner;

public class Ejercicio_7 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		/*
		 * Implementar una función que realice la búsqueda secuencial de un
		 * valor sobre un vector de reales que recibe como parámetro. La
		 * cabecera de la función int búsqueda(float v[], float value)
		 */

		float[] vector = { 1.5f, 2.0f, 3.7f, 4.2f, 5.1f };

		System.out.println("Que valor quieres buscar: ");
		float valorBuscado = sc.nextFloat();

		int posicion = Libreria.busqueda(vector, valorBuscado);

		if (posicion != -1) {
			System.out
					.println("El valor " + valorBuscado + " se encuentra en la posición " + posicion + " del vector.");
		} else {
			System.out.println("El valor " + valorBuscado + " no se encuentra en el vector.");
		}

	}

}
