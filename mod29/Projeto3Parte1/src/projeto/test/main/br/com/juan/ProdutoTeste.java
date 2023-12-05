package projeto.test.main.br.com.juan;

import org.junit.Test;

import projeto.main.br.com.juan.dao.ClienteDAO;
import projeto.main.br.com.juan.dao.IClienteDAO;
import projeto.main.br.com.juan.dao.IProdutoDAO;
import projeto.main.br.com.juan.dao.ProdutoDAO;

import projeto.main.br.com.juan.domain.Cliente;
import projeto.main.br.com.juan.domain.Produto;

import java.util.List;

import static org.junit.Assert.*;

public class ProdutoTeste {
    @Test
    public void cadastrarProdutoTeste() throws Exception {
        IProdutoDAO dao = new ProdutoDAO();

        Produto produto = new Produto();
        produto.setCodigo("01");
        produto.setNome("Carro");
        produto.setCor("Vermelho");
        produto.setQuantidade(1);
        produto.setValor(50000.00);

        Integer qtd = dao.cadastrar(produto);
        assertTrue(qtd == 1);

        Produto produto1 = dao.consultar(produto.getCodigo());
        assertNotNull(produto1);
        assertEquals(produto.getCodigo(), produto1.getCodigo());
        assertEquals(produto.getNome(), produto1.getNome());
        assertEquals(produto.getCor(), produto1.getCor());
        assertEquals(produto.getQuantidade(), produto1.getQuantidade());
        assertEquals(produto.getValor(), produto1.getValor());

        Integer qtdDel = dao.excluir(produto1);
        assertNotNull(qtdDel);
    }

    @Test
    public void buscarTodosProdutosTeste() throws Exception {
        IProdutoDAO dao = new ProdutoDAO();

        Produto produto1 = new Produto();
        produto1.setCodigo("01");
        produto1.setNome("Carro");
        produto1.setCor("Vermelho");
        produto1.setQuantidade(1);
        produto1.setValor(50000.00);
        Produto produto2 = new Produto();
        produto2.setCodigo("02");
        produto2.setNome("Moto");
        produto2.setCor("Vermelho");
        produto2.setQuantidade(1);
        produto2.setValor(20000.00);

        Integer qtd1 = dao.cadastrar(produto1);
        Integer qtd2 = dao.cadastrar(produto2);
        assertTrue(qtd1 == 1);
        assertTrue(qtd2 == 1);

        List<Produto> produtosDB = dao.buscarTodos();
        assertNotNull(produtosDB);
        assertFalse(produtosDB.isEmpty());

        for (Produto produto : produtosDB) {
            Integer qtdDel = dao.excluir(produto);
            assertNotNull(qtdDel);
            assertTrue(qtdDel == 1);
        }


        assertTrue(dao.buscarTodos().isEmpty());

    }


    @Test
    public void atualizarTeste() throws Exception {
        IProdutoDAO dao = new ProdutoDAO();

        Produto produto1 = new Produto();
        produto1.setCodigo("01");
        produto1.setNome("Carro");
        produto1.setCor("Vermelho");
        produto1.setQuantidade(1);
        produto1.setValor(50000.00);

        Integer qtd = dao.cadastrar(produto1);
        assertTrue(qtd == 1);

        produto1.setNome("Moto");
        produto1.setCor("Azul");

        Integer qtdAtualizar = dao.atualizar(produto1);
        assertNotNull(qtdAtualizar);

        Produto produtoDB = dao.consultar(produto1.getCodigo());
        assertNotNull(produtoDB);
        assertEquals("Moto", produtoDB.getNome());
        assertEquals("Azul", produtoDB.getCor());

        Integer qtdDel = dao.excluir(produtoDB);
        assertNotNull(qtdDel);
    }
}
