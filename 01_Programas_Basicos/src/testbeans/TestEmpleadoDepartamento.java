package testbeans;

import beans.Departamento;
import beans.Empleado;

public class TestEmpleadoDepartamento {

	public static void main(String[] args) {
		
		Empleado emp1 = new Empleado(200, "Eva", "Perez Rioja", "M", 120000, 44, 0, null);
		Departamento dep40 = new Departamento(40, "Formacion");
		
		Empleado emp2 = new Empleado(210, "Sofia", "Ruiz Zaragoza", "M", 120000, 32, 0, dep40);
		
		System.out.println("Nombre del empleado 2 : " + emp2.getNombre());
		System.out.println("Salario del empleado 2 : " + emp2.getSalario());
		System.out.println("Departamento del empleado 2 : " 
		+ emp2.getDepartamento().getNombre().toUpperCase());		
		
		System.out.println(emp1);
		System.out.println(emp2);

	}

}
