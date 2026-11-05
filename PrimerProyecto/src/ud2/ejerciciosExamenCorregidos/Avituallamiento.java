package ud2.ejerciciosExamenCorregidos;

import java.util.Scanner;

/**@author juan */
public class Avituallamiento {
    public static void main(String[] args) {
        int pkAvituallamiento = 0;
        int kmLlanoAvituallamiento = 0;

        int pkLlanoActual = 0;
        int kmLlanoActual = 0;
        int pkActual = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la altitud de los puntos kilométricos (-1 para terminar): ");

        
        int altitudAnterior = -1;
        //Lectura adelantada
        int altitud = sc.nextInt();
        while (altitud != -1) {
            if (pkActual == 0) {
                altitudAnterior = altitud;
            } else {
                if (altitud == altitudAnterior) { // Llano
                    if (kmLlanoActual == 0) {
                        pkLlanoActual = pkActual - 1;
                    }
                    kmLlanoActual++;
                } else { //Subida o bajada

                }
            }
            


            //Nueva lectura
            altitud = sc.nextInt();
            pkActual++;
        }
        sc.close();

        System.out.println(pkAvituallamiento + " " + kmLlanoAvituallamiento);
    }
}
