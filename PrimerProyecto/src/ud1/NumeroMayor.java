package ud1;

import java.util.Random;

public class NumeroMayor {
    public static void main(String[] args) {
       
        final int NUM_CONSTANTE_1 = 0;
        final int NUM_CONSTANTE_2 = 50;
        Random rnd = new Random();
        
        //Primera forma de generar los números aleatorios
        int numeroAleatorio1 = rnd.nextInt(NUM_CONSTANTE_1, NUM_CONSTANTE_2 + 1);
        int numeroAleatorio2 = rnd.nextInt(NUM_CONSTANTE_1, NUM_CONSTANTE_2 + 1);

        int numeroElegido = numeroAleatorio1 > numeroAleatorio2 ? numeroAleatorio1 : numeroAleatorio2;
        
        System.out.println("Tus números aleatorios son: " + numeroAleatorio1+ " y " + numeroAleatorio2);
        System.out.println("El mayor de los 2 es: " + numeroElegido);

        //Segunda forma de generar los números aleatorios

        int numAleatorio3 = (int) (Math.random() * NUM_CONSTANTE_2 + 1);
        int numAleatorio4 = (int) (Math.random() * NUM_CONSTANTE_2 + 1);

        int numeroElegido2 = numeroAleatorio3 > numeroAleatorio4 ? numeroAleatorio3 : numeroAleatorio4;
        
        System.out.println("Tus números aleatorios son: " + numeroAleatorio1+ " y " + numeroAleatorio2);
        System.out.println("El mayor de los 2 es: " + numeroElegido);





    }

}
