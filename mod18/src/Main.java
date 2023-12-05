import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {

        try{
            Field field = TabelaNome.class.getDeclaredField("nome");
            if(field.isAnnotationPresent(Tabela.class)){
                Tabela tabela = field.getAnnotation(Tabela.class);
                String value = tabela.value();
                System.out.println("Campo anotado com a anotação Tabela " + value);
            } else {
                System.out.println("Campo não anotado com anotação Tabela");
            }
        } catch (NoSuchFieldException e) {
            System.out.println("Campo não encontrado: " + e.getMessage());
        }
    }
}