package vista;

import controlador.Controlador;
import modelo.*;

public class Vista {

	/*
	 *este método es para mostrar todos los luchadores del array 
	 */
	public void MuestraLuchadores() {
		
		//para ello hay que llamar al metodo creaPersonajes que es donde se crea el array con todos los luchadores
		new Controlador().CreaPersonajes();
		
		//después creo una variable de tipo Partida para llamar al array de luchadores y poder mostrarlo
		Partida p=null;
		
		int contador=0;
				
		for(int i=0; i<p.luchadores.length; i++) {
			
			contador++;
			
			System.out.println(contador+"->"+p.luchadores[i]);
			
		}
		
	}
	
}
