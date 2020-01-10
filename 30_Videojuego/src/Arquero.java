
public class Arquero extends Personaje{
	
     int vida = 50; //i personajes no fuera publica , deberia usar  el setValor de personaje
	
		public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public void atacar() {
		System.out.println("Soy el personaje " + getNombre() + "..AAAAAARRRRGGGGGGG" + " y te ataco");
		 getArma().usar();
		
		}

}
