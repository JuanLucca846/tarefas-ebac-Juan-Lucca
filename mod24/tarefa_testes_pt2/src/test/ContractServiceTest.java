package test;

import dao.ContractDao;
import dao.ContractDaoMock;
import dao.IContractDao;
import org.junit.Assert;
import org.junit.Test;
import service.ContractService;

public class ContractServiceTest {

    @Test
    public void salvarTest(){
        IContractDao mockDao = new ContractDaoMock();
        ContractService contract = new ContractService(mockDao);
        String expectedMessage = contract.salvar();
        Assert.assertEquals("Salvo com sucesso!", expectedMessage);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarTest() {
        IContractDao dao = new ContractDao();
        ContractService contract = new ContractService(dao);
        String expectedMessage = contract.salvar();
        Assert.assertEquals("Salvo com sucesso!", expectedMessage);
    }

    @Test
    public void buscarTest(){
        IContractDao mockDao = new ContractDaoMock();
        ContractService contract = new ContractService(mockDao);
        String expectedMessage = contract.buscar();
        Assert.assertEquals("Busca realizada com sucesso!", expectedMessage);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoBuscarTest() {
        IContractDao dao = new ContractDao();
        ContractService contract = new ContractService(dao);
        String expectedMessage = contract.buscar();
        Assert.assertEquals("Busca realizada com sucesso!", expectedMessage);
    }

    @Test
    public void atualizarTest(){
        IContractDao mockDao = new ContractDaoMock();
        ContractService contract = new ContractService(mockDao);
        String expectedMessage = contract.atualizar();
        Assert.assertEquals("Atualizado com sucesso!", expectedMessage);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoAtualizarTest() {
        IContractDao dao = new ContractDao();
        ContractService contract = new ContractService(dao);
        String expectedMessage = contract.atualizar();
        Assert.assertEquals("Atualizado com sucesso!", expectedMessage);
    }

    @Test
    public void excluirTest(){
        IContractDao mockDao = new ContractDaoMock();
        ContractService contract = new ContractService(mockDao);
        String expectedMessage = contract.excluir();
        Assert.assertEquals("Excluido com sucesso!", expectedMessage);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoExcluirTest() {
        IContractDao dao = new ContractDao();
        ContractService contract = new ContractService(dao);
        String expectedMessage = contract.excluir();
        Assert.assertEquals("Excluido com sucesso!", expectedMessage);
    }
}
