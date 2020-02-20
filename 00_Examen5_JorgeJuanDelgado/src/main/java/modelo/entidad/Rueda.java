package modelo.entidad;

public class Rueda {
	
	private String marca;
	private String material;
	
	public Rueda() {
		super();
	}

	public Rueda(String marca, String material) {
		super();
		this.marca = marca;
		this.material = material;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return "Rueda [marca=" + marca + ", material=" + material + "]";
	}
	
	
	
	
	
}
