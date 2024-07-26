package Mapa;

import java.security.KeyStore;

class Entrada {
    int chave;
    int valor;
    Entrada proximo;

    public Entrada(int chave, int valor) {
        this.chave = chave;
        this.valor = valor;
        proximo = null;
    }
}

public class MapaHash {
    private int tamanho = 10;
    private Entrada[] tabela;

    public MapaHash() {
        tabela = new Entrada[tamanho];
    }

    public int hash(int chave) {
        return chave % tamanho;
    }

    public void put(int chave, int valor) {
        int indice = hash(chave);
        Entrada entrada = tabela[indice];

        if (entrada == null) {
            tabela[indice] = new Entrada(chave, valor);
            return;
        }

        Entrada anterior = null;
        while (entrada != null) {
            if (entrada.chave == chave) {
                entrada.valor = valor;
                return;
            }
            anterior = entrada;
            entrada = entrada.proximo;
        }

        anterior.proximo = new Entrada(chave, valor);
    }

    public void delete(int chave) {
        int indice = hash(chave);
        Entrada entrada = tabela[indice];
        Entrada anterior = null;

        while (entrada != null) {
            if (entrada.chave == chave) {
                if (anterior == null) {
                    tabela[indice] = entrada.proximo;
                } else {
                    anterior.proximo = entrada.proximo;
                }
                return;
            }
            anterior = entrada;
            entrada = entrada.proximo;
        }
    }

    public Object get(int chave) {
        int indice = hash(chave);
        Entrada entrada = tabela[indice];

        while (entrada != null) {
            if (entrada.chave == chave) {
                return entrada.valor;
            }
            entrada = entrada.proximo;
        }

        return null;
    }

    public void clear() {
        for (int i = 0; i < tabela.length; i++) {
            tabela[i] = null;
        }
    }

}
