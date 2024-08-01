package FatorialPD;

public class FatorialBottomUp {
    private static int MAX_ELEMENTOS = 100;

    private static final long[] elementosFat = new long[MAX_ELEMENTOS];

    public static long calcularElementosPD(int n) {
        for (int i = 0; i < MAX_ELEMENTOS; i++) {
            elementosFat[i] = 0;
        }

        return fatorial(n);
    }

    public static long fatorial(int n) {
        elementosFat[0] = 1;
        if (n > 0) {
            elementosFat[1] = 1;
        }

        for (int i = 2; i <= n; i++) {
            elementosFat[i] = i * elementosFat[i - 1];
        }

        return elementosFat[n];
    }


    public static void main(String[] args) {

        int n = 7;

        System.out.println("Fatorial: " + calcularElementosPD(n));

    }
}
