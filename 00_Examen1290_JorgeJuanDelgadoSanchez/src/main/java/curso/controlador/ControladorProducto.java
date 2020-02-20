package curso.controlador;

import java.util.List;

import org.hibernate.query.criteria.internal.predicate.IsEmptyPredicate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import curso.modelo.entidad.Producto;
import curso.modelo.negocio.GestorProducto;

@Controller
public class ControladorProducto {

	@Autowired
	private GestorProducto gp;
	
	@RequestMapping("producto")
	public ModelAndView inicio(ModelAndView mav) {
		List<Producto> lista = gp.getLista();
		
		mav.addObject("lista", lista);
		mav.setViewName("producto");
		return mav;
	}
	
	@RequestMapping("alta")
	public ModelAndView alta(
			@RequestParam() String nombre,
			@RequestParam() Double precio,
			@RequestParam() String categoria,
			ModelAndView mav) {
		
		mav.setViewName("redirect:producto");
	
		boolean hayError = false;
		if(nombre == null || nombre.isEmpty() ) {
			mav.getModelMap().addAttribute("errorNombre", "Falta el nombre");
			hayError = true;
		}
		
		if(precio == null) {
			mav.getModelMap().addAttribute("errorPrecio", "Falta el precio");
			hayError = true;
		}
		
		if(categoria == null || categoria.isEmpty()) {
			mav.getModelMap().addAttribute("errorCategoria", "Falta la categoria");
			hayError = true;
		}
		
		if(hayError) {
			return mav;
		}
		
		
		Producto p = new Producto();
		p.setNombre(nombre);
		p.setPrecio(precio);
		p.setCategoria(categoria);
		
		gp.alta(p);
		return mav;
	}
}
