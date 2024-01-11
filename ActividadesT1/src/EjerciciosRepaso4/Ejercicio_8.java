package EjerciciosRepaso4;

import java.util.Random;

public class Ejercicio_8 {

	public static void main(String[] args) {

		/*
		 * Haz un motor de videojuegos para dos personajes (A y B). Funciona de la
		 * siguiente manera:
		 * Empieza el combate y se decide aleatoriamente quien empieza.
		 * Si ataca A restará su ataqueA a defensaB.
		 * Cambio de turno. Le toca a B. Realiza el ataque.
		 * Así hasta que alguno sea derrotado.
		 * Inicialmente parten con un valor aleatorio de puntos entre 1 – 100. Cada
		 * ataque viene determinado por dos valores aleatorios entre 1 – 50. Y siempre
		 * el mismo durante el combate
		 */

		Random random = new Random();

		// Inicialización de los personajes A y B
		int puntosA = random.nextInt(100) + 1; // Puntos iniciales de A (1-100)
		int puntosB = random.nextInt(100) + 1; // Puntos iniciales de B (1-100)
		int ataqueA = random.nextInt(50) + 1; // Valor de ataque de A (1-50)
		int ataqueB = random.nextInt(50) + 1; // Valor de ataque de B (1-50)
		int defensaB = random.nextInt(50) + 1; // Valor de defensa de B (1-50)

		boolean turnoA = random.nextBoolean(); // Decide aleatoriamente quién empieza

		System.out.println("Puntos de A: " + puntosA);
		System.out.println("Puntos de B: " + puntosB);

		// Comienza el combate
		while (puntosA > 0 && puntosB > 0) {
			if (turnoA) {
				// Ataque de A a B
				int danoA = ataqueA - defensaB;
				if (danoA > 0) {
					puntosB -= danoA;
				}
				System.out.println("A ataca a B por " + danoA + " puntos. Le quedan: " + puntosB);
			} else {
				// Ataque de B a A
				int danoB = ataqueB;
				puntosA -= danoB;
				System.out.println("B ataca a A y le quita " + danoB + " puntos. Le quedan: " + puntosA);
			}

			turnoA = !turnoA; // Cambio de turno
		}

		if (puntosA <= 0) {
			System.out.println("¡B gana el combate!");
		} else {
			System.out.println("¡A gana el combate!");
		}

	}

}
