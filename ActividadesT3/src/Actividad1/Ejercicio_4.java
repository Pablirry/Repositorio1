package Actividad1;

import java.util.Scanner;

public class Ejercicio_4 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		/*
		 * Leer las dimensiones de una matriz de enteros por teclado, y rellenarla
		 * con valores aleatorios entre 1 y 10
		 * Nota: para generar valores aleatorios entre 1 y 10 Math.random()*10 +1
		 */

		int filas, columnas;
		System.out.print("Filas: ");
		filas = sc.nextInt();
		System.out.print("Columnas: ");
		columnas = sc.nextInt();
		int[][] matriz = new int[filas][columnas];
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				matriz[i][j] = (int) (Math.random() * 10 + 1);
			}
		}
		System.out.println("MATRIZ: ");
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}

	}

}
