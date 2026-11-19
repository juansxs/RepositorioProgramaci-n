package ud3.ejercicios;

import java.util.Arrays;

/** @author Juan */
public class InsertarEnPosicion {
    public static void main(String[] args) {
        int[] t = { 1, 2, 3, 4, 5 };
        System.out.println(Arrays.toString(insertarEnPosicionArray(t, 3, -1)));
    }

    static int[] insertarEnPosicionArray(int[] t, int posicion, int numero) {
        if (posicion < 0 || posicion > t.length) {
            throw new IllegalArgumentException("Índice fuera de rango");
        }

        int[] tAux = new int[t.length + 1];

        for (int i = 0; i < posicion; i++) {
            tAux[i] = t[i];
        }
        tAux[posicion] = numero;

        for (int i = posicion; i < t.length; i++) {
            tAux[i + 1] = t[i];
        }

        return tAux;
    }
}
