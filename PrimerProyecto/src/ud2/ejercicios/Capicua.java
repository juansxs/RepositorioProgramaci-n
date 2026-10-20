package ud2.ejercicios;

import java.util.Scanner;

/** @author Juan **/
public class Capicua {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Intrduce un número entre 0 y 9999: ");
        int n = sc.nextInt();
        System.out.println("Es el número capicua --> " + esCapicua(n));

    }

    public static boolean esCapicua(int n) {
        
        if (n > 9999 || n < 0) {
            System.out.println("Número no válido");
        } else if  ((n % 100) != (n / 100)) {
            return true;
        }
        return false;
    }   
}
