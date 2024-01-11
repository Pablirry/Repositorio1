package Actividad1;

public class Actividad1 {

	public static void main(String[] args) {

		int[][] mat_mccdu = { { 5, 6, 2, -4 }, { 6, 7, 8, 3 }, { 10, 4, -5, 9 }, { 4, -7, 1, 12 } };

		int[][] no_mat_mccdu = { { 5, 6, 2, -4 }, { 6, 7, 8, 3 }, { 10, 7, 7, 9 }, {
				4, -7, 1, 12 } };

		int[][] matriz = new int[0][0];
		Libreria.leerMatriz(matriz);

		System.out.println("\nMatriz o matrices ingresadas:");

		Libreria.imprimeMatriz(matriz);
		System.out.println("-------------");
		Libreria.imprimeMatriz(mat_mccdu);
		System.out.println("-------------");
		Libreria.imprimeMatriz(no_mat_mccdu);

		if (Libreria.mccud(matriz)) {
			System.out.println("\nLa matriz 1 es MCCUD.");
		} else {
			System.out.println("\nLa matriz 1 no es MCCUD.");
		}
		if (Libreria.mccud(mat_mccdu)) {
			System.out.println("\nLa matriz 2 es MCCUD.");
		} else {
			System.out.println("\nLa matriz 2 no es MCCUD.");
		}
		if (Libreria.mccud(no_mat_mccdu)) {
			System.out.println("\nLa matriz 3 es MCCUD.");
		} else {
			System.out.println("\nLa matriz 3 no es MCCUD.");
		}

	}
}