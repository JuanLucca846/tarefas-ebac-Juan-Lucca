package Pilha;

public class Pilha {

    private int[] inteiros;
    private int topo;

    public Pilha() {
        this.inteiros = new int[10];
        topo = -1;
    }

    public int push(int inteiro) {
        return inteiros[++topo] = inteiro;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Pilha vazia");
        }

        System.out.println("Removendo " + top());

        return inteiros[topo--];
    }

    public int top() {
        return inteiros[topo];
    }

    public boolean isEmpty() {
        return topo == -1;
    }

    public int size() {
        return topo + 1;
    }

}
