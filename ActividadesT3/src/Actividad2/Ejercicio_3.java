package Actividad2;

import java.util.Scanner;

public class Ejercicio_3 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		
		int[][] m = Libreria.crearMatrizReloj();
		Libreria.mostrarMatriz(m);
		System.out.println();
		
		Libreria.mostrarRelojDeArena(m);

	}

}
