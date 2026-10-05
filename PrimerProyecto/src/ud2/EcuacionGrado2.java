package ud2;

import java.util.Scanner;

/** @author Juan **/
public class EcuacionGrado2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Define a, b y c: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        sc.close();

        double discriminante = Math.pow(b, 2) - (4. * a * c);
        double operacion1 = (- b + Math.sqrt(discriminante)) / (2. * a);
        double operacion2 = (- b - Math.sqrt(discriminante)) / (2. * a);

        if (discriminante < 0.) {
            System.out.println("La operación no tiene solución real!");
        } else {
            System.out.printf("Los resultado de la ecuación de segudno grado son : %.2f", operacion1);
            System.out.printf(" y %.2f", operacion2);
        }






    }



}
