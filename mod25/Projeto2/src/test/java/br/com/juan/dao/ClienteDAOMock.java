package test.java.br.com.juan.dao;

import main.java.br.com.juan.dao.IClienteDAO;
import main.java.br.com.juan.domain.Cliente;
import main.java.br.com.juan.exceptions.TipoChaveNaoEncontradaException;

import java.util.Collection;

public class ClienteDAOMock implements IClienteDAO {
    @Override
    public Boolean cadastrar(Cliente entity) throws TipoChaveNaoEncontradaException {
        return true;
    }

    @Override
    public void excluir(Long valor) {

    }

    @Override
    public void alterar(Cliente entity) throws TipoChaveNaoEncontradaException {

    }

    @Override
    public Cliente consultar(Long valor) {
        Cliente cliente = new Cliente();
        cliente.setCpf(valor);
        return cliente;
    }

    @Override
    public Collection<Cliente> buscarTodos() {

        return null;
    }
}
