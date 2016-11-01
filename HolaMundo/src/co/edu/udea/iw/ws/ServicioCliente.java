/**
 * 
 */
package co.edu.udea.iw.ws;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import co.edu.udea.iw.bl.ClienteBl;
import co.edu.udea.iw.dto.Cliente;
import co.edu.udea.iw.exception.MyDaoException;
import co.edu.udea.iw.ws.dto.ClienteWS;

/**
 * @author estudiantelis
 *
 */

@Path("Serviciocliente")
@Component
public class ServicioCliente {
	
	@Autowired
	ClienteBl clienteBl;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<ClienteWS> obtener() throws RemoteException{
		List<ClienteWS> resultado=new ArrayList<>();
		List<Cliente> datos= null;
		
		try{
			datos=clienteBl.obtener();
			for(Cliente cliente:datos){
				ClienteWS clientews=new ClienteWS(cliente.getNombres(), cliente.getApellidos(),
						cliente.getCedula(), cliente.getEmail());
				resultado.add(clientews);
			}
		}catch(MyDaoException e){
			throw new RemoteException(e.getMessage(),e);
		}
		return resultado;
	}

	public ClienteBl getClienteBl() {
		return clienteBl;
	}

	public void setClienteBl(ClienteBl clienteBl) {
		this.clienteBl = clienteBl;
	}
	
	
}
