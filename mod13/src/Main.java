import model.PessoaFisica;
import model.PessoaJuridica;

public class Main {
    public static void main(String[] args) {
        PessoaFisica pessoaFisica = new PessoaFisica("Juan");
        PessoaJuridica pessoaJuridica = new PessoaJuridica("Lucca");

        pessoaFisica.setCpf("123.321.123-32");
        pessoaJuridica.setCnpj("43.283.776/0001-79");

        System.out.println("O " + pessoaFisica.getNome() + " é pessoa fisica e possui cpf: " + pessoaFisica.getCpf());
        System.out.println("O " + pessoaJuridica.getNome() + " é pessoa juridica e possui cnpj " + pessoaJuridica.getCnpj());

        pessoaFisica.setNome("Lucca");
        pessoaJuridica.setNome("Juan");

        System.out.println("**Invertendo nomes**");
        System.out.println(pessoaFisica.getNome());
        System.out.println(pessoaJuridica.getNome());

        System.out.println("O " + pessoaFisica.getNome() + " é pessoa fisica e possui cpf: " + pessoaFisica.getCpf());
        System.out.println("O " + pessoaJuridica.getNome() + " é pessoa juridica e possui cnpj " + pessoaJuridica.getCnpj());
    }
}