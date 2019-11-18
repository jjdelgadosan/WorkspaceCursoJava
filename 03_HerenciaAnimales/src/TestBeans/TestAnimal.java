package TestBeans;

import Beans.Animal;

public class TestAnimal {

	public static void main(String[] args) {
		
		Animal a1, a2, a3; 

		a1 = new Animal("camaleon verde");
		a2 = new Animal("buo rojo");
		a3 = new Animal("negro");
		
		System.out.println(a1 + " - " + a2 + " - " + a3);
// cuando el metodo es syso, para mostrarlo se invoca así. 
		a1.saludar();
		a1.sonido();
		
		Animal [] zoologico = {a1,a2,a3};
		
		for (Animal ele: zoologico) {
			System.out.println(ele.getColor() + " - ");
			ele.sonido();
			
		}		
	}
	

}
