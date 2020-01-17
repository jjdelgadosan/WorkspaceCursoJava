package main.coche;

import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import modelo.entidad.Coche;
import modelo.entidad.Motor;

public class MainCoche {

	//Esta referencia lleva el objeto de contexto de spring
	//Este objeto lleva el ciclo de vida de todos los objetos que hayamos creado en el xml (beans.xml/bean)
	public static ApplicationContext context;
	
	public static void main(String[] args) {
	//damos de alta el contexto de spring a partir de un fichero xml.
	//Este contexto llevará el ciclo de vida de todos los "beans" que hay en dicho fichero
		context = new ClassPathXmlApplicationContext("beansCoche.xml");
	
	// A partir de este momento, a traves de este contexto de spring podemos acceder a cualquier bean
	// mediante su id.
		
	// getBean devuelve una referencia de tipo object que hay que castear al tipo de objeto nuestro.
		Coche c1 = (Coche)context.getBean("coche1");
		Coche c2 = (Coche)context.getBean("coche2");
		Coche c3 = (Coche)context.getBean("coche3");
		Coche c4 = (Coche)context.getBean("coche4");
		Coche c5 = (Coche)context.getBean("coche5");
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		
		Coche c6 = context.getBean("coche6",Coche.class);
		System.out.println(c6);
		
		
		Coche c7 = context.getBean("coche7",Coche.class);
		Motor m1 = context.getBean("motor7",Motor.class);
		
		c7.setMarca("lexsus");
		c7.setMatricula("1111");
		c7.setModelo("300");
		c7.setSegundaMano(true);
		c7.setPrecio(22000);
		c7.setPeso(1100);
		
		m1.setTipoMotor("hibrido");
		m1.setCv(120);
		m1.setCilindrada(1500);
		
		c7.setMotor(m1);
		
		System.out.println(c7);
		

		
		
		
		}

}
