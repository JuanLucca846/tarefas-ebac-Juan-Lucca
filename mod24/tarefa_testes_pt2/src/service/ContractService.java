package service;

import dao.IContractDao;

public class ContractService implements IContratoService{

    private IContractDao contractDao;

    public ContractService(IContractDao contractDao) {
        this.contractDao = contractDao;
    }

    public String salvar(){
        contractDao.salvar();
        return "Salvo com sucesso!";
    }

    @Override
    public String buscar() {
        contractDao.buscar();
        return "Busca realizada com sucesso!";
    }

    @Override
    public String atualizar() {
        contractDao.atualizar();
        return "Atualizado com sucesso!";
    }

    @Override
    public String excluir() {
        contractDao.excluir();
        return "Excluido com sucesso!";
    }
}
