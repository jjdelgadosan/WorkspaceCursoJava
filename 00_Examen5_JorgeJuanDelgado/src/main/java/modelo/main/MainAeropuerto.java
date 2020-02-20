package modelo.main;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import modelo.entidad.Aeropuerto;

public class MainAeropuerto{

	private static ApplicationContext context;
	
	public static void main(String[] args) {
		
		context = new ClassPathXmlApplicationContext("beans.xml");
		
		Aeropuerto a = context.getBean("aeropuerto",Aeropuerto.class);
		System.out.println(a);
		
	}

}
