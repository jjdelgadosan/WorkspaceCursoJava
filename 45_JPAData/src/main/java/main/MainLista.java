package main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.Configuracion;
import modelo.entidad.Pelicula;
import modelo.negocio.GestorPelicula;

public class MainLista {
	public static void main(String[] args) {
		ApplicationContext context = 
				new AnnotationConfigApplicationContext(
						Configuracion.class);
		
		GestorPelicula gp = context.getBean("gestorPelicula",GestorPelicula.class);
				
		List<Pelicula> listaPelicula = gp.listar();
		
		for(Pelicula p : listaPelicula) {
			System.out.println(p);
			}
		System.out.println("Fin del alta pelicula");
	}
}
