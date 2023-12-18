package test.java.br.com.juan;

import main.java.br.com.juan.dao.IProdutoDao;
import main.java.br.com.juan.dao.ProdutoDao;
import main.java.br.com.juan.domain.Produto;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class ProdutoTest {

    private IProdutoDao produtoDao;

    public ProdutoTest(){
        produtoDao = new ProdutoDao();
    }

    @Test
    public void cadastrar() {
        Produto produto = new Produto();
        produto.setCodigo("Produto1");
        produto.setNome("Cadeiras");
        produto.setDescricao("Jogo de cadeiras");
        produto.setCor("Branco");
        produtoDao.cadastrar(produto);

        assertNotNull(produto);
    }
}
