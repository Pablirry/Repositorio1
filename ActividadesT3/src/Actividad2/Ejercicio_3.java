package Actividad2;

import java.util.Scanner;

public class Ejercicio_3 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int dimension;
		System.out.print("Ingrese la dimensión de la matriz cuadrada (impar): ");
		dimension = sc.nextInt();
		do {
			System.out.print("La dimension no es impar, Ingrese la dimensión de la matriz cuadrada (impar): ");
			dimension = sc.nextInt();
		} while (dimension % 2 == 0); // Asegurar que la dimensión sea impar

		int[][] matriz = Libreria.crearMatrizReloj(dimension);

		System.out.println("Matriz generada:");
		Libreria.mostrarMatriz(matriz);

		System.out.println("\nReloj de Arena:");
		Libreria.mostrarRelojDeArena(matriz);

	}

}
