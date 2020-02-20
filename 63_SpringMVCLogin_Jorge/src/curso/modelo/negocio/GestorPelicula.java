package curso.modelo.negocio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import curso.modelo.entidad.Pelicula;
import curso.modelo.persistencia.DaoPelicula;

@Service
public class GestorPelicula {
	
	@Autowired
	private DaoPelicula dp;
	
	@Autowired
	private Pelicula pelicula;
	
	public void alta() {
		Pelicula p = new Pelicula();
		p.setNombre(pelicula.getNombre());
		p.setDirector(pelicula.getDirector());
		p.setAnio(pelicula.getAnio());
		p.setRecaudacion(pelicula.getRecaudacion());
		p.setValoracion(pelicula.getValoracion());
		
		dp.save(p);
	}

	public List<Pelicula> listar(){
		return dp.findAll();
	}
	
	public Pelicula consulta(int id) {
		return dp.findById(id);
	}
	
}
