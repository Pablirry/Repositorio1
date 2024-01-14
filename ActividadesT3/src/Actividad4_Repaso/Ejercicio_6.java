package Actividad4_Repaso;

import java.util.Scanner;

public class Ejercicio_6 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		/*
		 * Realizar un programa que ingrese las notas de n estudiantes en m asignaturas.
		 * Obtener la media de los n estudiantes y almacenarlos en un vector
		 * Método para mostrar el estudiante con mayor y menor media
		 * Método para mostrar el estudiante con la menor nota obtenida en cualquier asignatura
		 * Método para mostrar el estudiante con mayor nota en la asignatura 3
		 * Método para mostrar la media de la asignatura 1
		 */

		System.out.print("Ingrese el número de estudiantes (n): ");
        int n = sc.nextInt();

        System.out.print("Ingrese el número de asignaturas (m): ");
        int m = sc.nextInt();

        // Crear matriz para almacenar las notas de los estudiantes en cada asignatura
        double[][] notas = new double[n][m];

        // Ingresar las notas de los estudiantes
        Libreria.ingresarNotas(sc, notas);

        // Calcular la media de los estudiantes y almacenarlas en un vector
        double[] mediasEstudiantes = Libreria.calcularMediasEstudiantes(notas);

        // Mostrar el estudiante con mayor y menor media
        Libreria.mostrarEstudianteConMayorYMenorMedia(mediasEstudiantes);

        // Mostrar el estudiante con la menor nota en cualquier asignatura
		Libreria.mostrarEstudianteConMenorNota(notas);

        // Mostrar el estudiante con la mayor nota en la asignatura 3
        Libreria.mostrarEstudianteConMayorNotaAsignatura(notas, 2);

        // Mostrar la media de la asignatura 1
        Libreria.mostrarMediaAsignatura(notas, 0);

	}

}
