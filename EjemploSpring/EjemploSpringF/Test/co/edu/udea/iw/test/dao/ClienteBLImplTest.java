package co.edu.udea.iw.test.dao;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import co.edu.udea.iw.bl.ClienteBL;
import co.edu.udea.iw.dto.Clientes;
import co.edu.udea.iw.exception.MyDaoException;
/**
 * Clase para hacer pruebas unitarias a la clase ClienteBLImpl
 *@author Frank A. Castrillón - email: frank.castrillon@udea.edu.co
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations=("classpath:configuracion.xml"))
public class ClienteBLImplTest {

	@Autowired
	ClienteBL clienteBL;
	@Test
	public void testCrearCliente() {
		try {
			String cedula="465", nombres="frank", apellidos="nose", email="frank@gmail.com", usuarioCrea="elver";
			clienteBL.crearCliente(cedula,nombres, apellidos, email, usuarioCrea);
		} catch (MyDaoException | NullPointerException e) {
			fail(e.getMessage());
		}
	}

}
