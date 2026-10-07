package ud2;

import java.util.Scanner;

/** @author Juan **/
public class Numeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número para saber si es par, si es positivo y su cuadrado: ");
        int num = sc.nextInt();

        while (num != 0) {
            if (num % 2 == 0) {
                System.out.println("El número es par");
            } else {
                System.out.println("El número es impar");
            }

            if (num > 0) {
                System.out.println("El número es positivo");
            } else {
                System.out.println("El número es negativo");
            }

            double cuadrado = Math.pow(num, 2);
            System.out.println("El cuadrado del número es: " + cuadrado);
            num = sc.nextInt();
        }
        sc.close();
        System.out.println("Fin del programa");
    }

}
