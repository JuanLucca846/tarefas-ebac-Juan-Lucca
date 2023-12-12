package test.java.br.com.juan;

import main.java.br.com.juan.dao.IClienteDAO;
import main.java.br.com.juan.domain.Cliente;
import main.java.br.com.juan.exceptions.TipoChaveNaoEncontradaException;
import main.java.br.com.juan.services.ClienteService;
import main.java.br.com.juan.services.IClienteService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import test.java.br.com.juan.dao.ClienteDAOMock;

public class ClienteServiceTest {

    private IClienteService clienteService;

    private Cliente cliente;

    public ClienteServiceTest() {
        IClienteDAO dao = new ClienteDAOMock();
        clienteService = new ClienteService(dao);
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
    public void pesquisarCliente() {
        Cliente clienteConsultado = clienteService.buscarPorCPF(cliente.getCpf());
        Assert.assertNotNull(clienteConsultado);
    }

    @Test
    public void salvarCliente() throws TipoChaveNaoEncontradaException {
       Boolean retorno = clienteService.salvar(cliente);
       Assert.assertTrue(retorno);
    }

    @Test
    public void excluirCliente() {
        clienteService.excluir(cliente.getCpf());
    }

    @Test
    public void alterarCliente() throws TipoChaveNaoEncontradaException {
        cliente.setNome("Lucca");
        clienteService.alterar(cliente);

        Assert.assertEquals("Lucca", cliente.getNome());
    }
}
