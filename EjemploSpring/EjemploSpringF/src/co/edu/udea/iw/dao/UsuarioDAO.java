/**
 * 
 */
package co.edu.udea.iw.dao;

import java.util.List;

import co.edu.udea.iw.dto.Usuarios;
import co.edu.udea.iw.exception.MyDaoException;

/**
 * Define los metodos CRUD para aceder a la entidad  Usuarios
 * @author Frank A. Castrillón - email: frank.castrillon@udea.edu.co
 */
public interface UsuarioDAO {
	/**
	 * Retorna la lista de los usuarios que estan en la BD
	 * @return lista de usuarios
	 * @throws MyDaoException
	 */
	public List<Usuarios> obtenerTodos() throws MyDaoException;
	/**
	 * Obtener un usuario de la bd dado el login de usuario
	 * @param id
	 * @throws MyDaoException
	 * @return Usuario 
	 */
	public Usuarios getUserByLogin(String id) throws MyDaoException;
}
