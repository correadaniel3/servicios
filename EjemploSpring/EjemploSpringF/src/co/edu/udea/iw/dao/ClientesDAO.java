/**
 * 
 */
package co.edu.udea.iw.dao;

import java.util.List;
import co.edu.udea.iw.dto.Clientes;
import co.edu.udea.iw.exception.MyDaoException;

/**
 * Define los metodos CRUD para aceder a la entidad Clientes
 * @author Frank A. Castrillón - email: frank.castrillon@udea.edu.co
 */
public interface ClientesDAO {
	/**
	 * Entrega un cliente dado su id
	 * @param cedula
	 * @return
	 * @throws MyDaoException
	 */
	public Clientes getClienteById(String cedula) throws MyDaoException;
	/**
	 * Entrega una lista de clientes disponibles en la base de datos
	 * @return Lista de clientes
	 * @throws MyDaoException cuando hay algun problema en la conexion
	 */
	public List<Clientes> obtener () throws MyDaoException;
	/**
	 * Guarda un cliente en la base de datos 
	 * @param cliente
	 * @throws MyDaoException
	 */
	public void saveCliente (Clientes cliente) throws MyDaoException;
	/**
	 * Modifica un cliente existente y la guarda en la BD 
	 * @param cliente
	 * @throws MyDaoException
	 */
	public void editCliente (Clientes ciudad) throws MyDaoException;
	/**
	 * Elimina un cliente existente en la _BD
	 * @param cedula
	 * @throws MyDaoException
	 */
	public void deleteCliente (String cedula) throws MyDaoException;
}
