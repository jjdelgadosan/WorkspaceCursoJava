package modelo.entidad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")


public class Pelicula {
	private String titulo;
	private String genero;
	@Autowired
	//Por defeto es autowired por tipo y por name (byTipe y byName)
	// si hubiera algun otro objeto director
	@Qualifier("director")
	//va en conjunto con el autowired por tipo y luego le decimos 
	//el id del objeto que queremos que le inyecte
	private Director Director;
	private int anioEstreno;
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public Director getDirector() {
		return Director;
	}
	public void setDirector(Director director) {
		Director = director;
	}
	public int getAnioEstreno() {
		return anioEstreno;
	}
	public void setAnioEstreno(int anioEstreno) {
		this.anioEstreno = anioEstreno;
	}
	
	@Override
	public String toString() {
		return "Pelicula [titulo=" + titulo + ", genero=" + genero + ", Director=" + Director + ", anioEstreno="
				+ anioEstreno + "]";
	}
}
