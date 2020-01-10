package queries;

import modelo.entidad.Pelicula;
import modelo.persistencia.DaoPelicula;

public class Consulta {

	public static void main(String[] args) {
		
		DaoPelicula daoPelicula = new DaoPelicula();
		
		int id = 1;
		Pelicula pelicula =  daoPelicula.obtener(id);
		
		if (pelicula == null) {
			System.out.println("La pelicula con id : " + pelicula.getId() + " no se ha encontrado");
		}else {
			System.out.println("La pelicula es : " + pelicula);
		}
		

	}

}
