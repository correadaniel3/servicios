/**
 * 
 */
package co.edu.udea.iw.dto;

/**
 * Clase DTO de la clase Roles haciendo referencia a la BD
 *  @author Frank A. Castrillón - email: frank.castrillon@udea.edu.co
 */
public class Usuarios {
	private String login;
	private String nombres;
	private String apellidos;
	private String contrasena;
	private Roles rol;
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	public Roles getRol() {
		return rol;
	}
	public void setRol(Roles rol) {
		this.rol = rol;
	}
}
