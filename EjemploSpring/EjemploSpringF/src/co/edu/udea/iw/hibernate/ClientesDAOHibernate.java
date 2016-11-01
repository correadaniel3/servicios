/**
 * 
 */
package co.edu.udea.iw.hibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import co.edu.udea.iw.dao.ClientesDAO;
import co.edu.udea.iw.dto.Ciudad;
import co.edu.udea.iw.dto.Clientes;
import co.edu.udea.iw.dto.Usuarios;
import co.edu.udea.iw.exception.MyDaoException;
import co.edu.udea.iw.util.validations.Validaciones;

/**
 * Define los metodos CRUD para la tabla Clientes en la BD
 * @author Frank A. Castrillón - email: frank.castrillon@udea.edu.co
 */
public class ClientesDAOHibernate implements ClientesDAO {
	
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
	public List<Clientes> obtener() throws MyDaoException {
		Session session = null;
		List<Clientes> listaClientes = null;
		try {
			session = sessionFactory.openSession();
			Criteria criteria = session.createCriteria(Clientes.class);
			listaClientes = criteria.list();
		} catch (HibernateException e) {
			throw new MyDaoException(e);
		}
		return listaClientes;
	}

	@Override
	public void saveCliente(Clientes cliente) throws MyDaoException {
		Session session = null;
		Transaction tx = null;
		try {
			session = sessionFactory.openSession();
			tx = session.beginTransaction();
			session.save(cliente);
			tx.commit();
		} catch (HibernateException e) {
			throw new MyDaoException(e);
		}
		
	}

	@Override
	public void editCliente(Clientes cliente) throws MyDaoException {
		Session session = null;
		try {
			session = sessionFactory.openSession();
			session.update(cliente);
		} catch (HibernateException e) {
			throw new MyDaoException(e);
		}
		
	}

	@Override
	public void deleteCliente(String cedula) throws MyDaoException {
		Session session = null;
		Clientes cliente = new Clientes();
		cliente.setCedula(cedula);
		try {
			session = sessionFactory.openSession();
			session.delete(cliente);
		} catch (HibernateException e) {
			throw new MyDaoException(e);
		}
		
	}

	@Override
	public Clientes getClienteById(String cedula) throws MyDaoException {
		Session session = null;
		Clientes cliente = null;
		try {
			session = sessionFactory.openSession();
			/**
			 * Esta es la mejor forma de traer un registro de la base de datos
			 * dado su id
			 */
			cliente = (Clientes)session.get(Clientes.class, cedula);
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
		return cliente;
	}

}
