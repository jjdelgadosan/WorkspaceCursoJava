package modelo.entidad;

import java.util.ArrayList;

public class Aeropuerto {
	
	private String nombre;
	private String ciudad;
	private ArrayList<Avion> listaAviones;
	
	public Aeropuerto() {
		super();
	}

	public Aeropuerto(String nombre, String ciudad, ArrayList<Avion> listaAviones) {
		super();
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.listaAviones = listaAviones;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public ArrayList<Avion> getListaAviones() {
		return listaAviones;
	}

	public void setListaAviones(ArrayList<Avion> listaAviones) {
		this.listaAviones = listaAviones;
	}

	@Override
	public String toString() {
		return "Aeropuerto [nombre=" + nombre + ", ciudad=" + ciudad + ", listaAviones=" + listaAviones + "]";
	}
	
	
	
}
