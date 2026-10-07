package ud2;

import java.util.Scanner;

/** @author Juan **/
public class EdadMaximaMinima {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce las edades para saber cuál es la mayor y la menor (-1 para terminar): ");
        int edad = sc.nextInt();
        int edadesMax = 0;
        int edadesMin = 1000000;
        while (edad != -1) {
            edadesMax = Math.max(edad, edadesMax);
            edadesMin = Math.min(edad, edad);
            edad = sc.nextInt();
        }
        sc.close();
        System.out.println("La edad más grande es :" + edadesMax);
        System.out.println("La edad más pequeña es :" + edadesMin);
    }

}
