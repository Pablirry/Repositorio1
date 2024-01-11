package Actividad3_apoyo;

import java.util.Scanner;

public class Ejercicio_2 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int a[] = Libreria2.generarVectorAleatorio(10, 9);
		Libreria2.mostrarVector(a);
		System.out.println("Maximo: " + Libreria2.maximo(a));
		System.out.println("Minimo: " + Libreria2.minimo(a));
		Libreria2.posicionValorMaximo(a);
		Libreria2.posicionValorMinimo(a);
		Libreria2.calcularDesviación(a);
	}

}
