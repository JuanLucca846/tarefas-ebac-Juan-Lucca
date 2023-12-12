package test.java.br.com.juan;

import main.java.br.com.juan.dao.ClienteDAO;
import main.java.br.com.juan.dao.IClienteDAO;
import main.java.br.com.juan.domain.Cliente;
import main.java.br.com.juan.exceptions.TipoChaveNaoEncontradaException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import test.java.br.com.juan.dao.ClienteDAOMock;

public class ClienteDAOTest {
    private IClienteDAO clienteDAO;

    private Cliente cliente;

    public ClienteDAOTest() {
        clienteDAO = new ClienteDAOMock();
    }

    @Before
    public void init(){
        cliente = new Cliente();
        cliente.setCpf(123123123L);
        cliente.setNome("Juan");
        cliente.setCidade("SP");
        cliente.setEnd("Rua");
        cliente.setEstado("SP");
        cliente.setNumero(10);
        cliente.setTel(12312312L);

    }

    @Test
    public void pesquisarCliente(){
        Cliente clienteConsultado = clienteDAO.consultar(cliente.getCpf());

        Assert.assertNotNull(clienteConsultado);
    }

    @Test
    public void salvarCliente() throws TipoChaveNaoEncontradaException {
        Boolean retorno = clienteDAO.cadastrar(cliente);
        Assert.assertTrue(retorno);
    }

    @Test
    public void excluirCliente() {
        clienteDAO.excluir(cliente.getCpf());
    }

    @Test
    public void alterarCliente() throws TipoChaveNaoEncontradaException {
        cliente.setNome("Lucca");
        clienteDAO.alterar(cliente);

        Assert.assertEquals("Lucca", cliente.getNome());
    }
}
