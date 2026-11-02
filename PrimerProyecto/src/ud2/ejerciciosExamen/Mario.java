package ud2.ejerciciosExamen;

import java.util.Scanner;

/** @author Juan **/
public class Mario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce las alturas de las plataformas(-1 para salir): ");
        int alturaPlataforma = sc.nextInt();
        int saltosArriba = 0;
        int saltosAbajo = 0;
        int alturaMario = alturaPlataforma;

        while (alturaMario != -1) {

            if (alturaPlataforma > alturaMario) {
                saltosAbajo++;
            } else if (alturaPlataforma < alturaMario) {
                saltosArriba++;
            }
            alturaPlataforma = alturaMario;
            alturaMario = sc.nextInt();

        }
        sc.close();
        System.out.println("Saltos hacia arriba --> " + saltosArriba);
        System.out.println("Saltos hacia abajo --> " + saltosAbajo);

    }

}
