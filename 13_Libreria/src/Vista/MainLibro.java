package Vista;

import java.util.ArrayList;
import java.util.Scanner;

import Modelo.negocio.GestorLibros;
import Modelo_entidad.Libreria;
import Modelo_entidad.Libro;


public class MainLibro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);// llamada a la clase escaner. Introducida una vez , para todo el proceso.
		String opcion = "0";// inicializamos la variable del menu
		
		
		//el gestor libros necesita de un array para funcionar lo creamos 
		ArrayList<Libro> listaLibro = new ArrayList<Libro>();

		System.out.println("Por favor, dame el nombre de la librería");
		System.out.println("");
		
		String nombreLibreria = sc.nextLine();
		// ver version de Felix 
		Libreria lib = new Libreria();// creamos un objeto libreria
		lib.setNombreLibreria(nombreLibreria);//atributo referenciado a donde apunta nombreLibreria ( ya no apunta a Null)
		lib.setListaLibro(listaLibro);// lo mismo con  listaLibro
		 
		//Creamos el objeto gestor de libros   "gl", que es el que va a llevar la logica de la aplicacion
		GestorLibros gl = new GestorLibros();
		gl.setLibreria(lib);// referenciamos los atributos de gl a los atributos de lib. anteriores
		
		// apartir de aqui llenaremos los ojjetos a los que apuntan las referencias
		
		do {
			System.out.println("Por favor, introduzca una opcion");
			System.out.println("");
			System.out.println("1- Alta de libros");
			System.out.println("2- Lista de libros");
			System.out.println("3- Buscar libros por ISBN");
			System.out.println("4- Buscar libros por editorial");
			System.out.println("");
			System.out.println("0 - Salir de la aplicacion");
			opcion = sc.nextLine();
			if(opcion.equals("1")) {
				System.out.println("Introduzca el ISBN:");
				//nextLine coje toda la frase, next coje palabra
				String isbnLibro = sc.nextLine();
				System.out.println("Introduzca el titulo:");
				String tituloLibro = sc.nextLine();
				System.out.println("Introduzca la editorial:");
				String nombreEditorial = sc.nextLine();
				System.out.println("Introduzca el año de publicacion:");
				String anioPubliLibro = sc.nextLine();
				
				//me cambia la edad de string a un entero con un WRAPP 8 usa el metodo parse+Tipo ( parseInt )
				int iAnioEPubliLibro = Integer.parseInt(anioPubliLibro);
				// creamos el objeto libro y tiran de él las referencias anteriores que ya le estaban apuntando.
				Libro l = new Libro();
				l.setIsbn(isbnLibro);
				l.setTitulo(tituloLibro);
				l.setEditorial(nombreEditorial);
				l.setAnioPublicacion(iAnioEPubliLibro);// aqui ya es un entero lo que va al campo
				
				//basandonos en la explicacion de la documentacion
				//del metodo alta, podemos darle información a nuestro
				//usuario
				boolean alta = gl.alta(l);//llamamos al metodo (de la clase gestor)  paraq alta ,  pasandole un libro . devuelve Booleanop y lo guardamos en "alta"
				// evaluamos con el booleano si el alta escorrecta o no y actuamos en consecuencia
				if(alta) {
					System.out.println("libro introducido correctamente \n");
				}else {
					System.out.println("Alta erronea, el libro no introducido ");
					System.out.println("El isbn y el nombre del libro tienen que estar informados \n");
								}
				}else if(opcion.equals("2")) {// para listar creo un array llamado libro apunta a al array dd libros que tiene el objeto gl referenciado.
					ArrayList<Libro> libro = gl.getListaLibros();
					if(libro.size() != 0) {// si el arraly al que apunta lista no es vacio, lista elemento a elemento.
						System.out.println("La lista de libros es : \n");
						for(Libro l : libro) {// recorre TODO array "libro" y lo muestra elemnto a elemento (for)
							System.out.println(l);
						}
					}else {
						System.out.println("No hay libros almacenados \n");
					}
				}else if(opcion.equals("3")) {
				System.out.println("Introduzca el ISBN a buscar : \n");
				String buscarIsbn = sc.nextLine();
				Libro l = gl.buscarPorIsbn(buscarIsbn);//llamada que pasa el parametro "buscarIsb"n al metodo "buscarPorIsbn" del objeto gl.  lo almacena en un objeto "l" de tipo Libro
				if(l == null) {
					System.out.println("El ISBN no se ha encontrado : \n");
				}else {
					System.out.println(l);// imprime el libro devuelto
				}
			}else if(opcion.equals("4")) {// ver anterior . similar PERO el metodo devuelve un arraylistal que apunta el array List "lista "
				System.out.println("Introduzca la editorial a buscar : \n");
				String editorial = sc.nextLine();
				
				ArrayList<Libro> lista = gl.buscarPorEditorial(editorial);
				// .size ==> indica el numero de elementos que devuelve
				if(lista.size() != 0) {// si el arraly al que apunta lista no es vacio, lista elemento a elemento.
					System.out.println("La lista de peliculas por editorial es : \n");
					for(Libro l : lista) {//
						System.out.println(l);
					}
				}else {
					System.out.println("No hay conincidencias por editorial : \n");
				}
			}
		}while(!opcion.equals("0"));
		System.out.println("Fin del programa");
	}
	
	
	
}

