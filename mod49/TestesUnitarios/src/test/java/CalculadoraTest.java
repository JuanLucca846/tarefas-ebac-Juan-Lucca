import org.example.calculadora.Calculadora;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class CalculadoraTest {
    Calculadora calculadora = new Calculadora();

    @Test
    public void adicionarTest() {
        assertEquals(10, calculadora.adicionar(5, 5));
    }

    @Test
    public void subtrairTest() {
        assertEquals(0, calculadora.subtrair(5, 5));
    }

    @Test
    public void multiplicarTest() {
        assertEquals(25, calculadora.multiplicar(5, 5));
    }

    @Test
    public void dividirTest() {
        assertEquals(1, calculadora.dividir(5, 5));
    }

    @Test
    public void dividirPorZeroTest() {
        try {
            calculadora.dividir(5, 0);
            fail("ArithmeticException");
        } catch (ArithmeticException e) {

        }
    }

}
