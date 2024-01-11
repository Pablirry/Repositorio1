package Actividad1;

public class Ejercicio_9 {

	public static void main(String[] args) {
		/*
		 * En Java, para generar números pseudoaleatorios, se puede utilizar la
		 * función Math.random() definida en la clase java.lang.Math. Dicha
		 * función genera una secuencia de números pseudoaleatorios que se
		 * supone sigue una distribución uniforme (esto es, todos los valores
		 * aparecerán con la misma probabilidad). Escriba un programa que
		 * compruebe si el generador de números pseudoaleatorios de Java
		 * genera realmente números aleatorios con una distribución uniforme.
		 * Sugerencia: Genere un gran número de números aleatorios (entre 0 y 100, por
		 * ejemplo) comprendidos entre 1 y 10 y compruebe que la
		 * distribución resultante del número de veces que aparece cada
		 * número es (más o menos) uniforme. Para ello, una vez calculado el
		 * vector, realizaremos el conteo de cuantas veces aparece cada valor.
		 * Una vez realizado el conteo, calcular la media y ver si la dispersión de
		 * los valores es compacta.
		 */

		int v[] = new int[200];
		Libreria.generarVector(v);
		int contVeces[] = new int[11];
		for(int i=0;i<=10;i++){
			contVeces[i] = Libreria.contarValor(v,i);
		}
		Libreria.mostrarVector(contVeces);
		int media=Libreria.calcularMedia(contVeces);

		System.out.println("Media: " +media);

		

	}

	

}
