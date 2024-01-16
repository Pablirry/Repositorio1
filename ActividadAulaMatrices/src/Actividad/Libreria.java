package Actividad;

public class Libreria {

	/**
	 * Funcion que muestra la nota mas alta de un curso.o en el caso de que se haya
	 * obtenido un 10, que muestre los que lo obtuvieron
	 * 
	 * @param notas : entero[][]
	 */

	public static void notaMasAlta(int notas[][]) {

		int numClases = notas.length;

		if (numClases > 0) {
			int numAlumnos = notas[0].length;

			int maxNota = -1;
			int claseMaxNota = -1;
			int alumnoMaxNota = -1;

			for (int i = 0; i < numClases; i++) {
				for (int j = 0; j < numAlumnos; j++) {
					if (notas[i][j] == 10) {
						System.out.println(
								"Alumno A" + (j + 1) + " de la Clase " + (char) ('A' + i) + " ha obtenido un 10.");

					}

					if (notas[1][j] > maxNota) {
						maxNota = notas[i][j];
						claseMaxNota = i + 1;
						alumnoMaxNota = j + 1;
					}

				}

			}

			if (maxNota != -1) {
				System.out.println("La nota más alta es " + maxNota + " y fue obtenida por el Alumno A" + alumnoMaxNota
						+ " de la Clase " + (char) ('A' + claseMaxNota - 1) + ".");
			} else {
				System.out.println("No hay ninguna nota igual a 10.");
			}

		}

	}

	/**
	 * Funcion para calcular la media de un curso
	 * 
	 * @param notas : entero[][]
	 * @param letra : char
	 */

	public static void calcularMediaCurso(int[][] notas, char letra) {

		int numClases = notas.length;
		int sumaNotas = 0;
		int numAlumnosCurso = 0;

		for (int i = 0; i < numClases; i++) {
			if ((char) ('A' + i) == letra) {
				for (int j = 0; j < notas[i].length; j++) {
					sumaNotas += notas[i][j];
					numAlumnosCurso++;
				}
			}
		}

		if (numAlumnosCurso > 0) {
			double media = (double) sumaNotas / numAlumnosCurso;
			System.out.println("La nota media del curso " + letra + " es: " + media);
		}

	}

	/**
	 * Funcion para calcular el numero de alumnos aprobados en un curso
	 * 
	 * @param notas : entero[][]
	 * @param letra : char
	 * @return entero
	 */

	public static int numeroAprobados(int[][] notas, char letra) {

		int numClases = notas.length;
		int aprobados = 0;

		for (int i = 0; i < numClases; i++) {
			if ((char) ('A' + i) == letra) {
				for (int j = 0; j < notas[i].length; j++) {
					if (notas[i][j] >= 5) {
						aprobados++;
					}
				}
			}
		}

		return aprobados;

	}

	/**
	 * Funcion para calcular el numero de alumnos suspensos en un curso
	 * 
	 * @param notas : entero[][]
	 * @param letra : char
	 * @return : entero
	 */

	public static int numeroSuspensos(int[][] notas, char letra) {

		int numClases = notas.length;
		int suspensos = 0;

		for (int i = 0; i < numClases; i++) {
			if ((char) ('A' + i) == letra) {
				for (int j = 0; j < notas[i].length; j++) {
					if (notas[i][j] < 5) {
						suspensos++;
					}
				}
			}
		}

		return suspensos;

	}

	/**
	 * Funcion para calcular el numero de alumnos aprobados y suspensos por cada
	 * curso
	 * 
	 * @param notas : entero[][]
	 */

	public static void mostrarEstadisticasCurso(int[][] notas) {

		int numClases = notas.length;

		for (int i = 0; i < numClases; i++) {
			int aprobados = 0;
			int suspensos = 0;

			for (int j = 0; j < notas[i].length; j++) {
				if (notas[i][j] >= 5) {
					aprobados++;
				} else {
					suspensos++;
				}
			}

			System.out.println("Clase " + (char) ('A' + i) + ": Aprobados: " + aprobados + ", Suspensos: " + suspensos);
		}
	}

}
