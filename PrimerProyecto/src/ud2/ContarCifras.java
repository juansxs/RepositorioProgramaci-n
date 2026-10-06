package ud2;

import java.util.Scanner;

/** @author Juan **/
public class ContarCifras {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero comprenido entre 0 y 99999: ");
        int numero = sc.nextInt();
        sc.close();

        if (numero > 99999 || numero < 0.){
            System.out.println("¡El número introducido no es válido!");

        } else if (numero / 10 < 1.) {
            System.out.println("¡El número tiene 1 cifras!");
            
        } else if (numero / 10 > 1. && numero / 100 < 1.) {
            System.out.println("¡El número tiene 2 cifras!");

        } else if (numero / 10 > 1. && numero / 100 > 1. && numero / 1000 < 1.) {
            System.out.println("¡El número tiene 3 cifras!");

        } else if (numero / 10 > 1. && numero / 100 > 1. && numero / 1000 > 1. && numero / 10000 < 1.) {
            System.out.println("¡El número tiene 4 cifras!");

        } else if (numero / 10 > 1. && numero / 100 > 1. && numero / 1000 > 1. && numero / 10000 > 1. && numero / 100000 < 1.) {
            System.out.println("¡El número tiene 5 cifras!");
        }

    }

}
