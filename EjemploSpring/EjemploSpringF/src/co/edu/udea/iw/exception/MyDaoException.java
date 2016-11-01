/**
 * 
 */
package co.edu.udea.iw.exception;
import org.apache.log4j.Logger;

/**
 * Esta clase extiende de la clase Exception para arrojar las excepciones 
 * de manera mas clara
 * @author Frank A. Castrillón - email: frank.castrillon@udea.edu.co
 *
 */
public class MyDaoException extends Exception {
	
	Logger log = Logger.getLogger(this.getClass());
	
	/**
	 * @param message
	 * @param cause
	 */
	public MyDaoException(String message, Throwable cause) {
		super(message, cause);
		log.error(message);
	}


	/**
	 * @param cause
	 */
	public MyDaoException(Throwable cause) {
		super(cause);
		log.error(cause.getMessage());
	}


	public MyDaoException(String message) {
		log.error(message);
	}
	
}

