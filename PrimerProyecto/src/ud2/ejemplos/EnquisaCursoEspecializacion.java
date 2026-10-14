package ud2.ejemplos;

import java.util.Scanner;

/** @author Juan **/
public class EnquisaCursoEspecializacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Mostrar menú
        System.out.println("\nEstas interesad@ en hacer algún curso de especialización?");
        System.out.println("==========================================================\n");
        System.out.println("1. Ciberseguridade en contornos das tecnoloxías da información");
        System.out.println("2. Desenvolvemento de videoxogos e realidade virtual");
        System.out.println("3. Intelixencia artificial e big data");
        System.out.println("4. Ningún curso");
        System.out.println("0. Saír");

        System.out.print("\nEscribe una opción: ");
        int opcion = sc.nextInt();

        while (opcion != 0) {
            //Incrementar el contador correspondiente
            System.out.println("Gracias hemos registrado tu respuesta");
            
        System.out.println("\nEstas interesad@ en hacer algún curso de especialización?");
        System.out.println("==========================================================\n");
        System.out.println("1. Ciberseguridade en contornos das tecnoloxías da información");
        System.out.println("2. Desenvolvemento de videoxogos e realidade virtual");
        System.out.println("3. Intelixencia artificial e big data");
        System.out.println("4. Ningún curso");
        System.out.println("0. Saír");

        System.out.print("\nEscribe una opción: ");
        opcion = sc.nextInt();
        }
        sc.close();
        //Mostrar resultados encuenta







    }

}
