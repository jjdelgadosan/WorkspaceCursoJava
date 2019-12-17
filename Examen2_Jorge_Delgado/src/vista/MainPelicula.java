package vista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import modelo.entidad.Pelicula;
import negocio.GestorPeliculas;


public class MainPelicula {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String opcion = "0";
	
		GestorPeliculas gp = new GestorPeliculas();
		
		//gp.setListaPeliculas(listaPeliculas); Esto habia 
		//listaPeliculas=gp.listar(); Esto pensamos que va bien... y lo quitamos para ver mas adelante
		
		do {
			System.out.println("1- Alta de pelicula");
			System.out.println("2- Baja de pelicula");
			System.out.println("3- modificar una pelicula");
			System.out.println("4- Buscar pelicula por id");
			System.out.println("5- Listar peliculas");
			opcion = sc.nextLine();
			if(opcion.equals("1")) {
				System.out.println("Introduzca el titulo:");
				//nextLine coje toda la frase, next coje palabra
				String titulo = sc.nextLine();
				System.out.println("Introduzca el director:");
				String nombreDirector = sc.nextLine();
				System.out.println("Introduzca el genero:");
				String genero = sc.nextLine();
				System.out.println("Introduzca el año de estreno:");
				String anioEstreno = sc.nextLine();
				
				int iAnioEstreno = Integer.parseInt(anioEstreno);
				
				
				
				Pelicula p = new Pelicula();
				p.setTitulo(titulo);
				p.setGenero(genero);
				p.setAnio(iAnioEstreno);
				p.setDirector(nombreDirector);
				
			
				boolean alta = gp.alta(p);
				if(alta) {
					System.out.println("Pelicula introducida correctamente");
				}else {
					System.out.println("La pelicula no se ha dado de alta");
				}
			}else if(opcion.equals("2")) {
				System.out.println("Introduzca el id de la pelicula a borrar");
				int id = sc.nextInt();
				Pelicula p = new Pelicula();
				p.setId(id);
				boolean borrado = gp.borrar(p);
				if(borrado == true) {
					System.out.println("La pelicula se ha borrado");
				}else {
					System.out.println("La pelicula no se ha borrado");
				}
				}else if(opcion.equals("3")) {
				int id = sc.nextInt();
				Pelicula p = new Pelicula();
				p.setId(id);
				boolean modificar = gp.borrar(p);
				if(modificar == true) {
					System.out.println("La pelicula se ha modificado");
				}else {
					System.out.println("La pelicula no se ha modificado");
				}
				
			}else if(opcion.equals("4")) {
				System.out.println("Introduzca el id de la pelicula a buscar");
				int id = sc.nextInt();
				Pelicula p = new Pelicula();
				p.setId(id);
				Pelicula peliculaRecu  = gp.obtener(p);
								
				if(peliculaRecu != null) {
					System.out.println("La peliculas por genero es: " + peliculaRecu);
					}else {
					System.out.println("No hay conincidencias por id");
				}
			}
			else if(opcion.equals("5")) {
				System.out.println("La lista de peliculas alamacenadas es : ");

				List<Pelicula> peliculas = gp.listar();
				for(Pelicula p : peliculas) {
					System.out.println(p);
				}
			}
		}while(!opcion.equals("0"));
		System.out.println("Fin del programa");
	}
	
	
	
}



