package main.java.br.com.juan.dao.jpa;


import main.java.br.com.juan.dao.generic.jpa.GenericJpaDB1DAO;
import main.java.br.com.juan.domain.jpa.ProdutoJpa;


public class ProdutoJpaDAO extends GenericJpaDB1DAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

    public ProdutoJpaDAO() {
        super(ProdutoJpa.class);
    }

}