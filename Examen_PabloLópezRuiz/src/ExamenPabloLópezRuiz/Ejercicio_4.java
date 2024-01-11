package ExamenPabloLópezRuiz;

import java.util.Scanner;

public class Ejercicio_4 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int dia = 0, mes = 0, ano = 0, magico = 0;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Introduce el día de nacimiento: ");
		dia = keyboard.nextInt();
		System.out.println("Introduce el mes de nacimiento: ");
		mes = keyboard.nextInt();
		System.out.println("Introduce el año de nacimiento: ");
		ano = keyboard.nextInt();
		keyboard.close();
		magico = dia + mes + ano;
		while (magico > 9) {
			int sum = 0;
			while (magico > 0) {
				sum += magico % 10;
				magico /= 10;
			}
			magico = sum;
		}
		System.out.println("El número mágico de " + dia + "/" + mes + "/" + ano + " es " + magico);
	}

}
