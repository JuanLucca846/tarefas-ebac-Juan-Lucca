package br.com.juan.SpringBootTarefaEbac;

import br.com.juan.SpringBootTarefaEbac.domain.Cliente;
import br.com.juan.SpringBootTarefaEbac.domain.Produto;
import br.com.juan.SpringBootTarefaEbac.repository.IProdutoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import br.com.juan.SpringBootTarefaEbac.repository.IClienteRepository;



@SpringBootApplication
@Configuration
@EnableJpaRepositories(basePackages = "br.com.juan.SpringBootTarefaEbac.repository")
@EntityScan("br.com.juan")
@ComponentScan(basePackages = "br.com.juan")
public class SpringBootTarefaEbacApplication implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(SpringBootTarefaEbacApplication.class);

	@Autowired
	private IClienteRepository clienteRepository;

	@Autowired
	private IProdutoRepository produtoRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootTarefaEbacApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("StartApplication...");

		Cliente cliente = createCliente();
		clienteRepository.save(cliente);

		Produto produto = createProduto();
		produtoRepository.save(produto);
	}

	private Cliente createCliente() {
		return Cliente.builder()
				.cidade("SP")
				.cpf(123456789L)
				.email("testando@ebac.com")
				.end("rua teste")
				.estado("SP")
				.nome("Desafio Spring Boot")
				.numero(123)
				.tel(912345678L)
				.build();
	}

	private Produto createProduto(){
		return Produto.builder()
				.nome("Produto1")
				.valor(10.0)
				.qtd(5)
				.build();
	}

}
