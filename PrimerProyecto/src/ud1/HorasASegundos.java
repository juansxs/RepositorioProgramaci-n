package ud1;

import java.util.Scanner;

/** @author Juan **/
public class HorasASegundos {
    public static void main(String[] args) {
        
        //Entrada
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número de horas (minutos y segundos) para convertirlos a segundos: ");
        double horas = sc.nextDouble();
        double minutos = sc.nextDouble();
        double segundos = sc.nextDouble();
        sc.close();

        //Proceso
        double calculoHoras = horas * 3600;  // Uso de datos tipo double para permitir poner 2 horas y media por ejmplo!
        double calculoMinutos = minutos * 60;
        double calculoTotal = calculoHoras + calculoMinutos + segundos;

        //Salida
        System.out.printf("Tu tiempo pasado a segundos serían %.2f segundos.", calculoTotal);







    }

}
