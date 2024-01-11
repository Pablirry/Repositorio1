package Actividad;

public class Ejercicio {

    public static void main(String[] args) {

        int relieve[] = { 1, 2, 3, 4, 5, 5, 5, 5, 5, 5, 4, 2, 7 };

        System.out.println(Libreria.esPico(relieve, 3));
        System.out.println(Libreria.esValle(relieve, 3));
        System.out.println(Libreria.valorPicoMasAlto(relieve));
        System.out.println(Libreria.numeroValle(relieve));
        System.out.println(Libreria.numeroMesetas(relieve));

    }

}
