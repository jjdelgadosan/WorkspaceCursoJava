package bean;

public abstract class Empleado {
	private String dni;
	private String nombre;
	private  int edad;
	private double sueldoBase;
	
	//--------------geter y seter
	
	
	
	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}


	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}


	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}


	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}


	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}


	/**
	 * @return the sueldoBase
	 */
	public double getSueldoBase() {
		return sueldoBase;
	}


	/**
	 * @param sueldoBase the sueldoBase to set
	 */
	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}


	
	
	
	
	//------ to string
	
	@Override
	public String toString() {
		return "Empleado [dni=" + dni + ", nombre=" + nombre + ", edad=" + edad + ", sueldobase=" + sueldoBase + "]";
	}
	
	
	// metodos propios 
		public abstract double calculaSueldo(); //devolvera un tipo double
		
		
	
	
	
	
	

}
