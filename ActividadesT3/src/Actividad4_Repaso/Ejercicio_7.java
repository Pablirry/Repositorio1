package Actividad4_Repaso;

public class Ejercicio_7 {

	public static void main(String[] args) {

		/*
		 * Determinar si una matriz de nxn es mágica. Una matriz es mágica si la suma de
		 * cada fila, columna y diagonales es la misma.
		 * Implementar las siguientes funciones
		 * int sumaFila(int m[][], int fila)
		 * int sumaColumna(int m[][], int columna)
		 * int sumaDiagonalPrincipal(int m[][])
		 * int sumaDiagonalSecundaria(int m[][])
		 */

		int[][] matriz = {
				{ 8, 1, 6 },
				{ 3, 5, 7 },
				{ 4, 9, 2 }
		};

		int[][] matriz2 = {
			{ 8, 1, 6 },
			{ 3, 5, 7 },
			{ 4, 5, 2 }
	};

		System.out.println("MATRIZ 1:");
		Libreria.mostrarMatriz(matriz);

		if (Libreria.esMatrizMagica(matriz)) {
			System.out.println("La matriz es mágica.");
		} else {
			System.out.println("La matriz no es mágica.");
		}

		System.out.println("MATRIZ 2:");
		Libreria.mostrarMatriz(matriz2);

		if (Libreria.esMatrizMagica(matriz2)) {
			System.out.println("La matriz es mágica.");
		} else {
			System.out.println("La matriz no es mágica.");
		}



	}

}
