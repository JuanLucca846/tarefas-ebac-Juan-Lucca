import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valorPrimitivo = scanner.nextInt();
        Integer valorWrapper = Integer.valueOf(valorPrimitivo);

        System.out.println("**Valor Primitivo**");
        System.out.println(valorPrimitivo);

        System.out.println("**Valor Wrapper**");
        System.out.println(valorWrapper);
    }
}