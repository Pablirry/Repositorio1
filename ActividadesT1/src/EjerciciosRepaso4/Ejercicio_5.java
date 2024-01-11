package EjerciciosRepaso4;

public class Ejercicio_5 {

	public static void main(String[] args) {

		/*
		 * Crea un algoritmo para la sucesión de Fibonacci.
		 */

		int n = 10;

		int a = 0;
		int b = 1;

		System.out.println("Fibonacci:");

		for (int i = 0; i < n; i++) {
			System.out.print(a);

			if (i < n - 1) {
				System.out.print(", ");

			}
			int aux = a;
			a = b;
			b = aux + b;
		}

	}

}
