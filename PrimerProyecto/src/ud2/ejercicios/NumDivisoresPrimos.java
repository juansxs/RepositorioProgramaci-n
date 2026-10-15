package ud2.ejercicios;

import java.util.Scanner;

/** @author Juan **/
public class NumDivisoresPrimos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número para saber sus divisores primos: ");
        int n = sc.nextInt();
        System.out.println("El número " + n + " tiene un total de " + divisoresPrimos(n) + " divisores primos." );
    }
    public static int divisoresPrimos(int n) {
        int contador = 0;
        for (int i = 2; i <= n; i++) {
            int resultado = n % i;
            if (resultado == 0 && Primo.esPrimo(i)) {
                contador++;
            }
        }
        return contador;
    }

}
