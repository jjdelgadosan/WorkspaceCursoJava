package ejercicios;

public class Ejercicio02_Repetitivas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int acumula3 = 0;
		int acumula7 = 0;
		int acumula3y7 = 0;
		int i =0;
		int resto = 0; 
		for ( i=1;i<=250;i++) {
					
			if (i%3 != 0 && i%7 !=0) {
	//System.out.println("no multiplo de 3 ni 7. Con el continue nos salimos del for, + eficiente");
					    continue;
			}
			if (i%3 ==0 )
				acumula3 ++;
								
			if (i%7 ==0)			
				acumula7 ++;
			
			if (i%3 == 0 && i%7 ==0) {
				System.out.println("Numero multiplo de 3 y 7 : " + i);
				acumula3y7 ++;}
		}
			    				
		System.out.println("Numero multiplo de 3 : " + acumula3);
		System.out.println("Numero multiplo de 7 : " + acumula7);
		resto= (i-1) - (acumula3 + acumula7 - acumula3y7);
		System.out.println("Numero de numeros que no son multiplos de 3 y 7 : " + resto);
	}
    }

