package Testbeans;

import Beans.Cliente;
import Beans.Pedido;

public class TestPedido {

	public static void main(String[] args) {
		
		Pedido Ped1 = new Pedido(1,"tornillo 4 - 30",1, true, Cliente.dameCliente()); 
		System.out.print("pedido : " + Ped1.getIdPedido());	
		System.out.print("\t descripcion : " + Ped1.getDescripcion());
		System.out.println();
		System.out.println("cliente : " + Ped1.getCliente().getNombre().toUpperCase());
		
	}

}
