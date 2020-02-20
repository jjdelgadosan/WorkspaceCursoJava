package modelo.negocio;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import modelo.entidad.Libro;
import modelo.persistencia.DaoLibreria;

@Service
public class GestorLibreria {
	//En este caso lo que necesita la capa gestora
	//para funcionar es el dao del la librería
	//habria que adaptar todo el codigo a este dao
	
	@Autowired
	private DaoLibreria daoLibreria;
	
	/**
	 * Dar de alta un libro
	 * @param libro libro a dar de alta
	 * @return 0 en caso de que haya ido bien, 1 en caso
	 * de que falte el isbn, 2 en caso de que falte el titulo
	 * y 3 en caso de que el isbn este duplicado
	 */
	
	@Transactional
	public int alta(Libro libro) {
		if(libro.getIsbn().isEmpty()) {
			return 1;
		}
		
		if(libro.getTitulo().isEmpty()) {
			return 2;
		}
				
		daoLibreria.save(libro);
		return 0;
		
	}
	@Transactional
	public Libro modificar(Libro libro) {
		//si le pasamos el id, actualiza el registro
		//con dicho id
		return daoLibreria.save(libro);
	}
	
	public Libro obtener(int id) {
		return daoLibreria.findById(id).get();
	}
	
	public List<Libro> listar(){
		return daoLibreria.findAll();
	}
	
	@Transactional
	public void borrar(int id) {
		daoLibreria.deleteById(id);
	}
	
	public Libro findByIsbn(String isbn) {
		return daoLibreria.findByIsbn(isbn);
	}
	
	public List<Libro> findByEditorial(String editorial) {
		return daoLibreria.findByEditorial(editorial);
	}
	
	
	
	
	
	

	
}
