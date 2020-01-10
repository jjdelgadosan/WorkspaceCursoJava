
public class Mago extends Personaje {
	
	int vida = 100;
	
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
