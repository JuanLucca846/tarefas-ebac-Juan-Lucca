package test.java.br.com.juan;

import main.java.br.com.juan.dao.IProdutoDAO;
import main.java.br.com.juan.domain.Produto;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import test.java.br.com.juan.dao.ProdutoDAOMock;

import java.util.Optional;

public class ProdutoDAOTest {

    private IProdutoDAO produtoDao;
    private Produto produto;

    public ProdutoDAOTest(){
        produtoDao = new ProdutoDAOMock();
    }

    @Before
    public void init(){
        produto = new Produto();
        produto.setCodigo(123L);
        produto.setNome("Relogio");
        produto.setValor(1000.00);
        produto.setQuantidade(1);

        produtoDao.cadastrar(produto);
    }

    @Test
    public void pesquisarProduto() {
        Produto produtoConsultado = produtoDao.buscarPorCodigo(produto.getCodigo());
        Assert.assertNotNull(produtoConsultado);
    }

    @Test
    public void excluirProduto(){
        produtoDao.excluir(produto.getCodigo());
    }

    @Test
    public void alterarProduto(){
        produto.setValor(2000.00);
        produtoDao.alterar(produto);

        Assert.assertEquals(Optional.of(2000.00), Optional.ofNullable(produto.getValor()));
    }

}
