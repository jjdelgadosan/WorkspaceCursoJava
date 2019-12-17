package modelo.persistencia;

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

	private Connection conexion;
	
	public boolean abrirConexion() {
		
		String url = "jdbc:mysql://localhost:3306/jdbc?serverTimezone=" + TimeZone.getDefault().getID();
		String usuario = "root";
		String password = "root";
		
		try {
			conexion = DriverManager.getConnection(url, usuario, password);
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean cerrarConexion() {
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
		if(!abrirConexion()) {
			return false;
		}
		
		String query = "insert into peliculas (titulo, " +
		"director,genero,anio) values(?,?,?,?)";
		
		try {
			PreparedStatement ps = conexion.prepareStatement(query);
			
			ps.setString(1, pelicula.getTitulo());
			ps.setString(2, pelicula.getDirector());
			ps.setString(3, pelicula.getGenero());
			ps.setInt(4, pelicula.getAnio());
			
			int numeroFilas = ps.executeUpdate();
			if(numeroFilas == 0) {
				return false;
			}else {
				return true;
			}
		} catch (SQLException e) {
			System.out.println("Error al dar de alta la pelicula " + pelicula);
			e.printStackTrace();
			return false;
		} finally {
	
			cerrarConexion();
		}
	}
	
	public boolean modificar(Pelicula pelicula) {
		if(!abrirConexion()) {
			return false;
		}		
	
		String query = "update peliculas set titulo=?, director=?"
				+ ", genero=?, anio=? where idpeliculas=?";
		
		try {
			
			PreparedStatement ps = conexion.prepareStatement(query);
		
			ps.setString(1, pelicula.getTitulo());
			ps.setString(2, pelicula.getDirector());
			ps.setString(3, pelicula.getGenero());
			ps.setInt(4, pelicula.getAnio());
			ps.setInt(5, pelicula.getId());
			
			int numeroFilas = ps.executeUpdate();
			
			if(numeroFilas == 0) {
				return false;
			}else {
				return true;
			}
		} catch (SQLException e) {
			System.out.println("Error al modificar la pelicula con el id : " + pelicula.getId());
			e.printStackTrace();
			return false;
		} finally {
	
			cerrarConexion();
		}
	}
	
	public boolean borrar(Pelicula pelicula) {
		if(!abrirConexion()) {
			return false;
		}		
		
		String query = "delete from peliculas where idpeliculas=?";
		
		try {

			PreparedStatement ps = conexion.prepareStatement(query);
			
			ps.setInt(1, pelicula.getId());
			
			int numeroFilas = ps.executeUpdate();
			if(numeroFilas == 0) {
				return false;
			}else {
				return true;
			}
		} catch (SQLException e) {
			System.out.println("Error al borrar la pelicula con id : " + pelicula.getId());
			e.printStackTrace();
			return false;
		} finally {
	
			cerrarConexion();
		}
	}
	
	public Pelicula obtener(int id) {
		if(!abrirConexion()) {
			return null;
		}		
		
		String query = "select idpeliculas,titulo,director,genero,anio from "
				+ "peliculas where idpeliculas=?";
		
		try {
			
			PreparedStatement ps = conexion.prepareStatement(query);
			
			ps.setInt(1, id);
			
			ResultSet rs = ps.executeQuery();
			
			Pelicula pelicula = null;
			
			while(rs.next()) {
				pelicula = new Pelicula();
				pelicula.setId(rs.getInt(1));
				pelicula.setTitulo(rs.getString(2));
				pelicula.setDirector(rs.getString(3));
				pelicula.setGenero(rs.getString(4));
				pelicula.setAnio(rs.getInt(5));
			}
			return pelicula;
		} catch (SQLException e) {
			System.out.println("Error al seleccionar pelicula");
			e.printStackTrace();
			return null;
		} finally {
		
		cerrarConexion();
		}
		
	}
	
	public List<Pelicula> listar() {
		if(!abrirConexion()) {
			return null;
		}		
		
		String query = "select idpeliculas,titulo,director,genero,anio from peliculas";
		
		try {
	
			PreparedStatement ps = conexion.prepareStatement(query);
	
			ResultSet rs = ps.executeQuery();
			
			Pelicula pelicula = null;
			List<Pelicula> listaPeliculas = new ArrayList<Pelicula>();
			//asi pues, podemos recorrernos la lista
			while(rs.next()) {//preguntamos si hay un registro mas
				pelicula = new Pelicula();
				pelicula.setId(rs.getInt(1));
				pelicula.setTitulo(rs.getString(2));
				pelicula.setDirector(rs.getString(3));
				pelicula.setGenero(rs.getString(4));
				pelicula.setAnio(rs.getInt(5));
				
				listaPeliculas.add(pelicula);
			}
			return listaPeliculas;
		} catch (SQLException e) {
			System.out.println("Error en el insertar");
			e.printStackTrace();
			return null;
		} finally {
	
			cerrarConexion();
		}
		
	}
}
