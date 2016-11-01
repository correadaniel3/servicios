/**
 * 
 */
package co.edu.udea.iw.dto;

/**
 * Clase DTO de la clase Ciudad haciendo referencia a la BD
 * @author Frank A. Castrillón - email: frank.castrillon@udea.edu.co
 *
 */
public class Ciudad {
	
	private Long codigo;
	private String nombre;
	private String codigoArea;
	
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCodigoArea() {
		return codigoArea;
	}
	public void setCodigoArea(String codigoArea) {
		this.codigoArea = codigoArea;
	}
}
