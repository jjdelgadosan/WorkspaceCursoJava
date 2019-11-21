package Modelo_entidad;

import java.util.ArrayList;

public class Libreria {
	
	private String nombreLibreria;
	private ArrayList<Libro> listaLibro;
	
	public String getNombreLibreria() {
		return nombreLibreria;
	}
	public void setNombreLibreria(String nombreLibreria) {
		this.nombreLibreria = nombreLibreria;
	}
	public ArrayList<Libro> getListaLibro() {
		return listaLibro;
	}
	public void setListaLibro(ArrayList<Libro> listaLibro) {
		this.listaLibro = listaLibro;
	}
	@Override
	public String toString() {
		return "Libreria [nombreLibreria=" + nombreLibreria + ", listaLibro=" + listaLibro + "]";
	}
	
	
	
	
	

}
