package ExamenPabloLópezRuiz;

import java.util.Scanner;

public class Ejercicio_1 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Introduce un número: ");
		double n1 = sc.nextDouble();
		System.out.println("Introduce un número: ");
		double n2 = sc.nextDouble();
		System.out.println("Introduce un número: ");
		double n3 = sc.nextDouble();

		if (n1 == n2 && n2 == n3) {
			System.out.println("Has escrito el mismo número 3 veces");
		} else if (n1 == n2 || n2 == n3 || n1 == n3) {
			System.out.println("Has escrito el mismo número 2 veces");
		} else {
			System.out.println("Los tres numeros que has escrito son distintos");
		}
	}

}
