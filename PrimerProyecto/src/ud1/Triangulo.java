package ud1;

/** @author Juan **/
import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        
        //Entrada
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la base del triángulo: ");
        double baseTriangulo = sc.nextDouble();
        System.out.print("Introduce la altura del triángulo: ");
        double alturaTriangulo = sc.nextDouble();
        sc.close();

        //Proceso
        double areaTriangulo = baseTriangulo * alturaTriangulo / 2.0;

        //Salida
        System.out.printf("El área de tu triángulo es de: %.2f unidades cubicas.", areaTriangulo); //Acuerdate de que el punto va antes del número






    }

}
