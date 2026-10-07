package ud2;

import java.util.Scanner;

/** @author Juan **/
public class EstadisticaEdad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce las edades de los alumn@s: ");
        int edad = sc.nextInt();
        
        int numAlumnos = 0;
        int sumaEdades = 0;
        int valorMediaEdades = 0;
        int mayoresEdad = 0;
        while (edad >= 0) {

            sumaEdades = sumaEdades + edad;
            valorMediaEdades++;
            numAlumnos++;
            if (edad >= 18){
                mayoresEdad++;
            }

            edad = sc.nextInt();
        }
        sc.close();
        double mediaEdades = sumaEdades / valorMediaEdades;

        System.out.println("La suma total de las edades de los alumnos es de " + sumaEdades + " años.");
        System.out.println("La media de las edades de los alumnos es de " + mediaEdades + " años.");
        System.out.println("Hay un total de " + numAlumnos + " en la clase, de los cuáles " + mayoresEdad + " son mayores de edad.");


    }

}
