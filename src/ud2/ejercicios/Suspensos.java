package ud2.ejercicios;

import java.util.Scanner;

/** @author Juan **/
public class Suspensos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce tus calificaciones para detectar los suspensos (-1 para salir): ");
        int calificacion = sc.nextInt();
        int suspensos = 0;

        while (calificacion != -1) {

            if (calificacion < 5) {
                suspensos++;
            }
            calificacion = sc.nextInt();
        }
        sc.close();
        System.out.print("Entre tus notas hay un total de " + suspensos + " suspensos.");
    }

}
