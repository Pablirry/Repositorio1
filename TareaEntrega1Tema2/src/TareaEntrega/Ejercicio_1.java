package TareaEntrega;

import java.util.Scanner;

public class Ejercicio_1 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("Introduce el número del DNI: ");
		int dni = sc.nextInt();

		char letra = Libreria.letraDni(dni);

		while (Libreria.compruebaDNI(dni) == false) {
			System.out.println("ERROR en el dni");
			System.out.println("nuevo dni");
			dni = sc.nextInt();
		}

		System.out.print("Introduce la letra del DNI: ");
		letra = sc.next().charAt(0);

		letra = Character.toUpperCase(letra);

		if (Libreria.dniValido(dni, letra)) {
			System.out.println("El numero es valido. ");
		} else {
			System.out.println("El numero no es valido. ");
		}

	}

}
