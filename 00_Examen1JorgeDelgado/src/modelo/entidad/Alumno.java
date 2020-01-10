package modelo.entidad;

public class Alumno {

	private String dniAlumno;
	private String nombreCompletoAlumno;
	private String sexo;
	private int edadAlumno;
	private Curso curso;
	
	public Alumno() {
		super();
	}

	public Alumno(String dniAlumno, String nombreCompletoAlumno, String sexo, int edadAlumno, Curso curso) {
		
		super();
		this.dniAlumno = dniAlumno;
		this.nombreCompletoAlumno = nombreCompletoAlumno;
		this.sexo = sexo;
		this.edadAlumno = edadAlumno;
		this.curso = curso;
	
	}

	public String getDniAlumno() {
		return dniAlumno;
	}

	public void setDniAlumno(String dniAlumno) {
		this.dniAlumno = dniAlumno;
	}

	public String getNombreCompletoAlumno() {
		return nombreCompletoAlumno;
	}

	public void setNombreCompletoAlumno(String nombreCompletoAlumno) {
		this.nombreCompletoAlumno = nombreCompletoAlumno;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getEdadAlumno() {
		return edadAlumno;
	}

	public void setEdadAlumno(int edadAlumno) {
		this.edadAlumno = edadAlumno;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	
	@Override
	public String toString() {
		return "Alumno [dniAlumno=" + dniAlumno + ", nombreCompletoAlumno=" + nombreCompletoAlumno + ", sexo=" + sexo
				+ ", edadAlumno=" + edadAlumno + ", curso=" + curso.getNombreCurso() + "]";
	}
	
	
	
	
	
	
}
