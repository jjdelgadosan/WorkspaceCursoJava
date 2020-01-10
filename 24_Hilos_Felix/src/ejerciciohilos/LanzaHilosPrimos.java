package ejerciciohilos;

public class LanzaHilosPrimos {

	public static void main(String[] args) {
		
		
		//con runnable, primero tenemos que crear el objeto
		//runnable 

		
		
			
		//y a continuacion crear un objeto hilo (Thread)
		//pasandole el objeto runnable
		
		
		
		
		//si pasamo el mismo objeto a ambos hilos, podemos
		//tener problemas de concurrencia, ya que ambos
		//hilos estan ejecutando el mismo objeto02
		
		//y ahora podemos arrancar el hilo de manera normal
		//, el hilo ejecutará el metodo run del objeto pasado
		//por parametro
		
		
		for(int i=0;i<20;i++) {
			HiloPrimo1 hp1 = new HiloPrimo1(i);
			Thread t = new Thread(hp1);
			t.start();
		}
	}

}
