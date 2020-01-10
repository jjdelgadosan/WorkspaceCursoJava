package servidor.modelo.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;

import modelo.entidad.Pelicula;

public class DaoPelicula {
	/**
	 * Esta clase se encarga de la persistencia con la clase pelicula
	 * e implementa un CRUD (Create, Read, Update, Delete) sobre la 
	 * entidad pelicula. 
	 * Un DAO es el acr�nimo de Data Access Object. Es un objeto
	 * que interact�a los objetos coche con la BBDD.
	 * 
	 * Nosotros vamos a desarrollar este DAO mediante el API de Java
	 * JDBC (acr�nimo para Java Data Base Connection). Un API (Application 
	 * Program Interface) es un
	 * conjunto de librer�a que proporcionan una funcionalidad com�n.
	 * Hay otras API's (i.e. JPA - Java Persistence API).
	 * 
	 * Para usar estas API's, necesitamos los drivers de conexi�n que 
	 * ha implementado el proveedor de nuestra base de datos (MySQL).
	 * Cada proveedor implementa sus drivers para cada lenguaje de programaci�n.
	 * 
	 * Hay que buscar en la Web del proveedor el driver para la version 8.0 de MySQL,
	 * y descargarlo en el proyecto Java, actualizando el ClassPath del Eclipse.
	 * 
	 * 
	 * @author aula2m
	 * @see Pelicula
	 * @since 07-01-2020
	 * @version 1.0
	 */

		// Esto es una interfaz. 
		// El objeto que realiza la conexi�n a la BBDD est� dentro de la librer�a MySQL
		private Connection conexion;
		
		public boolean abrirConexion( ) {
			
			String url = "jdbc:mysql://localhost:3306/examensocket?serverTimezone=" + TimeZone.getDefault().getID();
			String usuario = "root";
			String password = "root";
			
			try {
				// DriverManager devuelve la conexi�n a MySQL efectuada por la librer�a 
				// mysql-connector-java-8.0.18.jar. 
				// Trabaja con inyecci�n de dependencias: el m�todo getConnection crea el objeto "conexion".
				conexion = DriverManager.getConnection(url, usuario, password);

				return true;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return false;
			}
					
		}
		
		public boolean cerrarConexiones() {
			
			try {
				conexion.close();
				return true;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return false;
			}
		}
		
		
		public boolean alta(Pelicula pelicula) {
			
			if (!abrirConexion()) {
				return false;
			}
			
			boolean alta = true;
			
			// Una posible forma de formar el select. Pero no es �ptima ni es segura.
			// No es �ptima, porque cada consulta se guarda en cach�. Si son parecidas, deber�an estar parametrizadas.
			// No es segura, porque si se concatenan entradas del usuario con la sql, el usuario podr�a incluir varias sql's en
			// una sola entrada. (Y alguna sql concatenada podr�a ser "drop database *";

			
			// Es necesario hacer consultas preparadas
			String query = "insert into pelicula (titulo, director) values (?,?)";
			
			try {
				// Generamos una consulta preparada
				PreparedStatement ps = conexion.prepareStatement(query);
				ps.setString(1, pelicula.getTitulo());
				ps.setString(2, pelicula.getDirector());

				
				// Esta funci�n devuelve el n�mero de filas afectadas. Si ha afectado 0 filas, ha fallado.
				int numeroFilas = ps.executeUpdate();
				
				if (numeroFilas == 0) {
					alta = false;
					System.out.println("Error en la inserci�n");
				} else {
					System.out.println("Inserci�n completada");
					alta = true;
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				alta = false;
			// El bloque finally se va a ejecutar siempre, venga el c�digo del bloque try o del bloque catch.
			} finally {
				cerrarConexiones();
			}
			
			return alta;
		}
		
		public boolean modificar(Pelicula pelicula) {
			
			if (!abrirConexion()) {
				return false;
			}
			
			boolean modificar = true;
			
			// Una posible forma de formar el select. Pero no es �ptima ni es segura.
			// No es �ptima, porque cada consulta se guarda en cach�. Si son parecidas, deber�an estar parametrizadas.
			// No es segura, porque si se concatenan entradas del usuario con la sql, el usuario podr�a incluir varias sql's en
			// una sola entrada. (Y alguna sql concatenada podr�a ser "drop database *";

			
			// Es necesario hacer consultas preparadas
			String query = "update pelicula set titulo=?, director=? where id=?";
			
			try {
				// Generamos una consulta preparada
				PreparedStatement ps = conexion.prepareStatement(query);
				ps.setString(1, pelicula.getTitulo());
				ps.setString(2, pelicula.getDirector());
				ps.setInt(3, pelicula.getId());
				
				// Esta funci�n devuelve el n�mero de filas afectadas. Si ha afectado 0 filas, ha fallado.
				int numeroFilas = ps.executeUpdate();
				
				if (numeroFilas == 0) {
					modificar = false;
					System.out.println("Error en la actualizaci�n");
				} else {
					System.out.println("Actualizaci�n completada");
					modificar = true;
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				modificar = false;
			// El bloque finally se va a ejecutar siempre, venga el c�digo del bloque try o del bloque catch.
			} finally {
				cerrarConexiones();
			}
			
			return modificar;
		}
		
		public boolean borrar(int id) {
			
			if (!abrirConexion()) {
				return false;
			}
			
			boolean borrar = true;
			
			// Una posible forma de formar el select. Pero no es �ptima ni es segura.
			// No es �ptima, porque cada consulta se guarda en cach�. Si son parecidas, deber�an estar parametrizadas.
			// No es segura, porque si se concatenan entradas del usuario con la sql, el usuario podr�a incluir varias sql's en
			// una sola entrada. (Y alguna sql concatenada podr�a ser "drop database *";
			
			// Es necesario hacer consultas preparadas
			String query = "delete from pelicula where id=?";
			
			try {
				// Generamos una consulta preparada
				PreparedStatement ps = conexion.prepareStatement(query);
				ps.setInt(1, id);
				
				// Esta funci�n devuelve el n�mero de filas afectadas. Si ha afectado 0 filas, ha fallado.
				int numeroFilas = ps.executeUpdate();
				
				if (numeroFilas == 0) {
					borrar = false;
					System.out.println("Error en el borrado");
				} else {
					System.out.println("Borrado completado");
					borrar = true;
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				borrar = false;
			// El bloque finally se va a ejecutar siempre, venga el c�digo del bloque try o del bloque catch.
			} finally {
				cerrarConexiones();
			}
			
			return borrar;
		}
		
		public Pelicula obtener(int id) {
			
			if (!abrirConexion()) {
				return null;
			}

			String query = "select id,titulo,director from pelicula where id=?";
			
			try {
				// Generamos una consulta preparada
				PreparedStatement ps = conexion.prepareStatement(query);
				ps.setInt(1, id);
				
				// Esta funci�n devuelve el n�mero de filas afectadas. Si ha afectado 0 filas, ha fallado.
				ResultSet rs = ps.executeQuery();  //executeQuery no modifica la BBDD. executeUpdate s� modifica la BBDD
				// ResultSet es un objeto que tiene toda la lista de registros que ha devuelto 
				// la consulta
				
				Pelicula pelicula = null;
				
				while (rs.next()) {
					pelicula = new Pelicula();
					pelicula.setId(rs.getInt(1));
					pelicula.setTitulo(rs.getString(2));
					pelicula.setDirector(rs.getString(3));
				}
				
				return pelicula;
				
			} catch (SQLException e) {
				
				e.printStackTrace();
				return null;
			// El bloque finally se va a ejecutar siempre, venga el c�digo del bloque try o del bloque catch.
			} finally {
				cerrarConexiones();
			}

		}
		
		/**
		 * @param pelicula
		 * @return Pelicula or null if not id found in DDBB
		 */
		public Pelicula obtenerPorTitulo(String titulo) {
			
			if (!abrirConexion()) {
				return null;
			}

			String query = "select id,titulo,director from pelicula where titulo=?";
			
			try {
				// Generamos una consulta preparada
				PreparedStatement ps = conexion.prepareStatement(query);
				ps.setString(1, titulo);
				
				// Esta funci�n devuelve el n�mero de filas afectadas. Si ha afectado 0 filas, ha fallado.
				ResultSet rs = ps.executeQuery();  //executeQuery no modifica la BBDD. executeUpdate s� modifica la BBDD
				// ResultSet es un objeto que tiene toda la lista de registros que ha devuelto 
				// la consulta
				
				Pelicula pelicula = null;
				
				while (rs.next()) {
					pelicula = new Pelicula();
					pelicula.setId(rs.getInt(1));
					pelicula.setTitulo(rs.getString(2));
					pelicula.setDirector(rs.getString(3));
				}
				
				return pelicula;
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			// El bloque finally se va a ejecutar siempre, venga el c�digo del bloque try o del bloque catch.
			} finally {
				cerrarConexiones();
			}

		}
		
		public List<Pelicula> listar() {
			
			List<Pelicula> listaPeliculas = new ArrayList<Pelicula>();
			
			if (!abrirConexion()) {
				return listaPeliculas;
			}

			
			// Una posible forma de formar el select. Pero no es �ptima ni es segura.
			// No es �ptima, porque cada consulta se guarda en cach�. Si son parecidas, deber�an estar parametrizadas.
			// No es segura, porque si se concatenan entradas del usuario con la sql, el usuario podr�a incluir varias sql's en
			// una sola entrada. (Y alguna sql concatenada podr�a ser "drop database *";

			
			// Es necesario hacer consultas preparadas
			String query = "select id,titulo,director from pelicula";
			
			try {
				// Generamos una consulta preparada
				PreparedStatement ps = conexion.prepareStatement(query);
				
				// Esta funci�n devuelve el n�mero de filas afectadas. Si ha afectado 0 filas, ha fallado.
				ResultSet rs = ps.executeQuery();  //executeQuery no modifica la BBDD. executeUpdate s� modifica la BBDD
				// ResultSet es un objeto que tiene toda la lista de registros que ha devuelto 
				// la consulta
			
				while (rs.next()) {
					Pelicula pelicula = new Pelicula();
					pelicula.setId(rs.getInt(1));
					pelicula.setTitulo(rs.getString(2));
					pelicula.setDirector(rs.getString(3));
					listaPeliculas.add(pelicula);
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			// El bloque finally se va a ejecutar siempre, venga el c�digo del bloque try o del bloque catch.
			} finally {
				cerrarConexiones();
			}

			
			return listaPeliculas;
		}
	}
