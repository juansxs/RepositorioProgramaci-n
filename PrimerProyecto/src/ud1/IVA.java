package ud1;

import java.util.Scanner;

/** @author Juan **/
public class IVA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Escribe aquí la base sobre la que impondrá el IVA: ");
        
        double base = sc.nextDouble();
        System.out.print("Ahora introduce el importe del IVA que se aplicará al importe: ");

        double IVA = sc.nextDouble() / 100;

        System.out.println(IVA);

        double importeIva = base * IVA;
        
        
        double importeConIva =  (1.0 + importeIva);

        System.out.println(importeConIva);

        System.out.printf("El importe total con IVA sería de: %.2f ", importeConIva);














    }

}
