package ud2.ejercicios;

import java.util.Scanner;

/** @author Juan **/
public class Factorial {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Introdue un número para calcular su factorial: ");
        int num = sc.nextInt();
        sc.close();
        int factorial = 1;
        int numOriginal = num;

        while (num > 0) {
            factorial = factorial * num;
            num--;
        }
        
        System.out.print("El resultado del factorial de " + numOriginal + " es " + factorial);
    }   
    

}
