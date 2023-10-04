
public class Celular {

    private int numero;

    private int capacidade;

    private String marca;

    private String modelo;

    /**
     * Mostra a numero de contato do dono
     *
     * @return
     */
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * Mostra a capacidade de memoria do celular
     *
     * @return
     */
    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    /**
     * Mostra a marca do celular
     *
     * @return
     */
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Mostra a modelo do celular
     *
     * @return
     */
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}