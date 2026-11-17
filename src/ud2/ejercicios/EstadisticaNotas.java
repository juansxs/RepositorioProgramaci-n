package ud2.ejercicios;

import java.util.Scanner;

/** @author Juan **/
public class EstadisticaNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce las calificaciones para detectar los suspensos, aprobados y condicionados (-1 para salir): ");
        int calificacion = sc.nextInt();
        int suspensos = 0;
        int condicionados = 0;
        int aprobados = 0;
        while (calificacion != -1) {

            if (calificacion == 4) {
                condicionados++;
            } else if (calificacion < 5) {
                suspensos++;
            } else {
                aprobados++;
            }
            calificacion = sc.nextInt();
        }
        sc.close();
        System.out.print("Entre las notas hay un total de " + aprobados + " alumnos aprobados, " + suspensos + " alumnos suspensos y " + condicionados + " alumnos condicionados.");
    }

}
