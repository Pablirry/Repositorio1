package TareaEntrega;

import java.util.Scanner;

public class Ejercicio_2 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("dia ");
		int dia = sc.nextInt();
		System.out.println("mes ");
		int mes = sc.nextInt();
		System.out.println("año ");
		int year = sc.nextInt();

		while (Libreria.validarFecha(dia, mes, year) == false) {

			System.out.println("ERROR. Introduce nueva fecha");
			System.out.println("dia ");
			dia = sc.nextInt();
			System.out.println("mes ");
			mes = sc.nextInt();
			System.out.println("año ");
			year = sc.nextInt();
		}

		System.out.println("Total dias: " + Libreria.calcularDias(dia, mes, year));

		int valor = Libreria.calcularDias(dia, mes, year) % 7;

		switch (valor) {
			case 0: {
				System.out.println("Día de la semana: Sábado");
				break;
			}
			case 1: {
				System.out.println("Día de la semana: Domingo");
				break;
			}
			case 2: {
				System.out.println("Día de la semana: Lunes");
				break;
			}
			case 3: {
				System.out.println("Día de la semana: Martes");
				break;
			}
			case 4: {
				System.out.println("Día de la semana: Miércoles");
				break;
			}
			case 5: {
				System.out.println("Día de la semana: Jueves");
				break;
			}
			case 6: {
				System.out.println("Día de la semana: Viernes");
				break;
			}
			default:

		}

	}

}
