/**
 * 
 */
package co.edu.udea.iw.bl;

import co.edu.udea.iw.dto.Clientes;
import co.edu.udea.iw.exception.MyDaoException;

/**
 * Define los metodos concernientes a la logica del negocio sobre la clase cliente
 * @author Frank A. Castrillón - email: frank.castrillon@udea.edu.co
 *
 */
public interface ClienteBL {
	/**
	 * Metodo utilizado para la creacion de un nuevo cliente en la bd 
	 * @param cliente
	 * @return
	 * @throws MyDaoException cuando el cliente es nulo o el id es vacio
	 */
	public void crearCliente(String cedula, String nombre, String apellido, String email, String usuar) throws MyDaoException;
}
