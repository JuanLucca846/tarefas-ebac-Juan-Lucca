package AlgBacktracking;

import java.util.ArrayList;
import java.util.List;

public class Backtracking {

    public static List<List<Integer>> subsets(List<Integer> s, int n) {
        List<List<Integer>> resultado = new ArrayList<>();
        gerarSubets(s, n, 0, new ArrayList<>(), resultado);
        return resultado;
    }

    public static void gerarSubets(List<Integer> s, int n, int index, List<Integer> subsetAtual, List<List<Integer>> resultado) {
        if (subsetAtual.size() == n) {
            resultado.add(new ArrayList<>(subsetAtual));
            return;
        }
        for (int i = index; i < s.size(); i++) {
            subsetAtual.add(s.get(i));
            gerarSubets(s, n, i + 1, subsetAtual, resultado);
            subsetAtual.remove(subsetAtual.size() - 1);
        }
    }

    public static void main(String[] args) {
        List<Integer> S1 = List.of(1, 2, 3);
        int n1 = 2;
        System.out.println("Entrada: S = " + S1 + ", n = " + n1);
        System.out.println("Saida: " + subsets(S1, n1));

        List<Integer> S2 = List.of(1, 2, 3, 4);
        int n2 = 1;
        System.out.println("Entrada: S = " + S2 + ", n = " + n2);
        System.out.println("Saida: " + subsets(S2, n2));
    }
}
