package ud2;

import java.util.Random;
import java.util.Scanner;

/** @author Juan **/
public class NumeroSecretoV2 {
    public static void main(String[] args) {

        final int NUM_SECRETO = 100;
        Scanner sc = new Scanner(System.in);
        System.out.print("Intenta averiguar el número secreto entre 0 y 100 (-1 para rendirse): ");
        int num = sc.nextInt();
        Random rnd = new Random();
        int numeroSecreto = rnd.nextInt(0, NUM_SECRETO + 1);
        int numIntentos = 0;

        while ((num != numeroSecreto) && (num != -1)) {

            if (num > numeroSecreto) {
                System.out.print("El número secreto es menor que el tuyo.");

            }

            if (num < numeroSecreto) {
                System.out.print("El número secreto es mayor que el tuyo.");
            }

            System.out.print(" Vuelve a introducir un número: ");
            numIntentos++;
            num = sc.nextInt();

        }

        sc.close();
        System.out.println("Fin del juego");

        if (num == numeroSecreto) {
            System.out.println("Has ganado");
            System.out.println("Lo has intentado " + numIntentos + " veces.");
        } else {
            System.out.println("Has perdido");
            System.out.println("El número secreto era el " + numeroSecreto);
        }
    }

}
