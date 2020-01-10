package queries;


import modelo.entidad.Pelicula;
import modelo.persistencia.DaoPelicula;

public class borrar {

	public static void main(String[] args) {
		DaoPelicula daoPelicula = new DaoPelicula();
		
		Pelicula pelicula = new Pelicula();
		pelicula.setId(2);
		
		boolean borrar =  daoPelicula.borrar(pelicula);
		
		if (borrar = true) {
			System.out.println("La pelicula con id : " + pelicula.getId() + " ha sido elimininada");
		}else {
			System.out.println("Error al borrar la pelicula con id : " + pelicula.getId());
		}
		

	}


}
