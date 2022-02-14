package modelo;

public class Guerrero extends Personaje{
	
	protected int  PoderEspecialAtaque;
	
	public Guerrero() {
		
	}

	public Guerrero(String nombre, int vida, int ataque, int defensa, int poderEspecialAtaque) {
		super(nombre, vida, ataque, defensa);

		PoderEspecialAtaque = poderEspecialAtaque;
	}
	
	

	public int getPoderEspecialAtaque() {
		return PoderEspecialAtaque;
	}



	public void setPoderEspecialAtaque(int poderEspecialAtaque) {
		PoderEspecialAtaque = poderEspecialAtaque;
	}



	@Override
	public String toString() {
		return "nombre: " + nombre + ", vida: " + vida + ", ataque: " + ataque + ", defensa: " + defensa +", PoderEspecialAtaque: "+ PoderEspecialAtaque + "\n";
	}
	
	

}
