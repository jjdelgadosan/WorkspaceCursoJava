package TestBeans;

import Beans.Gato;

public class TestCato {

	public static void main(String[] args) {
	
		Gato gato1, gato2;

		gato1 = new Gato();
		gato2 = new Gato("manchas negras y blancas", 7);
		
		System.out.println(gato1 + " - " + gato2);
		
		gato1.saludar();
		gato1.sonido();
		
		gato2.saludar();
		gato2.sonido();
		
		gato2.mostrarDatos();
	}

}
