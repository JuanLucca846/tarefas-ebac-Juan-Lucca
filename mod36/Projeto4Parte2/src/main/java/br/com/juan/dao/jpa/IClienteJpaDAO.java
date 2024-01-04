package main.java.br.com.juan.dao.jpa;


import main.java.br.com.juan.dao.Persistente;
import main.java.br.com.juan.dao.generic.jpa.IGenericJapDAO;
import main.java.br.com.juan.domain.jpa.ClienteJpa;

public interface IClienteJpaDAO<T extends Persistente> extends IGenericJapDAO<T, Long>{

}