package Actividad1;

public class Actividad1 {

	public static void main(String[] args) {

		int vector[] = Libreria.leerVector();

		Libreria.imprimirVector(vector);

		Libreria.mostrarRepetidos(vector);

		Libreria.buscarAusentes(vector);

		System.out.println("El promedio del vector es: " + Libreria.promedio(vector));

	}

}
