/**
 * 
 */
package co.edu.udea.iw.bl;

import co.edu.udea.iw.exception.MyDaoException;

/**
 * Define los metodos concernientes a la logica del negocio sobre la clase usuario
 * @author Frank A. Castrillón - email: frank.castrillon@udea.edu.co
 *
 */
public interface UsuarioBL {
	/**
	 * Metodo para comprobar la validez de la contraseña de un usuario
	 * @param usuario
	 * @param contraseña
	 * @return True si es correcto y false si es incorrecto
	 * @throws MyDaoException
	 */
	public Boolean validarUsuario(String usuario, String contraseña) throws MyDaoException;

}
