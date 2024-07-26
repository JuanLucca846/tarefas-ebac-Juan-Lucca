package ListaEncadeada;

class Node {
    Node proximo;
    int chave;

    public Node(int chave) {
        this.chave = chave;
    }
}

public class ListaEncadeada {
    private Node primeiro;
    private int tamanho;

    public ListaEncadeada() {
        primeiro = null;
        tamanho = 0;
    }

    public void push(Node node) {
        if (primeiro == null) {
            primeiro = node;
        } else {
            Node atual = primeiro;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = node;
        }
        tamanho++;
    }

    public Node pop() {
        if (primeiro == null) {
            return null;
        }
        if (primeiro.proximo == null) {
            Node node = primeiro;
            primeiro = null;
            tamanho--;
            return node;
        }
        Node atual = primeiro;
        while (atual.proximo.proximo != null) {
            atual = atual.proximo;
        }
        Node node = atual.proximo;
        atual.proximo = null;
        tamanho--;
        return node;
    }

    public void insert(int index, Node node) {
        if (index < 0 || index > tamanho) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Tamanho: " + tamanho);
        }
        if (index == 0) {
            node.proximo = primeiro;
            primeiro = node;
        } else {
            Node atual = primeiro;
            for (int i = 0; i < index - 1; i++) {
                atual = atual.proximo;
            }
            node.proximo = atual.proximo;
            atual.proximo = node;
        }
        tamanho++;
    }

    public void remove(int index) {
        if (index < 0 || index > tamanho) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Tamanho: " + tamanho);
        }
        if (index == 0) {
            primeiro = primeiro.proximo;
        } else {
            Node atual = primeiro;
            for (int i = 0; i < index - 1; i++) {
                atual = atual.proximo;
            }
            atual.proximo = atual.proximo.proximo;
        }
        tamanho--;
    }

    public Node elementAt(int index) {
        if (index < 0 || index > tamanho) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Tamanho: " + tamanho);
        }
        Node atual = primeiro;
        for (int i = 0; i < index; i++) {
            atual = atual.proximo;
        }
        return atual;
    }

    public int size() {
        return tamanho;
    }

    public void printList() {
        Node atual = primeiro;
        while (atual != null) {
            System.out.print(atual.chave + " ");
            atual = atual.proximo;
        }
    }

}
