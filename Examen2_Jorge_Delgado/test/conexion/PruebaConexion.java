package conexion;

import modelo.persistencia.DaoPelicula;

public class PruebaConexion {

	public static void main(String[] args) {
		DaoPelicula daoPelicula = new DaoPelicula();
		boolean estaConectado = daoPelicula.abrirConexion();
		System.out.println(estaConectado);
	}

}
