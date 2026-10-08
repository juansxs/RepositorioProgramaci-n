package ud2;

import java.util.Scanner;

/** @author Juan **/
public class Eco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número N: ");
        int n = sc.nextInt();
        sc.close();
        int contador = 0;
        while (contador != n) {
            System.out.println("Eco");
            contador++;
        }
    }

}
