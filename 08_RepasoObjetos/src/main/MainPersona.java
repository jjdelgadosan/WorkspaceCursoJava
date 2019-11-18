package main;

import java.util.ArrayList;

import bean.Direccion;
import bean.Persona;

public class MainPersona {
	public static void main(String[] args) {
		Persona p1 = new Persona();
		Persona pAux = p1;
		p1.setNombre("Bud Spencer");
		p1.setEdad(89);
		p1.setPeso(120);
		
		Persona p2 = new Persona("Terence Hill", 67, 70);
		
		pAux.setEdad(33);
		System.out.println(p1.getEdad());
		cambiarEdad(p1);
		System.out.println(p1.getEdad());
		
		p2 = pAux;
		int numero = 50;
		cambiarEntero(numero);
		System.out.println(pAux);

// ArrayList es un tipo de array que no esta dimensionado de inicio, se le pueden incluir 
// referencias en cualquier momento
		ArrayList<Persona> listaPersonas = new ArrayList<Persona>();
	
		Persona p3 = new Persona();
		p3.setNombre("Harry potter");
		p3.setEdad(19);
		p3.setPeso(56);
// se le añade al array 'listaPersonas' la referencia a la persona 3 p3.		
		listaPersonas.add(p3);
		System.out.println(listaPersonas);
		
// se puede modificar el contenido de persona de dos formas, una la de siempre contra la variable de la clase, otra
// a traves del arrayList, indicando la posicion de la clase y luego el campo.
		p3.setEdad(20);
		listaPersonas.get(0).setEdad(20);
		
		listaPersonas.add(pAux);
		System.out.println(listaPersonas);
		
		Persona p4 = new Persona();
		p4.setNombre("Mortadelo");
		p4.setEdad(80);
		p4.setPeso(70);
		
		Direccion d1 = new Direccion();
		d1.setTipoVia("Calle");
		d1.setNombreVia("Gran Via");
		d1.setCiudad("Madrid");
		d1.setCp("28054");
		
		p4.setDireccion(d1);
		
		listaPersonas.add(p4);
		
	}
	public static void cambiarEdad(Persona p) {
		p.setEdad(45);
		
	}
// Esta funcion no consigue nada, por ser int un atributo primitivo que guarda el valor directamente en la memoria
// Stack. Por lo que al salir de la funcion la variable numero pierde el valor 100, y mantiene el valor anterior 
// 50 que está guardado en la memoria Heap.
	public static void cambiarEntero(int numero) {
		numero=100;
 }
 
}
