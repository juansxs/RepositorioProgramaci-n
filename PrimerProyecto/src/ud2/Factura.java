package ud2;

import java.util.Scanner;

public class Factura {
    public static void main(String[] args) {
        final double IVA = 21;
        final double DESCUENTO = 0.95;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el precio del producto(en euros): ");
        double precioProducto = sc.nextDouble();
        System.out.print("Introduce las unidades del producto: ");
        double unidadesProducto = sc.nextDouble();
        sc.close();

        double importeSinIva = precioProducto * unidadesProducto;
        double importeIva = importeSinIva * (IVA / 100.);
        double importeConIva = importeSinIva + importeIva;

        System.out.printf("El importe total sin IVA es de: %.2f euros.%n", importeSinIva);
        System.out.printf("El importe total del IVA es de: %.2f euros.%n", importeIva);
        if (importeConIva > 100) {
            double importeConDescuento = importeConIva * DESCUENTO;
            System.out.println("Si tienes derecho a descuento!");
            System.out.printf("El importe total con descuento es de: %.2f euros.", importeConDescuento);
        }
        if (importeConIva < 100) {
            System.out.println("No tienes derecho a descuento!");
            System.out.printf("El importe total sin descuento es de: %.2f euros.", importeConIva);
        }

    }

}
