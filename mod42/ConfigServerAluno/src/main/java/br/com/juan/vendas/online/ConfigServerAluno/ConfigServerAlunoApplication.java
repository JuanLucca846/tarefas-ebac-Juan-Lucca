package br.com.juan.vendas.online.ConfigServerAluno;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerAlunoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerAlunoApplication.class, args);
	}

}
