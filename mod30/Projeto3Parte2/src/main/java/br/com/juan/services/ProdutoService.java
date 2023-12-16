package main.java.br.com.juan.services;


import main.java.br.com.juan.dao.IProdutoDAO;
import main.java.br.com.juan.domain.Produto;
import main.java.br.com.juan.services.generic.GenericService;

public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

    public ProdutoService(IProdutoDAO dao) {
        super(dao);
    }

}
