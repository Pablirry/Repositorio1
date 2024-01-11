package Actividad1;

import java.util.Scanner;

public class Ejercicio_4 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		/*
		 * Implementar un código modular con una función que calcule la raíz cuadrada de
		 * un numero que recibe como parámetro, teniendo la precaución de no llamar a la
		 * función si el numero es negativo, en cuyo caso se muestra un mensaje de
		 * error.
		 */

		System.out.println("Introduce un numero: ");
		int n = sc.nextInt();

		double raiz = Libreria.calcularRaizCuadrada(n);

		if (n >= 0) {
			System.out.println("La raiz cuadrada de " + n + " es " + raiz);
		} else {
			System.out.println("No se puede calcular la raiz de un numero negativo");
		}

	}

}
