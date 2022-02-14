package modelo;

public class Mago extends Personaje{

	protected int poderEspecialDefensa;
	
	public Mago(String nombre, int vida, int ataque, int defensa, int poderEspecialDefensa) {
		super(nombre, vida, ataque, defensa);

		this.poderEspecialDefensa=poderEspecialDefensa;
	}
	
	public int getPoderEspecialDefensa() {
		return poderEspecialDefensa;
	}



	public void setPoderEspecialDefensa(int poderEspecialDefensa) {
		this.poderEspecialDefensa = poderEspecialDefensa;
	}



	@Override
	public String toString() {
		return "nombre: " + nombre + ", vida: " + vida + ", ataque: " + ataque + ", defensa: " + defensa +", PoderEspecialDefensa: " + poderEspecialDefensa+"\n" ;
	}
	
	
	
}
