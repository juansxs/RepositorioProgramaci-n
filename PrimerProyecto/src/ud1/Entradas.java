package ud1;

import java.util.Scanner;

/** @author Juan **/
public class Entradas {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Que número de entradas desea? : ");
        int entradas = sc.nextInt();

        System.out.print("Que tipo de entradas desea, infantiles o adultos? : ");

        String precioEntradas = sc.next();
        
        int precio = Integer.parseInt(precioEntradas);
        
        System.out.println(precio);





        System.out.println(precioEntradas);

        //int x = a > b ? a : b

    }

}
