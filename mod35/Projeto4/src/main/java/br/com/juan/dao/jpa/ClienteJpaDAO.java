package main.java.br.com.juan.dao.jpa;


import main.java.br.com.juan.dao.generic.jpa.GenericJpaDAO;
import main.java.br.com.juan.domain.jpa.ClienteJpa;

public class ClienteJpaDAO extends GenericJpaDAO<ClienteJpa, Long> implements IClienteJpaDAO {

    public ClienteJpaDAO() {
        super(ClienteJpa.class);
    }

}