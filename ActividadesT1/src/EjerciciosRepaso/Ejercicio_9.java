package EjerciciosRepaso;

import java.util.Scanner;

public class Ejercicio_9 {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

				/*
				 * Leer por teclado un número entero N no negativo y mostrar la suma de los
				 * factoriales de todos los números desde 0 hasta N. Este ejercicio es una
				 * variante del anterior. Para resolverlo basta con añadir otra variable suma
				 * que actúe como acumulador donde sumaremos el factorial obtenido de cada
				 * número. La variable suma también se ha declarado de tipo double igual que la
				 * variable factorial.
				 */

				System.out.print("Introduce un número entero positivo: ");
				
				int n = sc.nextInt();

				long suma = 0;

				if (n < 0) {
					System.out.println("Debes introducir un número entero positivo.");
				} else {
					for (int i = 0; i <= n; i++) {
						long factorial = 1;
						for (int j = 2; j <= i; j++) {
							factorial *= j;

						}
						System.out.println(i + "! = " + factorial);
						suma += factorial;

					}
				}

				System.out.println("La suma de los factoriales desde 0 hasta " + n + " es: " + suma);
			}

		
	}


