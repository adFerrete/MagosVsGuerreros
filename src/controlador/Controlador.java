package controlador;

import modelo.*;
import utils.Metodos;

public class Controlador {
	
	/*
	 *este método es para crear el array de los personajes. 
	 */
	public void CreaPersonajes() {		
		
		//para ello creo una variable de tipo Partida para poder tocar el atributo de la clase que es el array
		
		Partida p=null;
		
		//creo los magos		
		Mago m1=new Mago("Gandalf",5,3,5,3);
		Mago m2=new Mago("Voldemor",5,2,4,4);
		Mago m3=new Mago("Albus Dumbeldore", 5,5,4,5);
		Mago m4=new Mago("Morgana",5,2,3,4);
				
		//creo los guerreros
		Guerrero g1=new Guerrero("Hulk", 5,5,5,3);
		Guerrero g2=new Guerrero("Batman",5,3,2,4);
		Guerrero g3=new Guerrero("Bruce Lee", 5, 4, 5, 5);
		Guerrero g4=new Guerrero("Chuck Norris", 5, 3, 2, 5);
		
		//meto los magos y guerreros en el array de personajes
		p.luchadores[0]=m1;
		p.luchadores[1]=m2;
		p.luchadores[2]=m3;
		p.luchadores[3]=m4;
		p.luchadores[4]=g1;
		p.luchadores[5]=g2;
		p.luchadores[6]=g3;
		p.luchadores[7]=g4;
		
					 
	}
	
	public int AtaqueGuerrero(Personaje p1) {
	
		Partida p=null;
		
		Guerrero AuxGuerrero;

		int AumentoAtaqueGuerrero=0;

		int ataqueAleatorio=0;
		
		this.CreaPersonajes();
	
		  for (Personaje auxPersonaje:p.luchadores) { //el bucle avanzará mientrasque i sea menor que el tamaño del array
			  
				if (auxPersonaje instanceof Guerrero) {

					AuxGuerrero = (Guerrero) auxPersonaje;

					 ataqueAleatorio = (int) Math.random() * p1.getAtaque() + 1;
					 AumentoAtaqueGuerrero = ataqueAleatorio + AuxGuerrero.getPoderEspecialAtaque();

				}
				 
	 
		  } 
		  
		return AumentoAtaqueGuerrero;
	}
	
	public int DefensaGuerrero(Personaje p1) {
		
		Partida p=null;
		
		Guerrero AuxGuerrero;

		int defensaAleatoria=0;
		
		this.CreaPersonajes();
	
		  for (Personaje auxPersonaje:p.luchadores) { //el bucle avanzará mientrasque i sea menor que el tamaño del array
			  
				if (auxPersonaje instanceof Guerrero) {

					AuxGuerrero = (Guerrero) auxPersonaje;

					 defensaAleatoria = (int) Math.random() * p1.getDefensa() + 1;

				}
				 
	 
		  } 
		  
		return defensaAleatoria;
		
	}
	
	public int AtaqueMago(Personaje p1) {
		
		Partida p=null;
		
		Mago AuxMago;

		int ataqueAleatorio=0;
		
		this.CreaPersonajes();
	
		  for (Personaje auxPersonaje:p.luchadores) { //el bucle avanzará mientrasque i sea menor que el tamaño del array
			  
				if (auxPersonaje instanceof Mago) {

					AuxMago= (Mago) auxPersonaje;

					 ataqueAleatorio = (int) Math.random() * p1.getDefensa() + 1;

				}
				 
	 
		  } 
		  
		return ataqueAleatorio;
	
	}
	
	public int DefensaMago(Personaje p1) {
		
		Partida p=null;
		
		Mago AuxMago;

		int AumentoDefensaMago=0;

		int defensaAleatoria=0;
		
		this.CreaPersonajes();
	
		  for (Personaje auxPersonaje:p.luchadores) { //el bucle avanzará mientrasque i sea menor que el tamaño del array
			  
				if (auxPersonaje instanceof Mago) {

					AuxMago= (Mago) auxPersonaje;

					 defensaAleatoria = (int) Math.random() * p1.getDefensa() + 1;
					 AumentoDefensaMago = defensaAleatoria + AuxMago.getPoderEspecialDefensa();

				}
				 
	 
		  } 
		  
		return AumentoDefensaMago;
		
	}
		
}
