package main.java.br.com.juan.services;

import main.java.br.com.juan.domain.Cliente;
import main.java.br.com.juan.domain.Produto;

public interface IProdutoService {
    void cadastrar(Produto produto);

    Produto buscarPorCodigo(Long codigo);

    void excluir(Long codigo);

    void alterar(Produto produto);
}
