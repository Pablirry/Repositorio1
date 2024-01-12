package Actividad3_apoyo;

import java.util.Scanner;

public class Ejercicio_1 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		/*
		 * int [][] generarMatriz(int filas, int columnas)
		 * void mostrarMatriz(int m[][])
		 * void buscarValor(int m[][], int valor)
		 * int[] sumaPorFilas(int m[][])
		 * int[] sumaPorColumnas(int m[][])
		 * int [][] calcularTraspuesta(int m[][])
		 * int [][] sumaMatrices(int a[][], int b[][])
		 * int [][] productoMatrices(int a[][], int b[][])
		 * int calcularSumaDiagonal(int m[][]);
		 * int calcularSumaDiagonalInversa(int m[][]);
		 * int [] diagonalizarMatriz(int m[][])
		 * boolean matrizTriangularSuperior(int m[])
		 * boolean matrizTriangularInferior(int m[]);
		 */

		System.out.println("Introduce filas");
		int filas = sc.nextInt();

		System.out.println("Introduce columnas");
		int columnas = sc.nextInt();
		int m[][] = Libreria1.generarMatriz(filas, columnas);
		Libreria1.mostrarMatriz(m);
		System.out.println("Introduce valor a bscar");
		int valor = sc.nextInt();
		Libreria1.buscarValor(m, valor);
		System.out.print("Suma filas: ");
		int v[] = Libreria1.sumaPorFilas(m);
		for (int i = 0; i < v.length; i++) {
			System.out.print(v[i] + " ");
		}
		System.out.println();
		System.out.print("sumas columnas: ");
		v = Libreria1.sumaPorColumnas(m);
		for (int i = 0; i < v.length; i++) {
			System.out.print(v[i] + " ");
		}

		System.out.println("\n");

		int m2[][] = Libreria1.generarMatriz(filas, filas);
		Libreria1.mostrarMatriz(m2);
		System.out.println();
		System.out.println("Suma diagonal " + Libreria1.calcularSumaDiagonal(m2));
		System.out.println();
		System.out.println("Suma diagonal Inversa: " + Libreria1.calcularSumaDiagonalInversa(m2));
		int[] v2 = Libreria1.diagonalizarMatriz(m2);
		for (int i = 0; i < v2.length; i++) {
			System.out.print(v2[i] + " ");
		}

		/*
		 * 1 0 0 0
		 * 1 2 0 0
		 * 1 2 3 0
		 * 1 2 3 4
		 */
		int m3[][] = { { 1, 0, 0, 0 }, { 1, 2, 0, 0 }, { 1, 2, 3, 0 }, { 1, 2, 3, 4 } };
		System.out.println("\nTriangular superior: " + Libreria1.matrizTriangularSuperior(m3));

		/*
		 * 1 2 3 4
		 * 0 2 3 4
		 * 0 0 3 4
		 * 0 0 0 4
		 */
		int m4[][] = { { 1, 2, 3, 4 }, { 0, 2, 3, 4 }, { 0, 0, 3, 4 }, { 0, 0, 0, 4 } };
		System.out.println("Triangular superior: " + Libreria1.matrizTriangularInferior(m4));
	}

}
