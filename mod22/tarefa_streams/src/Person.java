import java.util.List;

public class Person {


    private String nome;

    private String sexo;

    private String identification;

    public Person(String nome, String sexo, String identification) {
        this.nome = nome;
        this.sexo = sexo;
        this.identification = identification;
    }

    public Person() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public List<Person> Persons() {
        Person p1 = new Person("Juan", "M", "Pessoa");
        Person p2 = new Person("Ana", "F", "Pessoa");
        Person p3 = new Person("Amanda", "F", "Pessoa");
        return List.of(p1, p2, p3);
    }
}
