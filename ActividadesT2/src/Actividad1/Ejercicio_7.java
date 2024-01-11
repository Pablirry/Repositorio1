package Actividad1;

import java.util.Scanner;

public class Ejercicio_7 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		/*
		 * Implementar un programa modular para realizar la conversión de grados
		 * Centígrados a grados Farenheit. F=((9/5)*C)+32
		 */

		int opcion = menu();

		if (opcion == 1) {
			System.out.print("introduce grados farenheit: ");
			double farenheit = sc.nextDouble();
			double farenheitCelsius = Libreria.farenheitCelsius(farenheit);
			System.out.println(farenheit + "ºF = " + farenheitCelsius + "ºC");
		} else if (opcion == 2) {
			System.out.print("introduce grados celsius: ");
			double celsius = sc.nextDouble();
			double celsiusFarenheit = Libreria.celsiusFarenheit(celsius);
			System.out.println(celsius + "ºC = " + celsiusFarenheit + "ºF");
		} else {
			System.out.println("Saliendo del programa.");
		}

	}

	public static int menu() {

		int opcion;

		System.out.println("OPCIONES: ");

		do {
			System.out.println("1. Pasar de farenheit a celsius");
			System.out.println("2. Pasar de celsius a farenheit");
			System.out.println("3. Salir");
			System.out.print("Elige una opción: ");
			opcion = sc.nextInt();
		} while (opcion != 1 && opcion != 2);
		return opcion;

	}

}
