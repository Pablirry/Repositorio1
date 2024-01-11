package Actividad1;

public class Libreria {

	/**
	 * muestra el area de un cuadrado
	 * 
	 * @param lado : entero
	 */

	public static void areaCuadrado(int lado) {
		int area = lado * lado;
		System.out.println("areaCuadrado " + area);

	}

	/**
	 * muestra el perimetro de un cuadrado
	 * 
	 * @param lado : entero
	 * @return entero
	 */

	public static int PerimetroCuadrado(int lado) {
		int resul = lado * 4;
		return resul;
	}

	/**
	 * muestra el area de un circulo
	 * 
	 * @param radio : double
	 */

	public static void areaCirculo(double radio) {
		double area = Math.PI * Math.pow(radio, 2);
		System.out.println("El aria del circulo es: " + area);
	}

	/**
	 * muestra la circunferencia de un circulo
	 * 
	 * @param radio : double
	 * @return : double
	 */

	public static double circunferenciaCirculo(double radio) {
		double resul = 2 * Math.PI * radio;
		return resul;

	}

	/**
	 * funcion que determina si un numero es negativo
	 * 
	 * @param n : entero
	 * @return : boolean
	 */

	public static boolean esNegativo(int n) {
		if (n < 0)
			return true;
		else
			return false;
	}

	/**
	 * funcion para calcular la raiz cuadrada de un numero
	 * 
	 * @param n : double
	 * @return : double
	 */

	public static double calcularRaizCuadrada(double n) {
		return Math.sqrt(n);
	}

	/**
	 * funcion que determina si un numero es bisiesto
	 * 
	 * @param ano : entero
	 * @return : boolean
	 */

	public static boolean esBisiesto(int ano) {
		if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * funcion que determina si un numero es decimal
	 * 
	 * @param n : double
	 * @return : boolean
	 */

	public static boolean esDecimal(double n) {
		if (n % 1 == 0) {
			return false;
		} else {
			return true;
		}
	}

	/**
	 * funcion que convierte grados celsius a grados farenheit
	 * 
	 * @param celsius : double
	 * @return : double
	 */

	public static double celsiusFarenheit(double celsius) {

		double gradosFarenheit = (celsius * 9 / 5) + 32;
		return gradosFarenheit;

	}

	/**
	 * funcion que convierte grados farenheit a grados celsius
	 * 
	 * @param Farenheit : double
	 * @return : double
	 */

	public static double farenheitCelsius(double Farenheit) {

		double gradosCelsius = (Farenheit - 32) * 5 / 9;
		return gradosCelsius;

	}

	/**
	 * funcion que determina si los numeros estan ordenados de mayor a menor
	 * 
	 * @param a : entero
	 * @param b : entero
	 * @param c : entero
	 * @return : boolean
	 */

	public static boolean ordenados(int a, int b, int c) {
		if (a > b && b > c) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * funcion que determina si el primer numero es mayor al segundo
	 * 
	 * @param n1 : entero
	 * @param n2 : entero
	 * @return : boolean
	 */

	public static boolean primeroMayor(int n1, int n2) {
		if (n1 > n2) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * funcion que determina el numero de cifras de un numero
	 * 
	 * @param n : entero
	 * @return : entero
	 */

	public static int cifras(int n) {
		int nCifras = 0;

		while (n > 0) {
			n = n / 10;
			nCifras++;
		}
		return nCifras;
	}

	/**
	 * funcion que determina el sueldo segun si es diurno o no y domingo o no
	 * 
	 * @param horas     : int
	 * @param esDiurno  : boolean
	 * @param esDomingo : boolean
	 */

	public static void calcularSueldo(int horas, boolean esDiurno, boolean esDomingo) {

		double tarifaBase;
		if (esDiurno) {
			tarifaBase = 20;
		} else {
			tarifaBase = 35;
		}

		double IncTarifa;
		if (esDomingo) {
			if (esDiurno) {
				IncTarifa = 10;
			} else {
				IncTarifa = 15;
			}
		} else {
			IncTarifa = 0;
		}

		double tarifaTotal = horas * (tarifaBase + IncTarifa);

		System.out.println("El sueldo es de " + tarifaTotal);
	}

	/**
	 * Funcion que calcula el factorial de un número
	 * 
	 * @param n : entero
	 * @return : entero
	 */

	public static int factorial(int n) {

		int resul = 1;

		for (int i = 1; i <= n; i++) {
			resul = resul * i;
		}
		return resul;

	}

	/**
	 * Calcula si un numero es primo o no
	 * 
	 * @param n : entero
	 * @return : boolean
	 */

	public static boolean esPrimo(int n) {

		boolean primo = true;

		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				primo = false;

			}
		}

		if (primo) {
			System.out.println("El numero es primo. ");
		} else {
			System.out.println("El numero no es primo. ");
		}

		return primo;
	}

	/**
	 * Calcula el cociente de dos números enteros
	 * 
	 * @param dividendo : entero
	 * @param divisor   : entero
	 * @return : entero
	 */

	public static int CalcularCociente(int dividendo, int divisor) {

		int cociente = 0;

		while (dividendo >= divisor) {
			dividendo = dividendo - divisor;
			cociente++;
		}

		return cociente;
	}

	/**
	 * Calcula el resto de dos números enteros
	 * 
	 * @param dividendo : entero
	 * @param divisor   : entero
	 * @return : entero
	 */

	public static int CalcularResto(int dividendo, int divisor) {
		while (dividendo >= divisor) {
			dividendo = dividendo - divisor;
		}

		return dividendo;
	}

	/**
	 * Calcula los numeros primos del 1 al 100
	 */

	public static void primos() {

		for (int i = 1; i <= 100; i++) {
			boolean primo = true;

			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					primo = false;
					break;
				}
			}

			if (primo) {
				System.out.print(i + " ");
			}
		}
	}

	/**
	 * Incrementa en un segundo la hora dada por teclado
	 * 
	 * @param horas    : entero
	 * @param minutos  : entero
	 * @param segundos : entero
	 */

	public static void incrementaSegundos(int horas, int minutos, int segundos) {
		segundos++;
		if (segundos >= 60) {
			segundos = 0;
			minutos++;

			if (minutos >= 60) {
				minutos = 0;
				horas++;

				if (horas >= 24) {
					horas = 0;
				}
			}
		}

		System.out.println("La hora incrementada en un segundo es: " + horas + ":" + minutos + ":" + segundos);

	}

	/**
	 * Calcula la ecuacion de segundo grado dependiendo de las soluciones que tenga
	 * 
	 * @param a : entero
	 * @param b : entero
	 * @param c : entero
	 */

	public static void ecuacion_2_grado(int a, int b, int c) {

		int raiz = (b * b) - (4 * a * c);
		if (raiz < 0) {
			System.out.println("No tiene solución");
		} else if (raiz == 0) {

			System.out.println("UNA SOLUCIÓN");
			double resul = (-b) / (2 * a);
			System.out.println("La solución es: " + resul);
		} else {
			System.out.println("DOS SOLUCIONES");
			double resul1 = (-b + Math.sqrt(raiz)) / (2 * a);
			double resul2 = (-b - Math.sqrt(raiz)) / (2 * a);
			System.out.println("x1= " + resul1);
			System.out.println("x2= " + resul2);
		}

	}

	/**
	 * Calcula cuantas monedas de cada tipo tiene que devolver introduciendo la
	 * cantidad por teclado
	 * 
	 * @param dinero : double
	 */

	public static void monedas(double dinero) {

		int centimos = (int) (dinero * 100);

		int moneda2euros = centimos / 200;
		centimos %= 200;

		int moneda1euro = centimos / 100;
		centimos %= 100;

		int moneda50cts = centimos / 50;
		centimos %= 50;

		int monedas20cts = centimos / 20;
		centimos %= 20;

		int monedas5cts = centimos / 5;
		centimos %= 5;

		int monedas2cts = centimos / 2;
		centimos %= 2;

		int monedas1cts = centimos / 1;
		centimos %= 1;

		System.out.println(moneda2euros + " de 2 euros");
		System.out.println(moneda1euro + " de 1 euro");
		System.out.println(moneda50cts + " de 50 centimos");
		System.out.println(monedas20cts + " de 20 centimos");
		System.out.println(monedas5cts + " de 5 centimos");
		System.out.println(monedas2cts + " de 2 centimos");
		System.out.println(monedas1cts + " de 1 centimo");

	}

	/**
	 * Calcula cuantos años tiene una persona pidiendo por teclado la fecha de
	 * nacimiento y la actual
	 * 
	 * @param dia       : entero
	 * @param mes       : entero
	 * @param ano       : entero
	 * @param diaActual : entero
	 * @param mesActual : entero
	 * @param anoActual : entero
	 * @return : entero
	 */

	public static int edad(int dia, int mes, int ano, int diaActual, int mesActual, int anoActual) {
		int edad = anoActual - ano;

		if (mesActual < mes || mesActual == mes && diaActual < dia) {
			edad--;
		}

		return edad;
	}

	/**
	 * Ordena los numeros sw menor a mayor
	 * 
	 * @param n1 : entero
	 * @param n2 : entero
	 * @param n3 : entero
	 */

	public static void ordenar(int n1, int n2, int n3) {
		if (n1 < n2 && n1 < n3) {
			if (n2 < n3) {
				System.out.println(n1 + ", " + n2 + ", " + n3);
			} else {
				System.out.println(n1 + ", " + n3 + ", " + n2);
			}
		} else if (n2 < n1 && n2 < n3) {
			if (n1 < n3) {
				System.out.println(n2 + ", " + n1 + ", " + n3);
			} else {
				System.out.println(n2 + ", " + n3 + ", " + n1);
			}
		} else {
			if (n1 < n2) {
				System.out.println(n3 + ", " + n1 + ", " + n2);
			} else {
				System.out.println(n3 + ", " + n2 + ", " + n1);
			}
		}
	}

	/**
	 * Convierte de binario a decimal
	 * 
	 * @param binario : entero
	 * @return : entero
	 */

	public static int binario_a_decimal(int binario) {
		int decimal = 0;
		int potencia = 0;
		int auxiliar = 0;

		while (binario > 0) {
			auxiliar = binario % 10;
			decimal += auxiliar * Math.pow(2, potencia);
			binario /= 10;
			potencia++;
		}
		return decimal;
	}

	/**
	 * Convierte de binario a hexadecimal
	 * 
	 * @param binario : entero
	 * @return : String
	 */

	public static String binario_a_hexadecimal(int binario) {
		int numeroDecimal = binario_a_decimal(binario);

		String numeroHexadecimal = Integer.toHexString(numeroDecimal);

		numeroHexadecimal = numeroHexadecimal.toUpperCase();

		return numeroHexadecimal;

	}

	/**
	 * Convierte de binario a octal
	 * 
	 * @param binario : entero
	 * @return : String
	 */

	public static String binario_a_octal(int binario) {

		int numeroDecimal = binario_a_decimal(binario);
		String numeroOctal = Integer.toOctalString(numeroDecimal);
		numeroOctal = numeroOctal.toUpperCase();
		return numeroOctal;
	}

	/**
	 * Calcula el número de cifras pares que tiene un numero
	 * 
	 * @param n : entero
	 * @return : entero
	 */

	public static int cifrasPares(int n) {
		n = Math.abs(n);

		int cifras = 0;

		while (n > 0) {
			int digito = n % 10;

			if (digito % 2 == 0) {
				cifras++;
			}
			n = n / 10;
		}

		return cifras;
	}

	/**
	 * Calcula el número de cifras impares que tiene un número
	 * 
	 * @param n : entero
	 * @return : entero
	 */

	public static int cifrasImpares(int n) {
		n = Math.abs(n);

		int cifras = 0;

		while (n > 0) {
			int digito = n % 10;
			if (digito % 2 != 0) {
				cifras++;
			}
			n = n / 10;
		}

		return cifras;
	}

	/**
	 * Calcula la suma de los digitos de un número
	 * 
	 * @param n : entero
	 * @return : entero
	 */

	public static int sumaDigitos(int n) {

		n = Math.abs(n);

		int suma = 0;

		while (n > 0) {

			int digito = n % 10; // sacamos digito
			suma += digito; // sumamos digito
			n = n / 10; // dividimos entre 10 para quitar el digito anterior y sumar el siguiente digito

		}

		return suma;

	}

}
