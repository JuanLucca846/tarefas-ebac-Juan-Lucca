package model;

public class PessoaJuridica extends Pessoa{
    public PessoaJuridica(String nome) {
        super(nome);
    }

    String cnpj;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
