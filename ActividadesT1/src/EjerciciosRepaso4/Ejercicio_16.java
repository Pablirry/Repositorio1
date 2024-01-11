package EjerciciosRepaso4;

import java.util.Scanner;

public class Ejercicio_16 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		/*
		 * El mínimo común múltiplo de dos números positivos cumple la siguiente
		 * propiedad: Cada vez que se hace una operación, los números son más sencillos.
		 * Al final, ambos números son iguales y coinciden con el mcd de a y b. Por
		 * ejemplo: Si queremos calcular el máximo común divisor de 15 y 21, seguimos la
		 * siguiente cadena:mcd(15,21)=mcd(15,21−15)=mcd (15,6)=mcd
		 * (6,15−6)=mcd(6,9)=mcd (6,9−6)=mcd(6,3)=mcd(3,6−3)=mcd (3,3)=3Escribir un
		 * programa que reciba dos números enteros positivos y calcule mediante el
		 * procedimiento anterior su máximo común divisor.
		 */

		System.out.println("Introduce el primer número: ");
		int n1 = sc.nextInt();
		System.out.println("Introduce el segundo numero: ");
		int n2 = sc.nextInt();

		System.out.print("El máximo común divisor de " + n1 + " y " + n2 + " es: ");

		while (n2 != 0) {
			int resto = n1 % n2;
			n1 = n2;
			n2 = resto;
		}

		System.out.print(n1);

	}

}
