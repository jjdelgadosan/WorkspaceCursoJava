package Testbeans;

import Beans.Empleado;
import Beans.Gerente;

public class Testconstantes {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		System.out.println(Empleado.MESES_NOMINA);

		Empleado e1 = new Empleado();
		Gerente g1 = new Gerente();
		
		System.out.print(e1);
		System.out.println(e1.MESES_NOMINA);		
		
		
	}

}
