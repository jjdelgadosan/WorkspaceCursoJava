package modelo.vista;

import java.util.ArrayList;


import modelo.entidad.Alumno;
import modelo.entidad.Curso;
import modelo.entidad.Profesor;

public class testAlumno {

	public static void main(String[] args) {
		
				
		Profesor profe1 = new Profesor ("55502525X", "Felix", 35, 780000, "H", null);
		Profesor profe2 = new Profesor ("25625650V", "Tomas", 55, 780000, "H", null);
		Profesor profe3 = new Profesor ("69696955X", "Eva", 53, 800000, "M", null);
		
		Curso curso1 = new Curso("FO00014", "Java", "560", 2000, profe1, null);
		Curso curso2 = new Curso("FO00015", "Cobol", "350", 1500, profe2, null);
		Curso curso3 = new Curso("FO00016", "Spring", "120", 1000, profe3, null);
					
		Alumno alu1 = new Alumno("52885766K", "Jorge Delgado Sanchez", "poco", 46, curso1);
		Alumno alu2 = new Alumno("55560576M", "Jorge Delgado Jimenez", "H", 10, curso1);
		Alumno alu3 = new Alumno("55569326J", "Alba Delgado Martin", "M", 14, curso1);
		Alumno alu4 = new Alumno("12360576L", "Ivan Delgado Martin", "H", 12, curso2);
		Alumno alu5 = new Alumno("52885766K", "Torrente Martin Lago", "H", 55, curso2);
		Alumno alu6 = new Alumno("55560576M", "Raquel Lopez Lopez", "M", 10, curso2);
		Alumno alu7 = new Alumno("55569326J", "Ana Llorente Zaragoza", "M", 14, curso3);
		Alumno alu8 = new Alumno("12360576L", "Eduardo Pena Triste", "H", 12, curso3);
		
			
// Sacamos solamente el nombre del alumno 1
		System.out.println("Nombre del alumno 1 : " + alu1.getNombreCompletoAlumno());
		
// Mostramos el numero de horas del curso de cobol
		System.out.println(" ****************************** ");
		System.out.println(" ");

		System.out.println("Horas del curso de Cobol : " + curso2.getHoras());
		
// Mostramos el salario de Eva, que es profe3
		System.out.println(" ****************************** ");
		System.out.println(" ");

		System.out.println("Salario de Eva : " + profe3.getSalario());
		
// El alumno 1 muestra sus datos, y el nombre del curso al que está asignado		
		System.out.println(" ****************************** ");
		System.out.println(" ");
		System.out.println("Datos completos del alumno 1 : " + alu1);
		
		
		System.out.println(" ****************************** ");
		System.out.println("Datos completos de todos los alumnos" + alu1);
		
// Creamos y cargamos un arrayList con los alumnos para luego mostralos todos		
	ArrayList<Alumno> listaAlumnos = new ArrayList<Alumno>();
		
		listaAlumnos.add(alu1);
		listaAlumnos.add(alu2);
		listaAlumnos.add(alu3);
		listaAlumnos.add(alu4);
		listaAlumnos.add(alu5);
		listaAlumnos.add(alu6);
		listaAlumnos.add(alu7);
		listaAlumnos.add(alu8);
		
				
		for (Alumno alumno: listaAlumnos) {
			System.out.println(alumno);
		}
		
		
		
		
}


	}

