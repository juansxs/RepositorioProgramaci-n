package ud2.ejerciciosHechosEnCasa;

import java.util.Scanner;

/**@author Juan */
public class ClasificaTemperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la temperatura actual: ");
        int temperatura = sc.nextInt();

        if (temperatura < 0) {
            System.out.println("Bajo cero");
        } else if (temperatura > 0 && temperatura < 15) {
            System.out.println("Fresco");
        } else if (temperatura > 15 && temperatura < 25) {
            System.out.println("Templado");
        } else if (temperatura > 25 && temperatura < 35) {
            System.out.println("Caluroso");
        } else if (temperatura > 35) {
            System.out.println("Extremo");
        }
    }

    

}
