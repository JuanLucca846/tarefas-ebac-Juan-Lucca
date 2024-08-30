package br.com.juan.vendas.online.VendasServiceAlunos.usecase;

import br.com.juan.vendas.online.VendasServiceAlunos.domain.Venda;
import br.com.juan.vendas.online.VendasServiceAlunos.exception.EntityNotFoundException;
import br.com.juan.vendas.online.VendasServiceAlunos.repository.IVendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


@Service
public class BuscaVenda {

    private IVendaRepository vendaRepository;

    @Autowired
    public BuscaVenda(IVendaRepository produtoRepository) {
        this.vendaRepository = produtoRepository;
    }

    public Page<Venda> buscar(Pageable pageable) {
        return vendaRepository.findAll(pageable);
    }

    public Venda buscarPorCodigo(String codigo) {
        return vendaRepository.findByCodigo(codigo)
                .orElseThrow(() -> new EntityNotFoundException(Venda.class, "codigo", codigo));
    }


}
