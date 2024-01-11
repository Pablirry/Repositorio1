package Actividad2;

import java.util.Scanner;

public class Ejercicio_2 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int[][] matriz = Libreria.crearMatriz();

		System.out.println("Matriz generada:");
		Libreria.mostrarMatriz(matriz);

		System.out.println("\nTriángulo Superior:");
		Libreria.trianguloSuperior(matriz);

		System.out.println("\nTriángulo Inferior:");
		Libreria.trianguloInferior(matriz);

	}

}
