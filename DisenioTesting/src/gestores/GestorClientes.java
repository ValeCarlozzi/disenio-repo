package gestores;
import logica.Cliente;
import dto.ClienteDTO;
import java.util.*;
import daos.DAOCliente;

public class GestorClientes {
	
	public GestorClientes() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Boolean validarFormato(ClienteDTO cliente) {
		//Completar, no se si retorna boolean o un error o una bandera.
		//Valida el formato del nro cliente, del nombre y doc.
		//No se si es necesario, el CU no lo pide.
		return true;
	}
	
	public List<Cliente> buscarClientes(ClienteDTO cliente) {
		
		DAOCliente daoCliente = new DAOCliente();
		List<ClienteDTO> ClientesDTO = daoCliente.buscarClientes(cliente);
		//No se si está bien, capaz devuelve ya Clientes y no ClientesDTO.
		List<Cliente> clientesRetorno = new ArrayList<Cliente>();
		
		for(ClienteDTO clientedto :ClientesDTO) {
		      clientesRetorno.add(newCliente(clientedto));
		    }
		
		if(clientesRetorno.isEmpty()) {
			//return error? o eso lo hacemos con la interfaz?
		}
			return clientesRetorno;
	}
	
	public Cliente newCliente(ClienteDTO cliente) {
		//TODO logica, si el orm devuelve clientes entonces no hace falta este metodo.
		return new Cliente();
	}
}
