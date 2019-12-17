package conexion;

import Modelo.persistencia.DaoPelicula;

public class PruebasConexion {

	public static void main(String[] args) {
		
		DaoPelicula daoCoche = new DaoPelicula();
		boolean estaConectado = daoCoche.abrirConexion();
		System.out.println("Estoy conectado");
		
	}
	
}
