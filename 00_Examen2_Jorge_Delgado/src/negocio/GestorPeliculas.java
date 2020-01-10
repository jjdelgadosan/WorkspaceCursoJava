package negocio;

import java.util.List;

import modelo.entidad.Pelicula;
import modelo.persistencia.DaoPelicula;

public class GestorPeliculas {
	
	private DaoPelicula daoPelicula;
	
	
	public boolean alta(Pelicula pelicula) {		
		daoPelicula = new DaoPelicula();
		
		boolean alta =  daoPelicula.alta(pelicula);
		return alta;
		}
		
	public boolean borrar(Pelicula pelicula) {		
		daoPelicula = new DaoPelicula();
		
		boolean borrar =  daoPelicula.borrar(pelicula);
		return borrar;
		}
		
	public boolean modificar(Pelicula pelicula) {		
		daoPelicula = new DaoPelicula();
		
		boolean modificar =  daoPelicula.modificar(pelicula);
		return modificar;
		}
		
	public Pelicula obtener(Pelicula pelicula) {		
		daoPelicula = new DaoPelicula();
		int id = pelicula.getId();
		Pelicula consultaPeli =  daoPelicula.obtener(id);
		return consultaPeli;
		}
		
	public List<Pelicula> listar() {		
		daoPelicula = new DaoPelicula();
		
		List<Pelicula> listaPeliculas =  daoPelicula.listar();
		return listaPeliculas;
		}
	
}
