package Actividad;

public class Libreria {

	/**
	 * funcion que lee un vector y muestra si hay valle o no
	 * 
	 * @param v   : entero[]
	 * @param pos : entero
	 * @return boolean
	 */

	public static boolean esValle(int v[], int pos) {
		if (pos > 0 && pos < v.length - 1) {
			if (v[pos] > v[pos - 1] && v[pos] > v[pos + 1]) {
				return true;
			} else
				return false;
		}
		return false;
	}

	public static boolean esPico(int v[], int pos) {

		if (pos > 0 && pos < v.length - 1) {
			if (v[pos] > v[pos - 1] && v[pos] > v[pos + 1]) {
				return true;
			} else
				return false;
		}
		return false;
	}

	public static int numeroValle(int v[]) {
		int contador = 0;
		for (int i = 0; i < v.length - 1; i++) {
			if (esValle(v, i)) {
				contador++;
			}
		}
		return contador;
	}

	public static int valorPicoMasAlto(int v[]) {

		int max = Integer.MIN_VALUE;

		for (int i = 0; i < v.length - 1; i++) {
			if (esPico(v, i)) {
				if (v[i] > max) {
					max = v[i];
				}
			}
		}
		return max;
	}

	public static int numeroMesetas(int v[]) {
		int contador = 0;
		for (int i = 0; i < v.length - 1; i++) {
			if (v[i] == v[i + 1]) {
				contador++;
				while (v[i] == v[i + 1]) {
					i++;
				}
			}
		}
		return contador;
	}

}
