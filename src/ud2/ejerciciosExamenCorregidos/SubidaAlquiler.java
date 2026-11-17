package ud2.ejerciciosExamenCorregidos;

import java.util.InputMismatchException;
import java.util.Scanner;

/** @author Juan */
public class SubidaAlquiler {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce la renta actual: ");
            double rentaActual = sc.nextDouble();
            System.out.println("Introduce el precio de referencia: ");
            double precioReferencia = sc.nextDouble();
            double subidaMaxima = subidaAlquiler(rentaActual, precioReferencia);
            System.out.println("La subida máxima del alquiler  será de " + subidaMaxima + " euros");
            System.out.println("La nueva renta a pagar será de " + (rentaActual + subidaMaxima) + " euros");

        } catch (InputMismatchException e) {
            System.out.println("Error. Entrada de datos incorrecta.");
        }

    }
    static double subidaAlquiler(double rentaActual, double precioMaximoReferencia) {
        final double MAX_PORCENTAJE_SUBIDA = 0.02;
        if (rentaActual < 0 || precioMaximoReferencia < 0) {
            return  0;
        }
        if (rentaActual > precioMaximoReferencia) {
            return 0;
        }
        double subidaMaximaPorcentaje = rentaActual * MAX_PORCENTAJE_SUBIDA;
        
        double subidaMaximaPrecioReferencia = precioMaximoReferencia - rentaActual;
        
        return  Math.min(subidaMaximaPorcentaje, subidaMaximaPrecioReferencia);
        

        
        
    }

}
