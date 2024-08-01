package AlgGuloso;

public class Guloso {
    public static int troco(int valor, int[] moedas, int[] quantidadeMoedas) {
        int numMoedas = 0;

        for (int i = 0; i < quantidadeMoedas.length; i++) {
            quantidadeMoedas[i] = 0;
        }

        for (int i = 0; i < moedas.length; i++) {
            while (valor >= moedas[i]) {
                valor -= moedas[i];
                numMoedas++;
                quantidadeMoedas[i]++;
                System.out.println("Moeda de: " + moedas[i] + " utilizada, valor: " + valor + " restante");
            }
        }

        return numMoedas;
    }

    public static void main(String[] args) {
        int montante = 18;
        int[] moedas = {5, 2, 1};
        int[] quantidadeMoedas = new int[moedas.length];

        int numMoedas = troco(montante, moedas, quantidadeMoedas);
        System.out.println("Moedas usadas: " + numMoedas);

        for (int i = 0; i < moedas.length; i++) {
            System.out.println("Moedas de " + moedas[i] + " utilizadas: " + quantidadeMoedas[i]);
        }
    }
}
