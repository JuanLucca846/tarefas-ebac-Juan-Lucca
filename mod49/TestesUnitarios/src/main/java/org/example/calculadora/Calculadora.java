package org.example.calculadora;

/**
 * Classe calculadora realiza operações básicas de adição, subtração, multiplicação e divisão.
 *
 * @author Juan Lucca Santana dos Santos
 * @version 1.0
 */
public class Calculadora {

    /**
     * Método para realizar adição.
     *
     * @param a Primeiro argumento.
     * @param b Segundo argumento.
     * @return int - Soma entre a e b.
     */
    public static int adicionar(int a, int b) {
        return a + b;
    }

    /**
     * Método para realizar subtração.
     *
     * @param a Primeiro argumento.
     * @param b Segundo argumento.
     * @return int - Diferença entre a e b.
     */
    public static int subtrair(int a, int b) {
        return a - b;
    }

    /**
     * Método para realizar multiplicação.
     *
     * @param a Primeiro argumento.
     * @param b Segundo argumento.
     * @return int - Produto entre a e b.
     */
    public static int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Método para realizar divisão.
     *
     * @param a Primeiro argumento.
     * @param b Segundo argumento.
     * @return int - Quociente da divisão entre a e b.
     * @throws ArithmeticException Se b for 0, uma exceção de divisão por zero será lançada.
     */
    public static int dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return a / b;
    }


    public static void main(String[] args) {
        System.out.println(adicionar(5, 5));
        System.out.println(subtrair(5, 5));
        System.out.println(multiplicar(5, 5));
        System.out.println(dividir(5, 2));

    }
}
