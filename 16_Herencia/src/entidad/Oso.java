package entidad;

public class Oso extends Animal{

	@Override
	public void comer(Object comida) {
		if (comida instanceof Animal) {
			Animal a = (Animal)comida;
			System.out.println("Soy un oso que me llamo  " + nombre + " y me voy a comer al animal de tipo " 
			+ a.getClass().getSimpleName() + a.nombre);
			// a.getClass().getSimpleName() ==> Comandos para mostrar el nombre de la clase a.getClass te situa
			// en la clase y getSimpleName te saca el nombre.
		}else { 
			System.out.println("Que es esto que me das, yo solo como animales "); 
		}
		
	}
	
	
	

}
