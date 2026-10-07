package ud2;

import java.util.Scanner;

/** @author Juan **/
public class UnSegundoMas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una hora en el siguiente formato (horas, minutos, segundos): ");
        int horas = sc.nextInt();
        int minutos = sc.nextInt();
        int segundos = sc.nextInt();
        sc.close();

        if (horas > 23 || horas < 0) {
            System.out.println("Hora no válida, los días no tienen más de 23 horas o menos de 0.");
        } else if (minutos > 59 || minutos < 0) {
            System.out.println("Minuto no válido");
        } else if (segundos > 59 || segundos < 0) {
            System.out.println("Segundo no válido");
        }

        segundos++;
        
        if (segundos == 60) {
            segundos = 0;
            minutos++;
        }
        if (minutos == 60) {
            minutos = 0;
            horas++;
        }
        if (horas == 24) {
            horas = 0;
        }
        System.out.printf("Hora incrementada: %02d:%02d:%02d \n", horas, minutos, segundos);

    }

}
