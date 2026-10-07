package ud2;

import java.util.Scanner;

/** @author Juan **/
public class UnDiaMas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una fecha en el siguiente formato (día, mes, año) para incrementarla en un día: ");
        int dia = sc.nextInt();
        int mes = sc.nextInt();
        int anho = sc.nextInt();
        sc.close();

        if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && dia > 31) {
            System.out.print("Este mes no tiene más de 31 días, introduce una fecha correcta.");

        } else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30) {
            System.out.print("Este mes no tiene más de 30 días, introduce una fecha correcta.");

        } else if (mes == 2 && dia > 28) {
            System.out.print("Febrero no tiene más de 28 días, introduce una fecha correcta.");

        } else if (dia < 0) {
            System.out.print("No hay días negativos, introduce una fecha válida");

        }

        dia++;

        if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10) && dia == 31) {
            dia = 0;
            mes++;
        }

        if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia == 30) {
            dia = 0;
            mes++;
        }

        if (mes == 2 && dia == 28) {
            dia = 0;
            mes++;
        }

        if ((mes == 12) && dia == 31) {
            dia = 0;
            mes = 1;
            anho++;
        }
        System.out.printf("Fecha incrementada: %02d/%02d/%04d \n", dia, mes, anho);







    }

}
