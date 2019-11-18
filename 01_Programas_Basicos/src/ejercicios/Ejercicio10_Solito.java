package ejercicios;
import java.util.Scanner;

public class Ejercicio10_Solito {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre = null;
		String contraseña = null;

		Scanner leer= new Scanner(System.in);
		
		System.out.println("Por favor, dame tu nombre");
		nombre = leer.next();
		
		if (nombre.equals("sara")) {
			System.out.println("Por favor, dame tu contraseña");
		    contraseña = leer.next(); 
		    if (contraseña.equals("sarita"))
		    	System.out.println("Usuario y contraseña correctos, bienvenido a la aplicacion");
		    else 
				System.out.println("Contraseña incorrecta");
		}
		else 
			System.out.println("Usuario incorrecto");
		
		leer.close();
	
	}
	 
}
