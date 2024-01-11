package EjerciciosRepaso4;

import java.util.Scanner;

public class Ejercicio_12b {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		/*
		 * Implementar un programa que calcule la combinación en decimal de un numero
		 * binario leído por teclado
		 */

		System.out.print("Introduce numero binario: ");
		int n = sc.nextInt();

		int pos = 0;
		int valorAcum = 0;
		while (n > 0) {
			int resto = n % 10;
			valorAcum = ((resto * (int) Math.pow(2, pos)) + valorAcum);
			pos++;
			n = n / 10;
		}
		System.out.println("El numero en decimal es: " + valorAcum);

	}
}
