package daos;

import java.util.ArrayList;
import logica.Cliente;
import java.util.List;
import dto.ClienteDTO;


public class DAOCliente {
	
	public DAOCliente() {
		super();
	}
	
	public List<ClienteDTO> buscarClientes(ClienteDTO datosCliente){
		//Completar con ORM
		return new ArrayList<ClienteDTO>();
	}
	
	public Cliente buscarClienteUnico(ClienteDTO datosCliente) {
		//Es para buscar el cliente en la base de datos 
		return new Cliente();
	}

}
