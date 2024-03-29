
/*
 * Quiero hacer el modelo de datos de una aplicaci�n que soporte las siguientes
caracteristicas:

1- La idea es codificar el modelo de datos de una empresa
2- La empresa tendr� tres tipos de empleados, programadores, jefes de proyecto y directores
3- Todos tendran atributos comunes, tales como dni, nombre, salario base y edad
4- Todos los empleados se les podra calcular el sueldo total, pero a cada uno se les calculara de manera
	diferente:
	a) los programadores tendran como sueldo total su salario base
	b) los jefes de proyecto tendr�n un sueldo total de su salario base + unos incentivos
		(cada jefe de proyecto tendr� unos incentivos distintos)
	c) los directores tendran un salario total de su salario base + el numero de
		empleados a su cargo * 100

Una vez hecho el modelo de datos se pide probar el modelo creando 4 programadores, 2 jefes de proyecto
, 1 director (con 2 de esos programadores y un jefe de proyecto). Se meter�n los empleados en un array
y se ejecutar� el calcular sueldo total de cada uno de ellos para observar como el programa muestra
cada uno de los sueldos totales
 */
package entidad;
import java.util.ArrayList;

public class Director extends Empleado {

	private ArrayList<Empleado> listaEmpDirector;

	/**
	 * @return the listaEmpDirector
	 */
	public ArrayList<Empleado> getListaEmpDirector() {
		return listaEmpDirector;
	}

	/**
	 * @param listaEmpDirector the listaEmpDirector to set
	 */
	public void setListaEmpDirector(ArrayList<Empleado> listaEmpDirector) {
		this.listaEmpDirector = listaEmpDirector;
	}

	@Override
	public double calculaSueldo() {
		
		double salarioTotal = this.getSueldoBase();

		// for (Empleado empleado: listaEmpDirector) {// esto funciona recorriendo y con
		// contador

		// salarioTotal=salarioTotal+100;

		// }

		int numeroEmpladosACargo = listaEmpDirector.size();

		return salarioTotal + numeroEmpladosACargo * 100;
	}

}
