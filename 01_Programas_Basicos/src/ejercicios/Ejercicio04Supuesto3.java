package ejercicios;
import java.util.Scanner;

public class Ejercicio04Supuesto3 {

	public static void main(String[] args) {
		int radio = 0;
		double circunferencia = 0, areaCirculo = 0;
		Scanner leer = new Scanner(System.in);
		System.out.print("Teclea un numero de radio : ");
	    radio = leer.nextInt();
	    circunferencia = 2* Math.PI * radio; 
	    System.out.println("Circunferencia : " + circunferencia);
	    areaCirculo = Math.PI * Math.pow(radio, 2);
	    System.out.println("Area del circulo : " + areaCirculo);
	  
	      
	    leer.close();
	}

}
