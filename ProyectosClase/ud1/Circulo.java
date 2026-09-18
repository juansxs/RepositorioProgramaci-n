package ud1;

import java.util.Scanner;

public class Circulo {
    public static void main(String[] args) {
       
        //Entrada
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el radio del círculo: ");
        double radioCirculo = sc.nextDouble();
        sc.close();
       
        //Proceso
        double perimetroCirculo = 2 * Math.PI * radioCirculo; 
        double areaCirculo = Math.PI * Math.pow( radioCirculo, 2);

        //Salida
        System.out.printf("El perímetro de la circurferencia es: %.2f unidades cuadradas. %n", perimetroCirculo);
        System.out.printf("El área de la circurferencia es: %.2f unidades cúbicas.", areaCirculo);

    }

}
