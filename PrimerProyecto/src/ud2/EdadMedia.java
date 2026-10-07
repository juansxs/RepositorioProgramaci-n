package ud2;

import java.util.Scanner;

/** @author Juan **/
public class EdadMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce edades del alumnado (-1 para terminar): ");

        int sumaEdades = 0;

        //Lectura anticipaada
        int edad = sc.nextInt();

        while (edad != -1) {
            //Cuerpo del bucle
            //Proceso
            sumaEdades = sumaEdades + edad;
            //Nueva lectura
            edad = sc.nextInt();
        }
        sc.close();
        System.out.println("Suma de las edades: " + sumaEdades);
    }

}
