package Actividad1;

import java.util.Scanner;

public class Ejercicio_17 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		/*
		 * Realiza una función que resuelva la ecuación de segundo grado. El programa
		 * pedirá por teclado los tres coeficientes que se envían a la función. Dicha
		 * función mostrara los posibles soluciones:
		 * No tiene solución
		 * Una solución y su valor
		 * Dos soluciones y sus valores
		 */
		System.out.print("Introduce a: ");
		int a = sc.nextInt();
		System.out.print("Introduce b: ");
		int b = sc.nextInt();
		System.out.print("Introduce c: ");
		int c = sc.nextInt();

		Libreria.ecuacion_2_grado(a, b, c);

	}

}
