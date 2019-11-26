package entidad;

public class Tiburon extends Pez {

	@Override
	public void comer(Object comida) {
		// Si dejamos el super. se ejecutaria primero el comer del padre y luego podriamos añadir lieneas
		//super.comer(comida);
		
		// Aunque no se puede instanciar el objeto Pez por ser abstracto, los objetos Trucha y PezPayaso si
		if (comida instanceof Pez) {
		// instanciamos 	
			Pez pez =(Pez)comida;
			System.out.println("Soy el tiburon " + getNombre() + " " + "y me voy a comer al pez de tipo" + 
			pez.getClass().getSimpleName() + " Que se llama " + getNombre());
		}else { 
			System.out.println("Soy un tiburon asesino y solo como peces");
			
		}
			
	}
	
	
	

}
