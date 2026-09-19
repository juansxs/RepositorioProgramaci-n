package ud1;

import java.util.Scanner;

public class DistanciaEntreDosPuntos {
    public static void main(String[] args) {
        
        //Entrada
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce las cordenadas del primer punto separas por un espacio: ");
        double cord1 = sc.nextDouble();
        double cord2 = sc.nextDouble();
        System.out.print("Introduce las cordenadas del segundo punto separas por un espacio: ");
        double cord3 = sc.nextDouble();
        double cord4 = sc.nextDouble();
        sc.close();

        //Proceso
        double operacion = Math.sqrt(Math.pow(cord3 - cord1, 2) + Math.pow(cord4 - cord2, 2));

        //Salida
        System.out.printf("La distancia entre tus 2 puntos es de: %.2f unidades.", operacion);









    }

}
