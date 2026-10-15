package ud2.ejercicios;

import java.util.Scanner;

/** @author Juan **/
public class Cilindro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el raido de un cilindro: ");
        double radio = sc.nextDouble();
        System.out.print("Introduce la altura del mismo cilindro: ");
        double altura = sc.nextDouble();

        double area = areaCilindro(radio, altura); 

        double volumen = volumenCilindro(radio, altura);

        System.out.println("Área = " + area);
        System.out.println("Volumen = " + volumen);

    }
    public  static double areaCilindro(double radio, double altura) {
        return 2 * Math.PI * radio * (altura + radio);
    }

    public  static double volumenCilindro(double radio, double altura) {
        return Math.PI * Math.pow(radio, 2) * altura;
    } 


}
