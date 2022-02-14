package modelo;

import java.util.Arrays;

import controlador.Controlador;
import utils.Metodos;
import modelo.*;

public class Partida {

	public static Personaje[] luchadores; //el atributo es público para poder rellenar el array en la clase Controlador. 
	
	public Partida(int NumPersonajes) {
		
		this.luchadores=new Personaje[NumPersonajes];
			
	}
	
	/*
	 * En este método se crean los magos y guerreros y se meten en el array.
	 * 
	 */
	public static void IniciaPartida() {
		
		new Controlador().CreaPersonajes();
			
	
	}
	
	
	public static void Lucha() {
		
		new Controlador().CreaPersonajes();

		// hago que el usuario seleccione con el que quiere luchar
		int opcion = Metodos.leeEntero("Selecciona un luchador: ");
		
		Personaje p1 = null; //personaje seleccionado por el usuario
		
		Personaje p2=null; //Personaje enemigo
		
		switch (opcion) {

		case 1:

			p1 = luchadores[0];

			

			System.out.println("\nHas elegido a " + p1.getNombre());

			break;

		case 2:

			p1 = luchadores[1];

			

			System.out.println("\nHas elegido a " + p1.getNombre());

			break;

		case 3:

			p1 = luchadores[2];

			

			System.out.println("\nHas elegido a " + p1.getNombre());

			break;

		case 4:

			p1 = luchadores[3];

			

			System.out.println("\nHas elegido a " + p1.getNombre());
			break;

		case 5:

			p1 = luchadores[4];

			System.out.println("\nHas elegido a " + p1.getNombre());

			break;

		case 6:

			p1 = luchadores[5];

			System.out.println("\nHas elegido a " + p1.getNombre());
			
			break;

		case 7:

			p1 = luchadores[6];

			System.out.println("\nHas elegido a " + p1.getNombre());
			
		break;

		case 8:

			p1 = luchadores[7];

			System.out.println("\nHas elegido a " + p1.getNombre());
			
			break;

		}
		
		System.out.println("--------------------------------------------------");
		
		
	}
	
	

	@Override
	public String toString() {
		return Arrays.toString(luchadores) ;
	}
	
	
}
