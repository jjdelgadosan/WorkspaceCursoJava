package modelo.entidad;

public class Motor {
	
	private int cv;
	private String cilindrada;
	
	public Motor() {
		super();
	}

	public Motor(int cv, String cilindrada) {
		super();
		this.cv = cv;
		this.cilindrada = cilindrada;
	}

	public int getCv() {
		return cv;
	}

	public void setCv(int cv) {
		this.cv = cv;
	}

	public String getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(String cilindrada) {
		this.cilindrada = cilindrada;
	}

	@Override
	public String toString() {
		return "Motor [cv=" + cv + ", cilindrada=" + cilindrada + "]";
	}
	
	

}
