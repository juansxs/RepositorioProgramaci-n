package ud2.ejercicios;

import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;

/** @author Juan **/
public class JuegoCuantoTiempo {
    public static void main(String[] args) {
        final int MINIMO_SEGUNDOS = 5;
        final int MAXIMO_SEGUNDOS = 30;

        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int segundosAleatorios = rnd.nextInt(MINIMO_SEGUNDOS, MAXIMO_SEGUNDOS + 1);

        System.out.println("Pulsa Enter cuando hayan trasncurrido " + segundosAleatorios + " segundos.");
        LocalTime primerTiempo = LocalTime.now();
        sc.nextLine();
        sc.close();
        LocalTime segundoTiempo = LocalTime.now();

        if (segundosTranscurridos(primerTiempo, segundoTiempo) == segundosAleatorios) {
            System.out.println("Has acertado los segundos!");

        } else if (segundosTranscurridos(primerTiempo, segundoTiempo) < segundosAleatorios) {
            int segundosFaltaron = segundosAleatorios - segundosTranscurridos(primerTiempo, segundoTiempo);
            System.out.println("Fallaste. Has pulsado Enter " + segundosFaltaron + " segundos antes de lo necesario");

        } else if (segundosTranscurridos(primerTiempo, segundoTiempo) > segundosAleatorios) {
            int segundosSobraron = segundosTranscurridos(primerTiempo, segundoTiempo) - segundosAleatorios;
            System.out.println("Fallaste. Has pulsado Enter " + segundosSobraron + " segundos después de lo necesario");
        }
    }

    public static int segundosTranscurridos(LocalTime primerTiempo, LocalTime segundoTiempo) {
        int segundosIniciales = primerTiempo.getSecond();
        int minutosIniciales = primerTiempo.getMinute();
        int horasInicales = primerTiempo.getHour();

        int segundosFinales = segundoTiempo.getSecond();
        int minutosFinales = segundoTiempo.getMinute();
        int horasFinales = segundoTiempo.getHour();

        int tiempoTotal = (segundosFinales + (minutosFinales * 60) + (horasFinales * 3600))
                - (segundosIniciales + (minutosIniciales * 60) + (horasInicales * 3600));
        return tiempoTotal;
    }
}
