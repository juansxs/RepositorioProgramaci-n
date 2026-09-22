package ud1;

import java.util.Scanner;

/** @author Juan **/
public class FarenheitACelsius {
    public static void main(String[] args) {
        
        //Entrada
        Scanner sc = new Scanner(System.in);
         System.out.print("Introduce una temperatura (en grados Farenheit): ");
        double gradosFarenheit = sc.nextDouble();
        sc.close();

        //Proceso
        double gradosCelsius = 5.0 / 9.0 * (gradosFarenheit - 32); // Acordarse de poner los números con .0 para que no se trunquen los decimales

        //Salida
        System.out.print(gradosFarenheit + " grados Farenheit equivalen a ");
        System.out.printf("%.2f grados Celsius.", gradosCelsius); // Uso un printf ya que es mas común que haya decimales al pasar de F° a C°














    }

}
