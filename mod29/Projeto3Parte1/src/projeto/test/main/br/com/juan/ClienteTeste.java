package projeto.test.main.br.com.juan;

import org.junit.Test;
import projeto.main.br.com.juan.dao.ClienteDAO;
import projeto.main.br.com.juan.dao.IClienteDAO;
import projeto.main.br.com.juan.domain.Cliente;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ClienteTeste {

    @Test
    public void cadastrarTeste() throws Exception {
        IClienteDAO dao = new ClienteDAO();

        Cliente cliente = new Cliente();
        cliente.setCodigo("01");
        cliente.setNome("Juan");

        Integer qtd = dao.cadastrar(cliente);
        assertTrue(qtd == 1);

        Cliente clienteBD = dao.consultar(cliente.getCodigo());
        assertNotNull(clienteBD);
        assertEquals(cliente.getCodigo(), clienteBD.getCodigo());
        assertEquals(cliente.getNome(), clienteBD.getNome());

        Integer qtdDel = dao.excluir(clienteBD);
        assertNotNull(qtdDel);
    }


    @Test
    public void buscarTodosTeste() throws Exception {
        IClienteDAO dao = new ClienteDAO();

        Cliente cliente1 = new Cliente();
        cliente1.setCodigo("01");
        cliente1.setNome("Juan");
        Cliente cliente2 = new Cliente();
        cliente2.setCodigo("02");
        cliente2.setNome("Lucca");

        Integer qtd1 = dao.cadastrar(cliente1);
        Integer qtd2 = dao.cadastrar(cliente2);
        assertTrue(qtd1 == 1);
        assertTrue(qtd2 == 1);

        List<Cliente> clientesDB = dao.buscarTodos();
        assertNotNull(clientesDB);
        assertFalse(clientesDB.isEmpty());

        for (Cliente cliente : clientesDB) {
            Integer qtdDel = dao.excluir(cliente);
            assertNotNull(qtdDel);
            assertTrue(qtdDel == 1);
        }


        assertTrue(dao.buscarTodos().isEmpty());

    }


    @Test
    public void atualizarTeste() throws Exception {
        IClienteDAO dao = new ClienteDAO();

        Cliente cliente = new Cliente();
        cliente.setCodigo("01");
        cliente.setNome("Juan");

        Integer qtd = dao.cadastrar(cliente);
        assertTrue(qtd == 1);

        cliente.setNome("Lucca");

        Integer qtdAtualizar = dao.atualizar(cliente);
        assertNotNull(qtdAtualizar);

        Cliente clienteDB = dao.consultar(cliente.getCodigo());
        assertNotNull(clienteDB);
        assertEquals("Lucca", clienteDB.getNome());

        Integer qtdDel = dao.excluir(clienteDB);
        assertNotNull(qtdDel);
    }
}
