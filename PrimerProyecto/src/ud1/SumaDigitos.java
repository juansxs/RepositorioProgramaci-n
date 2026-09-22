package ud1;

import java.util.Scanner;

/** @author Juan **/
public class SumaDigitos {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe un número de 3 cifras, para calcular la suma de sus cifras: ");

        int numTotal = sc.nextInt();

        int num1 = numTotal % 100; // Con esto aislas los otros 2 números

        int num2 = num1 % 10;

        int num3 = num2 % 0;

        System.out.print("La suma de los números: " + num3);




    }

}
