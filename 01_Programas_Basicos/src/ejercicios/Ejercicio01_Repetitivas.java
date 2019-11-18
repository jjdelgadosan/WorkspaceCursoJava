package ejercicios;
import java.util.Scanner;

public class Ejercicio01_Repetitivas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero = 0;
		int acumulaSuma = 0;
		int acumulaNumero = 0;
		
		Scanner leer= new Scanner(System.in);
		
		System.out.println("Por favor, introduzca un numero. si quiere finalizar el proceso introduzca 0");
		numero = leer.nextInt();
		
		while (numero != 0) {
			acumulaNumero = acumulaNumero + 1;
			acumulaSuma = acumulaSuma + numero;
			System.out.println("Por favor, introduzca un numero. si quiere finalizar el proceso introduzca 0");
			numero = leer.nextInt();
			}
		System.out.println("El numero de numeros incluidos es : " + acumulaNumero);
		System.out.println("La suma de numeros incluidos es : " + acumulaSuma);
		leer.close();
	}
}
