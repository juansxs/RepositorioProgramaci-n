package ud3.programacionParejas;

import java.util.Arrays;

/** @author Juan, Adán */
public class ProgramacionEnParejas18Noviembre {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6, 7};
        System.out.println(buscar(array, 1));
        System.out.println(Arrays.toString(eliminarPorPosicion((array), 4)));

    }

    public static int buscar(int[] t, int clave) {
        for (int i = 0; i < t.length; i++) {
            if (clave == t[i]) {
                return i;
            }
        }
        return -1;
    }

    static int[] eliminarPorPosicion(int[] t, int pos) {

        int[] tAux = new int[t.length - 1];

        if (pos < 0 || pos > t.length) {
            return t;
        } else {

            for (int i = 0; i < pos; i++) {
                tAux[i] = t[i];
            }
            for (int i = pos; i < t.length - 1; i++) {
                tAux[i] = t[i + 1];
            }

        }
        return tAux;
    }

}
