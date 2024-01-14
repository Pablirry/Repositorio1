package Actividad4_Repaso;

public class Ejercicio_3 {

	public static void main(String[] args) {

		/*
		 * Una cadena de ADN se representa como una secuencia circular de bases
		 * (adenina, timina, citosina y guanina) que es única para cada ser vivo.
		 * Dicha cadena se puede representar como un vector de caracteres recorriéndola
		 * en sentido horario desde la parte superior izquierda:
		 * Se pide diseñar un método booleano que nos devuelva true si dos cadenas de
		 * ADN coinciden. MUY IMPORTANTE: La secuencia de ADN es cíclica, por lo que
		 * puede comenzar en cualquier posición.
		 */

		char[] cadenaADN1 = { 'A', 'T', 'G', 'C', 'G', 'T', 'A', 'T' };
		char[] cadenaADN2 = { 'A', 'T', 'G', 'T', 'G', 'C', 'G', 'T' };

		// Llamada al método que compara las cadenas de ADN
		boolean coinciden = Libreria.compararADN(cadenaADN1, cadenaADN2);

		// Mostrar las cadenas de ADN
        System.out.println("Cadena de ADN 1: " + new String(cadenaADN1));
        System.out.println("Cadena de ADN 2: " + new String(cadenaADN2));

		// Mostrar el resultado
		if (coinciden) {
			System.out.println("Las cadenas de ADN coinciden.");
		} else {
			System.out.println("Las cadenas de ADN no coinciden.");
		}

	}

	
}
