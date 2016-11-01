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
import co.edu.udea.iw.bl.UsuarioBL;
import co.edu.udea.iw.dao.UsuarioDAO;
import co.edu.udea.iw.exception.MyDaoException;

/**
 * Clase para hacer pruebas unitarias a la clase CiudadDAOHibernate
 *@author Frank A. Castrillón - email: frank.castrillon@udea.edu.co
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations=("classpath:configuracion.xml"))
public class UsuarioBLImplTest {
	
	@Autowired
	UsuarioDAO dao;
	@Autowired
	UsuarioBL usuarioBL;

	@Test
	public void validarUser() {
		try {
			usuarioBL.validarUsuario("elver", "elver");
		} catch (MyDaoException e) {
			fail(e.getMessage());
		}
	}

}
