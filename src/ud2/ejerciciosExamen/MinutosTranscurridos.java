package ud2.ejerciciosExamen;
import java.util.Scanner;

public class MinutosTranscurridos {


    static int minutosTranscurridos(int horaA, int minutoA, int horaB, int minutoB) {


        if (horaA < 0 || horaA > 23 || horaB < 0 || horaB > 23
                || minutoA < 0 || minutoA > 59 || minutoB < 0 || minutoB > 59) {
            return -1;
        }


        int totalA = horaA * 60 + minutoA;
        int totalB = horaB * 60 + minutoB;

        if (totalA >= totalB) {
            return totalA - totalB;
        } else {
            return totalB - totalA;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("INSTANTE A");
        System.out.print("  Hora (0-23): ");
        int horaA = sc.nextInt();
        System.out.print("  Minuto (0-59): ");
        int minutoA = sc.nextInt();


        System.out.println("INSTANTE B");
        System.out.print("  Hora (0-23): ");
        int horaB = sc.nextInt();
        System.out.print("  Minuto (0-59): ");
        int minutoB = sc.nextInt();


        int resultado = minutosTranscurridos(horaA, minutoA, horaB, minutoB);


        if (resultado == -1) {
            System.out.println("ERROR: la hora debe estar entre 0 y 23 y los minutos entre 0 y 59.");
        } else {
            System.out.println("Minutos transcurridos: " + resultado);
        }

        sc.close();
    }
}
