package Actividad1;

import java.util.Scanner;

public class Ejercicio_15 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		/*
		 * Dados dos números enteros, realizar una función que calcule el cociente y el
		 * resto mediante restas sucesivas.
		 * Ejemplo : 18 / 4
		 * Se irá restando 18-4 =14; 14-4=10; 10-4=6; 6-4=2
		 * Hasta que el resultado de la resta (2) es menor que el divisor(4). Por lo
		 * tanto el cociente es el número de restas que se han hecho (4) y el resto es
		 * el valor de la última resta (2).
		 */

		System.out.println("Introduce dividendo: ");
		int dividendo = sc.nextInt();
		System.out.println("Introduce divisor: ");
		int divisor = sc.nextInt();

		int cociente = Libreria.CalcularCociente(dividendo, divisor);
		int resto = Libreria.CalcularResto(dividendo, divisor);

		System.out.println("Cociente: " + cociente);
		System.out.println("Resto: " + resto);

	}

}
