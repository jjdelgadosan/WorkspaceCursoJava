package bean;

public class Direccion {
	
	private String tipoVia;
	private String nombreVia;
	private String ciudad;
	private String cp;
		
	public String getTipoVia() {
		return tipoVia;
	}
	public void setTipoVia(String tipoVia) {
		this.tipoVia = tipoVia;
	}
	public String getNombreVia() {
		return nombreVia;
	}
	public void setNombreVia(String nombreVia) {
		this.nombreVia = nombreVia;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getCp() {
		return cp;
	}
	public void setCp(String cp) {
		this.cp = cp;
	}
	
	@Override
	public String toString() {
		return "Direccion [tipoVia=" + tipoVia + ", nombreVia=" + nombreVia + ", ciudad=" + ciudad + ", cp=" + cp + "]";
	}
	
	// NOTAS CURIOSAS 
	// 01234 = base octal, porque empieza por 0
	// 0xFFF = base hexadecimal, porque empieza por 0x
	// 0b101 = binario porque empieza por, 0b

	
	
	
}
