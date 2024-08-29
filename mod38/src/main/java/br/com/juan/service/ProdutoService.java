package br.com.juan.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.juan.services.generic.GenericService;
import br.com.juan.dao.IProdutoDAO;
import br.com.juan.domain.Produto;

/**
 * @author maxjdev
 */
@Stateless
public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {
	
	private IProdutoDAO produtoDao;

	@Inject
	public ProdutoService(IProdutoDAO produtoDao) {
		super(produtoDao);
		this.produtoDao = produtoDao;
	}

	@Override
	public List<Produto> filtrarProdutos(String query) {
		return produtoDao.filtrarProdutos(query);
	}

}
