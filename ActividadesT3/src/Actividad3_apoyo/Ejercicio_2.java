package Actividad3_apoyo;

import java.util.Scanner;

public class Ejercicio_2 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		/*
		 * void leerVector(int v[])
		 * void mostrarVector(int v[])
		 * void máximo(int v[])
		 * void mínimo(int v[])
		 * void posicionValorMaximo(int v[])
		 * void posicionValorMinimo(int v[])
		 * boolean buscarValor(int v[], int valor) : retorna true si lo encuentra
		 * int v[] productoVectorial(int a[], int b[])
		 * int [] generarVectorAleatorio(int num); crear un vector que almacene los
		 * números generados de forma aleatoria comprendidos entre 1 y el parámetro num.
		 * void calcularDesviación(int v[])
		 * Se define la desviación como la media de la diferencia entre el valor origina
		 * y la media de los valores del vector.
		 * Funciones auxiliares:
		 * int media(int v[])
		 * int [] calculaDiferencia(int v[])
		 */

		int a[] = Libreria2.generarVectorAleatorio(10, 9);
		Libreria2.mostrarVector(a);
		System.out.println("Maximo: " + Libreria2.maximo(a));
		System.out.println("Minimo: " + Libreria2.minimo(a));
		Libreria2.posicionValorMaximo(a);
		Libreria2.posicionValorMinimo(a);
		Libreria2.calcularDesviación(a);
	}

}
