package ud2;

import java.util.Scanner;

/** @author Juan **/
public class Bisiesto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un año para saber si es o no bisiesto: ");
        int anho = sc.nextInt();

        if (anho % 400 == 0 || anho % 4 == 0 && anho % 100 != 0) {
            System.out.println("El año es bisiesto!");
        } else {
            System.out.println("El año no es bisiesto!");
        }

    }

}
