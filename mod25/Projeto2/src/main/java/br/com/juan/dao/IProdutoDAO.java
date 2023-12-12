package main.java.br.com.juan.dao;

import main.java.br.com.juan.domain.Produto;

public interface IProdutoDAO {

    void cadastrar(Produto produto);

    Produto buscarPorCodigo(Long codigo);

    void alterar(Produto produto);

    void excluir(Long cpf);

}
