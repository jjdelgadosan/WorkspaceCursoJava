package testbeans;
import beans.Empleado;

public class Ejercicio01_Clase {

	public static void main(String[] args) {

		Empleado emp1, emp2, emp3;
		
		emp1 = new Empleado();
		emp2 = new Empleado(115, "Ivan", "Delgado Martin", "H", 1000, 11);
		emp3 = new Empleado(115, "Jorge", "Delgado Jimenez");
		
		emp1.setIdEmpleado(114);
		emp1.setNombre("Alba");
		emp1.setApellidos("Delgado Martin");
		emp1.setSalario(1000);
		emp1.setSexo("H");
				
		System.out.println(emp1.getSalario());
		
		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);
	
		
		/*
			
		emp1.idEmpleado(100);
		emp1.nombre = "Alba";
		emp1.apellidos = "Delgado Martin";
		emp1.edad = 14;
		emp1.sexo = "M";
		emp1.salario = 1000;
		
		System.out.println(emp1);
				
		emp2.idEmpleado = 101;
		emp2.nombre = "Ivan";
		emp2.apellidos = "Delgado Martin";
		emp2.edad = 11;
		emp2.sexo = "H";
		emp2.salario = 1000;

		emp3.idEmpleado = 102;
		emp3.nombre = "Jorge";
		emp3.apellidos = "Delgado Jimenez";
		emp3.edad = 10;
		emp3.sexo = "H";
		emp3.salario = 1000;

		System.out.println(emp2);
		System.out.println(emp3);
		
		*/
	

	}

}
