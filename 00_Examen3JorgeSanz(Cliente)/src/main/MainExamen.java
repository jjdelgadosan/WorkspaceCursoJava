package main;

import java.util.Scanner;

import cliente.ClientePelicula;
import modelo.negocio.GestorPelicula;
import vista.VistaPeliculas;

public class MainExamen {

	
	public static void main(String[] args) {
		VistaPeliculas vp = new VistaPeliculas();
		GestorPelicula gp = new GestorPelicula();
		Scanner sc = new Scanner(System.in);
		ClientePelicula cp= new ClientePelicula();

		//el gestor pelicula necesita del cliente
		//para poder funcionar, por lo tanto le hago 
		//una inyeccion de su dependencia (ID)
		
		
		gp.setClientePelicula (cp);
		
		vp.setSc(sc);
		vp.setCp(cp);
		vp.setGp(gp);
		
		vp.mostrarApp(gp, sc, cp);
		
	}

}
