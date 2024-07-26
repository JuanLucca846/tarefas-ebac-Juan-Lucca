package Fila;

public class Fila {

    private int[] inteiros;
    private int inicio;
    private int fim;

    public Fila() {
        inteiros = new int[10];
        inicio = 0;
        fim = -1;
    }

    public int enqueue(int inteiro) {
        fim = (fim + 1) % inteiros.length;
        return inteiros[fim] = inteiro;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Fila vazia");
        }

        int inteiroRemovido = inteiros[inicio];
        inicio = (inicio + 1) % inteiros.length;
        return inteiroRemovido;
    }

    public int rear() {
        return inteiros[fim];
    }

    public int front() {
        return inteiros[inicio];
    }

    public int size() {
        if (inicio <= fim) {
            return fim - inicio + 1;
        } else {
            return inteiros.length - inicio + fim + 1;
        }
    }

    public boolean isEmpty() {
        return inicio == fim + 1;
    }
}
