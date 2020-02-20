package login.modelo.persistencia;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.RequestScope;

import login.modelo.entidad.Usuario;



	@Repository
	@RequestScope 
		public interface DaoConsulta 
		extends JpaRepository<Usuario, Integer>{
		
		public Usuario findByNombre(String nombre);
			
	}
