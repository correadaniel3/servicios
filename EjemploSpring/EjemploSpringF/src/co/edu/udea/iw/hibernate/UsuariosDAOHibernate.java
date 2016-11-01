/**
 * 
 */
package co.edu.udea.iw.hibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import co.edu.udea.iw.dao.UsuarioDAO;
import co.edu.udea.iw.dto.Usuarios;
import co.edu.udea.iw.exception.MyDaoException;
import co.edu.udea.iw.util.validations.Validaciones;

/**
 * Define los metodos CRUD para la tabla Usuarios en la BD
 * @author Frank A. Castrillón - email: frank.castrillon@udea.edu.co
 *
 */
public class UsuariosDAOHibernate implements UsuarioDAO {

private SessionFactory sessionFactory; 

	
	/**
	 * @return the sessionFactory
	 */
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	/**
	 * @param sessionFactory the sessionFactory to set
	 */
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public List<Usuarios> obtenerTodos() throws MyDaoException {
		Session session = null;
		List<Usuarios> listaUsuarios = null;
		try {
			session = sessionFactory.openSession();
			Criteria criteria = session.createCriteria(Usuarios.class);
			listaUsuarios = criteria.list();
		} catch (HibernateException e) {
			throw new MyDaoException(e);
		}finally{
			session.close();
		}
		return listaUsuarios;
	}

	@Override
	public Usuarios getUserByLogin(String id) throws MyDaoException {
		Session session = null;
		Usuarios usuario = null;
		try {
			session = sessionFactory.openSession();
			/**
			 * Esta es la mejor forma de traer un registro de la base de datos
			 * dado su id
			 */
			if(!Validaciones.isTextoVacio(id)){
				usuario = (Usuarios)session.get(Usuarios.class, id);
			}
			/**
			 * La otra forma de hacer es usando el metodo load, pero el objeto debe existir
			 * de lo contrario retornara una exception
			 * usario = (Usuarios)session.load(Usuarios.class, id);
			 */
		} catch (HibernateException e) {
			throw new MyDaoException(e);
		}finally{
			session.close();
		}
		return usuario;
	}

}
