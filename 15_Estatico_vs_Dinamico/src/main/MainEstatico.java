package main;

import entidad.Persona;

public class MainEstatico {

	//El metodo 'nain' es estatico
	//Es decir, este metodo no está ligado a ningun objeto, existe siempre sin necesidad de new.
	
	public static void main(String[] args) {
	// Para acceder al metodo setNombre, accedo a traves de la referencia al objeto
		Persona p1 = new Persona();
		p1.setNombre("Harry Calahan");
		p1.setEdad(85);

		System.out.println(p1);
	// Como lo estatico existe siempre, esto lo puedo hacer
		imprimirEstatico(p1);
	// Para invocar un metodo dinamico necesito el obejto creado, ejemplo p1.setNombre. 
	// Así necesitamos crear el objeto.
		MainEstatico mainEstatico = new MainEstatico();
	// Ahora podemos invocar el metodo
		mainEstatico.imprimirDinamico(p1);
		
		//Si no estoy dentro de la clase que tiene el atributo o el metodo estatico, se accede a 
		// traves del nombre de la clase
		Persona.numeroPersonas ++;
		//La diferencia entre cuando queria acceder a un metodo o atributo dinamico, que lo que necesitaba
		//era una referencia al objeto
	}
	
	public static void imprimirEstatico(Persona p1) {
		System.out.println(p1);
	// Esto da error porque desde un metodo statico no se ve un metodo dinamico, aunque esten juntos
	//	imprimirDinamico(p1);
	}

	public void imprimirDinamico(Persona p1) {
		System.out.println(p1);
	// desde un metodo estatico, si se ven los metodos estaticos
		imprimirEstatico(p1);
	
	}
}
