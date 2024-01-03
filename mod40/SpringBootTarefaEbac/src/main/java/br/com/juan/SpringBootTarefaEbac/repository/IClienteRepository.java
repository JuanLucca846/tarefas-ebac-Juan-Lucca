package br.com.juan.SpringBootTarefaEbac.repository;

import br.com.juan.SpringBootTarefaEbac.domain.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClienteRepository extends CrudRepository<Cliente, Long>{

}
