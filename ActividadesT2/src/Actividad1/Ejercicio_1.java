package Actividad1;

import java.util.Scanner;

public class Ejercicio_1 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		/*
		 * Realiza un programa modular que calcule la superficie y el perímetro de un
		 * cuadrado cuyo lado pediremos por teclado
		 */

		System.out.println("Lado ");
		int ladoP = sc.nextInt();
		Libreria.areaCuadrado(ladoP);
		
		int r = Libreria.PerimetroCuadrado(ladoP);
		System.out.println("El valor calculado es " +r);

	}

}
