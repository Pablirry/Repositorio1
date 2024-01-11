package Actividad1;

public class Ejercicio_2 {

	public static void main(String[] args) {
		/*
		 * Escribir un programa con implemente las siguientes funciones para un
		 * vector de 10 posiciones de tipo entero.
		 * void leerVector(int v[]) lee 10 números de tipo entero y los
		 * almacene en un vector
		 * Implementar una función que muestre el contenido del vector
		 * indicando para cada elemento su posición en orden inverso.
		 */

		int[] vector = new int[10];

		Libreria.leerVector(vector);

		Libreria.mostrarVectorInverso(vector);

	}

}
