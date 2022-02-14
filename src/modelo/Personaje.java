package modelo;

import controlador.Controlador;

public class Personaje {

	protected String nombre;
	protected int vida;
	protected int ataque;
	protected int defensa;
	
	public Personaje(String nombre, int vida, int ataque, int defensa) {
	
		this.nombre = nombre;
		this.vida = vida;
		this.ataque = ataque;
		this.defensa = defensa;
		
	}
	
	public Personaje() {
		
		this("",-1,-1,-1);
		
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getAtaque() {
		return ataque;
	}

	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}

	public int getDefensa() {
		return defensa;
	}

	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}


	
	@Override
	public boolean equals(Object obj) {
		
		boolean result=false;
		
		if(this==obj) {
			
			result=true;
			
		}else if (obj!=null && obj instanceof Personaje) {
			
				Personaje tmp=(Personaje) obj;
				
				if(this.nombre!=null) {
					
					result=(tmp.getNombre().equals(tmp.nombre));
				}
					
		}
		
		return result;
	}
	
	@Override
	public String toString() {
		return "nombre: " + nombre + ", vida: " + vida + ", ataque: " + ataque + ", defensa: " + defensa + "\n";
	}
	
	
	
}
