package Actividad1;

import java.util.Scanner;

public class Ejercicio_21 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		/*
		 * Realiza un programa que permita convertir modularmente números binarios en
		 * decimales y viceversa.
		 */
		System.out.println("Introduce binario: ");
		int binario = sc.nextInt();

		int numeroDecimal = Libreria.binario_a_decimal(binario);
		String numeroHexadecimal = Libreria.binario_a_hexadecimal(binario);
		String numeroOctal = Libreria.binario_a_octal(binario);

		System.out.println("Binario: " + binario);
		System.out.println("Decimal: " + numeroDecimal);
		System.out.println("Hexadecimal: " + numeroHexadecimal);
		System.out.println("Octal: " + numeroOctal);

	}

}
