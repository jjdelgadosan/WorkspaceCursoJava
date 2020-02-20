package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PrimerServlets
 * Un sevlets es un objeto singleton gestionado por el contexto de Tomcat
 * 
 * Tenemos qeu  extender la clase de HttpServlets
 * 
 * 
 * Por otro lado tenemos que decirle a Tomcat que de de alta este objeto. Concepto de IoC 
 * (inversion de control). Nosotros no creamos este objeto, es decir, no hacemos new de 
 * PrimerServlets, si no que tomcatllevara el ciclo de vida por nosotros.
 * 
 * Dos maneras de crear un objeto en el contexto tomcat, por XML (web.xml) o por anotaciones
 * 
 * Como hemos elegido crear el proyecto con el descriptor web.xml 2.5 solo podemos darlo 
 * de alta por xml  
 */
public class PrimerServlets extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PrimerServlets() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
