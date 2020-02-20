package curso.controlador;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

//por este controla
@Controller
public class ControladorCalculadora {

	//Recoger parametros se hace de manera sencilla
		@RequestMapping("calculadora")
		public ModelAndView saludoAtributos(ModelAndView mav, 
			@RequestParam("numero") int numero) {
			System.out.println("El numero es : " + numero);
			mav.setViewName("calculadora");
			return mav;
		}

}
