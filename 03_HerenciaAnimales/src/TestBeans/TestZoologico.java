package TestBeans;

import Beans.Animal;
import Beans.Gato;

public class TestZoologico {

	public static void main(String[] args) {
		
		Animal a1 = new Animal("camaleon - verde");
		Animal a2 = new Animal("hipopotamo - marron");
		
		Gato gato1 = new Gato("gato siames", 7);
		Gato gato2 = new Gato("gato callejero", 5);
		
//		a1.sonido();
//		gato1.sonido();
		
		Animal [] zoo = {a1,a2,gato1,gato2};
		
		for (Animal ele: zoo) {
			ele.sonido();
// En este caso, a1 ejecuta el metodo sonido de animal, y gato1 el metodo sonido de la clase gato
			
			if (ele instanceof Gato) {
				((Gato)ele).mostrarDatos();
			}
		}
	}

}
