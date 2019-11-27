package entidad;

public class JefeProyecto extends Empleado {
	
	private double incentivo;
	
	@Override
	public  double calculaSueldo() {
		
		double salarioTotal = incentivo + this.getSueldoBase();
		
	 return   salarioTotal;
		
	}

	/**
	 * @return the incentivo
	 */
	public double getIncentivo() {
		return incentivo;
	}

	/**
	 * @param incentivo the incentivo to set
	 */
	public void setIncentivo(double incentivo) {
		this.incentivo = incentivo;
	}
	
	

}
