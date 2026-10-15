package ud2.ejercicios;

import java.util.Scanner;

/** @author Juan **/
public class Eco {

    public static void mostrarEco() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número N: ");
        int n = sc.nextInt();
        int contador = 0;
        while (contador != n) {
        System.out.println("Eco");
        contador++;
        }

    }
    public static void main(String[] args) {

        mostrarEco();
    }
    
}
