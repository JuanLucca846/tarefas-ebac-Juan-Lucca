package br.com.juan.dao;

import java.util.List;

import br.com.juan.dao.generic.IGenericDAO;
import br.com.juan.domain.Produto;

/**
 * @author maxjdev
 */
public interface IProdutoDAO extends IGenericDAO<Produto, String> {

	List<Produto> filtrarProdutos(String query);

}
