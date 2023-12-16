package main.java.br.com.juan.dao;


import main.java.br.com.juan.dao.generic.IGenericDAO;
import main.java.br.com.juan.domain.Venda;
import main.java.br.com.juan.exceptions.DAOException;
import main.java.br.com.juan.exceptions.TipoChaveNaoEncontradaException;

public interface IVendaDAO extends IGenericDAO<Venda, String> {

    public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;

    public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
}