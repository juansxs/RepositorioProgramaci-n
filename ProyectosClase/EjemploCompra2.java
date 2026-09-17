package ud1;

/** @author Juan **/
public class EjemploCompra2 {
    public static void main(String[] args) {
        final double IVA = 0.21;
        double precioProducto = 20;
        double cantidadProducto = 15;
        double importeTotal = precioProducto * cantidadProducto;
        double importeConIva = importeTotal * (1 + IVA);
        System.out.println("IVA: " + 100 * IVA + "%");
        System.out.println("Importe total sin IVA: " + importeTotal + " euros.");
        System.out.println("El coste total sería de " + importeConIva + " euros.");
    }
}