package listas;

import java.util.List;
import java.util.Vector;
import java.util.ArrayList;
import java.util.LinkedList;

public class MainListas {

	public static void main(String[] args) {
		
		ArrayList<String> ListaString = new ArrayList<String>();
		ListaString.add("pepe");
		ListaString.add("pepa");

		// Las interfaces son una coleccion de metodos abstractos y sirven para varias cosas,
		// entre ellas implementar una herencia multiple.
		// Con una referencia de una interfaz podemos apuntar a culaquier objeto que implemente dicha interfaz
		// Las interfaces dicen "QUE" mientras que las clases dicen el "COMO"
		// Ejemplo, la clase ArrayList es una implementación de la interfaz List, que debajo utiliza Arrays 
		// normales que cuando se llenan crean un nuevo mas grande y borran el viejo. 
		
		List<String> listanombres = new ArrayList<String>();
		listanombres.add("pepe");
		listanombres.add("pepa pig");
		
		LinkedList<String> listaLinked = new LinkedList<String>();
		ArrayList<String> listaString = new ArrayList<String>();
		Vector<String> listaVector = new Vector<String>();
		
		recorrerLinked(listaLinked);
		recorrerVector(listaVector);
		recorrerArray(listaString);
		
		//gracias a las interfaces puedo tener un solo metodo en vez de tres
		recorrer(listaLinked);
		recorrer(listaVector);
		recorrer(listaString);
		
			
	}
	private static void recorrerLinked(LinkedList<String> lista) {
		//trabajo con los datos de la lista
		for (String s :lista)
			System.out.println(s);
	}
		
	private static void recorrerArray(ArrayList<String> lista) {
		//trabajo con los datos de la lista
		for (String s :lista)
			System.out.println(s);
	}
	
	private static void recorrerVector(Vector<String>lista) {
		//trabajo con los datos de la lista
		for (String s :lista)
			System.out.println(s);
	}

	private static void recorrer(List<String>lista) {
		//trabajo con los datos de la lista
		for (String s :lista)
			System.out.println(s);
	}
	
	
}
