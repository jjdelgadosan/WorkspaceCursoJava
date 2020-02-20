package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.Configuracion;
import modelo.entidad.Pelicula;
import modelo.negocio.GestorPelicula;

public class MainModificar {
	public static void main(String[] args) {
		ApplicationContext context = 
				new AnnotationConfigApplicationContext(
						Configuracion.class);
		
		GestorPelicula gp = context.getBean("gestorPelicula",GestorPelicula.class);
		
		Pelicula p = context.getBean("pelicula",Pelicula.class);
		p.setId(2);
		p.setTitulo("Titanic");
		p.setGenero("amor");
		p.setDirector("Leonardo Di Caprio");
		p.setYear(2222);
		
		Pelicula pelicula = gp.modificar(p);
		
		System.out.println(pelicula);
		System.out.println("Fin del alta pelicula");
	}
}
