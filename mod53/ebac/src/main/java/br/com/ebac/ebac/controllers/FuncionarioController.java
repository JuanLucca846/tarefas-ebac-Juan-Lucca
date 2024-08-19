package br.com.ebac.ebac.controllers;

import br.com.ebac.ebac.entidades.Funcionario;
import br.com.ebac.ebac.repositorios.FuncionarioRepository;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.time.LocalDate;

import java.util.List;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {

    private FuncionarioRepository funcionarioRepository;

    public FuncionarioController(FuncionarioRepository funcionarioRepository) {
        this.funcionarioRepository = funcionarioRepository;
    }

    @GetMapping
    private List<Funcionario> findAll() {
        return funcionarioRepository.findAll();
    }

    @PostMapping
    private Funcionario create(@RequestBody Funcionario funcionario) {
        return funcionarioRepository.save(funcionario);
    }

    //Ex: http://localhost:8081/funcionarios/resgates?dataInicial=2024-01-01&dataFinal=2024-08-19
    @GetMapping("/resgates")
    private List<Object[]> animaisResgatados(@RequestParam Date dataInicial,
                                             @RequestParam Date dataFinal) {

        return funcionarioRepository.animaisResgatados(dataInicial, dataFinal);
    }

}
