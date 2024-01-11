package Actividad1;

import java.util.Scanner;

public class Ejercicio_5 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// Implementar un función que determine si un año es bisiesto o no

		System.out.println("Introduce un año: ");
		int ano = sc.nextInt();

		boolean esBisiesto = Libreria.esBisiesto(ano);

		if (esBisiesto == true) {
			System.out.println("El año " + ano + " es bisiesto");
		} else {
			System.out.println("El año " + ano + " no es bisiesto");
			;
		}
	}

}
