package interfaces;

// Solo se puede extender de una clase, pero se pueden implementar todas las interfaces que queramos 
// separadas por comas ","
public class Persona implements Movible{
	
	String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public void moverseLento() {
		System.out.println("Soy un humano y me muevo 2 metros");
	}

	@Override
	public void moverse(int metros) {
		// TODO Auto-generated method stub
		
	}

	
	
	

}
