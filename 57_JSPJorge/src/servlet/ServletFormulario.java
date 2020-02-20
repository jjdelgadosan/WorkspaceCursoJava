package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletFormulario
 */
@WebServlet("/ServletFormulario")
public class ServletFormulario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletFormulario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nombre = request.getParameter("nombre");
		String peso = request.getParameter("peso");
		
		int iPeso = Integer.parseInt(peso);
		
		System.out.println(nombre);
		System.out.println(iPeso);
		
		double libras = iPeso * 0.453592;
		System.out.println("Libras : " + libras);
		//con esta sentencia le decimos a java que siga con la ejecucion de esta
		// request en el JSP final.jsp
		//en cuanto salga de este metodo doGet, ira a ejecutar el final.jsp
		
		//response.sendRedirect("final.jsp"); Esto seria un error, porque se haria
		// una nueva peticion que perderia los parametros de entrada
		
		//tenemos que meter en la request los valores que queramos pasarle a nuestro jsp
		request.setAttribute("l", libras);
		//se pueden mardar mas atributos
		request.setAttribute("n", nombre);
		request.getRequestDispatcher("final.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
