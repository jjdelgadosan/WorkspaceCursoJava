package Beans;

public class Empleado {

//	private int idEmpleado;
//	private String nombre, apellidos, sexo;
//	private double salario;
//	private int edad;
//	private double comision;
//	private Departamento departamento;
	
	protected int idEmpleado;
	protected String nombre, apellidos, sexo;
	protected double salario;
	protected int edad;
	protected double comision;
	protected Departamento departamento;

//variable estatica. No forma parte del total de variacles de la clase.  	
	public final static int MESES_NOMINA = 14;
	public final static double VALOR_ACCION = 5;
	
	public Empleado() {	
		super();
	}
	
	
	public Empleado(int idEmpleado, String nombre, String apellidos, String sexo, double salario, int edad,
			double comision, Departamento departamento) {
		super();
		this.idEmpleado = idEmpleado;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.sexo = sexo;
		this.salario = salario;
		this.edad = edad;
		this.comision = comision;
		this.departamento = departamento;
	}


	public Empleado(int idEmpleado, String nombre, String apellidos, String sexo, double salario, int edad) {
		super();
		this.idEmpleado = idEmpleado;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.sexo = sexo;
		this.salario = salario;
		this.edad = edad;
	}

	
		public Empleado(int idEmpleado, String nombre, String apellidos) {
		super();
		this.idEmpleado = idEmpleado;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}


	public int getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getComision() {
		return comision;
	}


	public void setComision(double comision) {
		this.comision = comision;
	}


	public Departamento getDepartamento() {
		return departamento;
	}


	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}


	@Override
	public String toString() {
		return "Empleado [idEmpleado=" + idEmpleado + ", nombre=" + nombre + ", apellidos=" + apellidos + ", sexo="
				+ sexo + ", salario=" + salario + ", edad=" + edad + ", comision=" + comision + ", departamento="
				+ departamento + "]";
	}
	
	// Metodos responsabilidad de la clase
	
	public String nombreCompleto() {
		return apellidos + ", " + nombre;
	}
	public double salarioMensual() {
		return (salario+comision)/MESES_NOMINA ;
		}
	public double salarioMensual(int meses) {
		return (salario+comision)/meses;
	}
	//en este caso, el porcentaje se suma al salario, y ademas lo graba.
	public double aumentarSalario(double aumento) {
		return salario *= 1 + (aumento/100);
	}
	
	public double totalSalario() {
		return salario + comision;
		
	}
	
	
	
	
	
	
	
}


