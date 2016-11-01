/**
 * 
 */
package co.edu.udea.iw.hibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import co.edu.udea.iw.dao.CiudadDAO;
import co.edu.udea.iw.dto.Ciudad;
import co.edu.udea.iw.exception.MyDaoException;
import co.edu.udea.iw.util.validations.Validaciones;

/**
 * Define los metodos CRUS concernientes a la tabla Ciudad en la BD
 * @author Frank A. Castrillón - email: frank.castrillon@udea.edu.co
 *
 */
public class CiudadDAOHibernate implements CiudadDAO {

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
	public List<Ciudad> obtener() throws MyDaoException {
		Session session = null;
		List<Ciudad> listaCiudades = null;
		try {
			session = sessionFactory.openSession();
			Criteria criteria = session.createCriteria(Ciudad.class);
			listaCiudades = criteria.list();
		} catch (HibernateException e) {
			throw new MyDaoException(e);
		}
		return listaCiudades;
	}

	@Override
	public Ciudad getCityById(Long codigo) throws MyDaoException {
		Session session = null;
		Ciudad ciudad = null;
		try {
			session = sessionFactory.openSession();
			Criteria criteria = session.createCriteria(Ciudad.class).
					add(Restrictions.eq("codigo", codigo));
			ciudad = (Ciudad)criteria.uniqueResult();
		} catch (HibernateException e) {
			throw new MyDaoException(e);
		}
		return ciudad;
	}

	@Override
	public void saveCity(Ciudad ciudad) throws MyDaoException {
		Session session = null;
		try {
			session = sessionFactory.openSession();
			if(!Validaciones.isTextoVacio(ciudad.getNombre())){
				session.save(ciudad);
			}
		} catch (HibernateException e) {
			throw new MyDaoException(e);
		}		
	}

	@Override
	public void editCity(Ciudad ciudad) throws MyDaoException {
		Session session = null;
		try {
			session = sessionFactory.openSession();
			session.update(ciudad);
		} catch (HibernateException e) {
			throw new MyDaoException(e);
		}
		
	}

	@Override
	public void deleteCity(Long codigo) throws MyDaoException {
		Session session = null;
		Ciudad ciudad = new Ciudad();
		ciudad.setCodigo(codigo);
		try {
			session = sessionFactory.openSession();
			session.delete(ciudad);
		} catch (HibernateException e) {
			throw new MyDaoException(e);
		}
		
	}
	

}
