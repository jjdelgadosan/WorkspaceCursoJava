package curso;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

import curso.modelo.entidad.Pelicula;
import curso.modelo.negocio.GestorPelicula;
import curso.modelo.persistencia.PeliculaDao;

@SpringBootApplication
//@ImportResource("classpath:beans.xml")
public class Application {
	
	public static ApplicationContext context;

	public static void main(String[] args) {
				
		context = SpringApplication.run(Application.class, args);
		
		GestorPelicula gp = context.getBean("gestorPelicula",GestorPelicula.class);
		Pelicula p = context.getBean("pelicula",Pelicula.class);
		
		p.setTitulo("Titanic");
		p.setGenero("amor");
		p.setDirector("Leonardo Di Caprio");
		p.setYear(2000);
		
		gp.alta(p);
		
		System.out.println("Fin del alta pelicula");
		
		PeliculaDao pd = context.getBean("peliculaDao",PeliculaDao.class);
		
		List<Pelicula> lista = pd.findByTitulo("titanic");
		System.out.println(lista);
		
		System.out.println("Fin consulta pelicula");
		
		Pelicula pelicula = gp.obtener(1);
		
		System.out.println(pelicula);
		System.out.println("Fin del alta pelicula");
		
		
	}

}
