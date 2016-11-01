/**
 * 
 */
package co.edu.udea.iw.test.dao;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import co.edu.udea.iw.dao.CiudadDAO;
import co.edu.udea.iw.dao.ClientesDAO;
import co.edu.udea.iw.dto.Clientes;
import co.edu.udea.iw.exception.MyDaoException;

/**
 * Clase para hacer pruebas unitarias a la clase ClienteDAOHibernate
 *@author Frank A. Castrillón - email: frank.castrillon@udea.edu.co
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations=("classpath:configuracion.xml"))
public class ClientesDAOHibernateTest {

	@Autowired
	ClientesDAO dao;
	/**
	 * Test method for {@link co.edu.udea.iw.hibernate.ClientesDAOHibernate#obtener()}.
	 */
	@Test
	public void testGuardar() {
	}

	/**
	 * Test method for {@link co.edu.udea.iw.hibernate.ClientesDAOHibernate#saveCliente(co.edu.udea.iw.dto.Clientes)}.
	 */
	//@Test
	public void testSaveCliente() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link co.edu.udea.iw.hibernate.ClientesDAOHibernate#editCliente(co.edu.udea.iw.dto.Clientes)}.
	 */
	//@Test
	public void testEditCity() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link co.edu.udea.iw.hibernate.ClientesDAOHibernate#deleteCliente(java.lang.String)}.
	 */
	//@Test
	public void testDeleteCity() {
		fail("Not yet implemented");
	}

}
