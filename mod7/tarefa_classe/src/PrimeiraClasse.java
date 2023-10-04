/**
 * @author juan.lucca
 */
public class PrimeiraClasse {
    public static void main(String[] args) {
        Celular celular = new Celular();
        celular.setNumero(12345678);
        celular.setCapacidade(128);
        celular.setMarca("iPhone");
        celular.setModelo("14");

        System.out.println(celular.getNumero());
        System.out.println(celular.getCapacidade());
        System.out.println(celular.getMarca());
        System.out.println(celular.getModelo());
    }
}
