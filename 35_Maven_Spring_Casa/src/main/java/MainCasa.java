

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import modelo.entidad.Casa;
import modelo.entidad.Persona;

public class MainCasa {

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
		Casa c1 = (Casa)context.getBean("casa1");
		
		System.out.println(c1);
		
		Persona p1 = (Persona)context.getBean("PersonaPrototype");
		p1.setNombre("Andres");
		
		List<Persona> personasSingleton = context.getBean("ListaPersonasSingleton",List.class);
		personasSingleton.add(p1);
	}

}
