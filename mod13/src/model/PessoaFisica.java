package model;

public class PessoaFisica extends Pessoa {
    public PessoaFisica(String nome) {
        super(nome);
    }

    String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
