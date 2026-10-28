package ud2.ejerciciosExamen;
import java.util.Scanner;

public class MinutosTranscurridos {

    /**
     * Calcula los minutos transcurridos entre dos instantes A y B del mismo día.
     * Devuelve siempre un valor positivo o cero (da igual cuál instante sea el mayor).
     * Si algún dato de entrada no es correcto (horas 0-23, minutos 0-59), devuelve -1.
     */
    static int minutosTranscurridos(int horaA, int minutoA, int horaB, int minutoB) {

        // 1. Validamos los datos de entrada
        if (horaA < 0 || horaA > 23 || horaB < 0 || horaB > 23
                || minutoA < 0 || minutoA > 59 || minutoB < 0 || minutoB > 59) {
            return -1;
        }

        // 2. Convertimos cada instante a "minutos totales" desde las 00:00
        int totalA = horaA * 60 + minutoA;
        int totalB = horaB * 60 + minutoB;

        // 3. Restamos siempre el mayor menos el menor, para que el resultado nunca sea negativo
        if (totalA >= totalB) {
            return totalA - totalB;
        } else {
            return totalB - totalA;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedimos los datos del instante A
        System.out.println("INSTANTE A");
        System.out.print("  Hora (0-23): ");
        int horaA = sc.nextInt();
        System.out.print("  Minuto (0-59): ");
        int minutoA = sc.nextInt();

        // Pedimos los datos del instante B
        System.out.println("INSTANTE B");
        System.out.print("  Hora (0-23): ");
        int horaB = sc.nextInt();
        System.out.print("  Minuto (0-59): ");
        int minutoB = sc.nextInt();

        // Llamamos a la función y guardamos el resultado
        int resultado = minutosTranscurridos(horaA, minutoA, horaB, minutoB);

        // Mostramos el resultado (o el error)
        if (resultado == -1) {
            System.out.println("ERROR: la hora debe estar entre 0 y 23 y los minutos entre 0 y 59.");
        } else {
            System.out.println("Minutos transcurridos: " + resultado);
        }

        sc.close();
    }
}
