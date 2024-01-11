package Actividad1;

import java.util.Scanner;

public class Ejercicio_16 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		/*
		 * Dada una hora por teclado (horas, minutos y segundos) implementar una función
		 * que recibe como parámetro una hora , la incrementa un segundo y muestra un
		 * mensaje con la nueva hora.
		 */

		System.out.println("Introduce las horas: ");
		int horas = sc.nextInt();
		System.out.println("Introduce los minutos: ");
		int minutos = sc.nextInt();
		System.out.println("Introduce los segundos: ");
		int segundos = sc.nextInt();

		Libreria.incrementaSegundos(horas, minutos, segundos);

	}

}
