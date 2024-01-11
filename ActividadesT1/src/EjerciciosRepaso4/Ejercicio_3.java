package EjerciciosRepaso4;

import java.util.Scanner;

public class Ejercicio_3 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		/*
		 * Hacer un programa en java que imprima un diamante de asteriscos
		 */

		System.out.print("Ingrese el número de filas de los triángulos del diamante: ");
		int n = sc.nextInt();

		// imprime la mitad superior
		for (int cont1 = 1; cont1 <= n; cont1++) {
			// espacio de impresión
			for (int cont2 = cont1; cont2 < n; cont2++) {
				System.out.print("   ");
			}

			// impresión '*'
			for (int cont3 = 1; cont3 < 2 * cont1; cont3++) {
				System.out.print("*  ");
			}

			// pasar a la siguiente linea
			System.out.println();
		}

		// imprime la mitad inferior
		for (int cont1 = n - 1; cont1 >= 1; cont1--) {
			// espacio de impresión
			for (int cont2 = n; cont2 > cont1; cont2--) {
				System.out.print("   ");
			}

			// impresión '*'
			for (int cont3 = 1; cont3 < (cont1 * 2); cont3++) {
				System.out.print("*  ");
			}

			// pasar a la siguiente linea
			System.out.println();
		}

	}

}
