package ListaEncadeada;

public class MainListaEncadeada {
    public static void main(String[] args) {

        ListaEncadeada listaEncadeada = new ListaEncadeada();

        System.out.println("Tamanho da lista: " + listaEncadeada.size());

        listaEncadeada.push(new Node(10));
        listaEncadeada.push(new Node(20));
        listaEncadeada.push(new Node(30));

        System.out.println("Novo tamanho da lista: " + listaEncadeada.size());

        listaEncadeada.printList();
        System.out.println();

        Node removedNode = listaEncadeada.pop();
        System.out.println("Node removido: " + removedNode.chave);

        listaEncadeada.printList();
        System.out.println();

        Node newNode = new Node(40);
        listaEncadeada.insert(2, newNode);

        listaEncadeada.printList();
        System.out.println();

        listaEncadeada.remove(0);

        listaEncadeada.printList();
        System.out.println();

        Node newNode1 = new Node(30);
        listaEncadeada.insert(1, newNode1);

        listaEncadeada.printList();
        System.out.println();
    }
}
