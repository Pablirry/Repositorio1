package Actividad1;

import java.util.Scanner;

public class Ejercicio_3 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		/*
		 * Implementar una función que reciba como parámetro un número y retorne un
		 * valor lógico indicando si es positivo o negativo. El programa principal leer
		 * el numero por teclado y llama a la función. Muestra un mensaje en función del
		 * valor de retorno.
		 */

		System.out.println("Introduce un numero para indicar si es positivo: ");
		int n = sc.nextInt();

		if (Libreria.esNegativo(n) == true) {
			System.out.println("El numero es negativo");
		} else {
			System.out.println("El numero es positivo");
		}

	}

}
