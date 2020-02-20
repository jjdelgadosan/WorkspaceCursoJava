package modelo.negocio;

import modelo.entidad.Ordenador;

public class GestorTienda {
	
	public boolean validar(Ordenador o) {
		if(o.getTipo().isEmpty() || o.getPlacaBase().isEmpty() ||
			o.getProcesador().isEmpty()) // || o.getListaTarjetas()==null)	
		{
			return false;
		}else {
			return true;
		}
	}
}
