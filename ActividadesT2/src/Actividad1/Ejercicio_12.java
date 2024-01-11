package Actividad1;

import java.util.Scanner;

public class Ejercicio_12 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		/*
		 * Utilizando la función anterior, calcula un numero combinatorio
		 * (n k)=n!/(k!(n-k)!)
		 */

		System.out.println("introduce n: ");
		int n = sc.nextInt();
		System.out.println("introduce k: ");
		int k = sc.nextInt();

		int nFactorial = Libreria.factorial(n);
		int kFactorial = Libreria.factorial(k);
		int nmkFactorial = Libreria.factorial(n - k);

		int combinatorio = nFactorial / (kFactorial * nmkFactorial);

		System.out.println("El combinatorio (" + n + " " + k + ") es: " + combinatorio);

	}

}
