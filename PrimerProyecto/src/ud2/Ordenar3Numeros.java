package ud2;

import java.util.Scanner;

/** @author Juan **/
public class Ordenar3Numeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce 3 números para ordenarlos (mayor a menor) y (menor a mayor): ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        sc.close();

        if (num1 > num2 && num1 > num3 && num2 > num3) {
            System.out.println("El orden de mayor a menor es: " + num1 + ", " + num2 + " y" + num3);
        } else if (num2 > num1 && num2 > num3 && num1 > num3) {
            System.out.println("El orden de mayor a menor es: " + num2 + ", " + num1 + " y" + num3);
        }


    }

}
