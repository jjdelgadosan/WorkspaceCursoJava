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
public class ControladorConsulta {
	
	@Autowired
	private Usuario usuario;
	
	@Autowired
	private GestorLogin gl;
	
	@RequestMapping(path = "procesarRegistro")
	public ModelAndView procesarRegistro(
			@RequestParam("nombre") String n,
			@RequestParam("password") String p,
			ModelAndView mav) {
		
		usuario.setNombre(n);
		usuario.setPassword(p);
		boolean validar = gl.validarDatosLogin();
		
		if(validar) {
			//para pasar datos por parametro hay que hacerlo de 
			//esta manera
			
			usuario.setNombre(n);
			Usuario usu = gl.recuperaUsuario(n);
			
			mav.getModelMap().addAttribute("nombre", usu.getNombre());
			mav.getModelMap().addAttribute("password", usu.getPassword());
			mav.getModelMap().addAttribute("edad", usu.getEdad());
			mav.getModelMap().addAttribute("peso", usu.getPeso());
			mav.setViewName("redirect:final2");
		}else {
			mav.addObject("error", "Faltan datos");
			mav.setViewName("redirect:login");
		}
	
		return mav;
	}

	@RequestMapping("final2")
	public String mostrarFinal() {
		return "final2";
	}
}
