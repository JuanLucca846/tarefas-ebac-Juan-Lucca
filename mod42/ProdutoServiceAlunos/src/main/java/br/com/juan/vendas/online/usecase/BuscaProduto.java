package br.com.juan.vendas.online.usecase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import br.com.juan.vendas.online.domain.Produto;
import br.com.juan.vendas.online.domain.Produto.Status;
import br.com.juan.vendas.online.exception.EntityNotFoundException;
import br.com.juan.vendas.online.repository.IProdutoRepository;

@Service
public class BuscaProduto {

    private IProdutoRepository clienteRepository;

    private IProdutoRepository produtoRepository;

    @Autowired
    public BuscaProduto(IProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public Page<Produto> buscar(Pageable pageable) {
        return produtoRepository.findAll(pageable);
    }

    public Page<Produto> buscar(Pageable pageable, Status status) {
        return produtoRepository.findAllByStatus(pageable, status);
    }

    public Produto buscarPorCodigo(String codigo) {
        return produtoRepository.findByCodigo(codigo)
                .orElseThrow(() -> new EntityNotFoundException(Produto.class, "codigo", codigo));
    }

}
