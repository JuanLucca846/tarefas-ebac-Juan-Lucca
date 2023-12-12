package main.java.br.com.juan.services;

import main.java.br.com.juan.dao.ClienteDAO;
import main.java.br.com.juan.dao.IClienteDAO;
import main.java.br.com.juan.domain.Cliente;
import main.java.br.com.juan.exceptions.TipoChaveNaoEncontradaException;

public interface IClienteService {

    Boolean salvar(Cliente cliente) throws TipoChaveNaoEncontradaException;

    Cliente buscarPorCPF(Long cpf);

    void excluir(Long cpf);

    void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;

}
