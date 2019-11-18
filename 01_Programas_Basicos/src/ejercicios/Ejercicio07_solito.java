package ejercicios;
import java.util.Scanner;

public class Ejercicio07_solito {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int num = 0;
		System.out.println("Por favor, introduce un numero de 1 al 3 y te diré como se escribe");
		
		Scanner leer= new Scanner(System.in);
		num = leer.nextInt();
				
		System.out.println(num);
		
		switch (num) {
				
		case 1: 
			System.out.println("uno");
			break; 
		case 2:  
			System.out.println("dos");
			break;
		case 3:
			System.out.println("tres");
			break;
		default:
			System.out.println("No has metido un dia correcto");
		}
		leer.close();

	}

}
