package Actividad;

public class Ejercicio {

	public static void main(String[] args) {

		int opcion = Librería.menu();

		if (opcion == 1) {

			Librería.areaTriangulo();

		} else if (opcion == 2) {

			Librería.areaTrapecio();
		} else if (opcion == 3) {

			Librería.areaRectangulo();
		} else if (opcion == 4) {

			Librería.areaCuadrado();

		}

	}

}
