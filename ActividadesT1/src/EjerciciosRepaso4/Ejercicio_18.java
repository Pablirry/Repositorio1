package EjerciciosRepaso4;

public class Ejercicio_18 {

	public static void main(String[] args) {

		/*
		 * Escribir un programa que muestre los números del 1 al 99, pero si el número
		 * es múltiplo de 3 o acaba en 3, escriba ** en su lugar. Los números se
		 * mostrarán separados por un espacio: 1 2 ** 4 5 ** 7 8 ** 10 11 ** ** 14 **
		 * [...y así sucesivamente]
		 */

		for (int i = 1; i <= 99; i++) {
			if (i % 3 == 0 || i % 10 == 3) {
				System.out.print(" ** ");
			} else {
				System.out.print(i + " ");
			}
		}

	}

}
