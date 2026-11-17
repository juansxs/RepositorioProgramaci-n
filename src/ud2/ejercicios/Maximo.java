package ud2.ejercicios;

import java.util.Scanner;

/** @author Juan **/
public class Maximo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce 2 números para saber cuál es el mayor: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        sc.close();
        int resultado = maximo(num1, num2);
        System.out.println(resultado);
    }
    public static int maximo(int num1, int num2) {
        if (num1 >= num2) {
            return num1;
        } else {
            return num2;
        }
    }
}