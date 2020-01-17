package vista;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import modelo.entidad.Cliente;
import modelo.negocio.GestorCliente;
import modelo.persistencia.DaoCliente;

public class MainVistaClientes {

	public static ApplicationContext context;
	
	public static void main(String[] args) {
		//Primera parte
		//creacion de los objetos necesarios para el programa
		//y la inyeccion de sus dependencias
		Scanner sc = new Scanner(System.in);
		
		//En este caso lo que tenemos que pasarle es un
		//objeto daoLibreria
		//GestorLibreria gl = new GestorLibreria(new DaoLibreria());
		
		context = new ClassPathXmlApplicationContext("Context.xml");
		
		GestorCliente gl = (GestorCliente)context.getBean("gestorCliente");
		
		
		String opcion = "0";
		do {
			System.out.println("1- Alta de cliente");
			System.out.println("2- lista de clientes");
			System.out.println("3- Buscar cliente por id	");
			System.out.println("4- Buscar clientes por nombre");
			System.out.println("5- Borrar por id");
			System.out.println("0- Salir");
			opcion = sc.nextLine();
			if(opcion.equals("1")) {
				System.out.println("Introduzca el dni : ");
				//nextLine coje toda la frase, next coje palabra
				String dni = sc.nextLine();
				System.out.println("Introduzca el nombre :");
				String nombre = sc.nextLine();
				System.out.println("Introduzca la edad :");
				String edad = sc.nextLine();
				int iedad = Integer.parseInt(edad);
				
				//Libro l = new Libro();
				Cliente cl = context.getBean("cliente", Cliente.class);
				cl.setDni(dni);
				cl.setNombre(nombre);
				cl.setEdad(iedad);
				
				
				//basandonos en la explicacion de la documentacion
				//del metodo alta, podemos darle información a nuestro
				//usuario
				int alta = gl.alta(cl);
				if(alta == 0) {
					System.out.println("Cliente introducido correctamente");
				}else if(alta == 1) {
					System.out.println("El cliente tiene que tener dni");
				}else if(alta == 2) {
					System.out.println("El formato del dni no es correcto. Tiene que tener 9 caracteres con letra");
				}else if(alta == 3) {
					System.out.println("Ya existe ese dni");
				}
			}else if(opcion.equals("2")) {
				//ahora como estamos trabajando con Interfaces
				//es decir, el metodo getListaCliente() me devuelve
				//una interfaz, no puedo apuntar a una interfaz List
				//con una referencia de tipo ArrayList, por lo que
				//tengo que cambiar el tipo de rereferencia a List
				// Interfaz = Implementacion Si se puede
				// Implementacion = Interfaz NO se puede
				List<Cliente> cliente = gl.getListaClientes();
				if(cliente.size() != 0) {
					for(Cliente cl : cliente) {
						System.out.println(cl);
					}
				}else {
					System.out.println("Todavia no hay clientes	");
				}
			}else if(opcion.equals("3")) {
				System.out.println("Introduzca el id a buscar");
				String id = sc.nextLine();
				int iid = Integer.parseInt(id);
				
				Cliente cl = gl.buscarPorId(iid);
				if(cl == null) {
					System.out.println("El cliente no se ha encontrado");
				}else {
					System.out.println(cl);
				}
			}else if(opcion.equals("4")) {
				System.out.println("Introduzca el nombre a buscar");
				String nombre = sc.nextLine();
				//como la parte de la logica de negocio
				//la lleva el gestor, usamos el gestor creado
				//para buscar por nombre
				List<Cliente> lista = gl.buscarPorNombre(nombre);
				if(lista.size() != 0) {
					System.out.println("La lista de clientes por nombre es:");
					for(Cliente cl : lista) {
						System.out.println(cl);
					}
				}else {
					System.out.println("No hay conincidencias por nombre");
				}
			}else if(opcion.equals("5")) {
				System.out.println("Introduzca el id a borrar");
				String id = sc.nextLine();
				int iid = Integer.parseInt(id);
				
				boolean borrar = gl.borrarPorId(iid);
				if(borrar) {
					System.out.println("Cliente borrado");
				}else {
					System.out.println("Ha ocurrido algun error en la bbdd");
				}
			}
		}while(!opcion.equals("0"));
		System.out.println("Fin del programa");
		
	}

}
