package ejerciciohilos;

import java.util.Date;

public class HiloPrimo1 implements Runnable {

	private int primo1;
	
	public HiloPrimo1 (int primo1){
		this.primo1 = primo1;
	}
	@Override
	public void run() {
	
		int contador = 4;
		boolean primo = true; 
		// tomamos el tiempo inicial
		// la clase date cuando instanciamos el objeto contiene el numero de milisegundos que han 
		// pasado desde 1970
		Date dateInicial = new Date(); 
		
		while ((primo) && (contador!=primo1)) {
			if (primo1 % contador == 0) 
				primo = false;
				contador++;
		    }
	
		Date dateFinal = new Date(); 
		
		//restamos dateFinal - dateInicial para saber el tiempo de ejecucion
		
		long timepoTranscurrido = dateFinal.getTime() - dateInicial.getTime();
		
		if (primo) {
		System.out.println("HiloPrimo1 - El numero : " + primo1 + " es primo");}
		else { System.out.println("HiloPrimo1 - El numero : " + primo1 + " no es primo");
		 }
		System.out.println("El tiempo de busqueda del numero primo ha sido : " + timepoTranscurrido);
		}
 }
