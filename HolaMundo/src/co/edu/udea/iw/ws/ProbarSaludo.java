/**
 * 
 */
package co.edu.udea.iw.ws;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * Clase que respondera a las peticiones web para la funcionalidad
 * de saludar. Ejercicio de clase
 * @author Daniel Correa Arango - daniel.correa3@udea.edu.co
 *
 */
@Path("Saludo")
public class ProbarSaludo {
	
	
	/**
	 * Metodo sencillo para el primer saludo
	 * @return Saludo
	 */
	@GET
	@Produces("text/html")
	public String saludar() {
		return "ola ke ase";
	}
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	@Path("hola/{nombre}")
	public String hola(@PathParam("nombre")String nombre) {
		return "Hola "+nombre;
	}
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	@Path("hola")
	public String holaQuery(@QueryParam("nombre")String nombre) {
		return "Hola "+nombre;
	}

}
