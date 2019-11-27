package main;

import java.util.ArrayList;
import java.util.Scanner;

import entidad.Director;
import entidad.Empleado;
import entidad.JefeProyecto;
import entidad.Programador;

public class MainAltaEmpleados {

	static Scanner sc = new Scanner(System.in);
	static ArrayList<Empleado> listaEmpleados = new ArrayList();
	
	public static void main(String[] args) {
		
		
		int opcion = 0;
		int opcionAlta = 0;
		
		do {
			opcion = muestraMenu();
			
			switch (opcion) {
			case 1:
				opcionAlta = muestraMenuAlta();
				switch (opcionAlta) {
				case 1:
					Empleado empleado = new Programador();
					altaEmpleado(empleado); 
					break;
					
				case 2:
					Empleado jefeProyecto = new JefeProyecto();
					altaEmpleado(jefeProyecto); 
					break;
					
				case 3:
					Empleado director = new Director();
					altaEmpleado(director); 
					break;	
					
				}
				break;				
			case 2:
				listaEmpleados(listaEmpleados);
				break;
		
			case 3:
				calcularSueldo(listaEmpleados);
				break;
						
			}
		
			}while(opcion != 0); }
		
	
private static void calcularSueldo(ArrayList<Empleado> listaEmpleados2) {
	

	System.out.println("Por favor, indique el DNI del empleado para mostrar su salario");
	System.out.println("--------------------------------------------------------------\n");

	String dni = sc.next();
	
	for (Empleado empleado : listaEmpleados) {
		if (dni.equals(empleado.getDni())) {
		System.out.println("el sueldo del empleado " + empleado.getNombre() + " cargo : "
							+ empleado.getClass().getSimpleName() + " =  " + empleado.calculaSueldo());
			}
	    }
		
	}


private static void listaEmpleados(ArrayList<Empleado> listaEmpleados) {
	
	for (Empleado empleado : listaEmpleados) {
		System.out.println("Los empleados son : " + empleado);
	   }
		
	}


private static void altaEmpleado(Empleado empleado) {
		
	//Pedimos los datos y los guardamos en las variables para poder tratarlos depues 
	System.out.println("Por favor, introduzca el DNI del empleado");
	System.out.println("-----------------------------------------\n");
// sc.next() ==> si se pone sc.nextline salta a la siguiente linea.
	String dni = sc.next();

	System.out.println("Por favor, introduzca el nombre del empleado");
	System.out.println("--------------------------------------------\n");
	String nombre = sc.next();

	System.out.println("Por favor, introduzca el salario base del empleado");
	System.out.println("--------------------------------------------------\n");
	double salario = Double.parseDouble(sc.next());
	
		
	System.out.println("Por favor, introduzca la edad del empleado");
	System.out.println("------------------------------------------\n");
	int edad = sc.nextInt();
	
	empleado.setDni(dni);
	empleado.setNombre(nombre);
	empleado.setSueldoBase(salario);
	empleado.setEdad(edad);
	
	if (empleado instanceof Programador) {
		listaEmpleados.add(empleado);
			
	}
		
	if (empleado instanceof JefeProyecto) {
		
		System.out.println("Por favor, introduzca los incentivos del empleado");
		System.out.println("-------------------------------------------------\n");
		double incentivo = Double.parseDouble(sc.next());
		
		JefeProyecto jp = (JefeProyecto) empleado;
		jp.setIncentivo(incentivo);
		listaEmpleados.add(jp);
	}
	
	if (empleado instanceof Director) {

		ArrayList<Empleado> listaDirector = new ArrayList();
		
		listaEmpleados.add(empleado);
		
		
		for (Empleado le : listaEmpleados) {
			System.out.println("Los empleados a elegir son : " + le);
		   }
		System.out.println("Por favor, introduzca el DNI del empleado dependiente del director");
		System.out.println("------------------------------------------------------------------\n");
		
		String dniEmp = sc.next();
		
		for (Empleado empleadoBuscar : listaEmpleados) {
			
			if (dniEmp.equals(empleadoBuscar.getDni())) {
				listaDirector.add(empleadoBuscar);
				System.out.println("El empleado " + empleadoBuscar + " se ha asociado al director " + empleado);
		   }
		}
		Director d = (Director) empleado;		
		d.setListaEmpDirector(listaDirector);
		
	}
		return;
	}


private static int muestraMenuAlta() {
	
	System.out.println("******** ALTA DE EMPLEADOS ***********");
	System.out.println(" ");
	System.out.println("1- Alta programador");
	System.out.println("2- Alta jefe de proyecto");
	System.out.println("3- Alta director");
	System.out.println(" ");
	
	int opcionAlta = sc.nextInt();
	
		return opcionAlta;
		
	}


private static int muestraMenu() {
		
	System.out.println("******** GESTION DE EMPLEADOS ***********");
	System.out.println(" ");
	System.out.println("1- Alta empleado");
	System.out.println("2- lista de empleados");
	System.out.println("3- Calcular salario de los empleados");
	System.out.println(" ");
	System.out.println("0- Salir");
	
	int opcion = sc.nextInt();
		
	if (opcion < 0 || opcion > 3) {
			System.out.println("Introduzca valores validos 0, 1, 2, o 3");
		}
		
	return opcion;
								}

}
