package Actividad1;

import java.util.Scanner;

public class Ejercicio_11 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		/*
		 * Calcula mediante una función el factorial de un número entero. El factorial
		 * de un número es el resultado de multiplicar ese número por todos los números
		 * menores que él.
		 * Ejemplo: 4! = 4*3*2*1=12
		 */

		System.out.println("Introduce un número para calcular el factorial: ");
		int n = sc.nextInt();

		int factorial = Libreria.factorial(n);

		System.out.println("El factorial de " + n + " es: " + factorial);

	}

}
