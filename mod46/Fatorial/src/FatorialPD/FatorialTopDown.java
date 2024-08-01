package FatorialPD;

public class FatorialTopDown {

    private static int MAX_ELEMENTOS = 100;

    private static final long[] elementosFat = new long[MAX_ELEMENTOS];

    public static long calcularElementosPD(int n) {
        for (int i = 0; i < MAX_ELEMENTOS; i++) {
            elementosFat[i] = -1;
        }

        return fatorial(n);
    }

    public static long fatorial(int n) {
        if (elementosFat[n] == -1) {
            if (n <= 1) {
                elementosFat[n] = n;
            } else {


                elementosFat[n] = n * fatorial(n - 1);
            }
        }

        return elementosFat[n];

    }

    public static void main(String[] args) {

        int n = 7;

        System.out.println("Fatorial: " + calcularElementosPD(n));

    }
}
