package br.com.ebac.ebac.repositorios;

import br.com.ebac.ebac.entidades.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, Integer> {

    @Query("SELECT f.nome, COUNT(a) FROM Funcionario f JOIN f.animais a " +
            "WHERE a.dataEntrada BETWEEN :dataInicial AND :dataFinal " +
            "GROUP BY f.id")
    List<Object[]> animaisResgatados(@Param("dataInicial") Date dataInicial,
                                     @Param("dataFinal") Date dataFinal);
}
