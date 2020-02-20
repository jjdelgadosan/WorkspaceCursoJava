package curso.modelo.controlador;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControladorCalculadora {

	@RequestMapping("CalularYGuardar")
	public ModelAndView hora(ModelAndView mav) {
		Date date  = new Date();//me da la fecha del sistema
		mav.addObject("fecha", date);
		mav.setViewName("mostrarHora");
		return mav;
	}
	
}
