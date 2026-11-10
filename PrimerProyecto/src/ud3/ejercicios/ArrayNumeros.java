package ud3.ejercicios;

import java.util.Scanner;

/** @author Juan */
public class ArrayNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el tamaño del Array: ");
        int tamaño = sc.nextInt();
        int[] lista = new int[tamaño];
        System.out.print("Ahora introduce " + tamaño + " números para almacenarlos: ");
        int numero = 0;
        int sumaNumerosPositivos = 0;
        int sumaNumerosNegativos = 0;
        int contadorDeCeros = 0;
        int contadorDePositivos = 0;
        int contadorDeNegativos = 0;

        for (int i = 0; i < lista.length; i++) {
            numero = sc.nextInt();
            lista[i] = numero;

            if (numero > 0) {
                sumaNumerosPositivos += numero;
                contadorDePositivos++;
            } else if (numero < 0) {
                sumaNumerosNegativos += numero;
                contadorDeNegativos++;
            } else {
                contadorDeCeros++;
            }
        }
        double mediaPositivos = (double) sumaNumerosPositivos / contadorDePositivos;
        double mediaNegativos = (double) sumaNumerosNegativos / (contadorDeNegativos);

        if (mediaPositivos == 0) {
            System.out.printf(
                    "La media de los negativos es de %.2f, no se han introducido números positivos y se han introducido %d ceros.",
                    mediaNegativos, contadorDeCeros);
        } else if (mediaNegativos == 0) {
            System.out.printf(
                    "La media de los números positivos es de %.2f, no se han introducido números negativos y se han introducido %d ceros.",
                    mediaPositivos, contadorDeCeros);
        } else {
            System.out.printf(
                    "La media de los números positivos es de %.2f la media de los negativos es de %.2f y se han introducido %d ceros.",
                    mediaPositivos, mediaNegativos, contadorDeCeros);

        }

    }

}
