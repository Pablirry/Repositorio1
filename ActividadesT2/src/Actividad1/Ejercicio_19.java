package Actividad1;

import java.util.Scanner;

public class Ejercicio_19 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		/*
		 * Diseña una función que pregunte al usuario la fecha actual y la fecha de
		 * nacimiento de una persona; el programa determinará la edad.
		 */

		System.out.println("Introduce dia de nacimiento: ");
		int dia = sc.nextInt();
		System.out.println("Introduce mes nacimiento: ");
		int mes = sc.nextInt();
		System.out.println("Introduce año de nacimiento: ");
		int ano = sc.nextInt();

		System.out.println("Introduce dia actual: ");
		int diaActual = sc.nextInt();
		System.out.println("Introduce mes actual: ");
		int mesActual = sc.nextInt();
		System.out.println("Introduce año actual: ");
		int anoActual = sc.nextInt();

		int edad = Libreria.edad(dia, mes, ano, diaActual, mesActual, anoActual);
		System.out.println("La edad de la persona es de " + edad + " años");

	}

}
