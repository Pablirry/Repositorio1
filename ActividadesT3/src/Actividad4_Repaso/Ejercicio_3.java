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

		char[] sec1 = { 'A', 'T', 'G', 'C', 'G', 'T', 'A', 'T' };
		char[] sec2 = { 'A', 'T', 'A', 'T', 'G', 'C', 'G', 'T' };

		boolean resul = Libreria.compararADN(sec1, sec2);

		System.out.println("Cadena 1: " +new String(sec1));
		System.out.println("Cadena 2: " +new String(sec2));

		if (resul==true){
			System.out.println("Las cadenas de ADN coinciden");
		}else{
			System.out.println("Las cadenas de ADN no coinciden");
		}

		

	}

	
}
