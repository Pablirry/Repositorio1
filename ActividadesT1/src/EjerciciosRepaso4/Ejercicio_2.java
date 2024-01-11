package EjerciciosRepaso4;

import java.util.Scanner;

public class Ejercicio_2 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("Introduce numero: ");
		int tope = sc.nextInt();
		for (int i = 1; i <= tope; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print(j + "    ");
			}

			System.out.println();
		}

		for (int i = tope - 1; i >= 1; i--) {

			for (int j = 1; j <= i; j++) {
				System.out.print(j + "    ");
			}

			System.out.println();
		}

	}

}
