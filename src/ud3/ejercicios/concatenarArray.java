package ud3.ejercicios;

import java.util.Arrays;

/** @author Juan */
public class concatenarArray {
    public static void main(String[] args) {
        int[] t1 = { 1, 2, 3, 4, 5 };
        int[] t2 = { 6, 7, 8, 9, 10 };

        System.out.println(Arrays.toString(concatenar(t1, t2)));
    }

    static int[] concatenar(int[] t1, int[] t2) {
        int[] tAux = new int[t1.length + t2.length];

        for (int i = 0; i < tAux.length; i++) {
            if (i < t1.length) {
                tAux[i] = t1[i];
            } else if (i >= t1.length) {
                tAux[i] = t2[i - t1.length];
            }

        }
        return tAux;
    }
}
