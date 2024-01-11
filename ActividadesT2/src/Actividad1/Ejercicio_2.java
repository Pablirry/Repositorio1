package Actividad1;

import java.util.Scanner;

public class Ejercicio_2 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		/*
		 * Diseña un programa modular que calcule el área y la circunferencia de un
		 * circulo cuyo radio se debe preguntar al usuario.
		 */

		System.out.println("Introduce el radio del circulo:");
		double radio = sc.nextDouble();

		Libreria.areaCirculo(radio);

		System.out.println("La circunferencia del circulo mide: " + Libreria.circunferenciaCirculo(radio));

	}

}
