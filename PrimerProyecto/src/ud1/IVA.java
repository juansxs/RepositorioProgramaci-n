package ud1;

import java.util.Scanner;

/** @author Juan **/
public class IVA {
    public static void main(String[] args) {
       
        //Entrada
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe aquí la base sobre la que impondrá el IVA (en euros): ");
        double base = sc.nextDouble();
        System.out.print("Ahora introduce el importe del IVA que se aplicará al importe: ");
        double IVA = sc.nextDouble() / 100;
        sc.close();

        //Proceso
        double importeIva = base * IVA;
        double calculoIva =  (1.0 + IVA);
        double importeConIva = base * calculoIva;

        //Salida
        System.out.printf("El importe total del IVA sería de: %.2f euros.%n", importeIva); //Importante el %n para bajar de línea.
        System.out.printf("El importe total de base con IVA sería de: %.2f euros.", importeConIva);














    }

}
