package modelo.persistencia;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import modelo.entidad.Pelicula;

//Para crear ahora el dao con JPAData debemos
//de crear una intefaz y extenderla de JpaRepository
//y tiene dos valores parametrizados, uno es el tipo de 
//entidad con el que queremos trabajar (Pelicula) y el otro seria
//el tipo de dato que es el id, en nuestro caso es Integer
@Repository
public interface PeliculaDao 
	extends JpaRepository<Pelicula, Integer>{
	
	// Para hacer consultas especificas podemos hacerlas dentro de esta interface
	// y sigue una medtodologia que se suele llamar, convencion frente a configuracion,
	// que tambien será uno de los principios de springboot.
	
	// Si el metodo empieza por findBy hara una busqueda. Si luego pongo la propiedad
	// que quiero, (en este caso titulo) hara la busqueda por esa propiedad.
	public List<Pelicula> findByTitulo(String titulo);
	
	// Para hacer busqueda por titulo y genero
	public List<Pelicula> findByTituloAndGenero(String titulo, String genero);
	
	// Para hacer busqueda por titulo o genero
	public List<Pelicula> findByTituloOrGenero(String titulo, String genero);
	
	// Para hacer busqueda por algo que este en el titulo 
	public List<Pelicula> findByTituloContaining(String titulo);
	
	// Para hacer busqueda por titulo y que te lo devuelva ordenado (asc = ascendente, desc =descendente)
	public List<Pelicula> findByTituloOrderByTituloAsc(String titulo);
	public List<Pelicula> findByTituloOrderByTituloDesc(String titulo);
	
	// La consulta diferencia las mayusculas, con IgnoreCase no tiene en cuenta la diferencia
	public List<Pelicula> findByTituloContainingIgnoreCase(String titulo);
	
	// Esto es JPQL, una mezcla entre sql y programacion orientada a objetos
	// Cuando se quiere hacer algo que no te da JPA, esta es la forma de hacerlo. Es una query en JPQL
	@Query("select p from Pelicula p where p.genero=?1")
	public List<Pelicula> findByLoQueMeDeLaGana (String genero);
	
	
}
