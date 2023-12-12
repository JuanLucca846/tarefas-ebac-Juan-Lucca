package test.java.br.com.juan.dao;

import main.java.br.com.juan.dao.IProdutoDAO;
import main.java.br.com.juan.domain.Produto;

public class ProdutoDAOMock implements IProdutoDAO {
    @Override
    public void cadastrar(Produto produto) {

    }

    @Override
    public Produto buscarPorCodigo(Long codigo) {

        Produto produto = new Produto();
        produto.setCodigo(codigo);
        return produto;
    }

    @Override
    public void alterar(Produto produto) {

    }

    @Override
    public void excluir(Long cpf) {

    }
}
