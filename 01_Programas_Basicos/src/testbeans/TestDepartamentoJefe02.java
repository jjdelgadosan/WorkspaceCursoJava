package testbeans;

import beans.Departamento;
import beans.Empleado;

public class TestDepartamentoJefe02 {

	public static void main(String[] args) {
		Departamento dep1 = null;
		dep1 = findById(30);
		System.out.println(dep1);
				
	}
		//metodo		
		public static Departamento findById(int id) {
		if (id != 30)
			return null;
		Departamento dep30 = new Departamento(30,"Ventas",null);
		
		Empleado emp114, emp115, emp116, emp300;
		
		emp114 = new Empleado(114, "diego", "martinez", "H", 
				35_000, 45, 2000, dep30);
		
 		emp115 = new Empleado(115, "sara", "perez", "M", 
				20_000, 35, 1000, dep30);
		
		emp116 = new Empleado(116, "carlos", "sanchez", "H", 
				18_000, 20, 0, dep30);
		
		emp300 = new Empleado(300, "natalia", "vazquez", "M", 
				60_000, 27, 5_500, dep30);
		
		return dep30;
	
	}
}