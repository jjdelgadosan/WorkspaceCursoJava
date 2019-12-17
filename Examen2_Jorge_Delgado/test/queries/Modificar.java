package queries;

import modelo.entidad.Pelicula;
import modelo.persistencia.DaoPelicula;

public class Modificar {

	public static void main(String[] args) {
		
		DaoPelicula daoPelicula = new DaoPelicula();
		
		Pelicula pelicula = new Pelicula();
		pelicula.setTitulo("Tiburon III");		
		pelicula.setDirector("Steven Spilver");
		pelicula.setGenero("terror");
		pelicula.setAnio(1988);
		pelicula.setId(3);
		
		boolean modificar =  daoPelicula.modificar(pelicula);
		
		if (modificar = true) {
			System.out.println("La pelicula : " + pelicula + " ha sido modificada");
		}else {
			System.out.println("error al modificar la pelicula : " + pelicula);
		}

	}

}
