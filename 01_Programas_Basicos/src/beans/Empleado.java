package beans;

public class Empleado {

	private int idEmpleado;
	private String nombre, apellidos, sexo;
	private double salario;
	private int edad;
	private double comision;
	private Departamento departamento;
	
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
		return salario/14 ;
		}
	public double salarioMensual(int meses) {
		return salario/meses;
	}
	//en este caso, el += hace salario + aumento, y ademas, lo graba
	public double aumentarSalario(int aumento) {
		return salario+= aumento;
	}
	
	
	
	
	
	
	
	
	
}


