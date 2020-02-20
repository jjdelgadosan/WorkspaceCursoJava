package servlets;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.entidad.Usuario;

@WebServlet("/ServletLogin")
public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	 //metodo encargado de la gesti�n del m�todo POST
	    protected void processRequestPOST(HttpServletRequest request, HttpServletResponse response)
	           throws ServletException, IOException {
	        
	        String usu, pass;
	        usu = request.getParameter("user");
	        pass = request.getParameter("password");
	        //validamos de forma sencilla
	        if(usu.equals("admin") && pass.equals("admin")){
	            //si coincide usuario y password 
	            //redirijo a p�gina con informaci�n de login exitoso
				request.setAttribute("usuario", usu);
				request.getRequestDispatcher("siguiente.jsp").forward(request, response);
	            
	            
	        }else{
	            //l�gica para login inv�lido
	        	response.sendRedirect("login.jsp?error=No ha rellenado adecuadametne el formulario");
	        }
		
	}

}
