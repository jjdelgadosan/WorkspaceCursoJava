package curso.modelo.entidad;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Entity
@Table(name = "operaciones")
@Component
@Scope("prototype")
public class Operacion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private double operador1;
	private double operador2;
	private String operacion;
	private double resultado;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getOperador1() {
		return operador1;
	}
	public void setOperador1(double operador1) {
		this.operador1 = operador1;
	}
	public double getOperador2() {
		return operador2;
	}
	public void setOperador2(double operador2) {
		this.operador2 = operador2;
	}
	public String getOperacion() {
		return operacion;
	}
	public void setOperacion(String operacion) {
		this.operacion = operacion;
	}
	public double getResultado() {
		return resultado;
	}
	public void setResultado(double resultado) {
		this.resultado = resultado;
	}
	@Override
	public String toString() {
		return "Operacion [id=" + id + ", operador1=" + operador1 + ", operador2=" + operador2 + ", operacion="
				+ operacion + ", resultado=" + resultado + "]";
	}

	
	
	
}