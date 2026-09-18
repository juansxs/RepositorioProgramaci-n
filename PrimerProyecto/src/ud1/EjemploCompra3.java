package ud1;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

/** @author Juan **/
public class EjemploCompra3 {
    public static void main(String[] args) {
        final double IVA = 0.21;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el precio del producto en euros: ");
        double precioProducto = sc.nextDouble();

        System.out.print("Introduce la cantidad del producto: ");
        double cantidadProducto = sc.nextDouble();
        sc.close();

        double importeTotal = precioProducto * cantidadProducto;
        double importeConIva = importeTotal * (1 + IVA);
        double importeIva = importeTotal * IVA;

        System.out.printf("Importe total sin IVA: %.2f euros.%n", importeTotal);
        System.out.println("IVA: " + 100 * IVA + "%");
        System.out.println("Importe del IVA: " + importeIva + " euros.");
        System.out.printf("importe total con IVA: %.2f euros.%n", importeConIva);
        System.out.println("Esta compra fue relizada el día: " + LocalDate.now() + ", a las: " + LocalTime.now() + " horas.");

    }
}
