package interfaces;

/**
 * Interfaz que proporciona movimiento a los objetos
 * 
 * @author aula2m
 *
 */

public interface Movible {
	
	// todos los metodos de una interfaz son publicos y abastractos. 
	// (no hacer falta ponerlo, ya los es por definicion)

	void moverseLento(); // ya es publico y abstracto
	
	public abstract void moverse (int metros); 
	
	
}
