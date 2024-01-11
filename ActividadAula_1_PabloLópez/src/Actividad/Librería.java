package Actividad;

import java.util.Scanner;

public class Librería {

	static Scanner sc = new Scanner(System.in);

	/**
	 * Muestra un menu de opciones y pide la opcion por teclado
	 * 
	 * @param opcion : entero
	 * @return : entero
	 */

	public static int menu() {

		System.out.println("CALCULO DE AREAS");
		System.out.println("1. Calcular area de un triangulo");
		System.out.println("2. Calcular area de un trapecio");
		System.out.println("3. Calcular area de un rectangulo");
		System.out.println("4. Calcular area de un cuadrado");
		System.out.println("Introduce una opción: ");
		int opcion = sc.nextInt();
		return opcion;

	}

	/**
	 * Calcula el area de un triangulo y pide base y altura por teclado
	 * 
	 * @param base   : double
	 * @param altura : double
	 */

	public static void areaTriangulo() {

		double base;
		double altura;

		System.out.println("Introduce base triángulo: ");
		base = sc.nextDouble();
		System.out.println("Introduce altura triángulo: ");
		altura = sc.nextDouble();

		double areaT = (base * altura) / 2;
		System.out.println("El area del triángulo es: " + areaT);
	}

	/**
	 * Calcula el area de un trapecio y pide base pequeña, base grande y altura por
	 * teclado
	 * 
	 * @param baseP  : double
	 * @param baseG  : double
	 * @param altura : double
	 */

	public static void areaTrapecio() {

		double baseP;
		double baseG;
		double altura;

		System.out.println("Introduce base pequeña del trapecio: ");
		baseP = sc.nextDouble();
		System.out.println("Introduce base grande del trapecio: ");
		baseG = sc.nextDouble();
		System.out.println("Introduce altura del trapecio: ");
		altura = sc.nextDouble();

		double areaTrapecio = (baseP + baseG) * altura / 2;
		System.out.println("El area del trapecio es: " + areaTrapecio);

	}

	/**
	 * Calcula el area de un rectangulo y pide base y altura por teclado
	 * 
	 * @param base   : double
	 * @param altura : double
	 */

	public static void areaRectangulo() {

		double base;
		double altura;

		System.out.println("Introduce base del rectangulo: ");
		base = sc.nextDouble();
		System.out.println("Introduce altura del rectangulo: ");
		altura = sc.nextDouble();

		double areaRectangulo = base * altura;
		System.out.println("El area del rectángulo es: " + areaRectangulo);
	}

	/**
	 * Calcula area de un cuadrado y pide el lados
	 * 
	 * @param lado : double
	 */

	public static void areaCuadrado() {

		double lado;

		System.out.println("Introduce el lado: ");
		lado = sc.nextDouble();

		double areaCuadrado = lado * lado;
		System.out.println("El area del cuadrado es: " + areaCuadrado);

	}

}
