package EjerciciosRepaso4;

import java.util.Random;

public class Ejercicio_9 {

	public static void main(String[] args) {

		/*
		 * Diseñe un algoritmo que califique el puntaje obtenido en el lanzamiento de
		 * tres dados en base a la cantidad de seis obtenidos
		 * (estos números deben ser generados aleatoriamente), de acuerdo a lo
		 * siguiente: a) Tres seis : Oro, b) Dos seis : Plata, c) Un seis : Bronce, d)
		 * ningún seis :Perdiste
		 */

		Random random = new Random();

		int dado1 = random.nextInt(6) + 1; // Genera un número aleatorio entre 1 y 6
		int dado2 = random.nextInt(6) + 1;
		int dado3 = random.nextInt(6) + 1;

		System.out.println("Resultados de los tres dados: " + dado1 + ", " + dado2 + ", " + dado3);

		int cont = 0;

		if (dado1 == 6) {
			cont++;
		}
		if (dado2 == 6) {
			cont++;
		}
		if (dado3 == 6) {
			cont++;
		}

		if (cont == 3) {
			System.out.println("Oro");
		} else if (cont == 2) {
			System.out.println("Plata");
		} else if (cont == 1) {
			System.out.println("Bronce");
		} else {
			System.out.println("Perdiste");
		}

	}

}
