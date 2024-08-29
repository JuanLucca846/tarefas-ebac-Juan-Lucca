package br.com.juan.dao;

import java.util.List;

import br.com.juan.dao.generic.IGenericDAO;
import br.com.juan.domain.Cliente;

/**
 * @author maxjdev
 */
public interface IClienteDAO extends IGenericDAO<Cliente, Long> {

	List<Cliente> filtrarClientes(String query);

}
