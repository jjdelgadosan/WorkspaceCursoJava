package main;

import entidad.Animal;
import entidad.PezPayaso;
import entidad.Placton;
import entidad.Trucha;

public class MainPez {

	public static void main(String[] args) {
		// No podemos hacer esto porque Animal es una clase abstracta
		// Animal a = new Animal();
		Animal a = new Trucha();
		a.setNombre("Ruperta");
		a.setPeso(3);
		// Al utilizar "a" otra vez, eliminamos a Ruperta porque lo hemos dejado sin referencia.
		Animal b = new PezPayaso();
		b.setNombre("Nemo");
		// Se ejecuta el metodo comer de el objeto PezPayaso, ya que la referencia 'a' (que es de animal) apunta 
		// al objeto PezPayaso. Este metodo está heredado de Pez que sobre escribe el metodo heredado de Animal
		// No va a ejecutar por el lado bueno el metodo comer de Pez, porque no es Placton.
		a.comer(b);
		Placton p = new Placton();
		p.setCalorias(100);
		System.out.println(a.toString());
		a.comer(p);
		System.out.println(a.toString());
		
	}

}
