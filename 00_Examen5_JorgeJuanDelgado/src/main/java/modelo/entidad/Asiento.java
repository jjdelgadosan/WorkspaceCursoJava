package modelo.entidad;

public class Asiento {

	private int numero;
	private String color;
	
	public Asiento() {
		super();
	}

	public Asiento(int numero, String color) {
		super();
		this.numero = numero;
		this.color = color;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Asiento [numero=" + numero + ", color=" + color + "]";
	}
	

}
