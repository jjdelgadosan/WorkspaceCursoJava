package Beans;

public class Cliente {
	
	private String usuario, pwd, nombre, apellidos, direccion;

	public Cliente() {
		super();
	}

	public Cliente(String usuario, String pwd, String nombre, String apellidos, String direccion) {
		super();
		this.usuario = usuario;
		this.pwd = pwd;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
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

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Cliente [usuario=" + usuario + ", pwd=" + pwd + ", nombre=" + nombre + ", apellidos=" + apellidos
				+ ", direccion=" + direccion + "]";
	}
	
	// Metodos responsabilidad de la clase
	
		public static Cliente dameCliente() {
			   return new Cliente ("tomas", "Tomas", "Tomas", "Tomasin Escu", "Calle del pez");
  		}
		
		public static Cliente [] dameClientes() {
			Cliente [] clientes = {
			     new Cliente ("Tomas", "Tomas", "Tomasin", "Tomasin Escu", "Calle del pez"),
			     new Cliente ("Sara", "Sara", "Sarita", "Sarita Perez","Calle nuez"),
			     new Cliente ("Eva", "Eva", "Evita", "Evita Jimenez", "Calle Aguas"),
			     new Cliente ("Raul", "Raul", "Raulito", "Raulito gomez", "Calle de la Rosa")
			     };
		
		return clientes;
  		
	
		}
}
