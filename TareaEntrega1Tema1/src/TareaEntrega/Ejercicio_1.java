package TareaEntrega;

import java.util.Scanner;

public class Ejercicio_1 {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		/*
		 * Escribe un programa que pida el límite inferior y superior de un intervalo.
		 * Si el límite inferior es mayor que el superior lo tiene que volver a pedir. A
		 * continuación, se van introduciendo números hasta que introduzcamos el 0.
		 * Cuando termine el programa dará las siguientes informaciones
		 * La suma de los números que están dentro del intervalo (intervalo abierto
		 * Cuantos números están fuera del intervalo.
		 * Informa si hemos introducido algún número igual a los límites del intervalo
		 */
		
		System.out.println("Introduce numero inferior del intervalo: ");
		int inferior = sc.nextInt();
		System.out.println("Introduce numero superior del intervalo: ");
		int superior = sc.nextInt();

		while (inferior > superior) {
			System.out.println("Intervalo invalido. El limite inferior no puede ser mayor.");
			System.out.println("Introduce numero inferior del intervalo: ");
			inferior = sc.nextInt();
			System.out.println("Introduce numero superior del intervalo: ");
			superior = sc.nextInt();
		}

		double sum = 0;
		int contdentro = 0;
		int contfuera = 0;
		int limitesIg = 0;
		boolean seguir = true;

		while (seguir) {
			System.out.println("Introduce numero: ");
			double n = sc.nextDouble();

			if (n == 0) {
				seguir=false;
			}
			if (n < inferior || n > superior) {
				contfuera++;
			} else if (n == inferior || n == superior) {
				limitesIg++;
			} else {
				sum += n;
				contdentro++;
			}
		}

		System.out.println("La suma de los numeros dentro del intervalo es de: " + sum);
		System.out.println("Numeros fuera del intervalo: " + contfuera);
		System.out.println("Numeros dentro del intervalo: " + contdentro);
		System.out.println("Numeros introducidos iguales a los limites del intervalo: " + limitesIg);

	}

}
