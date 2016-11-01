/**
 * 
 */
package co.edu.udea.iw.dto;

import java.io.Serializable;

/**
 * Clase DTO para poder hace referencia a la clave compuesta que posee
 * Direccion en la BD
 * @author frank.castrillon
 * Se implementa la interfaz serializable para sea mas eficiente 
 * 
 */
public class DireccionId implements Serializable{
	
	private Integer codigo;
	private Clientes cliente;
	
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public Clientes getCliente() {
		return cliente;
	}
	public void setCliente(Clientes cliente) {
		this.cliente = cliente;
	}
	
	

}
