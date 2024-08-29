package br.com.juan.service;

import java.util.List;

import br.com.juan.services.generic.IGenericService;
import br.com.juan.domain.Produto;

/**
 * @author maxjdev
 */
public interface IProdutoService extends IGenericService<Produto, String> {

	List<Produto> filtrarProdutos(String query);

}
