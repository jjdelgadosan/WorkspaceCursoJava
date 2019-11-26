package entidad;

//Para heredar una clase de otra se utiliza la palabra reservada extends

public class Pez extends Animal{
	
	private int numeroAletas;

	@Override
	public void comer(Object comida) {
		// instanceof preguntamos la clase del objeto al que apuntamos
		if (comida instanceof Placton) {
			// casteamos comida
			Placton p = (Placton) comida;
			System.out.println("Soy un pez que me llamo " + nombre + " y me voy a comer un placton con "  
					+ p.getCalorias() + " Calorias");
			// la division entre dos numeros enteros, devuelve un entero, por lo tanto uno debe de ser double 
			// para que devuelva double
			double nuevoPeso = p.getCalorias() /1000.0;
			setPeso(getPeso() + nuevoPeso);
		}else {
			System.out.println("Puajjjjjjjj, no me gusta eso!!!!! : (" ); 
			
		}
		
	}

	public void setNumeroAletas(int numeroAletas) {
		this.numeroAletas = numeroAletas;
	}

	public int getNumeroAletas() {
		return numeroAletas;
	}
}
