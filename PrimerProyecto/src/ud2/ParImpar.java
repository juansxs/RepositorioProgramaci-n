package ud2;

import java.util.Scanner;

/** @author Juan **/
public class ParImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número para averiguar si es par o impar: ");
        int num = sc.nextInt();
        sc.close();
        
        if (num % 2 == 0) {
            System.out.print("El número es par!");
        } else {
            System.out.print("El número es impar!");
        }

    }

}
