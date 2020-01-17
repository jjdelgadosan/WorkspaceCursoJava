package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import modelo.entidad.Persona;

public class MainSpring {

	//Esta referencia lleva el objeto de contexto de spring
	//Este objeto lleva el ciclo de vida de todos los objetos que hayamos creado en el xml (beans.xml/bean)
	public static ApplicationContext context;
	
	public static void main(String[] args) {
	//damos de alta el contexto de spring a partir de un fichero xml.
	//Este contexto llevará el ciclo de vida de todos los "beans" que hay en dicho fichero
		context = new ClassPathXmlApplicationContext("beans.xml");
	
	// A partir de este momento, a traves de este contexto de spring podemos acceder a cualquier bean
	// mediante su id.
		
	// getBean devuelve una referencia de tipo object que hay que castear al tipo de objeto nuestro.
		Persona p1 = (Persona)context.getBean("persona1");
		
		p1.setNombre("harry poter");
		System.out.println(p1);
		
		Persona p2 = new Persona();
		p2.setNombre("Ernion");
		
		System.out.println(p2);
		
		Persona bud = context.getBean("bud",Persona.class);
		System.out.println(bud.getNombre());
		System.out.println(bud.getPeso());
		
		bud.setPeso(198);
		
		Persona p3 = context.getBean("bud",Persona.class);
		System.out.println(p3.getNombre());
		System.out.println(p3.getPeso());
		
		Persona p4 = context.getBean("ron",Persona.class);
		System.out.println(p4);
		
		Persona pesneip = context.getBean("esneip",Persona.class);
		System.out.println(pesneip);
		
	}

}
