
public class FabricaPersonajes {
	
	public static Personaje crear (String tipo) {
		
		Personaje personaje = null;
		
		switch (tipo) {
		case "mago":
			personaje = new Mago();
			break;
		
		case "enano":
			personaje = new Enano();
			break;
			
		case "espadachin":
			personaje = new Espadachin();
			break;
			
		case "arquero":
			personaje = new Arquero();
			break;

		default:
			break;
			
		}
		return personaje;
	}

}
