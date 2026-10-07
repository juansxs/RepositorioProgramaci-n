package ud2;

import java.util.Scanner;

/** @author Juan **/
public class FechaCorrecta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el día, mes y año para saber si es correcto: ");
        int dia = sc.nextInt();
        int mes = sc.nextInt();
        int anho = sc.nextInt();
        sc.close();

        if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && dia > 31) {
            System.out.println("Este mes no tiene más de 31 días, introduce una fecha correcta.");

        } else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30) {
            System.out.println("Este mes no tiene más de 30 días, introduce una fecha correcta.");

        } else if (mes == 2 && dia > 28) {
            System.out.println("Febrero no tiene más de 28 días, introduce una fecha correcta.");

        } else if (dia < 0) {
            System.out.println("No hay días negativos, introduce una fecha válida");

        } else if (mes < 0 || mes > 12) {
            System.out.println("No hay meses negativos o mayores a 12, introduce una fecha válida.");

        } else if (anho < 0) {
            anho = anho * -1;
            System.out.println("El día " + dia + " del mes " + mes + " del año " + anho + "a.C. es una fecha válida y real.");

        } else {
            System.out.println("El día " + dia + " del mes " + mes + " del año " + anho + "d.C. es una fecha válida y real.");
            
        }

    }

}
