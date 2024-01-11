package EjerciciosRepaso4;

import java.util.Scanner;

public class Ejercicio_4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Intoduce el número de vendedores: ");
		int n = sc.nextInt();

		System.out.print("Introduce el sueldo base de cada vendedor: ");
		double sueldoBase = sc.nextDouble();

		// Iterar a través de cada vendedor
		for (int i = 1; i <= n; i++) {
			System.out.println("Vendedor (" + i + "): ");

			// Inicializar el total de comisiones para este vendedor
			double totalComisiones = 0.0;

			// Calcular comisión para cada venta (se asume 3 ventas por semana)
			for (int venta = 1; venta <= 3; venta++) {
				System.out.print("Introduce el precio de la venta " + venta + ": ");
				double montoVenta = sc.nextDouble();

				// Calcular la comisión (10% del monto de la venta)
				double comision = 0.10 * montoVenta;
				totalComisiones += comision;
			}

			// Calcular el salario total (sueldo base + comisiones)
			double salarioTotal = sueldoBase + totalComisiones;

			System.out.println("Comisiones de la semana: " + totalComisiones + "€");
			System.out.println("Salario total de la semana: " + salarioTotal + "€");
			System.out.println();
		}

		sc.close();
	}
}
