package main.java.br.com.juan.dao.jpa;


import main.java.br.com.juan.dao.generic.jpa.GenericJpaDAO;
import main.java.br.com.juan.domain.jpa.ProdutoJpa;

public class ProdutoJpaDAO extends GenericJpaDAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

    public ProdutoJpaDAO() {
        super(ProdutoJpa.class);
    }

}