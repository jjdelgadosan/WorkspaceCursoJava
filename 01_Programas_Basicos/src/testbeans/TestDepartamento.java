package testbeans;

import java.util.Scanner;

import beans.Departamento;

public class TestDepartamento {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		Departamento dp1, dp2, dp3;
// modo datos al constructor
		dp1 = new Departamento(10,"Ventas");
		dp2 = new Departamento();
// modo manual
		dp2.setIdDepartamento(20);
		dp2.setNombre("Administraccion");
		
		dp3 = new Departamento();
		
		
		System.out.println("Dame numero de departamento : ");
		dp3.setIdDepartamento(sc.nextInt());
// En caso de recoger un string, con el metodo 'parse' se pasa de string a numero entero 
		dp3.setIdDepartamento(Integer.parseInt(sc.next()));
		
		System.out.println("Dame el nombre del departamento");
		dp3.setNombre(sc.next());
		
		System.out.println("DATOS DE LOS DEPARTAMENTO");
		System.out.println(dp1);
		System.out.println(dp2);
		System.out.println(dp3);
		
		System.out.println("DATOS SUELTOS");
		System.out.println("id dp1 : " + dp1.getIdDepartamento());
		System.out.println("Nombre dp1 : " + dp1.getNombre());
		
		sc.close();	
	}

}
