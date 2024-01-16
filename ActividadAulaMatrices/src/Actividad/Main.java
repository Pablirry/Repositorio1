package Actividad;

import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int[][] notas = new int[4][10];
		for (int i = 0; i < notas.length; i++) {
			for (int j = 0; j < notas[i].length; j++) {
				System.out.print(
						"Introduce la nota para el Alumno A" + (j + 1) + " de la Clase " + (char) ('A' + i) + ": ");
				notas[i][j] = sc.nextInt();
			}
		}

		Libreria.notaMasAlta(notas);

		System.out.print("Introduce la letra del curso para calcular la media: ");
		char letra = sc.next().charAt(0);
		Libreria.calcularMediaCurso(notas, letra);

		int aprobados = Libreria.numeroAprobados(notas, letra);
		System.out.println("El número de alumnos aprobados en el curso " + letra + " es " + aprobados + ".");

		System.out.println("ESTADISTICA");
		Libreria.mostrarEstadisticasCurso(notas);

	}

}
