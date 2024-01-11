package EjerciciosRepaso4;

import java.util.Scanner;

public class Ejercicio_12 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		/*
		 * Implementar un programa que calcule la combinación en binario, octal y
		 * hexadecimal de un numero decimal leído por teclado
		 */

		System.out.print("Introduce un numero decimal: ");
		int n = sc.nextInt();

		int pos = 0;
		int valorAcum = 0;

		while (n >= 2) {
			int resto = n % 2;
			valorAcum = ((resto * (int) Math.pow(10, pos)) + valorAcum);
			pos++;
			n = n / 2;
		}
		System.out.println("El numero en binario es: " + valorAcum);

	}

}
