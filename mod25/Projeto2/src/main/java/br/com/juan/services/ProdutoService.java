package main.java.br.com.juan.services;

import main.java.br.com.juan.dao.IProdutoDAO;
import main.java.br.com.juan.domain.Produto;

public class ProdutoService implements IProdutoService{
    private IProdutoDAO produtoDao;

    public ProdutoService(IProdutoDAO produtoDao) {
        this.produtoDao = produtoDao;
    }

    @Override
    public void cadastrar(Produto produto) {
        produtoDao.cadastrar(produto);
    }

    @Override
    public Produto buscarPorCodigo(Long codigo) {
        return produtoDao.buscarPorCodigo(codigo);
    }

    @Override
    public void excluir(Long codigo) {
        produtoDao.excluir(codigo);
    }

    @Override
    public void alterar(Produto produto) {
        produtoDao.alterar(produto);
    }


}
