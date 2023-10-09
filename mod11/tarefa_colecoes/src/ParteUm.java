import java.util.*;

public class ParteUm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os nomes separados por virgula - EX de entrada (b,c,d,a)");

        String nomePessoass = scanner.nextLine();
        ArrayList<String> pessoas = new ArrayList<>();
        String[] splitNome = nomePessoass.split(",");

        pessoas.addAll(List.of(splitNome));
        Collections.sort(pessoas);

        pessoas.stream().forEach(System.out::println);
    }
}