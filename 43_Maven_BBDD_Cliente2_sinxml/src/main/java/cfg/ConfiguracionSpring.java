package cfg;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;

import modelo.entidad.Cliente;
import modelo.negocio.GestorCliente;
import modelo.persistencia.DaoCliente;

//Esta clase ahora llevará la configuracion de Spring en 
//vez del xml
//Tambien podemos mezclar esto con anotaciones
//Mediante la antoacion
//@ComponentScan podemos decir que vaya a buscar 
//anotaciones alla donde queramos

public class ConfiguracionSpring {

	//los beans los vamos a dar de alta mediante metodos
	//anotados con la anotacion @Bean
	//el id con que se va a dar de alta sera el nombre
	//del metodo y la class sera del tipo que devuelvas
	@Bean
	//podemos seguir usando el scope para el alcance
	@Scope("prototype")
	public Cliente cliente() {
		Cliente cl = new Cliente();
		return cl;
	}
	
	@Bean
	//podemos seguir usando el scope para el alcance
	@Scope("singleton")
	public GestorCliente gestorCliente(DaoCliente daoCliente) {
		GestorCliente gl = new GestorCliente();
		gl.setCliente(daoCliente);
		return gl;
	}
	
	@Bean
	@Scope("singleton")
	public DaoCliente daoCliente() {
		DaoCliente dao = new DaoCliente();
		return dao;
	}
	
}