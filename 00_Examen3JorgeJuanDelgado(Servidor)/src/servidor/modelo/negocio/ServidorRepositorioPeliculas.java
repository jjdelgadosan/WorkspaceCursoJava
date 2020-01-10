package servidor.modelo.negocio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

import modelo.entidad.Pelicula;
import servidor.modelo.persistencia.DaoPelicula;
import utils.Constantes;


public class ServidorRepositorioPeliculas {
	
	/**
	 *  Dar de alta los datos de una pelicula en un servidor. El cliente env�a los datos de la pelicula al servidor.
	 *  El servidor almacena esos datos, muestra en consola TODOS las peliculas de alta y devuelve indicaci�n 
	 *  al cliente de si se ha podido o no dar de alta.
	 */

	
	public static void main(String[] args) {
		
		ServidorRepositorioPeliculas servidorRepositorioPeliculas = new ServidorRepositorioPeliculas();
		
		ServerSocket ss = null;
		try {
			ss = new ServerSocket(2019);
			System.out.println("Server escuchando por el puerto 2019");
		} catch (IOException e1) {
			e1.printStackTrace();
			return;
		}
		
		GestorRepositorioPeliculas gp = new GestorRepositorioPeliculas();
		DaoPelicula daoPelicula = new DaoPelicula();
		gp.setDaoPelicula(daoPelicula);

		boolean serverLoop = true;
		
		while (serverLoop) {
			System.out.println("Escuchando peticiones...");
									
			try (Socket socket = ss.accept();) {

				System.out.println(socket.getInetAddress().getHostAddress());
				
				InputStreamReader isr = new InputStreamReader(socket.getInputStream());

				BufferedReader bf = new BufferedReader(isr);
				String cadena = bf.readLine();
				System.out.println("Ha llegado informaci�n : " + "\"" + cadena + "\"" + " al servidor");
				
				PrintStream ps = new PrintStream(socket.getOutputStream());
				String resultado = "";
		
				String[] datosPelicula = cadena.split("-");
				
				int erroresUnpack = gp.unpackInfo(datosPelicula);
				
				System.out.println(erroresUnpack);
				switch (erroresUnpack) {
				
				case (Constantes.ERROR_TITULO_IS_NULL):
					resultado = "El t�tulo no puede ser nulo o estar vac�o";
					break;
				case (Constantes.ERROR_DIRECTOR_IS_NULL):
					resultado = "El director no puede ser nulo o estar vac�o";					
					break;
				case (Constantes.ERROR_ID_IS_NULL):
					resultado = "La identidad no puede ser nulo o estar vac�o";
					break;
				case (Constantes.ERROR_UNKNOWN_OPERATION):
					resultado = "No se reconoce la operaci�n";
					break;
				case (Constantes.ERROR_WRONG_MISSING_PARAMETERS):
					resultado = "No se ha recibido ning�n par�metro";					
					break;
				case (Constantes.ERROR_INSUFICIENT_PARAMETERS):
					resultado = "Hacen falta m�s par�metros";					
					break;
				default:
					resultado = "Error sin catalogar";				
				}
				
				if (erroresUnpack == Constantes.SUCCESSFULL_EXECUTION)
				{
					switch (datosPelicula[0]) {
					
					case "ALTA":
						
						System.out.println("Se ha pedido el alta de la pel�cula ");
						System.out.println("con t�tulo : " + datosPelicula[0] + " y director : ");
						
						Pelicula pelicula = new Pelicula();
						pelicula.setTitulo(datosPelicula[1]);
						pelicula.setDirector(datosPelicula[2]);

						
						int erroresAlta = gp.alta(pelicula);	
						
						switch (erroresAlta) {
						
						case (Constantes.ERROR_TITULO_IS_NULL):
							resultado = "El t�tulo no puede ser nulo o estar vac�o";
							break;
						case (Constantes.ERROR_DIRECTOR_IS_NULL):
							resultado = "El director no puede ser nulo o estar vac�o";					
							break;
						case (Constantes.ERROR_PELICULA_IS_NOT_FOUND):
							resultado = "La pel�cula buscada no existe en el cat�logo";
							break;
						case (Constantes.ERROR_IN_DDBB):
							resultado = "Se ha producido un error en la base de datos";
							break;
						case (Constantes.SUCCESSFULL_EXECUTION):
							resultado = "Alta realizada con �xito";					
							break;
						default:
							resultado = "Error sin catalogar";						
						}
						
						ps.println(resultado);
						
						break;
						
					case "BAJA":
						
						System.out.println("Se ha pedido la baja de la pel�cula ");
						System.out.println("con identidad : " + datosPelicula[1]);
						
						int iIdBaja = 0;
						try {
							iIdBaja = Integer.parseInt(datosPelicula[1]);
							boolean bajaPelicula = gp.baja(iIdBaja);
							if (bajaPelicula) resultado = "Baja realizada con �xito";							
							else resultado = "Se ha producido un error en la base de datos";;
							
						} catch (NumberFormatException ex) {
							resultado = "La identidad no es n�merica";
						} finally {
							ps.println(resultado);
						}						
						break;
						
					case "BUSQUEDA":
						
						System.out.println("Se ha pedido la b�squeda de la pel�cula ");
						System.out.println("con identidad : " + datosPelicula[1]);
						
						resultado = "No se ha encontrado la pelicula";
						
						int iIdBuscar = 0;
						try {
							iIdBuscar = Integer.parseInt(datosPelicula[1]);
							Pelicula buscaPelicula = gp.buscar(iIdBuscar);
							if (buscaPelicula == null) resultado = "Se ha producido un error en la base de datos";
							else {
								resultado = buscaPelicula.getId() + "-" + buscaPelicula.getTitulo() + "-" + buscaPelicula.getDirector();
								System.out.println(resultado);
							}
							
						} catch (NumberFormatException ex) {
							resultado = "La identidad no es n�merica";
						} finally {
							System.out.println("resultado " + resultado);
							ps.println(resultado);
						}	
						
						break;
					default:
						resultado = "Error operaci�n catalogar";
					}					

				} else {
					ps.println(resultado);
				}

				
			} catch (IOException e) {
				e.printStackTrace();
			} catch (NumberFormatException nfe) {
				System.out.println("No es un numero lo que has mandado");
			} 
		}
		System.out.println("Fin del servidor");
	}


		



}
