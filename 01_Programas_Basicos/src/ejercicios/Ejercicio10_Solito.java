package ejercicios;
import java.util.Scanner;

public class Ejercicio10_Solito {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre = null;
		String contraseņa = null;

		Scanner leer= new Scanner(System.in);
		
		System.out.println("Por favor, dame tu nombre");
		nombre = leer.next();
		
		if (nombre.equals("sara")) {
			System.out.println("Por favor, dame tu contraseņa");
		    contraseņa = leer.next(); 
		    if (contraseņa.equals("sarita"))
		    	System.out.println("Usuario y contraseņa correctos, bienvenido a la aplicacion");
		    else 
				System.out.println("Contraseņa incorrecta");
		}
		else 
			System.out.println("Usuario incorrecto");
		
		leer.close();
	
	}
	 
}
