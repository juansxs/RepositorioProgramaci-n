package ud2;

import java.util.Scanner;

/** @author Juan **/
public class ArbolMasAlto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la cadena identificatoria del árbol: ");
        String nombre = sc.nextLine();
        System.out.print("Introduce la altura del árbol en cm: ");
        double altura = sc.nextDouble();
        double alturaMaxima = 0;
        String cadenaMaxima = null;

        while ((altura != -1) && (nombre != null)) {
            alturaMaxima = Math.max(altura, alturaMaxima);
            if (altura == alturaMaxima) {
                cadenaMaxima = nombre;
            }
        

        sc.nextLine();
        System.out.print("Introduce otra cadena: ");
        nombre = sc.nextLine();
        
        System.out.print("Introduce otra altura: ");
        altura = sc.nextDouble();
        

        
        }
        System.out.println("El árbol más alto es :" + cadenaMaxima + " y mide: " + alturaMaxima + " cm.");
    }

}
