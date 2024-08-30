package br.com.juan.vendas.online.VendasServiceAlunos.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = "br.com.juan.vendas.online.VendasServiceAlunos.repository")
public class MongoConfig {

}
