package ejercicios;
import java.util.Scanner;

public class Ejercicio10_Solito {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre = null;
		String contrase�a = null;

		Scanner leer= new Scanner(System.in);
		
		System.out.println("Por favor, dame tu nombre");
		nombre = leer.next();
		
		if (nombre.equals("sara")) {
			System.out.println("Por favor, dame tu contrase�a");
		    contrase�a = leer.next(); 
		    if (contrase�a.equals("sarita"))
		    	System.out.println("Usuario y contrase�a correctos, bienvenido a la aplicacion");
		    else 
				System.out.println("Contrase�a incorrecta");
		}
		else 
			System.out.println("Usuario incorrecto");
		
		leer.close();
	
	}
	 
}
