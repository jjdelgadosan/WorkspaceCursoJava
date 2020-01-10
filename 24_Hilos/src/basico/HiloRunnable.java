package basico;

public class HiloRunnable implements Runnable{
	
	private String nombreHilo;
	
	public HiloRunnable(String nombreHilo) {
		this.nombreHilo = nombreHilo;
	}
	@Override
	public void run() {
		System.out.println("Hola mundo Runnable");
		
		for(int i=0; i<=100;i++) {
			System.out.println("hilo " + nombreHilo + " Contador : " + i);
			try {
				Thread.sleep(200); //dormimos el hilo milisegundos
			} catch (InterruptedException e) {
				e.printStackTrace();
			                                 } 
	                             }
	                  }
	}
