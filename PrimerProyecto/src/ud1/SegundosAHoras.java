package ud1;

import java.util.Scanner;

/** @author Juan **/
public class SegundosAHoras {
    public static void main(String[] args) {
        
        //Entrada
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número de segundos para ser pasados a horas, minutos y segundos: ");
        double segundos = sc.nextDouble();
        sc.close();

        //Proceso
        double horas = segundos / 3600;
        double minutos = (segundos % 3600) / 60; // El modulo de 3600 de segundos da los segundos que sobran que no llegan a formar una hora y para para pasar de min a sec divides entre 60
        double segundosCalc = (segundos % 3600) % 60; // El modulo de 60 de (segundos % 3600) referencia a los segundos que no llegaron a formar minutos

        //Salida
        System.out.printf("Tus segundos pasados a horas minutos y segundos serían: %.2f horas ", horas);
        System.out.printf("%.2f minutos ", minutos);
        System.out.printf("%.2f segundos", segundosCalc);

        




    }

}
