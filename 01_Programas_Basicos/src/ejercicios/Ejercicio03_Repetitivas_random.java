package ejercicios;

public class Ejercicio03_Repetitivas_random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i =0;
		double acumula =0;
		int numero =0;
		int cuentaPares =0;
		int cuentaImpares =0;
		double media =0;
		
		for ( i=1;i<=10;i++) {
			numero = (int)(Math.random()*50+1);
			System.out.println(numero);
			acumula = acumula + numero;
			if (numero%2 ==0) 
				cuentaPares++;
				else  cuentaImpares++;
				
	}
		media = acumula / (i-1);
		
		
		System.out.println("La media de los numeros leidos es : " + media);
		System.out.println("La suma de los numeros leidos es : " + acumula);
		System.out.println("hay " + cuentaPares + " numeros pares");
		System.out.println("hay " + cuentaImpares + " numeros Impares");
	}
	}
