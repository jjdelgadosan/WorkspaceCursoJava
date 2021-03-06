package main;

import java.util.ArrayList;

import bean.Casa;
import bean.Direccion;
import bean.Habitacion;
import bean.Persona;

public class MainCasa {

	public static void main(String[] args) {
		
		Persona p1 = new Persona();
		
		p1.setNombre("Jorge Delgado");
		p1.setEdad(46);
		p1.setPeso(80);
		
		Direccion d1 = new Direccion();
		d1.setTipoVia("Calle");
		d1.setNombreVia("Concejal Frco. Jose Jimenez");
		d1.setCiudad("Madrid");
		d1.setCp("28047");
		
		p1.setDireccion(d1);
		
		Habitacion h1 = new Habitacion();
		h1.setM2(24);
		h1.setTipoHabitacion("Matrimonio");
		
		Habitacion h2 = new Habitacion();
		h2.setM2(20);
		h2.setTipoHabitacion("Doble");

		Habitacion h3 = new Habitacion();
		h3.setM2(12);
		h3.setTipoHabitacion("Individual");
	
		Habitacion h4 = new Habitacion();
		h4.setM2(30);
		h4.setTipoHabitacion("Salon comedor");
		
		Habitacion h5 = new Habitacion();
		h5.setM2(10);
		h5.setTipoHabitacion("Cuarto de ba�o");
		
		Habitacion h6 = new Habitacion();
		h6.setM2(7);
		h6.setTipoHabitacion("Aseo");
		
		Direccion d2 = new Direccion();
		d2.setTipoVia("Avenida");
		d2.setNombreVia("Niza");
		d2.setCiudad("Madrid");
		d2.setCp("28022");
		
		Casa c1 = new Casa();
		c1.setPrecio(400000);
		c1.setDireccion(d2);
		c1.setPropietario(p1);
		
		ArrayList<Habitacion> listaHabitacion = new ArrayList<Habitacion>();
		
		listaHabitacion.add(h1);
		listaHabitacion.add(h2);
		listaHabitacion.add(h3);
		listaHabitacion.add(h4);
		listaHabitacion.add(h5);
		listaHabitacion.add(h6);
		
		c1.setListaHabitacion(listaHabitacion);
		
		
		System.out.println(c1);
		
		
		
	}

}
