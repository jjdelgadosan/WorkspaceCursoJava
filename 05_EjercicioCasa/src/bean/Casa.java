package bean;

import java.util.ArrayList;

public class Casa {
	
	private double precio;
	private ArrayList<Habitacion> listaHabitacion;
	private Direccion direccion;
	private Persona propietario;
	
	public Casa() {
		super();
	}

	public Casa(double precio, ArrayList<Habitacion> listaHabitacion, Direccion direccion) {
		super();
		this.precio = precio;
		this.listaHabitacion = listaHabitacion;
		this.direccion = direccion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public ArrayList<Habitacion> getListaHabitacion() {
		return listaHabitacion;
	}

	public void setListaHabitacion(ArrayList<Habitacion> listaHabitacion) {
		this.listaHabitacion = listaHabitacion;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}


	public Persona getPropietario() {
		return propietario;
	}

	public void setPropietario(Persona propietario) {
		this.propietario = propietario;
	}

	@Override
	public String toString() {
		return "Casa [precio=" + precio + ", listaHabitacion=" + listaHabitacion + ", direccion=" + direccion
				+ ", propietario=" + propietario + "]";
	}

	
}
