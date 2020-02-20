package modelo.persistencia;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import modelo.entidad.Libro;


	@Repository
	public interface DaoLibreria 
		extends JpaRepository<Libro, Integer>{
	 
		
		public Libro findByIsbn(String isbn);
		
		public List<Libro> findByEditorial(String editorial);
	
	}
