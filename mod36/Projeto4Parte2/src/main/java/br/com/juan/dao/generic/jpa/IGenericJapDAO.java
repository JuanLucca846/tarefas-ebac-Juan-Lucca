package main.java.br.com.juan.dao.generic.jpa;

import main.java.br.com.juan.dao.Persistente;
import main.java.br.com.juan.exceptions.DAOException;
import main.java.br.com.juan.exceptions.MaisDeUmRegistroException;
import main.java.br.com.juan.exceptions.TableException;
import main.java.br.com.juan.exceptions.TipoChaveNaoEncontradaException;

import java.io.Serializable;
import java.util.Collection;


public interface IGenericJapDAO <T extends Persistente, E extends Serializable> {


    public T cadastrar(T entity) throws TipoChaveNaoEncontradaException, DAOException;


    public void excluir(T entity) throws DAOException;


    public T alterar(T entity) throws TipoChaveNaoEncontradaException, DAOException;


    public T consultar(E id) throws MaisDeUmRegistroException, TableException, DAOException;


    public Collection<T> buscarTodos() throws DAOException;

}