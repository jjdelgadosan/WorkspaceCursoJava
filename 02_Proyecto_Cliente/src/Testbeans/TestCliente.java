package Testbeans;

import Beans.Cliente;

public class TestCliente {

	public static void main(String[] args) {
	
//cuando el metodo no es estatico se tiene que generar una variable en vacio para recuperar el dato 
// que luego se ha de mover a otra variable para su uso
//		Cliente cli1 = new Cliente();
//		Cliente miCliente = cli1.dameCliente();
		
// Metodo estatico... se recupera directamente sobre 
		Cliente otroCliente = Cliente.dameCliente();
		Cliente [] mis = Cliente.dameClientes();
		
		System.out.println(otroCliente);
		
		for (Cliente ele: mis)
			System.out.println(ele.toString());
		
		System.out.println();
		
		for (int i=0; i< mis.length; i++)
			System.out.println(mis[i]);
		
		
		
		
		
	}

}
