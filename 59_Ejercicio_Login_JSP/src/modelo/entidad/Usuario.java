package modelo.entidad;

import java.util.List;

public class Usuario {
	private String nombre="Administrador del sistema";
	private String categoria="El puto amo del sistema";
	private int a�os= 46;
	private String direccion = "Ronda de Segovia";
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public int getA�os() {
		return a�os;
	}
	public void setA�os(int a�os) {
		this.a�os = a�os;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", categoria=" + categoria + ", a�os=" + a�os + ", direccion=" + direccion
				+ "]";
	}
	
	
	

}
