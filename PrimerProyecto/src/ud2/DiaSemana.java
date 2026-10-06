package ud2;

import java.util.Scanner;

/** @author Juan **/
public class DiaSemana {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.print("Introduce un número (del 1 al 7) para saber que día de la semana es: ");
        int dia = sc.nextInt();
        sc.close();

        switch (dia) {
            case 1:
                System.out.println("El número 1 corresponde al Lunes");
                break;
            case 2:
                System.out.println("El número 2 corresponde al Martes");
                break;
            case 3:
                System.out.println("El número 3 corresponde al Miércoles");
                break;
            case 4:
                System.out.println("El número 4 corresponde al Jueves");
                break;
            case 5:
                System.out.println("El número 5 corresponde al Viernes");
                break;
            case 6:
                System.out.println("El número 6 corresponde al Sábado");
                break;
            case 7:
                System.out.println("El número 7 corresponde al Domingo");
                break;
            default:
                System.out.println("Error número no válido");
                break;
        }
    }

}
