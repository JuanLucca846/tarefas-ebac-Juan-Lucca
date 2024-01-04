package main.java.br.com.juan.dao.jpa;

import main.java.br.com.juan.dao.generic.jpa.GenericJpaDB1DAO;
import main.java.br.com.juan.domain.jpa.ClienteJpa;

public class ClienteJpaDAO extends GenericJpaDB1DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

    public ClienteJpaDAO() {
        super(ClienteJpa.class);
    }

}