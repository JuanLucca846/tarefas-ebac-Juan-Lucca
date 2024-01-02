package main.java.br.com.juan.dao.jpa;


import main.java.br.com.juan.dao.generic.jpa.IGenericJapDAO;
import main.java.br.com.juan.domain.jpa.VendaJpa;
import main.java.br.com.juan.exceptions.DAOException;
import main.java.br.com.juan.exceptions.TipoChaveNaoEncontradaException;

public interface IVendaJpaDAO extends IGenericJapDAO<VendaJpa, Long> {

    public void finalizarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException;

    public void cancelarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException;


    public VendaJpa consultarComCollection(Long id);
}