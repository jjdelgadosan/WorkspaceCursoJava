package modelo.entidad;

import java.util.ArrayList;

public class Curso {
	
	
	private String idCurso;
	private String nombreCurso;
	private String horas;
	private double precio;
	private Profesor profesor;
	private ArrayList<Alumno> listaAlumnos;
	
	public Curso() {
		super();
	}

	public Curso(String idCurso, String nombreCurso, String horas, double precio, Profesor profesor,
			ArrayList<Alumno> listaAlumnos) {
		super();
		this.idCurso = idCurso;
		this.nombreCurso = nombreCurso;
		this.horas = horas;
		this.precio = precio;
		this.profesor = profesor;
		this.listaAlumnos = listaAlumnos;
	}

	public String getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(String idCurso) {
		this.idCurso = idCurso;
	}

	public String getNombreCurso() {
		return nombreCurso;
	}

	public void setNombreCurso(String nombreCurso) {
		this.nombreCurso = nombreCurso;
	}

	public String getHoras() {
		return horas;
	}

	public void setHoras(String horas) {
		this.horas = horas;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	public ArrayList<Alumno> getListaAlumnos() {
		return listaAlumnos;
	}

	public void setListaAlumnos(ArrayList<Alumno> listaAlumnos) {
		this.listaAlumnos = listaAlumnos;
	}

	@Override
	public String toString() {
		return "Curso [idCurso=" + idCurso + ", nombreCurso=" + nombreCurso + ", horas=" + horas + ", precio=" + precio
				+ ", profesor=" + profesor.getNombreProfesor() + ", listaAlumnos=" + listaAlumnos + "]";
	}

	
	
}
	
	