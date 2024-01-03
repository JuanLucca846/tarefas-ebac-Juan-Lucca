package br.com.juan.SpringBootTarefaEbac.repository;


import br.com.juan.SpringBootTarefaEbac.domain.Produto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProdutoRepository extends CrudRepository<Produto, Long> {

}
