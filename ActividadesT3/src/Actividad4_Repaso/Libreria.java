package Actividad4_Repaso;

public class Libreria {

    /**
     * Inserta un valor en el vector
     * @param v : entero[]
     * @param valor : entero 
     * @param pos : entero
     */

    public static void insertaValor(int[] v, int valor, int pos) {
        if(pos<0 || pos>=v.length){
            System.out.println("ERROR fuera de rango");
            return;
        }
        for(int i=v.length-2; i>=pos; i--){
            v[i+1]=v[i];
        }
        v[pos]=valor;
		
	}

    /**
     * Funcion para mostrar un vector
     * @param v : entero[]
     */

	public static void mostrarVector(int[] v) {
        for(int i=0; i<v.length; i++){
            System.out.print("["+i+"]:"+v[i]+" ");
        }
        System.out.println();
		
	}

}
