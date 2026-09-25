package ud1;

import java.util.Scanner;

/** @author Juan **/
public class Entradas {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Que número de entradas desea? : ");
        int entradas = sc.nextInt();

        System.out.print("Que tipo de entradas desea, (1)infantiles --> 15.50 euros o (2)adultos --> 20.00 euros? : ");

        String precioEntradas = sc.next();
        
        int precio = Integer.parseInt(precioEntradas);

        double eleccion = precio > 1.0 ? entradas * 20.0 : entradas * 15.5;

        double total = eleccion > 100.0 ? eleccion * 0.95 : eleccion * 1;
        boolean descuento = eleccion > 100.0;

        System.out.println("Tienes derecho a descuento? --> " + descuento);
        System.out.println("El importe total sería de --> " + eleccion + " euros.");
        System.out.printf("El importe total después del descuento %.2f euros.", total);





       

        
    }

}
