package ExamenPabloLópezRuiz;

import java.util.Scanner;

public class Ejercicio_2 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Introduce un numero: ");
		double n = sc.nextDouble();
		double mayor = n;

		while (true) {
			System.out.println("Introduce otro numero: ");
			n = sc.nextDouble();

			if (n > mayor) {
				mayor = n;
			} else {
				break;
			}
		}

		System.out.println(n + " no es mayor que " + mayor);

	}
}