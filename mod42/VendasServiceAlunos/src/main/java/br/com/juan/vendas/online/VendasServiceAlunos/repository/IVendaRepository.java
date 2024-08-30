package br.com.juan.vendas.online.VendasServiceAlunos.repository;

import java.util.Optional;

import br.com.juan.vendas.online.VendasServiceAlunos.domain.Venda;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IVendaRepository extends MongoRepository<Venda, String> {

    Optional<Venda> findByCodigo(String codigo);
}
