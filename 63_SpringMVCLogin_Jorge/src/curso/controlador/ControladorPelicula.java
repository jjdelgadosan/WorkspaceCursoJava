package curso.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import curso.modelo.entidad.Pelicula;
import curso.modelo.negocio.GestorPelicula;


@Controller
public class ControladorPelicula {

	@Autowired
	private Pelicula pelicula;
	
	@Autowired
	private GestorPelicula gp;

	@RequestMapping("altaPelicula")
	public String altaPelicula() {
		return "altaPelicula";
	}
	
	@RequestMapping("listaPelicula")
	public ModelAndView recuperoPeliculas (ModelAndView mav) {
		List<Pelicula> listaPeliculas =gp.listar();
		
		mav.addObject("listaPeliculas", listaPeliculas);
		mav.setViewName("mostrarPeliculas");
		System.out.println("listado de peliculas: ");
		System.out.println(listaPeliculas);
		return mav;
	}
	

	@RequestMapping("detalle")
	public ModelAndView detalle
			(@RequestParam() int id
			,ModelAndView mav) {
	
			Pelicula pelicula = gp.consulta(id);
			
			System.out.println("detalle pelicula: ");
			System.out.println(pelicula);
				
			mav.getModelMap().addAttribute("nombre", pelicula.getNombre());
			mav.getModelMap().addAttribute("director", pelicula.getDirector());
			mav.getModelMap().addAttribute("anio", pelicula.getAnio());
			mav.getModelMap().addAttribute("recaudacion", pelicula.getRecaudacion());
			mav.getModelMap().addAttribute("valoracion", pelicula.getValoracion());
			mav.setViewName("redirect:mostrarDetalleFinal");
					
			return mav;
		
	}
	
	
	@RequestMapping("mostrarDetalleFinal")
	public String mostrarDetalleFinal() {
		return "detallePelicula";
	}
	
	
	
	@RequestMapping("doAltaPelicula")
	public ModelAndView hacerAltaPelicula
			(@RequestParam() String nombre
			,@RequestParam() String director 
			,@RequestParam() int anio
			,@RequestParam() double recaudacion
			,@RequestParam() String valoracion
			,ModelAndView mav) {
		
		pelicula.setNombre(nombre);
		pelicula.setDirector(director);
		pelicula.setAnio(anio);
		pelicula.setRecaudacion(recaudacion);
		pelicula.setValoracion(valoracion);
		
		gp.alta();
		
		mav.setViewName("redirect:inicioPeli");
		//Al hacer un sendRedirect perdemos el objeto
		//request donde metemos los atributos
		//por lo tanto no podemos utilizar addObject
		//tenemos que pasar por parametro
		//y lo podemos hacer de estas maneras
		mav.getModelMap().addAttribute("mensaje","La pelicula se ha dado de alta correctamente");
		//opcion 2
		//mav.setViewName("redirect:pepe?mensaje=La pelicula se ha dado de alta correctamente");
		return mav;
	}
	
	@RequestMapping("inicioPeli")
	public String mostrarInicioPeli() {
		return "index";
	}
}
