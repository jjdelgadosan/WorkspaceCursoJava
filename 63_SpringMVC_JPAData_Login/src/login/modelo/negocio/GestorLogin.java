package login.modelo.negocio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.RequestScope;

import login.modelo.entidad.Usuario;
import login.modelo.persistencia.DaoConsulta;
import login.modelo.persistencia.DaoRegistro;


@Service
@RequestScope 
public class GestorLogin {
	
	@Autowired
	private Usuario usuario;
	
	@Autowired
	private DaoRegistro daoRegistro;

	@Autowired
	private DaoConsulta daoConsulta;
	
	@Autowired
	public boolean validar() {
		try {
			if(usuario.getNombre().isEmpty()) {
				return false;
			}else if(usuario.getPassword().isEmpty()) {
				return false;
			}else if(usuario.getEdad().isEmpty()) {
				return false;
			}else if(usuario.getPeso().isEmpty()) {
				return false;
			}
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}
	
	public boolean alta() {
		return true;
	}

	public boolean validarDatosLogin() {
		try {
			if(usuario.getNombre().isEmpty()) {
				return false;
			}else if(usuario.getPassword().isEmpty()) {
				return false;
			}
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public Usuario recuperaUsuario(String nombre) {
		
		return daoConsulta.findByNombre(nombre);
	}
	
	
}
