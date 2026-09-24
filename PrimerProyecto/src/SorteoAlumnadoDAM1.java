

import java.util.Random;

public class SorteoAlumnadoDAM1 {
    public static void main(String[] args) {
        
        final int NUM_ALUMNOS = 30;
        
        Random rnd = new Random();
        int numeroElegido = rnd.nextInt(NUM_ALUMNOS);
        System.out.println("Número elegido: " + numeroElegido);

        System.out.println(numeroElegido == 1 ? "Juan A" : "");
        System.out.println(numeroElegido == 2 ? "Matías" : "");

    }

}
