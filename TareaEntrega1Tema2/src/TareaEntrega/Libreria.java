package TareaEntrega;

public class Libreria {

    /**
     * Comprobar que el entero tiene a lo sumo 8 digitos
     * 
     * @param dni : entero
     * @return : boolean
     */

    public static boolean compruebaDNI(int dni) {
        if (dni < 0)
            return false; // es negativo

        if (dni >= 100000000)
            return false;

        return true;
    }

    /**
     * Calcula la letra del dni respecto al numero
     * 
     * @param dni : entero
     * @return : char
     */

    public static char letraDni(int dni) {
        int resto = dni % 23;
        switch (resto) {
            case 0:
                return 'T';
            case 1:
                return 'R';
            case 2:
                return 'W';
            case 3:
                return 'A';
            case 4:
                return 'G';
            case 5:
                return 'M';
            case 6:
                return 'Y';
            case 7:
                return 'F';
            case 8:
                return 'P';
            case 9:
                return 'D';
            case 10:
                return 'X';
            case 11:
                return 'B';
            case 12:
                return 'N';
            case 13:
                return 'J';
            case 14:
                return 'Z';
            case 15:
                return 'S';
            case 16:
                return 'Q';
            case 17:
                return 'V';
            case 18:
                return 'H';
            case 19:
                return 'L';
            case 20:
                return 'C';
            case 21:
                return 'K';
            case 22:
                return 'E';
        }
        return (char) resto;
    }

    /**
     * Comprueba si el dni es valido.
     * 
     * @param dni   : entero
     * @param letra : char
     * @return : boolean
     */

    public static boolean dniValido(int dni, char letra) {

        return letraDni(dni) == letra;

    }

    /**
     * Calcula si el año es bisiesto o no
     * 
     * @param year : entero
     * @return : boolean
     */

    public static boolean anioBisiesto(int year) {

        if (year % 4 == 0 && year % 100 != 0)
            return true;
        if (year % 400 == 0)
            return true;

        return false;

    }

    /**
     * Valida que la fecha introducida sea correcta
     * 
     * @param dia  : entero
     * @param mes  : entero
     * @param year : entero
     * @return : boolean
     */

    static boolean validarFecha(int dia, int mes, int year) {
        if (dia <= 0 || dia > 31)
            return false;
        if (mes <= 0 || mes > 12)
            return false;
        if (year < 1978)
            return false;
        if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            if (dia == 31)
                return false;
        }
        if (mes == 2 && anioBisiesto(year) == true) {
            if (dia > 29)
                return false;
        }
        if (mes == 2 && anioBisiesto(year) == false) {
            if (dia > 28)
                return false;
        }
        return true;
    }

    /**
     * Calcula los dias que tiene un mes
     * 
     * @param mes  : entero
     * @param year : entero
     * @return : entero
     */

    public static int diasMes(int mes, int year) {
        int dia = 0;
        if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {

            dia = 30;

        } else if (mes == 2) {
            if (anioBisiesto(year) == true)
                dia = 29;
            else
                dia = 28;
        } else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            dia = 31;
        }

        return dia;

    }

    /**
     * Calcula los dias transcurridos desde 1978 hasta la fecha introducida
     * 
     * @param dia  : entero
     * @param mes  : entero
     * @param year : entero
     * @return : entero
     */

    public static int calcularDias(int dia, int mes, int year) {
        int total = 0;

        for (int a = 1978; a < year; a++) {
            if (anioBisiesto(a) == true)
                total = total + 366;
            else
                total = total + 365;

        }
        for (int mesCalculado = 1; mesCalculado < mes; mesCalculado++) {
            total = total + diasMes(mesCalculado, year);
        }

        total = total + dia;
        return total;

    }

}
