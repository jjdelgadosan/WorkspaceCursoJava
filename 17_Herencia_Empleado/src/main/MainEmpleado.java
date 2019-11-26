package main;

import java.util.ArrayList;

import bean.Director;
import bean.Empleado;
import bean.JefeProyecto;
import bean.Programador;



public class MainEmpleado {

	public static void main(String[] args) {
		
		// vamos a necesitar dos array , el de  todos los empleados para generar caDA SUELDO Y EL DEL DIRECTO PARA CALCULAR SU SUELDO PARTICULAR
		
		
		
		Empleado p1= new Programador ();
		p1.setDni("50263589L");
		p1.setNombre("robustiano");
		p1.setEdad(25);
		p1.setSueldoBase(10000.25);
		
		Empleado p2= new Programador ();
		p2.setDni("20365847P");
		p2.setNombre("margarita");
		p2.setEdad(30);
		p2.setSueldoBase(15000.36);
		
		Empleado p3= new Programador ();
		p3.setDni("52147852J");
		p3.setNombre("pepe");
		p3.setEdad(50);
		p3.setSueldoBase(14000.54);
		
		Empleado p4= new Programador ();
		p4.setDni("45213658G");
		p4.setNombre("juana");
		p4.setEdad(41);
		p4.setSueldoBase(20000);
		
		JefeProyecto jp1=new JefeProyecto();
		
		jp1.setDni("45693658G");
		jp1.setNombre("dani");
		jp1.setEdad(41);
		jp1.setSueldoBase(22000);
		jp1.setIncentivo(1000.25);
		
		JefeProyecto jp2=new JefeProyecto();
		
		jp2.setDni("5553658G");
		jp2.setNombre("pili");
		jp2.setEdad(41);
		jp2.setSueldoBase(23000);
		jp2.setIncentivo(1000.25);
		
		Director d= new Director();
		
		d.setDni("5553658G");
		d.setNombre("don jose");
		d.setEdad(60);
		d.setSueldoBase(60000);
		
		
		ArrayList<Empleado>listaEmpleados= new ArrayList();
		ArrayList<Empleado>listaDirectors= new ArrayList();
		
		
		listaEmpleados.add(p1);
		listaEmpleados.add(p2);
		listaEmpleados.add(p3);
		listaEmpleados.add(p4);
		listaEmpleados.add(jp1);
		listaEmpleados.add(jp2);
		listaEmpleados.add(d);
		
		listaDirectors.add(p1);
		listaDirectors.add(p2);
		listaDirectors.add(jp1);
		
		
		d.setListaEmpDirector(listaDirectors);//
		
		
		
		// para imprimir 
		
		
		for (Empleado empleado: listaEmpleados) {
			
			System.out.println("el sueldo del empleado "+empleado.getNombre()+" cargo : "+empleado.getClass().getSimpleName()+ " =  "+empleado.calculaSueldo());
			
		}
		
		
		
	}

}
