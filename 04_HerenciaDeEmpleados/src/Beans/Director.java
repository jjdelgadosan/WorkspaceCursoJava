package Beans;

public class Director extends Empleado{
	
	private int acciones;
	private String tablet;
	
	public Director() {
		super();
	}
	public Director(int idEmpleado, String nombre, String apellidos, String sexo, double salario, int edad,
			double comision, Departamento departamento, int acciones, String tablet) {
		super(idEmpleado, nombre, apellidos, sexo, salario, edad, comision, departamento);
		this.acciones = acciones;
		this.tablet = tablet;
	}
	public int getAcciones() {
		return acciones;
	}
	public void setAcciones(int acciones) {
		this.acciones = acciones;
	}
	public String getTablet() {
		return tablet;
	}
	public void setTablet(String tablet) {
		this.tablet = tablet;
	}
	@Override
	public String toString() {
		if (departamento == null)
		return "Director [idEmpleado=" + idEmpleado + ", nombre=" + nombre + ", apellidos=" + apellidos + ", sexo="
				+ sexo + ", salario=" + salario + ", edad=" + edad + ", comision=" + comision + ", departamento="
				+ departamento + ", acciones=" + acciones + ", tablet=" + tablet + "]";
		else
			return "Director [idEmpleado=" + idEmpleado + ", nombre=" + nombre + ", apellidos=" + apellidos + ", sexo="
			+ sexo + ", salario=" + salario + ", edad=" + edad + ", comision=" + comision + ", departamento="
			+ departamento.getIdDepartamento() + ", acciones=" + acciones + ", tablet=" + tablet + "]";
	}
	@Override
	public double totalSalario() {
		
		return salario = salario + comision +  (acciones * VALOR_ACCION);
	}
	
	
	
	

}
