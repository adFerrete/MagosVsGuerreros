package app;

import modelo.*;
import vista.Vista;

public class MagosVsGuerreros {

	public static void main(String[] args) {
		
		Partida partida=new Partida(8);
		
		Vista v=new Vista();
		
		v.MuestraLuchadores(); //muestro todos los personajes para que el usuario vea lo que est� seleccionando
		
		partida.IniciaPartida(); //creo todos los personajes y los guardo en el array
		
		System.out.println("--------------------------------");
		
		partida.Lucha(); //muestro el menu de seleccion (switch) y la lucha
		
		System.out.println("esto es un cambio");
		
		

	}

}
