package TestBeans;

import Beans.Animal;
import Beans.Gato;

public class TestVariablesAnimal {

	public static void main(String[] args) {
	
		Animal a1, a2,a3,a4,a5,a6;
		Gato gato1, g2;
		
		a1 = new Animal("pulpo - rojizo");
		a2 = new Gato("Montes", 5);
		a3 = new Animal("Camaleon - verde");
		a4 = new Gato("gatuno", 2);
			
		a4.saludar();
		a4.sonido();
// ((Gato)a4 <== Con esto se hace un casting que significa que aunque la variable sea animal 
// te situas en la clase gato, y al poner el punto saldran los metodos de la clase Gato. 		
		((Gato)a4).mostrarDatos();
		
		a5 = findAnimal();
		gato1 = (Gato)findAnimal();
		String tontada = (String) readObject();
		System.out.println(tontada);
//No funciona porque se esta casteando a clases distintas a object, y readObject devuelve un objeto 
// tipo Objet
//		Gato g2 = (Gato) readObject();
//		Animal a6 = (Animal)readObject();
	}
	
	public static Animal findAnimal() {
		return new Gato("Callejero - blanco", 2);
	
	}
	
	public static Object readObject() {
		return new String("Vaya tela");
		
			
	}
}
