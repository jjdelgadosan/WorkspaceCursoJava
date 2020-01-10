
public class MainVideojuego {

	public static void main(String[] args) {
		
		Personaje g1 = FabricaPersonajes.crear("arquero");
		
		g1.setNombre("Legolas");
		
		//gracias a usar abstracciones y partrones (fabrica)
		//podemos crear objetos diferentes en tiempo de ejecucion
	
		Arma arma1 = FabricaArmas.crear("arco");
		g1.setArma(arma1);
		g1.atacar();
		


		Personaje g2 = FabricaPersonajes.crear("mago");
		g2.setNombre("Harry");
	
		Arma arma2 = FabricaArmas.crear("hechizo");
		g2.setArma(arma2);
		g2.atacar();
		
	
		
	}

}
