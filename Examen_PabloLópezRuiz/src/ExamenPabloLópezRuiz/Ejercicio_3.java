package ExamenPabloLópezRuiz;

import java.util.Scanner;

public class Ejercicio_3 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Introdce un numero: ");
		int n = sc.nextInt();

		if (n > 0) {
			int aux = n;
			int raiz = (aux + 1) / 2;

			while (aux - raiz != 0) {
				aux = raiz;
				raiz = (aux + n / aux) / 2;
			}
			System.out.println("La raiz de " + n + " es: " + raiz);
		} else {
			System.out.println("No se puede calcular la raiz de un numero negativo");
		}

	}

}
