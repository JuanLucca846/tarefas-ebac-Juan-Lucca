import java.util.*;
import java.util.stream.Collectors;

public class ParteDois {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome - sexo, separados por vírgula - EX de entrada (Teste-H, teste2-M)");

        String nomePessoass = scanner.nextLine();
        ArrayList<String> homens = new ArrayList<>();
        ArrayList<String> mulheres = new ArrayList<>();
        String[] splitNome = nomePessoass.split(",");
        String[] splitSexo = nomePessoass.split("-");

        for (String nomeSexo : splitNome) {
            String[] partes = nomeSexo.split("-");
            if (partes.length == 2) {
                String nome = partes[0].trim();
                String sexo = partes[1].trim();
                if ("H".equalsIgnoreCase(sexo)) {
                    homens.add(nome);
                } else if ("M".equalsIgnoreCase(sexo)) {
                    mulheres.add(nome);
                }
            }
        }

        Collections.sort(homens);
        Collections.sort(mulheres);

        System.out.println("**Homens**");
        homens.forEach(System.out::println);
        System.out.println("**Mulheres**");
        mulheres.forEach(System.out::println);
    }
}
