package main.java.br.com.juan.dao.generic.jpa;

import main.java.br.com.juan.dao.Persistente;

import java.io.Serializable;



public class GenericJpaDB2DAO<T extends Persistente, E extends Serializable>
        extends GenericJpaDAO<T,E> {

    public GenericJpaDB2DAO(Class<T> persistenteClass) {
        super(persistenteClass, "Postgre2");
    }

}