package Mapa;

public class MainMapaHash {
    public static void main(String[] args) {
        MapaHash mapaHash = new MapaHash();

        mapaHash.put(1, 100);
        mapaHash.put(2, 200);

        System.out.println("Valor chave 1: " + mapaHash.get(1));
        System.out.println("Valor chave 2: " + mapaHash.get(2));

        mapaHash.delete(1);

        System.out.println("Valor chave 1: " + mapaHash.get(1));

        mapaHash.clear();

        System.out.println("Valor chave 2: " + mapaHash.get(2));
    }
}
