package ud3.ejercicios;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**@author Juan */
public class GeneraArrayAleatorio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el tamaño de la lista: ");
        int n = sc.nextInt();
        System.out.println("La lista tenía un tamaño de " + n + " y contiene los siguientes números: " + Arrays.toString(arrayAleatorio(n)));
    }
    public static int[] arrayAleatorio(int n) {
        final int NUMERO_ALEATORIO_MINIMO = -9;
        final int NUMERO_ALEATORIO_MAXIMO= 9;
        Random rnd = new Random();
        int tamaño = n;
        int [] lista = new int[tamaño];
        int numero = 0;

        for (int i = 0; i < lista.length; i++) {
            numero = rnd.nextInt(NUMERO_ALEATORIO_MINIMO, NUMERO_ALEATORIO_MAXIMO + 1);
            lista[i] = numero;
        }
        return lista;
    }

}
