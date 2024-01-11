package EjerciciosRepaso4;

import java.util.Scanner;

public class Ejercicio_17 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		/*
		 * Un número perfecto es aquel número positivo que es suma de sus divisores
		 * propios (es decir, excluyéndose a sí mismo). Por ejemplo, 24 es un número
		 * perfecto porque los divisores propios de 24 son 1, 2, 3, 4, 6 y 8, y 1 + 2 +
		 * 3 + 4 + 6 + 8 = 24. Escribir un programa que escriba los n primeros números
		 * perfectos, pidiendo n por teclado (n ha de ser un número positivo).
		 */

		int suma = 0;
		int n;

		System.out.println("Introduce un número: ");
		n = sc.nextInt();
		for (int i = 1; i < n; i++) { // i son los divisores. Se divide desde 1 hasta n-1
			if (n % i == 0) {
				suma = suma + i; // si es divisor se suma
			}
		}
		if (suma == n) { // si el numero es igual a la suma de sus divisores es perfecto
			System.out.println("El numero es perfecto");
		} else {
			System.out.println("El numero no es perfecto");

		}
	}
}
