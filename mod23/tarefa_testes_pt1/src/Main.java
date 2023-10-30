import java.util.List;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        List<Person> listPersons = new Person().Persons();
        List<Person> listAllPersonsNames = listPersons.stream()
                .filter(p -> p.getIdentification().equals("Pessoa"))
                .collect(Collectors.toList());

        listAllPersonsNames.forEach(person -> System.out.println(person.getNome()));

        System.out.println("*********");

        List<Person> listAllWomenNames = listPersons.stream()
                .filter(w -> w.getSexo().equals("F"))
                .collect(Collectors.toList());

        listAllWomenNames.forEach(women -> System.out.println(women.getNome()));
    }
}