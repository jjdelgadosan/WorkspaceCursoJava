package colecciones;

import java.util.ArrayList;
import java.util.HashMap;

import bean.Persona;

public class MainColecciones {

	public static <Personas> void main(String[] args) {
		ArrayList<String> listaNombres = new ArrayList<String>();
		listaNombres.add("Mortadelo");
		listaNombres.add("Filemon");
		listaNombres.add("Dr. Bacterio");
		listaNombres.add("Ofelia");
		listaNombres.add("Super intendente Vicente");
		
		System.out.println(listaNombres.get(0)); //Mortadelo
		System.out.println(listaNombres.get(3)); //Ofelia
		System.out.println(listaNombres.size()); // 5
		
		System.out.println("**********************");
		
		for (int i = 0; i < listaNombres.size();i++) {
			System.out.println(listaNombres.get(i)); //manera mala de recorrer array
			
		}	
		
		System.out.println("**********************");
// manera buena de recorrer un array FOR EACH
// la primera parte hay que declarar una variable dentro del for del mismo tipo que la lista que queremos recorrer
// las segunda parte es la lista que queremos recorrer
		for (String valor : listaNombres) { 
			
			System.out.println(valor);
		
		}
		
		System.out.println("Array de enteros");
// si queremos crear un array de enteros debemos de usar su correspondiente tipo wrapper (envoltorio)
// Todos los primitivos tienen su tipo wrapper
		
		Integer entero = new Integer(4); 
		Integer entero2 = 5; //auto boxing ==> te lo convierte a objeto directamente. 
		
		double primitivoDouble = 6.9;
		Double objetoDouble = 6.9;
		
		ArrayList<Integer> listaEnteros = new ArrayList<Integer>();
		listaEnteros.add(1);
		listaEnteros.add(45);
		listaEnteros.add(new Integer(89));
		
		System.out.println(listaEnteros);
		
		for (Integer v : listaEnteros) {
			System.out.println(v);
			
		}
		
		ArrayList<Persona> listaPersonas = new ArrayList<Persona>();
		
		Persona p1 = new Persona();
		p1.setNombre("Penelope");
		p1.setEdad("33");
		
		Persona p2 = new Persona();
		p2.setNombre("Ana");
		p2.setEdad("45");
		
		listaPersonas.add(p1);
		listaPersonas.add(p2);
		
		for (Persona p : listaPersonas) {
			
			System.out.println("1 - El nombre es: " + p.getNombre());
			System.out.println("2 - La edad es: " + p.getEdad());
			System.out.println("*************************");
						
		}
		
		listaPersonas.remove(1); //remove lo quita de la lista, pero no lo borra.  
		System.out.println(listaPersonas);		
		
		System.out.println(p2);		
		
		listaPersonas.remove(p2); // poniendo la referencia, tambien la elimina
		System.out.println(p2);		
		
		//no podemos acceder a una posicion que no existe.
//		System.out.println(listaPersonas.get(1));
		
		System.out.println("********************mapas****************************");
		
		HashMap<String, String> mapaUsuarioCntrasenia = new HashMap<String, String>();
		mapaUsuarioCntrasenia.put("felix", "1234");
		mapaUsuarioCntrasenia.put("pepe", "qwerty");
		mapaUsuarioCntrasenia.put("pepa", "123456");
		
		System.out.println(mapaUsuarioCntrasenia.get("felix"));
		
		mapaUsuarioCntrasenia.remove("felix");
// con remove se borra, y devuelve null 		
		System.out.println(mapaUsuarioCntrasenia.get("felix"));
		
		
		System.out.println(mapaUsuarioCntrasenia.get("pepe"));
// cuando se hace un .put a una clave existente, se modifica 		
		mapaUsuarioCntrasenia.put("pepe", "987654321");
		System.out.println(mapaUsuarioCntrasenia.get("pepe"));
		
		
		HashMap<String, Persona> mapaUsuarioPersonan = new HashMap<String, Persona>();
		mapaUsuarioPersonan.put(p1.getNombre(), p1);
		mapaUsuarioPersonan.put(p2.getNombre(), p2);
		
		System.out.println(mapaUsuarioPersonan.get(p1.getNombre()));
		
		
	}

}
