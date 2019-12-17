package queries;

import modelo.entidad.Pelicula;
import modelo.persistencia.DaoPelicula;

public class Alta {

	public static void main(String[] args) {
		
		DaoPelicula daoPelicula = new DaoPelicula();
		
		Pelicula pelicula1 = new Pelicula();
		pelicula1.setTitulo("Tiburon");		
		pelicula1.setDirector("Steven Spilver");
		pelicula1.setGenero("terror");
		pelicula1.setAnio(1973);
		
		boolean alta =  daoPelicula.alta(pelicula1);
		
		if (alta = true) {
			System.out.println("La pelicula " + pelicula1.getTitulo() + " se ha dado de alta");
		}else {
			System.out.println("Error al dar de alta la pelicula " + pelicula1.getTitulo());
		}
		
		Pelicula pelicula2 = new Pelicula();
		pelicula2.setTitulo("Tiburon II");		
		pelicula2.setDirector("Steven Spilver");
		pelicula2.setGenero("terror");
		pelicula2.setAnio(1980);
		
		alta =  daoPelicula.alta(pelicula2);
		
		if (alta = true) {
			System.out.println("La pelicula " + pelicula2.getTitulo() + " se ha dado de alta");
		}else {
			System.out.println("Error al dar de alta la pelicula " + pelicula2.getTitulo());
		}
		
		Pelicula pelicula3 = new Pelicula();
		pelicula3.setTitulo("Tiburon III");		
		pelicula3.setDirector("Steven Spilver");
		pelicula3.setGenero("terror");
		pelicula3.setAnio(1985);
		
		alta =  daoPelicula.alta(pelicula3);
		
		if (alta = true) {
			System.out.println("La pelicula " + pelicula3.getTitulo() + " se ha dado de alta");
		}else {
			System.out.println("Error al dar de alta la pelicula " + pelicula3.getTitulo());
		}
		
	}

}
