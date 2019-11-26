package main;

import entidad.Tiburon;
import entidad.Trucha;
import java.util.ArrayList;
import entidad.Animal;
import entidad.Oso;
import entidad.Pez;
import entidad.PezPayaso;
import entidad.Placton;

public class MainAnimal {

	public static void main(String[] args) {
		
		Tiburon tiburon = new Tiburon();
		tiburon.setNombre("Robustiano");
		tiburon.setEdad(4);
		tiburon.setNumeroAletas(6);
		tiburon.setPeso(250);
		
		ArrayList<Animal> listaAnimales = new ArrayList<Animal>();
		listaAnimales.add(tiburon);
		
		Pez pez = new PezPayaso();
		pez.setNombre("El padre de nemo");
		pez.setEdad(4);
		pez.setNumeroAletas(4);
		pez.setPeso(0.200);
		
		listaAnimales.add(pez);
		
		Trucha trucha = new Trucha();
		trucha.setNombre("Elvira");
		trucha.setEdad(8);
		trucha.setNumeroAletas(2);
		trucha.setPeso(1.500);
		
		listaAnimales.add(trucha);
		
		Oso oso = new Oso();
		oso.setNombre(" Bubu");
		oso.setEdad(10);
		oso.setPeso(250);
		listaAnimales.add(oso);
		
		Placton p = new Placton();
		
		p.setCalorias(500); 
		
		
		for(Animal animal : listaAnimales) {
			animal.comer(p); // No importa la referencia, cada objeto ejecutará su metodo comer
			
		}
				
		for(Animal animal : listaAnimales) {
			Oso osoAlimento = new Oso();
			osoAlimento.setNombre("bubu");
			animal.comer(osoAlimento); // No importa la referencia, cada objeto ejecutará su metodo comer
			
		}
	
		for(Animal animal : listaAnimales) {
			Tiburon tibuAlimento = new Tiburon();
			tibuAlimento.setNombre(" Blanco");
			animal.comer(tibuAlimento); // No importa la referencia, cada objeto ejecutará su metodo comer
			
		}
		
		
		
	}

}
