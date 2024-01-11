package EjerciciosRepaso4;

import java.util.Scanner;

public class Ejercicio_19 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		/*
		 * Escribir un programa que determine si un número introducido por teclado es
		 * capicúa. No está permitido convertir el número en string y manipularlo
		 * carácter a carácter, solamente se pueden realizar operaciones aritméticas. Si
		 * el número es capicúa, el programa escribirá "OK". En caso contrario,
		 * escribirá "NOK". Se debe utilizar tipo long para el número, y así poder
		 * analizar números grandes.
		 */

		System.out.println("Introduce un numero: ");
		long n = sc.nextLong();

		long Original = n;
		long capicua = 0;

		while (n > 0) {
			long digito = n % 10;
			capicua = (capicua * 10) + digito;
			n = n / 10;
		}

		if (Original == capicua) {
			System.out.println("OK");
		} else {
			System.out.println("NOK");
		}

	}

}
