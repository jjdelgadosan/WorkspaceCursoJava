package modelo.negocio;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import modelo.entidad.Cliente;
import modelo.persistencia.DaoCliente;

@Service
public class GestorCliente {
	//En este caso lo que necesita la capa gestora
	//para funcionar es el dao del la librería
	//habria que adaptar todo el codigo a este dao
	@Autowired
	private DaoCliente daoCliente;

	public GestorCliente(DaoCliente daoCliente) {
		super();
		this.daoCliente = daoCliente;
	}

	public DaoCliente getCliente() {
		return daoCliente;
	}


	public void setCliente(DaoCliente daoCliente) {
		this.daoCliente = daoCliente;
	}

	public List<Cliente> getListaClientes(){
		return daoCliente.getListaClientes();
	}
	
	/**
	 * Dar de alta un cliente
	 * @param cliente Cliente a dar de alta
	 * @return 0 en caso de que haya ido bien, 1 en caso
	 * de que falte el dni, 2 en caso de que el dni no este correcto
	 * y 3 en caso de que el dni este duplicado
	 */
	public int alta(Cliente cliente) {
		if(cliente.getDni().isEmpty()) {
			return 1;
		}
		
		boolean valid = validarDni(cliente.getDni()); 
		if(!valid) {
			return 2;
		}
			
		//si buscamos un cliente por dni y existe devolemos un 3
		if(buscarPorDni(cliente.getDni()) != null) {
			return 3;
		}
		
		return daoCliente.alta(cliente);
	}
	
	private boolean validarDni(String dni) {
		
		String letraMayuscula = "";
		 if(dni.length() != 9 || Character.isLetter(dni.charAt(8)) == false ) {
	            return false;
	        }
		
		 letraMayuscula = (dni.substring(8)).toUpperCase();
		
		 if(soloNumeros(dni) == true && letraDNI(dni).equals(letraMayuscula)) {
	            return true;
	        }
	        else {
	            return false;
	        }
	}
	
	
	private Object letraDNI(String dni) {
		   // pasar miNumero a integer
        int miDNI = Integer.parseInt(dni.substring(0,8));
        int resto = 0;
        String miLetra = "";
        String[] asignacionLetra = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
 
        resto = miDNI % 23;
 
        miLetra = asignacionLetra[resto];
 
        return miLetra;
    }
	

	private boolean soloNumeros(String dni) {
		int i, j = 0;
        String numero = ""; // Es el número que se comprueba uno a uno por si hay alguna letra entre los 8 primeros dígitos
        String miDNI = ""; // Guardamos en una cadena los números para después calcular la letra
        String[] unoNueve = {"0","1","2","3","4","5","6","7","8","9"};

        for(i = 0; i < dni.length() - 1; i++) {
            numero = dni.substring(i, i+1);

            for(j = 0; j < unoNueve.length; j++) {
                if(numero.equals(unoNueve[j])) {
                    miDNI += unoNueve[j];
                }
            }
        }

        if(miDNI.length() != 8) {
            return false;
        }
        else {
            return true;
        }
    }
	
	public Cliente buscarPorDni(String dni) {
		return daoCliente.buscarPorDni(dni);
	}
	
	public Cliente buscarPorId(int id) {
		return daoCliente.buscarPorId(id);
		
	}
	
	public boolean borrarPorId(int id) {
		return daoCliente.borrarPorId(id);
		
	}
	
	public List<Cliente> buscarPorNombre(String nombre){
		return daoCliente.buscarPorNombre(nombre);
	}
}
