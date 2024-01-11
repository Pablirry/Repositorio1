package EjerciciosRepaso4;

import java.util.Scanner;

public class Ejercicio_15 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("Ingrese el código del artículo: ");
		String codigoArticulo = sc.next();

		System.out.print("Ingrese la cantidad comprada: ");
		int cant = sc.nextInt();

		System.out.print("Ingrese el precio unitario: ");
		double precioUnidad = sc.nextDouble();

		double descuento = 0;
		double total = 0;

		if (cant > 100) {
			descuento = 0.4 * cant * precioUnidad; // Descuento del 40%
		} else if (cant >= 25) {
			descuento = 0.2 * cant * precioUnidad; // Descuento del 20%
		} else if (cant >= 10) {
			descuento = 0.1 * cant * precioUnidad; // Descuento del 10%
		}

		total = cant * precioUnidad - descuento;

		System.out.println("Códigon artículo: " + codigoArticulo);
		System.out.println("Cantidad comprada: " + cant);
		System.out.println("Precio por unidad: " + precioUnidad);
		System.out.println("Descuento: " + descuento);
		System.out.println("Precio total: " + total);

	}

}
