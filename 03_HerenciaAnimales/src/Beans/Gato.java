package Beans;


public class Gato extends Animal{
	
	private int vidas;

	public Gato(String color, int vidas)  {
		super(color);
		this.vidas = vidas;
	}

	public Gato() {
		super();
//		color ="marillo - Marron";  No puedo porque esta privado en el padre
//		this.setColor("Amarillo - Marron");
	}
		
	public int getVidas() {
		return vidas;
	}

	public void setVidas(int vidas) {
		this.vidas = vidas;
	}
	

	public void mostrarDatos() {
		System.out.println("Vidas = " + vidas);
//		color = "marillo - Marron";
		System.out.println("Color = " + this.getColor());
			
	}

	public void trepar() {
		System.out.println("trepo que flipas");
	}
	
	// metodos reescritos de mi padre.
	
	@Override
	public String toString() {
		return "Gato [color=" + color + ", vidas=" + vidas + "]";
	}

	@Override
	public void saludar() {
		// TODO Auto-generated method stub
		System.out.println("soy un gato y tengo : " + vidas + " vidas");
	}

	@Override
	public void sonido() {
		// TODO Auto-generated method stub
		System.out.println("soy : " + color + " y digo MIAUUUUUUUU");
	}

	
	
	
}
