package test.java.br.com.juan.dao;


import main.java.br.com.juan.dao.jpa.IVendaJpaDAO;
import main.java.br.com.juan.domain.jpa.VendaJpa;
import main.java.br.com.juan.exceptions.DAOException;
import main.java.br.com.juan.exceptions.TipoChaveNaoEncontradaException;

public class VendaExclusaoJpaDAO extends main.java.br.com.juan.dao.generic.jpa.GenericJpaDAO<VendaJpa, Long> implements IVendaJpaDAO {

    public VendaExclusaoJpaDAO() {
        super(VendaJpa.class);
    }

    @Override
    public void finalizarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException {
        throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
    }

    @Override
    public void cancelarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException {
        throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
    }

    @Override
    public VendaJpa consultarComCollection(Long id) {
        throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
    }

}