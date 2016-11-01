/**
 * 
 */
package co.edu.udea.iw.dao;

import java.util.List;

import co.edu.udea.iw.dto.Ciudad;
import co.edu.udea.iw.exception.MyDaoException;

/**
 * Define los metodos CRUD para aceder a la entidad Ciudades
 * @author Frank A. Castrillón - email: frank.castrillon@udea.edu.co
 *
 */
public interface CiudadDAO {
	/**
	 * Entrega una lista de ciudades disponibles en la base de datos
	 * @return Lista de ciudades
	 * @throws MyDaoException cuando hay algun problema en la conexion
	 */
	public List<Ciudad> obtener () throws MyDaoException;
	/**
	 * Obtiene una ciudad de la base de datos a partir de su codigo
	 * @param codigo
	 * @return Ciudad
	 * @throws MyDaoException
	 */
	public Ciudad getCityById(Long codigo) throws MyDaoException;
	/**
	 * Guarda una ciudad en la base de datos 
	 * @param ciudad
	 * @throws MyDaoException
	 */
	public void saveCity (Ciudad ciudad) throws MyDaoException;
	/**
	 * Modifica una ciudad existente y la guarda en la BD 
	 * @param ciudad
	 * @throws MyDaoException
	 */
	public void editCity (Ciudad ciudad) throws MyDaoException;
	/**
	 * Elimina una ciudad existente en la _BD
	 * @param codigo
	 * @throws MyDaoException
	 */
	public void deleteCity (Long codigo) throws MyDaoException;
 }
