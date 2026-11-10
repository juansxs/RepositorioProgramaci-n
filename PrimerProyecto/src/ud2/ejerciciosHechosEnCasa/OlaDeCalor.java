package ud2.ejerciciosHechosEnCasa;

import java.util.Scanner;

/** @author Juan */
public class OlaDeCalor {
    public static void main(String[] args) {
        final int TEMPERATURA_DIA_CALUROSO = 35;
        final int DIAS_OLA_CALOR = 5;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la temperatura de los días (termina con -999): ");
        int temperatura = sc.nextInt();

        int numeroDiasRegistrados = 0;
        int numeroDiasCalor = 0;

        // Racha actual
        int rachaActual = 0;
        int diaInicioRachaActual = 0;

        // Mejor racha encontrada
        int mejorRacha = 0;
        int diaInicioMejorRacha = 0;

        while (temperatura != -999) {
            numeroDiasRegistrados++;
            int diaActual = numeroDiasRegistrados; // día 1, 2, 3...

            if (temperatura >= TEMPERATURA_DIA_CALUROSO) {
                numeroDiasCalor++;

                if (rachaActual == 0) {
                    diaInicioRachaActual = diaActual;
                }
                rachaActual++;

                if (rachaActual > mejorRacha) { // nuevo récord
                    mejorRacha = rachaActual;
                    diaInicioMejorRacha = diaInicioRachaActual;
                }
            } else {
                rachaActual = 0; // se rompe la racha
            }

            temperatura = sc.nextInt();
        }

        System.out.println("Días registrados: " + numeroDiasRegistrados);
        System.out.println("Días de calor: " + numeroDiasCalor);

        if (numeroDiasRegistrados > 0) {
            double porcentaje = (double) numeroDiasCalor / numeroDiasRegistrados * 100;
            System.out.printf("Porcentaje: %.2f%%\n", porcentaje);
        }

        if (mejorRacha > 0) {
            System.out.println("Mejor racha: comienza el día " + diaInicioMejorRacha
                    + " y dura " + mejorRacha + " días");
        } else {
            System.out.println("Mejor racha: 0 0 (no hubo días de calor)");
        }

        // OJO: el enunciado dice "5 o más" → >= ; y comparamos con la MEJOR racha
        System.out.println("Ola de calor oficial: "
                + (mejorRacha >= DIAS_OLA_CALOR ? "SÍ" : "NO"));

        sc.close();
    }
}