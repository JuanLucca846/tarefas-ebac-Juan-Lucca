package main.java.br.com.juan.dao.generic;


import main.java.br.com.juan.dao.Persistente;
import main.java.br.com.juan.exceptions.DAOException;
import main.java.br.com.juan.exceptions.MaisDeUmRegistroException;
import main.java.br.com.juan.exceptions.TableException;
import main.java.br.com.juan.exceptions.TipoChaveNaoEncontradaException;

import java.io.Serializable;
import java.util.Collection;

public interface IGenericDAO <T extends Persistente, E extends Serializable> {


    public Boolean cadastrar(T entity) throws TipoChaveNaoEncontradaException, DAOException;


    public void excluir(E valor) throws DAOException;


    public void alterar(T entity) throws TipoChaveNaoEncontradaException, DAOException;


    public T consultar(E valor) throws MaisDeUmRegistroException, TableException, DAOException;


    public Collection<T> buscarTodos() throws DAOException;
}
