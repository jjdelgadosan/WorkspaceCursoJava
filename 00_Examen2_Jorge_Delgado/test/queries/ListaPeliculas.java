package queries;


import java.util.ArrayList;
import java.util.List;
import modelo.entidad.Pelicula;
import modelo.persistencia.DaoPelicula;

public class ListaPeliculas {

	public static void main(String[] args) {
		
		DaoPelicula daoPelicula = new DaoPelicula();
		
		List<Pelicula> listaPeliculas =  daoPelicula.listar();
		
		if (listaPeliculas == null) {
			System.out.println("lista no encontrada");
		}else {
			for (Pelicula pelicula : listaPeliculas) { 
			
			System.out.println("La pelicula encontrada es : " + pelicula);
		}
		

		}

	}
}
