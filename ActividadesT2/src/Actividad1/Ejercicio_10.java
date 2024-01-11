package Actividad1;

import java.util.Scanner;

public class Ejercicio_10 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		/*
		 * Los empleados de una fabrica trabajan por turnos: diurno y nocturno. Se debe
		 * calcular mediante una función, el sueldo diario de acuerdo a las siguientes
		 * especificaciones:
		 * La tarifa por horas diurnas es de 20€
		 * La tarifa por horas nocturnas es de 35€
		 * Caso de ser domingo, la tarifa se incrementa en 10€ más por turno diurno y
		 * 15€ más para el nocturno.
		 */

		System.out.println("Introduce las horas trabajadas: ");
		int horas = sc.nextInt();
		System.out.println("¿Es domingo? (true/false)");
		boolean esDomingo = sc.nextBoolean();
		System.out.println("¿Es diurno? (true/false)");
		boolean esDiurno = sc.nextBoolean();

		Libreria.calcularSueldo(horas, esDiurno, esDomingo);
	}

}
