package curso.modelo.controlador;

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
import curso.modelo.gestor.GestorPelicula;
import curso.modelo.persistancia.DaoPelicula;

//Aqui no anotamos la clase con @Controller
//ya que con esa anotacion lo que se esperan los
//metodos que devuelvas son vistas
//Aqui en rest devolvemos directamente datos
@RestController
public class ControladorPelicula {

	@Autowired
	private GestorPelicula gp;
	
	//Recuperamos la lista de peliculas
	@GetMapping(path = "peliculas", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	public ResponseEntity<Peliculas> listar(){
		List<Pelicula> lista = gp.getLista();
		Peliculas peliculas = new Peliculas();
		peliculas.setListaPelicula(lista);
		return new ResponseEntity<Peliculas>(peliculas,HttpStatus.OK);
	}
	
	//Damos de alta peliculas
	@PostMapping(path = "peliculas", consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Pelicula> alta(@RequestBody Pelicula p){
		gp.alta(p);//actualiza el id
		return new ResponseEntity<Pelicula>(p,HttpStatus.CREATED);
	}
	
	//como el id que buscamos va como parametro de path o rutas debemos de ponerlo entre llaves
	//la manera de recogerlo sera con la anotacion @PathParam
	//Busqueda de pelicula por id
	@GetMapping(path ="peliculas/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Pelicula> obtener(@PathVariable("id") Integer id){
		Optional<Pelicula> opt = gp.findById(id);
		if(opt.isPresent()) {
			return new ResponseEntity<Pelicula>(opt.get(),HttpStatus.OK);
		}else {
			return new ResponseEntity<Pelicula>(HttpStatus.NOT_FOUND);
		}
	}
	
	//Actualizamos una pelicula por el id
	@PutMapping(path="peliculas/{id}", consumes =  MediaType.APPLICATION_JSON_VALUE,
			produces =  MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Pelicula> modificar(@RequestBody Pelicula pelicula,
					@PathVariable Integer id){
		Optional<Pelicula> opt = gp.findById(id); //<con esto vemos si existe la pelicula a actualizar
		if(opt.isPresent()) {
			pelicula.setId(id);
			gp.actualizar(pelicula);
			return new ResponseEntity<Pelicula>(pelicula,HttpStatus.OK);
		}else {
			pelicula.setId(id);
			return new ResponseEntity<Pelicula>(pelicula,HttpStatus.NOT_FOUND);
		}	
		
	}
	
	@DeleteMapping(path="peliculas/{id}")
	public ResponseEntity<Pelicula> borrar(@PathVariable Integer id){
		Optional<Pelicula> opt = gp.findById(id);
		if(opt.isPresent()) {
			gp.borrar(id);
			return new ResponseEntity<Pelicula>(opt.get(),HttpStatus.OK);
		}else {
			return new ResponseEntity<Pelicula>(HttpStatus.NOT_FOUND);
		}	
	}
}
