package curso.modelo.gestor;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import curso.modelo.entidad.Pelicula;
import curso.modelo.entidad.Peliculas;
import curso.modelo.persistancia.DaoPelicula;

//Aqui no anotamos la clase con @Controller
//ya que con esa anotacion lo que se esperan los
//metodos que devuelvas son vistas
//Aqui en rest devolvemos directamente datos
@RestController
public class GestorPelicula {

	@Autowired
	private DaoPelicula daoPelicula;
	
	
	public List<Pelicula> getLista(){
		List<Pelicula> listaPeli = daoPelicula.findAll();	
		return listaPeli;
	}

	public Optional<Pelicula> findById(int id){
		Optional<Pelicula> pelicula = daoPelicula.findById(id);	
		return pelicula;
	}
	
	public boolean alta(Pelicula p) {
		daoPelicula.save(p);
		return true;
	}
	
	public boolean actualizar(Pelicula p) {
		daoPelicula.save(p);
		return true;
	}
	
	public boolean borrar(int id) {
		daoPelicula.deleteById(id);;
		return true;
	}
	
	
}
