package servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.entidad.Ordenador;
import modelo.negocio.GestorTienda;

@WebServlet("/ServletTienda")
public class ServletTienda extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Entrando por doGet");
		String tipo = request.getParameter("tipo");
		String placaBase = request.getParameter("placaBase");
		String procesador = request.getParameter("procesador");
		String texto = request.getParameter("texto"); 
		String [] listaTarjetas = request.getParameterValues("tarjeta");
		
		Ordenador ordenador = new Ordenador();
		ordenador.setTipo(tipo);
		ordenador.setPlacaBase(placaBase);
		ordenador.setProcesador(procesador);
//		ordenador.setListaTarjetas.(listaTarjetas);
		ordenador.setTexto(texto);
		
		
		System.out.println(ordenador);
		
		GestorTienda gt = new GestorTienda();
		boolean validada = gt.validar(ordenador);
		if(validada) {
			//ojo, aqui estamos haciendo un 300 (codigo http 
			//de respuesta) al navegador
			System.out.println("va por principal");
			response.sendRedirect("principal.html");
		}else {
			System.out.println("va por index");
			response.sendRedirect("http://localhost:8080/56_FormulariosRedirectOrdenadores/index.html");
		}	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Entrando por doPost");
		doGet(request, response);
	}

}
