package Actividad1;

import java.util.Scanner;

public class Ejercicio_9 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		/*
		 * Con un programa modular, determinar el numero de cifras de un numero. Por
		 * ejemplo 9560 debe indicar que tiene 4 cifras, el numero -365 debe indicar que
		 * tiene 3 cifras
		 */

		System.out.println("Introduce un número: ");
		int n = sc.nextInt();

		n = Math.abs(n);

		int nCifras = Libreria.cifras(n);

		System.out.println("El número de cifras es de : " + nCifras);

	}

}
