package ud2.ejercicios;

import java.util.Scanner;

/** @author Juan **/
public class Primo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número para saber si es primo o no:  ");
        int n = sc.nextInt();
        sc.close();
        System.out.println("El número es primo --> " + esPrimo(n));
    }

    public static boolean esPrimo(int n) {
        for (int i = 2; i < n; i++) {
            int resultado = n % i;
            if (resultado == 0) {
                return false;
            }
        }
        return true;
    }
}
