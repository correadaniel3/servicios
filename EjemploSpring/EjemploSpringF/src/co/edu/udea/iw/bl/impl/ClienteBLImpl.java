/**
 * 
 */
package co.edu.udea.iw.bl.impl;

import java.util.Date;

import org.hibernate.HibernateException;

import co.edu.udea.iw.bl.ClienteBL;
import co.edu.udea.iw.dao.ClientesDAO;
import co.edu.udea.iw.dao.UsuarioDAO;
import co.edu.udea.iw.dto.Clientes;
import co.edu.udea.iw.dto.Usuarios;
import co.edu.udea.iw.exception.MyDaoException;
import co.edu.udea.iw.util.validations.Validaciones;

/**
 * @see ClienteBL
 * @author Frank A. Castrillón - email: frank.castrillon@udea.edu.co
 *
 */
public class ClienteBLImpl implements ClienteBL {

	private ClientesDAO dao;
	private UsuarioDAO usuarioDAO;
	
	public ClienteBLImpl(ClientesDAO clienteDao, UsuarioDAO usuarioDao) {
		this.dao = clienteDao;
		this.usuarioDAO = usuarioDao;
	}

	@Override
	public void crearCliente(String cedula, String nombre, String apellido, String email, String usuariocrea) throws MyDaoException {
		Clientes cliente = null;
		Usuarios usuario = null;
		if( cedula == null || "".equals(cedula.trim())){
			throw new MyDaoException("Debe especificar la cedula del cliente");
		}
		if( nombre == null || "".equals(nombre.trim())){
			throw new MyDaoException("Debe especificar el nombre del usuario");
		}
		if( apellido == null || "".equals(apellido.trim())){
			throw new MyDaoException("Debe especificar el apellido del usuario");
		}
		if( email == null || "".equals(email.trim())){
			throw new MyDaoException("Debe especificar el email del usuario");
		}
		if( usuariocrea == null || "".equals(usuariocrea.trim())){
			throw new MyDaoException("Debe especificar el usuario que crea");
		}
		if(!Validaciones.isEmail(email)){
			throw new MyDaoException("El email no esta correctamente formado");
		}
		usuario = usuarioDAO.getUserByLogin(usuariocrea.toLowerCase());
		if(usuario == null){
			throw new MyDaoException("El usario que crea no existe");
		}
		if(usuarioDAO.getUserByLogin(cedula) != null){
			throw new MyDaoException("El usuario ya existe");
		}
		cliente.setCedula(cedula);
		cliente.setApellidos(apellido);
		cliente.setEmail(email);
		cliente.setUsuarioCrea(usuariocrea);
		cliente.setFechaCreacion(new Date());
		cliente.setEliminado(false);
		try {
			dao.saveCliente(cliente);
		} catch (Exception e) {
			throw new MyDaoException(e);
		}
		
	}

	/**
	 * @return the dao
	 */
	public ClientesDAO getDao() {
		return dao;
	}


	/**
	 * @param dao the dao to set
	 */
	public void setDao(ClientesDAO dao) {
		this.dao = dao;
	}
}
