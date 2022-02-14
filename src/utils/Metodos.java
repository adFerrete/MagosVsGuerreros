package utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Metodos {

	public static int leeEntero(String frase){

		Scanner teclado= new Scanner(System.in);
		int num=0;
		boolean valid=false;

			do{
				try{
				
					System.out.print(frase);
					num=teclado.nextInt();
					valid=true;

				}catch(InputMismatchException ex){

					System.out.println("numero no valido");
					teclado.next();			

				}


			}while(!valid);

		return num;
	}
	
	public static float leeNumReal(String frase){

		Scanner teclado= new Scanner(System.in);
		float num=0;
		boolean valid=false;

			do{
				try{
				
					System.out.println(frase);
					num=teclado.nextFloat();
					valid=true;

				}catch(InputMismatchException ex){

					System.out.println("numero no valido");
					teclado.next();			

				}


			}while(!valid);

		return num;
	}
	
	public static String Leefrase() {

		String resultado = "";

		Scanner teclado = new Scanner(System.in);

		resultado = teclado.next();

		return resultado;
	}
	
	public static void rellenaArray(int[] miArray) {

		for (int i = 0; i < miArray.length; i++) {

			miArray[i] = leeEntero("introduce un numero para la posición " + i);

		}

	}
	
	
	public static void muestraArray(int[] miArray) {
		
		for(int i=0; i<miArray.length; i++) {
			
			System.out.println(miArray[i]);
			
			
		}
		
		
	}
	
	public static int buscaPosicionArray(int x, int[] miArray){

		
		
		for(int i=0; i<miArray.length; i++){

			if(miArray[i]==x){
			
				return i;
			
			}

		}

		return 0;
	}
	
	public static void rellenaArrayAleatorio(int[] ArrayAleatorio, int lower, int upper) {

		int aux = 0;

		if (lower > upper) {

			aux = lower;
			lower = upper;
			upper = aux;

		}

		for (int i = 0; i < ArrayAleatorio.length; i++) {

			ArrayAleatorio[i] = (int) (Math.random() * (upper - lower)) + lower;

		}

	}
	
	public static int SumaArray(int[] ArraySumado) {

		int result = 0;

		for (int i = 0; i < ArraySumado.length; i++) {

			result = result + ArraySumado[i];

		}

		return result;
	}
	
	public static boolean CompareArray(int[] ArraySecret, int[] ArrayUser) {

		boolean comparision = true;// de primeras se da por hecho que son iguales.

		if (ArraySecret.length == ArrayUser.length) { // aquí se compara las longitudes de los dos arrays.

			for (int i = 0; i < ArraySecret.length; i++) { // para comparar dos array sólo hace falta recorer uno de
															// ellos porque por cada vuelta, el índice que se está
															// apuntando es el mismo en los dos arrays.

				if (ArraySecret[i] != ArrayUser[i]) {

					comparision = false; // si los elementos comparados de los dos arrays son distintos, la variable
											// comparision se pone a false queriendo decir que no son iguales.
					i = ArraySecret.length; // entonces el contador se iguala al tamaño del array que se está
											// recorriendo para salir del bucle.

				}

			}

		} else {

			comparision = false; // si las longitudes de los dos arrays no son iguales se pone directamente a
									// false.

		}

		return comparision;
	}
	
}
