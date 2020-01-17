package modelo.entidad;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Podemos dar de alta los beans por anotaciones.
 * 
 * Tenemos cuatro tipo de anotaciones basicas
 * 
 * @Component
 * @Service
 * @Repositoty
 * @Controller
 * 
 * La anotacion @Component da de alta la clase como bean en el contexto de Spring
 * 
 * La otras anotaciones hacen lo MISMO, son anotaciones semanticas, es decir, hacen 
 * distincion de lo que hace de manera conceptual.
 * 
 * @Service se usa para dar de alta un objeto de tipo gestor
 * @Repository es para dar de alta un objeto de tipo DAO
 * @Controller es para dar de alta un objeto de tipo Controlador
 * 
 * Ojo: Servicio y gestor es lo mismo (cada uno lo llama a su manera)
 *
 */

//@Component(value ="directorPropio") //de esta manera se le cambia el id (que es el nombre de la clase)

// esto es equivalente a <bean id="director" class="modelo.entidad.Director"
// por defecto el id del bean será el nombre de la clase en lowerCamelCase (primera en minuscula, y 
// las demas en mayuscula)

@Component
@Scope("prototype") //de esta manera damos de alta el bean con alcance protopipado
		
public class Director {
	
	private String nombre;
	private int edad;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	@Override
	public String toString() {
		return "Director [nombre=" + nombre + ", edad=" + edad + "]";
	}	
}
