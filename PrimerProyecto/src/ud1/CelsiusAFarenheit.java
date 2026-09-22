package ud1;

import java.util.Scanner;

/** @author Juan **/
public class CelsiusAFarenheit {
    public static void main(String[] args) {
        
        //Entrada
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una temperatura (en grados Celsius): ");
        double gradosCelsius = sc.nextDouble();
        sc.close();

        //Proceso
        double gradosFarenheit = (gradosCelsius * (9.0 / 5.0)) + 32.0; // Acordarse de poner los números con .0 para que no se trunquen los decimales

        //Salida
        System.out.print(gradosCelsius + " grados Celsius equivalen a " + gradosFarenheit + " grados Farenheit.");






    }

}
