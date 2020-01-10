package basico;

//para crear un hilo en java tenemos que extender de la clase Thread o implementar la interfaz Runnable
public class HiloThread extends Thread{

	private String nombreHilo;
	
	public HiloThread(String nombreHilo) {
		this.nombreHilo = nombreHilo;
	}

	// El hilo arrancar� en este metodo y morira cuando acabe el metodo
	@Override
	public void run() {

		System.out.println("Hola mundo");
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
