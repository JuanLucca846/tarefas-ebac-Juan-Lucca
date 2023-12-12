package test.java.br.com.juan;


import main.java.br.com.juan.dao.IProdutoDAO;
import main.java.br.com.juan.domain.Cliente;
import main.java.br.com.juan.domain.Produto;
import main.java.br.com.juan.services.IProdutoService;
import main.java.br.com.juan.services.ProdutoService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import test.java.br.com.juan.dao.ProdutoDAOMock;

import java.util.Optional;

public class ProdutoServiceTest {

    private IProdutoService produtoService;
    private Produto produto;

    public ProdutoServiceTest() {
        IProdutoDAO dao = new ProdutoDAOMock();
        produtoService = new ProdutoService(dao);
    }

    @Before
    public void init() {
        produto = new Produto();
        produto.setCodigo(123L);
        produto.setNome("Relogio");
        produto.setValor(1000.00);
        produto.setQuantidade(1);

        produtoService.cadastrar(produto);
    }

    @Test
    public void pesquisarProduto() {
        Produto produtoConsultado = produtoService.buscarPorCodigo(produto.getCodigo());
        Assert.assertNotNull(produtoConsultado);
    }

    @Test
    public void excluirProduto(){
        produtoService.excluir(produto.getCodigo());
    }

    @Test
    public void alterarProduto(){
        produto.setValor(2000.00);
        produtoService.alterar(produto);

        Assert.assertEquals(Optional.of(2000.00), Optional.ofNullable(produto.getValor()));
    }
}
