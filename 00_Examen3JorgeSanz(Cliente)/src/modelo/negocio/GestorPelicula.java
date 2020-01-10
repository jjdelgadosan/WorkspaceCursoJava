package modelo.negocio;

import java.util.List;

import cliente.ClientePelicula;


import modelo.entidad.Pelicula;

public class GestorPelicula {
	
	private ClientePelicula clientePelicula;

	
	public ClientePelicula getClientePelicula() {
		return clientePelicula;
	}


	/**
	 * @param clientePelicula the clientePelicula to set
	 */
	public void setClientePelicula(ClientePelicula clientePelicula) {
		this.clientePelicula = clientePelicula;
	}

	
	//---------------- metodos propios

	public String alta (Pelicula pelicula) {
		
		clientePelicula.setStringPelicula("alta-"+pelicula.getTitulo()+"-"+pelicula.getDirector());
		return clientePelicula.executeCliente();
		
	}
	
		
	


	public String borrar(int id) {
		clientePelicula.setStringPelicula("baja-"+id);
		return clientePelicula.executeCliente();
	}
	
	public Pelicula obtener(int id) {
		clientePelicula.setStringPelicula("busqueda-"+id);
		String peliculaRecibida = clientePelicula.executeCliente();

		
		String[] datosPelicula = peliculaRecibida.split("-");
		Pelicula pelicula = new Pelicula();
		
			if (datosPelicula != null && datosPelicula.length == 3) {
			pelicula.setId(Integer.parseInt(datosPelicula[0]));
			pelicula.setTitulo(datosPelicula[1]);
			pelicula.setDirector(datosPelicula[2]);
			return pelicula;
		}
		
		return null;
		
	}
	

	
}
