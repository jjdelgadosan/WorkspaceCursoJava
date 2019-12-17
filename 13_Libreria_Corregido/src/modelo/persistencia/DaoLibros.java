package modelo.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;

import modelo.entidad.Libro;

public class DaoLibros {

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
	
	public boolean alta(Libro libro) {
		if(!abrirConexion()) {
			return false;
		}
		
		String query = "insert into libros (isbn, titulo, " +
		"editorial ,anio) values(?,?,?,?)";
		
		try {
			PreparedStatement ps = conexion.prepareStatement(query);
			
			ps.setString(1, libro.getIsbn());
			ps.setString(2, libro.getTitulo());
			ps.setString(3, libro.getEditorial());
			ps.setInt(4, libro.getAnioPublicacion());
			
			int numeroFilas = ps.executeUpdate();
			if(numeroFilas == 0) {
				return false;
			}else {
				return true;
			}
		} catch (SQLException e) {
			System.out.println("Error al dar de alta el libro " + libro);
			e.printStackTrace();
			return false;
		} finally {
	
			cerrarConexion();
		}
	}
	
	public boolean modificar(Libro libro) {
		if(!abrirConexion()) {
			return false;
		}		
	
		String query = "update libros set isbn=?, titulo=?"
				+ ", editorial=?, anio=? where id=?";
		
		try {
			
			PreparedStatement ps = conexion.prepareStatement(query);
		
			ps.setString(1, libro.getIsbn());
			ps.setString(2, libro.getTitulo());
			ps.setString(3, libro.getEditorial());
			ps.setInt(4, libro.getAnioPublicacion());
			ps.setInt(5, libro.getId());
			
			
			int numeroFilas = ps.executeUpdate();
			
			if(numeroFilas == 0) {
				return false;
			}else {
				return true;
			}
		} catch (SQLException e) {
			System.out.println("Error al modificar el libro con el id : " + libro.getId());
			e.printStackTrace();
			return false;
		} finally {
	
			cerrarConexion();
		}
	}
	
	public boolean borrar(Libro libro) {
		if(!abrirConexion()) {
			return false;
		}		
		
		String query = "delete from libros where id=?";
		
		try {

			PreparedStatement ps = conexion.prepareStatement(query);
			
			ps.setInt(1, libro.getId());
			
			int numeroFilas = ps.executeUpdate();
			if(numeroFilas == 0) {
				return false;
			}else {
				return true;
			}
		} catch (SQLException e) {
			System.out.println("Error al borrar el libro con el id : " + libro.getId());
			e.printStackTrace();
			return false;
		} finally {
	
			cerrarConexion();
		}
	}
	
	public Libro obtener(int id) {
		if(!abrirConexion()) {
			return null;
		}		
		
		String query = "select id,isbn,titulo,editorial,anio from "
				+ "libros where id=?";
		
		try {
			
			PreparedStatement ps = conexion.prepareStatement(query);
			
			ps.setInt(1, id);
			
			ResultSet rs = ps.executeQuery();
			
			Libro libro = null;
			
			while(rs.next()) {
				libro = new Libro();
				libro.setId(rs.getInt(1));
				libro.setIsbn(rs.getString(2));
				libro.setTitulo(rs.getString(3));
				libro.setEditorial(rs.getString(4));
				libro.setAnioPublicacion(rs.getInt(5));
				
			}
			return libro;
		} catch (SQLException e) {
			System.out.println("Error al seleccionar libro");
			e.printStackTrace();
			return null;
		} finally {
		
		cerrarConexion();
		}
		
	}
	
	public List<Libro> listar() {
		if(!abrirConexion()) {
			return null;
		}		
		
		String query = "select id,isbn,titulo,editorial,anio from libros";
		
		try {
	
			PreparedStatement ps = conexion.prepareStatement(query);
	
			ResultSet rs = ps.executeQuery();
			
			Libro libro = null;
			List<Libro> listaLibros = new ArrayList<Libro>();
			//asi pues, podemos recorrernos la lista
			while(rs.next()) {//preguntamos si hay un registro mas
				libro = new Libro();
				
				libro.setId(rs.getInt(1));
				libro.setIsbn(rs.getString(2));
				libro.setTitulo(rs.getString(3));
				libro.setEditorial(rs.getString(4));
				libro.setAnioPublicacion(rs.getInt(5));
				
				listaLibros.add(libro);
			}
			return listaLibros;
		} catch (SQLException e) {
			System.out.println("Error en el insertar");
			e.printStackTrace();
			return null;
		} finally {
	
			cerrarConexion();
		}
		
	}
}
