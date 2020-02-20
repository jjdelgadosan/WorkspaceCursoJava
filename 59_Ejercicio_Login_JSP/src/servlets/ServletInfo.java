package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.entidad.Usuario;

@WebServlet("/ServletInfo")
public class ServletInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	 //metodo encargado de la gestión del método POST
	    protected void processRequestPOST(HttpServletRequest request, HttpServletResponse response)
	           throws ServletException, IOException {
	        
	    	String usu = request.getParameter("user");
	        Usuario usuario = new Usuario();
	        
	        if(usu.equals("admin")){
	        	request.setAttribute("usuario", usuario);
	            request.getRequestDispatcher("datos.jsp").forward(request, response);
	                        
	        }else{
	            //lógica para login inválido
	        	 request.getRequestDispatcher("login.jsp").forward(request, response);
                 
	        }
		
	}

}
