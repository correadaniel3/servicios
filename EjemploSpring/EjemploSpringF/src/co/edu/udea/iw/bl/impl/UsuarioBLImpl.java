/**
 * 
 */
package co.edu.udea.iw.bl.impl;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.apache.commons.codec.binary.Hex;
import org.hibernate.HibernateException;
import co.edu.udea.iw.bl.UsuarioBL;
import co.edu.udea.iw.dao.UsuarioDAO;
import co.edu.udea.iw.dto.Usuarios;
import co.edu.udea.iw.exception.MyDaoException;
import co.edu.udea.iw.util.encode.Cifrar;

/**
 * Define la implmentacion de los metodos de la logica del negocio
 * @author Frank A. Castrillón - email: frank.castrillon@udea.edu.co
 *
 */
public class UsuarioBLImpl implements UsuarioBL {
	private UsuarioDAO dao;
	/**
	 * @return the dao
	 */
	public UsuarioDAO getDao() {
		return dao;
	}

	/**
	 * @param dao the dao to set
	 */
	public void setDao(UsuarioDAO dao) {
		this.dao = dao;
	}
	
	/**
	 * Metodo que codifica la contraseña ingresada por medio del metodo
	 * SHA-1, para posterior comparacion con la contraseña que esta en la BD
	 * @param login
	 * @param contraseña
	 * @return True si es correcto y false si es incorrecto
	 * @throws MyDaoException
	 */
	@Override
	public Boolean validarUsuario(String login, String contraseña) throws MyDaoException {
		Usuarios usuario = null;
		Cifrar cifrar = new Cifrar();
		try {
			usuario = dao.getUserByLogin(login);
		    if(usuario.getContrasena().equals(cifrar.encrypt(contraseña))){
		    	return true;
		    }else{
		    	return false;
		    }
		} catch (HibernateException e) {
			throw new MyDaoException(e);
		}		
	}	
}
