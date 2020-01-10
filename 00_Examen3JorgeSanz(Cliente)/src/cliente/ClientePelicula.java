package cliente;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import modelo.entidad.Pelicula;

public class ClientePelicula {
	
		private String stringPelicula;
	
		
	    /**
		 * @return the stringPelicula
		 */
		public String getStringPelicula() {
			return stringPelicula;
		}

		/**
		 * @param stringPelicula the stringPelicula to set
		 */
		public void setStringPelicula(String stringPelicula) {
			this.stringPelicula = stringPelicula;
		}

		
//metodo constructor que abre el socket , manda la informaón y está a la escucha para recoger del servidor

		public String executeCliente() {
			
			String resultado = "ERROR en cliente";
		
			try(Socket socket = new Socket("192.168.1.74",2019);
					PrintStream ps = 
							new PrintStream(socket.getOutputStream())) {
				//creamos el tubo
				
				//creamos un objeto que me permite escribir
				//sobre el output stream del socket
				
				ps.println(stringPelicula);
			
				
				//ahora en el cliente tendremos que leer la inforamcion
				//del servidor
				
				InputStreamReader isr = 
						new InputStreamReader(socket.getInputStream());
				//-------------------------------------------------------------------
				//para leer por frases, podemos usar la siguiente clase
				BufferedReader bf = new BufferedReader(isr);
				//en este linea nos quedaremos parados hasta que 
				//el servidor nos responda
				
				resultado = (bf.readLine());
				
				//System.out.println("cliente: " + bf.readLine());
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				return resultado;
			}
		
	}


}
