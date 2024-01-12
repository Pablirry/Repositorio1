package Actividad2;

import java.util.Scanner;

public class Ejercicio_2 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		/*
		 * Crear un programa con las siguiente funciones:
		* int [][] crearMatriz():
		    * función que lea la dimension de una matriz cuadrada. Genera los valores de la
		    * matriz a partir de la formula m[i][j]=i+j
		 * void mostrarMatriz(int m[][]):
		    * función que muestra el contenido de una matriz por filas
		 * void trianguloSuperior(int [][]m):
		    * función que muestre el triangulo superior de una matriz
		 * void trianguloInferior(int [][]m):
		    * función que muestre el triangulo inferior de una matriz
		 */

		int[][] matriz = Libreria.crearMatriz();

		System.out.println("Matriz generada:");
		Libreria.mostrarMatriz(matriz);

		System.out.println("\nTriángulo Superior:");
		Libreria.trianguloSuperior(matriz);

		System.out.println("\nTriángulo Inferior:");
		Libreria.trianguloInferior(matriz);

	}

}
