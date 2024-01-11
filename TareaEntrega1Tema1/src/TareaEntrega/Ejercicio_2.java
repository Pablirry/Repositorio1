package TareaEntrega;

import java.util.Scanner;

public class Ejercicio_2 {
	
	static Scanner sc = new Scanner(System.in);


	public static void main(String[] args) {
		/*
		 * Diseñar un algoritmo que calcule el numero de mensualidades necesarias para
		 * que una persona devuelva el prestamos que adquirió en la compra de un
		 * producto, teniendo en cuenta que cada cuanta será el doble de la anterior y
		 * además el importe íntegro a devolver será incrementado en un 5%. El programa
		 * debe informar del importe final y el número de cuantías. También deberá
		 * mostrar el importe de cada cuantía
		 */
		
		System.out.print("Precio del producto: ");
        double PrecioProducto = sc.nextDouble();

        double importeInicial = PrecioProducto;
        double CantDevolver = importeInicial * 1.05; // Incremento del 5%
        double PrimerImporte = 10; // Cuantía inicial
        double CantPend = CantDevolver;
        int numMeses = 0;

        System.out.println("Importe final a devolver: " + CantDevolver + "€");
        System.out.println("Cuantías:");

        while (CantPend > 0) {
            numMeses++;
            if (CantPend < PrimerImporte) {
                PrimerImporte = CantPend; // Ajusta la cuantía al saldo a devolver en el último mes
            }
            CantPend -= PrimerImporte;

            System.out.println("mes " + numMeses + ": " + PrimerImporte + "€ (Cantidad pendiente: " + CantPend + "€)");
            PrimerImporte *= 2;
        }
        System.out.println("Número de cuantias: " + numMeses);

        sc.close();

	}

}
