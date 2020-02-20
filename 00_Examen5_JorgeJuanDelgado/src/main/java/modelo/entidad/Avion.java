package modelo.entidad;

import java.util.ArrayList;

public class Avion {
	
	private int id;
	private String marca;
	private ArrayList<Asiento> listaAsientos;
	private ArrayList<Motor> listaMotores;
	private ArrayList<Rueda> listaRuedas;
	private int kilometros;
	
	public Avion() {
		super();
	}

	public Avion(int id, String marca, ArrayList<Asiento> listaAsientos, ArrayList<Motor> listaMotores,
			ArrayList<Rueda> listaRuedas, int kilometros) {
		super();
		this.id = id;
		this.marca = marca;
		this.listaAsientos = listaAsientos;
		this.listaMotores = listaMotores;
		this.listaRuedas = listaRuedas;
		this.kilometros = kilometros;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public ArrayList<Asiento> getListaAsientos() {
		return listaAsientos;
	}

	public void setListaAsientos(ArrayList<Asiento> listaAsientos) {
		this.listaAsientos = listaAsientos;
	}

	public ArrayList<Motor> getListaMotores() {
		return listaMotores;
	}

	public void setListaMotores(ArrayList<Motor> listaMotores) {
		this.listaMotores = listaMotores;
	}

	public ArrayList<Rueda> getListaRuedas() {
		return listaRuedas;
	}

	public void setListaRuedas(ArrayList<Rueda> listaRuedas) {
		this.listaRuedas = listaRuedas;
	}

	public int getKilometros() {
		return kilometros;
	}

	public void setKilometros(int kilometros) {
		this.kilometros = kilometros;
	}

	@Override
	public String toString() {
		return "Avion [id=" + id + ", marca=" + marca + ", listaAsientos=" + listaAsientos + ", listaMotores="
				+ listaMotores + ", listaRuedas=" + listaRuedas + ", kilometros=" + kilometros + "]";
	}
	
	
}
