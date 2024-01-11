package Actividad;

import java.util.Scanner;

public class Ejercicio {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Introduce un numero: ");
		int numero = sc.nextInt();
		System.out.println("Introduce otro numero: ");
		int numero2 = sc.nextInt();

		int opcion = Libreria.menu();

		if (opcion == 1) {
			if (numero == Libreria.numeroInverso(numero2) || Libreria.numeroInverso(numero) == numero2) {
				System.out.println("Los numero son cuñados.");
			} else {
				System.out.println("Los numero no son cuñados.");
			}
		} else if (opcion == 2) {

			boolean contiene = false;

			while (numero != 0) {
				if (Libreria.contieneDigito(numero, numero2 % 10)) {
					contiene = true;
				}
				numero = numero / 10;
			}
			if (contiene) {
				System.out.println("Los numeros no son familia.");
			} else {
				System.out.println("Los numeros son familia.");
			}

		} else {
			System.out.println("ERROR");
		}
	}

}
