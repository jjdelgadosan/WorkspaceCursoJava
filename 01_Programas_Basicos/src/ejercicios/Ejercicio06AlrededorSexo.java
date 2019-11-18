package ejercicios;
import java.util.Scanner;

public class Ejercicio06AlrededorSexo {

	public static void main(String[] args) {
		
		Scanner leer= new Scanner(System.in);
		char sexo='H';
		if (sexo == 'H')
			System.out.println("Hombre");		
			else 
			System.out.println("Mujer");

		String sexoS= "H";
		if (sexoS.equals("H")) 
			System.out.println("HombreString");		 
			else 
			System.out.println("MujerString");
		
		char sexoLeer;
		sexoLeer = leer.next().charAt(0);				// Se pasa la variable recogida pasandola como char
		if (sexoLeer == 'H')
		System.out.println("Hombre con caracter");		
		else 
			System.out.println("Mujer con caracter");
		
		String sexoLeerString = null;
		sexoLeerString = leer.next();	               // Se pasa la variable recogida pasandola como string  	
		if (sexoLeerString.equals("H"))
			System.out.println("Hombre leer string");		
		else 
			System.out.println("Mujer leer string");
		
		System.out.println("pepe".compareTo("Pepe"));  // Para comparar, devuelve un valor, 0 si e igual 
	
		leer.close();
		
		
		
		
		
	}

}
