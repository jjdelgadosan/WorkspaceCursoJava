package basico;

public class LanzadoraHilos {
  
	public static void main(String[] args) {
		
	HiloThread ht1 = new HiloThread("ht1");
	HiloThread ht2 = new HiloThread("ht2");
	
	// una vez creados los objetos hilos les decimos que arranquen
	ht1.start();
	ht2.start();
	
	
	// Con runnable, primero tenemos que crear el objeto runnable 
	
	HiloRunnable hr1 = new HiloRunnable("hr1");
	HiloRunnable hr2 = new HiloRunnable("hr2");
	
	// A continuacion crear un objeto hilo pasandole el objeto runnable
	Thread t1 = new Thread(hr1);
	Thread t2 = new Thread(hr2);
	// Si pasamos el mismo objeto podemos tener problemas de concurrencia, ya que ambos hilos
	// ejecutan el mismo objeto
	
	// Arrancamos el hilo de manera normal. El hilo ejecutará el metodo run del objeto pasado
	t1.start();
	t2.start();

	}
}