package Bean;

public class Pelicula {
	
	private String  titulo;
	private String  genero;
	private Director director;
	private int anioEstreno;

	public Pelicula() {
		super();
	}
	public Pelicula(String titulo, String genero, Director director, int anioEstreno) {
		super();
		this.titulo = titulo;
		this.genero = genero;
		this.director = director;
		this.anioEstreno = anioEstreno;
	}
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
		return director;
	}
	public void setDirector(Director director) {
		this.director = director;
	}
	public int getAnioEstreno() {
		return anioEstreno;
	}
	public void setAnioEstreno(int anioEstreno) {
		this.anioEstreno = anioEstreno;
	}
	@Override
	public String toString() {
		return "Peliculas [titulo=" + titulo + ", genero=" + genero + ", director=" + director + ", anioEstreno="
				+ anioEstreno + "]";
	}
	
	
	
	

}
