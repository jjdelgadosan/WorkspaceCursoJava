package modelo.entidad;

public class Pelicula {
	
	private int id;
	private String titulo;
	private String director;
	private String genero;
	private int anio;
	
	public Pelicula() {
		super();
	}

	public Pelicula(int id, String titulo, String director, String genero, int anio) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.director = director;
		this.genero = genero;
		this.anio = anio;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	@Override
	public String toString() {
		return "Pelicula [id=" + id + ", titulo=" + titulo + ", director=" + director + ", genero=" + genero + ", anio="
				+ anio + "]";
	}

	
	
	
	
	
	
	
}
		
