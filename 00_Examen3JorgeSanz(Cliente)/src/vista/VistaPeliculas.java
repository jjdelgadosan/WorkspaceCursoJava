package vista;

import java.util.List;
import java.util.Scanner;

import cliente.ClientePelicula;
import modelo.entidad.Pelicula;
import modelo.negocio.GestorPelicula;

public class VistaPeliculas {
	private Scanner sc;
	private GestorPelicula gp;
	private ClientePelicula cp;
	
	
	/**
	 * @return the sc
	 */
	public Scanner getSc() {
		return sc;
	}


	/**
	 * @param sc the sc to set
	 */
	public void setSc(Scanner sc) {
		this.sc = sc;
	}



	/**
	 * @return the gp
	 */
	public GestorPelicula getGp() {
		return gp;
	}


	/**
	 * @param gp the gp to set
	 */
	public void setGp(GestorPelicula gp) {
		this.gp = gp;
	}



	/**
	 * @return the cp
	 */
	public ClientePelicula getCp() {
		return cp;
	}


	/**
	 * @param cp the cp to set
	 */
	public void setCp(ClientePelicula cp) {
		this.cp = cp;
	}


	public void mostrarApp (GestorPelicula gestorPelicula, Scanner scanner, ClientePelicula clientePelicula) {
		this.gp = gestorPelicula;
		this.sc = scanner;
		this.cp = clientePelicula;
		
		String opcion = "0";
		do {
			System.out.println("1- Alta de pelicula");
			System.out.println("2- Buscar pelicula por id");
			System.out.println("3- Borrar pelicula");
			System.out.println("0- Salir");
			opcion = sc.nextLine();
			
			if(opcion.equals("1")) {
				System.out.println("Introduzca la pelicula a dar de alta");
				
				System.out.println("Introduzca el titulo:");
				String titulo = sc.nextLine();
				System.out.println("Introduzca el director:");
				String director = sc.nextLine();
				
				
				
				
				Pelicula pelicula = new Pelicula();
				pelicula.setTitulo(titulo);
				pelicula.setDirector(director);
				
				
				//basandonos en la explicacion de la documentacion
				//del metodo alta, podemos darle información a nuestro
				//usuario
				String alta = gp.alta(pelicula);
				System.out.println(alta);
				
			}else if(opcion.equals("3")) {
				System.out.println("Introduzca el id a borrar:");
				String id = sc.nextLine();
				
				int iId = Integer.parseInt(id);
				
				String borrar = gp.borrar(iId);
				System.out.println();
				
			}else if(opcion.equals("2")) {
				System.out.println("Introduzca el id a buscar:");
				String id = sc.nextLine();
				
				int iId = Integer.parseInt(id);
				
				Pelicula p = gp.obtener(iId);
				if(p != null) {
					System.out.println(p);
				}else {
					System.out.println("No se ha encontrado la pelicula");
				}
			}
		}while(!opcion.equals("0"));
		System.out.println("Fin del programa");
		sc.close();
	}
}
