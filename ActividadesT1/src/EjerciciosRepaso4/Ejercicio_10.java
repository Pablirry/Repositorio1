package EjerciciosRepaso4;

import java.util.Scanner;

public class Ejercicio_10 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		/*
		 * Al ingresar el número de día y el número de mes, devolver la estación de año
		 */

		System.out.print("Introduce número de mes: ");
		int mes = sc.nextInt();

		System.out.print("Introduce dia del mes: ");
		int dia = sc.nextInt();

		String estacion = Estacion(dia, mes);

		if (estacion != null) {
			System.out.println("Estación: " + Estacion(dia, mes));
		} else {
			System.out.println("Fecha no válida");
		}

	}

	public static String Estacion(int dia, int mes) {

		if ((mes == 12 && dia >= 21) || (mes == 3 && dia <= 20) || (mes == 2) || (mes == 1)) {
			return "Verano";
		} else if ((mes == 3 && dia >= 21) || (mes == 4) || (mes == 5) || (mes == 6 && dia <= 21)) {
			return "Otoño";
		} else if ((mes == 6 && dia >= 22) || (mes == 7) || (mes == 8) || (mes == 9 && dia <= 22)) {
			return "Invierno";
		} else if ((mes == 9 && dia >= 23) || (mes == 10) || (mes == 11) || (mes == 12 && dia <= 20)) {
			return "Primavera";
		} else {
			return null;
		}

	}

}
