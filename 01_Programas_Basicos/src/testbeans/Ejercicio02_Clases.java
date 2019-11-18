package testbeans;
import beans.Empleado;

public class Ejercicio02_Clases {

	public static void main(String[] args) {
	Empleado emp3= new Empleado(115,"Carol","jimenez Ladero", "M", 32000, 42, 0,null);
	System.out.println("mi salario anterior : " + emp3.getSalario());
	System.out.println(emp3.aumentarSalario(1000));
	System.out.println("mi salario actual : " + emp3.getSalario());

	
	}

}
