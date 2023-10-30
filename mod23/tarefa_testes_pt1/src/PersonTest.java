import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;

public class PersonTest {
    @Test
    public void testIdentification() {
        List<Person> listPersons = new Person().Persons();
        List<Person> listAllIdentification = listPersons.stream()
                .filter(p -> p.getIdentification().equals("Pessoa"))
                .collect(Collectors.toList());

        for(Person person : listAllIdentification){
            Assert.assertEquals("Pessoa", person.getIdentification());
        }
    }

    @Test
    public void testListAllPersonsName() {
        List<Person> listPersons = new Person().Persons();
        List<Person> listAllPersonsNames = listPersons.stream()
                .filter(p -> p.getIdentification().equals("Pessoa"))
                .collect(Collectors.toList());

        List<String> expectedNames = List.of("Juan", "Ana", "Amanda");

        for(Person person : listAllPersonsNames){
            Assert.assertTrue(expectedNames.contains(person.getNome()));
        }
    }

    @Test
    public void testListAllWomenName(){
        List<Person> listPersons = new Person().Persons();
        List<Person> listAllWomen = listPersons.stream()
                .filter(w -> w.getSexo().equals("F"))
                .collect(Collectors.toList());

        boolean allWomen = listAllWomen.stream().allMatch(w -> w.getSexo().equals("F"));

        Assert.assertTrue(allWomen);
    }
}
