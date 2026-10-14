package ud2.ejercicios;

import java.util.Scanner;

/** @author Juan **/
public class Factorial {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Introdue un número para calcular su factorial: ");
        int num = sc.nextInt();
        sc.close();
        long factorial = 1L;
        int numOriginal = num;

        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        
        System.out.print("El resultado del factorial de " + numOriginal + " es " + factorial);
    }   
    

}
