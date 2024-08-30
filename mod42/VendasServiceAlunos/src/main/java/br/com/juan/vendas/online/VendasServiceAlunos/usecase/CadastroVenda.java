package br.com.juan.vendas.online.VendasServiceAlunos.usecase;


import java.math.BigDecimal;
import java.util.HashSet;

import br.com.juan.vendas.online.VendasServiceAlunos.domain.Venda.Status;
import br.com.juan.vendas.online.VendasServiceAlunos.domain.Produto;
import br.com.juan.vendas.online.VendasServiceAlunos.domain.Venda;
import br.com.juan.vendas.online.VendasServiceAlunos.dto.VendaDTO;
import br.com.juan.vendas.online.VendasServiceAlunos.exception.EntityNotFoundException;
import br.com.juan.vendas.online.VendasServiceAlunos.repository.IVendaRepository;
import br.com.juan.vendas.online.VendasServiceAlunos.service.ClienteService;
import br.com.juan.vendas.online.VendasServiceAlunos.service.IProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import jakarta.validation.Valid;

@Service
public class CadastroVenda {

    private IVendaRepository vendaRepository;

    private IProdutoService produtoService;

    private ClienteService clienteService;

    @Autowired
    public CadastroVenda(IVendaRepository produtoRepository,
                         IProdutoService produtoService,
                         ClienteService clienteService) {
        this.vendaRepository = produtoRepository;
        this.produtoService = produtoService;
        this.clienteService = clienteService;
    }

    public Venda cadastrar(@Valid VendaDTO vendaDTO) {
        Venda venda = convertToDomain(vendaDTO, Status.INICIADA);
        validarCliente(venda.getClienteId());
        venda.recalcularValorTotalVenda();
        return this.vendaRepository.insert(venda);
    }

    private void validarCliente(String clienteId) {
        Boolean isCadastrado =
                this.clienteService.isClienteCadastrado(clienteId);
        if (!isCadastrado) {
            new EntityNotFoundException(Venda.class, "clienteId", clienteId);
        }
    }

    private Venda convertToDomain(@Valid VendaDTO vendaDTO, Status status) {
        return Venda.builder()
                .clienteId(vendaDTO.getClienteId())
                .codigo(vendaDTO.getCodigo())
                .dataVenda(vendaDTO.getDataVenda())
                .status(status)
                .valorTotal(BigDecimal.ZERO)
                .produtos(new HashSet<>())
                .build();
    }

    public Venda atualizar(@Valid Venda venda) {
        return this.vendaRepository.save(venda);
    }

    public Venda finalizar(String id) {
        Venda venda = buscarVenda(id);
        venda.validarStatus();
        venda.setStatus(Status.CONCLUIDA);
        return this.vendaRepository.save(venda);
    }

    public Venda cancelar(String id) {
        Venda venda = buscarVenda(id);
        venda.validarStatus();
        venda.setStatus(Status.CANCELADA);
        return this.vendaRepository.save(venda);
    }

    public Venda adicionarProduto(String id, String codigoProduto, Integer quantidade) {
        Venda venda = buscarVenda(id);
        Produto produto = buscarProduto(codigoProduto);
        venda.validarStatus();
        venda.adicionarProduto(produto, quantidade);
        return this.vendaRepository.save(venda);
    }

    public Venda removerProduto(String id, String codigoProduto, Integer quantidade) {
        Venda venda = buscarVenda(id);
        Produto produto = buscarProduto(codigoProduto);
        venda.validarStatus();
        venda.removerProduto(produto, quantidade);
        return this.vendaRepository.save(venda);
    }

    private Venda buscarVenda(String id) {
        return vendaRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException(Venda.class, "id", id));

    }

    private Produto buscarProduto(String codigoProduto) {
        Produto prod = produtoService.buscarProduto(codigoProduto);
        if (prod == null) {
            throw new EntityNotFoundException(Produto.class, "codigo", codigoProduto);
        }
        return prod;
    }

}
