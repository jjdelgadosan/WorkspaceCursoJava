
public class Espadachin extends Personaje{

	 int vida = 80;
	
	public void atacar() {
		System.out.println("Soy el personaje " + getNombre() + "..AAAAAARRRRGGGGGGG" + " y te ataco");
		 getArma().usar();
		
		}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

}