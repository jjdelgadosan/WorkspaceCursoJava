package Modelo.negocio;

import java.util.ArrayList;

import Modelo_entidad.Libreria;
import Modelo_entidad.Libro;

public class GestorLibros { 
// Hemos creado una clase con un atributo Libreria ( que me vincula con la clase libreria univocamente).
// Para la implementacion de sus metodos (geter y seter y propios) debo crear un objeto del Gestor libros (gl)
	
//----------atributos
	private Libreria libreria;
	
// ----------geter y seter
	public Libreria getLibreria() {
		return libreria;
	}

	public void setLibreria(Libreria libreria) {
		this.libreria = libreria;
	}
//--------------metodos propios
	// ------------ Inicio metodo alta
	public boolean alta(Libro l) {
		ArrayList<Libro> apuntador = libreria.getListaLibro();
		if (l.getIsbn().length() > 0) {
			if (l.getTitulo().length() > 0) {
				apuntador.add(l); // add de un libro al array
				return true;
			} else {
				return false;
			}
		}

		else {
			return false;
		}

	}
	// ------------ fin metodo alta

	// ------- inicio lista libro
	public ArrayList<Libro> getListaLibros() {
		return libreria.getListaLibro();
	}

	/**
	 * Metodo que busca por isbn de un libro
	 * 
	 * @param ISBN el ISBN de un libro a buscar
	 * @return libro en caso de que se encuetre, null en caso de que no se encuentre
	 */
	public Libro buscarPorIsbn(String buscarIsbn) {
		for (Libro l : libreria.getListaLibro()) {
			if (l.getIsbn().equals(buscarIsbn)) {
				return l;
			}
		}
		return null;
	}

	public ArrayList<Libro> buscarPorEditorial(String editorial) {
		ArrayList<Libro> arrayEditorial = new ArrayList<Libro>();
		for (Libro l : libreria.getListaLibro()) {
			if (l.getEditorial().equals(editorial)) {
				arrayEditorial.add(l);	
							}
		}
		return arrayEditorial;
	}

}
