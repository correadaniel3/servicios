package co.edu.udea.iw.test.dao;
import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import co.edu.udea.iw.dao.CiudadDAO;
import co.edu.udea.iw.dto.Ciudad;
import co.edu.udea.iw.exception.MyDaoException;
import co.edu.udea.iw.hibernate.CiudadDAOHibernate;

/**
 * Clase para hacer pruebas unitarias a la clase CiudadDAOTest
 *@author Frank A. Castrillón - email: frank.castrillon@udea.edu.co
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations=("classpath:configuracion.xml"))
public class CiudadDAOTest {
		
		@Autowired
		CiudadDAO dao;
		
		@Test
		public void obtener() {
			List<Ciudad> ciudades;
			try {
				ciudades = dao.obtener();
				assertTrue(ciudades.size() > 0);
			} catch (MyDaoException e) {
				fail(e.getMessage());
			}
		}

}
