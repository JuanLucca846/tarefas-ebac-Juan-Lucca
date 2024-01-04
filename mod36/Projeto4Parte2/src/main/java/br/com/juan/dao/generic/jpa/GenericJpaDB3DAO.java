package main.java.br.com.juan.dao.generic.jpa;

import main.java.br.com.juan.dao.Persistente;

import java.io.Serializable;



public class GenericJpaDB3DAO<T extends Persistente, E extends Serializable>
        extends GenericJpaDAO<T,E> {

    public GenericJpaDB3DAO(Class<T> persistenteClass) {
        super(persistenteClass, "Mysql1");
    }

}