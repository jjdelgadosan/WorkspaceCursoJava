package Main;

import java.util.ArrayList;
import java.util.Scanner;

import Bean.Director;
import Bean.Pelicula;


public class mainPeliculas {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		ArrayList<Pelicula> listaPeliculas = new ArrayList<Pelicula>();
//		ArrayList<Director> listaDirector = new ArrayList<Director>();
		
		int opcion = -1;

		do {
			
			opcion = muestraMenu();
						
			switch (opcion) {
			case 1:
				altaPelicula(listaPeliculas);
				break;

			case 2:
				listaPelicula(listaPeliculas);
				break;

			case 3:
				Pelicula p = buscaPelicula(listaPeliculas);
				if(p == null) {
					System.out.println("No se ha encontrado la pelicula");
					System.out.println("");
				}else {
					System.out.println(p);
				}
				break;
				
			default:
				break;
			}
			
					
			
// El while es hasta que opcion sea distinto de 0. (continua en el bucle mientras opcion sea distinto de 0)
		} while (opcion != 0);

		System.out.println("Ha salido de la aplicación");

	}

	private static Pelicula buscaPelicula(ArrayList<Pelicula> listaPeliculas) {
		System.out.println("introduzca el titulo a buscar: ");
		System.out.println("------------------------------\n");
		String titulo = sc.next();
// Con este formato de for se recorre el array entero, y por cada registro recuperamos con el get el titulo de la 
// pelicula guradada y lo comparamos con el titulo incluido por pantalla
		for(Pelicula pelicula : listaPeliculas) {
			if(pelicula.getTitulo().equals(titulo)) {
				return pelicula;
			}
		}
		return null;			
	}

	private static void listaPelicula(ArrayList<Pelicula> listaPeliculas) {
		
		System.out.println("Estos son las peliculas guardadas");
		System.out.println("---------------------------------");
// para sacar una linea por cada pelicula		
		for (Pelicula peliculas: listaPeliculas) {
			System.out.println(peliculas);
		}
// muestra todos las peliculas en orizontal			
		System.out.println(listaPeliculas);
		
	}
		
	
	private static void altaPelicula(ArrayList<Pelicula> listaPeliculas) {
		//Pedimos los datos y los guardamos en las variables para poder tratarlos depues 
				System.out.println("Por favor, introduzca el titulo");
				System.out.println("-------------------------------\n");
		// sc.next() ==> si se pone sc.nextline salta a la siguiente linea.
				String titulo = sc.next();

				System.out.println("Por favor, introduzca el genero");
				System.out.println("-------------------------------\n");
				String genero = sc.next();

				System.out.println("Por favor, introduzca el director");
				System.out.println("---------------------------------\n");
				String nombreDirector = sc.next();
				
				System.out.println("Por favor, introduzca la edad del director");
				System.out.println("------------------------------------------\n");
				String edad = sc.next();
				
				System.out.println("Por favor, introduzca el año de estreno");
				System.out.println("---------------------------------------\n");
// Recogemos el valor anioEstreno que viene como string y que nosotros tenemos guardado como int y 
// con "Integer.valueOf(sc.next());" lo pasamos a int. 
				//int anioEstreno = Integer.parseInt(sc.next());
				int anioEstreno = sc.nextInt();
				
// Generamos la estructura Peliculas y la cargamos con las variables introducidas por pantalla
				Pelicula peliculas = new Pelicula();
				peliculas.setTitulo(titulo);
				peliculas.setGenero(genero);
				peliculas.setAnioEstreno(anioEstreno);
								
// Generamos la estructura Director y la cargamos con las variables introducidas por pantalla
				Director director = new Director();
				director.setNombre(nombreDirector);
				director.setEdad(edad);

				peliculas.setDirector(director);
				
// Con estas sentencia metemos los datos recogidos en los objetos Peliculas y Director en los arraylist
				listaPeliculas.add(peliculas);
				
		
	}

	private static int muestraMenu() {
		
		System.out.println("Por favor, indique una opcion");
		System.out.println("-----------------------------");
		System.out.println("");
		System.out.println("       1.- Alta pelicula.");
		System.out.println("       2.- Listar peliculas.");
		System.out.println("       3.- Buscar pelicula por titulo ");
		System.out.println("");
		System.out.println("       0.- Salir del programa.");
		System.out.println("");
		
		int opcion = sc.nextInt();
		
		if (opcion < 0 || opcion > 3) {
			System.out.println("Introduzca valores validos 0, 1, 2, o 3");
		}
		
		return opcion;
	}

		
		
		

	}


