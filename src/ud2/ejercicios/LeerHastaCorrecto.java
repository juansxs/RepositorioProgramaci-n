package ud2.ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

/** @author Juan */
public class LeerHastaCorrecto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        boolean lecturaCorrecta = false;
        System.out.println("Número introducido: " + num);
        
                do {
            try {
                num = sc.nextInt();
                lecturaCorrecta = true;
            } catch (InputMismatchException e) {
                System.out.println("Entrada no válida. Introduce un número entero.");
                sc.next();
            }
        } while (!lecturaCorrecta);


        
        System.out.println("Introduce un número: ");

        if (sc.hasNextInt()) {
            System.out.println("Es un entero");
            num = sc.nextInt();
        } else {
            System.out.println("No es un entero");
            sc.next();
        }
        
        

    }
}
