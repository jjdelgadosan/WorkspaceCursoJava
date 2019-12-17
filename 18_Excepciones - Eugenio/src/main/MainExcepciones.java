package main;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.omg.IOP.CodecPackage.TypeMismatch;

public class MainExcepciones {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Java intenta ejecutar el bloque try. Si se da la excepci�n ArithmeticException, se ejecuta
		//el bloque catch, en lugar de parar el programa.
		
		Integer resultado = null;
		
		do {		
			try { 						
					
				System.out.println("Introduzca el numerador");
				int numero1 = sc.nextInt();
				//String numero1 = sc.nextLine();	
				//int iNumero1 = Integer.parseInt(numero1);
				
				System.out.println("Introduzca el denominador");
				int numero2 = sc.nextInt();
				//String numero2 = sc.nextLine();
				//int iNumero2 = Integer.parseInt(numero2);
				
				// Si numero2 = 0, la divisi�n provoca una excepci�n y el programa se detiene
				
				resultado = numero1/numero2; //En este punto si se produce la excepci�n, el c�digo salta al bloque catch.
				//resultado = iNumero1/iNumero2; //En este punto si se produce la excepci�n, el c�digo salta al bloque catch.
				System.out.println("Resultado : " + resultado);
			
			} catch (ArithmeticException ex) { //en la variable ex est� la informaci�n del error.
				//Trata el error ArithmeticException que se produce en el bloque try
				
				System.out.println("No se puede dividir por cero!!!" + ex.getMessage());  //salida a consola de salida

				//ex.printStackTrace();  //salida a consola de errores
			} catch (NumberFormatException ex2) {
				System.out.println("Error: has tecleado un string");
			} catch (InputMismatchException ex3) {
				System.out.println("No se admiten caracteres");
				sc.nextLine();
			} catch (Exception e) { //Si se pone este catch al comienzo, se producen errores de compilaci�n por c�digo no alcanzable.
				System.out.println("Error inesperado : " + e.getMessage());
			}
		} while (resultado == null);
		
		System.out.println("Fin del programa");

	}

}
