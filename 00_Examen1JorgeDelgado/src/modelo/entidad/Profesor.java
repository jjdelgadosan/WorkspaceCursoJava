package modelo.entidad;

import java.util.ArrayList;

public class Profesor {
	
	private String dniProfesor;
	private String nombreProfesor;
	private int edadProfesor;
	private double salario;
	private String sexoProfesor;
	private ArrayList<Curso> curso;
	
	public Profesor() {
		super();
	}

	public Profesor(String dniProfesor, String nombreProfesor, int edadProfesor, double salario, String sexoProfesor,
			ArrayList<Curso> curso) {
		super();
		this.dniProfesor = dniProfesor;
		this.nombreProfesor = nombreProfesor;
		this.edadProfesor = edadProfesor;
		this.salario = salario;
		this.sexoProfesor = sexoProfesor;
		this.curso = curso;
	}

	public String getDniProfesor() {
		return dniProfesor;
	}

	public void setDniProfesor(String dniProfesor) {
		this.dniProfesor = dniProfesor;
	}

	public String getNombreProfesor() {
		return nombreProfesor;
	}

	public void setNombreProfesor(String nombreProfesor) {
		this.nombreProfesor = nombreProfesor;
	}

	public int getEdadProfesor() {
		return edadProfesor;
	}

	public void setEdadProfesor(int edadProfesor) {
		this.edadProfesor = edadProfesor;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getSexoProfesor() {
		return sexoProfesor;
	}

	public void setSexoProfesor(String sexoProfesor) {
		this.sexoProfesor = sexoProfesor;
	}

	public ArrayList<Curso> getCurso() {
		return curso;
	}

	public void setCurso(ArrayList<Curso> curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "Profesor [dniProfesor=" + dniProfesor + ", nombreProfesor=" + nombreProfesor + ", edadProfesor="
				+ edadProfesor + ", salario=" + salario + ", sexoProfesor=" + sexoProfesor + ", curso=" + curso + "]";
	}

	
	
	
	
	}