package br.com.juan.vendas.online;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@RefreshScope
public class ClienteServiceAlunosApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClienteServiceAlunosApplication.class, args);
	}

}
