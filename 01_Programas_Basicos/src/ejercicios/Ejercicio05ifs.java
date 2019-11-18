package ejercicios;

public class Ejercicio05ifs {

	public static void main(String[] args) {
		int num = 3;
		int mes = 7;
		if (num == 4) {
			System.out.println("es cuatro");
			System.out.println("insisto es cuatro");}
		else {
			if (num < 4) {
			System.out.println("es menor de cuatro");
			System.out.println("insisto es menor de cuatro");}
	    	else {
			System.out.println("es mayor de cuatro");}}
		
		System.out.println("esto es todo");
		System.out.println("siguiente ejercicio");
		
		switch (mes) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println("el mes " + mes + " es de 31 dias");
			break; 
		case 4: case 6: case 9: case 11: 
			System.out.println("el mes " + mes + " es de 30 dias");
			break;
		case 28:
			System.out.println("el mes " + mes + " es de 28 dias");
			break;
		default:
			System.out.println("No has metido un mes correcto");
		}
	}

}
