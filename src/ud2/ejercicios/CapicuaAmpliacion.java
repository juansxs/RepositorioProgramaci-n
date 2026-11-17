package ud2.ejercicios;

import java.util.Scanner;

/** @author Juan **/
public class CapicuaAmpliacion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Intrduce un número : ");
        long n = sc.nextLong();
        sc.close();
        System.out.println("Es el número capicua --> " + esCapicuaAmpliado(n));

    }

    public static boolean esCapicuaAmpliado(long n) {
        long numeroOriginal = n;
        long numeroDelReves = 0;

        while (n > 0) {
            long ultimoNumero = n % 10; 
            numeroDelReves = (numeroDelReves * 10) + ultimoNumero;
            n /= 10;
        }
        return numeroOriginal == numeroDelReves;
    }  
}
