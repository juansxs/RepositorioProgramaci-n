package ud2.ejercicios;

import java.util.Scanner;

/** @author Juan **/
public class Rango {

    public static void mostrarRango() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce 2 números para saber los números que se comprenden entre ellos: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int contador = num1;
        while (contador <= num2) {
            System.out.println(contador);
            contador++;
        }
        sc.close();
    }
    public static void main(String[] args) {

        mostrarRango();

    }

}
