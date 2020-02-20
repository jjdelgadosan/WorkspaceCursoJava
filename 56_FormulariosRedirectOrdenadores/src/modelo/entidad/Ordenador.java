package modelo.entidad;


import java.util.Arrays;
import java.util.List;


public class Ordenador {
	private String tipo;
	private String placaBase;
	private String procesador;
	private String [] listaTarjetas;
	private String texto;
		
	public Ordenador() {
		super();
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getPlacaBase() {
		return placaBase;
	}
	public void setPlacaBase(String placaBase) {
		this.placaBase = placaBase;
	}
	public String getProcesador() {
		return procesador;
	}
	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}
	public String [] getListaTarjetas() {
		return listaTarjetas;
	}
	public void setListaTarjetas(String [] listaTarjetas) {
		this.listaTarjetas = listaTarjetas;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	@Override
	public String toString() {
		return "Ordenador [tipo=" + tipo + ", placaBase=" + placaBase + ", procesador=" + procesador
				+ ", listaTarjetas=" + Arrays.toString(listaTarjetas) + ", texto=" + texto + "]";
	}
	
		
	
	
	
}
