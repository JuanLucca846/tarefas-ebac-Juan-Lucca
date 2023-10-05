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
                double nota = scanner.nextDouble();
                if (nota >= 0 && nota <= 10) {
                    notaTotal += nota;
                    notaValida = true;
                } else {
                    System.out.println("Digite um valor entre 0 a 10!");
                }
            } while (!notaValida);

        }

        media = notaTotal / 4;

        if(media < 5){
            System.out.println("A media e: " + media);
            System.out.println("O aluno esta reprovado");
        }else if(media >= 5 && media < 7){
            System.out.println("A media e: " + media);
            System.out.println("O aluno esta de recuperacao");
        }else{
            System.out.println("A media e: " + media);
            System.out.println("O aluno esta aprovado");
        }


    }
}