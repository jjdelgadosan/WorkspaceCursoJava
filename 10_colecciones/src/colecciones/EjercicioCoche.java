package colecciones;

import java.util.ArrayList;
import java.util.Scanner;

import bean.Coche;

public class EjercicioCoche {

// Declaramos la funcion scanner. se pone solo una vez fuera del main para utilizarla en todos los sitios. 
// Y se declara estatica para poder usarla en la funciones, que son estaticas.
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

// Generamos el arraylist tipo coche e inicializamos la variable opcion, donde se va a guardar lo que entra 
// por pantalla.
		ArrayList<Coche> listaCoches = new ArrayList<Coche>();
		int opcion = -1;

		do {

			System.out.println("Por favor, indique una opcion");
			System.out.println("-----------------------------");

			System.out.println("       1.- Alta coche.");
			System.out.println("       2.- Listar coches.");
			System.out.println(" ");
			System.out.println("       0 .- Salir del programa.");

			opcion = sc.nextInt();
// Esta sentencia "opcion = sc.nextInt();" recoge en sc lo introducido por pantalla y lo mueve a la variable 
// opcion para trabajar con el en el programa.
// Evaluamos opcion y llamamos a las funciones creadas pasandoles el arraylist. En un caso para que lo cargue 
// y en otro para que lo liste.
			
// Usamos un switch, seria valido con un if.
			switch (opcion) {
			case 1:
				altaCoche(listaCoches);
				break;

			case 2:
				listarCoches(listaCoches);
				break;

			default:
				break;
			}
			
			if (opcion < 0 || opcion > 2) {
				System.out.println("Introduzca valores validos 0, 1, o 2");
				
			}
// El while es hasta que opcion sea distinto de 0. (continua en el bucle mientras opcion sea distinto de 0)
		} while (opcion != 0);

		System.out.println("Ha salido de la aplicación");

	}

// A la funcion altaCoche se le pasa el arrayList con estructura coche llamado listacoche para que lo cargue.
// Si no se le pasara, la funcion deberia devolver los datos para cargarlos deespues, ya que si no se perderian.
	public static void altaCoche(ArrayList<Coche> listaCoches) {

//Pedimos los datos y los guardamos en las variables para poder tratarlos depues 
		System.out.println("Por favor, introduzca matricula");
		System.out.println("-------------------------------");
// sc.next() ==> si se pone sc.nextline salta a la siguiente linea.
		String matricula = sc.next();

		System.out.println("Por favor, introduzca marca");
		System.out.println("---------------------------");
		String marca = sc.next();

		System.out.println("Por favor, introduzca modelo");
		System.out.println("----------------------------");
		String modelo = sc.next();
		
// Generamos la estructura coche y la cargamos con las variables introducidas por pantalla
		Coche coche = new Coche();
		coche.setMatricula(matricula);
		coche.setMarca(marca);
		coche.setModelo(modelo);
		
// Con esta sentencia metemos los datos recogidos en el objeto coche al arraylist
		listaCoches.add(coche);

	}

	public static void listarCoches(ArrayList<Coche> listaCoches) {

		System.out.println("Estos son los coches guardados");
		System.out.println("------------------------------");
// para sacar una linea por cada coche		
		for (Coche coche: listaCoches) {
			System.out.println(coche);
		}
// muestra todos los coches en orizontal			
		System.out.println(listaCoches);
		
	}

}
