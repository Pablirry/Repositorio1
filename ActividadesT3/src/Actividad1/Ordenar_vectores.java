package Actividad1;

import java.util.Scanner;

public class Ordenar_vectores {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		double vector[] = generarVector();

		mostrarVector(vector);
		ordena(vector);

	}

	public static void ordena(double v[]) {
		for (int iter = 0; iter < v.length; iter++) {
			double pivote = v[0];
			int posPivote = 0;
			for (int i = iter + 1; i < v.length; i++) {
				if (v[i] < pivote) {
					pivote = v[i];
					posPivote = i;
				}
			}
			// intercambiar

			double aux = v[iter];
			v[iter] = v[posPivote];
			v[posPivote] = aux;
		}

	}

	private static void mostrarVector(double[] v) {

		for (int i = 0; i < v.length; i++) {
			System.out.println(v[i] + ", ");
		}
		System.out.println();

	}

	private static double[] generarVector() {
		System.out.println("Dim: ");
		int dim = sc.nextInt();

		return new double[dim];
	}

}
