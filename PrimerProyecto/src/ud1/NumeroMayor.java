package ud1;

import java.util.Random;

public class NumeroMayor {
    public static void main(String[] args) {
        final int NUM_CONSTANTE_1 = 0;
        final int NUM_CONSTANTE_2 = 50;
        
        int numRandom = (int) (NUM_CONSTANTE_1 + Math.random() * (NUM_CONSTANTE_2 - NUM_CONSTANTE_1 + 1));

        Random rnd = new Random();
        int numRandom2 = rnd.nextInt(NUM_CONSTANTE_1, NUM_CONSTANTE_2 + 1);
        int numRandom3 = rnd.nextInt(NUM_CONSTANTE_1, NUM_CONSTANTE_2 + 1);

        System.out.println("Número1: " + numRandom);
        System.out.println("Número2: " + numRandom2);
        System.out.println("Número3: " + numRandom3);

        //Mayor de 2 números
        //int mayor = numRandom > numRandom2 ? numRandom : numRandom2;

        //int mayor = Math.max(numRandom, numRandom2);

        //Mayor de 3 números
        //int mayor = numRandom > numRandom2 ? numRandom : numRandom;
        // mayor = mayor > numRandom3 ? mayor : numRandom3;
        //int mayor = Math.max(Math.max(numRandom, numRandom2), numRandom3);
        

      
        //System.out.println("Mayor: " + mayor);






    }

}
