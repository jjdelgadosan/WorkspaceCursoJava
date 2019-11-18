package ejercicios;
import java.util.Scanner;

public class Ejercicio08_solito {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double num = 0;
		double num2 = 0;
		double resultado = 0;
		String operador = null;
						
		System.out.println("Por favor, dime que operación quieres hacer : Sumar, Restar, Multiplicacion, Division, Resto");
		
		Scanner leer= new Scanner(System.in);
		operador = leer.next();	
		
		System.out.println("Por favor, introduce el primer operador");
//		Scanner leer= new Scanner(System.in);
		num = leer.nextDouble();	
		
		System.out.println("Por favor, introduce el segundo operador");
//		Scanner leer= new Scanner(System.in);
		num2 = leer.nextDouble();	
			
		
		System.out.println(operador);
		
		switch (operador) {
				
		case "Suma": 
			resultado = num + num2;
			System.out.println("El resultado es : " + resultado);
			break;  
		case "Resta":  
			resultado = num - num2;
			System.out.println("El resultado es : " + resultado);
			break;
		case "Multiplicacion":
			resultado = num * num2;
			System.out.println("El resultado es : " + resultado);
			break;
		case "Division":
			resultado = num / num2;
			System.out.println("El resultado es : " + resultado);
			break;
		case "Resto":
			resultado = num % num2;
			System.out.println("El resultado es : " + resultado);
			break;
		default:
			System.out.println("Opcion erronea");
		}
		leer.close();
		

	}

}
