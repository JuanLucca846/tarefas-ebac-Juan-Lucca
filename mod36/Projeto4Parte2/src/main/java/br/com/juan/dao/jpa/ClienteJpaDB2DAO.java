package main.java.br.com.juan.dao.jpa;


import main.java.br.com.juan.dao.generic.jpa.GenericJpaDB2DAO;
import main.java.br.com.juan.domain.jpa.ClienteJpa;

public class ClienteJpaDB2DAO extends GenericJpaDB2DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

    public ClienteJpaDB2DAO() {
        super(ClienteJpa.class);
    }

}