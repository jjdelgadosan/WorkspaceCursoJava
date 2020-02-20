package modelo.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Entity
@Table(name = "libros")
@Component
@Scope("prototype")
public class Libro {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	// con la etiqueta @Colum se le dan los atributos a los campos de la tabla
	@Column(name="isbn", unique=true, nullable= false) 
	private String isbn;
	@Column(name="titulo", nullable= false)
	private String titulo;
	@Column(name="editorial", nullable= false)
	private String editorial;
	@Column(name="anioPublicacion", nullable= false)
	private int anioPublicacion;
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public int getAnioPublicacion() {
		return anioPublicacion;
	}
	public void setAnioPublicacion(int anioPublicacion) {
		this.anioPublicacion = anioPublicacion;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Libro [id=" + id + ", isbn=" + isbn + ", titulo=" + titulo + ", editorial=" + editorial
				+ ", anioPublicacion=" + anioPublicacion + "]";
	}
	
	
}
