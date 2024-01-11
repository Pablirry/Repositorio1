package EjerciciosRepaso3;

import java.util.Scanner;

public class Ejercicio_4 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		/*
		 * Escribir un programa en Java para adivinar un número entre 1 y 20 que
		 * previamente se ha definido como una constante. El programa irá pidiendo
		 * números al usuario y, siempre que dicho número no coincida con el número
		 * secreto, le indicará si el número introducido es mayor o menor que el número
		 * secreto que tiene que adivinar. Al final, el programa indicará la cantidad de
		 * intentos que se han necesitado para adivinar el número. Si el número de
		 * intentos es menor que 5 se mostrará “Enhorabuena!”. Si es un valor entre 5 y
		 * 10 se mostrará el mensaje “No está mal”. Si el número de intentos es mayor
		 * que 10 se mostrará el mensaje “Debe practicar más”. Para calcular números
		 * aleatorios Math.ramdom()*CantidadNumeros+inicio
		 */

		final int NUMSECRETO = (int) (Math.random() * 20 + 1);

		int intentos = 0;
		boolean cierto = false;

		while (!cierto) {
			intentos++;

			System.out.println("Introduce un número entre 1 y 20: ");
			int n = sc.nextInt();

			if (n == NUMSECRETO) {
				cierto = true;
			} else if (n < NUMSECRETO) {
				System.out.println("El número secreto es mayor");
			} else {
				System.out.println("El número secreto es menor");
			}

		}
		System.out.println("Intentos: " + intentos);

		if (intentos < 5) {
			System.out.println("Enhorabuena!");
		} else if (intentos >= 5 && intentos < 10) {
			System.out.println("No está mal");
		} else {
			System.out.println("Debe practicar más");
		}

	}

}
