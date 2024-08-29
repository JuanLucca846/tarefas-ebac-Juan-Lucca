package br.com.juan.service;

import java.util.List;

import br.com.juan.exceptions.DAOException;
import br.com.juan.services.generic.IGenericService;
import br.com.juan.domain.Cliente;

/**
 * @author maxjdev
 */
public interface IClienteService extends IGenericService<Cliente, Long> {

	Cliente buscarPorCPF(Long cpf) throws DAOException;

	List<Cliente> filtrarClientes(String query);

}
