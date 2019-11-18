package testbeans;

import beans.Departamento;
import beans.Empleado;

public class TestDepartamentoJefe {

	public static void main(String[] args) {
		
		Departamento dep30 = new Departamento(10,"Ventas", null);
		Empleado emp114, emp115, emp116, emp300;
		
		emp114 = new Empleado(114,"Diego", "martinez", "H", 35_000, 45, 2000, dep30);
		emp115 = new Empleado(115,"sara", "perez", "M", 20_000, 35, 1000, dep30);
		emp116 = new Empleado(116,"carlos", "sanchez", "H", 18_000, 20, 0, dep30);
		
		dep30.setJefe(emp114);
//Asignacion de jefe que pertenece a otro departamento con tres variables
		Departamento dep120 = new Departamento(120,"Formacion", 
				new Empleado(225,"Carmen", "Gonzalez", "M", 70_000, 43, 10_000, dep30));

// Con getJefe cojo la estructura de empleado del jefe del dep120 (id_emp, nombre, apellido... etc)
// y con setDepartamento actualizo el nombre del departamento en el empleado 	
		dep120.getJefe().setDepartamento(dep120);
		
		
// Asignacion de un jefe que pertenece a otro departamento con cuatro variables
		
		emp300 = new Empleado(300,"Natalia", "vazquez", "M", 60_000, 27, 5_500, dep30);
		
		Departamento dep130 = new Departamento(130, "Logistica", emp300);
		
		emp300.setDepartamento(dep130);
				
		//nombre del departamento 
		System.out.println("dep120 : " + dep120.getJefe().getDepartamento().getNombre());
		System.out.println("dep130 : " + dep130.getJefe().getDepartamento().getNombre());
	}

}
