package Actividad4_Repaso;

public class Ejercicio_1 {

	public static void main(String[] args) {

		/*
		 * Implementar un método insertaValor, que recibe como parámetros:
		 * Un vector reales.
		 * Un valor real.
		 * Una posición como valor entero.
		 * Inserta el valor en la posición indicada. Retorna un vector con el valor
		 * incluido.
		 * Nota: Insertar un elemento en el vector desplaza una posición hacia la
		 * derecha a los elementos del vector que han de quedar detrás del elemento
		 * insertado. Además, la inserción ocasiona la “desaparición” del último
		 * elemento del vector.
		 */
		System.out.println("VECTOR");
		int v[] = { 2, 5, 8, 9, 3, 4, 6, 7 };
		Libreria.mostrarVector(v);
		System.out.println("VECTOR INSERTANDO VALOR 11 EN POSICION 3");
		Libreria.insertaValor(v,11,3);
		Libreria.mostrarVector(v);
		System.out.println("VECTOR INSERTANDO VALOR 13 EN POSICION -2");
		Libreria.insertaValor(v,13,-2); //error posicion negativa
		Libreria.mostrarVector(v);
		System.out.println("VECTOR INSERTANDO VALOR 13 EN POSICION 8");
		Libreria.insertaValor(v,13,8); //error posicion fuera de rango
		Libreria.mostrarVector(v);
		System.out.println("VECTOR INSERTANDO VALOR 12 EN POSICION 5");
		Libreria.insertaValor(v,12,5);
		Libreria.mostrarVector(v);

	}

	

}
