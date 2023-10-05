import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int contador;
        double media, notaTotal = 0;

        for (contador = 1; contador <= 4; contador++) {
            boolean notaValida = false;
            do {
                System.out.println("Digite a nota " + contador);
                int nota = scanner.nextInt();
                if (nota >= 0 && nota <= 10) {
                    notaTotal += nota;
                    notaValida = true;
                } else {
                    System.out.println("Digite um valor entre 0 a 10!");
                }
            } while (!notaValida);

        }

        media = notaTotal / 4;

        System.out.println("A media e: " + media);
    }
}