//El patron fabrica busca centralizar la cracion (new) de los objetos de 
// un mismo tipo en una sola clase. De tal forma que sea esta clase la que tenga
// todas las dependencias fuertes con las otra clases.


public class FabricaArmas {

	public static Arma crear (String tipo) {
	
		Arma arma = null;
		
		switch (tipo) {
		case "espada":
			arma = new Espada();
			break;
		
		case "arco":
			arma = new Arco();
			break;
			
		case "hechizo":
			arma = new Hechizo();
			break;
			
		case "hacha":
			arma = new Hacha();
			break;

		default:
			break;
			
		}
		return arma;
	}
	
}
