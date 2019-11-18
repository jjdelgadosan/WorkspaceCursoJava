package Beans;

public class Animal {
	
//	private String color;
	protected String color;
	
	public Animal() {
		super();
	}

	public Animal(String color) {
		super();
		this.setColor(color);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Animal [color=" + color + "]";
	}
	
	public void saludar() {
		System.out.println("soy un animal");
	}
	
	public void sonido() {
		System.out.println("n.p.i del sonido que hago, soy un ficticio");
	}
	

}
