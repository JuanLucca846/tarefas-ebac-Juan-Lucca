import Fila.Fila;
import ListaEncadeada.ListaEncadeada;
import Pilha.Pilha;

public class Main {
    public static void main(String[] args) {

        /*
        *A complexidade assintótica de tempo e espaço dos métodos push e pop da pilha são todos O(1)
        *A complexidade assintótica de tempo e espaço métodos enqueue, dequeue, rear e front da fila são todos O(1)
        *A complexidade assintótica de tempo métodos push, pop, insert, remove e elementAt da lista são todos O(n) porque possuem laços de repetições como while e for, e a de espaço são todas O(1)
        */


        Pilha pilha = new Pilha();

        System.out.println("Pilha vazia: " + pilha.isEmpty());

        pilha.push(1);
        pilha.push(2);
        pilha.push(3);
        pilha.push(5);
        pilha.push(6);

        System.out.println("Topo da pilha: " + pilha.top());
        System.out.println("Tamanho da pilha: " + pilha.size());

        pilha.pop();
        System.out.println("Tamanho da pilha após o pop(): " + pilha.size());

        int topInteiro = pilha.top();
        System.out.println("novo topo: " + topInteiro);

        System.out.println("-------------------------------------------------");

        Fila fila = new Fila();

        System.out.println("Fila vazia: " + fila.isEmpty());

        fila.enqueue(2);
        fila.enqueue(3);
        fila.enqueue(5);
        fila.enqueue(7);

        System.out.println("Inicio da fila: " + fila.front());
        System.out.println("Final da fila: " + fila.rear());
        System.out.println("Tamanho da fila: " + fila.size());

        fila.dequeue();

        System.out.println("Novo inicio da fila: " + fila.front());
        System.out.println("Novo tamanho da fila: " + fila.size());


    }
}
