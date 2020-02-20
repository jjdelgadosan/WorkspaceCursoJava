package login.modelo.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import login.modelo.entidad.Usuario;
import login.modelo.negocio.GestorLogin;



@Controller
public class ControladorRegistro {
	
	@Autowired
	private Usuario usuario;
	
	@Autowired
	private GestorLogin gl;
	
	@RequestMapping("login")
	public String mostrarLogin() {
		return "login";
	}
	
	@RequestMapping(path = "mostrarRegistro")
	public String irAFormulario() {
		return "registro";
	}
	
	//con required le decimos que no es obligatorio
	//este parametro para que funcione
	@RequestMapping(path = "doRegistro")
	public ModelAndView procesarRegistro(
			@RequestParam("nombre") String n,
			@RequestParam("password") String p,
			@RequestParam(name = "edad", required = false) String e,
			@RequestParam(name = "peso", required = false) String k,
			ModelAndView mav) {
		
		//Classic way
		//Ordenador or = new Ordenador();
		//Pedido pe = new Pedido();
		//pe.setOrdenador(or);
		usuario.setNombre(n);
		usuario.setPassword(p);
		usuario.setEdad(e);
		usuario.setPeso(k);
				
		//Classic way
		//boolean validado = gp.validar(pedido);
		
		//Spring way
		boolean validado = gl.validar();
		
		if(validado) {
			//para pasar datos por parametro hay que hacerlo de 
			//esta manera
			boolean validaAlta = gl.alta();
			
			mav.getModelMap().addAttribute("nombre", usuario.getNombre());
			mav.getModelMap().addAttribute("password", usuario.getPassword());
			mav.getModelMap().addAttribute("edad", usuario.getEdad());
			mav.getModelMap().addAttribute("peso", usuario.getPeso());
			mav.setViewName("redirect:final");
		}else {
			mav.addObject("error", "Faltan datos");
			mav.setViewName("redirect:mostrarRegistro");
		}
		return mav;
	}

	@RequestMapping("final")
	public String mostrarFinalReg() {
		return "final";
	}
	
	
}
