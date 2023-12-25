package test.java.br.com.juan;

import main.java.br.com.juan.dao.*;
import main.java.br.com.juan.domain.Acessorio;
import main.java.br.com.juan.domain.Carro;
import main.java.br.com.juan.domain.Marca;
import org.junit.Test;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

import static org.junit.Assert.assertNotNull;

public class CarroTest {

    private ICarroDao carroDao;
    private IMarcaDao marcaDao;
    private IAcessorioDao acessorioDao;


    public CarroTest(){
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPA");
        carroDao = new CarroDao();
        marcaDao = new MarcaDao();
        acessorioDao = new AcessorioDao();
    }

    @Test
    public void cadastrar() {
        Marca marca = criarMarca("Marca1");
        Carro carro = new Carro();

        carro.setCodigo("Carro1");
        carro.setNome("Ferrari");
        carro.setCor("Vermelho");
        carro.setPlaca("123");
        carro.setMarca(marca);
        carro = carroDao.cadastrar(carro);

        Acessorio acessorio = new Acessorio();
        acessorio.setCodigo("Acessorio1");
        acessorio.setNome("Aerofolio");
        acessorio.setDescricao("Melhora aerodinamica do carro");
        acessorio.setCarro(carro);

        carro.getAcessorio().add(acessorio);

        acessorio = acessorioDao.cadastrar(acessorio);

        assertNotNull(carro);
    }

    private Marca criarMarca(String codigo) {
        Marca marca = new Marca();
        marca.setCodigo(codigo);
        marca.setNome("Ferrari");
        return marcaDao.cadastrar(marca);
    }


}
