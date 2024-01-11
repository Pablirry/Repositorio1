package Actividad2;

import java.util.Scanner;

public class Ejercicio_1 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		/*
		 * Crear un programa que implemente operaciones sobre matrices
		 * - void leerMatriz(int [][]m);
		 * una función que sea los valores de una matriz
		 * - void mostrarMatriz(int [][]m);
		 * una función que muestre los valores de una matriz por filas
		 * - void sumaFilas(int [][]m);
		 * una función que muestre las sumas de los valores de una matriz por filas
		 * - void sumaColumnas (int [][]m);
		 * una función que muestre las sumas de los valores de una matriz
		 * por columnas
		 * - int [][] intercambia(int [][]m);
		 * una función que retorna una nueva matriz a partir de la matriz
		 * parámetro intercambiando filas por columnas y viceversa
		 * m[i][j]=retorno[j][i]
		 * - boolean esSelectiva(int [][]m)
		 * determinar si una matriz es selectiva. Una matriz es selectiva, si
		 * es cuadrada y todos los elementos de su diagonal son 1
		 * - boolean tienePuntoSilla(int [][]m)
		 * función que determine si una matriz tiene un punto silla. Un
		 * punto silla, es una posición(i,j) que contiene el valor más grande
		 * de su fila que es a la vez el valor más pequeño de su columna
		 */

		// int m[][] = new int[2][3];
		int m[][] = { { 8, 1, 26 }, { 13, 15, 17 }, {4, 9, 32} };
		// Libreria.leerMatriz(m);
		System.out.println("PRIMERA MATRIZ\n");

		// * Muestra la matriz introducida
		Libreria.mostrarMatriz(m);
		// * Suma los valores por filas de una matriz
		System.out.println("Suma de filas: ");
		Libreria.sumaFilas(m);
		// * Suma los valores por columnas de una matriz
		System.out.println("Suma de columnas: ");
		Libreria.sumaColumnas(m);
		// * Intercambia filas por columnas y viceversa
		System.out.println("Matriz intercambiada: ");
		int[][] n = Libreria.intercambia(m);
		Libreria.mostrarMatriz(n);
		// * Comprueba si una matriz es selectiva
		System.out.println("m selectiva? " + Libreria.esSelectiva(m));
		// * Punto silla de la matriz
		System.out.println("Punto silla de m: ");
		System.out.println(Libreria.tienePuntoSilla(m));

		System.out.println("\nSEGUNDA MATRIZ\n");

		int[][] m2 = { { 1, 2, 3 }, { 4, 1, 5 }, { 6, 7, 1 } };
		// * Muestra la matriz introducida
		Libreria.mostrarMatriz(m2);
		// * Suma los valores por filas de una matriz
		System.out.println("Suma de filas: ");
		Libreria.sumaFilas(m2);
		// * Suma los valores por columnas de una matriz
		System.out.println("Suma de columnas: ");
		Libreria.sumaColumnas(m2);
		// * Intercambia filas por columnas y viceversa
		System.out.println("Matriz intercambiada: ");
		int[][] n2 = Libreria.intercambia(m2);
		Libreria.mostrarMatriz(n2);
		// * Comprueba si una matriz es selectiva
		System.out.println("m2 selectiva? " + Libreria.esSelectiva(m2));
		// * Punto silla de la matriz
		System.out.println("Punto silla de m2: ");
		if(Libreria.tienePuntoSilla(m2)==true){
			System.out.println("Tiene punto silla");
		}else{
			System.out.println("No tiene punto silla");
		}

	}

}
