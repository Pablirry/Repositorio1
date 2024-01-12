package Actividad2;

import java.util.Scanner;

public class Ejercicio_3 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		/*
		 * crear una matriz cuadrada de orden impar ( la dim de la matriz es impar)
		 * rellenar la matriz con valores aleatorios entre 1 y 9
		 * mostrar la matriz con todos sus datos
		 * mostrar la matriz en forma de reloj de arena
		 */

		int[][] m = Libreria.crearMatrizReloj();
		Libreria.mostrarMatriz(m);
		System.out.println();

		Libreria.mostrarRelojDeArena(m);

	}

}
