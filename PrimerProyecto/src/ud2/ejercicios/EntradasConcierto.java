package ud2.ejercicios;

import java.util.Scanner;

/** @author Juan **/
public class EntradasConcierto {
    public static void main(String[] args) {
        final int AFORO_MINIMO = 20;
        final int AFORO_MINIMO_DESCUENTO = 50;
        final int DESCUENTO = 751;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el aforo máximo del establecimiento: ");
        int aforo = sc.nextInt();
        System.out.print("Introduce el precio de la entrada: ");
        double precioEntrada = sc.nextDouble();
        System.out.print("Ahora introduce el número de entradas vendidas: ");
        int entradasVendidas = sc.nextInt();
        sc.close();

        double recuadacionTotal = 0;

        if (entradasVendidas <= aforo * (AFORO_MINIMO / 100.) ) {
            System.out.println("El concierto se cancela por falta de gente.");
        } else if (entradasVendidas <= aforo * (AFORO_MINIMO_DESCUENTO / 100.)) {
            precioEntrada *= (DESCUENTO / 100.);
            recuadacionTotal = precioEntrada * entradasVendidas;
            System.out.println("La recaudación total del concierto ha sido de: " + recuadacionTotal);
        } else {
             recuadacionTotal = precioEntrada * entradasVendidas;
            System.out.println("La recaudación total del concierto ha sido de: " + recuadacionTotal);
        }

    }

}
