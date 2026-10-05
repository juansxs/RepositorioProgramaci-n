package ud2;

import java.util.Scanner;

/** @author Juan **/
public class CasiCero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número para saber si son casi-ceros: ");
        double num = sc.nextDouble();
        sc.close();

        boolean condicion = num >= 1 || num <= -1 || num == 0;

        if (condicion) {
            System.out.println("El número no es un casi-cero!");
        } else {
            System.out.println("El número es un casi-cero!");
        }

    }

}
