package ud1;

import java.util.Random;

public class EjemplosAleatorios {
    public static void main(String[] args) {
        
        final int NUM_ALUMNOS = 30;
        System.out.println(Math.random());
        System.out.println(Math.random() * NUM_ALUMNOS); // El +1 es para que puede salir el 30 ya que el int trunca
        //Generando números aleatorios con Math.random()

        int numAleatorio = (int) (Math.random() * NUM_ALUMNOS + 1);
        System.out.println(numAleatorio);

        //Generando números aleatorios con 
        Random rnd = new Random();
        rnd.nextInt();
        System.out.println(rnd.nextInt());
        System.out.println(rnd.nextInt(NUM_ALUMNOS) + 1);
        System.out.println(rnd.nextInt(1, NUM_ALUMNOS + 1));




    }

}
